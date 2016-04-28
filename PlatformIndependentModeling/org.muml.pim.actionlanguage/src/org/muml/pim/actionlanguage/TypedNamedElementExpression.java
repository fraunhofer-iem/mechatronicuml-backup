/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.behavior.TypedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Named Element Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * To perform an action on a value of a variable of a \rtsc we use the typed named element expression, which has a reference to a typed named element and optional indices if a concrete array element should be referenced.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.TypedNamedElementExpression#getTypedNamedElement <em>Typed Named Element</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.TypedNamedElementExpression#getElementAccessors <em>Element Accessors</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getTypedNamedElementExpression()
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
	 * <!-- begin-model-doc -->
	 * The typed named element that is referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typed Named Element</em>' reference.
	 * @see #setTypedNamedElement(TypedNamedElement)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getTypedNamedElementExpression_TypedNamedElement()
	 * @model required="true"
	 * @generated
	 */
	TypedNamedElement getTypedNamedElement();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.TypedNamedElementExpression#getTypedNamedElement <em>Typed Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Named Element</em>' reference.
	 * @see #getTypedNamedElement()
	 * @generated
	 */
	void setTypedNamedElement(TypedNamedElement value);

	/**
	 * Returns the value of the '<em><b>Element Accessors</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.actionlanguage.ElementAccessorExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Accessors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The indices used to access an element inside a referenced array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Accessors</em>' containment reference list.
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getTypedNamedElementExpression_ElementAccessors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementAccessorExpression> getElementAccessors();

} // TypedNamedElementExpression
