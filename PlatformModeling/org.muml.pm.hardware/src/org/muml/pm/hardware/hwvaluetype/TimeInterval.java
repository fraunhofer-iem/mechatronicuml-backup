/**
 */
package org.muml.pm.hardware.hwvaluetype;

import java.util.concurrent.TimeUnit;

import org.muml.pim.valuetype.Range;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an interval to specify time bounds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.TimeInterval#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getTimeInterval()
 * @model
 * @generated
 */
public interface TimeInterval extends Range {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit for this TimeInterval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(TimeUnit)
	 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getTimeInterval_Unit()
	 * @model dataType="org.muml.pim.valuetype.TimeUnit" required="true"
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwvaluetype.TimeInterval#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

} // TimeInterval
