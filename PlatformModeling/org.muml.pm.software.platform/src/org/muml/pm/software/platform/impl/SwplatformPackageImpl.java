/**
 */
package org.muml.pm.software.platform.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.msgtype.MsgtypePackage;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.ValuetypePackage;
import org.muml.pm.software.platform.APICommand;
import org.muml.pm.software.platform.APIRepository;
import org.muml.pm.software.platform.Constraint;
import org.muml.pm.software.platform.EnumerationDataType;
import org.muml.pm.software.platform.EnumerationValue;
import org.muml.pm.software.platform.Import;
import org.muml.pm.software.platform.OperatingSystem;
import org.muml.pm.software.platform.SwplatformFactory;
import org.muml.pm.software.platform.SwplatformPackage;
import org.muml.pm.software.platform.TimeConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwplatformPackageImpl extends EPackageImpl implements SwplatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.muml.pm.software.platform.SwplatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SwplatformPackageImpl() {
		super(eNS_URI, SwplatformFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SwplatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SwplatformPackage init() {
		if (isInited) return (SwplatformPackage)EPackage.Registry.INSTANCE.getEPackage(SwplatformPackage.eNS_URI);

		// Obtain or create and register package
		SwplatformPackageImpl theSwplatformPackage = (SwplatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SwplatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SwplatformPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		ProtocolPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgtypePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSwplatformPackage.createPackageContents();

		// Initialize created meta-data
		theSwplatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSwplatformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SwplatformPackage.eNS_URI, theSwplatformPackage);
		return theSwplatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingSystem() {
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_Apirepositories() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_EnumerationDataTypes() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_Imports() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIRepository() {
		return apiRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIRepository_ApiCommands() {
		return (EReference)apiRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIRepository_SwPlatform() {
		return (EReference)apiRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPICommand() {
		return apiCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPICommand_ReturnDataType() {
		return (EReference)apiCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPICommand_Parameters() {
		return (EReference)apiCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPICommand_Repository() {
		return (EReference)apiCommandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPICommand_Constraints() {
		return (EReference)apiCommandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationValue() {
		return enumerationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationValue_Value() {
		return (EAttribute)enumerationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationValue_EnumerationDataType() {
		return (EReference)enumerationValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationDataType() {
		return enumerationDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationDataType_EnumerationValues() {
		return (EReference)enumerationDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ApiCommand() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeConstraint() {
		return timeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeConstraint_SamplingTime() {
		return (EReference)timeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportURI() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwplatformFactory getSwplatformFactory() {
		return (SwplatformFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		operatingSystemEClass = createEClass(OPERATING_SYSTEM);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__APIREPOSITORIES);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__ENUMERATION_DATA_TYPES);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__IMPORTS);

		apiRepositoryEClass = createEClass(API_REPOSITORY);
		createEReference(apiRepositoryEClass, API_REPOSITORY__API_COMMANDS);
		createEReference(apiRepositoryEClass, API_REPOSITORY__SW_PLATFORM);

		apiCommandEClass = createEClass(API_COMMAND);
		createEReference(apiCommandEClass, API_COMMAND__RETURN_DATA_TYPE);
		createEReference(apiCommandEClass, API_COMMAND__PARAMETERS);
		createEReference(apiCommandEClass, API_COMMAND__REPOSITORY);
		createEReference(apiCommandEClass, API_COMMAND__CONSTRAINTS);

		enumerationValueEClass = createEClass(ENUMERATION_VALUE);
		createEAttribute(enumerationValueEClass, ENUMERATION_VALUE__VALUE);
		createEReference(enumerationValueEClass, ENUMERATION_VALUE__ENUMERATION_DATA_TYPE);

		enumerationDataTypeEClass = createEClass(ENUMERATION_DATA_TYPE);
		createEReference(enumerationDataTypeEClass, ENUMERATION_DATA_TYPE__ENUMERATION_VALUES);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__API_COMMAND);

		timeConstraintEClass = createEClass(TIME_CONSTRAINT);
		createEReference(timeConstraintEClass, TIME_CONSTRAINT__SAMPLING_TIME);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operatingSystemEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		operatingSystemEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		apiRepositoryEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		apiRepositoryEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		apiCommandEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		apiCommandEClass.getESuperTypes().add(theCorePackage.getCommentableElement());
		enumerationValueEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		enumerationDataTypeEClass.getESuperTypes().add(theTypesPackage.getDataType());
		timeConstraintEClass.getESuperTypes().add(this.getConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatingSystem_Apirepositories(), this.getAPIRepository(), this.getAPIRepository_SwPlatform(), "apirepositories", null, 0, -1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_EnumerationDataTypes(), this.getEnumerationDataType(), null, "enumerationDataTypes", null, 0, -1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingSystem_Imports(), this.getImport(), null, "imports", null, 0, -1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiRepositoryEClass, APIRepository.class, "APIRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPIRepository_ApiCommands(), this.getAPICommand(), this.getAPICommand_Repository(), "apiCommands", null, 1, -1, APIRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPIRepository_SwPlatform(), this.getOperatingSystem(), this.getOperatingSystem_Apirepositories(), "swPlatform", null, 1, 1, APIRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiCommandEClass, APICommand.class, "APICommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPICommand_ReturnDataType(), theTypesPackage.getDataType(), null, "returnDataType", null, 1, 1, APICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPICommand_Parameters(), theBehaviorPackage.getParameter(), null, "parameters", null, 0, -1, APICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPICommand_Repository(), this.getAPIRepository(), this.getAPIRepository_ApiCommands(), "repository", null, 1, 1, APICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPICommand_Constraints(), this.getConstraint(), this.getConstraint_ApiCommand(), "constraints", null, 0, -1, APICommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationValueEClass, EnumerationValue.class, "EnumerationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, EnumerationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationValue_EnumerationDataType(), this.getEnumerationDataType(), this.getEnumerationDataType_EnumerationValues(), "enumerationDataType", null, 1, 1, EnumerationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationDataTypeEClass, EnumerationDataType.class, "EnumerationDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationDataType_EnumerationValues(), this.getEnumerationValue(), this.getEnumerationValue_EnumerationDataType(), "enumerationValues", null, 1, -1, EnumerationDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_ApiCommand(), this.getAPICommand(), this.getAPICommand_Constraints(), "apiCommand", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeConstraintEClass, TimeConstraint.class, "TimeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeConstraint_SamplingTime(), theValuetypePackage.getTimeValue(), null, "samplingTime", null, 1, 1, TimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SwplatformPackageImpl
