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
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getExitPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneIncomingTransitionPerRegion OneOutgoingTransition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneIncomingTransitionPerRegion='-- all regions of the parent state have at least one state that connects to the ExitPoint\r\nself.state.regions->forAll(r | \r\n\tr.statechart.states->exists(s |\r\n\t\ts.outgoingTransitions->exists(t | t.target = self)\r\n\t\tor\r\n\t\ts.connectionPoints->select(oclIsKindOf(ExitPoint)).outgoingTransitions->exists(t | t.target = self)\r\n\t)\r\n)' OneOutgoingTransition='self.outgoingTransitions->size() = 1'"
 * @generated
 */
public interface ExitPoint extends ConnectionPoint {
} // ExitPoint
