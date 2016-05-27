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
 * A representation of the model object '<em><b>Story Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An activity node containing a story pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.activities.StoryNode#isForEach <em>For Each</em>}</li>
 *   <li>{@link org.muml.storydiagram.activities.StoryNode#getStoryPattern <em>Story Pattern</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.activities.ActivitiesPackage#getStoryNode()
 * @model abstract="true"
 * @generated
 */
public interface StoryNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>For Each</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether just one match should be found for the contained pattern (forEach  = false) or whether all matches should be found (forEach = true).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>For Each</em>' attribute.
	 * @see #setForEach(boolean)
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getStoryNode_ForEach()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isForEach();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.activities.StoryNode#isForEach <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Each</em>' attribute.
	 * @see #isForEach()
	 * @generated
	 */
	void setForEach(boolean value);

	/**
	 * Returns the value of the '<em><b>Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story Pattern</em>' reference.
	 * @see org.muml.storydiagram.activities.ActivitiesPackage#getStoryNode_StoryPattern()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	StoryPattern getStoryPattern();

} // StoryNode
