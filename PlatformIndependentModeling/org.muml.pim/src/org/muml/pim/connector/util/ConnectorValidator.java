/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.muml.core.common.validator.MumlValidator;
import org.muml.pim.connector.BufferOverflowAvoidanceStrategy;
import org.muml.pim.connector.Connector;
import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.connector.ConnectorInstance;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.DiscreteInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;
import org.muml.pim.connector.MessageBuffer;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.connector.ConnectorPackage
 * @generated not
 */
public class ConnectorValidator extends MumlValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ConnectorValidator INSTANCE = new ConnectorValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.muml.pim.connector";

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
	public ConnectorValidator() {
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
	  return ConnectorPackage.eINSTANCE;
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
			case ConnectorPackage.CONNECTOR_ENDPOINT:
				return validateConnectorEndpoint((ConnectorEndpoint)value, diagnostics, context);
			case ConnectorPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE:
				return validateConnectorEndpointInstance((ConnectorEndpointInstance)value, diagnostics, context);
			case ConnectorPackage.CONNECTOR_INSTANCE:
				return validateConnectorInstance((ConnectorInstance)value, diagnostics, context);
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT:
				return validateDiscreteInteractionEndpoint((DiscreteInteractionEndpoint)value, diagnostics, context);
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT_INSTANCE:
				return validateDiscreteInteractionEndpointInstance((DiscreteInteractionEndpointInstance)value, diagnostics, context);
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE:
				return validateDiscreteSingleInteractionEndpointInstance((DiscreteSingleInteractionEndpointInstance)value, diagnostics, context);
			case ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE:
				return validateDiscreteMultiInteractionEndpointInstance((DiscreteMultiInteractionEndpointInstance)value, diagnostics, context);
			case ConnectorPackage.MESSAGE_BUFFER:
				return validateMessageBuffer((MessageBuffer)value, diagnostics, context);
			case ConnectorPackage.BUFFER_OVERFLOW_AVOIDANCE_STRATEGY:
				return validateBufferOverflowAvoidanceStrategy((BufferOverflowAvoidanceStrategy)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEndpoint(ConnectorEndpoint connectorEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorEndpoint, diagnostics, context);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEndpointInstance(ConnectorEndpointInstance connectorEndpointInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorEndpointInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorInstance(ConnectorInstance connectorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteInteractionEndpoint(DiscreteInteractionEndpoint discreteInteractionEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteInteractionEndpoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteInteractionEndpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteInteractionEndpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteInteractionEndpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteInteractionEndpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteInteractionEndpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteInteractionEndpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteInteractionEndpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteInteractionEndpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteInteractionEndpoint_ReceivingInteractionEndpointRequiresMessageBuffer(discreteInteractionEndpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteInteractionEndpoint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(discreteInteractionEndpoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteInteractionEndpoint_SetEitherSubRoleAndCoordinatorBehaviorOrNone(discreteInteractionEndpoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ReceivingInteractionEndpointRequiresMessageBuffer constraint of '<em>Discrete Interaction Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_INTERACTION_ENDPOINT__RECEIVING_INTERACTION_ENDPOINT_REQUIRES_MESSAGE_BUFFER__EEXPRESSION = "-- All receiver message types must be assigned to one receiver message buffer.\r\n" +
		"self.receiverMessageTypes->notEmpty() \r\n" +
		"implies \r\n" +
		"self.receiverMessageBuffer->notEmpty()";

	/**
	 * Validates the ReceivingInteractionEndpointRequiresMessageBuffer constraint of '<em>Discrete Interaction Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteInteractionEndpoint_ReceivingInteractionEndpointRequiresMessageBuffer(DiscreteInteractionEndpoint discreteInteractionEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT,
				 discreteInteractionEndpoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ReceivingInteractionEndpointRequiresMessageBuffer",
				 DISCRETE_INTERACTION_ENDPOINT__RECEIVING_INTERACTION_ENDPOINT_REQUIRES_MESSAGE_BUFFER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer constraint of '<em>Discrete Interaction Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPE_MUST_BE_ASSIGNED_TO_EXACTLY_ONE_BUFFER__EEXPRESSION = "-- Each receiver message type should be assigned to exactly one buffer.\r\n" +
		"self.receiverMessageTypes->forAll(type | self.receiverMessageBuffer->one(messageType->includes(type)))";

	/**
	 * Validates the ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer constraint of '<em>Discrete Interaction Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteInteractionEndpoint_ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer(DiscreteInteractionEndpoint discreteInteractionEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT,
				 discreteInteractionEndpoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer",
				 DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPE_MUST_BE_ASSIGNED_TO_EXACTLY_ONE_BUFFER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SetEitherSubRoleAndCoordinatorBehaviorOrNone constraint of '<em>Discrete Interaction Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_INTERACTION_ENDPOINT__SET_EITHER_SUB_ROLE_AND_COORDINATOR_BEHAVIOR_OR_NONE__EEXPRESSION = "-- Set either the subroleBehavior and the coordinatorBehavior or none of them.\r\n" +
		"(not self.coordinatorBehavior.oclIsUndefined() and not  self.subroleBehavior.oclIsUndefined()) xor (self.coordinatorBehavior.oclIsUndefined() and self.subroleBehavior.oclIsUndefined())";

	/**
	 * Validates the SetEitherSubRoleAndCoordinatorBehaviorOrNone constraint of '<em>Discrete Interaction Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteInteractionEndpoint_SetEitherSubRoleAndCoordinatorBehaviorOrNone(DiscreteInteractionEndpoint discreteInteractionEndpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT,
				 discreteInteractionEndpoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "SetEitherSubRoleAndCoordinatorBehaviorOrNone",
				 DISCRETE_INTERACTION_ENDPOINT__SET_EITHER_SUB_ROLE_AND_COORDINATOR_BEHAVIOR_OR_NONE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteInteractionEndpointInstance(DiscreteInteractionEndpointInstance discreteInteractionEndpointInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteInteractionEndpointInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSingleInteractionEndpointInstance(DiscreteSingleInteractionEndpointInstance discreteSingleInteractionEndpointInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteSingleInteractionEndpointInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteSingleInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteSingleInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteSingleInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteSingleInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteSingleInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteSingleInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteSingleInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteSingleInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteSingleInteractionEndpointInstance_StandaloneSingleEndpointInstanceRequiresSingleEndpointType(discreteSingleInteractionEndpointInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the StandaloneSingleEndpointInstanceRequiresSingleEndpointType constraint of '<em>Discrete Single Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__STANDALONE_SINGLE_ENDPOINT_INSTANCE_REQUIRES_SINGLE_ENDPOINT_TYPE__EEXPRESSION = "-- For a DiscreteSingleInteractionEndpointInstance the type has to be a single DiscreteInteractionEndpoint, too.\n" +
		"(not self.type.oclIsUndefined() and self.multiInteractionEndpointInstance.oclIsUndefined() and self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint)) implies (not self.type.oclAsType(connector::DiscreteInteractionEndpoint).multi)\n" +
		"-- adann";

	/**
	 * Validates the StandaloneSingleEndpointInstanceRequiresSingleEndpointType constraint of '<em>Discrete Single Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteSingleInteractionEndpointInstance_StandaloneSingleEndpointInstanceRequiresSingleEndpointType(DiscreteSingleInteractionEndpointInstance discreteSingleInteractionEndpointInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConnectorPackage.Literals.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE,
				 discreteSingleInteractionEndpointInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "StandaloneSingleEndpointInstanceRequiresSingleEndpointType",
				 DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__STANDALONE_SINGLE_ENDPOINT_INSTANCE_REQUIRES_SINGLE_ENDPOINT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance discreteMultiInteractionEndpointInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discreteMultiInteractionEndpointInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discreteMultiInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discreteMultiInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discreteMultiInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discreteMultiInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discreteMultiInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discreteMultiInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discreteMultiInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discreteMultiInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteMultiInteractionEndpointInstance_TypeIsMultiDiscreteInteractionEndpoint(discreteMultiInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteMultiInteractionEndpointInstance_NumberOfsubEndpointsCorrespondsToLowerBound(discreteMultiInteractionEndpointInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiscreteMultiInteractionEndpointInstance_NumberOfsubEndpointsCorrespondsToUpperBound(discreteMultiInteractionEndpointInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the TypeIsMultiDiscreteInteractionEndpoint constraint of '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__TYPE_IS_MULTI_DISCRETE_INTERACTION_ENDPOINT__EEXPRESSION = "-- For a DiscreteMultiInteractionEndpointInstance the type has to be a multi DiscreteInteractionEndpoint, too.\n" +
		"(not self.type.oclIsUndefined() and self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint)) implies (self.type.oclAsType(connector::DiscreteInteractionEndpoint).multi)\n" +
		"-- adann";

	/**
	 * Validates the TypeIsMultiDiscreteInteractionEndpoint constraint of '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteMultiInteractionEndpointInstance_TypeIsMultiDiscreteInteractionEndpoint(DiscreteMultiInteractionEndpointInstance discreteMultiInteractionEndpointInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConnectorPackage.Literals.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE,
				 discreteMultiInteractionEndpointInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "TypeIsMultiDiscreteInteractionEndpoint",
				 DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__TYPE_IS_MULTI_DISCRETE_INTERACTION_ENDPOINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NumberOfsubEndpointsCorrespondsToLowerBound constraint of '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__NUMBER_OFSUB_ENDPOINTS_CORRESPONDS_TO_LOWER_BOUND__EEXPRESSION = "-- The number of subInteractionEndpointInstances is too low with respect to the cardinality\n" +
		"let discreteEndpoint : connector::DiscreteInteractionEndpoint= if (self.type.oclIsUndefined() or (not self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint))) then null else self.type.oclAsType(connector::DiscreteInteractionEndpoint) endif in\n" +
		"let lowerBoundOfsubInteractionEndpointInstance : Integer = if ( discreteEndpoint.oclIsUndefined() or discreteEndpoint.cardinality.lowerBound.infinity) then -1 else discreteEndpoint.cardinality.lowerBound.value endif in\n" +
		"if (lowerBoundOfsubInteractionEndpointInstance <>-1) then self.subInteractionEndpointInstances->size()>=lowerBoundOfsubInteractionEndpointInstance else true endif\n" +
		"-- adann ticket:937";

	/**
	 * Validates the NumberOfsubEndpointsCorrespondsToLowerBound constraint of '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteMultiInteractionEndpointInstance_NumberOfsubEndpointsCorrespondsToLowerBound(DiscreteMultiInteractionEndpointInstance discreteMultiInteractionEndpointInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConnectorPackage.Literals.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE,
				 discreteMultiInteractionEndpointInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NumberOfsubEndpointsCorrespondsToLowerBound",
				 DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__NUMBER_OFSUB_ENDPOINTS_CORRESPONDS_TO_LOWER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NumberOfsubEndpointsCorrespondsToUpperBound constraint of '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__NUMBER_OFSUB_ENDPOINTS_CORRESPONDS_TO_UPPER_BOUND__EEXPRESSION = "-- The number of subInteractionEndpointInstances is too high with respect to the cardinality\n" +
		"let discreteEndpoint : connector::DiscreteInteractionEndpoint= if (self.type.oclIsUndefined() or (not self.type.oclIsKindOf(connector::DiscreteInteractionEndpoint))) then null else self.type.oclAsType(connector::DiscreteInteractionEndpoint) endif in\n" +
		"let upperBoundOfsubInteractionEndpointInstance : Integer = if ( discreteEndpoint.oclIsUndefined() or discreteEndpoint.cardinality.upperBound.infinity) then -1 else discreteEndpoint.cardinality.upperBound.value endif in\n" +
		"if (upperBoundOfsubInteractionEndpointInstance <>-1) then self.subInteractionEndpointInstances->size()<=upperBoundOfsubInteractionEndpointInstance else true endif\n" +
		"-- adann  ticket:937";

	/**
	 * Validates the NumberOfsubEndpointsCorrespondsToUpperBound constraint of '<em>Discrete Multi Interaction Endpoint Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteMultiInteractionEndpointInstance_NumberOfsubEndpointsCorrespondsToUpperBound(DiscreteMultiInteractionEndpointInstance discreteMultiInteractionEndpointInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConnectorPackage.Literals.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE,
				 discreteMultiInteractionEndpointInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NumberOfsubEndpointsCorrespondsToUpperBound",
				 DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__NUMBER_OFSUB_ENDPOINTS_CORRESPONDS_TO_UPPER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageBuffer(MessageBuffer messageBuffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageBuffer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageBuffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageBuffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageBuffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageBuffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageBuffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageBuffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageBuffer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageBuffer, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageBuffer_DiscreteInteractionEndpointMustBeSet(messageBuffer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DiscreteInteractionEndpointMustBeSet constraint of '<em>Message Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT_MUST_BE_SET__EEXPRESSION = "-- A MessageBuffer must  refer to a DiscreteInteractionEndpoint.\r\n" +
		"not self.discreteInteractionEndpoint.oclIsInvalid()";

	/**
	 * Validates the DiscreteInteractionEndpointMustBeSet constraint of '<em>Message Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageBuffer_DiscreteInteractionEndpointMustBeSet(MessageBuffer messageBuffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ConnectorPackage.Literals.MESSAGE_BUFFER,
				 messageBuffer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "DiscreteInteractionEndpointMustBeSet",
				 MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT_MUST_BE_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBufferOverflowAvoidanceStrategy(BufferOverflowAvoidanceStrategy bufferOverflowAvoidanceStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //ConnectorValidator
