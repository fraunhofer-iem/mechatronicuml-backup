/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;

import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An assignment is used to assign a value to a variable. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.Assignment#getAssignOperator <em>Assign Operator</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.Assignment#getRhs_assignExpression <em>Rhs assign Expression</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.Assignment#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.Assignment#getLhs_typedNamedElementExpression <em>Lhs typed Named Element Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getAssignment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints=''"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidLHS='-- a hybrid in port is not allowed as a lhs of an assignment\nlet lhs : TypedNamedElementExpression = lhs_typedNamedElementExpression\nin\nif not lhs.oclIsUndefined() and lhs.typedNamedElement.oclIsKindOf(component::HybridPort) then\n\tlhs.typedNamedElement.oclAsType(component::HybridPort).outPort\nelse\n\ttrue\nendif'"
 * @generated
 */
public interface Assignment extends Expression {
	/**
	 * Returns the value of the '<em><b>Assign Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pim.actionlanguage.AssignOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An assignment is used to assign a value to a variable. A simple assignment is one made using the \emph{<ASSIGN>} Operator \emph{':='}. Further, we have  four more assign operators which are used as abbreviated syntax form. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assign Operator</em>' attribute.
	 * @see org.muml.pim.actionlanguage.AssignOperator
	 * @see #setAssignOperator(AssignOperator)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getAssignment_AssignOperator()
	 * @model
	 * @generated
	 */
	AssignOperator getAssignOperator();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.Assignment#getAssignOperator <em>Assign Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign Operator</em>' attribute.
	 * @see org.muml.pim.actionlanguage.AssignOperator
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
	 * <!-- begin-model-doc -->
	 * The right-hand-side expression evaluates to a value which is assigned to the left-hand-side variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rhs assign Expression</em>' containment reference.
	 * @see #setRhs_assignExpression(Expression)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getAssignment_Rhs_assignExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRhs_assignExpression();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.Assignment#getRhs_assignExpression <em>Rhs assign Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs assign Expression</em>' containment reference.
	 * @see #getRhs_assignExpression()
	 * @generated
	 */
	void setRhs_assignExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Increment Decrement Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pim.actionlanguage.IncrementDecrementOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment Decrement Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbreviated form of x := x+1; or x :=x-1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Increment Decrement Operator</em>' attribute.
	 * @see org.muml.pim.actionlanguage.IncrementDecrementOperator
	 * @see #setIncrementDecrementOperator(IncrementDecrementOperator)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getAssignment_IncrementDecrementOperator()
	 * @model
	 * @generated
	 */
	IncrementDecrementOperator getIncrementDecrementOperator();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.Assignment#getIncrementDecrementOperator <em>Increment Decrement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Decrement Operator</em>' attribute.
	 * @see org.muml.pim.actionlanguage.IncrementDecrementOperator
	 * @see #getIncrementDecrementOperator()
	 * @generated
	 */
	void setIncrementDecrementOperator(IncrementDecrementOperator value);

	/**
	 * Returns the value of the '<em><b>Lhs typed Named Element Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The left-hand-side of an assignment must be a single variable and must not be another expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lhs typed Named Element Expression</em>' containment reference.
	 * @see #setLhs_typedNamedElementExpression(TypedNamedElementExpression)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getAssignment_Lhs_typedNamedElementExpression()
	 * @model containment="true"
	 * @generated
	 */
	TypedNamedElementExpression getLhs_typedNamedElementExpression();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.Assignment#getLhs_typedNamedElementExpression <em>Lhs typed Named Element Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs typed Named Element Expression</em>' containment reference.
	 * @see #getLhs_typedNamedElementExpression()
	 * @generated
	 */
	void setLhs_typedNamedElementExpression(TypedNamedElementExpression value);

} // Assignment
