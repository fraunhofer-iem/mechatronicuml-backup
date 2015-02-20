package de.uni_paderborn.fujaba.muml.verification.uppaal.transformation.blackbox;

import de.uni_paderborn.fujaba.muml.verification.uppaal.job.TransformationJob;

/**
 * Reports progress to either the running transformation job or the console
 *
 */
public class ProgressLibrary {
	public ProgressLibrary() {}
	
	/**
	 * Reports that nextTask now begins
	 */
	public void reportProgress(String nextTask) {
		if (TransformationJob.getProgressMonitor() != null)
			TransformationJob.getProgressMonitor().subTask(nextTask);
		else
			System.out.println("Starting \""+nextTask+"\"");
	}
}
