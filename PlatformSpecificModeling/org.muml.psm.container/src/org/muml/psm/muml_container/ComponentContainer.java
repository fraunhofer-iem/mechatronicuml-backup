/**
 */
package org.muml.psm.muml_container;

import org.eclipse.emf.common.util.EList;

import org.muml.core.NamedElement;

import org.muml.pim.component.Component;

import org.muml.pim.instance.ComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.ComponentContainer#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.ComponentContainer#getComponentInstanceConfigurations <em>Component Instance Configurations</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.ComponentContainer#getEcuConfiguration <em>Ecu Configuration</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.ComponentContainer#getComponentInstances <em>Component Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.muml_container.Muml_containerPackage#getComponentContainer()
 * @model
 * @generated
 */
public interface ComponentContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(Component)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getComponentContainer_ComponentType()
	 * @model
	 * @generated
	 */
	Component getComponentType();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.ComponentContainer#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(Component value);

	/**
	 * Returns the value of the '<em><b>Component Instance Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.psm.muml_container.ContainerComponentInstanceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance Configurations</em>' containment reference list.
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getComponentContainer_ComponentInstanceConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerComponentInstanceConfiguration> getComponentInstanceConfigurations();

	/**
	 * Returns the value of the '<em><b>Ecu Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.psm.muml_container.ECUConfiguration#getComponentContainers <em>Component Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecu Configuration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecu Configuration</em>' container reference.
	 * @see #setEcuConfiguration(ECUConfiguration)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getComponentContainer_EcuConfiguration()
	 * @see org.muml.psm.muml_container.ECUConfiguration#getComponentContainers
	 * @model opposite="componentContainers" transient="false"
	 * @generated
	 */
	ECUConfiguration getEcuConfiguration();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.ComponentContainer#getEcuConfiguration <em>Ecu Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecu Configuration</em>' container reference.
	 * @see #getEcuConfiguration()
	 * @generated
	 */
	void setEcuConfiguration(ECUConfiguration value);

	/**
	 * Returns the value of the '<em><b>Component Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instances</em>' reference list.
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getComponentContainer_ComponentInstances()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstances();

} // ComponentContainer
