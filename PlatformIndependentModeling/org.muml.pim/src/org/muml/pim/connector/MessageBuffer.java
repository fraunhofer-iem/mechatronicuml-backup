/**
 */
package org.muml.pim.connector;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.valuetype.NaturalNumber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A message buffer may contains message types. A message buffer has a specified size and is associtated to a role of a coordination protocol. Message types are always stored in FIFO order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.connector.MessageBuffer#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.muml.pim.connector.MessageBuffer#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.muml.pim.connector.MessageBuffer#getDiscreteInteractionEndpoint <em>Discrete Interaction Endpoint</em>}</li>
 *   <li>{@link org.muml.pim.connector.MessageBuffer#getBufferOverflowAvoidanceStrategy <em>Buffer Overflow Avoidance Strategy</em>}</li>
 *   <li>{@link org.muml.pim.connector.MessageBuffer#getGmfMessageTypes <em>Gmf Message Types</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.connector.ConnectorPackage#getMessageBuffer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DiscreteInteractionEndpointMustBeSet'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL DiscreteInteractionEndpointMustBeSet='-- A MessageBuffer must  refer to a DiscreteInteractionEndpoint.\r\nnot self.discreteInteractionEndpoint.oclIsInvalid()'"
 * @generated
 */
public interface MessageBuffer extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the message buffer. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Size</em>' containment reference.
	 * @see #setBufferSize(NaturalNumber)
	 * @see org.muml.pim.connector.ConnectorPackage#getMessageBuffer_BufferSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getBufferSize();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.MessageBuffer#getBufferSize <em>Buffer Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' containment reference.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message types this message buffer can store.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Type</em>' reference list.
	 * @see org.muml.pim.connector.ConnectorPackage#getMessageBuffer_MessageType()
	 * @model required="true"
	 * @generated
	 */
	EList<MessageType> getMessageType();

	/**
	 * Returns the value of the '<em><b>Discrete Interaction Endpoint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.connector.DiscreteInteractionEndpoint#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role that contains this message buffer. The lower bound is 0, but semantically has to be 1. This is due to the derived containment feature CoordinationProtocol.gmfMessageBuffers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discrete Interaction Endpoint</em>' container reference.
	 * @see #setDiscreteInteractionEndpoint(DiscreteInteractionEndpoint)
	 * @see org.muml.pim.connector.ConnectorPackage#getMessageBuffer_DiscreteInteractionEndpoint()
	 * @see org.muml.pim.connector.DiscreteInteractionEndpoint#getReceiverMessageBuffer
	 * @model opposite="receiverMessageBuffer" transient="false"
	 * @generated
	 */
	DiscreteInteractionEndpoint getDiscreteInteractionEndpoint();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.MessageBuffer#getDiscreteInteractionEndpoint <em>Discrete Interaction Endpoint</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrete Interaction Endpoint</em>' container reference.
	 * @see #getDiscreteInteractionEndpoint()
	 * @generated
	 */
	void setDiscreteInteractionEndpoint(DiscreteInteractionEndpoint value);

	/**
	 * Returns the value of the '<em><b>Buffer Overflow Avoidance Strategy</b></em>' attribute.
	 * The default value is <code>"discard incoming message"</code>.
	 * The literals are from the enumeration {@link org.muml.pim.connector.BufferOverflowAvoidanceStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Overflow Avoidance Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the strategy to avoid a buffer overflow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Overflow Avoidance Strategy</em>' attribute.
	 * @see org.muml.pim.connector.BufferOverflowAvoidanceStrategy
	 * @see #setBufferOverflowAvoidanceStrategy(BufferOverflowAvoidanceStrategy)
	 * @see org.muml.pim.connector.ConnectorPackage#getMessageBuffer_BufferOverflowAvoidanceStrategy()
	 * @model default="discard incoming message" required="true"
	 * @generated
	 */
	BufferOverflowAvoidanceStrategy getBufferOverflowAvoidanceStrategy();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.MessageBuffer#getBufferOverflowAvoidanceStrategy <em>Buffer Overflow Avoidance Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Overflow Avoidance Strategy</em>' attribute.
	 * @see org.muml.pim.connector.BufferOverflowAvoidanceStrategy
	 * @see #getBufferOverflowAvoidanceStrategy()
	 * @generated
	 */
	void setBufferOverflowAvoidanceStrategy(BufferOverflowAvoidanceStrategy value);

	/**
	 * Returns the value of the '<em><b>Gmf Message Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message types this message buffer can store.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gmf Message Types</em>' containment reference list.
	 * @see org.muml.pim.connector.ConnectorPackage#getMessageBuffer_GmfMessageTypes()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.messageType'"
	 * @generated
	 */
	EList<MessageType> getGmfMessageTypes();

} // MessageBuffer
