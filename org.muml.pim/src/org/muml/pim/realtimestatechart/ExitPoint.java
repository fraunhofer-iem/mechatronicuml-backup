/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;


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
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getExitPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneIncomingTransitionPerRegion OneOutgoingTransition AtMostOneConnectingRegionWithSynchronizations AtMostOneConnectingRegionWithTriggerMessageEvents'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneIncomingTransitionPerRegion='-- all regions of the parent state must have at least one vertex that connects to the ExitPoint\r\n(not self.state.oclIsUndefined()) implies self.state.embeddedRegions->forAll(r |\r\n\tself.incomingTransitions->exists(t |\r\n\t\t(t.source.oclIsKindOf(State) and t.source.oclAsType(State).parentStatechart.parentRegion = r)\r\n\t\tor\r\n\t\t(t.source.oclIsKindOf(ExitPoint) and t.source.oclAsType(ExitPoint).state.parentStatechart.parentRegion = r)\r\n\t)\r\n)' OneOutgoingTransition='-- Exit point must have exactly one outgoing transition\nself.outgoingTransitions->size() = 1' AtMostOneConnectingRegionWithSynchronizations='-- There must be at most one region with synchronizing transitions that connect (directly or indirectly) to the exit point\r\n\r\nlet exitTransitions : Collection(Transition) = \r\n\r\nself.incomingTransitions->union(\r\n   self.incomingTransitions->closure(t | \r\n\tif t.source.oclIsKindOf(ExitPoint)\r\n\tthen t.source.incomingTransitions\r\n\telse Sequence{}\r\n\tendif\r\n   )\r\n)\r\n\r\nin exitTransitions->forAll(t1 : Transition, t2: Transition | (t1 <> t2 and (not t1.synchronization.oclIsUndefined()) and (not t2.synchronization.oclIsUndefined())) implies (t1.statechart = t2.statechart))' AtMostOneConnectingRegionWithTriggerMessageEvents='-- There must be at most one region with transitions that have a trigger message event and connect (directly or indirectly) to the exit point\r\n\r\nlet exitTransitions : Collection(Transition) = \r\n\r\nself.incomingTransitions->union(\r\n   self.incomingTransitions->closure(t | \r\n\tif t.source.oclIsKindOf(ExitPoint)\r\n\tthen t.source.incomingTransitions\r\n\telse Sequence{}\r\n\tendif\r\n   )\r\n)\r\n\r\nin exitTransitions->forAll(t1 : Transition, t2: Transition | (t1 <> t2 and (not t1.triggerMessageEvent.oclIsUndefined()) and (not t2.triggerMessageEvent.oclIsUndefined())) implies (t1.statechart = t2.statechart))'"
 * @generated
 */
public interface ExitPoint extends StateConnectionPoint {
} // ExitPoint
