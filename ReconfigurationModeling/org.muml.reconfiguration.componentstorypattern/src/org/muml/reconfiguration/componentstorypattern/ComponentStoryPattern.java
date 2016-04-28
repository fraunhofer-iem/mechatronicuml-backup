/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Story Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern#getThisVariable <em>This Variable</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPattern()
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
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getComponentStoryPattern_ThisVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentVariable getThisVariable();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern#getThisVariable <em>This Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This Variable</em>' containment reference.
	 * @see #getThisVariable()
	 * @generated
	 */
	void setThisVariable(ComponentVariable value);

} // ComponentStoryPattern
