package de.uni_paderborn.fujaba.modelica.m2t.instantiator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.uni_paderborn.fujaba.modelica.m2t.transform.Map;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

public class RegionInstanceInstantiator {
	public Map instantiate(ComponentInstanceConfiguration cic) {
		URI transformationURI = URI
				.createPlatformPluginURI(
						"/de.uni_paderborn.fujaba.modelica.m2t/transforms/RegionInstantiation.qvto",
						true);
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();
		List<ComponentInstanceConfiguration> cicList = new ArrayList<ComponentInstanceConfiguration>();
		cicList.add(cic);
		ModelExtent modelExtent = new BasicModelExtent(cicList);
		ModelExtent outExtent = new BasicModelExtent();
		ExecutionDiagnostic result = executor.execute(context, modelExtent, outExtent);
		if (result.getSeverity() != ExecutionDiagnostic.OK) {
			System.out.println("ERROR: " + result.getMessage() + "(please file a bug)");
			throw new RuntimeException(result.getException());
		}
		return (Map) outExtent.getContents().get(0);
	}
}
