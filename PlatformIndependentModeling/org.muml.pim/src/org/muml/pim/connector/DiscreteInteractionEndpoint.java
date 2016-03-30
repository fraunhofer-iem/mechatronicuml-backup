/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector;

import org.eclipse.emf.common.util.EList;
import org.muml.core.NamedElement;
import org.muml.pim.behavior.Behavior;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.valuetype.Cardinality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Interaction Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction point for discrete communication via asynchronous messages. This class generalizes concepts of classes DiscretePort and Role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getCoordinatorBehavior <em>Coordinator Behavior</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getSubroleBehavior <em>Subrole Behavior</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 *   <li>{@link org.muml.pim.connector.DiscreteInteractionEndpoint#isMulti <em>Multi</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteInteractionEndpoint()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ReceivingInteractionEndpointRequiresMessageBuffer ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer SetEitherSubRoleAndCoordinatorBehaviorOrNone'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ReceivingInteractionEndpointRequiresMessageBuffer='-- All receiver message types must be assigned to one receiver message buffer.\r\nself.receiverMessageTypes->notEmpty() \r\nimplies \r\nself.receiverMessageBuffer->notEmpty()' ReceiverMessageTypeMustBeAssignedToExactlyOneBuffer='-- Each receiver message type should be assigned to exactly one buffer.\r\nself.receiverMessageTypes->forAll(type | self.receiverMessageBuffer->one(messageType->includes(type)))' SetEitherSubRoleAndCoordinatorBehaviorOrNone='-- Set either the subroleBehavior and the coordinatorBehavior or none of them.\r\n(not self.coordinatorBehavior.oclIsUndefined() and not  self.subroleBehavior.oclIsUndefined()) xor (self.coordinatorBehavior.oclIsUndefined() and self.subroleBehavior.oclIsUndefined())'"
 * @generated
 */
public interface DiscreteInteractionEndpoint extends ConnectorEndpoint, BehavioralElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Sender Message Types</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sender message interface defines which messages this discrete port specification sends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Message Types</em>' reference list.
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteInteractionEndpoint_SenderMessageTypes()
	 * @model
	 * @generated
	 */
	EList<MessageType> getSenderMessageTypes();

	/**
	 * Returns the value of the '<em><b>Receiver Message Types</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The receiver message interface defines which messages this discrete port specification receives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Types</em>' reference list.
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteInteractionEndpoint_ReceiverMessageTypes()
	 * @model
	 * @generated
	 */
	EList<MessageType> getReceiverMessageTypes();

	/**
	 * Returns the value of the '<em><b>Coordinator Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this port is a multi-port, this reference points to the real-time statechart that
	 * contains the adaptation behavior of the multi-port.  Then, this real-time statechart 
	 * is contained in the only state of the real-time statechart obtained by the
	 * behavior reference.
	 * If this port is a single-port, this reference will be undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinator Behavior</em>' reference.
	 * @see #setCoordinatorBehavior(Behavior)
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteInteractionEndpoint_CoordinatorBehavior()
	 * @model annotation="http://www.muml.org/emf/OCLFilter filter='if(self.behavior.oclIsTypeOf(realtimestatechart::RealtimeStatechart)) then self.behavior.oclAsType(realtimestatechart::RealtimeStatechart)->closure(rtsc| rtsc.states->select(s: realtimestatechart::State|  not s.simple).embeddedRegions.embeddedStatechart ) else behavior::Behavior.allInstances() endif'"
	 * @generated
	 */
	Behavior getCoordinatorBehavior();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getCoordinatorBehavior <em>Coordinator Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinator Behavior</em>' reference.
	 * @see #getCoordinatorBehavior()
	 * @generated
	 */
	void setCoordinatorBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Subrole Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this port is a multi-port, this reference points to the real-time statechart that
	 * contains the subrole behavior of the multi-port.  Then, this real-time statechart 
	 * is contained in the only state of the real-time statechart obtained by the
	 * behavior reference.
	 * If this port is a single-port, this reference will be undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subrole Behavior</em>' reference.
	 * @see #setSubroleBehavior(Behavior)
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteInteractionEndpoint_SubroleBehavior()
	 * @model annotation="http://www.muml.org/emf/OCLFilter filter='if(self.behavior.oclIsTypeOf(realtimestatechart::RealtimeStatechart)) then self.behavior.oclAsType(realtimestatechart::RealtimeStatechart)->closure(rtsc| rtsc.states->select(s: realtimestatechart::State|  not s.simple).embeddedRegions.embeddedStatechart ) else behavior::Behavior.allInstances() endif'"
	 * @generated
	 */
	Behavior getSubroleBehavior();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getSubroleBehavior <em>Subrole Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subrole Behavior</em>' reference.
	 * @see #getSubroleBehavior()
	 * @generated
	 */
	void setSubroleBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cardinality of a port specifies how many instances of a port are allowed to exist at runtime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteInteractionEndpoint_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Receiver Message Buffer</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.connector.MessageBuffer}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.connector.MessageBuffer#getDiscreteInteractionEndpoint <em>Discrete Interaction Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A role contains message buffers to store received messages. If this role can only send messages then no message buffer is allowed; otherwise at least one message buffer must be defined. The maximal number of message buffers is limited to the number of message this role may receive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Message Buffer</em>' containment reference list.
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteInteractionEndpoint_ReceiverMessageBuffer()
	 * @see org.muml.pim.connector.MessageBuffer#getDiscreteInteractionEndpoint
	 * @model opposite="discreteInteractionEndpoint" containment="true"
	 * @generated
	 */
	EList<MessageBuffer> getReceiverMessageBuffer();

	/**
	 * Returns the value of the '<em><b>Multi</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the discrete interaction endpoint has a maximum cardinality greater than one .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi</em>' attribute.
	 * @see org.muml.pim.connector.ConnectorPackage#getDiscreteInteractionEndpoint_Multi()
	 * @model default="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not (self.cardinality.oclIsUndefined()) then\r\n\t(self.cardinality.upperBound.value > 1) or self.cardinality.upperBound.infinity\r\nelse\r\n\tfalse\r\nendif\r\n\r\n'"
	 * @generated
	 */
	boolean isMulti();

} // DiscreteInteractionEndpoint
