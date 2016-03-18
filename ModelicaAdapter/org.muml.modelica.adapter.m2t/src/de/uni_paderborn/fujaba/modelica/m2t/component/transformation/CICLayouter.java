package de.uni_paderborn.fujaba.modelica.m2t.component.transformation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;

import de.uni_paderborn.fujaba.modelica.m2t.transformation.QVToTransformationRunner;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

public class CICLayouter {
private static final String TRANSFORMATION = "/de.uni_paderborn.fujaba.modelica.m2t/transforms/ciclayout.qvto";

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
