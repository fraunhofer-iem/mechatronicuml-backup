/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities;

import org.muml.mumlcore.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A statement node is a node that just contains an expression defining its behavior. In combination with a textual expression, arbitrary souce code might be added by using StatementNodes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.StatementNode#getStatementExpression <em>Statement Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.activities.ActivitiesPackage#getStatementNode()
 * @model
 * @generated
 */
public interface StatementNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Statement Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression which defines the behavior of this StatementNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement Expression</em>' containment reference.
	 * @see #setStatementExpression(Expression)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getStatementNode_StatementExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getStatementExpression();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.StatementNode#getStatementExpression <em>Statement Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Expression</em>' containment reference.
	 * @see #getStatementExpression()
	 * @generated
	 */
	void setStatementExpression(Expression value);

} // StatementNode
