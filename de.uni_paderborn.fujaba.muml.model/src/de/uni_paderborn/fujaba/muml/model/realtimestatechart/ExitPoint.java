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
 * An ExitPoint is an intermediate pseudostate which makes it possible to chain transitions between different hierarchy levels. An  ExitPoint is used to deactivate a dedicated inner state of an embedded statechart.
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getExitPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtMostOneOutgoingTransition OneIncomingTransition ExitPointAndSourceSameStatechart'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtMostOneOutgoingTransition='self.outgoingTransitions->size() <= 1' OneIncomingTransition='self.incomingTransitions->size() = 1' ExitPointAndSourceSameStatechart='self.incomingTransitions->size() = 1 implies\n\t(not self.incomingTransitions->at(1).source.oclIsUndefined()\n\t and self.incomingTransitions->at(1).source.statechart = self.statechart\n\t)'"
 * @generated
 */
public interface ExitPoint extends Vertex {
} // ExitPoint
