/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import org.storydriven.core.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Port Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePortEntry#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePortEntry()
 * @model
 * @generated
 */
public interface ReconfigurationMessagePortEntry extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Reconfiguration Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Message Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Message Type</em>' reference.
	 * @see #setReconfigurationMessageType(ReconfigurationMessageType)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePortEntry_ReconfigurationMessageType()
	 * @model required="true"
	 * @generated
	 */
	ReconfigurationMessageType getReconfigurationMessageType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePortEntry#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Message Type</em>' reference.
	 * @see #getReconfigurationMessageType()
	 * @generated
	 */
	void setReconfigurationMessageType(ReconfigurationMessageType value);

} // ReconfigurationMessagePortEntry
