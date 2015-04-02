/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables.util;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.*;

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
 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage
 * @generated
 */
public class VariablesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VariablesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariablesSwitch() {
		if (modelPackage == null) {
			modelPackage = VariablesPackage.eINSTANCE;
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
			case VariablesPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariablesPackage.SYMBOLIC_VARIABLE: {
				SymbolicVariable symbolicVariable = (SymbolicVariable)theEObject;
				T result = caseSymbolicVariable(symbolicVariable);
				if (result == null) result = caseNonGlobalVariable(symbolicVariable);
				if (result == null) result = caseVariable(symbolicVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariablesPackage.DIRECT_VARIABLE: {
				DirectVariable directVariable = (DirectVariable)theEObject;
				T result = caseDirectVariable(directVariable);
				if (result == null) result = caseNonGlobalVariable(directVariable);
				if (result == null) result = caseDataSource(directVariable);
				if (result == null) result = caseDataSink(directVariable);
				if (result == null) result = caseProgDataSource(directVariable);
				if (result == null) result = caseAccessDeclaration(directVariable);
				if (result == null) result = caseVariable(directVariable);
				if (result == null) result = caseNamedElement(directVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariablesPackage.NAMED_VARIABLE: {
				NamedVariable namedVariable = (NamedVariable)theEObject;
				T result = caseNamedVariable(namedVariable);
				if (result == null) result = caseSymbolicVariable(namedVariable);
				if (result == null) result = caseNamedElement(namedVariable);
				if (result == null) result = caseNonGlobalVariable(namedVariable);
				if (result == null) result = caseVariable(namedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariablesPackage.MULTI_ELEMENT_VARIABLE: {
				MultiElementVariable multiElementVariable = (MultiElementVariable)theEObject;
				T result = caseMultiElementVariable(multiElementVariable);
				if (result == null) result = caseSymbolicVariable(multiElementVariable);
				if (result == null) result = caseNonGlobalVariable(multiElementVariable);
				if (result == null) result = caseVariable(multiElementVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariablesPackage.STRUCTURED_VARIABLE: {
				StructuredVariable structuredVariable = (StructuredVariable)theEObject;
				T result = caseStructuredVariable(structuredVariable);
				if (result == null) result = caseMultiElementVariable(structuredVariable);
				if (result == null) result = caseSymbolicVariable(structuredVariable);
				if (result == null) result = caseNonGlobalVariable(structuredVariable);
				if (result == null) result = caseVariable(structuredVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariablesPackage.ARRAY_VARIABLE: {
				ArrayVariable arrayVariable = (ArrayVariable)theEObject;
				T result = caseArrayVariable(arrayVariable);
				if (result == null) result = caseMultiElementVariable(arrayVariable);
				if (result == null) result = caseSymbolicVariable(arrayVariable);
				if (result == null) result = caseNonGlobalVariable(arrayVariable);
				if (result == null) result = caseVariable(arrayVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariablesPackage.FIELD_SELECTOR: {
				FieldSelector fieldSelector = (FieldSelector)theEObject;
				T result = caseFieldSelector(fieldSelector);
				if (result == null) result = caseNamedElement(fieldSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariablesPackage.GLOBAL_VAR: {
				GlobalVar globalVar = (GlobalVar)theEObject;
				T result = caseGlobalVar(globalVar);
				if (result == null) result = caseVariable(globalVar);
				if (result == null) result = caseNamedElement(globalVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariablesPackage.NON_GLOBAL_VARIABLE: {
				NonGlobalVariable nonGlobalVariable = (NonGlobalVariable)theEObject;
				T result = caseNonGlobalVariable(nonGlobalVariable);
				if (result == null) result = caseVariable(nonGlobalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VariablesPackage.FB_NAME: {
				FBName fbName = (FBName)theEObject;
				T result = caseFBName(fbName);
				if (result == null) result = caseVariable(fbName);
				if (result == null) result = caseNamedElement(fbName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolic Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolic Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolicVariable(SymbolicVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectVariable(DirectVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedVariable(NamedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Element Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Element Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiElementVariable(MultiElementVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredVariable(StructuredVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayVariable(ArrayVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldSelector(FieldSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVar(GlobalVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonGlobalVariable(NonGlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FB Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FB Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBName(FBName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSink(DataSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prog Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prog Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgDataSource(ProgDataSource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Access Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessDeclaration(AccessDeclaration object) {
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

} //VariablesSwitch
