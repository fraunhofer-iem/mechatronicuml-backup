/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.connector;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of a particular connector endpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance#getConnectorInstances <em>Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getConnectorEndpointInstance()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorEndpointInstance extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Connector Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.connector.ConnectorInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorInstance#getConnectorEndpointInstances <em>Connector Endpoint Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connector instances attached to this endpoint instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getConnectorEndpointInstance_ConnectorInstances()
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorInstance#getConnectorEndpointInstances
	 * @model opposite="connectorEndpointInstances"
	 * @generated
	 */
	EList<ConnectorInstance> getConnectorInstances();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connector endpoint that represents the type of this instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ConnectorEndpoint)
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getConnectorEndpointInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	ConnectorEndpoint getType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ConnectorEndpoint value);

} // ConnectorEndpointInstance
