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
package de.uni_paderborn.fujaba.muml.constraint.util;

import de.uni_paderborn.fujaba.muml.constraint.*;

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
 * @see de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage
 * @generated
 */
public class ConstraintValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConstraintValidator INSTANCE = new ConstraintValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.constraint";

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
	public ConstraintValidator() {
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
	  return ConstraintPackage.eINSTANCE;
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
			case ConstraintPackage.TEMPORAL_LOGIC_CONSTRAINT:
				return validateTemporalLogicConstraint((TemporalLogicConstraint)value, diagnostics, context);
			case ConstraintPackage.VERIFIABLE_ELEMENT:
				return validateVerifiableElement((VerifiableElement)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalLogicConstraint(TemporalLogicConstraint temporalLogicConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(temporalLogicConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(temporalLogicConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(temporalLogicConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(temporalLogicConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(temporalLogicConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(temporalLogicConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(temporalLogicConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(temporalLogicConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(temporalLogicConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemporalLogicConstraint_ReceivingInteractionEndpointRequiresMessageBuffer(temporalLogicConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemporalLogicConstraint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(temporalLogicConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ReceivingInteractionEndpointRequiresMessageBuffer constraint of '<em>Temporal Logic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEMPORAL_LOGIC_CONSTRAINT__RECEIVING_INTERACTION_ENDPOINT_REQUIRES_MESSAGE_BUFFER__EEXPRESSION = "-- Receiver message types need receiver message buffer\r\n" +
		"self.receiverMessageTypes->notEmpty() \r\n" +
		"implies \r\n" +
		"self.receiverMessageBuffer->notEmpty()";

	/**
	 * Validates the ReceivingInteractionEndpointRequiresMessageBuffer constraint of '<em>Temporal Logic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalLogicConstraint_ReceivingInteractionEndpointRequiresMessageBuffer(TemporalLogicConstraint temporalLogicConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConstraintPackage.Literals.TEMPORAL_LOGIC_CONSTRAINT,
				 temporalLogicConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ReceivingInteractionEndpointRequiresMessageBuffer",
				 TEMPORAL_LOGIC_CONSTRAINT__RECEIVING_INTERACTION_ENDPOINT_REQUIRES_MESSAGE_BUFFER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer constraint of '<em>Temporal Logic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEMPORAL_LOGIC_CONSTRAINT__RECEIVER_MESSAGE_TYPE_MUST_BE_ASSIGNED_TO_EXACTLY_ONE_BUFFER__EEXPRESSION = "-- Each receiver message type should be assigned to exactly one buffer\r\n" +
		"self.receiverMessageTypes->forAll(type | self.receiverMessageBuffer->one(messageType->includes(type)))";

	/**
	 * Validates the ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer constraint of '<em>Temporal Logic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalLogicConstraint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(TemporalLogicConstraint temporalLogicConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConstraintPackage.Literals.TEMPORAL_LOGIC_CONSTRAINT,
				 temporalLogicConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer",
				 TEMPORAL_LOGIC_CONSTRAINT__RECEIVER_MESSAGE_TYPE_MUST_BE_ASSIGNED_TO_EXACTLY_ONE_BUFFER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifiableElement(VerifiableElement verifiableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verifiableElement, diagnostics, context);
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

} //ConstraintValidator
