/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.util;

import de.uni_paderborn.fujaba.muml.testlanguage.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see de.uni_paderborn.fujaba.muml.testlanguage.TestLanguagePackage
 * @generated
 */
public class TestLanguageValidator extends EObjectValidator {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final TestLanguageValidator INSTANCE = new TestLanguageValidator();

	/**
	 * A constant for the
	 * {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
	 * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes}
	 * from this package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.testlanguage";

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants in a derived class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public TestLanguageValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TestLanguagePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the
	 * model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TestLanguagePackage.NODE:
			return validateNode((Node) value, diagnostics, context);
		case TestLanguagePackage.INPUT:
			return validateInput((Input) value, diagnostics, context);
		case TestLanguagePackage.OUTPUT:
			return validateOutput((Output) value, diagnostics, context);
		case TestLanguagePackage.PORT:
			return validatePort((Port) value, diagnostics, context);
		case TestLanguagePackage.TEST_CASE:
			return validateTestCase((TestCase) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNode_noCyclesAllowed(node, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noCyclesAllowed constraint of '
	 * <em>Node</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final String NODE__NO_CYCLES_ALLOWED__EEXPRESSION = "-- Nodes may not be part of a cycle or be dependent on a node that is part of a cycle.\r\n"
			+ "self.outputs.targets.node->asSet()->closure(outputs.targets.node)->excludes(self)";

	/**
	 * Validates the noCyclesAllowed constraint of '<em>Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNode_noCyclesAllowed(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(TestLanguagePackage.Literals.NODE, node, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL", "noCyclesAllowed", NODE__NO_CYCLES_ALLOWED__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInput(Input input, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(input, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(input, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(input, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(input, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(input, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(input, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(input, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(input, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(input, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInput_mandatoryInputMustBeConnected(input, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mandatoryInputMustBeConnected
	 * constraint of '<em>Input</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected static final String INPUT__MANDATORY_INPUT_MUST_BE_CONNECTED__EEXPRESSION = "-- Inputs that are mandatory (= not optional) must have a connection.\r\n"
			+ "self.source.oclIsUndefined() implies self.optional";

	/**
	 * Validates the mandatoryInputMustBeConnected constraint of '<em>Input</em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateInput_mandatoryInputMustBeConnected(Input input, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(TestLanguagePackage.Literals.INPUT, input, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL", "mandatoryInputMustBeConnected",
				INPUT__MANDATORY_INPUT_MUST_BE_CONNECTED__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOutput(Output output, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(output, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTestCase(TestCase testCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testCase, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this
	 * validator's diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to
		// this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // TestLanguageValidator
