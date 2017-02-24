package org.muml.ImplicitCopy.qvto.library.test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.testlanguage.TestCase;
import org.muml.testlanguage.specification.custom.URIConversion;

@RunWith(Parameterized.class)
public class RunTestCases {

	private static LinkedList<Object[]> cases = null;

	@Parameterized.Parameters(name = "{index}: {1}")
	public static Collection<Object[]> getTestCases() {
		cases = new LinkedList<Object[]>();
		addCase("platform:/plugin/org.muml.ImplicitCopy.qvto.library.test/testModels/ImplicitCopy.testlanguage");
		return cases;
	}

	private static void addCase(String path) {
		System.out.println("ADD" + path);
		URI uri = URI.createURI(path);
		cases.add(new Object[] { path, uri.segment(uri.segmentCount() - 1) });
	}

	private String path;
	private TestCase testCase;
	private Resource resource;

	public RunTestCases(String path, String fileName) {
		this.path = path;
	}

	@Before
	public void setup() throws Exception {
		// Register factory.
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("testlanguage", new XMIResourceFactoryImpl());

		// Tell the TestLanguage we are running from JUnit.
		URIConversion.RUNNING_FROM_JUNIT = true;

		// Load TestCase.
		URI uri = URI.createURI(this.path);
		ResourceSet resourceSet = new ResourceSetImpl();
		this.resource = resourceSet.getResource(uri, true);
		EObject obj = this.resource.getContents().get(0);
		Assert.assertTrue("Resource does not contain a TestCase.",
				obj instanceof TestCase);
		this.testCase = (TestCase) obj;
	}

	@Test
	public void test() {
		// Use the EMF Validator first.
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(this.testCase);
		Assert.assertFalse(diagnostic.getChildren().toString(),
				diagnostic.getSeverity() == Diagnostic.ERROR);

		// Now run the batch validator.
		IBatchValidator validator = (IBatchValidator) ModelValidationService
				.getInstance().newValidator(EvaluationMode.BATCH);
		validator.setIncludeLiveConstraints(true);
		IStatus status = validator.validate(this.testCase);
		Assert.assertFalse(status.getMessage(), status.matches(IStatus.ERROR));
	}

	@After
	public void clear() {
		this.resource.unload();
	}
}
