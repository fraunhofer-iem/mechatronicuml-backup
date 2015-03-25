package de.uni_paderborn.fujaba.muml.verification.uppaal.job;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;

import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;
import de.uni_paderborn.fujaba.muml.verification.uppaal.job.interfaces.VerificationOptionsProvider;

public class ExportUppaalXMLJob extends SynchronousJob {
	
	private VerifiableElement verifiableElement;
	private VerificationOptionsProvider optionsProvider;
	private IPath targetPath;
	private IResource resource;
				
	public ExportUppaalXMLJob(VerifiableElement verifiableElement, IPath targetPath, VerificationOptionsProvider optionsProvider) {
		
		super("UPPAAL XML Export");
		
		setUser(true);
		
		this.verifiableElement = verifiableElement;
		this.targetPath = targetPath;
		this.optionsProvider = optionsProvider;
	}
	
	public ExportUppaalXMLJob(VerifiableElement verifiableElement, IResource resource, VerificationOptionsProvider optionsProvider) {
		
		this(verifiableElement, resource.getLocation(), optionsProvider);
		
		this.resource = resource;
				
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
										
		try {
			SubMonitor subMonitor = SubMonitor.convert(monitor, this.getName(), 100);
			IStatus status;
			
			Muml2UppaalJob m2m = new Muml2UppaalJob(verifiableElement, optionsProvider);
			status = m2m.execute(subMonitor.newChild(70));
			if(!status.isOK()) {
				return status;
			}
			
			SynchronousJob xmlSynthesis = resource == null ? new UppaalXMLSynthesisJob(m2m.getNTA(), m2m.getPropertyRepository(), targetPath, true) : new UppaalXMLSynthesisJob(m2m.getNTA(), m2m.getPropertyRepository(), resource, true);
			status = xmlSynthesis.execute(subMonitor.newChild(30));
			if(!status.isOK()) {
				return status;
			}
			
			return Status.OK_STATUS;
		
		}
		finally {
			monitor.done();
		}
			
	};
	
}
