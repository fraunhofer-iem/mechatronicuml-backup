/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities;

import org.muml.storydiagram.patterns.StoryPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifying Story Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ModifyingStoryNode contains a story pattern which may change the underlying graph upon execution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.ModifyingStoryNode#getOwnedRule <em>Owned Rule</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.activities.ActivitiesPackage#getModifyingStoryNode()
 * @model
 * @generated
 */
public interface ModifyingStoryNode extends StoryNode {
	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The story pattern contained in this ModifyingStoryNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference.
	 * @see #setOwnedRule(StoryPattern)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getModifyingStoryNode_OwnedRule()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StoryPattern getOwnedRule();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.ModifyingStoryNode#getOwnedRule <em>Owned Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Rule</em>' containment reference.
	 * @see #getOwnedRule()
	 * @generated
	 */
	void setOwnedRule(StoryPattern value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL implementation='self.ownedRule'"
	 * @generated
	 */
	StoryPattern getStoryPattern();

} // ModifyingStoryNode
