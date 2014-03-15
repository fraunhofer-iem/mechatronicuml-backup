/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.connector.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint;
import de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.DiscreteMultiInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.MessageBuffer;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage
 * @generated
 */
public class ConnectorValidator extends EObjectValidator {
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
	public static final String DIAGNOSTIC_SOURCE = "de.uni_paderborn.fujaba.muml.connector";

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
		return result;
	}

	/**
	 * The cached validation expression for the ReceivingInteractionEndpointRequiresMessageBuffer constraint of '<em>Discrete Interaction Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DISCRETE_INTERACTION_ENDPOINT__RECEIVING_INTERACTION_ENDPOINT_REQUIRES_MESSAGE_BUFFER__EEXPRESSION = "-- Receiver message types need receiver message buffer\r\n" +
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
	protected static final String DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPE_MUST_BE_ASSIGNED_TO_EXACTLY_ONE_BUFFER__EEXPRESSION = "-- Each receiver message type should be assigned to exactly one buffer\r\n" +
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
		return validate_EveryDefaultConstraint(discreteSingleInteractionEndpointInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance discreteMultiInteractionEndpointInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteMultiInteractionEndpointInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageBuffer(MessageBuffer messageBuffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageBuffer, diagnostics, context);
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
