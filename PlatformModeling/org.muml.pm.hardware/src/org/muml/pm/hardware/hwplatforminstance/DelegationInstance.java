/**
 */
package org.muml.pm.hardware.hwplatforminstance;

import org.muml.pim.connector.ConnectorInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a delegation.
 *  A delegation connects a hwport of a StructuredResourceInstance and a port of 
 * HWPlatform that contains the StructuredResourceInstance.
 * A delegation has no behavior.
 * At runtime level, the port of the HWPlatform and the port of the StructuredResourceInstance will be the same. 
 * It is used as a technique for encapsulation of a HWPlatform.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage#getDelegationInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='HWPortInstanceToDelegationPortInstance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL HWPortInstanceToDelegationPortInstance='-- One End of a DelegationInstance must be a DelegationPortInstance\n( self.connectorEndpointInstances->exists(c|c.oclIsKindOf(hwplatforminstance::DelegationHWPortInstance)) or self.connectorEndpointInstances->exists(c|c.oclIsKindOf(hwplatforminstance::BusInstance)))\n'"
 * @generated
 */
public interface DelegationInstance extends NetworkingHardwareInstance, ConnectorInstance {
} // DelegationInstance
