/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls.expressions;

import org.muml.core.expressions.Expression;
import org.muml.storydiagram.calls.ParameterExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Expressions that represents a parameter value, e.g. the value of an Activity's parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.expressions.ParameterExpression#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.calls.expressions.CallsExpressionsPackage#getParameterExpression()
 * @model
 * @generated
 */
public interface ParameterExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterExtension)
	 * @see org.muml.storydiagram.calls.expressions.CallsExpressionsPackage#getParameterExpression_Parameter()
	 * @model ordered="false"
	 * @generated
	 */
	ParameterExtension getParameter();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.calls.expressions.ParameterExpression#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterExtension value);

} // ParameterExpression
