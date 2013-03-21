/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import de.uni_paderborn.fujaba.muml.msgtype.MessageType;

import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Interface Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getDescription <em>Description</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getMessageType <em>Message Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationPortInterfaceEntry()
 * @model
 * @generated
 */
public interface ReconfigurationPortInterfaceEntry extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationPortInterfaceEntry_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' reference.
	 * @see #setMessageType(MessageType)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationPortInterfaceEntry_MessageType()
	 * @model required="true"
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPortInterfaceEntry#getMessageType <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' reference.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

} // ReconfigurationPortInterfaceEntry
