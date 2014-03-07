/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.connector;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint#getConnectors <em>Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getConnectorEndpoint()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorEndpoint extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.connector.Connector}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.connector.Connector#getConnectorEndpoints <em>Connector Endpoints</em>}'.
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
	 * @see de.uni_paderborn.fujaba.muml.connector.ConnectorPackage#getConnectorEndpoint_Connectors()
	 * @see de.uni_paderborn.fujaba.muml.connector.Connector#getConnectorEndpoints
	 * @model opposite="connectorEndpoints"
	 * @generated
	 */
	EList<Connector> getConnectors();

} // ConnectorEndpoint
