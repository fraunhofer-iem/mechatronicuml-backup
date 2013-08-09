/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart;


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
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getExitPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneIncomingTransitionPerRegion OneOutgoingTransition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneIncomingTransitionPerRegion='-- all regions of the parent state must have at least one vertex that connects to the ExitPoint\r\nself.state.embeddedRegions->forAll(r |\r\n\tself.incomingTransitions->exists(t |\r\n\t\t(t.source.oclIsKindOf(State) and t.source.oclAsType(State).parentStatechart.parentRegion = r)\r\n\t\tor\r\n\t\t(t.source.oclIsKindOf(ExitPoint) and t.source.oclAsType(ExitPoint).state.parentStatechart.parentRegion = r)\r\n\t)\r\n)' OneOutgoingTransition='self.outgoingTransitions->size() = 1'"
 * @generated
 */
public interface ExitPoint extends StateConnectionPoint {
} // ExitPoint
