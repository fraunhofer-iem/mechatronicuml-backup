/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.util;

import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.*;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;
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
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage
 * @generated
 */
public class ConfigurationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigurationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationsSwitch() {
		if (modelPackage == null) {
			modelPackage = ConfigurationsPackage.eINSTANCE;
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
			case ConfigurationsPackage.CONFIGURATION_DECLARATION: {
				ConfigurationDeclaration configurationDeclaration = (ConfigurationDeclaration)theEObject;
				T result = caseConfigurationDeclaration(configurationDeclaration);
				if (result == null) result = caseLibraryElement(configurationDeclaration);
				if (result == null) result = caseNamedElement(configurationDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.RESOURCE_DECLARATION: {
				ResourceDeclaration resourceDeclaration = (ResourceDeclaration)theEObject;
				T result = caseResourceDeclaration(resourceDeclaration);
				if (result == null) result = caseNamedElement(resourceDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.PROGRAM_CONFIGURATION: {
				ProgramConfiguration programConfiguration = (ProgramConfiguration)theEObject;
				T result = caseProgramConfiguration(programConfiguration);
				if (result == null) result = caseNamedElement(programConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.TASK_CONFIGURATION: {
				TaskConfiguration taskConfiguration = (TaskConfiguration)theEObject;
				T result = caseTaskConfiguration(taskConfiguration);
				if (result == null) result = caseNamedElement(taskConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.GLOBAL_VAR_REFERENCE: {
				GlobalVarReference globalVarReference = (GlobalVarReference)theEObject;
				T result = caseGlobalVarReference(globalVarReference);
				if (result == null) result = caseDataSource(globalVarReference);
				if (result == null) result = caseDataSink(globalVarReference);
				if (result == null) result = caseProgDataSource(globalVarReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.PROGRAM_OUTPUT_REFERENCE: {
				ProgramOutputReference programOutputReference = (ProgramOutputReference)theEObject;
				T result = caseProgramOutputReference(programOutputReference);
				if (result == null) result = caseDataSource(programOutputReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.PROG_CONF_ELEMENT: {
				ProgConfElement progConfElement = (ProgConfElement)theEObject;
				T result = caseProgConfElement(progConfElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.FB_TASK: {
				FBTask fbTask = (FBTask)theEObject;
				T result = caseFBTask(fbTask);
				if (result == null) result = caseProgConfElement(fbTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.PROG_CNXN: {
				ProgCnxn progCnxn = (ProgCnxn)theEObject;
				T result = caseProgCnxn(progCnxn);
				if (result == null) result = caseProgConfElement(progCnxn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.PROG_DATA_SOURCE: {
				ProgDataSource progDataSource = (ProgDataSource)theEObject;
				T result = caseProgDataSource(progDataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigurationsPackage.DATA_SINK: {
				DataSink dataSink = (DataSink)theEObject;
				T result = caseDataSink(dataSink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationDeclaration(ConfigurationDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDeclaration(ResourceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramConfiguration(ProgramConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskConfiguration(TaskConfiguration object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Global Var Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Var Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVarReference(GlobalVarReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Output Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Output Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramOutputReference(ProgramOutputReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prog Conf Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prog Conf Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgConfElement(ProgConfElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FB Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FB Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBTask(FBTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prog Cnxn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prog Cnxn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgCnxn(ProgCnxn object) {
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

} //ConfigurationsSwitch
