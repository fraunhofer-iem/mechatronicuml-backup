package org.muml.uppaal.adapter.junit;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.util.URI;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RunTestCases {
	
	// XXX: Note by bingo:
	// Deactivated because of cyclic dependency between UppaalAdapter and TestLanguage.
	// Also removed TestLanguage from Dependent Plugin List in Manifest, to get jenkins compiling again.
	

	private static LinkedList<Object[]> cases = null;

	@Parameterized.Parameters(name = "{index}: {1}")
	public static Collection<Object[]> getTestCases() {
		cases = new LinkedList<Object[]>();
//
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/bebots_AllPositionsTransmission/bebots_AllPositionsTransmission.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/bebots_Delegation/bebots_Delegation.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/bebots_Navigation/bebots_Navigation.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/overtaking-cars/overtaking_cars.testlanguage");
//		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/overtaking-cars-w-contraflow_Allow/overtaking-cars-w-contraflow_Allow.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/overtaking-cars-w-contraflow_ChangeSection/overtaking-cars-w-contraflow_ChangeSection.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/overtaking-cars-w-contraflow_Delegate/overtaking-cars-w-contraflow_Delegate.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/overtaking-cars-w-contraflow_Inform/overtaking-cars-w-contraflow_Inform.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/overtaking-cars-w-contraflow_LimitVelocity/overtaking-cars-w-contraflow_LimitVelocity.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/overtaking-cars-w-contraflow_Overtake/overtaking-cars-w-contraflow_Overtake.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/overtaking-cars-w-contraflow_VModeControl/overtaking-cars-w-contraflow_VModeControl.testlanguage");
//// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/railcab_Convoy/railcab_Convoy.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/railcab_EnterSection/railcab_EnterSection.testlanguage");
// 		addCase("platform:/plugin/org.muml.testlanguage.junit/tests/railcab_NextSectionFree/railcab_NextSectionFree.testlanguage");

		return cases;
	}

	private static void addCase(String path) {
		System.out.println("ADD" + path);
		URI uri = URI.createURI(path);
		cases.add(new Object[] { path, uri.segment(uri.segmentCount() - 1) });
	}

	private String path;
//	private TestCase testCase;
//	private Resource resource;

	public RunTestCases(String path, String fileName) {
		this.path = path;
	}
//
//	@Before
//	public void setup() throws Exception {
//		// Register factory.
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("testlanguage", new XMIResourceFactoryImpl());
//
//		// Tell the TestLanguage we are running from JUnit.
//		URIConversion.RUNNING_FROM_JUNIT = true;
//
//		// Load TestCase.
//		URI uri = URI.createURI(this.path);
//		ResourceSet resourceSet = new ResourceSetImpl();
//		this.resource = resourceSet.getResource(uri, true);
//		EObject obj = this.resource.getContents().get(0);
//		Assert.assertTrue("Resource does not contain a TestCase.",
//				obj instanceof TestCase);
//		this.testCase = (TestCase) obj;
//	}
//
//	@Test
//	public void test() {
//		// Use the EMF Validator first.
//		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(this.testCase);
//		Assert.assertFalse(diagnostic.getChildren().toString(),
//				diagnostic.getSeverity() == Diagnostic.ERROR);
//
//		// Now run the batch validator.
//		IBatchValidator validator = (IBatchValidator) ModelValidationService
//				.getInstance().newValidator(EvaluationMode.BATCH);
//		validator.setIncludeLiveConstraints(true);
//		IStatus status = validator.validate(this.testCase);
//		Assert.assertFalse(status.getMessage(), status.matches(IStatus.ERROR));
//	}
//
//	@After
//	public void clear() {
//		this.resource.unload();
//	}
}
