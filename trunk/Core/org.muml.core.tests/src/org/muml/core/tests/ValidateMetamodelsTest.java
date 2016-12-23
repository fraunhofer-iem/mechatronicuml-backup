package org.muml.core.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.muml.core.tests.resource.ProblemCollector;

public abstract class ValidateMetamodelsTest {
	private String resourcePath;

	public ValidateMetamodelsTest(String resourcePath) {
		this.resourcePath = resourcePath;
	}

	@Test
	public void validateMetamodels() throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		TestUtilities.loadResource(resourceSet, resourcePath);
		EcoreUtil.resolveAll(resourceSet);
		
		final ProblemCollector problems = new ProblemCollector();
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		for (Resource resource : resourceSet.getResources()) {
			for (EObject contents : resource.getContents()) {
				Map<Object, Object> context = new HashMap<Object, Object>();
				if (!Diagnostician.INSTANCE.validate(contents, diagnostics,
						context)) {
					problems.add(resource.getURI().lastSegment()
							+ " is not valid.");
				}
			}
		}
		problems.fail();
	}
}
