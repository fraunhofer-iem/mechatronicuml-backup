/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding;

import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.behavior.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Call Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a binding for a CallParameter. The parameter is bound to a concrete expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage#getAPICallParameterBinding()
 * @model
 * @generated
 */
public interface APICallParameterBinding extends RealtimeStatechartParameterBinding, Operation {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression, used for the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage#getAPICallParameterBinding_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.APICallParameterBinding#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // APICallParameterBinding
