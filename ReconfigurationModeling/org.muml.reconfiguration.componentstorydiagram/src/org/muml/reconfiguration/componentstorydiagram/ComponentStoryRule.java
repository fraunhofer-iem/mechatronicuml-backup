/**
 */
package org.muml.reconfiguration.componentstorydiagram;

import org.muml.reconfiguration.ReconfigurationRule;
import org.storydriven.storydiagrams.activities.Activity;

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
 *   <li>{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule#isConstructor <em>Constructor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage#getComponentStoryRule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ComponentVariableHasToHaveSameTypeAsReconfiguredComponent='-- A ComponentVariable has to have the reconfigured component as type\r\nself.activity.ownedActivityNode->select(oclIsTypeOf(ComponentStoryNode))->forAll(oAN | oAN.oclAsType(ComponentStoryNode).componentStoryPattern.thisVariable.type = self.reconfiguredComponent)\r\nand\r\nself.activity.ownedActivityNode->select(oclIsTypeOf(ControllerExchangeNode))->forAll(oAN | oAN.oclAsType(ControllerExchangeNode).componentStoryPattern.thisVariable.type = self.reconfiguredComponent)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ComponentVariableHasToHaveSameTypeAsReconfiguredComponent'"
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
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage#getComponentStoryRule_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Constructor</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether this ComponentStoryRule is a constructor (true) or not (false). A constructor may be invoked when a component instance
	 * is created. In a constructor, all variables need to have binding operator CREATE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constructor</em>' attribute.
	 * @see #setConstructor(boolean)
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage#getComponentStoryRule_Constructor()
	 * @model default="false"
	 * @generated
	 */
	boolean isConstructor();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryRule#isConstructor <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor</em>' attribute.
	 * @see #isConstructor()
	 * @generated
	 */
	void setConstructor(boolean value);

} // ComponentStoryRule
