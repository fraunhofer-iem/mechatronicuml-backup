/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration;

import de.uni_paderborn.fujaba.muml.model.core.ParameterBinding;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRuleCallExpression#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRuleCallExpression#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationRuleCallExpression()
 * @model
 * @generated
 */
public interface ReconfigurationRuleCallExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Reconfiguration Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Rule</em>' reference.
	 * @see #setReconfigurationRule(ReconfigurationRule)
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationRuleCallExpression_ReconfigurationRule()
	 * @model required="true"
	 * @generated
	 */
	ReconfigurationRule getReconfigurationRule();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRuleCallExpression#getReconfigurationRule <em>Reconfiguration Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Rule</em>' reference.
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	void setReconfigurationRule(ReconfigurationRule value);

	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.core.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage#getReconfigurationRuleCallExpression_ParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBindings();

} // ReconfigurationRuleCallExpression
