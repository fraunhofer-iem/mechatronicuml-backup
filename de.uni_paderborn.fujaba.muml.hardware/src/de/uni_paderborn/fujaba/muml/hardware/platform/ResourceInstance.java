/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance#getHwportInstances <em>Hwport Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getResourceInstance()
 * @model abstract="true"
 * @generated
 */
public interface ResourceInstance extends ExtendableElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource type of which this ResourceInstance is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' reference.
	 * @see #setResourceType(ResourceType)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getResourceInstance_ResourceType()
	 * @model required="true"
	 * @generated
	 */
	ResourceType getResourceType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance#getResourceType <em>Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' reference.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Hwport Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getParentResourceInstance <em>Parent Resource Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortInstances which belong to this ResourceInstance. They are derived by the resourceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwport Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getResourceInstance_HwportInstances()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getParentResourceInstance
	 * @model opposite="parentResourceInstance" containment="true"
	 * @generated
	 */
	EList<HWPortInstance> getHwportInstances();

} // ResourceInstance
