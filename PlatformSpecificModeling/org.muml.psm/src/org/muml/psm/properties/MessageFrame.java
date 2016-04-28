/**
 */
package org.muml.psm.properties;

import org.muml.mumlcore.Extension;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pm.hardware.hwvaluetype.DataSize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a general message frame.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.properties.MessageFrame#getSize <em>Size</em>}</li>
 *   <li>{@link org.muml.psm.properties.MessageFrame#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.properties.PropertiesPackage#getMessageFrame()
 * @model
 * @generated
 */
public interface MessageFrame extends Extension {
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
	 * @see org.muml.psm.properties.PropertiesPackage#getMessageFrame_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSize getSize();

	/**
	 * Sets the value of the '{@link org.muml.psm.properties.MessageFrame#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(TimeValue)
	 * @see org.muml.psm.properties.PropertiesPackage#getMessageFrame_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getPeriod();

	/**
	 * Sets the value of the '{@link org.muml.psm.properties.MessageFrame#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(TimeValue value);

} // MessageFrame
