/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Or Exit Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an entry or an exit event. The action associated with this 
 * events will be executed when the state is entered or left respectively.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent#getClockResets <em>Clock Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryOrExitEvent()
 * @model
 * @generated
 */
public interface EntryOrExitEvent extends StateEvent {
	/**
	 * Returns the value of the '<em><b>Clock Resets</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clock resets of this action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Resets</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryOrExitEvent_ClockResets()
	 * @model
	 * @generated
	 */
	EList<Clock> getClockResets();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each entry or exit action can have one or more actions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryOrExitEvent_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

} // EntryOrExitEvent
