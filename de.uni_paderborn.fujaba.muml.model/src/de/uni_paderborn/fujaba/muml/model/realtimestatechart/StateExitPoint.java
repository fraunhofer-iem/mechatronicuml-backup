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
 * A representation of the model object '<em><b>State Exit Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The StateExitPoint is assigned to a state. An EntyPoint is an intermediate pseudostate which reference ExitPoints of embedded statecharts. The incoming transition of the referenced ExitPoints on the lower hierarchy level are chained with the outgoing transition of the StateExitPoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint#getState <em>State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint#getExitPoint <em>Exit Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateExitPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneOutgoingTransition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OneOutgoingTransition='self.outgoingTransitions->size() = 1'"
 * @generated
 */
public interface StateExitPoint extends Vertex {
	/**
	 * Returns the value of the '<em><b>Exit Point</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Point</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateExitPoint_ExitPoint()
	 * @model required="true"
	 * @generated
	 */
	EList<ExitPoint> getExitPoint();

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getStateExitPoints <em>State Exit Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateExitPoint_State()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getStateExitPoints
	 * @model opposite="stateExitPoints" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateExitPoint#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // StateExitPoint
