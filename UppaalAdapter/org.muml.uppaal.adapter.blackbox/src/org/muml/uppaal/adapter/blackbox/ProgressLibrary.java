package org.muml.uppaal.adapter.blackbox;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.util.IContext;

/**
 * Reports progress to either the running transformation job or the console
 *
 */
public class ProgressLibrary {
	public ProgressLibrary() {}
	private static List<ProgressListener> progressListeners = new ArrayList<ProgressListener>();
	public interface ProgressListener {
		public void reportProgress(IContext context, String nextTask);
	}
	public static void addProgressListener(ProgressListener listener) {
		progressListeners.add(listener);
	}
	public static void removeProgressListener(ProgressListener listener) {
		progressListeners.remove(listener);
	}
	
	/**
	 * Reports that nextTask now begins
	 */
	@Operation(withExecutionContext=true)
	public void reportProgress(IContext context, String nextTask) {
		IProgressMonitor monitor = context.getProgressMonitor();
		if (monitor != null)
			monitor.subTask(nextTask);
		else
			System.out.println("Starting \""+nextTask+"\"");
		
		for (ProgressListener listener : progressListeners) {
			listener.reportProgress(context, nextTask);
		}
	}
}
