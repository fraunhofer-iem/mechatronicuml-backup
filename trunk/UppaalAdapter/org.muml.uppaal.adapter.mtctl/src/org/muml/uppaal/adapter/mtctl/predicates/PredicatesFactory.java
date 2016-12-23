/**
 */
package org.muml.uppaal.adapter.mtctl.predicates;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage
 * @generated
 */
public interface PredicatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PredicatesFactory eINSTANCE = org.muml.uppaal.adapter.mtctl.predicates.impl.PredicatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Deadlock Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deadlock Expr</em>'.
	 * @generated
	 */
	DeadlockExpr createDeadlockExpr();

	/**
	 * Returns a new object of class '<em>Connector Overflow Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Overflow Expr</em>'.
	 * @generated
	 */
	ConnectorOverflowExpr createConnectorOverflowExpr();

	/**
	 * Returns a new object of class '<em>Comparison Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Expr</em>'.
	 * @generated
	 */
	ComparisonExpr createComparisonExpr();

	/**
	 * Returns a new object of class '<em>Message In Buffer Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message In Buffer Expr</em>'.
	 * @generated
	 */
	MessageInBufferExpr createMessageInBufferExpr();

	/**
	 * Returns a new object of class '<em>Message In Transit Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message In Transit Expr</em>'.
	 * @generated
	 */
	MessageInTransitExpr createMessageInTransitExpr();

	/**
	 * Returns a new object of class '<em>State Active Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Active Expr</em>'.
	 * @generated
	 */
	StateActiveExpr createStateActiveExpr();

	/**
	 * Returns a new object of class '<em>Substate Of Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substate Of Expr</em>'.
	 * @generated
	 */
	SubstateOfExpr createSubstateOfExpr();

	/**
	 * Returns a new object of class '<em>Transition Firing Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Firing Expr</em>'.
	 * @generated
	 */
	TransitionFiringExpr createTransitionFiringExpr();

	/**
	 * Returns a new object of class '<em>Predicate Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Expr</em>'.
	 * @generated
	 */
	PredicateExpr createPredicateExpr();

	/**
	 * Returns a new object of class '<em>True Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True Expr</em>'.
	 * @generated
	 */
	TrueExpr createTrueExpr();

	/**
	 * Returns a new object of class '<em>False Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>False Expr</em>'.
	 * @generated
	 */
	FalseExpr createFalseExpr();

	/**
	 * Returns a new object of class '<em>State In Statechart Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State In Statechart Expr</em>'.
	 * @generated
	 */
	StateInStatechartExpr createStateInStatechartExpr();

	/**
	 * Returns a new object of class '<em>Message Discarded Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Discarded Expr</em>'.
	 * @generated
	 */
	MessageDiscardedExpr createMessageDiscardedExpr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PredicatesPackage getPredicatesPackage();

} //PredicatesFactory
