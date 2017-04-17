package org.muml.uppaal.adapter.job;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.muml.core.NamedElement;
import org.muml.core.reachanalysis.core.export.ReachabilityGraphExporter;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.uppaal.adapter.job.graphviz.CICGraphvizExport;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.job.interfaces.VerificationPropertyChoiceProvider;
import org.muml.uppaal.adapter.job.operations.Muml2TraceOperation;
import org.muml.uppaal.adapter.mtctl.Property;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraph;

public class Muml2TraceImageJob extends Job {
	
	private VerifiableElement verifiableElement;
	private IPath targetPath;
	private IResource resource;
	private VerificationOptionsProvider optionsProvider;
	private VerificationPropertyChoiceProvider propertyChoiceProvider;
	boolean storeIntermediateModels;
	
	private Muml2TraceOperation m2m;
	
	public Muml2TraceImageJob(final VerifiableElement verifiableElement, IPath targetPath, VerificationOptionsProvider optionsProvider, VerificationPropertyChoiceProvider propertyChoiceProvider) {
		super("Trace Image Export");
		
		setUser(true);
		
		this.verifiableElement = verifiableElement;
		this.targetPath = targetPath;
		this.optionsProvider = optionsProvider;
		this.propertyChoiceProvider = propertyChoiceProvider;	
		
		if (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation()) {
			this.addJobChangeListener(new JobChangeAdapter() {
				@Override
				public void done(IJobChangeEvent event) {
					if (!event.getResult().isOK()) {
						org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().setRestartRunnable(null);
					}
					Property property = m2m != null ? m2m.getProperty() : null;
					String elementName = (verifiableElement instanceof NamedElement) ? ((NamedElement) verifiableElement).getName() : "";
					org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().evaluationDone(elementName, property, true);
				}
			});
		}
	}
	
	public Muml2TraceImageJob(final VerifiableElement verifiableElement, IResource resource, VerificationOptionsProvider optionsProvider, VerificationPropertyChoiceProvider propertyChoiceProvider) {
		this(verifiableElement, resource != null ? resource.getLocation() : null, optionsProvider, propertyChoiceProvider);
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
			
			m2m = new Muml2TraceOperation(verifiableElement, optionsProvider, propertyChoiceProvider, storeIntermediateModels);
			try {
				m2m.run(subMonitor.newChild(70));
			}
			catch(CoreException e) {
				return e.getStatus();
			}
			ZoneGraph trace = m2m.getTrace();
						
			if (subMonitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			};

			subMonitor.subTask("GraphViz Export");
			
			if (org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().shouldDoStatisticalEvaluation()) {
				org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().logInfo("GraphViz Export");
			}
			
			ReachabilityGraphExporter exporter = new CICGraphvizExport(null); //TODO param ?
			if (targetPath != null) {
				exporter.export(trace, targetPath);
			} else {
				exporter.export(trace);
			}
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
			
	}

	public void setStoreIntermediateModels(boolean storeIntermediateModels) {
		this.storeIntermediateModels = storeIntermediateModels;
	};
	
}
