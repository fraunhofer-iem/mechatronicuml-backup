/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.msgiface;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.NamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface#getMessageTypes <em>Message Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage#getMessageInterface()
 * @model
 * @generated
 */
public interface MessageInterface extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage#getMessageInterface_SuperType()
	 * @model
	 * @generated
	 */
	EList<MessageInterface> getSuperType();

	/**
	 * Returns the value of the '<em><b>Message Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType#getMessageInterface <em>Message Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Types</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage#getMessageInterface_MessageTypes()
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType#getMessageInterface
	 * @model opposite="messageInterface" containment="true"
	 * @generated
	 */
	EList<MessageType> getMessageTypes();
} // MessageInterface
