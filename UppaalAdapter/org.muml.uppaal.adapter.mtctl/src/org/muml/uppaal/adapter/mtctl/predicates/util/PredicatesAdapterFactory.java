/**
 */
package org.muml.uppaal.adapter.mtctl.predicates.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr;
import org.muml.uppaal.adapter.mtctl.predicates.ConnectorOverflowExpr;
import org.muml.uppaal.adapter.mtctl.predicates.DeadlockExpr;
import org.muml.uppaal.adapter.mtctl.predicates.DynamicPredicateExpr;
import org.muml.uppaal.adapter.mtctl.predicates.FalseExpr;
import org.muml.uppaal.adapter.mtctl.predicates.MessageDiscardedExpr;
import org.muml.uppaal.adapter.mtctl.predicates.MessageInBufferExpr;
import org.muml.uppaal.adapter.mtctl.predicates.MessageInTransitExpr;
import org.muml.uppaal.adapter.mtctl.predicates.PredicateExpr;
import org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage;
import org.muml.uppaal.adapter.mtctl.predicates.StateActiveExpr;
import org.muml.uppaal.adapter.mtctl.predicates.StateInStatechartExpr;
import org.muml.uppaal.adapter.mtctl.predicates.StaticPredicateExpr;
import org.muml.uppaal.adapter.mtctl.predicates.SubstateOfExpr;
import org.muml.uppaal.adapter.mtctl.predicates.TransitionFiringExpr;
import org.muml.uppaal.adapter.mtctl.predicates.TrueExpr;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicatesPackage
 * @generated
 */
public class PredicatesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PredicatesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicatesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PredicatesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicatesSwitch<Adapter> modelSwitch =
		new PredicatesSwitch<Adapter>() {
			@Override
			public Adapter caseDeadlockExpr(DeadlockExpr object) {
				return createDeadlockExprAdapter();
			}
			@Override
			public Adapter caseConnectorOverflowExpr(ConnectorOverflowExpr object) {
				return createConnectorOverflowExprAdapter();
			}
			@Override
			public Adapter caseComparisonExpr(ComparisonExpr object) {
				return createComparisonExprAdapter();
			}
			@Override
			public Adapter caseMessageInBufferExpr(MessageInBufferExpr object) {
				return createMessageInBufferExprAdapter();
			}
			@Override
			public Adapter caseMessageInTransitExpr(MessageInTransitExpr object) {
				return createMessageInTransitExprAdapter();
			}
			@Override
			public Adapter caseStateActiveExpr(StateActiveExpr object) {
				return createStateActiveExprAdapter();
			}
			@Override
			public Adapter caseSubstateOfExpr(SubstateOfExpr object) {
				return createSubstateOfExprAdapter();
			}
			@Override
			public Adapter caseTransitionFiringExpr(TransitionFiringExpr object) {
				return createTransitionFiringExprAdapter();
			}
			@Override
			public Adapter casePredicateExpr(PredicateExpr object) {
				return createPredicateExprAdapter();
			}
			@Override
			public Adapter caseDynamicPredicateExpr(DynamicPredicateExpr object) {
				return createDynamicPredicateExprAdapter();
			}
			@Override
			public Adapter caseStaticPredicateExpr(StaticPredicateExpr object) {
				return createStaticPredicateExprAdapter();
			}
			@Override
			public Adapter caseTrueExpr(TrueExpr object) {
				return createTrueExprAdapter();
			}
			@Override
			public Adapter caseFalseExpr(FalseExpr object) {
				return createFalseExprAdapter();
			}
			@Override
			public Adapter caseStateInStatechartExpr(StateInStatechartExpr object) {
				return createStateInStatechartExprAdapter();
			}
			@Override
			public Adapter caseMessageDiscardedExpr(MessageDiscardedExpr object) {
				return createMessageDiscardedExprAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.DeadlockExpr <em>Deadlock Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.DeadlockExpr
	 * @generated
	 */
	public Adapter createDeadlockExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.ConnectorOverflowExpr <em>Connector Overflow Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.ConnectorOverflowExpr
	 * @generated
	 */
	public Adapter createConnectorOverflowExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr <em>Comparison Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.ComparisonExpr
	 * @generated
	 */
	public Adapter createComparisonExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.MessageInBufferExpr <em>Message In Buffer Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.MessageInBufferExpr
	 * @generated
	 */
	public Adapter createMessageInBufferExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.MessageInTransitExpr <em>Message In Transit Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.MessageInTransitExpr
	 * @generated
	 */
	public Adapter createMessageInTransitExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.StateActiveExpr <em>State Active Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.StateActiveExpr
	 * @generated
	 */
	public Adapter createStateActiveExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.SubstateOfExpr <em>Substate Of Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.SubstateOfExpr
	 * @generated
	 */
	public Adapter createSubstateOfExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.TransitionFiringExpr <em>Transition Firing Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.TransitionFiringExpr
	 * @generated
	 */
	public Adapter createTransitionFiringExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.PredicateExpr <em>Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.PredicateExpr
	 * @generated
	 */
	public Adapter createPredicateExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.DynamicPredicateExpr <em>Dynamic Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.DynamicPredicateExpr
	 * @generated
	 */
	public Adapter createDynamicPredicateExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.StaticPredicateExpr <em>Static Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.StaticPredicateExpr
	 * @generated
	 */
	public Adapter createStaticPredicateExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.TrueExpr <em>True Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.TrueExpr
	 * @generated
	 */
	public Adapter createTrueExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.FalseExpr <em>False Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.FalseExpr
	 * @generated
	 */
	public Adapter createFalseExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.StateInStatechartExpr <em>State In Statechart Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.StateInStatechartExpr
	 * @generated
	 */
	public Adapter createStateInStatechartExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.predicates.MessageDiscardedExpr <em>Message Discarded Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.predicates.MessageDiscardedExpr
	 * @generated
	 */
	public Adapter createMessageDiscardedExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.uppaal.adapter.mtctl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.uppaal.adapter.mtctl.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PredicatesAdapterFactory
