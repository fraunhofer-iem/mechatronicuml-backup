/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance;

import de.uni_paderborn.fujaba.muml.connector.DiscreteSingleInteractionEndpointInstance;


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
 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getDiscreteSinglePortInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PortInstanceNotMultipleAssemblyConnectorInstances='-- PortInstance must have not have mulltiple Assembly Connector Instances assigned.\nportConnectorInstances->select(\n\tci | ci.oclIsKindOf(AssemblyConnectorInstance)\n)->size() <= 1' PortInstanceNotMultipleDelegationConnectorInstances='-- PortInstance must have not have mulltiple Delegation Connector Instances assigned.\r\nportConnectorInstances->select(\r\n\tci | ci.oclIsKindOf(DelegationConnectorInstance)) -> size() <= 1' PortInstanceNeedsDelegationToParentOrAssembly='-- PortInstance needs a Delegation Connector Instance to the parent component\'s port or an Assembly Connector Instance to a port within this CIC.\nnot portConnectorInstances->select(\n\tci | ci.oclIsKindOf(DelegationConnectorInstance)\n\tand ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance.oclIsKindOf(StructuredComponentInstance)\n\tand ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance.oclAsType(StructuredComponentInstance).embeddedCIC.componentInstances->includes(componentInstance)\n)->isEmpty() or\nnot portConnectorInstances->select(\n\tci | ci.oclIsKindOf(AssemblyConnectorInstance)\n)->isEmpty()'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PortInstanceNotMultipleAssemblyConnectorInstances PortInstanceNotMultipleDelegationConnectorInstances PortInstanceNeedsDelegationToParentOrAssembly'"
 * @generated
 */
public interface DiscreteSinglePortInstance extends DiscretePortInstance, DiscreteSingleInteractionEndpointInstance {
} // DiscreteSinglePortInstance
