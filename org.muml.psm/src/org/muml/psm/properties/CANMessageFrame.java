/**
 */
package org.muml.psm.properties;

import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAN Message Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a CAN message frame.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.properties.CANMessageFrame#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.muml.psm.properties.CANMessageFrame#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.properties.PropertiesPackage#getCANMessageFrame()
 * @model
 * @generated
 */
public interface CANMessageFrame extends MessageFrame {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(NaturalNumber)
	 * @see org.muml.psm.properties.PropertiesPackage#getCANMessageFrame_Priority()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getPriority();

	/**
	 * Sets the value of the '{@link org.muml.psm.properties.CANMessageFrame#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(NaturalNumber value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' containment reference.
	 * @see #setDeadline(TimeValue)
	 * @see org.muml.psm.properties.PropertiesPackage#getCANMessageFrame_Deadline()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getDeadline();

	/**
	 * Sets the value of the '{@link org.muml.psm.properties.CANMessageFrame#getDeadline <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' containment reference.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(TimeValue value);

} // CANMessageFrame
