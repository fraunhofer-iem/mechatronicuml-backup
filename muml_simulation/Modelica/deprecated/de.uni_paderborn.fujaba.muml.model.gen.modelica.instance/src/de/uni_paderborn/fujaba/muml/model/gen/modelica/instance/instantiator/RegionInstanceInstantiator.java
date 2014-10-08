package de.uni_paderborn.fujaba.muml.model.gen.modelica.instance.instantiator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.muml.model.gen.modelica.instance.transform.Map;

public class RegionInstanceInstantiator {
	public Map instantiate(ModelElementCategory instanceCategory) {
		URI transformationURI = URI
				.createPlatformPluginURI(
						"/de.uni_paderborn.fujaba.muml.model.gen.modelica.instance/transforms/RegionInstantiation.qvto",
						true);
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();
		List<ModelElementCategory> categoryList = new ArrayList<ModelElementCategory>();
		categoryList.add(instanceCategory);
		ModelExtent modelExtent = new BasicModelExtent(categoryList);
		ModelExtent outExtent = new BasicModelExtent();
		ExecutionDiagnostic result = executor.execute(context, modelExtent, outExtent);
		if (result.getSeverity() != ExecutionDiagnostic.OK) {
			System.out.println("ERROR: " + result.getMessage() + "(please file a bug)");
			throw new RuntimeException(result.getException());
		}
		return (Map) outExtent.getContents().get(0);
	}
}
