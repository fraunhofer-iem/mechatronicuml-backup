/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.msgiface;

import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.calls.Callable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A message type defines the signature of one event. That includes the name
 * of the event as well as the list of parameters. The message type inherits from
 * callable because concrete events in a real-time statechart must provide a 
 * parameter mapping for the parameters of the message type as it is defined for
 * method invocations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageType#getMessageInterface <em>Message Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage#getMessageType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueParameterNames='self.containedParameters->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParameterNames'"
 * @generated
 */
public interface MessageType extends Callable, NamedElement {
	/**
	 * Returns the value of the '<em><b>Message Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface#getMessageTypes <em>Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the message interface where this message type is defined in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Interface</em>' container reference.
	 * @see #setMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage#getMessageType_MessageInterface()
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface#getMessageTypes
	 * @model opposite="messageTypes" required="true" transient="false"
	 * @generated
	 */
	MessageInterface getMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageType#getMessageInterface <em>Message Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Interface</em>' container reference.
	 * @see #getMessageInterface()
	 * @generated
	 */
	void setMessageInterface(MessageInterface value);

} // MessageType
