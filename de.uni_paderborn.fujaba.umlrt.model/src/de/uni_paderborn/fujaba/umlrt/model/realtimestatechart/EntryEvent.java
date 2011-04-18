/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryEvent#getEntryActionRev <em>Entry Action Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getEntryEvent()
 * @model
 * @generated
 */
public interface EntryEvent extends EntryOrExitEvent {
	/**
	 * Returns the value of the '<em><b>Entry Action Rev</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getEntryAction <em>Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Action Rev</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Action Rev</em>' container reference.
	 * @see #setEntryActionRev(State)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getEntryEvent_EntryActionRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getEntryAction
	 * @model opposite="entryAction" transient="false"
	 * @generated
	 */
	State getEntryActionRev();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryEvent#getEntryActionRev <em>Entry Action Rev</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Action Rev</em>' container reference.
	 * @see #getEntryActionRev()
	 * @generated
	 */
	void setEntryActionRev(State value);

} // EntryEvent
