/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.muml.model.msgtype.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A message buffer may contains message types. A message buffer has a specified size and is associtated to a role of a coordination pattern. Message types are always stored in FIFO order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getMessageBuffer()
 * @model
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
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getMessageBuffer_BufferSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getBufferSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getBufferSize <em>Buffer Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' containment reference.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.msgtype.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message types this message buffer can store.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Type</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getMessageBuffer_MessageType()
	 * @model required="true"
	 * @generated
	 */
	EList<MessageType> getMessageType();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.pattern.Role#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role that contains this message buffer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' container reference.
	 * @see #setRole(Role)
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage#getMessageBuffer_Role()
	 * @see de.uni_paderborn.fujaba.muml.model.pattern.Role#getReceiverMessageBuffer
	 * @model opposite="receiverMessageBuffer" required="true" transient="false"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer#getRole <em>Role</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' container reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // MessageBuffer
