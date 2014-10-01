/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage#getStateActiveExpr()
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
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage#getStateActiveExpr_State()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getState();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(MapExpr value);

} // StateActiveExpr
