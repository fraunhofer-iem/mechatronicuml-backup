/**
 */
package org.muml.pm.hardware.hwplatform;

import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a ResourceInstancePart. 
 * ResourceInstanceParts are used to specify the structure of a HWPlatform. 
 * A ResourceInstancePart is embedded in a HWPlatform and it is typed over a ResourceInstance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.ResourcePart#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getResourcePart()
 * @model
 * @generated
 */
public interface ResourcePart extends PlatformPart {
	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstance type of this ResourceInstancePart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' reference.
	 * @see #setResourceType(ResourceInstance)
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getResourcePart_ResourceType()
	 * @model required="true"
	 * @generated
	 */
	ResourceInstance getResourceType();

	/**
	 * Sets the value of the '{@link org.muml.pm.hardware.hwplatform.ResourcePart#getResourceType <em>Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' reference.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(ResourceInstance value);

} // ResourcePart
