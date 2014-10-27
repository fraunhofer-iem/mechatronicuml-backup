/**
 */
package de.uni_paderborn.fujaba.muml.pattern.model.pattern.util;

import de.uni_paderborn.fujaba.muml.pattern.model.pattern.*;

import de.uni_paderborn.fujaba.muml.protocol.util.ProtocolValidator;

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
 * @see de.uni_paderborn.fujaba.muml.pattern.model.pattern.PatternPackage
 * @generated
 */
public class PatternValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PatternValidator INSTANCE = new PatternValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.pattern.model.pattern";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolValidator protocolValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternValidator() {
		super();
		protocolValidator = ProtocolValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PatternPackage.eINSTANCE;
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
			case PatternPackage.ADAPTED_FROM_COORDINATION_PATTERN:
				return validateAdaptedFromCoordinationPattern((AdaptedFromCoordinationPattern)value, diagnostics, context);
			case PatternPackage.COORDINATION_PATTERN:
				return validateCoordinationPattern((CoordinationPattern)value, diagnostics, context);
			case PatternPackage.PLAIN_TEXTUAL_DESCRIPTION_ASPECTS:
				return validatePlainTextualDescriptionAspects((PlainTextualDescriptionAspects)value, diagnostics, context);
			case PatternPackage.LEGAL_CONFIGURATION:
				return validateLegalConfiguration((LegalConfiguration)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdaptedFromCoordinationPattern(AdaptedFromCoordinationPattern adaptedFromCoordinationPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adaptedFromCoordinationPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationPattern(CoordinationPattern coordinationPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coordinationPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= protocolValidator.validateAbstractCoordinationSpecification_UniqueRoleNames(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= protocolValidator.validateAbstractCoordinationSpecification_RoleMessageTypesMustBeCompatible(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= protocolValidator.validateAbstractCoordinationSpecification_SingleRoleImpliesMultiRole(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinationPattern_UniquePatternNames(coordinationPattern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniquePatternNames constraint of '<em>Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationPattern_UniquePatternNames(CoordinationPattern coordinationPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "UniquePatternNames", getObjectLabel(coordinationPattern, context) },
						 new Object[] { coordinationPattern },
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
	public boolean validatePlainTextualDescriptionAspects(PlainTextualDescriptionAspects plainTextualDescriptionAspects, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plainTextualDescriptionAspects, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegalConfiguration(LegalConfiguration legalConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legalConfiguration, diagnostics, context);
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

} //PatternValidator
