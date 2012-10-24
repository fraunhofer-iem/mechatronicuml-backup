/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow;

import org.storydriven.storydiagrams.activities.ActivityNode;

import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentStoryPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Story Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A component story nodes contains a component story pattern. In a component story rule, only component story pattern but no normal story pattern may be used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode#getComponentStoryPattern <em>Component Story Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#getComponentStoryNode()
 * @model
 * @generated
 */
public interface ComponentStoryNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Component Story Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Story Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Story Pattern</em>' containment reference.
	 * @see #setComponentStoryPattern(ComponentStoryPattern)
	 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage#getComponentStoryNode_ComponentStoryPattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentStoryPattern getComponentStoryPattern();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryNode#getComponentStoryPattern <em>Component Story Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Story Pattern</em>' containment reference.
	 * @see #getComponentStoryPattern()
	 * @generated
	 */
	void setComponentStoryPattern(ComponentStoryPattern value);

} // ComponentStoryNode
