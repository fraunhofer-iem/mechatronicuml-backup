/**
 */
package org.muml.pm.hardware.hwvaluetype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the data rate of a resource (i.e. the bandwidth of a bus).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.DataRate#getValue <em>Value</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.DataRate#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getDataRate()
 * @model
 * @generated
 */
public interface DataRate extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this DataRate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getDataRate_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwvaluetype.DataRate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pm.hardware.hwvaluetype.DataRateUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit of the value (i.e. b/s, Kb/s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.muml.pm.hardware.hwvaluetype.DataRateUnit
	 * @see #setUnit(DataRateUnit)
	 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getDataRate_Unit()
	 * @model
	 * @generated
	 */
	DataRateUnit getUnit();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwvaluetype.DataRate#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.muml.pm.hardware.hwvaluetype.DataRateUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DataRateUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts the entered data rate into a String with the appended unit.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Return value concatenated with unit\nStringBuffer sb = new StringBuffer();\nsb.append(String.valueOf(value));\n\tif (unit != null) {\n\t\tsb.append(\' \');\n\t\tsb.append(unit.toString());\n\t\t}\nreturn sb.toString();'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts the entered data rate in bytes per second.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='double inBpS=0;\n\t\tif(unit!=null){\n\t\tinBpS=value*Math.pow(2, unit.getValue());\t\n\t\t}\nreturn inBpS;'"
	 * @generated
	 */
	double getInBpS();

} // DataRate
