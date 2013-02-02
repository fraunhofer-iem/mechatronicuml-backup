/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.behavior;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.expressions.Expression;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Implementation of an Attribute of a behavior which has a certain type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.behavior.Variable#getInitializeExpression <em>Initialize Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends TypedNamedElement, CommentableElement {

	/**
	 * Returns the value of the '<em><b>Initialize Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialize Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialize Expression</em>' reference.
	 * @see #setInitializeExpression(Expression)
	 * @see de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage#getVariable_InitializeExpression()
	 * @model
	 * @generated
	 */
	Expression getInitializeExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.behavior.Variable#getInitializeExpression <em>Initialize Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialize Expression</em>' reference.
	 * @see #getInitializeExpression()
	 * @generated
	 */
	void setInitializeExpression(Expression value);

} // Variable
