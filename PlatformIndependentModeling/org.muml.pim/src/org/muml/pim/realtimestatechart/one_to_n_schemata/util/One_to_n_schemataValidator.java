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
package org.muml.pim.realtimestatechart.one_to_n_schemata.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.muml.pim.realtimestatechart.one_to_n_schemata.*;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Iterate;
import org.muml.pim.realtimestatechart.one_to_n_schemata.LoadBalancing;
import org.muml.pim.realtimestatechart.one_to_n_schemata.MultiReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Multicast;
import org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;
import org.muml.pim.realtimestatechart.one_to_n_schemata.ReceivingOneToManyCommunicationSchema;
import org.muml.pim.realtimestatechart.one_to_n_schemata.SendingOneToManyCommunicationSchema;
import org.muml.pim.realtimestatechart.one_to_n_schemata.SingleReceive;
import org.muml.pim.realtimestatechart.one_to_n_schemata.Unicast;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage
 * @generated
 */
public class One_to_n_schemataValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final One_to_n_schemataValidator INSTANCE = new One_to_n_schemataValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pim.realtimestatechart.one_to_n_schemata";

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
	public One_to_n_schemataValidator() {
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
	  return One_to_n_schemataPackage.eINSTANCE;
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
			case One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA:
				return validateOneToManyCommunicationSchema((OneToManyCommunicationSchema)value, diagnostics, context);
			case One_to_n_schemataPackage.MULTICAST:
				return validateMulticast((Multicast)value, diagnostics, context);
			case One_to_n_schemataPackage.UNICAST:
				return validateUnicast((Unicast)value, diagnostics, context);
			case One_to_n_schemataPackage.ITERATE:
				return validateIterate((Iterate)value, diagnostics, context);
			case One_to_n_schemataPackage.LOAD_BALANCING:
				return validateLoadBalancing((LoadBalancing)value, diagnostics, context);
			case One_to_n_schemataPackage.SINGLE_RECEIVE:
				return validateSingleReceive((SingleReceive)value, diagnostics, context);
			case One_to_n_schemataPackage.MULTI_RECEIVE:
				return validateMultiReceive((MultiReceive)value, diagnostics, context);
			case One_to_n_schemataPackage.RECEIVING_ONE_TO_MANY_COMMUNICATION_SCHEMA:
				return validateReceivingOneToManyCommunicationSchema((ReceivingOneToManyCommunicationSchema)value, diagnostics, context);
			case One_to_n_schemataPackage.SENDING_ONE_TO_MANY_COMMUNICATION_SCHEMA:
				return validateSendingOneToManyCommunicationSchema((SendingOneToManyCommunicationSchema)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneToManyCommunicationSchema(OneToManyCommunicationSchema oneToManyCommunicationSchema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oneToManyCommunicationSchema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMulticast(Multicast multicast, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multicast, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnicast(Unicast unicast, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unicast, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIterate(Iterate iterate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iterate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancing(LoadBalancing loadBalancing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loadBalancing, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadBalancing_LoadbalancingEitherHasResponseMessageOrWcet(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadBalancing_ResponseMessageOrWcetOfCommunicationSchemaLoadbalancingMustBeSet(loadBalancing, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoadBalancing_ResponseActionCanOnlyBeSetIfResponseMessageIsUsed(loadBalancing, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LoadbalancingEitherHasResponseMessageOrWcet constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOAD_BALANCING__LOADBALANCING_EITHER_HAS_RESPONSE_MESSAGE_OR_WCET__EEXPRESSION = "-- responseMessage and maxWorkingTime exclude each other\r\n" +
		"if not self.responseMessage.oclIsUndefined() and not self.maxWorkingTime.oclIsUndefined() then\r\n" +
		"\tfalse\r\n" +
		"else\r\n" +
		"\ttrue\r\n" +
		"endif";

	/**
	 * Validates the LoadbalancingEitherHasResponseMessageOrWcet constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancing_LoadbalancingEitherHasResponseMessageOrWcet(LoadBalancing loadBalancing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(One_to_n_schemataPackage.Literals.LOAD_BALANCING,
				 loadBalancing,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "LoadbalancingEitherHasResponseMessageOrWcet",
				 LOAD_BALANCING__LOADBALANCING_EITHER_HAS_RESPONSE_MESSAGE_OR_WCET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ResponseMessageOrWcetOfCommunicationSchemaLoadbalancingMustBeSet constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOAD_BALANCING__RESPONSE_MESSAGE_OR_WCET_OF_COMMUNICATION_SCHEMA_LOADBALANCING_MUST_BE_SET__EEXPRESSION = "-- LoadBalancing must define the responseMessage or the maxWorkingTime\r\n" +
		"not self.responseMessage.oclIsUndefined() or not self.maxWorkingTime.oclIsUndefined()";

	/**
	 * Validates the ResponseMessageOrWcetOfCommunicationSchemaLoadbalancingMustBeSet constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancing_ResponseMessageOrWcetOfCommunicationSchemaLoadbalancingMustBeSet(LoadBalancing loadBalancing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(One_to_n_schemataPackage.Literals.LOAD_BALANCING,
				 loadBalancing,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ResponseMessageOrWcetOfCommunicationSchemaLoadbalancingMustBeSet",
				 LOAD_BALANCING__RESPONSE_MESSAGE_OR_WCET_OF_COMMUNICATION_SCHEMA_LOADBALANCING_MUST_BE_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ResponseActionCanOnlyBeSetIfResponseMessageIsUsed constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOAD_BALANCING__RESPONSE_ACTION_CAN_ONLY_BE_SET_IF_RESPONSE_MESSAGE_IS_USED__EEXPRESSION = "-- if onResponseAction is set, the responseMessage must be set, too.\r\n" +
		"(not onResponseAction.oclIsUndefined()) implies (not responseMessage.oclIsUndefined())";

	/**
	 * Validates the ResponseActionCanOnlyBeSetIfResponseMessageIsUsed constraint of '<em>Load Balancing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadBalancing_ResponseActionCanOnlyBeSetIfResponseMessageIsUsed(LoadBalancing loadBalancing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(One_to_n_schemataPackage.Literals.LOAD_BALANCING,
				 loadBalancing,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ResponseActionCanOnlyBeSetIfResponseMessageIsUsed",
				 LOAD_BALANCING__RESPONSE_ACTION_CAN_ONLY_BE_SET_IF_RESPONSE_MESSAGE_IS_USED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleReceive(SingleReceive singleReceive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleReceive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiReceive(MultiReceive multiReceive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiReceive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceivingOneToManyCommunicationSchema(ReceivingOneToManyCommunicationSchema receivingOneToManyCommunicationSchema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(receivingOneToManyCommunicationSchema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendingOneToManyCommunicationSchema(SendingOneToManyCommunicationSchema sendingOneToManyCommunicationSchema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendingOneToManyCommunicationSchema, diagnostics, context);
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

} //One_to_n_schemataValidator
