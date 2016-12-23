/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.muml.core.CommentableElement;
import org.muml.core.ExtendableElement;
import org.muml.core.NamedElement;
import org.muml.reconfigurationverification.tctl.*;
import org.muml.reconfigurationverification.tctl.AtomicFormula;
import org.muml.reconfigurationverification.tctl.AtomicProposition;
import org.muml.reconfigurationverification.tctl.BinaryFormula;
import org.muml.reconfigurationverification.tctl.BinaryLogicFormula;
import org.muml.reconfigurationverification.tctl.BinaryTemporalFormula;
import org.muml.reconfigurationverification.tctl.FormulaDefinition;
import org.muml.reconfigurationverification.tctl.NotFormula;
import org.muml.reconfigurationverification.tctl.TCTLFormula;
import org.muml.reconfigurationverification.tctl.TctlPackage;
import org.muml.reconfigurationverification.tctl.TemporalFormula;
import org.muml.reconfigurationverification.tctl.Term;
import org.muml.reconfigurationverification.tctl.UnaryFormula;
import org.muml.reconfigurationverification.tctl.UnaryTemporalFormula;

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
 * @see org.muml.reconfigurationverification.tctl.TctlPackage
 * @generated
 */
public class TctlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TctlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TctlSwitch() {
		if (modelPackage == null) {
			modelPackage = TctlPackage.eINSTANCE;
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
			case TctlPackage.FORMULA_DEFINITION: {
				FormulaDefinition formulaDefinition = (FormulaDefinition)theEObject;
				T result = caseFormulaDefinition(formulaDefinition);
				if (result == null) result = caseExtendableElement(formulaDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.ATOMIC_FORMULA: {
				AtomicFormula atomicFormula = (AtomicFormula)theEObject;
				T result = caseAtomicFormula(atomicFormula);
				if (result == null) result = caseFormulaDefinition(atomicFormula);
				if (result == null) result = caseExtendableElement(atomicFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.UNARY_FORMULA: {
				UnaryFormula unaryFormula = (UnaryFormula)theEObject;
				T result = caseUnaryFormula(unaryFormula);
				if (result == null) result = caseFormulaDefinition(unaryFormula);
				if (result == null) result = caseExtendableElement(unaryFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.BINARY_FORMULA: {
				BinaryFormula binaryFormula = (BinaryFormula)theEObject;
				T result = caseBinaryFormula(binaryFormula);
				if (result == null) result = caseFormulaDefinition(binaryFormula);
				if (result == null) result = caseExtendableElement(binaryFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.NOT_FORMULA: {
				NotFormula notFormula = (NotFormula)theEObject;
				T result = caseNotFormula(notFormula);
				if (result == null) result = caseUnaryFormula(notFormula);
				if (result == null) result = caseFormulaDefinition(notFormula);
				if (result == null) result = caseExtendableElement(notFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.UNARY_TEMPORAL_FORMULA: {
				UnaryTemporalFormula unaryTemporalFormula = (UnaryTemporalFormula)theEObject;
				T result = caseUnaryTemporalFormula(unaryTemporalFormula);
				if (result == null) result = caseUnaryFormula(unaryTemporalFormula);
				if (result == null) result = caseTemporalFormula(unaryTemporalFormula);
				if (result == null) result = caseFormulaDefinition(unaryTemporalFormula);
				if (result == null) result = caseExtendableElement(unaryTemporalFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.BINARY_LOGIC_FORMULA: {
				BinaryLogicFormula binaryLogicFormula = (BinaryLogicFormula)theEObject;
				T result = caseBinaryLogicFormula(binaryLogicFormula);
				if (result == null) result = caseBinaryFormula(binaryLogicFormula);
				if (result == null) result = caseFormulaDefinition(binaryLogicFormula);
				if (result == null) result = caseExtendableElement(binaryLogicFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.BINARY_TEMPORAL_FORMULA: {
				BinaryTemporalFormula binaryTemporalFormula = (BinaryTemporalFormula)theEObject;
				T result = caseBinaryTemporalFormula(binaryTemporalFormula);
				if (result == null) result = caseBinaryFormula(binaryTemporalFormula);
				if (result == null) result = caseTemporalFormula(binaryTemporalFormula);
				if (result == null) result = caseFormulaDefinition(binaryTemporalFormula);
				if (result == null) result = caseExtendableElement(binaryTemporalFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.TEMPORAL_FORMULA: {
				TemporalFormula temporalFormula = (TemporalFormula)theEObject;
				T result = caseTemporalFormula(temporalFormula);
				if (result == null) result = caseExtendableElement(temporalFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseExtendableElement(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.ATOMIC_PROPOSITION: {
				AtomicProposition atomicProposition = (AtomicProposition)theEObject;
				T result = caseAtomicProposition(atomicProposition);
				if (result == null) result = caseTerm(atomicProposition);
				if (result == null) result = caseNamedElement(atomicProposition);
				if (result == null) result = caseExtendableElement(atomicProposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TctlPackage.TCTL_FORMULA: {
				TCTLFormula tctlFormula = (TCTLFormula)theEObject;
				T result = caseTCTLFormula(tctlFormula);
				if (result == null) result = caseCommentableElement(tctlFormula);
				if (result == null) result = caseExtendableElement(tctlFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulaDefinition(FormulaDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCTL Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCTL Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCTLFormula(TCTLFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicFormula(AtomicFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryFormula(UnaryFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryFormula(BinaryFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotFormula(NotFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Temporal Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Temporal Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryTemporalFormula(UnaryTemporalFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Logic Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Logic Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryLogicFormula(BinaryLogicFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Temporal Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Temporal Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryTemporalFormula(BinaryTemporalFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalFormula(TemporalFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Proposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicProposition(AtomicProposition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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

} //TctlSwitch
