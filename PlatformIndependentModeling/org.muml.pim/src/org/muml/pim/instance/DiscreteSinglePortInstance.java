/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;

import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Single Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a discrete single port at instance level as well as a sub-port instance
 * of a multi-port instance. Each single port instance references its behavior instance.
 * When used as a sub-port instance, the instance references its role behavior instance. 
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pim.instance.InstancePackage#getDiscreteSinglePortInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PortInstanceNotMultipleAssemblyConnectorInstances='-- PortInstance must have not have mulltiple Assembly Connector Instances assigned.\nportConnectorInstances->select(\n\tci | ci.oclIsKindOf(AssemblyConnectorInstance)\n)->size() <= 1' PortInstanceNotMultipleDelegationConnectorInstances='-- PortInstance must have not have multiple Delegation Connector Instances per directiond assigned.\r\nlet delegationInstances : Set(instance::DelegationConnectorInstance) = portConnectorInstances->select(oclIsKindOf(instance::DelegationConnectorInstance)).oclAsType(instance::DelegationConnectorInstance)->asSet() in\r\nlet incoming : Set(instance::DelegationConnectorInstance) = delegationInstances->select(di | di.portInstances->forAll(pi |pi = self or pi.componentInstance->closure(p | if p.oclIsKindOf(instance::StructuredComponentInstance) then p.oclAsType(instance::StructuredComponentInstance).embeddedCIC.componentInstances else OrderedSet { p } endif)->includes(self.componentInstance))) in\r\nlet outgoing : Set(instance::DelegationConnectorInstance) = delegationInstances->select(di | di.portInstances->forAll(pi |pi = self or self.componentInstance->closure(p | if p.oclIsKindOf(instance::StructuredComponentInstance) then p.oclAsType(instance::StructuredComponentInstance).embeddedCIC.componentInstances else OrderedSet { p } endif)->includes(pi.componentInstance))) in\r\nincoming->size() <= 1 and outgoing->size() <= 1' PortInstanceNeedsDelegationToParentOrAssembly='-- PortInstance needs a Delegation Connector Instance to the parent component\'s port or an Assembly Connector Instance to a port within this CIC.\r\n\r\nif(self.componentInstance.oclIsInvalid() or self.componentInstance = null) then true else (not self.componentInstance.topLevel) implies (\r\nnot portConnectorInstances->select(\r\n\tci | ci.oclIsKindOf(DelegationConnectorInstance)\r\n\tand ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance.oclIsKindOf(StructuredComponentInstance)\r\n\tand ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance.oclAsType(StructuredComponentInstance).embeddedCIC.componentInstances->includes(componentInstance)\r\n)->isEmpty() or\r\nnot portConnectorInstances->select(\r\n\tci | ci.oclIsKindOf(AssemblyConnectorInstance)\r\n)->isEmpty()\r\n)\r\nendif\r\n'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PortInstanceNotMultipleAssemblyConnectorInstances PortInstanceNotMultipleDelegationConnectorInstances PortInstanceNeedsDelegationToParentOrAssembly'"
 * @generated
 */
public interface DiscreteSinglePortInstance extends DiscretePortInstance, DiscreteSingleInteractionEndpointInstance {
} // DiscreteSinglePortInstance
