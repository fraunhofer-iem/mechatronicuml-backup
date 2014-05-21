/**
 */
package de.uni_paderborn.fujaba.muml.connector;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.msgtype.MessageType;
import de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.MessageBuffer#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.MessageBuffer#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.MessageBuffer#getDiscreteInteractionEndpoint <em>Discrete Interaction Endpoint</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.MessageBuffer#getBufferOverflowAvoidanceStrategy <em>Buffer Overflow Avoidance Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getMessageBuffer()
 * @model
 * @generated
 */
public interface MessageBuffer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the message buffer. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Size</em>' containment reference.
	 * @see #setBufferSize(NaturalNumber)
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getMessageBuffer_BufferSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getBufferSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.connector.MessageBuffer#getBufferSize <em>Buffer Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' containment reference.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message types this message buffer can store.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Type</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getMessageBuffer_MessageType()
	 * @model required="true"
	 * @generated
	 */
	EList<MessageType> getMessageType();

	/**
	 * Returns the value of the '<em><b>Discrete Interaction Endpoint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role that contains this message buffer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Discrete Interaction Endpoint</em>' container reference.
	 * @see #setDiscreteInteractionEndpoint(DiscreteInteractionEndpoint)
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getMessageBuffer_DiscreteInteractionEndpoint()
	 * @see de.uni_paderborn.fujaba.muml.connector.DiscreteInteractionEndpoint#getReceiverMessageBuffer
	 * @model opposite="receiverMessageBuffer" required="true" transient="false"
	 * @generated
	 */
	DiscreteInteractionEndpoint getDiscreteInteractionEndpoint();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.connector.MessageBuffer#getDiscreteInteractionEndpoint <em>Discrete Interaction Endpoint</em>}' container reference.
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
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.connector.BufferOverflowAvoidanceStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Overflow Avoidance Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Overflow Avoidance Strategy</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.connector.BufferOverflowAvoidanceStrategy
	 * @see #setBufferOverflowAvoidanceStrategy(BufferOverflowAvoidanceStrategy)
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getMessageBuffer_BufferOverflowAvoidanceStrategy()
	 * @model default="discard incoming message" required="true"
	 * @generated
	 */
	BufferOverflowAvoidanceStrategy getBufferOverflowAvoidanceStrategy();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.connector.MessageBuffer#getBufferOverflowAvoidanceStrategy <em>Buffer Overflow Avoidance Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Overflow Avoidance Strategy</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.connector.BufferOverflowAvoidanceStrategy
	 * @see #getBufferOverflowAvoidanceStrategy()
	 * @generated
	 */
	void setBufferOverflowAvoidanceStrategy(BufferOverflowAvoidanceStrategy value);

} // MessageBuffer
