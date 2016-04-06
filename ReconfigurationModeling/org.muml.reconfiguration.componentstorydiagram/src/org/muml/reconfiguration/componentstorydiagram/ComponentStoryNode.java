/**
 */
package org.muml.reconfiguration.componentstorydiagram;

import org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern;
import org.muml.storydiagram.activities.ActivityNode;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode#getComponentStoryPattern <em>Component Story Pattern</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode#isForEach <em>For Each</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage#getComponentStoryNode()
 * @model
 * @generated
 */
public interface ComponentStoryNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Component Story Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Story Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Story Pattern</em>' containment reference.
	 * @see #setComponentStoryPattern(ComponentStoryPattern)
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage#getComponentStoryNode_ComponentStoryPattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentStoryPattern getComponentStoryPattern();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode#getComponentStoryPattern <em>Component Story Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Story Pattern</em>' containment reference.
	 * @see #getComponentStoryPattern()
	 * @generated
	 */
	void setComponentStoryPattern(ComponentStoryPattern value);

	/**
	 * Returns the value of the '<em><b>For Each</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Each</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Each</em>' attribute.
	 * @see #setForEach(boolean)
	 * @see org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage#getComponentStoryNode_ForEach()
	 * @model default="false"
	 * @generated
	 */
	boolean isForEach();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorydiagram.ComponentStoryNode#isForEach <em>For Each</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Each</em>' attribute.
	 * @see #isForEach()
	 * @generated
	 */
	void setForEach(boolean value);

} // ComponentStoryNode
