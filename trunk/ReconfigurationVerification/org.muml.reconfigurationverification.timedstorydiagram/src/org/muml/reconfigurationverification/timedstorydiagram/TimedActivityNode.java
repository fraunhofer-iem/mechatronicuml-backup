/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram;

import org.muml.storydiagram.activities.ModifyingStoryNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode#getOwnedTimedStoryPattern <em>Owned Timed Story Pattern</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedActivityNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TimedActivityNodeMayOnlyContainTimedStoryPattern'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL TimedActivityNodeMayOnlyContainTimedStoryPattern='self.ownedRule.oclIsKindOf(timedstorydiagram::TimedStoryPattern)'"
 * @generated
 */
public interface TimedActivityNode extends ModifyingStoryNode {

	/**
	 * Returns the value of the '<em><b>Owned Timed Story Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Timed Story Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Timed Story Pattern</em>' reference.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedActivityNode_OwnedTimedStoryPattern()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(self.ownedRule.oclIsKindOf(timedstorydiagram::TimedStoryPattern) )then self.ownedRule.oclAsType(timedstorydiagram::TimedStoryPattern) else null endif'"
	 * @generated
	 */
	TimedStoryPattern getOwnedTimedStoryPattern();

} // TimedActivityNode
