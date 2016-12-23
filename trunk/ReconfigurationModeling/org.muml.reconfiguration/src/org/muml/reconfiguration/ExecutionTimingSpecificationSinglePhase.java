/**
 */
package org.muml.reconfiguration;

import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Timing Specification Single Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the time for executing a reconfiguration according to single-phase
 * execution. Consequently, it only provides one time value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase#getTimeForExecution <em>Time For Execution</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.ReconfigurationPackage#getExecutionTimingSpecificationSinglePhase()
 * @model
 * @generated
 */
public interface ExecutionTimingSpecificationSinglePhase extends ExecutionTimingSpecification {
	/**
	 * Returns the value of the '<em><b>Time For Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Execution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time necessary for executing a reconfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time For Execution</em>' containment reference.
	 * @see #setTimeForExecution(TimeValue)
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getExecutionTimingSpecificationSinglePhase_TimeForExecution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getTimeForExecution();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.ExecutionTimingSpecificationSinglePhase#getTimeForExecution <em>Time For Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Execution</em>' containment reference.
	 * @see #getTimeForExecution()
	 * @generated
	 */
	void setTimeForExecution(TimeValue value);

} // ExecutionTimingSpecificationSinglePhase
