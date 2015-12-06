/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties;

import de.uni_paderborn.fujaba.muml.valuetype.NaturalNumber;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.CANMessageFrame#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getCANMessageFrame()
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
	 * @see de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage#getCANMessageFrame_Priority()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NaturalNumber getPriority();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.properties.CANMessageFrame#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(NaturalNumber value);

} // CANMessageFrame
