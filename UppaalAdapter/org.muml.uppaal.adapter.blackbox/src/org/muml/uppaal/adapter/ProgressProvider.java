package org.muml.uppaal.adapter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.m2m.qvt.oml.util.IContext;

public class ProgressProvider implements ProgressListener {
	private static ProgressProvider instance = null;
	
	private List<ProgressListener> progressListeners = new ArrayList<ProgressListener>();
	private ProgressProvider() {
		
	}
	public static ProgressProvider getDefault() {
		if (instance == null) {
			instance = new ProgressProvider();
		}
		return instance;
	}
	
	public void addProgressListener(ProgressListener listener) {
		progressListeners.add(listener);
	}
	public void removeProgressListener(ProgressListener listener) {
		progressListeners.remove(listener);
	}

	@Override
	public void reportProgress(IContext context, String nextTask) {
		for (ProgressListener listener : progressListeners) {
			listener.reportProgress(context, nextTask);
		}		
	}
}
