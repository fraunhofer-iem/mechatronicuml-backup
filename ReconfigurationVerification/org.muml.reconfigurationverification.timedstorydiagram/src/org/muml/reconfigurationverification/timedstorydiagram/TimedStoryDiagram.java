/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram;

import org.eclipse.emf.common.util.EList;
import org.muml.storydiagram.activities.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Story Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram#getClockInstConstraint <em>Clock Inst Constraint</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram#getResets <em>Resets</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram#getMinDuration <em>Min Duration</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram#getMaxDuration <em>Max Duration</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedStoryDiagram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL validDurations='self.minDuration >= 0 and self.minDuration <= self.maxDuration' OnlyContainsTimedActivityNodes='-- A TimedStoryDiagram may only contain an initial node, a final node, TimedActivityNodes, StatementNodes, and ActivityCallNodes --\r\nself.ownedActivityNode  -> select(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) or v.oclIsTypeOf(storydiagrams::activities::InitialNode) or v.oclIsTypeOf(storydiagrams::activities::ActivityFinalNode) or \r\nv.oclIsTypeOf(storydiagrams::activities::ActivityCallNode) or v.oclIsTypeOf(storydiagrams::activities::JunctionNode) or v.oclIsTypeOf(storydiagrams::activities::StatementNode)) -> size() = self.ownedActivityNode -> size()'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validDurations OnlyContainsTimedActivityNodes'"
 * @generated
 */
public interface TimedStoryDiagram extends Activity {
	/**
	 * Returns the value of the '<em><b>Clock Inst Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Inst Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Inst Constraint</em>' containment reference list.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedStoryDiagram_ClockInstConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockInstanceConstraint> getClockInstConstraint();

	/**
	 * Returns the value of the '<em><b>Resets</b></em>' reference list.
	 * The list contents are of type {@link org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resets</em>' reference list.
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedStoryDiagram_Resets()
	 * @model
	 * @generated
	 */
	EList<ClockInstanceVariable> getResets();

	/**
	 * Returns the value of the '<em><b>Min Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Duration</em>' attribute.
	 * @see #setMinDuration(int)
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedStoryDiagram_MinDuration()
	 * @model default="0"
	 * @generated
	 */
	int getMinDuration();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram#getMinDuration <em>Min Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Duration</em>' attribute.
	 * @see #getMinDuration()
	 * @generated
	 */
	void setMinDuration(int value);

	/**
	 * Returns the value of the '<em><b>Max Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Duration</em>' attribute.
	 * @see #setMaxDuration(int)
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#getTimedStoryDiagram_MaxDuration()
	 * @model default="0"
	 * @generated
	 */
	int getMaxDuration();

	/**
	 * Sets the value of the '{@link org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram#getMaxDuration <em>Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Duration</em>' attribute.
	 * @see #getMaxDuration()
	 * @generated
	 */
	void setMaxDuration(int value);

} // TimedStoryDiagram
