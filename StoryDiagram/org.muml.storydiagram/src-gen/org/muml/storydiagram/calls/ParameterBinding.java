/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls;

import org.eclipse.emf.ecore.EParameter;
import org.muml.core.CommentableElement;
import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Binds a parameter to a certain value for a given invocation. The value of the parameter is represented by an expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.ParameterBinding#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.ParameterBinding#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.ParameterBinding#getInvocation <em>Invocation</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.calls.CallsPackage#getParameterBinding()
 * @model
 * @generated
 */
public interface ParameterBinding extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Expression</em>' containment reference.
	 * @see #setValueExpression(Expression)
	 * @see org.muml.storydiagram.calls.CallsPackage#getParameterBinding_ValueExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getValueExpression();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.calls.ParameterBinding#getValueExpression <em>Value Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' containment reference.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(EParameter)
	 * @see org.muml.storydiagram.calls.CallsPackage#getParameterBinding_Parameter()
	 * @model ordered="false"
	 * @generated
	 */
	EParameter getParameter();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.calls.ParameterBinding#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(EParameter value);

	/**
	 * Returns the value of the '<em><b>Invocation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.calls.Invocation#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation</em>' container reference.
	 * @see #setInvocation(Invocation)
	 * @see org.muml.storydiagram.calls.CallsPackage#getParameterBinding_Invocation()
	 * @see org.muml.storydiagram.calls.Invocation#getOwnedParameterBindings
	 * @model opposite="ownedParameterBindings" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Invocation getInvocation();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.calls.ParameterBinding#getInvocation <em>Invocation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation</em>' container reference.
	 * @see #getInvocation()
	 * @generated
	 */
	void setInvocation(Invocation value);

} // ParameterBinding
