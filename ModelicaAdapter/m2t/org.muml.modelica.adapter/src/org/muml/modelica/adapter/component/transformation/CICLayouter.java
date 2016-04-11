package org.muml.modelica.adapter.component.transformation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.muml.modelica.adapter.transformation.QVToTransformationRunner;
import org.muml.pim.instance.ComponentInstanceConfiguration;

public class CICLayouter {
private static final String TRANSFORMATION = "/org.muml.modelica.adapter/transforms/ciclayout.qvto";

	private static ModelExtent createModelExtent(ComponentInstanceConfiguration cic) {
		List<ComponentInstanceConfiguration> cicList = new ArrayList<ComponentInstanceConfiguration>();
			cicList.add(cic);
		return new BasicModelExtent(cicList);
	}
	
	public int layout(ComponentInstanceConfiguration cic) {
		ExecutionDiagnostic result = QVToTransformationRunner.run(
				TRANSFORMATION, createModelExtent(cic));
		if (result.getSeverity() != ExecutionDiagnostic.OK) {
			System.out.println("ERROR: " + result.getMessage()  + " (please file a bug)");
			throw new RuntimeException(result.getException());
		}
		return 0;
	}
}
