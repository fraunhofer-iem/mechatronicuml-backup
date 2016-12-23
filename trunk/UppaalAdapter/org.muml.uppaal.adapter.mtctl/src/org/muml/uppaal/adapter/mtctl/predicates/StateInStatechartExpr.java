/**
 */
package org.muml.uppaal.adapter.mtctl.predicates;

import org.muml.uppaal.adapter.mtctl.comparables.MapExpr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State In Statechart Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * true iff a state is indirectly embedded in a statechart
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.StateInStatechartExpr#getState <em>State</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.StateInStatechartExpr#getStatechart <em>Statechart</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getStateInStatechartExpr()
 * @model
 * @generated
 */
public interface StateInStatechartExpr extends StaticPredicateExpr {
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
	 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getStateInStatechartExpr_State()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getState();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.predicates.StateInStatechartExpr#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(MapExpr value);

	/**
	 * Returns the value of the '<em><b>Statechart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statechart</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statechart</em>' containment reference.
	 * @see #setStatechart(MapExpr)
	 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getStateInStatechartExpr_Statechart()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getStatechart();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.predicates.StateInStatechartExpr#getStatechart <em>Statechart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statechart</em>' containment reference.
	 * @see #getStatechart()
	 * @generated
	 */
	void setStatechart(MapExpr value);

} // StateInStatechartExpr
