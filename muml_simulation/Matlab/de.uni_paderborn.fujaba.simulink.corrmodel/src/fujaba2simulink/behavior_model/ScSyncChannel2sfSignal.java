/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model;

import de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationChannel;

import de.uni_paderborn.fujaba.simulink.model.stateflow.Event;

import fujaba2simulink.AbstractContainerCorrespondenceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Sync Channel2sf Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.ScSyncChannel2sfSignal#getScSyncChannel <em>Sc Sync Channel</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.ScSyncChannel2sfSignal#getSfSyncEvent <em>Sf Sync Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScSyncChannel2sfSignal()
 * @model
 * @generated
 */
public interface ScSyncChannel2sfSignal extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Sync Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Sync Channel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Sync Channel</em>' reference.
	 * @see #setScSyncChannel(SynchronizationChannel)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScSyncChannel2sfSignal_ScSyncChannel()
	 * @model
	 * @generated
	 */
	SynchronizationChannel getScSyncChannel();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScSyncChannel2sfSignal#getScSyncChannel <em>Sc Sync Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Sync Channel</em>' reference.
	 * @see #getScSyncChannel()
	 * @generated
	 */
	void setScSyncChannel(SynchronizationChannel value);

	/**
	 * Returns the value of the '<em><b>Sf Sync Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Sync Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Sync Event</em>' reference.
	 * @see #setSfSyncEvent(Event)
	 * @see fujaba2simulink.behavior_model.Behavior_modelPackage#getScSyncChannel2sfSignal_SfSyncEvent()
	 * @model
	 * @generated
	 */
	Event getSfSyncEvent();

	/**
	 * Sets the value of the '{@link fujaba2simulink.behavior_model.ScSyncChannel2sfSignal#getSfSyncEvent <em>Sf Sync Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Sync Event</em>' reference.
	 * @see #getSfSyncEvent()
	 * @generated
	 */
	void setSfSyncEvent(Event value);

} // ScSyncChannel2sfSignal
