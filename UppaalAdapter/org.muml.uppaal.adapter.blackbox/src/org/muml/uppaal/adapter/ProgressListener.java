package org.muml.uppaal.adapter;

import org.eclipse.m2m.qvt.oml.util.IContext;

public interface ProgressListener {
	public void reportProgress(IContext context, String nextTask);
}