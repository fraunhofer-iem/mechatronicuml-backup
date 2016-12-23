package org.muml.modelica.adapter.instantiator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.muml.modelica.transform.Map;
import org.muml.pim.instance.ComponentInstanceConfiguration;

public class RegionInstanceInstantiator {
	public Map instantiate(ComponentInstanceConfiguration cic) {
		URI transformationURI = URI
				.createPlatformPluginURI(
						"/org.muml.modelica.adapter/transforms/RegionInstantiation.qvto",
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
