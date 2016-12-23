/**
 */
package org.muml.uppaal.adapter.mtctl.predicates;

import org.muml.uppaal.adapter.mtctl.comparables.MapExpr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Compares two values. Is evaluated either dynamically or statically 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr#getOp <em>Op</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getComparisonExpr()
 * @model
 * @generated
 */
public interface ComparisonExpr extends PredicateExpr {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(MapExpr)
	 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getComparisonExpr_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getLhs();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(MapExpr value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.uppaal.adapter.mtctl.predicates.ComparisonOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.ComparisonOp
	 * @see #setOp(ComparisonOp)
	 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getComparisonExpr_Op()
	 * @model
	 * @generated
	 */
	ComparisonOp getOp();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.ComparisonOp
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ComparisonOp value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(MapExpr)
	 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage#getComparisonExpr_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	MapExpr getRhs();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(MapExpr value);

} // ComparisonExpr
