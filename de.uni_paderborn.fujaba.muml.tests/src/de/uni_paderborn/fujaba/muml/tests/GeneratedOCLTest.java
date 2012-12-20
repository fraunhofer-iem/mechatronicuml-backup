package de.uni_paderborn.fujaba.muml.tests;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.model.ModelPackage;
import de.uni_paderborn.fujaba.muml.tests.resource.IResourceVisitor;

public class GeneratedOCLTest extends TraverseTest {

	public static OCL<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> OCL_ENV = OCL
			.newInstance(EcoreEnvironmentFactory.INSTANCE);

	/**
	 * Initializes this test class by loading the ecore model. All tests in this
	 * class are executed on the loaded ecore model, afterwards.
	 * 
	 * @throws Exception
	 *             In case an exception occurs to make the test fail.
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Initialize all packages
		accept(ModelPackage.eINSTANCE, new IResourceVisitor() {
			@Override
			public boolean visit(EObject element) {
				if (element instanceof EPackage) {
					((EPackage) element).eClass();
					return true;
				}
				return false;
			}
		});

		// TODO: set a different label provider
		// setLabelProvider(qualifiedLabelProvider);
	}

	/**
	 * Tests, if all OCL constraints are evaluating to either true or false (not
	 * OclInvalid).
	 */
	@Test
	public void validOclConstraints() {
		accept(ModelPackage.eINSTANCE, new IResourceVisitor() {
			@Override
			public boolean visit(EObject element) {
				if (element instanceof EClass) {
					EMap<String, String> constraints = new BasicEMap<String, String>();
					List<String> activatedConstraints = new ArrayList<String>();
					EClass eClass = (EClass) element;
					
					for (EObject contents : eClass.eContents()) {
						if (contents instanceof EAnnotation) {
							EAnnotation annotation = (EAnnotation) contents;
							
							if (annotation.getSource() == "http://www.eclipse.org/emf/2002/Ecore"
									&& annotation.getDetails().containsKey(
											"constraints")) {
								String constraintLine = annotation.getDetails()
										.get("constraints");
								activatedConstraints.addAll(Arrays
										.asList(constraintLine.split(" ")));
							}
							if (annotation.getSource() == "http://www.eclipse.org/emf/2002/Ecore/OCL") {
								constraints.putAll(annotation.getDetails());
							}
						}
					}
					// Evaluate active constraints
					for (String constraintName : activatedConstraints) {
						if (!constraints.containsKey(constraintName)) {
							fail("Class "
									+ getLabel(element)
									+ " references non-existing OCL constraint \""
									+ constraintName + "\"");
						}
						String constraintOCL = constraints.get(constraintName);
						try {
							validateOCL(eClass, constraintOCL);
						} catch (ParserException e) {
							fail(e.getLocalizedMessage() + " in OCL constraint: " + eClass.getName() + "." + constraintName);
						}
					}
				}
				return true;
			}

		});
	}

	protected void validateOCL(EClass context, String expr) throws ParserException {
		OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = OCL_ENV
				.createOCLHelper();
		helper.setValidating(true);
		helper.setContext(context);

		Constraint constraint = helper.createInvariant(expr);
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(constraint);
		query.check(context);
	}

}
