/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous.util;

import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ExternalVarSpec;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarSpecInit;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.CommentableElement;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage
 * @generated
 */
public class PousSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PousPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PousSwitch() {
		if (modelPackage == null) {
			modelPackage = PousPackage.eINSTANCE;
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
			case PousPackage.FUNCTION_DECLARATION: {
				FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
				T result = caseFunctionDeclaration(functionDeclaration);
				if (result == null) result = casePOU(functionDeclaration);
				if (result == null) result = caseLibraryElement(functionDeclaration);
				if (result == null) result = caseCommentableElement(functionDeclaration);
				if (result == null) result = caseNamedElement(functionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PousPackage.FUNCTION_RETURN_DOMAIN: {
				FunctionReturnDomain functionReturnDomain = (FunctionReturnDomain)theEObject;
				T result = caseFunctionReturnDomain(functionReturnDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PousPackage.FUNCTION_BODY: {
				FunctionBody functionBody = (FunctionBody)theEObject;
				T result = caseFunctionBody(functionBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PousPackage.FUNCTION_BLOCK_DECLARATION: {
				FunctionBlockDeclaration functionBlockDeclaration = (FunctionBlockDeclaration)theEObject;
				T result = caseFunctionBlockDeclaration(functionBlockDeclaration);
				if (result == null) result = caseAbstractFunctionBlockDeclaration(functionBlockDeclaration);
				if (result == null) result = casePOU(functionBlockDeclaration);
				if (result == null) result = caseLibraryElement(functionBlockDeclaration);
				if (result == null) result = caseCommentableElement(functionBlockDeclaration);
				if (result == null) result = caseNamedElement(functionBlockDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PousPackage.FUNCTION_BLOCK_BODY: {
				FunctionBlockBody functionBlockBody = (FunctionBlockBody)theEObject;
				T result = caseFunctionBlockBody(functionBlockBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PousPackage.PROGRAM_DECLARATION: {
				ProgramDeclaration programDeclaration = (ProgramDeclaration)theEObject;
				T result = caseProgramDeclaration(programDeclaration);
				if (result == null) result = casePOU(programDeclaration);
				if (result == null) result = caseLibraryElement(programDeclaration);
				if (result == null) result = caseCommentableElement(programDeclaration);
				if (result == null) result = caseNamedElement(programDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PousPackage.POU: {
				POU pou = (POU)theEObject;
				T result = casePOU(pou);
				if (result == null) result = caseLibraryElement(pou);
				if (result == null) result = caseCommentableElement(pou);
				if (result == null) result = caseNamedElement(pou);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PousPackage.ABSTRACT_FUNCTION_BLOCK_DECLARATION: {
				AbstractFunctionBlockDeclaration abstractFunctionBlockDeclaration = (AbstractFunctionBlockDeclaration)theEObject;
				T result = caseAbstractFunctionBlockDeclaration(abstractFunctionBlockDeclaration);
				if (result == null) result = casePOU(abstractFunctionBlockDeclaration);
				if (result == null) result = caseLibraryElement(abstractFunctionBlockDeclaration);
				if (result == null) result = caseCommentableElement(abstractFunctionBlockDeclaration);
				if (result == null) result = caseNamedElement(abstractFunctionBlockDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PousPackage.BLACKBOX_FUNCTION_BLOCK_DECLARATION: {
				BlackboxFunctionBlockDeclaration blackboxFunctionBlockDeclaration = (BlackboxFunctionBlockDeclaration)theEObject;
				T result = caseBlackboxFunctionBlockDeclaration(blackboxFunctionBlockDeclaration);
				if (result == null) result = caseAbstractFunctionBlockDeclaration(blackboxFunctionBlockDeclaration);
				if (result == null) result = casePOU(blackboxFunctionBlockDeclaration);
				if (result == null) result = caseLibraryElement(blackboxFunctionBlockDeclaration);
				if (result == null) result = caseCommentableElement(blackboxFunctionBlockDeclaration);
				if (result == null) result = caseNamedElement(blackboxFunctionBlockDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PousPackage.FUNCTION_BLOCK_POINTER: {
				FunctionBlockPointer functionBlockPointer = (FunctionBlockPointer)theEObject;
				T result = caseFunctionBlockPointer(functionBlockPointer);
				if (result == null) result = caseExternalVarSpec(functionBlockPointer);
				if (result == null) result = caseGlobalVarSpecInit(functionBlockPointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDeclaration(FunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Return Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Return Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionReturnDomain(FunctionReturnDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBody(FunctionBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Block Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Block Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBlockDeclaration(FunctionBlockDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Block Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Block Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBlockBody(FunctionBlockBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramDeclaration(ProgramDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOU(POU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Function Block Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Function Block Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFunctionBlockDeclaration(AbstractFunctionBlockDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blackbox Function Block Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blackbox Function Block Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackboxFunctionBlockDeclaration(BlackboxFunctionBlockDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Block Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Block Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBlockPointer(FunctionBlockPointer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryElement(LibraryElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>External Var Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Var Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalVarSpec(ExternalVarSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Var Spec Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Var Spec Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVarSpecInit(GlobalVarSpecInit object) {
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

} //PousSwitch
