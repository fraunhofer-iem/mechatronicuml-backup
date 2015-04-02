/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Operator Place Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperatorPlaceHolder#getReturnOperator <em>Return Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getReturnOperatorPlaceHolder()
 * @model
 * @generated
 */
public interface ReturnOperatorPlaceHolder extends Instruction {
	/**
	 * Returns the value of the '<em><b>Return Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Operator</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator
	 * @see #setReturnOperator(ReturnOperator)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage#getReturnOperatorPlaceHolder_ReturnOperator()
	 * @model required="true"
	 * @generated
	 */
	ReturnOperator getReturnOperator();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperatorPlaceHolder#getReturnOperator <em>Return Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Operator</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.il.ReturnOperator
	 * @see #getReturnOperator()
	 * @generated
	 */
	void setReturnOperator(ReturnOperator value);

} // ReturnOperatorPlaceHolder
