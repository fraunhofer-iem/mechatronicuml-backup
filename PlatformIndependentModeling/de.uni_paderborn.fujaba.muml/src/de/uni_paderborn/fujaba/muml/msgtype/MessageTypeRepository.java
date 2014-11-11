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
 * A MessageTypeRepository contains a set of message types which are then used
 * by discrete interaction endpoints and their behavior specifications. Message type
 * repositories enable to group message types logically, but have no semantics for
 * the MechatronicUML model.
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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneMessageType='self.messageTypes->notEmpty()'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneMessageType'"
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
	 * <!-- begin-model-doc -->
	 * The message types that are contained in this message type repository.
	 *  The lower bound should semantically be 1, but is 0 because of the containment reference CoordinationProtocol.gmfMessageTypes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Types</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage#getMessageTypeRepository_MessageTypes()
	 * @see de.uni_paderborn.fujaba.muml.msgtype.MessageType#getRepository
	 * @model opposite="repository" containment="true" ordered="false"
	 * @generated
	 */
	EList<MessageType> getMessageTypes();

} // MessageTypeRepository
