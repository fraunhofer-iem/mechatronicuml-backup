/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Named Element Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To perform an action on a value of a variable of a \rtsc we use the typed named element expression, which has a reference to a typed named element and optional indicies if a concrete array element should be referenced.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression#getTypedNamedElement <em>Typed Named Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getTypedNamedElementExpression()
 * @model
 * @generated
 */
public interface TypedNamedElementExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Typed Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Named Element</em>' reference.
	 * @see #setTypedNamedElement(TypedNamedElement)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getTypedNamedElementExpression_TypedNamedElement()
	 * @model
	 * @generated
	 */
	TypedNamedElement getTypedNamedElement();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression#getTypedNamedElement <em>Typed Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Named Element</em>' reference.
	 * @see #getTypedNamedElement()
	 * @generated
	 */
	void setTypedNamedElement(TypedNamedElement value);

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link org.storydriven.core.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indices which refer to an concrete index of an array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getTypedNamedElementExpression_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getIndices();

} // TypedNamedElementExpression
