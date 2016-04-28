/**
 */
package org.muml.pm.hardware.hwresourceinstance;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.NamedElement;
import org.muml.pm.hardware.hwresource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class is the super class of all resource instances.
 * The associated HWPortInstances are determined by its resource type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.ResourceInstance#getHwports <em>Hwports</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.ResourceInstance#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getResourceInstance()
 * @model abstract="true"
 * @generated
 */
public interface ResourceInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource type of which this ResourceInstance is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' reference.
	 * @see #setResourceType(Resource)
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getResourceInstance_ResourceType()
	 * @model required="true"
	 * @generated
	 */
	Resource getResourceType();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwresourceinstance.ResourceInstance#getResourceType <em>Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' reference.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(Resource value);

	/**
	 * Returns the value of the '<em><b>Hwports</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwresourceinstance.HWPort}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwresourceinstance.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPort of this ResourceType.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwports</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getResourceInstance_Hwports()
	 * @see org.muml.pm.hardware.hwresourceinstance.HWPort#getParentResourceInstance
	 * @model opposite="parentResourceInstance" containment="true"
	 * @generated
	 */
	EList<HWPort> getHwports();

} // ResourceInstance
