/**
 */
package org.muml.pm.hardware.hwplatform;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.NamedElement;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.HWPlatform#getEmbeddedPlatformParts <em>Embedded Platform Parts</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.HWPlatform#getNetworkingHardware <em>Networking Hardware</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.HWPlatform#getDelegationPorts <em>Delegation Ports</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.HWPlatform#getNetworkConnectors <em>Network Connectors</em>}</li>
 * </ul>
 *
 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getHWPlatform()
 * @model
 * @generated
 */
public interface HWPlatform extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Embedded Platform Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatform.PlatformPart}.
	 * It is bidirectional and its opposite is '{@link org.muml.pm.hardware.hwplatform.PlatformPart#getParentHWPlatform <em>Parent HW Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PlatformParts which are embedded in this HWPlatform. 
	 * A PlatformPart is either a  HWPlatformPart or a ResourceInstancePart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Platform Parts</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getHWPlatform_EmbeddedPlatformParts()
	 * @see org.muml.pm.hardware.hwplatform.PlatformPart#getParentHWPlatform
	 * @model opposite="parentHWPlatform" containment="true" required="true"
	 * @generated
	 */
	EList<PlatformPart> getEmbeddedPlatformParts();

	/**
	 * Returns the value of the '<em><b>Networking Hardware</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatform.NetworkingHardware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationResources this HWPlatform contains.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Networking Hardware</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getHWPlatform_NetworkingHardware()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkingHardware> getNetworkingHardware();

	/**
	 * Returns the value of the '<em><b>Delegation Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatform.DelegationHWPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HWPortInstances of this HWPlatform that are used as delegation ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation Ports</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getHWPlatform_DelegationPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DelegationHWPort> getDelegationPorts();

	/**
	 * Returns the value of the '<em><b>Network Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pm.hardware.hwplatform.NetworkConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Connectors</em>' containment reference list.
	 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getHWPlatform_NetworkConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkConnector> getNetworkConnectors();

} // HWPlatform
