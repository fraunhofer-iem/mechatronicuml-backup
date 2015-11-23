/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.msgtype.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the scheduling properties of a CAN message (XXX: should we
 * rename the class to CANMessage?)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.Message#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.Message#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends Scheduling {
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
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getMessage_MessageType()
	 * @model
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.properties.Message#getMessageType <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' reference.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(DataSize)
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getMessage_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSize getSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.properties.Message#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(DataSize value);

} // Message
