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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PortInstanceMustReferencePortType PortInstanceNotMultiplePortConnectorInstances'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PortInstanceMustReferencePortType='-- The type of a port instance must be a port type\r\nif (not self.type->oclIsUndefined()) then\r\nself.type.oclIsKindOf(component::Port)\r\nelse\r\nfalse\r\nendif' PortInstanceNotMultiplePortConnectorInstances='-- PortInstance must not have multiple connector instances assigned.\nportConnectorInstances->size() <= 1'"
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
