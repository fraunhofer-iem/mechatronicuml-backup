/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow;

import org.storydriven.storydiagrams.activities.Activity;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Story Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a component story rule which is used to specifiy reconfiguration of a MechatronicUML component. The actual reconfiguration operation is encapsulated in the contained Activity in order to reuse the existing meta-model for story diagrams. The ComponentStoryRule contains an activity rather than inheriting from an activity to distinguish between the parameter sets.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#getComponentStoryRule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AllThisVariablesHaveSameType='if not self.activity.oclIsUndefined() then\r\n\tself.activity.oclAsType(storydiagrams::activities::Activity).ownedActivityNode->collect(oclAsType(ComponentStoryNode).componentStoryPattern.oclAsType(componentstorypattern::ComponentStoryPattern).thisVariable.oclAsType(componentstorypattern::ComponentVariable).type)->asSet()->size() = 1\r\nelse\r\n\tfalse\r\nendif'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllThisVariablesHaveSameType'"
 * @generated
 */
public interface ComponentStoryRule extends ReconfigurationRule {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#getComponentStoryRule_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryRule#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // ComponentStoryRule
