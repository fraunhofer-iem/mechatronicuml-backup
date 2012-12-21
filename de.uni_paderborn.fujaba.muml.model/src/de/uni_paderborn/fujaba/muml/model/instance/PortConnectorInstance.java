/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import de.uni_paderborn.fujaba.muml.model.component.PortConnector;
import de.uni_paderborn.fujaba.muml.model.connector.ConnectorInstance;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getPortConnectorType <em>Port Connector Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortConnectorInstance()
 * @model abstract="true"
 * @generated
 */
public interface PortConnectorInstance extends ConnectorInstance {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instance this connector instance originates from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PortInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortConnectorInstance_Source()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instance this connector instance leads to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PortInstance)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortConnectorInstance_Target()
	 * @model required="true"
	 * @generated
	 */
	PortInstance getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.PortConnectorInstance#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Port Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connector type of this connector instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Connector Type</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPortConnectorInstance_PortConnectorType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.type.oclAsType(component::PortConnector)'"
	 * @generated
	 */
	PortConnector getPortConnectorType();

} // PortConnectorInstance
