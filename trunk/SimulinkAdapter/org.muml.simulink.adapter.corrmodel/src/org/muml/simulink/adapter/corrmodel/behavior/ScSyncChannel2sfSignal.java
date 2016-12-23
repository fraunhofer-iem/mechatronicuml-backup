/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Sync Channel2sf Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal#getScSyncChannel <em>Sc Sync Channel</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal#getSfSyncEvent <em>Sf Sync Event</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScSyncChannel2sfSignal()
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScSyncChannel2sfSignal_ScSyncChannel()
	 * @model
	 * @generated
	 */
	SynchronizationChannel getScSyncChannel();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal#getScSyncChannel <em>Sc Sync Channel</em>}' reference.
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
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScSyncChannel2sfSignal_SfSyncEvent()
	 * @model
	 * @generated
	 */
	Event getSfSyncEvent();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncChannel2sfSignal#getSfSyncEvent <em>Sf Sync Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Sync Event</em>' reference.
	 * @see #getSfSyncEvent()
	 * @generated
	 */
	void setSfSyncEvent(Event value);

} // ScSyncChannel2sfSignal
