/**
 */
package org.muml.pm.hardware.hwplatform;

import org.muml.pim.connector.ConnectorEndpoint;
import org.muml.pm.hardware.hwresourceinstance.HWPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation HW Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a DelegationPort of a HWPlatform.
 * DelegationPorts are used  to delegate HWPorts of embedded HWResourses to the outside.
 * In order to be conistent with the muml metamodel, this class inherits from pim::ConnectorEndpoint.
 * Furthermore, this class inherits from HWPort, because a DelegationPort provides to the outside the same features as a standard HWPort.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pm.hardware.hwplatform.HwplatformPackage#getDelegationHWPort()
 * @model
 * @generated
 */
public interface DelegationHWPort extends ConnectorEndpoint, HWPort {

} // DelegationHWPort
