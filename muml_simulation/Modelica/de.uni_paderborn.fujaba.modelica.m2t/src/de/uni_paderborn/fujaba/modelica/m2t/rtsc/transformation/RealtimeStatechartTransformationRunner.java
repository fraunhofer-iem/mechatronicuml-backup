package de.uni_paderborn.fujaba.modelica.m2t.rtsc.transformation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;

import de.uni_paderborn.fujaba.modelica.m2t.transformation.QVToTransformationRunner;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

public class RealtimeStatechartTransformationRunner {
	public static ModelExtent createModelExtent(RealtimeStatechart rtsc) {
		List<RealtimeStatechart> rtscList = new ArrayList<RealtimeStatechart>();
		rtscList.add(rtsc);
		return new BasicModelExtent(rtscList);
	}
	
	public static ExecutionDiagnostic run(String transformationURI, RealtimeStatechart rtsc) {
		return QVToTransformationRunner.run(transformationURI,
				createModelExtent(rtsc));
	}
}
