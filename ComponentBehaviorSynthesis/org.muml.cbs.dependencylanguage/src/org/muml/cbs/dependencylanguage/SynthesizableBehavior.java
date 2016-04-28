/**
 */
package org.muml.cbs.dependencylanguage;

import org.muml.mumlcore.Extension;
import org.muml.pim.behavior.BehavioralElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synthesizable Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the container for the dependencies.
 * It inherits from BehavioralElement to store the inner-behavior.
 * It can be stored at a AtomicComponent through the Extension inheritance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.SynthesizableBehavior#getDependencyModel <em>Dependency Model</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.SynthesizableBehavior#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynthesizableBehavior()
 * @model
 * @generated
 */
public interface SynthesizableBehavior extends Extension, BehavioralElement {
	/**
	 * Returns the value of the '<em><b>Dependency Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for all Dependency of one Atomic Component, Input for the XText Editor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency Model</em>' containment reference.
	 * @see #setDependencyModel(DependencyModel)
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynthesizableBehavior_DependencyModel()
	 * @model containment="true"
	 * @generated
	 */
	DependencyModel getDependencyModel();

	/**
	 * Sets the value of the '{@link org.muml.cbs.dependencylanguage.SynthesizableBehavior#getDependencyModel <em>Dependency Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Model</em>' containment reference.
	 * @see #getDependencyModel()
	 * @generated
	 */
	void setDependencyModel(DependencyModel value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name of the Atomic Component + '-synth'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.muml.cbs.dependencylanguage.DependencylanguagePackage#getSynthesizableBehavior_Name()
	 * @model changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if(not self.base.oclIsUndefined() and self.base.oclIsKindOf(component::AtomicComponent))\nthen (self.base).oclAsType(component::AtomicComponent).name.concat(\'-synth\')\nelse\nnull endif'"
	 * @generated
	 */
	String getName();

} // SynthesizableBehavior
