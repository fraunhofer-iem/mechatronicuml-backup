/**
 */
package org.muml.psm.muml_container;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.muml.pim.instance.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Component Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.ContainerComponentInstanceConfiguration#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.ContainerComponentInstanceConfiguration#getPortInstanceConfigurations <em>Port Instance Configurations</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.muml_container.Muml_containerPackage#getContainerComponentInstanceConfiguration()
 * @model
 * @generated
 */
public interface ContainerComponentInstanceConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getContainerComponentInstanceConfiguration_ComponentInstance()
	 * @model
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.ContainerComponentInstanceConfiguration#getComponentInstance <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Port Instance Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.muml_container.PortInstanceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instance Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instance Configurations</em>' containment reference list.
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getContainerComponentInstanceConfiguration_PortInstanceConfigurations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PortInstanceConfiguration> getPortInstanceConfigurations();

} // ContainerComponentInstanceConfiguration
