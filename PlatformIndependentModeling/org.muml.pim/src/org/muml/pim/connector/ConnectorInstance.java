/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of a particular connector.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.connector.ConnectorInstance#getType <em>Type</em>}</li>
 *   <li>{@link org.muml.pim.connector.ConnectorInstance#getConnectorEndpointInstances <em>Connector Endpoint Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.connector.ConnectorPackage#getConnectorInstance()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorInstance extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connector that represents the type of this connector instance. May be undefined in case of a top level connector instance, which does not refer to a particular connector inside a structured component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Connector)
	 * @see org.muml.pim.connector.ConnectorPackage#getConnectorInstance_Type()
	 * @model
	 * @generated
	 */
	Connector getType();

	/**
	 * Sets the value of the '{@link org.muml.pim.connector.ConnectorInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Connector value);

	/**
	 * Returns the value of the '<em><b>Connector Endpoint Instances</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.connector.ConnectorEndpointInstance}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.connector.ConnectorEndpointInstance#getConnectorInstances <em>Connector Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Endpoint Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connector endpoint instances connected by this connector instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Endpoint Instances</em>' reference list.
	 * @see org.muml.pim.connector.ConnectorPackage#getConnectorInstance_ConnectorEndpointInstances()
	 * @see org.muml.pim.connector.ConnectorEndpointInstance#getConnectorInstances
	 * @model opposite="connectorInstances" lower="2" upper="2"
	 * @generated
	 */
	EList<ConnectorEndpointInstance> getConnectorEndpointInstances();

} // ConnectorInstance
