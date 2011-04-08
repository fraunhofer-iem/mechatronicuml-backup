/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Or Exit Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getEntryActionRev <em>Entry Action Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getExitActionRev <em>Exit Action Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getUMLRealtimeAction <em>UML Realtime Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getEntryOrExitEvent()
 * @model
 * @generated
 */
public interface EntryOrExitEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Resets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resets</em>' reference.
	 * @see #setResets(Clock)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getEntryOrExitEvent_Resets()
	 * @model
	 * @generated
	 */
	Clock getResets();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getResets <em>Resets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resets</em>' reference.
	 * @see #getResets()
	 * @generated
	 */
	void setResets(Clock value);

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getEntryOrExitEvent_EntryActionRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getEntryAction
	 * @model opposite="entryAction" transient="false"
	 * @generated
	 */
	State getEntryActionRev();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getEntryActionRev <em>Entry Action Rev</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Action Rev</em>' container reference.
	 * @see #getEntryActionRev()
	 * @generated
	 */
	void setEntryActionRev(State value);

	/**
	 * Returns the value of the '<em><b>Exit Action Rev</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getExitAction <em>Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Action Rev</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Action Rev</em>' container reference.
	 * @see #setExitActionRev(State)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getEntryOrExitEvent_ExitActionRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getExitAction
	 * @model opposite="exitAction" transient="false"
	 * @generated
	 */
	State getExitActionRev();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getExitActionRev <em>Exit Action Rev</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Action Rev</em>' container reference.
	 * @see #getExitActionRev()
	 * @generated
	 */
	void setExitActionRev(State value);

	/**
	 * Returns the value of the '<em><b>UML Realtime Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Action</em>' reference.
	 * @see #setUMLRealtimeAction(Action)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getEntryOrExitEvent_UMLRealtimeAction()
	 * @model
	 * @generated
	 */
	Action getUMLRealtimeAction();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent#getUMLRealtimeAction <em>UML Realtime Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Action</em>' reference.
	 * @see #getUMLRealtimeAction()
	 * @generated
	 */
	void setUMLRealtimeAction(Action value);

} // EntryOrExitEvent
