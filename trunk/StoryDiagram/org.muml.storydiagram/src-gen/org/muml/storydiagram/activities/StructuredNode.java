/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured node is a node that contains several other activities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.StructuredNode#getOwnedActivityNodes <em>Owned Activity Nodes</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.activities.ActivitiesPackage#getStructuredNode()
 * @model
 * @generated
 */
public interface StructuredNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Owned Activity Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.activities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.activities.ActivityNode#getOwningActivityNode <em>Owning Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All subnodes which are contained in this structured node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Activity Nodes</em>' containment reference list.
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getStructuredNode_OwnedActivityNodes()
	 * @see org.muml.storydiagram.activities.ActivityNode#getOwningActivityNode
	 * @model opposite="owningActivityNode" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getOwnedActivityNodes();

} // StructuredNode
