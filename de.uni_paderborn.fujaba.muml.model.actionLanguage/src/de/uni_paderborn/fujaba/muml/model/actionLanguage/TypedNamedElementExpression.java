/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import de.uni_paderborn.fujaba.muml.model.behavior.TypedNamedElement;

import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Named Element Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression#getTypedNamedElement <em>Typed Named Element</em>}</li>
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

} // TypedNamedElementExpression
