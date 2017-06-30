/**
 */
package org.muml.uppaal.adapter.mtctl.comparables.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.comparables.BufferMsgCountExpr;
import org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage;
import org.muml.uppaal.adapter.mtctl.comparables.ConstExpr;
import org.muml.uppaal.adapter.mtctl.comparables.MapExpr;
import org.muml.uppaal.adapter.mtctl.comparables.MumlElemExpr;
import org.muml.uppaal.adapter.mtctl.comparables.SourceStateExpr;
import org.muml.uppaal.adapter.mtctl.comparables.TargetStateExpr;
import org.muml.uppaal.adapter.mtctl.comparables.TransitionMap;

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
 * @see org.muml.uppaal.adapter.mtctl.comparables.ComparablesPackage
 * @generated
 */
public class ComparablesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComparablesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparablesSwitch() {
		if (modelPackage == null) {
			modelPackage = ComparablesPackage.eINSTANCE;
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
			case ComparablesPackage.BUFFER_MSG_COUNT_EXPR: {
				BufferMsgCountExpr bufferMsgCountExpr = (BufferMsgCountExpr)theEObject;
				T result = caseBufferMsgCountExpr(bufferMsgCountExpr);
				if (result == null) result = caseMapExpr(bufferMsgCountExpr);
				if (result == null) result = caseExpression(bufferMsgCountExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.CONST_EXPR: {
				ConstExpr constExpr = (ConstExpr)theEObject;
				T result = caseConstExpr(constExpr);
				if (result == null) result = caseMapExpr(constExpr);
				if (result == null) result = caseExpression(constExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.MAP_EXPR: {
				MapExpr mapExpr = (MapExpr)theEObject;
				T result = caseMapExpr(mapExpr);
				if (result == null) result = caseExpression(mapExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.MUML_ELEM_EXPR: {
				MumlElemExpr mumlElemExpr = (MumlElemExpr)theEObject;
				T result = caseMumlElemExpr(mumlElemExpr);
				if (result == null) result = caseMapExpr(mumlElemExpr);
				if (result == null) result = caseExpression(mumlElemExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.TRANSITION_MAP: {
				TransitionMap transitionMap = (TransitionMap)theEObject;
				T result = caseTransitionMap(transitionMap);
				if (result == null) result = caseMapExpr(transitionMap);
				if (result == null) result = caseExpression(transitionMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.SOURCE_STATE_EXPR: {
				SourceStateExpr sourceStateExpr = (SourceStateExpr)theEObject;
				T result = caseSourceStateExpr(sourceStateExpr);
				if (result == null) result = caseTransitionMap(sourceStateExpr);
				if (result == null) result = caseMapExpr(sourceStateExpr);
				if (result == null) result = caseExpression(sourceStateExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.TARGET_STATE_EXPR: {
				TargetStateExpr targetStateExpr = (TargetStateExpr)theEObject;
				T result = caseTargetStateExpr(targetStateExpr);
				if (result == null) result = caseTransitionMap(targetStateExpr);
				if (result == null) result = caseMapExpr(targetStateExpr);
				if (result == null) result = caseExpression(targetStateExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer Msg Count Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer Msg Count Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBufferMsgCountExpr(BufferMsgCountExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstExpr(ConstExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapExpr(MapExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Muml Elem Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Muml Elem Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMumlElemExpr(MumlElemExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionMap(TransitionMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source State Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source State Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceStateExpr(SourceStateExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target State Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target State Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetStateExpr(TargetStateExpr object) {
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

} //ComparablesSwitch
