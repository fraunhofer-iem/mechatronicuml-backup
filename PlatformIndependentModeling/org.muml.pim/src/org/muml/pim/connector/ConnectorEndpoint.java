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
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An endpoint that may be connected to other endpoints via connectors.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.connector.ConnectorEndpoint#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.connector.ConnectorPackage#getConnectorEndpoint()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorEndpoint extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.connector.Connector}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.connector.Connector#getConnectorEndpoints <em>Connector Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectors attached to this endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectors</em>' reference list.
	 * @see org.muml.pim.connector.ConnectorPackage#getConnectorEndpoint_Connectors()
	 * @see org.muml.pim.connector.Connector#getConnectorEndpoints
	 * @model opposite="connectorEndpoints"
	 * @generated
	 */
	EList<Connector> getConnectors();

} // ConnectorEndpoint
