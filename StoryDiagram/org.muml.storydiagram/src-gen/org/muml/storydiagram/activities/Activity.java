/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.muml.core.NamedElement;
import org.muml.storydiagram.calls.Callable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The diagram that describes the control flow of an operation. It is used to structure a number story patterns into a stroy diagram. Story patterns are contained in activity nodes which are connected by activity edges. In addition, there are special nodes like start, stop, and juction nodes.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.Activity#getOwningOperation <em>Owning Operation</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.Activity#getOwnedActivityEdges <em>Owned Activity Edges</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.Activity#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.Activity#getOwnedActivityNodes <em>Owned Activity Nodes</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.Activity#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Callable, NamedElement {
	/**
	 * Returns the value of the '<em><b>Owning Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.activities.OperationExtension#getOwnedActivity <em>Owned Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Operation</em>' container reference.
	 * @see #setOwningOperation(OperationExtension)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivity_OwningOperation()
	 * @see org.muml.storydiagram.activities.OperationExtension#getOwnedActivity
	 * @model opposite="ownedActivity" transient="false" ordered="false"
	 * @generated
	 */
	OperationExtension getOwningOperation();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.Activity#getOwningOperation <em>Owning Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Operation</em>' container reference.
	 * @see #getOwningOperation()
	 * @generated
	 */
	void setOwningOperation(OperationExtension value);

	/**
	 * Returns the value of the '<em><b>Owned Activity Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.activities.ActivityEdge#getOwningActivity <em>Owning Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All ActivityEdges that are contained in this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Activity Edges</em>' containment reference list.
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivity_OwnedActivityEdges()
	 * @see org.muml.storydiagram.activities.ActivityEdge#getOwningActivity
	 * @model opposite="owningActivity" containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getOwnedActivityEdges();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a story node which represents the precondition for the execution of the activity. I.e., the activity is executed, iff the object structure in the story node can be matched. Obviously the referenced story node may only contain black (i.e., non-create and non-destroy) objects and links.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' reference.
	 * @see #setPrecondition(MatchingStoryNode)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivity_Precondition()
	 * @model ordered="false"
	 * @generated
	 */
	MatchingStoryNode getPrecondition();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.Activity#getPrecondition <em>Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(MatchingStoryNode value);

	/**
	 * Returns the value of the '<em><b>Owned Activity Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.activities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.activities.ActivityNode#getOwningActivity <em>Owning Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The activity contains all activity nodes via this reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Activity Nodes</em>' containment reference list.
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivity_OwnedActivityNodes()
	 * @see org.muml.storydiagram.activities.ActivityNode#getOwningActivity
	 * @model opposite="owningActivity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getOwnedActivityNodes();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivity_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAnnotation> getAnnotations();

} // Activity
