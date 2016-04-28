/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;

import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Interaction Endpoint Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DiscreteInteractionEndpointReference is used for defining SelectorExpressions
 * in a multi-role or multi-port. There, a SelectorExpression may reference a
 * sub-role instance or sub-port instance for selecting the synchronization partner. 
 * The DiscreteInteractionEndpointReference always specifies a PositionSelector that
 * defines the position of the reference sub-role instance or sub-port instance. It may, 
 * e.g., be the first or last one in a multi-role or multi-port. The reference 
 * typedNamedElementExpressions allows to reference a variable containing a 
 * sub-role instance or a sub-port instance. In combination, both references enable
 * to select the next or previous sub-role (or sub-port) instance, e.g., as var1.next. In 
 * this case, next is the PositionSelector while var1 is the typedNamedElementExpression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.DiscreteInteractionEndpointReference#getTypedNamedElementExpression <em>Typed Named Element Expression</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.DiscreteInteractionEndpointReference#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getDiscreteInteractionEndpointReference()
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
	 * <!-- begin-model-doc -->
	 * Allows to reference a variable containing a sub-role instance of sub-port instance.
	 * This field is optional. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typed Named Element Expression</em>' containment reference.
	 * @see #setTypedNamedElementExpression(TypedNamedElementExpression)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getDiscreteInteractionEndpointReference_TypedNamedElementExpression()
	 * @model containment="true"
	 * @generated
	 */
	TypedNamedElementExpression getTypedNamedElementExpression();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.DiscreteInteractionEndpointReference#getTypedNamedElementExpression <em>Typed Named Element Expression</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * Defines the relative position of the sub-role instance or sub-port instance.
	 * In particular, it enables to select the first or last sub-role instance (sub-port instance) of a 
	 * multi-role instance (multi-port instance) using keyword first and last, to select itself
	 * in case of a sub-role instance (sub-port instance) using keyword self, or the next
	 * or previous sub-role given a reference either by self or a variable using keywords
	 * next and prev.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(PositionSelector)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getDiscreteInteractionEndpointReference_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositionSelector getPosition();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.DiscreteInteractionEndpointReference#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionSelector value);

} // DiscreteInteractionEndpointReference
