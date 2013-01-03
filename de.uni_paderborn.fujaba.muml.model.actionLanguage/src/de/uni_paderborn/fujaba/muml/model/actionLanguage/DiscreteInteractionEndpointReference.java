/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Interaction Endpoint Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference#getVariableExpression <em>Variable Expression</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getDiscreteInteractionEndpointReference()
 * @model
 * @generated
 */
public interface DiscreteInteractionEndpointReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Expression</em>' containment reference.
	 * @see #setVariableExpression(VariableOrParameterExpression)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getDiscreteInteractionEndpointReference_VariableExpression()
	 * @model containment="true"
	 * @generated
	 */
	VariableOrParameterExpression getVariableExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference#getVariableExpression <em>Variable Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Expression</em>' containment reference.
	 * @see #getVariableExpression()
	 * @generated
	 */
	void setVariableExpression(VariableOrParameterExpression value);

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
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getDiscreteInteractionEndpointReference_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositionSelector getPosition();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionSelector value);

} // DiscreteInteractionEndpointReference
