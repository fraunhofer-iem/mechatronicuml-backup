/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart;


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
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getEntryPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastOneIncomingTransition OneOutgoingTransitionPerRegion'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtLeastOneIncomingTransition='self.incomingTransitions ->notEmpty()' OneOutgoingTransitionPerRegion='-- all regions of the parent state must have exactly one state that the EntryPoint connects to\r\nself.state.embeddedRegions->forAll(r | \r\n\tr.embeddedStatechart.states->select(s |\r\n\t\ts.incomingTransitions->exists(t | t.source = self)\r\n\t\tor\r\n\t\ts.connectionPoints->select(oclIsKindOf(EntryPoint)).incomingTransitions->exists(t | t.source = self)\r\n\t)->size() = 1\r\n)'"
 * @generated
 */
public interface EntryPoint extends StateConnectionPoint {
} // EntryPoint
