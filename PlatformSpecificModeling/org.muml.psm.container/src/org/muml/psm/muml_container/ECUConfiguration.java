/**
 */
package org.muml.psm.muml_container;

import org.eclipse.emf.common.util.EList;

import org.muml.core.NamedElement;

import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECU Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.ECUConfiguration#getStructuredResourceInstance <em>Structured Resource Instance</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.ECUConfiguration#getComponentContainers <em>Component Containers</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.muml_container.Muml_containerPackage#getECUConfiguration()
 * @model
 * @generated
 */
public interface ECUConfiguration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Structured Resource Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Resource Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Resource Instance</em>' reference.
	 * @see #setStructuredResourceInstance(StructuredResourceInstance)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getECUConfiguration_StructuredResourceInstance()
	 * @model
	 * @generated
	 */
	StructuredResourceInstance getStructuredResourceInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.ECUConfiguration#getStructuredResourceInstance <em>Structured Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Resource Instance</em>' reference.
	 * @see #getStructuredResourceInstance()
	 * @generated
	 */
	void setStructuredResourceInstance(StructuredResourceInstance value);

	/**
	 * Returns the value of the '<em><b>Component Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.muml_container.ComponentContainer}.
	 * It is bidirectional and its opposite is '{@link org.muml.psm.muml_container.ComponentContainer#getEcuConfiguration <em>Ecu Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Containers</em>' containment reference list.
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getECUConfiguration_ComponentContainers()
	 * @see org.muml.psm.muml_container.ComponentContainer#getEcuConfiguration
	 * @model opposite="ecuConfiguration" containment="true" ordered="false"
	 * @generated
	 */
	EList<ComponentContainer> getComponentContainers();

} // ECUConfiguration
