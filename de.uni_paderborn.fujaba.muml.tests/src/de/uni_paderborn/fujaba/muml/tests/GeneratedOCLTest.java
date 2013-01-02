package de.uni_paderborn.fujaba.muml.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.SemanticException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.lpg.BasicEnvironment;
import org.eclipse.ocl.lpg.ProblemHandler;
import org.eclipse.ocl.options.ProblemOption;
import org.eclipse.ocl.util.OCLUtil;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.model.ModelPackage;
import de.uni_paderborn.fujaba.muml.tests.resource.IResourceVisitor;
import de.uni_paderborn.fujaba.muml.tests.resource.ProblemCollector;

/**
 * This test checks the generated model code for invalid OCL. After making
 * changes, please regenerate the model code prior to testing them.
 * 
 * @author bingo
 * 
 */
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
		// Initialize OCL environment
		BasicEnvironment benv = OCLUtil.getAdapter(OCL_ENV.getEnvironment(),
				BasicEnvironment.class);
		// Do not show warning for closure iterator (we currently display
		// warnings as errors)
		benv.setOption(ProblemOption.CLOSURE_ITERATOR,
				ProblemHandler.Severity.OK);
		
		
		// initialize OCL in ecore
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		    new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		    new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/emf/2002/Ecore/OCL",
		    new OCLValidationDelegateFactory.Global());

//
//		// Initialize all packages
//		accept(ModelPackage.eINSTANCE, new IResourceVisitor() {
//			@Override
//			public boolean visit(EObject element) {
//				if (element instanceof EPackage) {
//					((EPackage) element).eClass();
//					return true;
//				}
//				return false;
//			}
//		});

		// TODO: set a different label provider
		// setLabelProvider(qualifiedLabelProvider);
	}

	/**
	 * Tests, if all OCL constraints are evaluating to either true or false (not
	 * OclInvalid).
	 */
	@Test
	public void validOclConstraints() {
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
							EObject object = null;
							if (eClass.isAbstract()) {
								EClass concrete = findConcreteClass(eClass);
								if (concrete != null) {
									object = eClass.getEPackage()
											.getEFactoryInstance()
											.create(concrete);
								}
							}

							validateOCLConstraint(eClass, object, constraintOCL);
						} catch (ParserException e) {
							problems.add("ERROR: " + eClass.getName() + "."
									+ constraintName + ": "
									+ e.getLocalizedMessage());
						} catch (WrappedException e) {
							problems.add("ERROR: " + eClass.getName() + "."
									+ constraintName + ": "
									+ e.getLocalizedMessage());
						}
					}
					return false;
				}
				return true;
			}

		});
		problems.fail();
	}

	/**
	 * Tests, if all OCL derivations are valid.
	 */
	@Test
	public void validOclDerivations() {
		final ProblemCollector problems = new ProblemCollector();

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
							problems.add("NOIMPL: "
									+ feature.getEContainingClass().getName()
									+ "." + feature.getName());
						} else if (derivation != null) {
							String derivationOCL = derivation.getDetails().get(
									"derivation");
							try {
								EClass eClass = feature.getEContainingClass();
								EObject object = null;
								if (eClass.isAbstract()) {
									EClass concrete = findConcreteClass(eClass);
									if (concrete != null) {
										object = eClass.getEPackage()
												.getEFactoryInstance()
												.create(concrete);

									}
								}
								validateOCLDerivation(eClass, feature, object,
										derivationOCL);
							} catch (ParserException e) {
								problems.add("ERROR: "
										+ feature.getEContainingClass()
												.getName() + "."
										+ feature.getName() + ": "
										+ e.getLocalizedMessage());
							} catch (WrappedException e) {
								problems.add("ERROR: "
										+ feature.getEContainingClass()
												.getName() + "."
										+ feature.getName() + ": "
										+ e.getLocalizedMessage());
							}
						}

					}
				}
				return true;
			}

		});
		problems.fail();
	}

	/**
	 * Tests, if there are deactivated OCL constraints.
	 */
	@Test
	public void deactivatedOclConstraints() {
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
							problems.add("DEACT:" + eClass.getName() + "."
									+ constraintName);
						}
					}
					return false;
				}
				return true;
			}

		});
		problems.fail();
	}

	protected EClass findConcreteClass(EClass abstractClass) {
		for (EClassifier classifier : abstractClass.getEPackage()
				.getEClassifiers()) {
			if (classifier instanceof EClass) {
				EClass eClass = (EClass) classifier;
				if (abstractClass.isSuperTypeOf(eClass) && !eClass.isAbstract()) {
					return eClass;
				}
			}
		}
		return null;
	}

	protected void validateOCLConstraint(EClass eClass, EObject object,
			String expr) throws ParserException {
		OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = OCL_ENV
				.createOCLHelper();

		helper.setValidating(true);
		helper.setContext(eClass);

		Constraint constraintExpression = helper.createInvariant(expr);
		Query<EClassifier, ?, ?> query = OCL_ENV
				.createQuery(constraintExpression);

		if (object != null) {
			query.check(object);
			Object result = query.evaluate(object);
			if (!(result instanceof Boolean)) {
				throw new SemanticException("Result type does not evaluate to boolean:" + result.toString());
			}
		}

	}

	protected void validateOCLDerivation(EClass eClass,
			EStructuralFeature feature, EObject object, String expr)
			throws ParserException {
		OCLHelper helper = OCL_ENV.createOCLHelper();
		helper.setValidating(true);
		helper.setAttributeContext(eClass, feature);

		Object queryExpression = helper.createDerivedValueExpression(expr);
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(queryExpression);
		EClassifier staticResultType = query.resultType();
		//EClass staticResultClass = (EClass) staticResultType;
		

		if (object != null) {
			Object result = query.evaluate(object);
			object.eGet(feature); // try to read the value (also checks result type)
		}
	}

}
