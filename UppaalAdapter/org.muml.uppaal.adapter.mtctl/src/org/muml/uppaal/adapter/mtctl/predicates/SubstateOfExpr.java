/**
 */
package org.muml.uppaal.adapter.mtctl.predicates;

import org.muml.uppaal.adapter.mtctl.comparables.MapExpr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substate Of Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * True iff state is a substate of superstate
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.SubstateOfExpr#getSuperstate <em>Superstate</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.SubstateOfExpr#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getSubstateOfExpr()
 * @model
 * @generated
 */
public interface SubstateOfExpr extends StaticPredicateExpr {
	/**
	 * Returns the value of the '<em><b>Superstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superstate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superstate</em>' containment reference.
	 * @see #setSuperstate(MapExpr)
	 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getSubstateOfExpr_Superstate()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getSuperstate();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.predicates.SubstateOfExpr#getSuperstate <em>Superstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superstate</em>' containment reference.
	 * @see #getSuperstate()
	 * @generated
	 */
	void setSuperstate(MapExpr value);

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
	 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getSubstateOfExpr_State()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getState();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.predicates.SubstateOfExpr#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(MapExpr value);

} // SubstateOfExpr
