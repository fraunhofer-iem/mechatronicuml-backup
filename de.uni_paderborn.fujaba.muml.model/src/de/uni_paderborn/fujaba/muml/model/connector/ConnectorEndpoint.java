/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.connector;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.connector.ConnectorEndpoint#getConnectors <em>Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage#getConnectorEndpoint()
 * @model abstract="true"
 * @generated
 */
public interface ConnectorEndpoint extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.connector.Connector}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.connector.Connector#getConnectorEndpoints <em>Connector Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage#getConnectorEndpoint_Connectors()
	 * @see de.uni_paderborn.fujaba.muml.model.connector.Connector#getConnectorEndpoints
	 * @model opposite="connectorEndpoints"
	 * @generated
	 */
	EList<Connector> getConnectors();

} // ConnectorEndpoint
