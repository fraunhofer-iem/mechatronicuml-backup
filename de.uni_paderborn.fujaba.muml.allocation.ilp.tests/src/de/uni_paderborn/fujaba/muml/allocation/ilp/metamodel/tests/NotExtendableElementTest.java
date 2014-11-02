package de.uni_paderborn.fujaba.muml.allocation.ilp.metamodel.tests;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.lpg.BasicEnvironment;
import org.eclipse.ocl.util.OCLUtil;
import org.junit.BeforeClass;
import org.junit.Test;
import org.storydriven.core.CorePackage;

import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;
/**
 * Test the OCL Invariants in the hardware metamodel It is based on the
 * MetamodelOCLTest {@link de.uni_paderborn.fujaba.muml.tests.MetamodelOCLTest
 * MetamodelOCLTest} of the de.uni_paderborn.fujaba.muml.tests package
 * 
 * @author Andreas Dann
 */
public class NotExtendableElementTest {

	/**
	 * @param args
	 */

	private static OCL OCL_ENV = OCL
			.newInstance(EcoreEnvironmentFactory.INSTANCE);
	private static EcoreWalker ecoreWalker = null;
	ProblemCollector noEObjectSuperTypeErrors = new ProblemCollector();

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
		ecoreWalker = new EcoreWalker("de.uni_paderborn.fujaba.muml.allocation.ilp", "/model/ilp.ecore");

	}

	@Test
	public void testExpendableElement() {

		EcoreSwitch<Object> visitor = new EcoreSwitch<Object>() {

			@Override
			public Object caseEClass(EClass object) {
				System.out.println("Look for Superclasses of Class: "
						+ object.getName());
				EList<EClass> supertypes = object.getESuperTypes();
				EClass superclass = CorePackage.Literals.EXTENDABLE_ELEMENT
						.eClass();
				if (!superclass.isSuperTypeOf(object.eClass())) {
					NotExtendableElementTest.this.noEObjectSuperTypeErrors
							.add("ERROR: " + object.getEPackage().getName()
									+ "." + object.getName() + ".");
				}
				;

				return Boolean.FALSE;
			};

		};
		ecoreWalker.walk(visitor);
		
		noEObjectSuperTypeErrors.fail();
	}

}
