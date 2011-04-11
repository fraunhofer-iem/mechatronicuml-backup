/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.msgiface;

import org.storydriven.modeling.NamedElement;

import org.storydriven.modeling.calls.Callable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType#getMessageInterface <em>Message Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType extends Callable, NamedElement {
	/**
	 * Returns the value of the '<em><b>Message Interface</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface#getMessageTypes <em>Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Interface</em>' reference.
	 * @see #setMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage#getMessageType_MessageInterface()
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface#getMessageTypes
	 * @model opposite="messageTypes" required="true"
	 * @generated
	 */
	MessageInterface getMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType#getMessageInterface <em>Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Interface</em>' reference.
	 * @see #getMessageInterface()
	 * @generated
	 */
	void setMessageInterface(MessageInterface value);

} // MessageType
