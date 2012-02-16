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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtMostOneOutgoingTransition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AtMostOneOutgoingTransition='self.outgoingTransitions->size() <= 1'"
 * @generated
 */
public interface ExitPoint extends Vertex {
} // ExitPoint
