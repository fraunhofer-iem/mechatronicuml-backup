/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ComponentStoryRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.Call#getCallee <em>Callee</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.Call#getParameterBinding <em>Parameter Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee</em>' reference.
	 * @see #setCallee(ComponentStoryRule)
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getCall_Callee()
	 * @model required="true"
	 * @generated
	 */
	ComponentStoryRule getCallee();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.Call#getCallee <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee</em>' reference.
	 * @see #getCallee()
	 * @generated
	 */
	void setCallee(ComponentStoryRule value);

	/**
	 * Returns the value of the '<em><b>Parameter Binding</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Binding</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage#getCall_ParameterBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBinding();

} // Call
