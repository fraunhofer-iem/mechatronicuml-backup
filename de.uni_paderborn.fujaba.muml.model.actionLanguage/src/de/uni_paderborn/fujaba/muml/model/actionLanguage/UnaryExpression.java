/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import org.storydriven.core.expressions.Expression;
import org.storydriven.core.expressions.common.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a negated expression, e.g. NOT (a < 5).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression#getEnclosedExpression <em>Enclosed Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression#getUnaryOperator <em>Unary Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getUnaryExpression()
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
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getUnaryExpression_EnclosedExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getEnclosedExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression#getEnclosedExpression <em>Enclosed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosed Expression</em>' containment reference.
	 * @see #getEnclosedExpression()
	 * @generated
	 */
	void setEnclosedExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Unary Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.storydriven.core.expressions.common.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unary Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Operator</em>' attribute.
	 * @see org.storydriven.core.expressions.common.UnaryOperator
	 * @see #setUnaryOperator(UnaryOperator)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getUnaryExpression_UnaryOperator()
	 * @model
	 * @generated
	 */
	UnaryOperator getUnaryOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression#getUnaryOperator <em>Unary Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Operator</em>' attribute.
	 * @see org.storydriven.core.expressions.common.UnaryOperator
	 * @see #getUnaryOperator()
	 * @generated
	 */
	void setUnaryOperator(UnaryOperator value);

} // UnaryExpression
