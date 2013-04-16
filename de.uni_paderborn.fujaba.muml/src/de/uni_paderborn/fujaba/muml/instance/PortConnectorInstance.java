/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.component.PortConnector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance#getPortConnectorType <em>Port Connector Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance#getPortInstances <em>Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getPortConnectorInstance()
 * @model abstract="true"
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
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getPortConnectorInstance_PortConnectorType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.type.oclAsType(component::PortConnector)'"
	 * @generated
	 */
	PortConnector getPortConnectorType();

	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getPortConnectorInstance_PortInstances()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpointInstances->select(c | c.oclIsKindOf(PortInstance)).oclAsType(PortInstance)->asOrderedSet()'"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

} // PortConnectorInstance
