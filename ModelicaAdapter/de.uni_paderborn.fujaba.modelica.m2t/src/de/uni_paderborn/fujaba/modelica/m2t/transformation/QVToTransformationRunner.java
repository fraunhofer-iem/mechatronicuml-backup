package de.uni_paderborn.fujaba.modelica.m2t.transformation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public class QVToTransformationRunner {
	public static ExecutionDiagnostic run(String transformationURIString, ModelExtent modelExtent) {
		URI transformationURI = URI
				.createPlatformPluginURI(
						transformationURIString,
						true);
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();
		ExecutionDiagnostic result = executor.execute(context, modelExtent);
		return result;
	}
}
