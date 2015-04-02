/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.impl;

import de.fraunhofer.iem.m4a.IEC61131.IEC61131Package;

import de.fraunhofer.iem.m4a.IEC61131.core.CoreFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.CorePackage;
import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;
import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElementReference;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ConfigurationsPackageImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.DeclarationsPackageImpl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryElementReferenceEClass = null;

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IEC61131PackageImpl theIEC61131Package = (IEC61131PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) instanceof IEC61131PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IEC61131Package.eNS_URI) : IEC61131Package.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		LiteralsPackageImpl theLiteralsPackage = (LiteralsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) instanceof LiteralsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI) : LiteralsPackage.eINSTANCE);
		VariablesPackageImpl theVariablesPackage = (VariablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) instanceof VariablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI) : VariablesPackage.eINSTANCE);
		DeclarationsPackageImpl theDeclarationsPackage = (DeclarationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) instanceof DeclarationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI) : DeclarationsPackage.eINSTANCE);
		PousPackageImpl thePousPackage = (PousPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) instanceof PousPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI) : PousPackage.eINSTANCE);
		ConfigurationsPackageImpl theConfigurationsPackage = (ConfigurationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) instanceof ConfigurationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI) : ConfigurationsPackage.eINSTANCE);
		StPackageImpl theStPackage = (StPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) instanceof StPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StPackage.eNS_URI) : StPackage.eINSTANCE);
		IlPackageImpl theIlPackage = (IlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) instanceof IlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IlPackage.eNS_URI) : IlPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theIEC61131Package.createPackageContents();
		theTypesPackage.createPackageContents();
		theLiteralsPackage.createPackageContents();
		theVariablesPackage.createPackageContents();
		theDeclarationsPackage.createPackageContents();
		thePousPackage.createPackageContents();
		theConfigurationsPackage.createPackageContents();
		theStPackage.createPackageContents();
		theIlPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theIEC61131Package.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theLiteralsPackage.initializePackageContents();
		theVariablesPackage.initializePackageContents();
		theDeclarationsPackage.initializePackageContents();
		thePousPackage.initializePackageContents();
		theConfigurationsPackage.initializePackageContents();
		theStPackage.initializePackageContents();
		theIlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryElement() {
		return libraryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryElementReference() {
		return libraryElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		libraryElementEClass = createEClass(LIBRARY_ELEMENT);

		libraryElementReferenceEClass = createEClass(LIBRARY_ELEMENT_REFERENCE);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		LiteralsPackage theLiteralsPackage = (LiteralsPackage)EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);
		VariablesPackage theVariablesPackage = (VariablesPackage)EPackage.Registry.INSTANCE.getEPackage(VariablesPackage.eNS_URI);
		DeclarationsPackage theDeclarationsPackage = (DeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationsPackage.eNS_URI);
		PousPackage thePousPackage = (PousPackage)EPackage.Registry.INSTANCE.getEPackage(PousPackage.eNS_URI);
		ConfigurationsPackage theConfigurationsPackage = (ConfigurationsPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTypesPackage);
		getESubpackages().add(theLiteralsPackage);
		getESubpackages().add(theVariablesPackage);
		getESubpackages().add(theDeclarationsPackage);
		getESubpackages().add(thePousPackage);
		getESubpackages().add(theConfigurationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		libraryElementEClass.getESuperTypes().add(theLiteralsPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(libraryElementEClass, LibraryElement.class, "LibraryElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryElementReferenceEClass, LibraryElementReference.class, "LibraryElementReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //CorePackageImpl
