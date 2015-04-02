/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;

import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Value Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getEnumeratedValueRef()
 * @model
 * @generated
 */
public interface EnumeratedValueRef extends PrimaryExpressionValue {
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
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getEnumeratedValueRef_EnumValue()
	 * @model
	 * @generated
	 */
	EnumeratedValue getEnumValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef#getEnumValue <em>Enum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Value</em>' reference.
	 * @see #getEnumValue()
	 * @generated
	 */
	void setEnumValue(EnumeratedValue value);

} // EnumeratedValueRef
