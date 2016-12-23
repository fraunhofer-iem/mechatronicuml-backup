/**
 */
package org.muml.reconfiguration;

import org.muml.pim.component.PortConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReconfigurationPortDelegationConnector connects two ReconfigurationPorts with each other.
 * In contrast to a normal delegation connector used for component parts within a structured
 * component, the ReconfigurationPortDelegationConnector connects two
 * reconfiguration ports instead of one port and one port part.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.reconfiguration.ReconfigurationPackage#getReconfigurationPortDelegationConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyConnectReconfigurationPorts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyConnectReconfigurationPorts='-- A reconfiguration Port Delegation may only connect reconfiguration ports of structured component to reconfiguration ports of reconfiguration controller.\r\n(self.connectorEndpoints -> select(oclIsKindOf(ReconfigurationPort)) -> size() = 2)'"
 * @generated
 */
public interface ReconfigurationPortDelegationConnector extends PortConnector {
} // ReconfigurationPortDelegationConnector
