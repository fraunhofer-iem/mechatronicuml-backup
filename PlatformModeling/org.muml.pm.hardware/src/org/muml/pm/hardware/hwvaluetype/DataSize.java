/**
 */
package org.muml.pm.hardware.hwvaluetype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the data size of an element or the size of a memory resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.DataSize#getValue <em>Value</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.DataSize#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getDataSize()
 * @model
 * @generated
 */
public interface DataSize extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this DataSize.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getDataSize_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwvaluetype.DataSize#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pm.hardware.hwvaluetype.DataSizeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit of the value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.muml.pm.hardware.hwvaluetype.DataSizeUnit
	 * @see #setUnit(DataSizeUnit)
	 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getDataSize_Unit()
	 * @model required="true"
	 * @generated
	 */
	DataSizeUnit getUnit();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwvaluetype.DataSize#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.muml.pm.hardware.hwvaluetype.DataSizeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DataSizeUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts the entered data size into a String with the appended unit.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Return value concatenated with unit\nStringBuffer sb = new StringBuffer();\nsb.append(String.valueOf(value));\n\tif (unit != null) {\n\t\tsb.append(\' \');\n\t\tsb.append(unit.toString());\n\t\t}\nreturn sb.toString();'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts the entered data size in Bytes.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='double inByte=0;\n\t\tif(unit!=null){\n\t\tinByte=value*Math.pow(2, unit.getValue());\t\n\t\t}\nreturn inByte;'"
	 * @generated
	 */
	double getInByte();

} // DataSize
