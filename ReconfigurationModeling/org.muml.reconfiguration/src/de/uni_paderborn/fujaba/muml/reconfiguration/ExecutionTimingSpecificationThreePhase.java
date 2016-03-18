/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Timing Specification Three Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the time for executing a reconfiguration according to three-phase
 * execution. Consequently, it specifies three time values: one for each phase.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForSetup <em>Time For Setup</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForFading <em>Time For Fading</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForTeardown <em>Time For Teardown</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExecutionTimingSpecificationThreePhase()
 * @model
 * @generated
 */
public interface ExecutionTimingSpecificationThreePhase extends ExecutionTimingSpecification {
	/**
	 * Returns the value of the '<em><b>Time For Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Setup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time needed for executing the setup phase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time For Setup</em>' containment reference.
	 * @see #setTimeForSetup(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExecutionTimingSpecificationThreePhase_TimeForSetup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getTimeForSetup();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForSetup <em>Time For Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Setup</em>' containment reference.
	 * @see #getTimeForSetup()
	 * @generated
	 */
	void setTimeForSetup(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Time For Fading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Fading</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time needed for executing the fading function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time For Fading</em>' containment reference.
	 * @see #setTimeForFading(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExecutionTimingSpecificationThreePhase_TimeForFading()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getTimeForFading();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForFading <em>Time For Fading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Fading</em>' containment reference.
	 * @see #getTimeForFading()
	 * @generated
	 */
	void setTimeForFading(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Time For Teardown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Teardown</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time needed for executing the teardown phase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time For Teardown</em>' containment reference.
	 * @see #setTimeForTeardown(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getExecutionTimingSpecificationThreePhase_TimeForTeardown()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getTimeForTeardown();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecificationThreePhase#getTimeForTeardown <em>Time For Teardown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Teardown</em>' containment reference.
	 * @see #getTimeForTeardown()
	 * @generated
	 */
	void setTimeForTeardown(TimeValue value);

} // ExecutionTimingSpecificationThreePhase
