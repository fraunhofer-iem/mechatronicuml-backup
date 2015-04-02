/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;

import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand Enumerated Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandEnumeratedValue#getEnumeratedValue <em>Enumerated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getOperandEnumeratedValue()
 * @model
 * @generated
 */
public interface OperandEnumeratedValue extends Operand {
	/**
	 * Returns the value of the '<em><b>Enumerated Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerated Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerated Value</em>' reference.
	 * @see #setEnumeratedValue(EnumeratedValue)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getOperandEnumeratedValue_EnumeratedValue()
	 * @model required="true"
	 * @generated
	 */
	EnumeratedValue getEnumeratedValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandEnumeratedValue#getEnumeratedValue <em>Enumerated Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumerated Value</em>' reference.
	 * @see #getEnumeratedValue()
	 * @generated
	 */
	void setEnumeratedValue(EnumeratedValue value);

} // OperandEnumeratedValue
