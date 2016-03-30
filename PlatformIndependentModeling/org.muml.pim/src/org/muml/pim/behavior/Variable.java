/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.behavior;

import org.muml.core.CommentableElement;
import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Implementation of a variable of a behavior which has a certain type. A variable has a type, a name, and is commentable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.behavior.Variable#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.muml.pim.behavior.Variable#getInitializeExpression <em>Initialize Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.behavior.BehaviorPackage#getVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConstantMustBeInitialized'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ConstantMustBeInitialized='-- if a variable is a constant, then it must be initalized\r\n(self.constant=true) implies (not self.initializeExpression.oclIsUndefined())'"
 * @generated
 */
public interface Variable extends TypedNamedElement, CommentableElement {

	/**
	 * Returns the value of the '<em><b>Initialize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialize Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A variable may have a value when it is initialized. The value is defined by an expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialize Expression</em>' containment reference.
	 * @see #setInitializeExpression(Expression)
	 * @see org.muml.pim.behavior.BehaviorPackage#getVariable_InitializeExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitializeExpression();

	/**
	 * Sets the value of the '{@link org.muml.pim.behavior.Variable#getInitializeExpression <em>Initialize Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialize Expression</em>' containment reference.
	 * @see #getInitializeExpression()
	 * @generated
	 */
	void setInitializeExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It must be defined if a the variable is constant or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see org.muml.pim.behavior.BehaviorPackage#getVariable_Constant()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.muml.pim.behavior.Variable#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

} // Variable
