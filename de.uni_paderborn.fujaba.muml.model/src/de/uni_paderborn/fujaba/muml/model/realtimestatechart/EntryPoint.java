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
 * Entry points are defined points on a state that can be used to reach inner states.
 * \paragraph{Note}
 * We need this subclass, because GMF forbids using the same semantic
 * element for different notational elements within the same container.
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getEntryPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneOutgoingTransition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OneOutgoingTransition='self.outgoingTransitions->size() = 1'"
 * @generated
 */
public interface EntryPoint extends Vertex {
} // EntryPoint
