package de.uni_paderborn.fujaba.muml.verification.uppaal.job;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;

public abstract class SynchronousJob extends Job {
	
	public SynchronousJob(String name) {
		super(name);
	}
	
	public IStatus execute(IProgressMonitor monitor) {
		return run(monitor);
	}

}
