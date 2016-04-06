/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The StepGraph contains all objects currently contained in the graph.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getChangeableNodes <em>Changeable Nodes</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getContains <em>Contains</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getUnchangeableNodes <em>Unchangeable Nodes</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph#getContainedNodes <em>Contained Nodes</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getStepGraph()
 * @model
 * @generated
 */
public interface StepGraph extends ReachabilityGraphState {
	/**
	 * Returns the value of the '<em><b>Changeable Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the nodes inside this StepGraph that are changeable throughout the 
	 * reachability analysis. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Changeable Nodes</em>' reference list.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getStepGraph_ChangeableNodes()
	 * @model
	 * @generated
	 */
	EList<EObject> getChangeableNodes();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the union of changeable and unchangeable nodes. The objects in this
	 * reference constitute the graph that is represented by this StepGraph object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getStepGraph_Contains()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EObject> getContains();

	/**
	 * Returns the value of the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unchangeable Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the nodes inside this StepGraph that will never change throughout the 
	 * reachability analysis. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unchangeable Nodes</em>' reference list.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getStepGraph_UnchangeableNodes()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<EObject> getUnchangeableNodes();

	/**
	 * Returns the value of the '<em><b>Contained Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference can be used to contain graph objects referenced by the changeableNodes reference if they are not yet contained in any other object or resource. 
	 * By containing these nodes in the StepGraph, we enable to store the reachability graph in a resource and save it to a file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Nodes</em>' containment reference list.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getStepGraph_ContainedNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContainedNodes();

} // StepGraph
