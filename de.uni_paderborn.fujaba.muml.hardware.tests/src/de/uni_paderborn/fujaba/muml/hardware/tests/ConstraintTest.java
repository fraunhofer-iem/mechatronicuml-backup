package de.uni_paderborn.fujaba.muml.hardware.tests;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.lpg.BasicEnvironment;
import org.eclipse.ocl.util.OCLUtil;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test the OCL Invariants in the hardware metamodel
 * It is based on the MetamodelOCLTest  {@link de.uni_paderborn.fujaba.muml.tests.MetamodelOCLTest MetamodelOCLTest} of the de.uni_paderborn.fujaba.muml.tests package
 * @author Andreas Dann
 */
public class ConstraintTest {

	/**
	 * @param args
	 */

	private static OCL OCL_ENV = OCL
			.newInstance(EcoreEnvironmentFactory.INSTANCE);
	private static EcoreWalker ecoreWalker = null;
	ProblemCollector oclErrors=new ProblemCollector();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Initialize OCL environment
		BasicEnvironment benv = OCLUtil.getAdapter(OCL_ENV.getEnvironment(),
				BasicEnvironment.class);

		// initialize OCL in ecore
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
				.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
						new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(
				"http://www.eclipse.org/emf/2002/Ecore/OCL",
				new OCLValidationDelegateFactory.Global());
		ecoreWalker = new EcoreWalker("de.uni_paderborn.fujaba.muml.hardware",
				"/model/hardware.ecore");
		
	}

	@Test
	public void testOCLconstrains() {

		EcoreSwitch<Object> visitor = new EcoreSwitch<Object>() {

			@Override
			public Object caseEClass(EClass object) {
				System.out.println("Look for OCL Invaraints in Class: " + object.getName());
				for (EAnnotation annotation : object.getEAnnotations()) {
					if (annotation.getSource() == "http://www.eclipse.org/emf/2002/Ecore/OCL") {
						try {
							validateOCLConstraint(object,
									annotation.getDetails().get(0).getValue());
						} catch (ParserException e) {
							// TODO Auto-generated catch block
							ConstraintTest.this.oclErrors.add("ERROR: "
									+ object.getEPackage().getName() + "."
									+ object.getName() + "."
									+ annotation.getDetails().get(0).getKey() + ": "
									+ e.getLocalizedMessage());
						}
					}
				}
				return Boolean.FALSE;
			};
			
		};
		ecoreWalker.walk(visitor);
		
		oclErrors.fail();
	}

	protected void validateOCLConstraint(EClass eClass, String expression)
			throws ParserException {
		OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = OCL_ENV
				.createOCLHelper();
		
		System.out.println("Test OCL Invariant for Class: " +eClass.getName());
		
		helper.setValidating(true);
		helper.setContext(eClass);

		Constraint constraintExpression = helper.createInvariant(expression);
	}
}
