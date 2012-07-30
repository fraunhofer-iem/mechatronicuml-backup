/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.model.core.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAssignOperator <em>Assign Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getRhs_assignExpression <em>Rhs assign Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getLhs_attributeExpression <em>Lhs attribute Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Expression {
	/**
	 * Returns the value of the '<em><b>Assign Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator
	 * @see #setAssignOperator(AssignOperator)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignment_AssignOperator()
	 * @model
	 * @generated
	 */
	AssignOperator getAssignOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getAssignOperator <em>Assign Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.AssignOperator
	 * @see #getAssignOperator()
	 * @generated
	 */
	void setAssignOperator(AssignOperator value);

	/**
	 * Returns the value of the '<em><b>Rhs assign Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs assign Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs assign Expression</em>' containment reference.
	 * @see #setRhs_assignExpression(Expression)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignment_Rhs_assignExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRhs_assignExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getRhs_assignExpression <em>Rhs assign Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs assign Expression</em>' containment reference.
	 * @see #getRhs_assignExpression()
	 * @generated
	 */
	void setRhs_assignExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Increment Decrement Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment Decrement Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Decrement Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator
	 * @see #setIncrementDecrementOperator(IncrementDecrementOperator)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignment_IncrementDecrementOperator()
	 * @model
	 * @generated
	 */
	IncrementDecrementOperator getIncrementDecrementOperator();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Decrement Operator</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.IncrementDecrementOperator
	 * @see #getIncrementDecrementOperator()
	 * @generated
	 */
	void setIncrementDecrementOperator(IncrementDecrementOperator value);

	/**
	 * Returns the value of the '<em><b>Lhs attribute Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs attribute Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs attribute Expression</em>' containment reference.
	 * @see #setLhs_attributeExpression(AttributeExpression)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getAssignment_Lhs_attributeExpression()
	 * @model containment="true"
	 * @generated
	 */
	AttributeExpression getLhs_attributeExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment#getLhs_attributeExpression <em>Lhs attribute Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs attribute Expression</em>' containment reference.
	 * @see #getLhs_attributeExpression()
	 * @generated
	 */
	void setLhs_attributeExpression(AttributeExpression value);

} // Assignment
