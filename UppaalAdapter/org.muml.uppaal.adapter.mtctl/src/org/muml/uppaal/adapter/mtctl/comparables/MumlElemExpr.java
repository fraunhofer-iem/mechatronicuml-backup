/**
 */
package org.muml.uppaal.adapter.mtctl.comparables;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr#getElem <em>Elem</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage#getMumlElemExpr()
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
	 * @see org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage#getMumlElemExpr_Elem()
	 * @model
	 * @generated
	 */
	EObject getElem();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr#getElem <em>Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem</em>' reference.
	 * @see #getElem()
	 * @generated
	 */
	void setElem(EObject value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The concrete instance which this Muml element belongs to (in case there are multiple at runtime). E.g., a ConnectorEndpointInstance for Role RTSC elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(EObject)
	 * @see org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage#getMumlElemExpr_Instance()
	 * @model
	 * @generated
	 */
	EObject getInstance();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(EObject value);

} // MumlElemExpr
