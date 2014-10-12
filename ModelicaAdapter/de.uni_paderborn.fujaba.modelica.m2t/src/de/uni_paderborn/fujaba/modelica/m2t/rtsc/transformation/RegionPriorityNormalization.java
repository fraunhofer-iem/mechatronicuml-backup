package de.uni_paderborn.fujaba.modelica.m2t.rtsc.transformation;

import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;

import de.uni_paderborn.fujaba.modelica.m2t.transformation.QVToTransformationRunner;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

public class RegionPriorityNormalization {
	private static final String TRANSFORMATION = "/de.uni_paderborn.fujaba.modelica.m2t/transforms/RegionPriorityNormalization.qvto";
	
	public static int normalize(RealtimeStatechart rtsc) {
		ExecutionDiagnostic result = RealtimeStatechartTransformationRunner.run(
				TRANSFORMATION, rtsc);
		QVToTransformationRunner.checkResult(result);
		return 0;
	}
}
