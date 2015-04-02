/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous.impl;

import de.fraunhofer.iem.m4a.IEC61131.IEC61131Package;

import de.fraunhofer.iem.m4a.IEC61131.core.CorePackage;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.impl.CorePackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.impl.LiteralsPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.AbstractFunctionBlockDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.BlackboxFunctionBlockDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockBody;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockPointer;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBody;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionReturnDomain;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration;

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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PousPackageImpl extends EPackageImpl implements PousPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionReturnDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBlockDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBlockBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pouEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionBlockDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackboxFunctionBlockDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBlockPointerEClass = null;

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PousPackageImpl() {
		super(eNS_URI, PousFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PousPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PousPackage init() {
		if (isInited) return (PousPackage)EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI);

		// Obtain or create and register package
		PousPackageImpl thePousPackage = (PousPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PousPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PousPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IEC61131PackageImpl theIEC61131Package = (IEC61131PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) instanceof IEC61131PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) : IEC61131Package.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) : DeclarationsPackage.eINSTANCE);
		ConfigurationsPackageImpl theConfigurationsPackage = (ConfigurationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) instanceof ConfigurationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) : ConfigurationsPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);

		// Create package meta-data objects
		thePousPackage.createPackageContents();
		theIEC61131Package.createPackageContents();
		theCorePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		theConfigurationsPackage.createPackageContents();
		theStPackage.createPackageContents();
		theIlPackage.createPackageContents();

		// Initialize created meta-data
		thePousPackage.initializePackageContents();
		theIEC61131Package.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		theConfigurationsPackage.initializePackageContents();
		theStPackage.initializePackageContents();
		theIlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePousPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PousPackage.eNS_URI, thePousPackage);
		return thePousPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDeclaration() {
		return functionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDeclaration_Declarations() {
		return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDeclaration_ReturnDomain() {
		return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDeclaration_Body() {
		return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionReturnDomain() {
		return functionReturnDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBody() {
		return functionBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBlockDeclaration() {
		return functionBlockDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockDeclaration_Declarations() {
		return (EReference)functionBlockDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockDeclaration_Body() {
		return (EReference)functionBlockDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBlockBody() {
		return functionBlockBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramDeclaration() {
		return programDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDeclaration_Declarations() {
		return (EReference)programDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramDeclaration_Body() {
		return (EReference)programDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOU() {
		return pouEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPOU_Language() {
		return (EAttribute)pouEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunctionBlockDeclaration() {
		return abstractFunctionBlockDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackboxFunctionBlockDeclaration() {
		return blackboxFunctionBlockDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlackboxFunctionBlockDeclaration_Declarations() {
		return (EReference)blackboxFunctionBlockDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBlockPointer() {
		return functionBlockPointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBlockPointer_FunctionBlockType() {
		return (EReference)functionBlockPointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PousFactory getPousFactory() {
		return (PousFactory)getEFactoryInstance();
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
		functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);
		createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__DECLARATIONS);
		createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__RETURN_DOMAIN);
		createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__BODY);

		functionReturnDomainEClass = createEClass(FUNCTION_RETURN_DOMAIN);

		functionBodyEClass = createEClass(FUNCTION_BODY);

		functionBlockDeclarationEClass = createEClass(FUNCTION_BLOCK_DECLARATION);
		createEReference(functionBlockDeclarationEClass, FUNCTION_BLOCK_DECLARATION__DECLARATIONS);
		createEReference(functionBlockDeclarationEClass, FUNCTION_BLOCK_DECLARATION__BODY);

		functionBlockBodyEClass = createEClass(FUNCTION_BLOCK_BODY);

		programDeclarationEClass = createEClass(PROGRAM_DECLARATION);
		createEReference(programDeclarationEClass, PROGRAM_DECLARATION__DECLARATIONS);
		createEReference(programDeclarationEClass, PROGRAM_DECLARATION__BODY);

		pouEClass = createEClass(POU);
		createEAttribute(pouEClass, POU__LANGUAGE);

		abstractFunctionBlockDeclarationEClass = createEClass(ABSTRACT_FUNCTION_BLOCK_DECLARATION);

		blackboxFunctionBlockDeclarationEClass = createEClass(BLACKBOX_FUNCTION_BLOCK_DECLARATION);
		createEReference(blackboxFunctionBlockDeclarationEClass, BLACKBOX_FUNCTION_BLOCK_DECLARATION__DECLARATIONS);

		functionBlockPointerEClass = createEClass(FUNCTION_BLOCK_POINTER);
		createEReference(functionBlockPointerEClass, FUNCTION_BLOCK_POINTER__FUNCTION_BLOCK_TYPE);
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
		DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		LiteralsPackage theLiteralsPackage = (LiteralsPackage)EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionDeclarationEClass.getESuperTypes().add(this.getPOU());
		functionBlockDeclarationEClass.getESuperTypes().add(this.getAbstractFunctionBlockDeclaration());
		programDeclarationEClass.getESuperTypes().add(this.getPOU());
		pouEClass.getESuperTypes().add(theCorePackage.getLibraryElement());
		pouEClass.getESuperTypes().add(theLiteralsPackage.getCommentableElement());
		abstractFunctionBlockDeclarationEClass.getESuperTypes().add(this.getPOU());
		blackboxFunctionBlockDeclarationEClass.getESuperTypes().add(this.getAbstractFunctionBlockDeclaration());
		functionBlockPointerEClass.getESuperTypes().add(theDeclarationsPackage.getExternalVarSpec());
		functionBlockPointerEClass.getESuperTypes().add(theDeclarationsPackage.getGlobalVarSpecInit());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionDeclarationEClass, FunctionDeclaration.class, "FunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionDeclaration_Declarations(), theDeclarationsPackage.getFunctionVariableDeclaration(), null, "declarations", null, 0, -1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDeclaration_ReturnDomain(), this.getFunctionReturnDomain(), null, "returnDomain", null, 1, 1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDeclaration_Body(), this.getFunctionBody(), null, "body", null, 1, 1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionReturnDomainEClass, FunctionReturnDomain.class, "FunctionReturnDomain", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionBodyEClass, FunctionBody.class, "FunctionBody", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionBlockDeclarationEClass, FunctionBlockDeclaration.class, "FunctionBlockDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionBlockDeclaration_Declarations(), theDeclarationsPackage.getFunctionBlockVariableDeclaration(), null, "declarations", null, 0, -1, FunctionBlockDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBlockDeclaration_Body(), this.getFunctionBlockBody(), null, "body", null, 1, 1, FunctionBlockDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionBlockBodyEClass, FunctionBlockBody.class, "FunctionBlockBody", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(programDeclarationEClass, ProgramDeclaration.class, "ProgramDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramDeclaration_Declarations(), theDeclarationsPackage.getProgramVariableDeclaration(), null, "declarations", null, 0, -1, ProgramDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramDeclaration_Body(), this.getFunctionBlockBody(), null, "body", null, 1, 1, ProgramDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pouEClass, de.fraunhofer.iem.m4a.IEC61131.core.pous.POU.class, "POU", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPOU_Language(), ecorePackage.getEString(), "language", "st", 0, 1, de.fraunhofer.iem.m4a.IEC61131.core.pous.POU.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractFunctionBlockDeclarationEClass, AbstractFunctionBlockDeclaration.class, "AbstractFunctionBlockDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blackboxFunctionBlockDeclarationEClass, BlackboxFunctionBlockDeclaration.class, "BlackboxFunctionBlockDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlackboxFunctionBlockDeclaration_Declarations(), theDeclarationsPackage.getIOVarDeclaration(), null, "declarations", null, 0, -1, BlackboxFunctionBlockDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionBlockPointerEClass, FunctionBlockPointer.class, "FunctionBlockPointer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionBlockPointer_FunctionBlockType(), this.getAbstractFunctionBlockDeclaration(), null, "functionBlockType", null, 0, 1, FunctionBlockPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PousPackageImpl
