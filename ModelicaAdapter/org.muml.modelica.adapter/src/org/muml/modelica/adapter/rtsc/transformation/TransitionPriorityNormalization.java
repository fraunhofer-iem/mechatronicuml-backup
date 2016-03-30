package org.muml.modelica.adapter.rtsc.transformation;

import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.muml.modelica.adapter.transformation.QVToTransformationRunner;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

public class TransitionPriorityNormalization {
	private static final String TRANSFORMATION = "/de.uni_paderborn.fujaba.modelica.m2t/transforms/TransitionPriorityNormalization.qvto";
	
	public static int normalize(RealtimeStatechart rtsc) {
		ExecutionDiagnostic result = RealtimeStatechartTransformationRunner.run(
				TRANSFORMATION, rtsc);
		QVToTransformationRunner.checkResult(result);
		return 0;
	}
}
