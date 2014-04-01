/**
 */
package mtctl.Predicates.util;

import de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint;

import mtctl.Expression;

import mtctl.Predicates.*;

import mtctl.Property;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mtctl.Predicates.PredicatesPackage
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
			public Adapter caseBufferOverflowExpr(BufferOverflowExpr object) {
				return createBufferOverflowExprAdapter();
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
			public Adapter caseExtendableElement(ExtendableElement object) {
				return createExtendableElementAdapter();
			}
			@Override
			public Adapter caseCommentableElement(CommentableElement object) {
				return createCommentableElementAdapter();
			}
			@Override
			public Adapter caseTemporalLogicConstraint(TemporalLogicConstraint object) {
				return createTemporalLogicConstraintAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.DeadlockExpr <em>Deadlock Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.DeadlockExpr
	 * @generated
	 */
	public Adapter createDeadlockExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.BufferOverflowExpr <em>Buffer Overflow Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.BufferOverflowExpr
	 * @generated
	 */
	public Adapter createBufferOverflowExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.ComparisonExpr <em>Comparison Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.ComparisonExpr
	 * @generated
	 */
	public Adapter createComparisonExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.MessageInBufferExpr <em>Message In Buffer Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.MessageInBufferExpr
	 * @generated
	 */
	public Adapter createMessageInBufferExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.MessageInTransitExpr <em>Message In Transit Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.MessageInTransitExpr
	 * @generated
	 */
	public Adapter createMessageInTransitExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.StateActiveExpr <em>State Active Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.StateActiveExpr
	 * @generated
	 */
	public Adapter createStateActiveExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.SubstateOfExpr <em>Substate Of Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.SubstateOfExpr
	 * @generated
	 */
	public Adapter createSubstateOfExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.TransitionFiringExpr <em>Transition Firing Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.TransitionFiringExpr
	 * @generated
	 */
	public Adapter createTransitionFiringExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.PredicateExpr <em>Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.PredicateExpr
	 * @generated
	 */
	public Adapter createPredicateExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.DynamicPredicateExpr <em>Dynamic Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.DynamicPredicateExpr
	 * @generated
	 */
	public Adapter createDynamicPredicateExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Predicates.StaticPredicateExpr <em>Static Predicate Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Predicates.StaticPredicateExpr
	 * @generated
	 */
	public Adapter createStaticPredicateExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.ExtendableElement <em>Extendable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.ExtendableElement
	 * @generated
	 */
	public Adapter createExtendableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.storydriven.core.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.storydriven.core.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint <em>Temporal Logic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint
	 * @generated
	 */
	public Adapter createTemporalLogicConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mtctl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mtctl.Expression
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
