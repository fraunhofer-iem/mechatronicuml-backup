/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.PortPart;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A port instance is a port of a component at instance level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getPortType <em>Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getPortConnectorInstances <em>Port Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getPortPart <em>Port Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getPortInstance()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PortInstanceMustReferencePortType PortInstanceNotMultipleAssemblyConnectorInstances PortInstanceNotMultipleDelegationConnectorInstances PortInstanceMustDelegateToEmbeddedCIC PortInstanceNeedsDelegationToParentOrAssembly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PortInstanceMustReferencePortType='-- The type of a port instance must be a port type\r\nif (not self.type->oclIsUndefined()) then\r\nself.type.oclIsKindOf(component::Port)\r\nelse\r\nfalse\r\nendif' PortInstanceNotMultipleAssemblyConnectorInstances='-- PortInstance must have not have mulltiple Assembly Connector Instances assigned.\nportConnectorInstances->select(\n\tci | ci.oclIsKindOf(AssemblyConnectorInstance)\n)->size() <= 1' PortInstanceNotMultipleDelegationConnectorInstances='-- PortInstance must have not have mulltiple Delegation Connector Instances assigned.\nportConnectorInstances->select(\n\tci | ci.oclIsKindOf(DelegationConnectorInstance and\n\t(\n\t\t(self.oclIsKindOf(ContinuousPortInstance) or self.oclIsKindOf(HybridPortInstance)\n\t\timplies\n\t\tcomponentInstance.oclAsType(StructuredComponentInstance).embeddedCIC.componentInstances->includes(ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance)\n\t)\n)->size() <= 1' PortInstanceMustDelegateToEmbeddedCIC='-- PortInstance at Structured Component must delegate to embedded CIC\ncomponentInstance.oclIsKindOf(StructuredComponentInstance) implies not portConnectorInstances->select(ci | ci.oclIsKindOf(DelegationConnectorInstance) and componentInstance.oclAsType(StructuredComponentInstance).embeddedCIC.componentInstances->includes(ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance))->isEmpty()' PortInstanceNeedsDelegationToParentOrAssembly='-- PortInstance needs a Delegation Connector Instance to the parent component\'s port or an Assembly Connector Instance to a port within this CIC.\nnot portConnectorInstances->select(\n\tci | ci.oclIsKindOf(DelegationConnectorInstance)\n\tand ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance.oclIsKindOf(StructuredComponentInstance)\n\tand ci.oclAsType(DelegationConnectorInstance).portInstances->any(pi | pi <> self).componentInstance.oclAsType(StructuredComponentInstance).embeddedCIC.componentInstances->includes(componentInstance)\n)->isEmpty() or\nnot portConnectorInstances->select(\n\tci | ci.oclIsKindOf(AssemblyConnectorInstance)\n)->isEmpty()'"
 * @generated
 */
public interface PortInstance extends ConnectorEndpointInstance {
	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port type of which this port instance is built from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getPortInstance_PortType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.type.oclIsKindOf(component::Port))\r\nthen\r\nself.type.oclAsType(component::Port)\r\nelse\r\nnull\r\nendif'"
	 * @generated
	 */
	Port getPortType();

	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component instance this port instance belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Instance</em>' container reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getPortInstance_ComponentInstance()
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getPortInstances
	 * @model opposite="portInstances" transient="false"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getComponentInstance <em>Component Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' container reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Port Connector Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Connector Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Connector Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getPortInstance_PortConnectorInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorInstances->select(i | i.oclIsKindOf(PortConnectorInstance)).oclAsType(PortConnectorInstance)->asOrderedSet()'"
	 * @generated
	 */
	EList<PortConnectorInstance> getPortConnectorInstances();

	/**
	 * Returns the value of the '<em><b>Port Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Part</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getPortInstance_PortPart()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='componentInstance.componentPart.portParts->any(portPart | portPart.portType = self.type)'"
	 * @generated
	 */
	PortPart getPortPart();

} // PortInstance
