/**
 */
package mtctl.Comparables.util;

import de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint;
import mtctl.Comparables.*;

import mtctl.Expression;
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
 * @see mtctl.Comparables.ComparablesPackage
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
			case ComparablesPackage.BUFFER_MSG_COUNT_EXPR: {
				BufferMsgCountExpr bufferMsgCountExpr = (BufferMsgCountExpr)theEObject;
				T result = caseBufferMsgCountExpr(bufferMsgCountExpr);
				if (result == null) result = caseDynamicMapExpr(bufferMsgCountExpr);
				if (result == null) result = caseMapExpr(bufferMsgCountExpr);
				if (result == null) result = caseExpression(bufferMsgCountExpr);
				if (result == null) result = caseProperty(bufferMsgCountExpr);
				if (result == null) result = caseCommentableElement(bufferMsgCountExpr);
				if (result == null) result = caseTemporalLogicConstraint(bufferMsgCountExpr);
				if (result == null) result = caseExtendableElement(bufferMsgCountExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.CONST_EXPR: {
				ConstExpr constExpr = (ConstExpr)theEObject;
				T result = caseConstExpr(constExpr);
				if (result == null) result = caseStaticMapExpr(constExpr);
				if (result == null) result = caseMapExpr(constExpr);
				if (result == null) result = caseExpression(constExpr);
				if (result == null) result = caseProperty(constExpr);
				if (result == null) result = caseCommentableElement(constExpr);
				if (result == null) result = caseTemporalLogicConstraint(constExpr);
				if (result == null) result = caseExtendableElement(constExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.MAP_EXPR: {
				MapExpr mapExpr = (MapExpr)theEObject;
				T result = caseMapExpr(mapExpr);
				if (result == null) result = caseExpression(mapExpr);
				if (result == null) result = caseProperty(mapExpr);
				if (result == null) result = caseCommentableElement(mapExpr);
				if (result == null) result = caseTemporalLogicConstraint(mapExpr);
				if (result == null) result = caseExtendableElement(mapExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.PRIMITIVE_VARIABLE_EXPR: {
				PrimitiveVariableExpr primitiveVariableExpr = (PrimitiveVariableExpr)theEObject;
				T result = casePrimitiveVariableExpr(primitiveVariableExpr);
				if (result == null) result = caseDynamicMapExpr(primitiveVariableExpr);
				if (result == null) result = caseMapExpr(primitiveVariableExpr);
				if (result == null) result = caseExpression(primitiveVariableExpr);
				if (result == null) result = caseProperty(primitiveVariableExpr);
				if (result == null) result = caseCommentableElement(primitiveVariableExpr);
				if (result == null) result = caseTemporalLogicConstraint(primitiveVariableExpr);
				if (result == null) result = caseExtendableElement(primitiveVariableExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.STATIC_MAP_EXPR: {
				StaticMapExpr staticMapExpr = (StaticMapExpr)theEObject;
				T result = caseStaticMapExpr(staticMapExpr);
				if (result == null) result = caseMapExpr(staticMapExpr);
				if (result == null) result = caseExpression(staticMapExpr);
				if (result == null) result = caseProperty(staticMapExpr);
				if (result == null) result = caseCommentableElement(staticMapExpr);
				if (result == null) result = caseTemporalLogicConstraint(staticMapExpr);
				if (result == null) result = caseExtendableElement(staticMapExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComparablesPackage.DYNAMIC_MAP_EXPR: {
				DynamicMapExpr dynamicMapExpr = (DynamicMapExpr)theEObject;
				T result = caseDynamicMapExpr(dynamicMapExpr);
				if (result == null) result = caseMapExpr(dynamicMapExpr);
				if (result == null) result = caseExpression(dynamicMapExpr);
				if (result == null) result = caseProperty(dynamicMapExpr);
				if (result == null) result = caseCommentableElement(dynamicMapExpr);
				if (result == null) result = caseTemporalLogicConstraint(dynamicMapExpr);
				if (result == null) result = caseExtendableElement(dynamicMapExpr);
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
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Variable Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Variable Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveVariableExpr(PrimitiveVariableExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Map Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Map Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticMapExpr(StaticMapExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Map Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Map Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicMapExpr(DynamicMapExpr object) {
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

} //ComparablesSwitch
