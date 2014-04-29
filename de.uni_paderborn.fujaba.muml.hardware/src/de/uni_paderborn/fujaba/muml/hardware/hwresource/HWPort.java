/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort#getParentResource <em>Parent Resource</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getHWPort()
 * @model abstract="true"
 * @generated
 */
public interface HWPort extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource#getHwports <em>Hwports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Resource, this HWPort belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Resource</em>' container reference.
	 * @see #setParentResource(Resource)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getHWPort_ParentResource()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource#getHwports
	 * @model opposite="hwports" transient="false"
	 * @generated
	 */
	Resource getParentResource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort#getParentResource <em>Parent Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource</em>' container reference.
	 * @see #getParentResource()
	 * @generated
	 */
	void setParentResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getHwports <em>Hwports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Resource, this HWPort belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Resource Instance</em>' container reference.
	 * @see #setParentResourceInstance(ResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage#getHWPort_ParentResourceInstance()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getHwports
	 * @model opposite="hwports" transient="false"
	 * @generated
	 */
	ResourceInstance getParentResourceInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource Instance</em>' container reference.
	 * @see #getParentResourceInstance()
	 * @generated
	 */
	void setParentResourceInstance(ResourceInstance value);

} // HWPort
