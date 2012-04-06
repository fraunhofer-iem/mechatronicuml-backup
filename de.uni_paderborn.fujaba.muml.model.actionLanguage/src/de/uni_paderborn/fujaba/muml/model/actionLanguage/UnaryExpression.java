/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import org.storydriven.core.expressions.Expression;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression#getUnaryExpression <em>Unary Expression</em>}</li>
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
	 * Returns the value of the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the operand of a NotExpression, e.g. a < 5 in NOT (a < 5).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unary Expression</em>' containment reference.
	 * @see #setUnaryExpression(Expression)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getUnaryExpression_UnaryExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getUnaryExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryExpression#getUnaryExpression <em>Unary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Expression</em>' containment reference.
	 * @see #getUnaryExpression()
	 * @generated
	 */
	void setUnaryExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Unary Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unary Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryOperator
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
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.UnaryOperator
	 * @see #getUnaryOperator()
	 * @generated
	 */
	void setUnaryOperator(UnaryOperator value);

} // UnaryExpression
