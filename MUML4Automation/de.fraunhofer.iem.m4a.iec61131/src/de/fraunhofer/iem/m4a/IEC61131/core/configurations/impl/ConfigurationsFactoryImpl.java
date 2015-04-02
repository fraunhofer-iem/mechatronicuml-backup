/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationsFactoryImpl extends EFactoryImpl implements ConfigurationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationsFactory init() {
		try {
			ConfigurationsFactory theConfigurationsFactory = (ConfigurationsFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigurationsPackage.eNS_URI);
			if (theConfigurationsFactory != null) {
				return theConfigurationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfigurationsPackage.CONFIGURATION_DECLARATION: return createConfigurationDeclaration();
			case ConfigurationsPackage.RESOURCE_DECLARATION: return createResourceDeclaration();
			case ConfigurationsPackage.PROGRAM_CONFIGURATION: return createProgramConfiguration();
			case ConfigurationsPackage.TASK_CONFIGURATION: return createTaskConfiguration();
			case ConfigurationsPackage.GLOBAL_VAR_REFERENCE: return createGlobalVarReference();
			case ConfigurationsPackage.PROGRAM_OUTPUT_REFERENCE: return createProgramOutputReference();
			case ConfigurationsPackage.FB_TASK: return createFBTask();
			case ConfigurationsPackage.PROG_CNXN: return createProgCnxn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigurationsPackage.RETAIN:
				return createRetainFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConfigurationsPackage.RETAIN:
				return convertRetainToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationDeclaration createConfigurationDeclaration() {
		ConfigurationDeclarationImpl configurationDeclaration = new ConfigurationDeclarationImpl();
		return configurationDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclaration createResourceDeclaration() {
		ResourceDeclarationImpl resourceDeclaration = new ResourceDeclarationImpl();
		return resourceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramConfiguration createProgramConfiguration() {
		ProgramConfigurationImpl programConfiguration = new ProgramConfigurationImpl();
		return programConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskConfiguration createTaskConfiguration() {
		TaskConfigurationImpl taskConfiguration = new TaskConfigurationImpl();
		return taskConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVarReference createGlobalVarReference() {
		GlobalVarReferenceImpl globalVarReference = new GlobalVarReferenceImpl();
		return globalVarReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramOutputReference createProgramOutputReference() {
		ProgramOutputReferenceImpl programOutputReference = new ProgramOutputReferenceImpl();
		return programOutputReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBTask createFBTask() {
		FBTaskImpl fbTask = new FBTaskImpl();
		return fbTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgCnxn createProgCnxn() {
		ProgCnxnImpl progCnxn = new ProgCnxnImpl();
		return progCnxn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retain createRetainFromString(EDataType eDataType, String initialValue) {
		Retain result = Retain.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRetainToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationsPackage getConfigurationsPackage() {
		return (ConfigurationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationsPackage getPackage() {
		return ConfigurationsPackage.eINSTANCE;
	}

} //ConfigurationsFactoryImpl
