/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;

import org.eclipse.emf.common.util.EList;
import org.muml.core.ExtendableElement;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.msgtype.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The messages are exchanged between components in order to communicate
 * asynchronously. A message is typed over a message type and provides a 
 * binding of all parameters defined by the message type to concrete values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.Message#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.Message#getParameterBinding <em>Parameter Binding</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the message type this message is typed over.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(MessageType)
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getMessage_InstanceOf()
	 * @model required="true"
	 *        annotation="http://www.muml.org/emf/OCLFilter filter='msgtype::MessageType::allInstances()-&gt;select(x |\r\nif( self.oclAsType(ecore::EObject).eContainer().oclIsTypeOf(realtimestatechart::AsynchronousMessageEvent)  and self.oclAsType(ecore::EObject).eContainer().eContainer().oclIsTypeOf(realtimestatechart::Transition)) then \r\n\tlet messageEvent : realtimestatechart::AsynchronousMessageEvent = self.oclAsType(ecore::EObject).eContainer().oclAsType(realtimestatechart::AsynchronousMessageEvent)  in \r\n\tlet transition : realtimestatechart::Transition = messageEvent.oclAsType(ecore::EObject).eContainer().oclAsType(realtimestatechart::Transition) in \r\n\t\r\n\tif(messageEvent.kind = realtimestatechart::EventKind::TRIGGER) then\r\n\t\ttransition.receiverMessageTypes-&gt;includes(x)\r\n\telse\r\n\t\ttransition.senderMessageTypes-&gt;includes(x)\r\n\tendif\r\nelse\r\n\ttrue\r\nendif\r\n\r\n\r\n)'"
	 * @generated
	 */
	MessageType getInstanceOf();

	/**
	 * Sets the value of the '{@link org.muml.pim.realtimestatechart.Message#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(MessageType value);

	/**
	 * Returns the value of the '<em><b>Parameter Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of parameter bindings for this message. All parameters of the message type must be bound exactly once.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Binding</em>' containment reference list.
	 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getMessage_ParameterBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBinding();

} // Message
