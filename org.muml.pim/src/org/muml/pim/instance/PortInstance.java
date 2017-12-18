/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.component.Port;
import org.muml.pim.component.PortPart;
import org.muml.pim.connector.ConnectorEndpointInstance;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.PortInstance#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.muml.pim.instance.PortInstance#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.muml.pim.instance.PortInstance#getPortConnectorInstances <em>Port Connector Instances</em>}</li>
 *   <li>{@link org.muml.pim.instance.PortInstance#getPortPart <em>Port Part</em>}</li>
 *   <li>{@link org.muml.pim.instance.PortInstance#getRunnable <em>Runnable</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.instance.InstancePackage#getPortInstance()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PortInstanceMustReferencePortType PortInstanceMustDelegateToEmbeddedCIC'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PortInstanceMustReferencePortType='-- The type of a port instance must be a port type\r\nif (not self.type-&gt;oclIsUndefined()) then\r\nself.type.oclIsKindOf(component::Port)\r\nelse\r\nfalse\r\nendif' PortInstanceMustDelegateToEmbeddedCIC='-- PortInstance at Structured Component must delegate to embedded CIC\r\n(componentInstance.oclIsKindOf(StructuredComponentInstance) and not self.oclIsKindOf(connector::DiscreteMultiInteractionEndpointInstance) and ( self.oclIsKindOf(HybridPortInstance) or self.oclIsKindOf(DiscretePortInstance) or self.oclIsKindOf(ContinuousPortInstance))) \r\nimplies not portConnectorInstances-&gt;select(ci | ci.oclIsKindOf(DelegationConnectorInstance) and \r\n\tcomponentInstance.oclAsType(StructuredComponentInstance).embeddedCIC.componentInstances-&gt;includes(ci.oclAsType(DelegationConnectorInstance).portInstances-&gt;any(pi | pi &lt;&gt; self).componentInstance)\r\n)-&gt;isEmpty()\r\n-- sthiele2: Check only HybridPortInstance, DiscretePortInstance, ContinousPortInstance '"
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
	 * @see org.muml.pim.instance.InstancePackage#getPortInstance_PortType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.type.oclIsKindOf(component::Port))\r\nthen\r\nself.type.oclAsType(component::Port)\r\nelse\r\nnull\r\nendif'"
	 * @generated
	 */
	Port getPortType();

	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component instance this port instance belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Instance</em>' container reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see org.muml.pim.instance.InstancePackage#getPortInstance_ComponentInstance()
	 * @see org.muml.pim.instance.ComponentInstance#getPortInstances
	 * @model opposite="portInstances" transient="false"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link org.muml.pim.instance.PortInstance#getComponentInstance <em>Component Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' container reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Port Connector Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.instance.PortConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Connector Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port connector instances attached to this port instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Connector Instances</em>' reference list.
	 * @see org.muml.pim.instance.InstancePackage#getPortInstance_PortConnectorInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorInstances-&gt;select(i | i.oclIsKindOf(PortConnectorInstance)).oclAsType(PortConnectorInstance)-&gt;asOrderedSet()'"
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
	 * <!-- begin-model-doc -->
	 * If the enclosing component instance corresponds to a component part of a structured component, refers to the port part that corresponds to this port instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Part</em>' reference.
	 * @see org.muml.pim.instance.InstancePackage#getPortInstance_PortPart()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='componentInstance.componentPart.portParts-&gt;any(portPart | portPart.portType = self.type)'"
	 * @generated
	 */
	PortPart getPortPart();

	/**
	 * Returns the value of the '<em><b>Runnable</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.runnable.Runnable}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.runnable.Runnable#getPortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable</em>' reference list.
	 * @see org.muml.pim.instance.InstancePackage#getPortInstance_Runnable()
	 * @see org.muml.pim.runnable.Runnable#getPortInstance
	 * @model opposite="portInstance"
	 * @generated
	 */
	EList<org.muml.pim.runnable.Runnable> getRunnable();

} // PortInstance
