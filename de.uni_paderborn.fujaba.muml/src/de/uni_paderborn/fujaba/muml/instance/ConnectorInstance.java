/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance;

import org.storydriven.core.ExtendableElement;

import de.uni_paderborn.fujaba.muml.component.ConnectorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the common super class of delegation instances and assemly instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.ConnectorInstance#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.ConnectorInstance#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.ConnectorInstance#getConnectorType <em>Connector Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getConnectorInstance()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorInstance extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getOutgoingConnectorInstances <em>Outgoing Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instance this connector instance originates from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PortInstance)
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getConnectorInstance_Source()
	 * @see de.uni_paderborn.fujaba.muml.instance.PortInstance#getOutgoingConnectorInstances
	 * @model opposite="outgoingConnectorInstances" required="true"
	 * @generated
	 */
	PortInstance getSource();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.instance.ConnectorInstance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getIncomingConnectorInstances <em>Incoming Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instance this connector instance leads to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PortInstance)
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getConnectorInstance_Target()
	 * @see de.uni_paderborn.fujaba.muml.instance.PortInstance#getIncomingConnectorInstances
	 * @model opposite="incomingConnectorInstances" required="true"
	 * @generated
	 */
	PortInstance getTarget();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.instance.ConnectorInstance#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PortInstance value);

	/**
	 * Returns the value of the '<em><b>Connector Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connector type of this connector instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Type</em>' reference.
	 * @see #setConnectorType(ConnectorType)
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getConnectorInstance_ConnectorType()
	 * @model
	 * @generated
	 */
	ConnectorType getConnectorType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.instance.ConnectorInstance#getConnectorType <em>Connector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Type</em>' reference.
	 * @see #getConnectorType()
	 * @generated
	 */
	void setConnectorType(ConnectorType value);

} // ConnectorInstance
