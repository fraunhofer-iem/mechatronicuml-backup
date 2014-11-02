/**
 */
package de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.util;

import de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.psm.api.apiexpressions.ApiexpressionsPackage
 * @generated
 */
public class ApiexpressionsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ApiexpressionsValidator INSTANCE = new ApiexpressionsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.psm.api.apiexpressions";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiexpressionsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ApiexpressionsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ApiexpressionsPackage.API_CALL_EXPRESSION:
				return validateAPICallExpression((APICallExpression)value, diagnostics, context);
			case ApiexpressionsPackage.ENUMERATION_VALUE_EXPRESSION:
				return validateEnumerationValueExpression((EnumerationValueExpression)value, diagnostics, context);
			case ApiexpressionsPackage.CONTINUOUS_PORT_EXPRESSION:
				return validateContinuousPortExpression((ContinuousPortExpression)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPICallExpression(APICallExpression apiCallExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apiCallExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apiCallExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apiCallExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apiCallExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apiCallExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apiCallExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apiCallExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apiCallExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apiCallExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPICallExpression_ParameterBindingForEveryParameter(apiCallExpression, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ParameterBindingForEveryParameter constraint of '<em>API Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPICallExpression_ParameterBindingForEveryParameter(APICallExpression apiCallExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ParameterBindingForEveryParameter", getObjectLabel(apiCallExpression, context) },
						 new Object[] { apiCallExpression },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationValueExpression(EnumerationValueExpression enumerationValueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationValueExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousPortExpression(ContinuousPortExpression continuousPortExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuousPortExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuousPortExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuousPortExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuousPortExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuousPortExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuousPortExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuousPortExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuousPortExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuousPortExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuousPortExpression_OnlyInPortsAllowed(continuousPortExpression, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyInPortsAllowed constraint of '<em>Continuous Port Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTINUOUS_PORT_EXPRESSION__ONLY_IN_PORTS_ALLOWED__EEXPRESSION = "self.continuousPort.portType.oclAsType(component::DirectedTypedPort).kind = component::PortDirectionKind::IN";

	/**
	 * Validates the OnlyInPortsAllowed constraint of '<em>Continuous Port Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuousPortExpression_OnlyInPortsAllowed(ContinuousPortExpression continuousPortExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ApiexpressionsPackage.Literals.CONTINUOUS_PORT_EXPRESSION,
				 continuousPortExpression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OnlyInPortsAllowed",
				 CONTINUOUS_PORT_EXPRESSION__ONLY_IN_PORTS_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ApiexpressionsValidator
