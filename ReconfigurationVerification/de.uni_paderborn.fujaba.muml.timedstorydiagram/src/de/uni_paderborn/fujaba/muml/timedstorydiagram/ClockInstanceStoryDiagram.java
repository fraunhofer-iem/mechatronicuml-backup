/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.timedstorydiagram;

import org.storydriven.storydiagrams.activities.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Instance Story Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage#getClockInstanceStoryDiagram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyContainsTimedActivityNodes='-- A ClockInstanceStoryDiagram may only contain an initial node, a final node, and TimedActivityNodes --\r\nself.ownedActivityNode  -> select(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) or v.oclIsTypeOf(storydiagrams::activities::InitialNode) or v.oclIsTypeOf(storydiagrams::activities::ActivityFinalNode)) -> size() = self.ownedActivityNode -> size()'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyContainsTimedActivityNodes'"
 * @generated
 */
public interface ClockInstanceStoryDiagram extends Activity {

} // ClockInstanceStoryDiagram
