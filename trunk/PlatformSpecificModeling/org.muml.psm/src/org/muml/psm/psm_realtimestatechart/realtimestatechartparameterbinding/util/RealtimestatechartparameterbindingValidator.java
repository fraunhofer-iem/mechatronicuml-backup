/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.TimeParameterBinding;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage
 * @generated
 */
public class RealtimestatechartparameterbindingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RealtimestatechartparameterbindingValidator INSTANCE = new RealtimestatechartparameterbindingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding";

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
	public RealtimestatechartparameterbindingValidator() {
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
	  return RealtimestatechartparameterbindingPackage.eINSTANCE;
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
			case RealtimestatechartparameterbindingPackage.API_CALL_PARAMETER_BINDING:
				return validateAPICallParameterBinding((APICallParameterBinding)value, diagnostics, context);
			case RealtimestatechartparameterbindingPackage.TIME_PARAMETER_BINDING:
				return validateTimeParameterBinding((TimeParameterBinding)value, diagnostics, context);
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING:
				return validateRealtimeStatechartParameterBinding((RealtimeStatechartParameterBinding)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPICallParameterBinding(APICallParameterBinding apiCallParameterBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apiCallParameterBinding, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apiCallParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apiCallParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apiCallParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apiCallParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apiCallParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apiCallParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apiCallParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apiCallParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPICallParameterBinding_onlyCallParameterAllowed(apiCallParameterBinding, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onlyCallParameterAllowed constraint of '<em>API Call Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPICallParameterBinding_onlyCallParameterAllowed(APICallParameterBinding apiCallParameterBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "onlyCallParameterAllowed", getObjectLabel(apiCallParameterBinding, context) },
						 new Object[] { apiCallParameterBinding },
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
	public boolean validateTimeParameterBinding(TimeParameterBinding timeParameterBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeParameterBinding, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeParameterBinding_onlyTimeParameterAllowed(timeParameterBinding, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onlyTimeParameterAllowed constraint of '<em>Time Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeParameterBinding_onlyTimeParameterAllowed(TimeParameterBinding timeParameterBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "onlyTimeParameterAllowed", getObjectLabel(timeParameterBinding, context) },
						 new Object[] { timeParameterBinding },
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
	public boolean validateRealtimeStatechartParameterBinding(RealtimeStatechartParameterBinding realtimeStatechartParameterBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realtimeStatechartParameterBinding, diagnostics, context);
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

} //RealtimestatechartparameterbindingValidator
