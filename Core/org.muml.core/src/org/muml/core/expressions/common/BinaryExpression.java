/**
 */
package org.muml.core.expressions.common;

import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents any binary expression like v < 5 or x + 7.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.expressions.common.BinaryExpression#getLeftExpression <em>Left Expression</em>}</li>
 *   <li>{@link org.muml.core.expressions.common.BinaryExpression#getRightExpression <em>Right Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.core.expressions.common.CommonExpressionsPackage#getBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the first operand of a binary expression, e.g. x in the expression x < 5.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Left Expression</em>' containment reference.
	 * @see #setLeftExpression(Expression)
	 * @see org.muml.core.expressions.common.CommonExpressionsPackage#getBinaryExpression_LeftExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getLeftExpression();

	/**
	 * Sets the value of the '{@link org.muml.core.expressions.common.BinaryExpression#getLeftExpression <em>Left Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Expression</em>' containment reference.
	 * @see #getLeftExpression()
	 * @generated
	 */
	void setLeftExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the second operand of a binary expression, e.g. 5 in the expression x < 5.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right Expression</em>' containment reference.
	 * @see #setRightExpression(Expression)
	 * @see org.muml.core.expressions.common.CommonExpressionsPackage#getBinaryExpression_RightExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getRightExpression();

	/**
	 * Sets the value of the '{@link org.muml.core.expressions.common.BinaryExpression#getRightExpression <em>Right Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Expression</em>' containment reference.
	 * @see #getRightExpression()
	 * @generated
	 */
	void setRightExpression(Expression value);

} // BinaryExpression
