/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;

import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an assembly connector at instance level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.AssemblyConnectorInstance#getAssemblyConnectorType <em>Assembly Connector Type</em>}</li>
 *   <li>{@link org.muml.pim.instance.AssemblyConnectorInstance#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.instance.InstancePackage#getAssemblyConnectorInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AssemblyConnectorInstanceNeedsTypeIfNotTopLevel NoQoSAssumptionsIfNotDiscretePortConnector'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AssemblyConnectorInstanceNeedsTypeIfNotTopLevel='-- Assembly Connector Instance needs type, if not top-level\r\nportInstances.componentInstance->exists(not parentCIC.parentStructuredComponentInstance.oclIsUndefined()) implies not assemblyConnectorType.oclIsUndefined()\r\n' NoQoSAssumptionsIfNotDiscretePortConnector='-- An assembly instance connector may only have QoS assumptions if it connects two discrete port instances\r\n(not connectorQualityOfServiceAssumptions.oclIsUndefined()) \r\nimplies \r\n(portInstances->forAll(portInstance | not portInstance.oclIsUndefined() and portInstance.oclIsKindOf(instance::DiscretePortInstance)))'"
 * @generated
 */
public interface AssemblyConnectorInstance extends PortConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Assembly Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assembly that this assembly instance is built from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assembly Connector Type</em>' reference.
	 * @see org.muml.pim.instance.InstancePackage#getAssemblyConnectorInstance_AssemblyConnectorType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if  type.oclIsKindOf(component::AssemblyConnector) then\r\n\ttype.oclAsType(component::AssemblyConnector)\r\nelse\r\n\tnull\r\nendif'"
	 * @generated
	 */
	AssemblyConnector getAssemblyConnectorType();

	/**
	 * Returns the value of the '<em><b>Connector Quality Of Service Assumptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Quality Of Service Assumptions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Quality Of Service Assumptions</em>' containment reference.
	 * @see #setConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions)
	 * @see org.muml.pim.instance.InstancePackage#getAssemblyConnectorInstance_ConnectorQualityOfServiceAssumptions()
	 * @model containment="true"
	 * @generated
	 */
	ConnectorQualityOfServiceAssumptions getConnectorQualityOfServiceAssumptions();

	/**
	 * Sets the value of the '{@link org.muml.pim.instance.AssemblyConnectorInstance#getConnectorQualityOfServiceAssumptions <em>Connector Quality Of Service Assumptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Quality Of Service Assumptions</em>' containment reference.
	 * @see #getConnectorQualityOfServiceAssumptions()
	 * @generated
	 */
	void setConnectorQualityOfServiceAssumptions(ConnectorQualityOfServiceAssumptions value);

} // AssemblyConnectorInstance
