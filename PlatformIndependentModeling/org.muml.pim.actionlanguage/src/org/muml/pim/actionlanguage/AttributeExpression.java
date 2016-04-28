/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;

import org.eclipse.emf.common.util.EList;
import org.muml.core.expressions.Expression;
import org.muml.pim.behavior.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To perform an action on a value of an attribute of a \rtsc we use the attribute expression which has a reference to an attribute of the \rtsc and optional indicies if a concrete array element should be referenced.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.AttributeExpression#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.AttributeExpression#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.pim.actionlanguage.ActionLanguagePackage#getAttributeExpression()
 * @model
 * @generated
 */
public interface AttributeExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute of an attribute expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Variable)
	 * @see org.muml.pim.actionlanguage.ActionLanguagePackage#getAttributeExpression_Attribute()
	 * @model
	 * @generated
	 */
	Variable getAttribute();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.AttributeExpression#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Variable value);

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.core.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indices which refer to an concrete index of an array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see org.muml.pim.actionlanguage.ActionLanguagePackage#getAttributeExpression_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIndices();

} // AttributeExpression
