/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Muml Elem Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to an element or expression that evaluates (at least indirectly) to some element of the underlying model (e.g., State, MapExpr, Clock,...)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr#getElem <em>Elem</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr#getConnectorEndpointInstance <em>Connector Endpoint Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage#getMumlElemExpr()
 * @model
 * @generated
 */
public interface MumlElemExpr extends MapExpr {
	/**
	 * Returns the value of the '<em><b>Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenced element/expression. Typing and scoping is done in the MtctlScopeProvider
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elem</em>' reference.
	 * @see #setElem(EObject)
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage#getMumlElemExpr_Elem()
	 * @model
	 * @generated
	 */
	EObject getElem();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr#getElem <em>Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem</em>' reference.
	 * @see #getElem()
	 * @generated
	 */
	void setElem(EObject value);

	/**
	 * Returns the value of the '<em><b>Connector Endpoint Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Endpoint Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Endpoint Instance</em>' reference.
	 * @see #setConnectorEndpointInstance(EObject)
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage#getMumlElemExpr_ConnectorEndpointInstance()
	 * @model
	 * @generated
	 */
	EObject getConnectorEndpointInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr#getConnectorEndpointInstance <em>Connector Endpoint Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Endpoint Instance</em>' reference.
	 * @see #getConnectorEndpointInstance()
	 * @generated
	 */
	void setConnectorEndpointInstance(EObject value);

} // MumlElemExpr
