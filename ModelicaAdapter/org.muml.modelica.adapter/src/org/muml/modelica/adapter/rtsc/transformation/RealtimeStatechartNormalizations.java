package org.muml.modelica.adapter.rtsc.transformation;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

public class RealtimeStatechartNormalizations {
	public static void normalize(RealtimeStatechart rtsc) {
		TransitionPriorityNormalization.normalize(rtsc);
		RegionPriorityNormalization.normalize(rtsc);
	}
}
