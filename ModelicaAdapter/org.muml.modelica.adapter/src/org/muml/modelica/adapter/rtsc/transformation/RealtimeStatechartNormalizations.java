package org.muml.modelica.adapter.rtsc.transformation;

import org.muml.pim.realtimestatechart.RealtimeStatechart;

public class RealtimeStatechartNormalizations {
	public static void normalize(RealtimeStatechart rtsc) {
		TransitionPriorityNormalization.normalize(rtsc);
		RegionPriorityNormalization.normalize(rtsc);
	}
}
