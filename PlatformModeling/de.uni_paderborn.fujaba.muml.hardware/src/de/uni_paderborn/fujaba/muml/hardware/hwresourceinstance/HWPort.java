/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort()
 * @model abstract="true"
 * @generated
 */
public interface HWPort extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getHwports <em>Hwports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Resource Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Resource Instance</em>' container reference.
	 * @see #setParentResourceInstance(ResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getHWPort_ParentResourceInstance()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getHwports
	 * @model opposite="hwports" transient="false"
	 * @generated
	 */
	ResourceInstance getParentResourceInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource Instance</em>' container reference.
	 * @see #getParentResourceInstance()
	 * @generated
	 */
	void setParentResourceInstance(ResourceInstance value);

} // HWPort
