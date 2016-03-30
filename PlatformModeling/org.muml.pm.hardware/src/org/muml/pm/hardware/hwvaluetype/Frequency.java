/**
 */
package org.muml.pm.hardware.hwvaluetype;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the frequency of a computing resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.Frequency#getValue <em>Value</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.Frequency#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getFrequency()
 * @model
 * @generated
 */
public interface Frequency extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the frequency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getFrequency_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwvaluetype.Frequency#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pm.hardware.hwvaluetype.FrequencyUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit of this value (i.e. Hz, MHz,etc).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.muml.pm.hardware.hwvaluetype.FrequencyUnit
	 * @see #setUnit(FrequencyUnit)
	 * @see org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage#getFrequency_Unit()
	 * @model
	 * @generated
	 */
	FrequencyUnit getUnit();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwvaluetype.Frequency#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.muml.pm.hardware.hwvaluetype.FrequencyUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(FrequencyUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts the entered frequency into a String with the appended unit.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// Return value concatenated with unit\nStringBuffer sb = new StringBuffer();\nsb.append(String.valueOf(value));\n\tif (unit != null) {\n\t\tsb.append(\' \');\n\t\tsb.append(unit.toString());\n\t\t}\nreturn sb.toString();'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts the entered frequency in Hz.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='double inHz=0;\n\t\tif(unit!=null){\n\t\tinHz=value*Math.pow(10, unit.getValue());\t\n\t\t}\nreturn inHz;'"
	 * @generated
	 */
	double getInHz();

} // Frequency
