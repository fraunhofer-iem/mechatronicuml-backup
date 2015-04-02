/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage
 * @generated
 */
public interface ConfigurationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationsFactory eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Declaration</em>'.
	 * @generated
	 */
	ConfigurationDeclaration createConfigurationDeclaration();

	/**
	 * Returns a new object of class '<em>Resource Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Declaration</em>'.
	 * @generated
	 */
	ResourceDeclaration createResourceDeclaration();

	/**
	 * Returns a new object of class '<em>Program Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Configuration</em>'.
	 * @generated
	 */
	ProgramConfiguration createProgramConfiguration();

	/**
	 * Returns a new object of class '<em>Task Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Configuration</em>'.
	 * @generated
	 */
	TaskConfiguration createTaskConfiguration();

	/**
	 * Returns a new object of class '<em>Global Var Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Var Reference</em>'.
	 * @generated
	 */
	GlobalVarReference createGlobalVarReference();

	/**
	 * Returns a new object of class '<em>Program Output Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Output Reference</em>'.
	 * @generated
	 */
	ProgramOutputReference createProgramOutputReference();

	/**
	 * Returns a new object of class '<em>FB Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FB Task</em>'.
	 * @generated
	 */
	FBTask createFBTask();

	/**
	 * Returns a new object of class '<em>Prog Cnxn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prog Cnxn</em>'.
	 * @generated
	 */
	ProgCnxn createProgCnxn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigurationsPackage getConfigurationsPackage();

} //ConfigurationsFactory
