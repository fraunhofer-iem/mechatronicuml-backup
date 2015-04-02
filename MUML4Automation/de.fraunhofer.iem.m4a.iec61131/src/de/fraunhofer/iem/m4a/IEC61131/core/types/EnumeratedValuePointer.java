/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Value Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValuePointer#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedValuePointer()
 * @model
 * @generated
 */
public interface EnumeratedValuePointer extends ArrayInitElement {
	/**
	 * Returns the value of the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value</em>' reference.
	 * @see #setEnumValue(EnumeratedValue)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getEnumeratedValuePointer_EnumValue()
	 * @model required="true"
	 * @generated
	 */
	EnumeratedValue getEnumValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValuePointer#getEnumValue <em>Enum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Value</em>' reference.
	 * @see #getEnumValue()
	 * @generated
	 */
	void setEnumValue(EnumeratedValue value);

} // EnumeratedValuePointer
