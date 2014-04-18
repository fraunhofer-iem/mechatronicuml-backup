/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import org.eclipse.emf.common.util.EList;

import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware platform at the type level. 
 * A HWPlatform consists of several embedded PlatformParts and several CommunicationResources to connect the embedded PlatformParts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getEmbeddedPlatformParts <em>Embedded Platform Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getNetworkingHardwareParts <em>Networking Hardware Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform#getDelegationPorts <em>Delegation Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPlatform()
 * @model
 * @generated
 */
public interface HWPlatform extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Embedded Platform Parts</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart#getParentHWPlatform <em>Parent HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PlatformParts which are embedded in this HWPlatform. 
	 * A PlatformPart is either a  HWPlatformPart or a ResourceInstancePart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Platform Parts</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPlatform_EmbeddedPlatformParts()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.PlatformPart#getParentHWPlatform
	 * @model opposite="parentHWPlatform" containment="true" required="true"
	 * @generated
	 */
	EList<PlatformPart> getEmbeddedPlatformParts();

	/**
	 * Returns the value of the '<em><b>Networking Hardware Parts</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.NetworkingHardwarePart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationResources this HWPlatform contains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networking Hardware Parts</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPlatform_NetworkingHardwareParts()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkingHardwarePart> getNetworkingHardwareParts();

	/**
	 * Returns the value of the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort#getParentHWPlatform <em>Parent HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortInstances of this HWPlatform that are used as delegation ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getHWPlatform_DelegationPorts()
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort#getParentHWPlatform
	 * @model opposite="parentHWPlatform" containment="true"
	 * @generated
	 */
	EList<DelegationHWPort> getDelegationPorts();

} // HWPlatform
