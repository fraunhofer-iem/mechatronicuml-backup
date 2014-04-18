/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.Resource;

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
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage#getResourceInstance()
 * @model abstract="true"
 * @generated
 */
public interface ResourceInstance extends NamedElement, Resource {
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

} // ResourceInstance
