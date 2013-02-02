/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.msgtype;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MessageTypeRepository is used to declare message types which are then used
 * in MessageInterfaces.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.msgtype.MessageTypeRepository#getMessageTypes <em>Message Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage#getMessageTypeRepository()
 * @model
 * @generated
 */
public interface MessageTypeRepository extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Message Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.msgtype.MessageType}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.msgtype.MessageType#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Types</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage#getMessageTypeRepository_MessageTypes()
	 * @see de.uni_paderborn.fujaba.muml.msgtype.MessageType#getRepository
	 * @model opposite="repository" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<MessageType> getMessageTypes();

} // MessageTypeRepository
