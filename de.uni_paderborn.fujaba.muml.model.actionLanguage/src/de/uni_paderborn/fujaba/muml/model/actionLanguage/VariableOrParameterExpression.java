/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Or Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To perform an action on a value of a variable of a \rtsc we use the variable expression, which has a reference to a variable of the \rtsc and optional indicies if a concrete array element should be referenced.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.VariableOrParameterExpression#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getVariableOrParameterExpression()
 * @model
 * @generated
 */
public interface VariableOrParameterExpression extends TypedNamedElementExpression {
	/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.core.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indices which refer to an concrete index of an array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getVariableOrParameterExpression_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIndices();

} // VariableOrParameterExpression
