/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding;

import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a binding for a TimeParameter. The parameter is bound to a concrete time value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.TimeParameterBinding#getTimeValue <em>Time Value</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage#getTimeParameterBinding()
 * @model
 * @generated
 */
public interface TimeParameterBinding extends RealtimeStatechartParameterBinding {
	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time value used for the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Value</em>' containment reference.
	 * @see #setTimeValue(TimeValue)
	 * @see org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage#getTimeParameterBinding_TimeValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getTimeValue();

	/**
	 * Sets the value of the '{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.TimeParameterBinding#getTimeValue <em>Time Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' containment reference.
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(TimeValue value);

} // TimeParameterBinding
