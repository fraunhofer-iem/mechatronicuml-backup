/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor;

import de.uni_paderborn.fujaba.umlrt.model.component.AtomicComponent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Component Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomicComponentDiagram#getAtomicComponent <em>Atomic Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomiccomponenteditorPackage#getAtomicComponentDiagram()
 * @model
 * @generated
 */
public interface AtomicComponentDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Atomic Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atomic Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomic Component</em>' containment reference.
	 * @see #setAtomicComponent(AtomicComponent)
	 * @see de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomiccomponenteditorPackage#getAtomicComponentDiagram_AtomicComponent()
	 * @model containment="true"
	 * @generated
	 */
	AtomicComponent getAtomicComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomicComponentDiagram#getAtomicComponent <em>Atomic Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomic Component</em>' containment reference.
	 * @see #getAtomicComponent()
	 * @generated
	 */
	void setAtomicComponent(AtomicComponent value);

} // AtomicComponentDiagram
