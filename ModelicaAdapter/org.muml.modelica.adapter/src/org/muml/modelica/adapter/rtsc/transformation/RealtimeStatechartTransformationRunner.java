package org.muml.modelica.adapter.rtsc.transformation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.muml.modelica.adapter.transformation.QVToTransformationRunner;

import de.uni_paderborn.fujaba.modelica.m2t.transform.RealtimeStatechartTransformationRootObject;
import de.uni_paderborn.fujaba.modelica.m2t.transform.TransformFactory;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;

public class RealtimeStatechartTransformationRunner {
	public static ModelExtent createModelExtent(RealtimeStatechart rtsc) {
		// use a dummy root element, otherwise the rtsc's eContainer
		// is set to null
		RealtimeStatechartTransformationRootObject root =
				TransformFactory.eINSTANCE
				.createRealtimeStatechartTransformationRootObject();
		root.setEObject(rtsc);
		List<EObject> rtscList = new ArrayList<EObject>();
		rtscList.add(root);
		return new BasicModelExtent(rtscList);
	}
	
	public static ExecutionDiagnostic run(String transformationURI, RealtimeStatechart rtsc) {
		return QVToTransformationRunner.run(transformationURI,
				createModelExtent(rtsc));
	}
}
