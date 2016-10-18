package org.muml.uppaal.adapter.job.statistics;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.m2m.qvt.oml.util.IContext;

public class StatisticalEvaluation implements org.muml.uppaal.adapter.ProgressListener {

	private IContext context;
	private Map<String, Integer> timestamps = new HashMap<String, Integer>();
	
	public StatisticalEvaluation(IContext context) {
		this.context = context;
	}
	
	@Override
	public void reportProgress(IContext context, String nextTask) {
		if (context == this.context) {
			//timestamps.put(nextTask, )
		}
	}

}
