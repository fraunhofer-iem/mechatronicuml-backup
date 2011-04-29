/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ExitAction#getExitActionRev <em>Exit Action Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getExitAction()
 * @model
 * @generated
 */
public interface ExitAction extends EntryOrExitAction {
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
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getExitAction_ExitActionRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State#getExitAction
	 * @model opposite="exitAction" transient="false"
	 * @generated
	 */
	State getExitActionRev();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ExitAction#getExitActionRev <em>Exit Action Rev</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Action Rev</em>' container reference.
	 * @see #getExitActionRev()
	 * @generated
	 */
	void setExitActionRev(State value);

} // ExitAction
