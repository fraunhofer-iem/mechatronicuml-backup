/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Endpoint Instance Set Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ConnectorEndpointInstanceSetExpr#getConnectorEndpoint <em>Connector Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsPackage#getConnectorEndpointInstanceSetExpr()
 * @model
 * @generated
 */
public interface ConnectorEndpointInstanceSetExpr extends SetExpr {
	/**
	 * Returns the value of the '<em><b>Connector Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Endpoint</em>' containment reference.
	 * @see #setConnectorEndpoint(MapExpr)
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsPackage#getConnectorEndpointInstanceSetExpr_ConnectorEndpoint()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getConnectorEndpoint();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.ConnectorEndpointInstanceSetExpr#getConnectorEndpoint <em>Connector Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Endpoint</em>' containment reference.
	 * @see #getConnectorEndpoint()
	 * @generated
	 */
	void setConnectorEndpoint(MapExpr value);

} // ConnectorEndpointInstanceSetExpr
