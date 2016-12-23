/**
 */
package org.muml.uppaal.adapter.mtctl.sets.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.sets.*;

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
 * @see org.muml.uppaal.adapter.mtctl.sets.SetsPackage
 * @generated
 */
public class SetsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SetsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetsSwitch() {
		if (modelPackage == null) {
			modelPackage = SetsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case SetsPackage.SET_EXPR: {
				SetExpr setExpr = (SetExpr)theEObject;
				T result = caseSetExpr(setExpr);
				if (result == null) result = caseExpression(setExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetsPackage.CLOCK_SET_EXPR: {
				ClockSetExpr clockSetExpr = (ClockSetExpr)theEObject;
				T result = caseClockSetExpr(clockSetExpr);
				if (result == null) result = caseSetExpr(clockSetExpr);
				if (result == null) result = caseExpression(clockSetExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetsPackage.INTERVAL_SET_EXPR: {
				IntervalSetExpr intervalSetExpr = (IntervalSetExpr)theEObject;
				T result = caseIntervalSetExpr(intervalSetExpr);
				if (result == null) result = caseSetExpr(intervalSetExpr);
				if (result == null) result = caseExpression(intervalSetExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetsPackage.MESSAGE_SET_EXPR: {
				MessageSetExpr messageSetExpr = (MessageSetExpr)theEObject;
				T result = caseMessageSetExpr(messageSetExpr);
				if (result == null) result = caseSetExpr(messageSetExpr);
				if (result == null) result = caseExpression(messageSetExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetsPackage.STATE_SET_EXPR: {
				StateSetExpr stateSetExpr = (StateSetExpr)theEObject;
				T result = caseStateSetExpr(stateSetExpr);
				if (result == null) result = caseSetExpr(stateSetExpr);
				if (result == null) result = caseExpression(stateSetExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetsPackage.TRANSITION_SET_EXPR: {
				TransitionSetExpr transitionSetExpr = (TransitionSetExpr)theEObject;
				T result = caseTransitionSetExpr(transitionSetExpr);
				if (result == null) result = caseSetExpr(transitionSetExpr);
				if (result == null) result = caseExpression(transitionSetExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetsPackage.BUFFER_SET_EXPR: {
				BufferSetExpr bufferSetExpr = (BufferSetExpr)theEObject;
				T result = caseBufferSetExpr(bufferSetExpr);
				if (result == null) result = caseSetExpr(bufferSetExpr);
				if (result == null) result = caseExpression(bufferSetExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetsPackage.INSTANCE_SET_EXPR: {
				InstanceSetExpr instanceSetExpr = (InstanceSetExpr)theEObject;
				T result = caseInstanceSetExpr(instanceSetExpr);
				if (result == null) result = caseSetExpr(instanceSetExpr);
				if (result == null) result = caseExpression(instanceSetExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SetsPackage.SUBINSTANCE_SET_EXPR: {
				SubinstanceSetExpr subinstanceSetExpr = (SubinstanceSetExpr)theEObject;
				T result = caseSubinstanceSetExpr(subinstanceSetExpr);
				if (result == null) result = caseSetExpr(subinstanceSetExpr);
				if (result == null) result = caseExpression(subinstanceSetExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetExpr(SetExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Set Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockSetExpr(ClockSetExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Set Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalSetExpr(IntervalSetExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Set Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageSetExpr(MessageSetExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Set Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateSetExpr(StateSetExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Set Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionSetExpr(TransitionSetExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer Set Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBufferSetExpr(BufferSetExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Set Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSetExpr(InstanceSetExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subinstance Set Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subinstance Set Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubinstanceSetExpr(SubinstanceSetExpr object) {
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

} //SetsSwitch
