/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EntryPoint is an intermediate pseudostate which makes it possible to chain transitions between different hierarchy levels. The EntryPoint is assigned to a state. An EntryPoint is used to activate a dedicated inner state for embedded statecharts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneIncomingTransition OneOutgoingTransitionPerRegion'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneIncomingTransition='self.incomingTransitions ->notEmpty()' OneOutgoingTransitionPerRegion='-- all regions of the parent state have at least one state that the EntryPoint connects to\r\nself.state.regions->forAll(r | \r\n\tr.statechart.states->select(s |\r\n\t\ts.incomingTransitions->exists(t | t.source = self)\r\n\t\tor\r\n\t\ts.entryPoints.incomingTransitions->exists(t | t.source = self)\r\n\t)->size() = 1\r\n)'"
 * @generated
 */
public interface EntryPoint extends Vertex {

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getEntryPoints <em>Entry Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateEntryPoint is assigned to a state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryPoint_State()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getEntryPoints
	 * @model opposite="entryPoints" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);
} // EntryPoint
