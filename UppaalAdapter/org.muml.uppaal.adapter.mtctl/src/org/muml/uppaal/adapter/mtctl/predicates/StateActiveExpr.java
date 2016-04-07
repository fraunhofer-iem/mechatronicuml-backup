/**
 */
package org.muml.uppaal.adapter.mtctl.predicates;

import org.muml.uppaal.adapter.mtctl.comparables.MapExpr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Active Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Evaluates to true iff the specified state is active in the snapshot
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.StateActiveExpr#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getStateActiveExpr()
 * @model
 * @generated
 */
public interface StateActiveExpr extends DynamicPredicateExpr {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(MapExpr)
	 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getStateActiveExpr_State()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getState();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.predicates.StateActiveExpr#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(MapExpr value);

} // StateActiveExpr
