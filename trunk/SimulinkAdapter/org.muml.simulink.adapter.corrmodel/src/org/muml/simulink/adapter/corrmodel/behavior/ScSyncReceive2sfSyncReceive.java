/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.behavior;

import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.simulink.adapter.corrmodel.AbstractContainerCorrespondenceNode;
import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sc Sync Receive2sf Sync Receive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getScSyncReceive <em>Sc Sync Receive</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfEntryAction <em>Sf Entry Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfExitAction <em>Sf Exit Action</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfTransEvent <em>Sf Trans Event</em>}</li>
 * </ul>
 *
 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScSyncReceive2sfSyncReceive()
 * @model
 * @generated
 */
public interface ScSyncReceive2sfSyncReceive extends AbstractContainerCorrespondenceNode {
	/**
	 * Returns the value of the '<em><b>Sc Sync Receive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sc Sync Receive</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sc Sync Receive</em>' reference.
	 * @see #setScSyncReceive(Synchronization)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScSyncReceive2sfSyncReceive_ScSyncReceive()
	 * @model
	 * @generated
	 */
	Synchronization getScSyncReceive();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getScSyncReceive <em>Sc Sync Receive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sc Sync Receive</em>' reference.
	 * @see #getScSyncReceive()
	 * @generated
	 */
	void setScSyncReceive(Synchronization value);

	/**
	 * Returns the value of the '<em><b>Sf Entry Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Entry Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Entry Action</em>' reference.
	 * @see #setSfEntryAction(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScSyncReceive2sfSyncReceive_SfEntryAction()
	 * @model
	 * @generated
	 */
	Action getSfEntryAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfEntryAction <em>Sf Entry Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Entry Action</em>' reference.
	 * @see #getSfEntryAction()
	 * @generated
	 */
	void setSfEntryAction(Action value);

	/**
	 * Returns the value of the '<em><b>Sf Exit Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Exit Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Exit Action</em>' reference.
	 * @see #setSfExitAction(Action)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScSyncReceive2sfSyncReceive_SfExitAction()
	 * @model
	 * @generated
	 */
	Action getSfExitAction();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfExitAction <em>Sf Exit Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Exit Action</em>' reference.
	 * @see #getSfExitAction()
	 * @generated
	 */
	void setSfExitAction(Action value);

	/**
	 * Returns the value of the '<em><b>Sf Trans Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sf Trans Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sf Trans Event</em>' reference.
	 * @see #setSfTransEvent(Event)
	 * @see org.muml.simulink.adapter.corrmodel.behavior.BehaviorPackage#getScSyncReceive2sfSyncReceive_SfTransEvent()
	 * @model
	 * @generated
	 */
	Event getSfTransEvent();

	/**
	 * Sets the value of the '{@link org.muml.simulink.adapter.corrmodel.behavior.ScSyncReceive2sfSyncReceive#getSfTransEvent <em>Sf Trans Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sf Trans Event</em>' reference.
	 * @see #getSfTransEvent()
	 * @generated
	 */
	void setSfTransEvent(Event value);

} // ScSyncReceive2sfSyncReceive
