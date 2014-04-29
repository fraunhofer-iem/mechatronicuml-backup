/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getHwports <em>Hwports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getResourceInstance()
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
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getResourceInstance_ResourceType()
	 * @model required="true"
	 * @generated
	 */
	Resource getResourceType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.ResourceInstance#getResourceType <em>Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' reference.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(Resource value);

	/**
	 * Returns the value of the '<em><b>Hwports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort#getParentResourceInstance <em>Parent Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPort of this ResourceType.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getResourceInstance_Hwports()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPort#getParentResourceInstance
	 * @model opposite="parentResourceInstance" containment="true"
	 * @generated
	 */
	EList<HWPort> getHwports();

} // ResourceInstance
