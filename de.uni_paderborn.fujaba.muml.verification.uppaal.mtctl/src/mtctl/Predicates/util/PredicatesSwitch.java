/**
 */
package mtctl.Predicates.util;

import de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint;

import mtctl.Expression;

import mtctl.Predicates.*;

import mtctl.Property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mtctl.Predicates.PredicatesPackage
 * @generated
 */
public class PredicatesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PredicatesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicatesSwitch() {
		if (modelPackage == null) {
			modelPackage = PredicatesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PredicatesPackage.DEADLOCK_EXPR: {
				DeadlockExpr deadlockExpr = (DeadlockExpr)theEObject;
				T result = caseDeadlockExpr(deadlockExpr);
				if (result == null) result = caseDynamicPredicateExpr(deadlockExpr);
				if (result == null) result = casePredicateExpr(deadlockExpr);
				if (result == null) result = caseExpression(deadlockExpr);
				if (result == null) result = caseProperty(deadlockExpr);
				if (result == null) result = caseCommentableElement(deadlockExpr);
				if (result == null) result = caseTemporalLogicConstraint(deadlockExpr);
				if (result == null) result = caseExtendableElement(deadlockExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.BUFFER_OVERFLOW_EXPR: {
				BufferOverflowExpr bufferOverflowExpr = (BufferOverflowExpr)theEObject;
				T result = caseBufferOverflowExpr(bufferOverflowExpr);
				if (result == null) result = caseDynamicPredicateExpr(bufferOverflowExpr);
				if (result == null) result = casePredicateExpr(bufferOverflowExpr);
				if (result == null) result = caseExpression(bufferOverflowExpr);
				if (result == null) result = caseProperty(bufferOverflowExpr);
				if (result == null) result = caseCommentableElement(bufferOverflowExpr);
				if (result == null) result = caseTemporalLogicConstraint(bufferOverflowExpr);
				if (result == null) result = caseExtendableElement(bufferOverflowExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.COMPARISON_EXPR: {
				ComparisonExpr comparisonExpr = (ComparisonExpr)theEObject;
				T result = caseComparisonExpr(comparisonExpr);
				if (result == null) result = casePredicateExpr(comparisonExpr);
				if (result == null) result = caseExpression(comparisonExpr);
				if (result == null) result = caseProperty(comparisonExpr);
				if (result == null) result = caseCommentableElement(comparisonExpr);
				if (result == null) result = caseTemporalLogicConstraint(comparisonExpr);
				if (result == null) result = caseExtendableElement(comparisonExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.MESSAGE_IN_BUFFER_EXPR: {
				MessageInBufferExpr messageInBufferExpr = (MessageInBufferExpr)theEObject;
				T result = caseMessageInBufferExpr(messageInBufferExpr);
				if (result == null) result = caseDynamicPredicateExpr(messageInBufferExpr);
				if (result == null) result = casePredicateExpr(messageInBufferExpr);
				if (result == null) result = caseExpression(messageInBufferExpr);
				if (result == null) result = caseProperty(messageInBufferExpr);
				if (result == null) result = caseCommentableElement(messageInBufferExpr);
				if (result == null) result = caseTemporalLogicConstraint(messageInBufferExpr);
				if (result == null) result = caseExtendableElement(messageInBufferExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.MESSAGE_IN_TRANSIT_EXPR: {
				MessageInTransitExpr messageInTransitExpr = (MessageInTransitExpr)theEObject;
				T result = caseMessageInTransitExpr(messageInTransitExpr);
				if (result == null) result = caseDynamicPredicateExpr(messageInTransitExpr);
				if (result == null) result = casePredicateExpr(messageInTransitExpr);
				if (result == null) result = caseExpression(messageInTransitExpr);
				if (result == null) result = caseProperty(messageInTransitExpr);
				if (result == null) result = caseCommentableElement(messageInTransitExpr);
				if (result == null) result = caseTemporalLogicConstraint(messageInTransitExpr);
				if (result == null) result = caseExtendableElement(messageInTransitExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.STATE_ACTIVE_EXPR: {
				StateActiveExpr stateActiveExpr = (StateActiveExpr)theEObject;
				T result = caseStateActiveExpr(stateActiveExpr);
				if (result == null) result = caseDynamicPredicateExpr(stateActiveExpr);
				if (result == null) result = casePredicateExpr(stateActiveExpr);
				if (result == null) result = caseExpression(stateActiveExpr);
				if (result == null) result = caseProperty(stateActiveExpr);
				if (result == null) result = caseCommentableElement(stateActiveExpr);
				if (result == null) result = caseTemporalLogicConstraint(stateActiveExpr);
				if (result == null) result = caseExtendableElement(stateActiveExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.SUBSTATE_OF_EXPR: {
				SubstateOfExpr substateOfExpr = (SubstateOfExpr)theEObject;
				T result = caseSubstateOfExpr(substateOfExpr);
				if (result == null) result = caseStaticPredicateExpr(substateOfExpr);
				if (result == null) result = casePredicateExpr(substateOfExpr);
				if (result == null) result = caseExpression(substateOfExpr);
				if (result == null) result = caseProperty(substateOfExpr);
				if (result == null) result = caseCommentableElement(substateOfExpr);
				if (result == null) result = caseTemporalLogicConstraint(substateOfExpr);
				if (result == null) result = caseExtendableElement(substateOfExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.TRANSITION_FIRING_EXPR: {
				TransitionFiringExpr transitionFiringExpr = (TransitionFiringExpr)theEObject;
				T result = caseTransitionFiringExpr(transitionFiringExpr);
				if (result == null) result = caseDynamicPredicateExpr(transitionFiringExpr);
				if (result == null) result = casePredicateExpr(transitionFiringExpr);
				if (result == null) result = caseExpression(transitionFiringExpr);
				if (result == null) result = caseProperty(transitionFiringExpr);
				if (result == null) result = caseCommentableElement(transitionFiringExpr);
				if (result == null) result = caseTemporalLogicConstraint(transitionFiringExpr);
				if (result == null) result = caseExtendableElement(transitionFiringExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.PREDICATE_EXPR: {
				PredicateExpr predicateExpr = (PredicateExpr)theEObject;
				T result = casePredicateExpr(predicateExpr);
				if (result == null) result = caseExpression(predicateExpr);
				if (result == null) result = caseProperty(predicateExpr);
				if (result == null) result = caseCommentableElement(predicateExpr);
				if (result == null) result = caseTemporalLogicConstraint(predicateExpr);
				if (result == null) result = caseExtendableElement(predicateExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.DYNAMIC_PREDICATE_EXPR: {
				DynamicPredicateExpr dynamicPredicateExpr = (DynamicPredicateExpr)theEObject;
				T result = caseDynamicPredicateExpr(dynamicPredicateExpr);
				if (result == null) result = casePredicateExpr(dynamicPredicateExpr);
				if (result == null) result = caseExpression(dynamicPredicateExpr);
				if (result == null) result = caseProperty(dynamicPredicateExpr);
				if (result == null) result = caseCommentableElement(dynamicPredicateExpr);
				if (result == null) result = caseTemporalLogicConstraint(dynamicPredicateExpr);
				if (result == null) result = caseExtendableElement(dynamicPredicateExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.STATIC_PREDICATE_EXPR: {
				StaticPredicateExpr staticPredicateExpr = (StaticPredicateExpr)theEObject;
				T result = caseStaticPredicateExpr(staticPredicateExpr);
				if (result == null) result = casePredicateExpr(staticPredicateExpr);
				if (result == null) result = caseExpression(staticPredicateExpr);
				if (result == null) result = caseProperty(staticPredicateExpr);
				if (result == null) result = caseCommentableElement(staticPredicateExpr);
				if (result == null) result = caseTemporalLogicConstraint(staticPredicateExpr);
				if (result == null) result = caseExtendableElement(staticPredicateExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.TRUE_EXPR: {
				TrueExpr trueExpr = (TrueExpr)theEObject;
				T result = caseTrueExpr(trueExpr);
				if (result == null) result = caseStaticPredicateExpr(trueExpr);
				if (result == null) result = casePredicateExpr(trueExpr);
				if (result == null) result = caseExpression(trueExpr);
				if (result == null) result = caseProperty(trueExpr);
				if (result == null) result = caseCommentableElement(trueExpr);
				if (result == null) result = caseTemporalLogicConstraint(trueExpr);
				if (result == null) result = caseExtendableElement(trueExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PredicatesPackage.FALSE_EXPR: {
				FalseExpr falseExpr = (FalseExpr)theEObject;
				T result = caseFalseExpr(falseExpr);
				if (result == null) result = caseStaticPredicateExpr(falseExpr);
				if (result == null) result = casePredicateExpr(falseExpr);
				if (result == null) result = caseExpression(falseExpr);
				if (result == null) result = caseProperty(falseExpr);
				if (result == null) result = caseCommentableElement(falseExpr);
				if (result == null) result = caseTemporalLogicConstraint(falseExpr);
				if (result == null) result = caseExtendableElement(falseExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadlock Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadlock Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadlockExpr(DeadlockExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer Overflow Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer Overflow Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBufferOverflowExpr(BufferOverflowExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonExpr(ComparisonExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message In Buffer Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message In Buffer Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageInBufferExpr(MessageInBufferExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message In Transit Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message In Transit Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageInTransitExpr(MessageInTransitExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Active Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Active Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateActiveExpr(StateActiveExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substate Of Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substate Of Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstateOfExpr(SubstateOfExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Firing Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Firing Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionFiringExpr(TransitionFiringExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateExpr(PredicateExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Predicate Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Predicate Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicPredicateExpr(DynamicPredicateExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Predicate Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Predicate Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticPredicateExpr(StaticPredicateExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueExpr(TrueExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>False Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>False Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFalseExpr(FalseExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Logic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Logic Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalLogicConstraint(TemporalLogicConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PredicatesSwitch
