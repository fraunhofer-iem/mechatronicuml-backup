/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all kinds of nodes that may be added to an activity. This class provides the basic functionality of connecting the activity nodes in the activity by ActivityEdges.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.ActivityNode#getOutgoings <em>Outgoings</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.ActivityNode#getOwningActivity <em>Owning Activity</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.ActivityNode#getOwningActivityNode <em>Owning Activity Node</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.ActivityNode#getIncomings <em>Incomings</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Outgoings</b></em>' reference list.
	 * The list contents are of type {@link org.muml.storydiagram.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.activities.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All ActivityEdges that leave this activity node. The guards of the outgoing activity edges must be exclusive in order to obtain a well-defined activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoings</em>' reference list.
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivityNode_Outgoings()
	 * @see org.muml.storydiagram.activities.ActivityEdge#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoings();

	/**
	 * Returns the value of the '<em><b>Owning Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.activities.Activity#getOwnedActivityNodes <em>Owned Activity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Points to the activity this ActivityNode is contained in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Activity</em>' container reference.
	 * @see #setOwningActivity(Activity)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivityNode_OwningActivity()
	 * @see org.muml.storydiagram.activities.Activity#getOwnedActivityNodes
	 * @model opposite="ownedActivityNodes" transient="false" ordered="false"
	 * @generated
	 */
	Activity getOwningActivity();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.ActivityNode#getOwningActivity <em>Owning Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Activity</em>' container reference.
	 * @see #getOwningActivity()
	 * @generated
	 */
	void setOwningActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Owning Activity Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.activities.StructuredNode#getOwnedActivityNodes <em>Owned Activity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent node if this node is contained in a StructuredNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Activity Node</em>' container reference.
	 * @see #setOwningActivityNode(StructuredNode)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivityNode_OwningActivityNode()
	 * @see org.muml.storydiagram.activities.StructuredNode#getOwnedActivityNodes
	 * @model opposite="ownedActivityNodes" transient="false" ordered="false"
	 * @generated
	 */
	StructuredNode getOwningActivityNode();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.ActivityNode#getOwningActivityNode <em>Owning Activity Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Activity Node</em>' container reference.
	 * @see #getOwningActivityNode()
	 * @generated
	 */
	void setOwningActivityNode(StructuredNode value);

	/**
	 * Returns the value of the '<em><b>Incomings</b></em>' reference list.
	 * The list contents are of type {@link org.muml.storydiagram.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.activities.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All ActivityEdges entering this activity node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incomings</em>' reference list.
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getActivityNode_Incomings()
	 * @see org.muml.storydiagram.activities.ActivityEdge#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getIncomings();

} // ActivityNode
