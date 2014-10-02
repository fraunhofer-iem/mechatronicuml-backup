package de.uni_paderborn.fujaba.muml.verification.uppaal.job;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.reachanalysis.core.export.ReachabilityGraphExporter;
import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.rtsc.ZoneGraph;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.graphviz.CICGraphvizExport;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationOptionsProvider;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationPropertyChoiceProvider;

public class ExportTraceImageJob extends Job {
	
	private VerifiableElement verifiableElement;
	private IPath targetPath;
	private IResource resource;
	private VerificationOptionsProvider optionsProvider;
	private VerificationPropertyChoiceProvider propertyChoiceProvider;
				
	public ExportTraceImageJob(VerifiableElement verifiableElement, IPath targetPath, VerificationOptionsProvider optionsProvider, VerificationPropertyChoiceProvider propertyChoiceProvider) {
		super("Trace Image Export");
		
		setUser(true);
		
		this.verifiableElement = verifiableElement;
		this.targetPath = targetPath;
		this.optionsProvider = optionsProvider;
		this.propertyChoiceProvider = propertyChoiceProvider;		
	}
	
	public ExportTraceImageJob(VerifiableElement verifiableElement, IResource resource, VerificationOptionsProvider optionsProvider, VerificationPropertyChoiceProvider propertyChoiceProvider) {
		this(verifiableElement, resource.getLocation(), optionsProvider, propertyChoiceProvider);
		this.resource = resource;
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
				
		try {
			
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			
			// if no resource is available, we reduce the total amount of work since we have no option to refresh the workspace after the export 
			if (resource == null) {
				subMonitor.setWorkRemaining(90);
			}
			
			IStatus status;
			Muml2TraceJob m2m = new Muml2TraceJob(verifiableElement, optionsProvider, propertyChoiceProvider);
			status = m2m.execute(subMonitor.newChild(70));
			ZoneGraph trace;
			
			if(status.isOK()) {
				trace = m2m.getTrace();
			}
			else {
				return status;
			}
			
			if (subMonitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			};


			subMonitor.subTask("GraphViz Export");
			ReachabilityGraphExporter exporter = new CICGraphvizExport(null); //TODO param ?
			exporter.export(trace, targetPath);
		    subMonitor.worked(20);
		    
		    if (resource != null) {
		    	try {
		    		resource.refreshLocal(IResource.DEPTH_INFINITE, subMonitor.newChild(10));
		    	} catch (CoreException e) {
		    		return e.getStatus();
		    	}
		    }
					    							
			return Status.OK_STATUS;
		
		}
		finally {
			monitor.done();
		}
			
	};
	
}
