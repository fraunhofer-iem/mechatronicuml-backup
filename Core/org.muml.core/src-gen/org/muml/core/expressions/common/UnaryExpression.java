/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.expressions.common;

import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an unary expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.expressions.common.UnaryExpression#getEnclosedExpression <em>Enclosed Expression</em>}</li>
 *   <li>{@link org.muml.core.expressions.common.UnaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.muml.core.expressions.common.CommonPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Enclosed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the operand of a NotExpression, e.g. a < 5 in NOT (a < 5).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosed Expression</em>' containment reference.
	 * @see #setEnclosedExpression(Expression)
	 * @see org.muml.core.expressions.common.CommonPackage#getUnaryExpression_EnclosedExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getEnclosedExpression();

	/**
	 * Sets the value of the '{@link org.muml.core.expressions.common.UnaryExpression#getEnclosedExpression <em>Enclosed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosed Expression</em>' containment reference.
	 * @see #getEnclosedExpression()
	 * @generated
	 */
	void setEnclosedExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.core.expressions.common.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the operator of the expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.muml.core.expressions.common.UnaryOperator
	 * @see #setOperator(UnaryOperator)
	 * @see org.muml.core.expressions.common.CommonPackage#getUnaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	UnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link org.muml.core.expressions.common.UnaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.muml.core.expressions.common.UnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperator value);

} // UnaryExpression
