/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.pattern.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.core.common.validator.MumlValidator;
import org.muml.pim.pattern.*;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.pattern.CoordinationPatternVariant;
import org.muml.pim.pattern.DescriptionAspects;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.pattern.VerifiedConfiguration;
import org.muml.pim.protocol.util.ProtocolValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.pattern.PatternPackage
 * @generated not
 */
public class PatternValidator extends MumlValidator {
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
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pim.pattern";

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
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN:
				return validateAbstractCoordinationPattern((AbstractCoordinationPattern)value, diagnostics, context);
			case PatternPackage.DESCRIPTION_ASPECTS:
				return validateDescriptionAspects((DescriptionAspects)value, diagnostics, context);
			case PatternPackage.VERIFIED_CONFIGURATION:
				return validateVerifiedConfiguration((VerifiedConfiguration)value, diagnostics, context);
			case PatternPackage.COORDINATION_PATTERN_VARIANT:
				return validateCoordinationPatternVariant((CoordinationPatternVariant)value, diagnostics, context);
			case PatternPackage.COORDINATION_PATTERN:
				return validateCoordinationPattern((CoordinationPattern)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCoordinationPattern(AbstractCoordinationPattern abstractCoordinationPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractCoordinationPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= protocolValidator.validateAbstractCoordinationSpecification_UniqueRoleNames(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= protocolValidator.validateAbstractCoordinationSpecification_RoleMessageTypesMustBeCompatible(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= protocolValidator.validateAbstractCoordinationSpecification_SingleRoleImpliesMultiRole(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractCoordinationPattern_UniquePatternNames(abstractCoordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractCoordinationPattern_PatternWithParametersNeedsVerifiedConfiguration(abstractCoordinationPattern, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniquePatternNames constraint of '<em>Abstract Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_COORDINATION_PATTERN__UNIQUE_PATTERN_NAMES__EEXPRESSION = "-- A name of a CoordinationPattern must be unique.\r\n" +
		"AbstractCoordinationPattern.allInstances()->isUnique(name)";

	/**
	 * Validates the UniquePatternNames constraint of '<em>Abstract Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCoordinationPattern_UniquePatternNames(AbstractCoordinationPattern abstractCoordinationPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ABSTRACT_COORDINATION_PATTERN,
				 abstractCoordinationPattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "UniquePatternNames",
				 ABSTRACT_COORDINATION_PATTERN__UNIQUE_PATTERN_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PatternWithParametersNeedsVerifiedConfiguration constraint of '<em>Abstract Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_COORDINATION_PATTERN__PATTERN_WITH_PARAMETERS_NEEDS_VERIFIED_CONFIGURATION__EEXPRESSION = "-- @warning\r\n" +
		"--When a CoordinationPattern defines Parameters, it is advised to define a verified configuration for these Parameters\r\n" +
		"self.patternParameters->size() > 0 implies self.verifiedConfigurations->size() > 0";

	/**
	 * Validates the PatternWithParametersNeedsVerifiedConfiguration constraint of '<em>Abstract Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCoordinationPattern_PatternWithParametersNeedsVerifiedConfiguration(AbstractCoordinationPattern abstractCoordinationPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.ABSTRACT_COORDINATION_PATTERN,
				 abstractCoordinationPattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "PatternWithParametersNeedsVerifiedConfiguration",
				 ABSTRACT_COORDINATION_PATTERN__PATTERN_WITH_PARAMETERS_NEEDS_VERIFIED_CONFIGURATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateAbstractCoordinationPattern_UniquePatternNames(coordinationPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractCoordinationPattern_PatternWithParametersNeedsVerifiedConfiguration(coordinationPattern, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionAspects(DescriptionAspects descriptionAspects, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionAspects, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifiedConfiguration(VerifiedConfiguration verifiedConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(verifiedConfiguration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(verifiedConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(verifiedConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(verifiedConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(verifiedConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(verifiedConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(verifiedConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(verifiedConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(verifiedConfiguration, diagnostics, context);
		if (result || diagnostics != null) result &= validateVerifiedConfiguration_ensureBindingForAllPatternParameters(verifiedConfiguration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ensureBindingForAllPatternParameters constraint of '<em>Verified Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERIFIED_CONFIGURATION__ENSURE_BINDING_FOR_ALL_PATTERN_PARAMETERS__EEXPRESSION = "-- A VerifiedConfiguration must bind every CoordinaionPattern parameter\r\n" +
		"self.coordinationPattern.oclAsSet()->select(object|object <> null).patternParameters->forAll(parameter| self.parameterBindings.parameter->includes(parameter))";

	/**
	 * Validates the ensureBindingForAllPatternParameters constraint of '<em>Verified Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifiedConfiguration_ensureBindingForAllPatternParameters(VerifiedConfiguration verifiedConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternPackage.Literals.VERIFIED_CONFIGURATION,
				 verifiedConfiguration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ensureBindingForAllPatternParameters",
				 VERIFIED_CONFIGURATION__ENSURE_BINDING_FOR_ALL_PATTERN_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationPatternVariant(CoordinationPatternVariant coordinationPatternVariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coordinationPatternVariant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= protocolValidator.validateAbstractCoordinationSpecification_UniqueRoleNames(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= protocolValidator.validateAbstractCoordinationSpecification_RoleMessageTypesMustBeCompatible(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= protocolValidator.validateAbstractCoordinationSpecification_SingleRoleImpliesMultiRole(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractCoordinationPattern_UniquePatternNames(coordinationPatternVariant, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractCoordinationPattern_PatternWithParametersNeedsVerifiedConfiguration(coordinationPatternVariant, diagnostics, context);
		return result;
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
