/**
 */
package org.muml.psm.muml_container;

import org.eclipse.emf.ecore.EObject;

import org.muml.pim.instance.PortInstance;

import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration#getHwportInstance <em>Hwport Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface PortInstanceConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instance</em>' reference.
	 * @see #setPortInstance(PortInstance)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_PortInstance()
	 * @model
	 * @generated
	 */
	PortInstance getPortInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration#getPortInstance <em>Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Instance</em>' reference.
	 * @see #getPortInstance()
	 * @generated
	 */
	void setPortInstance(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Hwport Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortInstance over which to send
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwport Instance</em>' reference.
	 * @see #setHwportInstance(HWPortInstance)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_HwportInstance()
	 * @model
	 * @generated
	 */
	HWPortInstance getHwportInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration#getHwportInstance <em>Hwport Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwport Instance</em>' reference.
	 * @see #getHwportInstance()
	 * @generated
	 */
	void setHwportInstance(HWPortInstance value);

} // PortInstanceConfiguration
