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
 * A representation of the model object '<em><b>State Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The StateEntryPoint is assigned to a state. An EntyPoint is an intermediate pseudostate which reference EntryPoints of embedded statecharts. The incoming transitions are chained with the outgoing transition of the referenced EntryPoints on the lower hierarchy level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint#getState <em>State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint#getEntryPoint <em>Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateEntryPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneIncomingTransition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneIncomingTransition='self.incomingTransitions ->size()>0'"
 * @generated
 */
public interface StateEntryPoint extends Vertex {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateEntryPoint_EntryPoint()
	 * @model required="true"
	 * @generated
	 */
	EList<EntryPoint> getEntryPoint();

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getStateEntryPoints <em>State Entry Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getStateEntryPoint_State()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getStateEntryPoints
	 * @model opposite="stateEntryPoints" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryPoint#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // StateEntryPoint
