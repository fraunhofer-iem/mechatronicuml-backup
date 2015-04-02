/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression#getUnaryOperator <em>Unary Operator</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getPrimaryExpression()
 * @model
 * @generated
 */
public interface PrimaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Unary Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unary Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Operator</em>' containment reference.
	 * @see #setUnaryOperator(UnaryOperator)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getPrimaryExpression_UnaryOperator()
	 * @model containment="true"
	 * @generated
	 */
	UnaryOperator getUnaryOperator();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression#getUnaryOperator <em>Unary Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Operator</em>' containment reference.
	 * @see #getUnaryOperator()
	 * @generated
	 */
	void setUnaryOperator(UnaryOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(PrimaryExpressionValue)
	 * @see de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage#getPrimaryExpression_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimaryExpressionValue getValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PrimaryExpressionValue value);

} // PrimaryExpression
