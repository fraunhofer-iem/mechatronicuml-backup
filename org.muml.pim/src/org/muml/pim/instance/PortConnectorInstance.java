/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;

import org.eclipse.emf.common.util.EList;
import org.muml.pim.component.PortConnector;
import org.muml.pim.connector.ConnectorInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the common super class of delegation instances and assemly instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.PortConnectorInstance#getPortConnectorType <em>Port Connector Type</em>}</li>
 *   <li>{@link org.muml.pim.instance.PortConnectorInstance#getPortInstances <em>Port Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.instance.InstancePackage#getPortConnectorInstance()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidPortConnectorInstance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ValidPortConnectorInstance='-- The connected PortInstances do not correspond to the selected PortConnectorType\nlet directPortTypes : Set(component::Port) = if(not self.type.oclIsUndefined()) then self.type.connectorEndpoints-&gt;select(endPoint|endPoint.oclIsKindOf(component::Port)).oclAsType(component::Port)-&gt;asOrderedSet() else OrderedSet{} endif in\nlet portTypesFromPortParts : Set(component::Port) = if(not self.type.oclIsUndefined()) then self.type.connectorEndpoints-&gt;select(endPoint | endPoint.oclIsKindOf(component::PortPart)).oclAsType(component::PortPart)-&gt;collect(portType)-&gt;asOrderedSet() else OrderedSet{} endif  in\nlet allPortTypes : Set(component::Port) = directPortTypes-&gt;union(portTypesFromPortParts)-&gt;asOrderedSet() in\nif (self.type.oclIsUndefined() or self.connectorEndpointInstances-&gt;isEmpty()) then \n\ttrue\nelse\n\tallPortTypes-&gt;symmetricDifference(self.connectorEndpointInstances.type.oclAsType(component::Port)-&gt;asSet())-&gt;isEmpty()\nendif\n-- adann\r\n'"
 *        annotation="http://www.muml.org/emf/OCLFilter filter='let types : Set(connector::ConnectorEndpoint) = self.portInstances-&gt;collect(pi | if (pi.portPart.oclIsUndefined()) then pi.type else pi.portPart endif).oclAsType(connector::ConnectorEndpoint)-&gt;asSet()\nin types.connectors-&gt;select(c | c.connectorEndpoints-&gt;asSet() = types)-&gt;asSet()' feature='type'"
 * @generated
 */
public interface PortConnectorInstance extends ConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connector type of this connector instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Connector Type</em>' reference.
	 * @see org.muml.pim.instance.InstancePackage#getPortConnectorInstance_PortConnectorType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.type.oclAsType(component::PortConnector)'"
	 * @generated
	 */
	PortConnector getPortConnectorType();

	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instances connected by this connector instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Instances</em>' reference list.
	 * @see org.muml.pim.instance.InstancePackage#getPortConnectorInstance_PortInstances()
	 * @model lower="2" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpointInstances-&gt;select(c | c.oclIsKindOf(PortInstance)).oclAsType(PortInstance)-&gt;asOrderedSet()'"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

} // PortConnectorInstance
