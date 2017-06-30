/**
 */
package org.muml.uppaal.adapter.mtctl.quantifiers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.quantifiers.AFExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.AGExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.BoundVariable;
import org.muml.uppaal.adapter.mtctl.quantifiers.EFExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.EGExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.ExistenceQuantExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.LeadsToExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.QuantifierExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersPackage;
import org.muml.uppaal.adapter.mtctl.quantifiers.TemporalQuantifierExpr;
import org.muml.uppaal.adapter.mtctl.quantifiers.UniversalQuantExpr;

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
 * @see org.muml.uppaal.adapter.mtctl.quantifiers.QuantifiersPackage
 * @generated
 */
public class QuantifiersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuantifiersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiersSwitch() {
		if (modelPackage == null) {
			modelPackage = QuantifiersPackage.eINSTANCE;
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
			case QuantifiersPackage.AF_EXPR: {
				AFExpr afExpr = (AFExpr)theEObject;
				T result = caseAFExpr(afExpr);
				if (result == null) result = caseTemporalQuantifierExpr(afExpr);
				if (result == null) result = caseExpression(afExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifiersPackage.AG_EXPR: {
				AGExpr agExpr = (AGExpr)theEObject;
				T result = caseAGExpr(agExpr);
				if (result == null) result = caseTemporalQuantifierExpr(agExpr);
				if (result == null) result = caseExpression(agExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifiersPackage.EF_EXPR: {
				EFExpr efExpr = (EFExpr)theEObject;
				T result = caseEFExpr(efExpr);
				if (result == null) result = caseTemporalQuantifierExpr(efExpr);
				if (result == null) result = caseExpression(efExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifiersPackage.EG_EXPR: {
				EGExpr egExpr = (EGExpr)theEObject;
				T result = caseEGExpr(egExpr);
				if (result == null) result = caseTemporalQuantifierExpr(egExpr);
				if (result == null) result = caseExpression(egExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifiersPackage.EXISTENCE_QUANT_EXPR: {
				ExistenceQuantExpr existenceQuantExpr = (ExistenceQuantExpr)theEObject;
				T result = caseExistenceQuantExpr(existenceQuantExpr);
				if (result == null) result = caseQuantifierExpr(existenceQuantExpr);
				if (result == null) result = caseExpression(existenceQuantExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifiersPackage.QUANTIFIER_EXPR: {
				QuantifierExpr quantifierExpr = (QuantifierExpr)theEObject;
				T result = caseQuantifierExpr(quantifierExpr);
				if (result == null) result = caseExpression(quantifierExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifiersPackage.BOUND_VARIABLE: {
				BoundVariable boundVariable = (BoundVariable)theEObject;
				T result = caseBoundVariable(boundVariable);
				if (result == null) result = caseExpression(boundVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifiersPackage.TEMPORAL_QUANTIFIER_EXPR: {
				TemporalQuantifierExpr temporalQuantifierExpr = (TemporalQuantifierExpr)theEObject;
				T result = caseTemporalQuantifierExpr(temporalQuantifierExpr);
				if (result == null) result = caseExpression(temporalQuantifierExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifiersPackage.UNIVERSAL_QUANT_EXPR: {
				UniversalQuantExpr universalQuantExpr = (UniversalQuantExpr)theEObject;
				T result = caseUniversalQuantExpr(universalQuantExpr);
				if (result == null) result = caseQuantifierExpr(universalQuantExpr);
				if (result == null) result = caseExpression(universalQuantExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuantifiersPackage.LEADS_TO_EXPR: {
				LeadsToExpr leadsToExpr = (LeadsToExpr)theEObject;
				T result = caseLeadsToExpr(leadsToExpr);
				if (result == null) result = caseTemporalQuantifierExpr(leadsToExpr);
				if (result == null) result = caseExpression(leadsToExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AF Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AF Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAFExpr(AFExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AG Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AG Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAGExpr(AGExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EF Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EF Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFExpr(EFExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EG Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EG Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGExpr(EGExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence Quant Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence Quant Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceQuantExpr(ExistenceQuantExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantifier Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantifier Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifierExpr(QuantifierExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundVariable(BoundVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Quantifier Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Quantifier Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalQuantifierExpr(TemporalQuantifierExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universal Quant Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universal Quant Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalQuantExpr(UniversalQuantExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leads To Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leads To Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeadsToExpr(LeadsToExpr object) {
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

} //QuantifiersSwitch
