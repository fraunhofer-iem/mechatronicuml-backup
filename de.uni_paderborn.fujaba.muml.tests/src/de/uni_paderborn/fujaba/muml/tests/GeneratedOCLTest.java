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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.model.ModelPackage;
import de.uni_paderborn.fujaba.muml.tests.resource.IResourceVisitor;
import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

public class GeneratedOCLTest extends TraverseTest {

	public static OCL OCL_ENV = OCL
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
		final List<String> problems = new ArrayList<String>();

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
								if (!constraintLine.isEmpty()) {
									activatedConstraints.addAll(Arrays
											.asList(constraintLine.split(" ")));
								}
							}
							if (annotation.getSource() == "http://www.eclipse.org/emf/2002/Ecore/OCL") {
								constraints.putAll(annotation.getDetails());
							}
						}
					}
					// Evaluate active constraints
					for (String constraintName : activatedConstraints) {
						if (!constraints.containsKey(constraintName)) {
							problems.add("Class "
									+ eClass.getName()
									+ " references non-existing OCL constraint \""
									+ constraintName + "\"");
							continue;
						}
						String constraintOCL = constraints.get(constraintName);
						try {
							validateOCLConstraint(eClass, constraintOCL);
						} catch (ParserException e) {
							problems.add(e.getLocalizedMessage()
									+ " in OCL constraint: " + eClass.getName()
									+ "." + constraintName);
						}
					}
					return false;
				}
				return true;
			}

		});
		if (!problems.isEmpty()) {
			StringBuilder errorText = new StringBuilder();
			int line = 0;
			for (String problem : problems) {
				if (line++ > 0) {
					errorText.append('\n');
				}
				errorText.append(problem);
			}
			fail(errorText.toString());
		}
	}

	/**
	 * Tests, if all OCL derivations are valid.
	 */
	@Test
	public void validOclDerivations() {
		final List<String> problems = new ArrayList<String>();

		accept(ModelPackage.eINSTANCE, new IResourceVisitor() {
			@Override
			public boolean visit(EObject element) {
				if (element instanceof EStructuralFeature) {
					EStructuralFeature feature = (EStructuralFeature) element;
					if (feature.isDerived()) {
						EAnnotation derivation = null;
						EAnnotation body = null;
						for (EObject contents : feature.eContents()) {
							if (contents instanceof EAnnotation) {
								EAnnotation annotation = (EAnnotation) contents;
								if (annotation.getSource() == "http://www.eclipse.org/emf/2002/Ecore/OCL") {
									if (annotation.getDetails().containsKey(
											"derivation")) {
										derivation = annotation;
									} else if (annotation.getDetails()
											.containsKey("body")) {
										body = annotation;
									}
								}
							}
						}

						if (derivation == null && body == null) {
							problems.add("No derivation implemented for feature: "
									+ feature.getEContainingClass().getName()
									+ "." + feature.getName());
						} else if (derivation != null) {
							String derivationOCL = derivation.getDetails().get(
									"derivation");
							try {
								validateOCLDerivation(feature, derivationOCL);
							} catch (ParserException e) {
								problems.add(e.getLocalizedMessage()
										+ " in OCL derivation for: "
										+ feature.getEContainingClass()
												.getName() + "."
										+ feature.getName());
							}
						}

					}
				}
				return true;
			}

		});
		if (!problems.isEmpty()) {
			StringBuilder errorText = new StringBuilder();
			int line = 0;
			for (String problem : problems) {
				if (line++ > 0) {
					errorText.append('\n');
				}
				errorText.append(problem);
			}
			fail(errorText.toString());
		}
	}

	/**
	 * Tests, if there are deactivated OCL constraints.
	 */
	@Test
	public void noDeactivatedOclConstraints() {
		final ProblemCollector problems = new ProblemCollector();

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
								if (!constraintLine.isEmpty()) {
									activatedConstraints.addAll(Arrays
											.asList(constraintLine.split(" ")));
								}
							}
							if (annotation.getSource() == "http://www.eclipse.org/emf/2002/Ecore/OCL") {
								constraints.putAll(annotation.getDetails());
							}
						}
					}
					// Find deactivated constraints
					for (String constraintName : constraints.keySet()) {
						if (!activatedConstraints.contains(constraintName)) {
							problems.add("Class " + eClass.getName()
									+ " has deactivated OCL constraint \""
									+ constraintName + "\"");
						}
					}
					return false;
				}
				return true;
			}

		});
		problems.fail();
	}

	protected void validateOCLConstraint(EClassifier context, String expr)
			throws ParserException {
		OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = OCL_ENV
				.createOCLHelper();
		helper.setValidating(true);
		helper.setContext(context);

		Constraint constraintExpression = helper.createInvariant(expr);
		Query<EClassifier, ?, ?> query = OCL_ENV
				.createQuery(constraintExpression);
		// query.check(object);
	}

	protected void validateOCLDerivation(EStructuralFeature context, String expr)
			throws ParserException {
		OCLHelper helper = OCL_ENV.createOCLHelper();
		helper.setValidating(true);
		helper.setContext(context.getEContainingClass());
		helper.setAttributeContext(context.getEContainingClass(), context);

		Object queryExpression = helper.createDerivedValueExpression(expr);
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(queryExpression);
		// query.evaluate(null);
	}

}
