/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Story Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern#getThisVariable <em>This Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPattern()
 * @model
 * @generated
 */
public interface ComponentStoryPattern extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>This Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This Variable</em>' containment reference.
	 * @see #setThisVariable(ComponentVariable)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPattern_ThisVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentVariable getThisVariable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentStoryPattern#getThisVariable <em>This Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This Variable</em>' containment reference.
	 * @see #getThisVariable()
	 * @generated
	 */
	void setThisVariable(ComponentVariable value);

} // ComponentStoryPattern
