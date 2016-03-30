package org.muml.uppaal.adapter.job;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.uppaal.adapter.job.interfaces.VerificationOptionsProvider;
import org.muml.uppaal.adapter.job.operations.Muml2UppaalOperation;
import org.muml.uppaal.job.UppaalXMLSynthesisOperation;

public class Muml2UppaalXMLJob extends Job {
	
	private VerifiableElement verifiableElement;
	private VerificationOptionsProvider optionsProvider;
	private IPath targetPath;
	private IResource resource;
				
	public Muml2UppaalXMLJob(VerifiableElement verifiableElement, IPath targetPath, VerificationOptionsProvider optionsProvider) {
		
		super("UPPAAL XML Export");
		
		setUser(true);
		
		this.verifiableElement = verifiableElement;
		this.targetPath = targetPath;
		this.optionsProvider = optionsProvider;
	}
	
	public Muml2UppaalXMLJob(VerifiableElement verifiableElement, IResource resource, VerificationOptionsProvider optionsProvider) {
		
		this(verifiableElement, resource.getLocation(), optionsProvider);
		
		this.resource = resource;
				
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
										
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			
			
			Muml2UppaalOperation m2m = new Muml2UppaalOperation(verifiableElement, optionsProvider);
			try {
				m2m.run(subMonitor.newChild(70));
			}
			catch(CoreException e) {
				return e.getStatus();
			}
			
			
			IWorkspaceRunnable xmlSynthesis = resource == null ? new UppaalXMLSynthesisOperation(m2m.getNTA(), m2m.getPropertyRepository(), targetPath, true) : new UppaalXMLSynthesisOperation(m2m.getNTA(), m2m.getPropertyRepository(), resource, true);
			
			try {
				xmlSynthesis.run(subMonitor.newChild(30));
			}
			catch(CoreException e) {
				return e.getStatus();
			}
						
			return Status.OK_STATUS;
		
		}
		finally {
			monitor.done();
		}
			
	};
	
}
