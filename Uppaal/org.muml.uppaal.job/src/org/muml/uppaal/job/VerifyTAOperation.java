package org.muml.uppaal.job;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.muml.core.common.cmd.Command;
import org.muml.core.common.cmd.PathArgument;
import org.muml.core.common.cmd.Process;
import org.muml.uppaal.NTA;
import org.muml.uppaal.adapter.options.Options;
import org.muml.uppaal.cmd.VerifyTACommand;
import org.muml.uppaal.cmd.options.misc.NoOptionSummaryOption;
import org.muml.uppaal.cmd.options.misc.NoProgressIndicatorOption;
import org.muml.uppaal.cmd.options.trace.DiagnosticInfoOption;
import org.muml.uppaal.cmd.options.trace.DiagnosticInfoOption.TraceKind;
import org.muml.uppaal.cmd.options.tuning.HashTableSizeOption;
import org.muml.uppaal.cmd.options.tuning.ReuseStateSpaceOption;
import org.muml.uppaal.cmd.options.tuning.SpaceConsumptionOption;
import org.muml.uppaal.cmd.options.tuning.SpaceConsumptionOption.SpaceConsumptionOperator;
import org.muml.uppaal.requirements.PropertyRepository;
import org.muml.uppaal.trace.DiagnosticTraceStandaloneSetup;
import org.muml.uppaal.trace.diagnostictrace.TraceRepository;
import org.muml.uppaal.trace.scoping.DiagnosticTraceScopeProviderSingleton;

import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

public class VerifyTAOperation implements IWorkspaceRunnable {
	
	private NTA nta;
	private PropertyRepository properties;
	private Options options;
		
	public static Injector injector;
	
	private TraceRepository traceRepository;
				
	public VerifyTAOperation(NTA nta, PropertyRepository properties, Options options) {				
		this.nta = nta;
		this.properties = properties;
		this.options = options;
	}
	
	private String getName() {
		return "UPPAAL Model Checking";
	}
	
	private Command createCommand() {
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
	    		
		return cmd;
	}
	
	@Override
	public void run(final IProgressMonitor monitor) throws CoreException {
				
		try {
			
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			
			String containerName = System.getProperty("java.io.tmpdir");
			
		    IPath targetPath = Path.fromOSString(containerName);
			
			IWorkspaceRunnable xmlSynthesis = new UppaalXMLSynthesisOperation(nta, properties, targetPath, false);
			xmlSynthesis.run(subMonitor.newChild(10));
						
			if (subMonitor.isCanceled()) {
				throw new OperationCanceledException();
			};
			
			subMonitor.subTask("Running UPPAAL");
		    
			// append the name of the NTA to the target path since the XML synthesis uses this as target file name
			IPath modelPath = targetPath.append(nta.getName()).addFileExtension("xml");
			IPath queryPath = targetPath.append(nta.getName()).addFileExtension("q");
			
			Command cmd = createCommand();
			cmd.addParameter(new PathArgument<VerifyTACommand>(modelPath));
			cmd.addParameter(new PathArgument<VerifyTACommand>(queryPath));
		    
			if (monitor.isCanceled()) {
				throw new OperationCanceledException();
			};
			
			final IProgressMonitor uppaalMonitor = subMonitor.newChild(80);
			Writer progressWriter = new ProgressWriter(uppaalMonitor, properties.getProperties().size());
		    Writer stringWriter = new StringWriter();
		    Writer printWriter = new PrintWriter(System.out, true);
		    			
		    try {
		    			    	
		    	Process proc = new Process(cmd, printWriter, stringWriter, progressWriter) {
				
		    		@Override
		    		protected boolean stayAlive() {
		    			return !monitor.isCanceled();
		    		}
		    	};
		    		    
		    	int exitCode = proc.waitForExitValue();
		    	
		    	monitor.done();
		    	
		    	if (monitor.isCanceled()) {
		    		throw new OperationCanceledException();
		    	}
		    	else {							
					String result = stringWriter.toString();
					
					if (exitCode != 0) {
						throw new CoreException(new Status(IStatus.ERROR, "org.muml.uppaal.adapter.job", result));
					}
					
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
						
						resource.load(new StringInputStream(result), options);					
					}
					
					subMonitor.worked(10);
					
					
					Diagnostic resourceDiagnostic = EcoreUtil.computeDiagnostic(resource, false);
									
					if (!BasicDiagnostic.toIStatus(resourceDiagnostic).isOK()) {
						BasicDiagnostic parseDiagnostic = new BasicDiagnostic("org.muml.uppaal.adapter.job", resourceDiagnostic.getCode(), "Parsing the UPPAAL diagnostic trace failed", null);
						parseDiagnostic.merge(resourceDiagnostic);
						
						throw new CoreException(BasicDiagnostic.toIStatus(parseDiagnostic));
					}
					
					
					assert !resource.getContents().isEmpty() && resource.getContents().get(0) instanceof TraceRepository;
							
					traceRepository = (TraceRepository) resource.getContents().get(0);
		    	}
			
		    }
		    catch (IOException e) {
		    	throw new CoreException(BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e)));
		    }
		    catch(InterruptedException e) {
		    	throw new CoreException(BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e)));
		    }
		    catch(ExecutionException e) {
		    	throw new CoreException(BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e.getCause())));
		    }		
		}
		finally {
			monitor.done();
		}
			
	};
	
	
	public TraceRepository getTraceRepository() {		
		return traceRepository;
	}
	
	/**
	 * Simply Writer class that parses the incoming stream for Uppaal progress measures
	 */
	public static class ProgressWriter extends Writer {
		StringBuilder currentLine = new StringBuilder();
		IProgressMonitor monitor;
		Pattern pattern = Pattern.compile("Verifying (property|formula) ([0-9]+) at line .*", Pattern.DOTALL);
		int totalProperties;
		
		public ProgressWriter(IProgressMonitor monitor, int totalNumberOfProperties) {
			this.monitor = SubMonitor.convert(monitor, totalNumberOfProperties);
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
						int currentProperty = Integer.parseInt(matcher.group(2));
						monitor.worked(currentProperty-1);
						monitor.subTask("Verifying Uppaal Property "+currentProperty+" of "+totalProperties);
					}
					
					//Reset
					currentLine = new StringBuilder();
				}
			}
		}
	}
	
}
