/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.msgiface;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface#getInherits <em>Inherits</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage#getMessageInterface()
 * @model
 * @generated
 */
public interface MessageInterface extends EClass {

	/**
	 * Returns the value of the '<em><b>Inherits</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage#getMessageInterface_Inherits()
	 * @model
	 * @generated
	 */
	EList<MessageInterface> getInherits();
} // MessageInterface
