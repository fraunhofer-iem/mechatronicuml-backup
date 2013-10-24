/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Instance Part</b></em>'.
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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart#getResourceInstanceType <em>Resource Instance Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart#getHwportParts <em>Hwport Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getResourceInstancePart()
 * @model
 * @generated
 */
public interface ResourceInstancePart extends PlatformPart {
	/**
	 * Returns the value of the '<em><b>Resource Instance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstance type of this ResourceInstancePart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Instance Type</em>' reference.
	 * @see #setResourceInstanceType(ResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getResourceInstancePart_ResourceInstanceType()
	 * @model required="true"
	 * @generated
	 */
	ResourceInstance getResourceInstanceType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstancePart#getResourceInstanceType <em>Resource Instance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Instance Type</em>' reference.
	 * @see #getResourceInstanceType()
	 * @generated
	 */
	void setResourceInstanceType(ResourceInstance value);

	/**
	 * Returns the value of the '<em><b>Hwport Parts</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortInstances of this ResourceInstance. 
	 * They are derived from the reference hwportInstances of the resourceInstanceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwport Parts</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getResourceInstancePart_HwportParts()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWPortPart> getHwportParts();

} // ResourceInstancePart
