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

import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

/**
 * Test the OCL Derivations in the hardware metamodel
 * It is based on the MetamodelOCLTest  {@link de.uni_paderborn.fujaba.muml.tests.MetamodelOCLTest MetamodelOCLTest} of the de.uni_paderborn.fujaba.muml.tests package
 * @author Andreas Dann
 */
public class DerivationTest {

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
	public void testOCLderivartions() {

		EcoreSwitch<Object> visitor = new EcoreSwitch<Object>() {

			@Override
			public Object caseEStructuralFeature(EStructuralFeature object) {
				System.out.println("Look for derived Feature: " + object.getName() +" in Class: "+object.getEContainingClass().getName());
				for (EAnnotation annotation : object.getEAnnotations()) {
					if (annotation.getSource() == "http://www.eclipse.org/emf/2002/Ecore/OCL") {
						try {
							validateOCLDerivation(object.getEContainingClass(), object, annotation.getDetails().get(0).getValue());
						} catch (ParserException e) {
							// TODO Auto-generated catch block
							DerivationTest.this.oclErrors.add("ERROR: "
									+ object.getEContainingClass().getEPackage().getName() + "."
									+ object.getEContainingClass().getName() + "."
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

	protected void validateOCLDerivation(EClass eClass,EStructuralFeature feature, String expresion)
			throws ParserException {
		OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = OCL_ENV.createOCLHelper();
		System.out.println("Test deriviation for Feature: " + feature.getName() +" of Class: "+eClass.getName());
		helper.setValidating(true);
		helper.setAttributeContext(eClass, feature);
		Constraint constraintExpression = helper.createDerivedValueExpression(expresion);
	}
}
