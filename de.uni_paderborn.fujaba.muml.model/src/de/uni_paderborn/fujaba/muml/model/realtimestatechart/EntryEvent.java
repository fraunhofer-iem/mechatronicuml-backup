/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entry action is executed if a state is activated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryEvent#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryEvent()
 * @model
 * @generated
 */
public interface EntryEvent extends EntryOrExitEvent {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getEntryEvent <em>Entry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state this entry action belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryEvent_State()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getEntryEvent
	 * @model opposite="entryEvent" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryEvent#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // EntryEvent
