package org.muml.uppaal.adapter.blackbox;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.util.IContext;

/**
 * Reports progress to either the running transformation job or the console
 *
 */
public class ProgressLibrary {
	public ProgressLibrary() {}
	/**
	 * Reports that nextTask now begins
	 */
	@Operation(withExecutionContext=true)
	public void reportProgress(IContext context, String nextTask) {
		IProgressMonitor monitor = context.getProgressMonitor();
		if (monitor != null)
			monitor.subTask(nextTask);
		else
			System.out.println(nextTask);
		
		
		org.muml.uppaal.adapter.log.UppaalAdapterLogPlugin.getDefault().logInfo(nextTask);
	}
}
