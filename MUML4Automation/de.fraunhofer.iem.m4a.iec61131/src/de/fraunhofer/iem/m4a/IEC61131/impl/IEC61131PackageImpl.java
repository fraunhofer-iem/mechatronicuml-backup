/**
 */
package de.fraunhofer.iem.m4a.IEC61131.impl;

import de.fraunhofer.iem.m4a.IEC61131.IEC61131Factory;
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

import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlPackageImpl;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StPackageImpl;

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
public class IEC61131PackageImpl extends EPackageImpl implements IEC61131Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iec61131EClass = null;

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.IEC61131Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IEC61131PackageImpl() {
		super(eNS_URI, IEC61131Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IEC61131Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IEC61131Package init() {
		if (isInited) return (IEC61131Package)EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI);

		// Obtain or create and register package
		IEC61131PackageImpl theIEC61131Package = (IEC61131PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IEC61131PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IEC61131PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) : DeclarationsPackage.eINSTANCE);
		PousPackageImpl thePousPackage = (PousPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) instanceof PousPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) : PousPackage.eINSTANCE);
		ConfigurationsPackageImpl theConfigurationsPackage = (ConfigurationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) instanceof ConfigurationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) : ConfigurationsPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);

		// Create package meta-data objects
		theIEC61131Package.createPackageContents();
		theCorePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		thePousPackage.createPackageContents();
		theConfigurationsPackage.createPackageContents();
		theStPackage.createPackageContents();
		theIlPackage.createPackageContents();

		// Initialize created meta-data
		theIEC61131Package.initializePackageContents();
		theCorePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		thePousPackage.initializePackageContents();
		theConfigurationsPackage.initializePackageContents();
		theStPackage.initializePackageContents();
		theIlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIEC61131Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IEC61131Package.eNS_URI, theIEC61131Package);
		return theIEC61131Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEC61131() {
		return iec61131EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIEC61131_LibraryDeclarations() {
		return (EReference)iec61131EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIEC61131_LibraryReferences() {
		return (EReference)iec61131EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEC61131Factory getIEC61131Factory() {
		return (IEC61131Factory)getEFactoryInstance();
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
		iec61131EClass = createEClass(IEC61131);
		createEReference(iec61131EClass, IEC61131__LIBRARY_DECLARATIONS);
		createEReference(iec61131EClass, IEC61131__LIBRARY_REFERENCES);
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
		StPackage theStPackage = (StPackage)EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI);
		IlPackage theIlPackage = (IlPackage)EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCorePackage);
		getESubpackages().add(theStPackage);
		getESubpackages().add(theIlPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(iec61131EClass, de.fraunhofer.iem.m4a.IEC61131.IEC61131.class, "IEC61131", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIEC61131_LibraryDeclarations(), theCorePackage.getLibraryElement(), null, "libraryDeclarations", null, 0, -1, de.fraunhofer.iem.m4a.IEC61131.IEC61131.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIEC61131_LibraryReferences(), theCorePackage.getLibraryElementReference(), null, "libraryReferences", null, 0, -1, de.fraunhofer.iem.m4a.IEC61131.IEC61131.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IEC61131PackageImpl
