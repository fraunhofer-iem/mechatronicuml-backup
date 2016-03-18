package de.uni_paderborn.uppaal.job;

import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import de.uni_paderborn.fujaba.muml.verification.uppaal.options.Options;
import de.uni_paderborn.uppaal.NTA;
import de.uni_paderborn.uppaal.requirements.PropertyRepository;

public class VerifyTAJob extends Job {
		
	private IWorkspaceRunnable runnable;
						
	public VerifyTAJob(NTA nta, PropertyRepository properties, Options options) {
		super("UPPAAL Model Checking");
				
		runnable = new VerifyTAOperation(nta, properties, options);
	}
	
	@Override
	protected IStatus run(final IProgressMonitor monitor) {
				
		try {	
			ResourcesPlugin.getWorkspace().run(
					runnable,
					monitor
			);
			
			return Status.OK_STATUS;		
		}
		catch(CoreException e) {
			return e.getStatus();
		}
		finally {
			monitor.done();
		}
			
	}	
}
