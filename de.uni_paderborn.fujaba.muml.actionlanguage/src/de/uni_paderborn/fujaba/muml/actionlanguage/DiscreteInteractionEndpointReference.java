/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.actionlanguage;

import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Interaction Endpoint Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.DiscreteInteractionEndpointReference#getTypedNamedElementExpression <em>Typed Named Element Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.DiscreteInteractionEndpointReference#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getDiscreteInteractionEndpointReference()
 * @model
 * @generated
 */
public interface DiscreteInteractionEndpointReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Typed Named Element Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Named Element Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Named Element Expression</em>' containment reference.
	 * @see #setTypedNamedElementExpression(TypedNamedElementExpression)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getDiscreteInteractionEndpointReference_TypedNamedElementExpression()
	 * @model containment="true"
	 * @generated
	 */
	TypedNamedElementExpression getTypedNamedElementExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.DiscreteInteractionEndpointReference#getTypedNamedElementExpression <em>Typed Named Element Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Named Element Expression</em>' containment reference.
	 * @see #getTypedNamedElementExpression()
	 * @generated
	 */
	void setTypedNamedElementExpression(TypedNamedElementExpression value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(PositionSelector)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getDiscreteInteractionEndpointReference_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositionSelector getPosition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.DiscreteInteractionEndpointReference#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionSelector value);

} // DiscreteInteractionEndpointReference
