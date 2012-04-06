/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.msgiface;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a message interface. A message interface specifies which messages are allowed to be sent or received by a port or role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface#getMessageTypes <em>Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface#getAllAvailableMessageTypes <em>All Available Message Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage#getMessageInterface()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoCyclicGeneralization='not self->closure(superType)->includes(self)' UniqueMessageTypeNames='self.messageTypes->isUnique(name)' NoMessageTypeOrNotAtLeastTwoGeneralizations='self.messageTypes->size()>=1 or self.superType->size()>=2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoCyclicGeneralization UniqueMessageTypeNames NoMessageTypeOrNotAtLeastTwoGeneralizations'"
 * @generated
 */
public interface MessageInterface extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of message interfaces this message interface inherits from. This message
	 * interface contains all message types that are defined by the super types and their
	 * super types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Type</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage#getMessageInterface_SuperType()
	 * @model
	 * @generated
	 */
	EList<MessageInterface> getSuperType();

	/**
	 * Returns the value of the '<em><b>Message Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageType}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageType#getMessageInterface <em>Message Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message types being defined in this message interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Types</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage#getMessageInterface_MessageTypes()
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.MessageType#getMessageInterface
	 * @model opposite="messageInterface" containment="true"
	 * @generated
	 */
	EList<MessageType> getMessageTypes();

	/**
	 * Returns the value of the '<em><b>All Available Message Types</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.msgiface.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Available Message Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Available Message Types</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage#getMessageInterface_AllAvailableMessageTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self -> closure(if superType -> isEmpty() then self->asSet() else superType endif).messageTypes -> asSet()'"
	 * @generated
	 */
	EList<MessageType> getAllAvailableMessageTypes();

} // MessageInterface
