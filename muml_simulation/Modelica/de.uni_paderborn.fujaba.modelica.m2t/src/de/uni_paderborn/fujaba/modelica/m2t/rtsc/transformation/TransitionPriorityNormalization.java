package de.uni_paderborn.fujaba.modelica.m2t.rtsc.transformation;

import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

public class TransitionPriorityNormalization {
	private static final String TRANSFORMATION = "/de.uni_paderborn.fujaba.modelica.m2t/transforms/TransitionPriorityNormalization.qvto";
	
	public int normalize(RealtimeStatechart rtsc) {
		ExecutionDiagnostic result = RealtimeStatechartTransformationRunner.run(
				TRANSFORMATION, rtsc);
		if (result.getSeverity() != ExecutionDiagnostic.OK) {
			System.out.println("ERROR: " + result.getMessage()  + " (please file a bug)");
			throw new RuntimeException(result.getException());
		}
		return 0;
	}
}
