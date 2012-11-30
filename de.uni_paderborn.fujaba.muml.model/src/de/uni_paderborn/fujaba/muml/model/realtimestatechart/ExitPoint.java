/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExitPoint is an intermediate pseudostate which makes it possible to chain transitions between different hierarchy levels. The ExitPoint is assigned to a state. An ExitPoint is used to jointly deactivate dedicated inner states of embedded statecharts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getExitPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneIncomingTransitionPerRegion OneOutgoingTransition ExitPointsOnlyAtCompositeStates'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneIncomingTransitionPerRegion='-- all regions of the parent state have at least one state that connects to the ExitPoint\r\nself.state.regions->forAll(r | \r\n\tr.statechart.states->exists(s |\r\n\t\ts.outgoingTransitions->exists(t | t.target = self)\r\n\t\tor\r\n\t\ts.exitPoints.outgoingTransitions->exists(t | t.target = self)\r\n\t)\r\n)' OneOutgoingTransition='self.outgoingTransitions->size() = 1' ExitPointsOnlyAtCompositeStates='not self.state.simple'"
 * @generated
 */
public interface ExitPoint extends Vertex {

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getExitPoints <em>Exit Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateExitPoint is assigned to a state. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getExitPoint_State()
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.State#getExitPoints
	 * @model opposite="exitPoints" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);
} // ExitPoint
