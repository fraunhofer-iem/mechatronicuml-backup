/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EntryPoint is an intermediate pseudostate which makes it possible to chain transitions between different hierarchy levels. The EntryPoint is assigned to a state. An EntryPoint is used to activate a dedicated inner state for embedded statecharts.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pim.realtimestatechart.RealtimestatechartPackage#getEntryPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneIncomingTransition OneOutgoingTransitionPerRegion'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneIncomingTransition='-- Entry point needs at least one incoming transition\nself.incomingTransitions ->notEmpty()' OneOutgoingTransitionPerRegion='-- all regions of the parent state must have exactly one vertex that the EntryPoint connects to\r\n(not self.state.oclIsUndefined()) implies self.state.embeddedStatecharts->forAll(r |\r\n\tself.outgoingTransitions->one(t |\r\n\t\t(t.target.oclIsKindOf(State) and t.target.oclAsType(State).parentStatechart = r)\r\n\t\tor\r\n\t\t(t.target.oclIsKindOf(EntryPoint) and t.target.oclAsType(EntryPoint).state.parentStatechart = r)\r\n\t)\r\n)'"
 * @generated
 */
public interface EntryPoint extends StateConnectionPoint {
} // EntryPoint
