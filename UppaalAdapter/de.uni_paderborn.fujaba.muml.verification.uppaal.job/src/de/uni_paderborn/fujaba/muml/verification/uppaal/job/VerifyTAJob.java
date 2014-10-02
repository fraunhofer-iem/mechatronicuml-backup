package de.uni_paderborn.fujaba.muml.verification.uppaal.job;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

import de.uni_paderborn.cmd.Command;
import de.uni_paderborn.cmd.PathArgument;
import de.uni_paderborn.cmd.Process;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.VerifyTACommand;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.misc.NoOptionSummaryOption;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.misc.NoProgressIndicatorOption;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.trace.DiagnosticInfoOption;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.trace.DiagnosticInfoOption.TraceKind;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.tuning.HashTableSizeOption;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.tuning.ReuseStateSpaceOption;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.tuning.SpaceConsumptionOption;
import de.uni_paderborn.fujaba.muml.verification.uppaal.cmd.options.tuning.SpaceConsumptionOption.SpaceConsumptionOperator;
import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;
import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.requirements.PropertyRepository;
import de.uni_paderborn.uppaal.trace.DiagnosticTraceStandaloneSetup;
import de.uni_paderborn.uppaal.trace.diagnosticTrace.TraceRepository;
import de.uni_paderborn.uppaal.trace.scoping.DiagnosticTraceScopeProviderSingleton;

public class VerifyTAJob extends SynchronousJob {
	
	private NTA nta;
	private PropertyRepository properties;
	private Options options;
		
	public static Injector injector;
	
	private TraceRepository traceRepository;
				
	public VerifyTAJob(NTA nta, PropertyRepository properties, Options options) {
		
		super("UPPAAL Model Checking");
				
		this.nta = nta;
		this.properties = properties;
		this.options = options;
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		IStatus status;
		
		try {
			
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			
			String containerName = System.getProperty("java.io.tmpdir");
			
		    IPath targetPath = Path.fromOSString(containerName);
			
			SynchronousJob xmlSynthesis = new UppaalXMLSynthesisJob(nta, properties, targetPath, false);
			status = xmlSynthesis.execute(subMonitor.newChild(10));
			
			if(!status.isOK()) {
				return status;
			}
			
			if (subMonitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			};
			
			subMonitor.subTask("Running UPPAAL");
		    
			// append the name of the NTA to the target path since the XML synthesis uses this as target file name
			IPath modelPath = targetPath.append(nta.getName()).addFileExtension("xml");
			IPath queryPath = targetPath.append(nta.getName()).addFileExtension("q");
			
			Command cmd = new VerifyTACommand();
		    cmd.addParameter(new NoOptionSummaryOption());
		    cmd.addParameter(new NoProgressIndicatorOption());
		    TraceKind traceKind = null;
		    switch (options.getTraceOptions()) {
		    case NONE:
		    	traceKind = null;
		    	break;
			case FASTEST:
				traceKind = TraceKind.Fastest;
				break;
			case SHORTEST:
				traceKind = TraceKind.Shortest;
				break;
			case SOME:
				traceKind = TraceKind.Some;
				break;
			default:
				break;
		    }
		    if (traceKind != null)
		    	cmd.addParameter(new DiagnosticInfoOption(traceKind));
		    
		    cmd.addParameter(new HashTableSizeOption(options.getHashTableSize()));
		    
		    SpaceConsumptionOperator spaceConsumptionOperator = SpaceConsumptionOperator.Default;
		    switch (options.getStateSpaceReduction()) {
			case AGGRESSIVE:
				spaceConsumptionOperator = SpaceConsumptionOperator.Most;
				break;
			case CONSERVATIVE:
				spaceConsumptionOperator = SpaceConsumptionOperator.Default;
				break;
			case NONE:
				spaceConsumptionOperator = SpaceConsumptionOperator.None;
				break;
			default:
				break;
		    }
		    if (spaceConsumptionOperator != null)
		    	cmd.addParameter(new SpaceConsumptionOption(spaceConsumptionOperator));
		    
		    cmd.addParameter(new ReuseStateSpaceOption());
		    cmd.addParameter(new PathArgument<VerifyTACommand>(modelPath));
			cmd.addParameter(new PathArgument<VerifyTACommand>(queryPath)); 
		    
		    Writer stringWriter = new StringWriter();
		    Writer progressWriter = new ProgressWriter(subMonitor, properties.getProperties().size());
			
			Process proc = cmd.execute(null, new PrintWriter(System.out), stringWriter, progressWriter);
			
			int exitCode = proc.waitFor();
			
			String result = stringWriter.toString();
			
			if (exitCode != 0) {
				return BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(new RuntimeException(result)));
			}
						
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			};
		    
		    
			subMonitor.subTask("Parsing Results");
			
		    if (injector == null) {
				injector = new DiagnosticTraceStandaloneSetup().createInjectorAndDoEMFRegistration();
			}
			ResourceSet resSet = injector.getInstance(XtextResourceSet.class);
			String ext = injector.getInstance(Key.get(String.class, Names.named(Constants.FILE_EXTENSIONS)));
			Resource resource = resSet.createResource(URI.createURI("dummy." + ext));
			
			Map<String, Boolean> options = new HashMap<String, Boolean>();
			options.put(XtextResource.OPTION_RESOLVE_ALL, true);
			
			synchronized (DiagnosticTraceScopeProviderSingleton.getScopeProvider()) {
					
				DiagnosticTraceScopeProviderSingleton.getScopeProvider().setNTA(nta);
				
				try {
					resource.load(new StringInputStream(result), options);
				}
				catch (IOException e) {
					return BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e));
				}
				
			}
			
			subMonitor.worked(10);
			
			List<Diagnostic> errors = resource.getErrors();
			for(Diagnostic error : errors) {
				return BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(new RuntimeException(error.toString())));
			}

			assert !resource.getContents().isEmpty() && resource.getContents().get(0) instanceof TraceRepository;
					
			traceRepository = (TraceRepository) resource.getContents().get(0);
			
			
			return Status.OK_STATUS;
		
		}
		finally {
			monitor.done();
		}
			
	};
	
	
	public TraceRepository getTraceRepository() {
		
		try {
			join();
		} catch (InterruptedException e) {
			return null;
		}
		
		return traceRepository;
		
	}
	
	/**
	 * Simply Writer class that parses the incoming stream for Uppaal progress measures
	 */
	public static class ProgressWriter extends Writer {
		StringBuilder currentLine = new StringBuilder();
		SubMonitor monitor;
		Pattern pattern = Pattern.compile("Verifying property ([0-9]+) at line .*", Pattern.DOTALL);
		int totalProperties;
		
		public ProgressWriter(SubMonitor monitor, int totalNumberOfProperties) {
			this.monitor = monitor;
			this.totalProperties = totalNumberOfProperties;
		}
		
		@Override
		public void close() throws IOException {
			//Nothing to do
		}

		@Override
		public void flush() throws IOException {
			//Nothing to do
		}

		@Override
		public void write(char[] cbuf, int off, int len) throws IOException {
			for (int i=0;i<len;i++) {
				currentLine.append(cbuf[off+i]);
				if (cbuf[off+i] == '\n') {
					//Try to parse the line
					Matcher matcher = pattern.matcher(currentLine.toString());
					if (matcher.matches()) {
						int currentProperty = Integer.parseInt(matcher.group(1));
						monitor.worked(80/totalProperties);
						monitor.subTask("Verifying Uppaal Property "+currentProperty+" of "+totalProperties);
					}
					
					//Reset
					currentLine = new StringBuilder();
				}
			}
		}
	}
	
}
