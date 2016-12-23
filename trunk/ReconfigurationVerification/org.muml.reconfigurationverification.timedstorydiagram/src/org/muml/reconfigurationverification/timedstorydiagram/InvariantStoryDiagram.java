/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram;

import org.muml.storydiagram.activities.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant Story Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram#getClockInstConstraint <em>Clock Inst Constraint</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getInvariantStoryDiagram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoModificationInInvariantRule OnlyContainsTimedActivityNodes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoModificationInInvariantRule='-- In an InvariantStoryDiagram, all TimedActivityNodes need to be non-modifying--\r\nself.ownedActivityNode -> forAll(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) implies (v.oclAsType(timedstorydiagram::TimedActivityNode).ownedRule.oclAsType(timedstorydiagram::TimedStoryPattern).nonModifyingStoryPattern = true))' OnlyContainsTimedActivityNodes='-- An InvariantStoryDiagram may only contain an initial node, a final node, and TimedActivityNodes --\r\nself.ownedActivityNode  -> select(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) or v.oclIsTypeOf(storydiagrams::activities::InitialNode) or v.oclIsTypeOf(storydiagrams::activities::ActivityFinalNode)) -> size() = self.ownedActivityNode -> size()'"
 * @generated
 */
public interface InvariantStoryDiagram extends Activity {
	/**
	 * Returns the value of the '<em><b>Clock Inst Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Inst Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Inst Constraint</em>' containment reference.
	 * @see #setClockInstConstraint(ClockInstanceConstraint)
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getInvariantStoryDiagram_ClockInstConstraint()
	 * @model containment="true"
	 * @generated
	 */
	ClockInstanceConstraint getClockInstConstraint();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram#getClockInstConstraint <em>Clock Inst Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Inst Constraint</em>' containment reference.
	 * @see #getClockInstConstraint()
	 * @generated
	 */
	void setClockInstConstraint(ClockInstanceConstraint value);

} // InvariantStoryDiagram
