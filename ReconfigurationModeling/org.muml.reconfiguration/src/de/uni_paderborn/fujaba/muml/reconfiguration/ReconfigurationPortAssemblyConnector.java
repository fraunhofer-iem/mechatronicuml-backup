/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.muml.pim.component.PortConnector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReconfigurationPortAssemblyConnector connects two ReconfigurationPorts with each other.
 * In contrast to a normal assembly used for component parts within a structured
 * component, the ReconfigurationPortAssemblyConnector connects two
 * reconfiguration ports instead of two port parts.
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationPortAssemblyConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyConnectReconfigurationPorts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyConnectReconfigurationPorts='-- A reconfiguration Port Assembly may only connect reconfiguration ports or a port part typed by a reconfiguration port.\r\n(self.connectorEndpoints -> select(oclIsKindOf(ReconfigurationPort)) -> size() = 2) -- two reconfiguration ports\r\nor \r\n((self.connectorEndpoints -> select(oclIsKindOf(ReconfigurationPort)) -> size() = 1) and -- or one reconfiguration port and one port part\r\n(self.connectorEndpoints -> select(oclIsKindOf(muml::component::PortPart)) -> size() = 1) and \r\n(self.connectorEndpoints -> any(oclIsKindOf(muml::component::PortPart)).oclAsType(muml::component::PortPart).portType.oclIsKindOf(ReconfigurationPort))) -- that is typed over a reconfiguration port'"
 * @generated
 */
public interface ReconfigurationPortAssemblyConnector extends PortConnector {
} // ReconfigurationPortAssemblyConnector
