/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities.expressions;

import org.muml.core.expressions.Expression;
import org.muml.storydiagram.activities.ExceptionVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the value of an exception variable declared as a transition guard (the guard of an activity edge).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.expressions.ExceptionVariableExpression#getExceptionVariable <em>Exception Variable</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.activities.expressions.ActivitiesExpressionsPackage#getExceptionVariableExpression()
 * @model
 * @generated
 */
public interface ExceptionVariableExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Exception Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the exception variable that this expression refers to. If you have an activity edge that catches an exception e, then this expression can represent the reference e.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Variable</em>' reference.
	 * @see #setExceptionVariable(ExceptionVariable)
	 * @see org.muml.storydiagram.activities.expressions.ActivitiesExpressionsPackage#getExceptionVariableExpression_ExceptionVariable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExceptionVariable getExceptionVariable();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.expressions.ExceptionVariableExpression#getExceptionVariable <em>Exception Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Variable</em>' reference.
	 * @see #getExceptionVariable()
	 * @generated
	 */
	void setExceptionVariable(ExceptionVariable value);

} // ExceptionVariableExpression
