/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Region;

import de.uni_paderborn.fujaba.simulink.model.stateflow.State;

import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Region2sf Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.ScRegion2sfParallel#getScRegion <em>Sc Region</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScRegion2sfParallel#getSfParallelState <em>Sf Parallel State</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScRegion2sfParallel#getScRegRtsc <em>Sc Reg Rtsc</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScRegion2sfParallel()
 * @model
 * @generated
 */
public interface ScRegion2sfParallel extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Region</em>' reference.
	 * @see #setScRegion(Region)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScRegion2sfParallel_ScRegion()
	 * @model
	 * @generated
	 */
	Region getScRegion();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScRegion2sfParallel#getScRegion <em>Sc Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Region</em>' reference.
	 * @see #getScRegion()
	 * @generated
	 */
	void setScRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Sf Parallel State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Parallel State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Parallel State</em>' reference.
	 * @see #setSfParallelState(State)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScRegion2sfParallel_SfParallelState()
	 * @model
	 * @generated
	 */
	State getSfParallelState();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScRegion2sfParallel#getSfParallelState <em>Sf Parallel State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Parallel State</em>' reference.
	 * @see #getSfParallelState()
	 * @generated
	 */
	void setSfParallelState(State value);

	/**
	 * Returns the value of the '<em><b>Sc Reg Rtsc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Reg Rtsc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Reg Rtsc</em>' reference.
	 * @see #setScRegRtsc(RealtimeStatechart)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScRegion2sfParallel_ScRegRtsc()
	 * @model
	 * @generated
	 */
	RealtimeStatechart getScRegRtsc();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScRegion2sfParallel#getScRegRtsc <em>Sc Reg Rtsc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Reg Rtsc</em>' reference.
	 * @see #getScRegRtsc()
	 * @generated
	 */
	void setScRegRtsc(RealtimeStatechart value);

} // ScRegion2sfParallel
