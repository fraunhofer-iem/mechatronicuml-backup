/**
 */
package org.muml.psm.muml_container;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Port Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.MultiPortInstanceConfiguration#getPortInstanceConfigurations <em>Port Instance Configurations</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.muml_container.Muml_containerPackage#getMultiPortInstanceConfiguration()
 * @model
 * @generated
 */
public interface MultiPortInstanceConfiguration extends PortInstanceConfiguration {
	/**
	 * Returns the value of the '<em><b>Port Instance Configurations</b></em>' reference list.
	 * The list contents are of type {@link org.muml.psm.muml_container.PortInstanceConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instance Configurations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instance Configurations</em>' reference list.
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getMultiPortInstanceConfiguration_PortInstanceConfigurations()
	 * @model
	 * @generated
	 */
	EList<PortInstanceConfiguration> getPortInstanceConfigurations();

} // MultiPortInstanceConfiguration
