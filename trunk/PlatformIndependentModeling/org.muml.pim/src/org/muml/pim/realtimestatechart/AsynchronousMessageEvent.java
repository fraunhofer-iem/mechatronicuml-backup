/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asynchronous Message Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AsynchronousMessageEvent is a TransitionEvent that corresponds to 
 * receiving or sending a message. They are used to model asynchronous 
 * communication between realtime statecharts. A trigger events specifies
 * that the corresponding message has to be received for the transition to be
 * enabled, a raised event specifies that the corresponding message will be 
 * sent upon execution of the transition. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.AsynchronousMessageEvent#getMessage <em>Message</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.AsynchronousMessageEvent#getOneToManyCommunicationSchema <em>One To Many Communication Schema</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getAsynchronousMessageEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL RaiseMessageEventImpliesParameterBinding='-- A raise message event must bind a value to every parameter\r\nlet messageType : msgtype::MessageType = self.message.instanceOf in\r\n(self.kind=EventKind::RAISE and not self.message.oclIsUndefined()) implies ( not messageType.oclIsUndefined() implies (messageType.parameters->asBag() = message.parameterBinding.parameter->asBag()))\r\n-- author: adann' RaiseMessageEventImpliesSendingCommunicationSchema='-- When using One-To-Many Communication Schemata, a RaiseMessageEvent may only use sending One-To-Many Communication Schemata.\r\nif (self.oneToManyCommunicationSchema->isEmpty()) then \r\n\ttrue \r\nelse\r\n\tself.kind =EventKind::RAISE implies (self.oneToManyCommunicationSchema.oclIsKindOf(one_to_n_schemata::SendingOneToManyCommunicationSchema))\r\nendif' TriggerMessageEventImpliesReceivingCommunicationSchema='-- When using One-To-Many Communication Schemata, a TiggerMessageEvent may only use receiving One-To-Many Communication Schemata.\r\nif (self.oneToManyCommunicationSchema->isEmpty()) then \r\n\ttrue \r\nelse\r\n\tself.kind =EventKind::TRIGGER implies (self.oneToManyCommunicationSchema.oclIsKindOf(one_to_n_schemata::ReceivingOneToManyCommunicationSchema))\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RaiseMessageEventImpliesParameterBinding RaiseMessageEventImpliesSendingCommunicationSchema TriggerMessageEventImpliesReceivingCommunicationSchema'"
 * @generated
 */
public interface AsynchronousMessageEvent extends TransitionEvent {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message associated with this event. The message is either requested to be
	 * received (trigger event) or it will be sent (raise event).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Message)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getAsynchronousMessageEvent_Message()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.AsynchronousMessageEvent#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>One To Many Communication Schema</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An asynchronous message event must have a one-to-many communication schema if the statechart defines the behavior of a multi role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>One To Many Communication Schema</em>' containment reference.
	 * @see #setOneToManyCommunicationSchema(OneToManyCommunicationSchema)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getAsynchronousMessageEvent_OneToManyCommunicationSchema()
	 * @see org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema#getAsynchronousMessageEvent
	 * @model opposite="asynchronousMessageEvent" containment="true"
	 * @generated
	 */
	OneToManyCommunicationSchema getOneToManyCommunicationSchema();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.AsynchronousMessageEvent#getOneToManyCommunicationSchema <em>One To Many Communication Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One To Many Communication Schema</em>' containment reference.
	 * @see #getOneToManyCommunicationSchema()
	 * @generated
	 */
	void setOneToManyCommunicationSchema(OneToManyCommunicationSchema value);

} // AsynchronousMessageEvent
