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
 * An EntyPoint is an intermediate pseudostate which makes it possible to chain transitions between different hierarchy levels. An  EntryPoint is used to activate a dedicated inner state of an embedded statechart.
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneOutgoingTransition EntryPointAndTargetSameStatechart'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OneOutgoingTransition='self.outgoingTransitions->size() = 1' EntryPointAndTargetSameStatechart='self.outgoingTransitions->size() = 1 implies\n\t(not self.outgoingTransitions->at(1).target.oclIsUndefined()\n\t and self.outgoingTransitions->at(1).target.statechart = self.statechart\n\t)'"
 * @generated
 */
public interface EntryPoint extends Vertex {
} // EntryPoint
