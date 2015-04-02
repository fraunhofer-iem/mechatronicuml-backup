/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables.impl;

import de.fraunhofer.iem.m4a.IEC61131.IEC61131Package;
import de.fraunhofer.iem.m4a.IEC61131.core.CorePackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.impl.CorePackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.PousPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.types.impl.TypesPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.FBName;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.FieldSelector;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.MultiElementVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.NonGlobalVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.SizePrefix;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage;
import de.fraunhofer.iem.m4a.IEC61131.impl.IEC61131PackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl;
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
public class VariablesPackageImpl extends EPackageImpl implements VariablesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolicVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiElementVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonGlobalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fbNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationPrefixEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizePrefixEEnum = null;

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VariablesPackageImpl() {
		super(eNS_URI, VariablesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VariablesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VariablesPackage init() {
		if (isInited) return (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);

		// Obtain or create and register package
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VariablesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IEC61131PackageImpl theIEC61131Package = (IEC61131PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) instanceof IEC61131PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) : IEC61131Package.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) : DeclarationsPackage.eINSTANCE);
		PousPackageImpl thePousPackage = (PousPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) instanceof PousPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) : PousPackage.eINSTANCE);
		ConfigurationsPackageImpl theConfigurationsPackage = (ConfigurationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) instanceof ConfigurationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) : ConfigurationsPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);

		// Create package meta-data objects
		theVariablesPackage.createPackageContents();
		theIEC61131Package.createPackageContents();
		theCorePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		thePousPackage.createPackageContents();
		theConfigurationsPackage.createPackageContents();
		theStPackage.createPackageContents();
		theIlPackage.createPackageContents();

		// Initialize created meta-data
		theVariablesPackage.initializePackageContents();
		theIEC61131Package.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		thePousPackage.initializePackageContents();
		theConfigurationsPackage.initializePackageContents();
		theStPackage.initializePackageContents();
		theIlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVariablesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VariablesPackage.eNS_URI, theVariablesPackage);
		return theVariablesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolicVariable() {
		return symbolicVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectVariable() {
		return directVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectVariable_Value() {
		return (EReference)directVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedVariable() {
		return namedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiElementVariable() {
		return multiElementVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredVariable() {
		return structuredVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredVariable_RecordVariable() {
		return (EReference)structuredVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredVariable_FieldSelector() {
		return (EReference)structuredVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayVariable() {
		return arrayVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayVariable_SubscriptedVariable() {
		return (EReference)arrayVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayVariable_Subscript() {
		return (EReference)arrayVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldSelector() {
		return fieldSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVar() {
		return globalVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonGlobalVariable() {
		return nonGlobalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFBName() {
		return fbNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationPrefix() {
		return locationPrefixEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSizePrefix() {
		return sizePrefixEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariablesFactory getVariablesFactory() {
		return (VariablesFactory)getEFactoryInstance();
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
		variableEClass = createEClass(VARIABLE);

		symbolicVariableEClass = createEClass(SYMBOLIC_VARIABLE);

		directVariableEClass = createEClass(DIRECT_VARIABLE);
		createEReference(directVariableEClass, DIRECT_VARIABLE__VALUE);

		namedVariableEClass = createEClass(NAMED_VARIABLE);

		multiElementVariableEClass = createEClass(MULTI_ELEMENT_VARIABLE);

		structuredVariableEClass = createEClass(STRUCTURED_VARIABLE);
		createEReference(structuredVariableEClass, STRUCTURED_VARIABLE__RECORD_VARIABLE);
		createEReference(structuredVariableEClass, STRUCTURED_VARIABLE__FIELD_SELECTOR);

		arrayVariableEClass = createEClass(ARRAY_VARIABLE);
		createEReference(arrayVariableEClass, ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE);
		createEReference(arrayVariableEClass, ARRAY_VARIABLE__SUBSCRIPT);

		fieldSelectorEClass = createEClass(FIELD_SELECTOR);

		globalVarEClass = createEClass(GLOBAL_VAR);

		nonGlobalVariableEClass = createEClass(NON_GLOBAL_VARIABLE);

		fbNameEClass = createEClass(FB_NAME);

		// Create enums
		locationPrefixEEnum = createEEnum(LOCATION_PREFIX);
		sizePrefixEEnum = createEEnum(SIZE_PREFIX);
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
		ConfigurationsPackage theConfigurationsPackage = (ConfigurationsPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI);
		DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		LiteralsPackage theLiteralsPackage = (LiteralsPackage)EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		StPackage theStPackage = (StPackage)EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		symbolicVariableEClass.getESuperTypes().add(this.getNonGlobalVariable());
		directVariableEClass.getESuperTypes().add(this.getNonGlobalVariable());
		directVariableEClass.getESuperTypes().add(theConfigurationsPackage.getDataSource());
		directVariableEClass.getESuperTypes().add(theConfigurationsPackage.getDataSink());
		directVariableEClass.getESuperTypes().add(theConfigurationsPackage.getProgDataSource());
		directVariableEClass.getESuperTypes().add(theDeclarationsPackage.getAccessDeclaration());
		namedVariableEClass.getESuperTypes().add(this.getSymbolicVariable());
		namedVariableEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		multiElementVariableEClass.getESuperTypes().add(this.getSymbolicVariable());
		structuredVariableEClass.getESuperTypes().add(this.getMultiElementVariable());
		arrayVariableEClass.getESuperTypes().add(this.getMultiElementVariable());
		fieldSelectorEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		globalVarEClass.getESuperTypes().add(this.getVariable());
		globalVarEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());
		nonGlobalVariableEClass.getESuperTypes().add(this.getVariable());
		fbNameEClass.getESuperTypes().add(this.getVariable());
		fbNameEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(symbolicVariableEClass, SymbolicVariable.class, "SymbolicVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directVariableEClass, DirectVariable.class, "DirectVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectVariable_Value(), theLiteralsPackage.getIntegerLiteral(), null, "value", null, 1, -1, DirectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedVariableEClass, NamedVariable.class, "NamedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiElementVariableEClass, MultiElementVariable.class, "MultiElementVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuredVariableEClass, StructuredVariable.class, "StructuredVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredVariable_RecordVariable(), this.getSymbolicVariable(), null, "recordVariable", null, 1, 1, StructuredVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredVariable_FieldSelector(), this.getFieldSelector(), null, "fieldSelector", null, 1, 1, StructuredVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayVariableEClass, ArrayVariable.class, "ArrayVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayVariable_SubscriptedVariable(), this.getSymbolicVariable(), null, "subscriptedVariable", null, 1, 1, ArrayVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayVariable_Subscript(), theStPackage.getExpression(), null, "subscript", null, 1, -1, ArrayVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldSelectorEClass, FieldSelector.class, "FieldSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalVarEClass, GlobalVar.class, "GlobalVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonGlobalVariableEClass, NonGlobalVariable.class, "NonGlobalVariable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fbNameEClass, FBName.class, "FBName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(locationPrefixEEnum, LocationPrefix.class, "LocationPrefix");
		addEEnumLiteral(locationPrefixEEnum, LocationPrefix.I);
		addEEnumLiteral(locationPrefixEEnum, LocationPrefix.Q);
		addEEnumLiteral(locationPrefixEEnum, LocationPrefix.M);

		initEEnum(sizePrefixEEnum, SizePrefix.class, "SizePrefix");
		addEEnumLiteral(sizePrefixEEnum, SizePrefix.X);
		addEEnumLiteral(sizePrefixEEnum, SizePrefix.B);
		addEEnumLiteral(sizePrefixEEnum, SizePrefix.W);
		addEEnumLiteral(sizePrefixEEnum, SizePrefix.D);
		addEEnumLiteral(sizePrefixEEnum, SizePrefix.L);
	}

} //VariablesPackageImpl
