/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HWPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation HW Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a DelegationPort of a HWPlatform.
 * DelegationPorts are used  to delegate HWPorts of embedded HWResourses to the outside.
 * In order to be conistent with the muml metamodel, this class inherits from muml::ConnectorEndpoint.
 * Furthermore, this class inherits from HWPort, because a DelegationPort provides to the outside the same features as a standard HWPort.
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getDelegationHWPort()
 * @model
 * @generated
 */
public interface DelegationHWPort extends ConnectorEndpoint, HWPort {

} // DelegationHWPort
