/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage;

import de.uni_paderborn.fujaba.muml.model.core.Parameter;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Message;

import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Message Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a parameter of a transition's trigger message.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getTriggerMessageExpression()
 * @model
 * @generated
 */
public interface TriggerMessageExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' reference.
	 * @see #setMessageType(MessageType)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getTriggerMessageExpression_MessageType()
	 * @model required="true"
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression#getMessageType <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' reference.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage#getTriggerMessageExpression_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // TriggerMessageExpression
