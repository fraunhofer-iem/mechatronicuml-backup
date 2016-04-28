/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration.expression;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.reconfiguration.ReconfigurationRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfiguration Rule Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReconfigurationRuleCallExpression can be used for calling a ReconfigurationRule from an expression specified by the MechatronicUML action language. 
 * In particular, it may be used for calling a reconfiguration rule in the action of a transition of a real-time statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.expression.ReconfigurationRuleCallExpression#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 *   <li>{@link org.muml.reconfiguration.expression.ReconfigurationRuleCallExpression#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.expression.ExpressionPackage#getReconfigurationRuleCallExpression()
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
	 * <!-- begin-model-doc -->
	 * The reconfiguration rule that is called by this expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconfiguration Rule</em>' reference.
	 * @see #setReconfigurationRule(ReconfigurationRule)
	 * @see org.muml.reconfiguration.expression.ExpressionPackage#getReconfigurationRuleCallExpression_ReconfigurationRule()
	 * @model required="true"
	 * @generated
	 */
	ReconfigurationRule getReconfigurationRule();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.expression.ReconfigurationRuleCallExpression#getReconfigurationRule <em>Reconfiguration Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Rule</em>' reference.
	 * @see #getReconfigurationRule()
	 * @generated
	 */
	void setReconfigurationRule(ReconfigurationRule value);

	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter bindings assign a value to each of the parameters of the 
	 * reconfiguration rule that is called by this expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
	 * @see org.muml.reconfiguration.expression.ExpressionPackage#getReconfigurationRuleCallExpression_ParameterBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBindings();

} // ReconfigurationRuleCallExpression
