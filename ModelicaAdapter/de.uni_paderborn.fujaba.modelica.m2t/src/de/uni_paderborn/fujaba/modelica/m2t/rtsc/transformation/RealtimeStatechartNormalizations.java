package de.uni_paderborn.fujaba.modelica.m2t.rtsc.transformation;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

public class RealtimeStatechartNormalizations {
	public static void normalize(RealtimeStatechart rtsc) {
		TransitionPriorityNormalization.normalize(rtsc);
		RegionPriorityNormalization.normalize(rtsc);
	}
}
