/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities;

import org.muml.storydiagram.patterns.MatchingPattern;
import org.muml.storydiagram.patterns.StoryPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Story Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MatchingStoryNode may only contain a MatchingPattern which does not change the graph. I.e., no element contained in this activity carries a create or destroy annotation. Thus, after executing a MatchingStoryNode, the underlying graph is guaranteed to be unchanged.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.MatchingStoryNode#getOwnedPattern <em>Owned Pattern</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.activities.ActivitiesPackage#getMatchingStoryNode()
 * @model
 * @generated
 */
public interface MatchingStoryNode extends StoryNode {
	/**
	 * Returns the value of the '<em><b>Owned Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This MatchingPattern contained in this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Pattern</em>' containment reference.
	 * @see #setOwnedPattern(MatchingPattern)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getMatchingStoryNode_OwnedPattern()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	MatchingPattern getOwnedPattern();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.MatchingStoryNode#getOwnedPattern <em>Owned Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Pattern</em>' containment reference.
	 * @see #getOwnedPattern()
	 * @generated
	 */
	void setOwnedPattern(MatchingPattern value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL implementation='self.ownedPattern'"
	 * @generated
	 */
	StoryPattern getStoryPattern();

} // MatchingStoryNode
