/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.muml.storydiagram.activities.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Transformation System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Helper class that contains all activities to be used by this reachability analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem#getUnchangeableNodes <em>Unchangeable Nodes</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getGraphTransformationSystem()
 * @model
 * @generated
 */
public interface GraphTransformationSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link org.muml.storydiagram.activities.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getGraphTransformationSystem_Activities()
	 * @model
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Unchangeable Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unchangeable Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unchangeable Nodes</em>' reference list.
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#getGraphTransformationSystem_UnchangeableNodes()
	 * @model
	 * @generated
	 */
	EList<EClass> getUnchangeableNodes();

} // GraphTransformationSystem
