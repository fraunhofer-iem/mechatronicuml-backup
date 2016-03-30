/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model;

import org.muml.pim.realtimestatechart.State;
import org.muml.simulink.adapter.corrmodel.fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc State2 Sf State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.ScState2SfState#getScState <em>Sc State</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.ScState2SfState#getSfState <em>Sf State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.Behavior_modelPackage#getScState2SfState()
 * @model
 * @generated
 */
public interface ScState2SfState extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc State</em>' reference.
	 * @see #setScState(State)
	 * @see org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.Behavior_modelPackage#getScState2SfState_ScState()
	 * @model
	 * @generated
	 */
	State getScState();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.ScState2SfState#getScState <em>Sc State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc State</em>' reference.
	 * @see #getScState()
	 * @generated
	 */
	void setScState(State value);

	/**
	 * Returns the value of the '<em><b>Sf State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf State</em>' reference.
	 * @see #setSfState(org.muml.simulink.adapter.model.stateflow.State)
	 * @see org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.Behavior_modelPackage#getScState2SfState_SfState()
	 * @model
	 * @generated
	 */
	org.muml.simulink.adapter.model.stateflow.State getSfState();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.fujaba2simulink.behavior_model.ScState2SfState#getSfState <em>Sf State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf State</em>' reference.
	 * @see #getSfState()
	 * @generated
	 */
	void setSfState(org.muml.simulink.adapter.model.stateflow.State value);

} // ScState2SfState
