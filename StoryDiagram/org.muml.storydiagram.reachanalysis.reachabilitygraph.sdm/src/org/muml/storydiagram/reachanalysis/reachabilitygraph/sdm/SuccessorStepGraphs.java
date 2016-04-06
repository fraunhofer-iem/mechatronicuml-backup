/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Successor Step Graphs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs#getSuccessors <em>Successors</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getSuccessorStepGraphs()
 * @model
 * @generated
 */
public interface SuccessorStepGraphs extends EObject {
	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getSuccessorStepGraphs_Successors()
	 * @model
	 * @generated
	 */
	EList<StepGraph> getSuccessors();

} // SuccessorStepGraphs
