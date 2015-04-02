/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl;

import de.fraunhofer.iem.m4a.IEC61131.IEC61131Package;
import de.fraunhofer.iem.m4a.IEC61131.core.CorePackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSink;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.DataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgCnxn;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgConfElement;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgDataSource;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramOutputReference;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.impl.CorePackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131PackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationsPackageImpl extends EPackageImpl implements ConfigurationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVarReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programOutputReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progConfElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progCnxnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum retainEEnum = null;

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationsPackageImpl() {
		super(eNS_URI, ConfigurationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigurationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationsPackage init() {
		if (isInited) return (ConfigurationsPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationsPackageImpl theConfigurationsPackage = (ConfigurationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigurationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigurationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IEC61131PackageImpl theIEC61131Package = (IEC61131PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) instanceof IEC61131PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) : IEC61131Package.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) : DeclarationsPackage.eINSTANCE);
		PousPackageImpl thePousPackage = (PousPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) instanceof PousPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) : PousPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);

		// Create package meta-data objects
		theConfigurationsPackage.createPackageContents();
		theIEC61131Package.createPackageContents();
		theCorePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		thePousPackage.createPackageContents();
		theStPackage.createPackageContents();
		theIlPackage.createPackageContents();

		// Initialize created meta-data
		theConfigurationsPackage.initializePackageContents();
		theIEC61131Package.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		thePousPackage.initializePackageContents();
		theStPackage.initializePackageContents();
		theIlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationsPackage.eNS_URI, theConfigurationsPackage);
		return theConfigurationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationDeclaration() {
		return configurationDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationDeclaration_Resources() {
		return (EReference)configurationDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationDeclaration_Declarations() {
		return (EReference)configurationDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationDeclaration_Access() {
		return (EReference)configurationDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationDeclaration_InstanceSpecificInits() {
		return (EReference)configurationDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationDeclaration_GlobalVarNames() {
		return (EReference)configurationDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDeclaration() {
		return resourceDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDeclaration_Declarations() {
		return (EReference)resourceDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDeclaration_ProgramConfigurations() {
		return (EReference)resourceDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDeclaration_TaskConfigurations() {
		return (EReference)resourceDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceDeclaration_GlobalVarNames() {
		return (EReference)resourceDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDeclaration_OnHardwareResource() {
		return (EAttribute)resourceDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramConfiguration() {
		return programConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramConfiguration_With() {
		return (EReference)programConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramConfiguration_Program() {
		return (EReference)programConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramConfiguration_Retain() {
		return (EAttribute)programConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramConfiguration_ProgConfElements() {
		return (EReference)programConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskConfiguration() {
		return taskConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskConfiguration_Single() {
		return (EReference)taskConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskConfiguration_Interval() {
		return (EReference)taskConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskConfiguration_Priority() {
		return (EReference)taskConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVarReference() {
		return globalVarReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalVarReference_Reference() {
		return (EReference)globalVarReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVarReference_StructureElementName() {
		return (EAttribute)globalVarReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramOutputReference() {
		return programOutputReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramOutputReference_Refernce() {
		return (EReference)programOutputReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgConfElement() {
		return progConfElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFBTask() {
		return fbTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFBTask_With() {
		return (EReference)fbTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFBTask_FunctionBlock() {
		return (EReference)fbTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgCnxn() {
		return progCnxnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgCnxn_ProgDataSourceVar() {
		return (EReference)progCnxnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgCnxn_ProgDataSourceValue() {
		return (EReference)progCnxnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgCnxn_DataSinkVar() {
		return (EReference)progCnxnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgCnxn_DataSinkValue() {
		return (EReference)progCnxnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgDataSource() {
		return progDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSink() {
		return dataSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRetain() {
		return retainEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationsFactory getConfigurationsFactory() {
		return (ConfigurationsFactory)getEFactoryInstance();
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
		configurationDeclarationEClass = createEClass(CONFIGURATION_DECLARATION);
		createEReference(configurationDeclarationEClass, CONFIGURATION_DECLARATION__RESOURCES);
		createEReference(configurationDeclarationEClass, CONFIGURATION_DECLARATION__DECLARATIONS);
		createEReference(configurationDeclarationEClass, CONFIGURATION_DECLARATION__ACCESS);
		createEReference(configurationDeclarationEClass, CONFIGURATION_DECLARATION__INSTANCE_SPECIFIC_INITS);
		createEReference(configurationDeclarationEClass, CONFIGURATION_DECLARATION__GLOBAL_VAR_NAMES);

		resourceDeclarationEClass = createEClass(RESOURCE_DECLARATION);
		createEReference(resourceDeclarationEClass, RESOURCE_DECLARATION__DECLARATIONS);
		createEReference(resourceDeclarationEClass, RESOURCE_DECLARATION__PROGRAM_CONFIGURATIONS);
		createEReference(resourceDeclarationEClass, RESOURCE_DECLARATION__TASK_CONFIGURATIONS);
		createEReference(resourceDeclarationEClass, RESOURCE_DECLARATION__GLOBAL_VAR_NAMES);
		createEAttribute(resourceDeclarationEClass, RESOURCE_DECLARATION__ON_HARDWARE_RESOURCE);

		programConfigurationEClass = createEClass(PROGRAM_CONFIGURATION);
		createEReference(programConfigurationEClass, PROGRAM_CONFIGURATION__WITH);
		createEReference(programConfigurationEClass, PROGRAM_CONFIGURATION__PROGRAM);
		createEAttribute(programConfigurationEClass, PROGRAM_CONFIGURATION__RETAIN);
		createEReference(programConfigurationEClass, PROGRAM_CONFIGURATION__PROG_CONF_ELEMENTS);

		taskConfigurationEClass = createEClass(TASK_CONFIGURATION);
		createEReference(taskConfigurationEClass, TASK_CONFIGURATION__SINGLE);
		createEReference(taskConfigurationEClass, TASK_CONFIGURATION__INTERVAL);
		createEReference(taskConfigurationEClass, TASK_CONFIGURATION__PRIORITY);

		dataSourceEClass = createEClass(DATA_SOURCE);

		globalVarReferenceEClass = createEClass(GLOBAL_VAR_REFERENCE);
		createEReference(globalVarReferenceEClass, GLOBAL_VAR_REFERENCE__REFERENCE);
		createEAttribute(globalVarReferenceEClass, GLOBAL_VAR_REFERENCE__STRUCTURE_ELEMENT_NAME);

		programOutputReferenceEClass = createEClass(PROGRAM_OUTPUT_REFERENCE);
		createEReference(programOutputReferenceEClass, PROGRAM_OUTPUT_REFERENCE__REFERNCE);

		progConfElementEClass = createEClass(PROG_CONF_ELEMENT);

		fbTaskEClass = createEClass(FB_TASK);
		createEReference(fbTaskEClass, FB_TASK__WITH);
		createEReference(fbTaskEClass, FB_TASK__FUNCTION_BLOCK);

		progCnxnEClass = createEClass(PROG_CNXN);
		createEReference(progCnxnEClass, PROG_CNXN__PROG_DATA_SOURCE_VAR);
		createEReference(progCnxnEClass, PROG_CNXN__PROG_DATA_SOURCE_VALUE);
		createEReference(progCnxnEClass, PROG_CNXN__DATA_SINK_VAR);
		createEReference(progCnxnEClass, PROG_CNXN__DATA_SINK_VALUE);

		progDataSourceEClass = createEClass(PROG_DATA_SOURCE);

		dataSinkEClass = createEClass(DATA_SINK);

		// Create enums
		retainEEnum = createEEnum(RETAIN);
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
		DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		LiteralsPackage theLiteralsPackage = (LiteralsPackage)EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		PousPackage thePousPackage = (PousPackage)EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configurationDeclarationEClass.getESuperTypes().add(theCorePackage.getLibraryElement());
		resourceDeclarationEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		programConfigurationEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		taskConfigurationEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		globalVarReferenceEClass.getESuperTypes().add(this.getDataSource());
		globalVarReferenceEClass.getESuperTypes().add(this.getDataSink());
		globalVarReferenceEClass.getESuperTypes().add(this.getProgDataSource());
		programOutputReferenceEClass.getESuperTypes().add(this.getDataSource());
		fbTaskEClass.getESuperTypes().add(this.getProgConfElement());
		progCnxnEClass.getESuperTypes().add(this.getProgConfElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationDeclarationEClass, ConfigurationDeclaration.class, "ConfigurationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationDeclaration_Resources(), this.getResourceDeclaration(), null, "resources", null, 1, -1, ConfigurationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationDeclaration_Declarations(), theDeclarationsPackage.getConfigurationVariableDeclaration(), null, "declarations", null, 0, -1, ConfigurationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationDeclaration_Access(), theDeclarationsPackage.getAccessVarContainer(), null, "access", null, 0, 1, ConfigurationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationDeclaration_InstanceSpecificInits(), theDeclarationsPackage.getInstanceSpecificVarContainter(), null, "instanceSpecificInits", null, 0, 1, ConfigurationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationDeclaration_GlobalVarNames(), theVariablesPackage.getGlobalVar(), null, "globalVarNames", null, 0, -1, ConfigurationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceDeclarationEClass, ResourceDeclaration.class, "ResourceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceDeclaration_Declarations(), theDeclarationsPackage.getResourceVariableDeclaration(), null, "declarations", null, 0, 1, ResourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceDeclaration_ProgramConfigurations(), this.getProgramConfiguration(), null, "programConfigurations", null, 1, -1, ResourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceDeclaration_TaskConfigurations(), this.getTaskConfiguration(), null, "taskConfigurations", null, 0, -1, ResourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceDeclaration_GlobalVarNames(), theVariablesPackage.getGlobalVar(), null, "globalVarNames", null, 0, -1, ResourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceDeclaration_OnHardwareResource(), ecorePackage.getEString(), "onHardwareResource", null, 0, 1, ResourceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programConfigurationEClass, ProgramConfiguration.class, "ProgramConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramConfiguration_With(), this.getTaskConfiguration(), null, "with", null, 0, 1, ProgramConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramConfiguration_Program(), thePousPackage.getProgramDeclaration(), null, "program", null, 1, 1, ProgramConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramConfiguration_Retain(), this.getRetain(), "retain", null, 0, 1, ProgramConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramConfiguration_ProgConfElements(), this.getProgConfElement(), null, "progConfElements", null, 0, -1, ProgramConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskConfigurationEClass, TaskConfiguration.class, "TaskConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskConfiguration_Single(), this.getDataSource(), null, "single", null, 0, 1, TaskConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskConfiguration_Interval(), this.getDataSource(), null, "interval", null, 0, 1, TaskConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskConfiguration_Priority(), theLiteralsPackage.getIntegerLiteral(), null, "priority", null, 1, 1, TaskConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalVarReferenceEClass, GlobalVarReference.class, "GlobalVarReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalVarReference_Reference(), theVariablesPackage.getGlobalVar(), null, "reference", null, 1, 1, GlobalVarReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalVarReference_StructureElementName(), ecorePackage.getEString(), "structureElementName", null, 0, 1, GlobalVarReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programOutputReferenceEClass, ProgramOutputReference.class, "ProgramOutputReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramOutputReference_Refernce(), theVariablesPackage.getSymbolicVariable(), null, "refernce", null, 1, 1, ProgramOutputReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progConfElementEClass, ProgConfElement.class, "ProgConfElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fbTaskEClass, FBTask.class, "FBTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFBTask_With(), this.getTaskConfiguration(), null, "with", null, 1, 1, FBTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFBTask_FunctionBlock(), thePousPackage.getFunctionBlockDeclaration(), null, "functionBlock", null, 1, 1, FBTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progCnxnEClass, ProgCnxn.class, "ProgCnxn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgCnxn_ProgDataSourceVar(), theVariablesPackage.getSymbolicVariable(), null, "progDataSourceVar", null, 1, 1, ProgCnxn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgCnxn_ProgDataSourceValue(), this.getProgDataSource(), null, "progDataSourceValue", null, 1, 1, ProgCnxn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgCnxn_DataSinkVar(), theVariablesPackage.getSymbolicVariable(), null, "dataSinkVar", null, 0, 1, ProgCnxn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgCnxn_DataSinkValue(), this.getDataSink(), null, "dataSinkValue", null, 1, 1, ProgCnxn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progDataSourceEClass, ProgDataSource.class, "ProgDataSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSinkEClass, DataSink.class, "DataSink", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(retainEEnum, Retain.class, "Retain");
		addEEnumLiteral(retainEEnum, Retain.RETAIN);
		addEEnumLiteral(retainEEnum, Retain.NON_RETAIN);
	}

} //ConfigurationsPackageImpl
