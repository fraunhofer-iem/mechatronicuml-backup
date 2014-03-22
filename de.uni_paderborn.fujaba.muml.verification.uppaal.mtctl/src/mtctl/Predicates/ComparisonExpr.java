/**
 */
package mtctl.Predicates;

import org.eclipse.emf.ecore.EObject;

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
 * <ul>
 *   <li>{@link mtctl.Predicates.ComparisonExpr#getLhs <em>Lhs</em>}</li>
 *   <li>{@link mtctl.Predicates.ComparisonExpr#getOp <em>Op</em>}</li>
 *   <li>{@link mtctl.Predicates.ComparisonExpr#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see mtctl.Predicates.PredicatesPackage#getComparisonExpr()
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
	 * @see #setLhs(EObject)
	 * @see mtctl.Predicates.PredicatesPackage#getComparisonExpr_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	EObject getLhs();

	/**
	 * Sets the value of the '{@link mtctl.Predicates.ComparisonExpr#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(EObject value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link mtctl.Predicates.ComparisonOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see mtctl.Predicates.ComparisonOp
	 * @see #setOp(ComparisonOp)
	 * @see mtctl.Predicates.PredicatesPackage#getComparisonExpr_Op()
	 * @model
	 * @generated
	 */
	ComparisonOp getOp();

	/**
	 * Sets the value of the '{@link mtctl.Predicates.ComparisonExpr#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see mtctl.Predicates.ComparisonOp
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
	 * @see #setRhs(EObject)
	 * @see mtctl.Predicates.PredicatesPackage#getComparisonExpr_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	EObject getRhs();

	/**
	 * Sets the value of the '{@link mtctl.Predicates.ComparisonExpr#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(EObject value);

} // ComparisonExpr
