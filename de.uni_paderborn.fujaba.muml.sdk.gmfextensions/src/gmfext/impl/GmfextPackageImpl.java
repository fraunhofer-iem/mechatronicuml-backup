/**
 */
package gmfext.impl;

import de.uni_paderborn.fujaba.properties.PropertiesPackage;

import gmfext.GmfextFactory;
import gmfext.GmfextPackage;
import gmfext.MumlGMFExtension;

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
public class GmfextPackageImpl extends EPackageImpl implements GmfextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mumlGMFExtensionEClass = null;

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
	 * @see gmfext.GmfextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GmfextPackageImpl() {
		super(eNS_URI, GmfextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GmfextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GmfextPackage init() {
		if (isInited) return (GmfextPackage)EPackage.Registry.INSTANCE.getEPackage(GmfextPackage.eNS_URI);

		// Obtain or create and register package
		GmfextPackageImpl theGmfextPackage = (GmfextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GmfextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GmfextPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PropertiesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGmfextPackage.createPackageContents();

		// Initialize created meta-data
		theGmfextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGmfextPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GmfextPackage.eNS_URI, theGmfextPackage);
		return theGmfextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMumlGMFExtension() {
		return mumlGMFExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMumlGMFExtension_PropertyGenerator() {
		return (EReference)mumlGMFExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmfextFactory getGmfextFactory() {
		return (GmfextFactory)getEFactoryInstance();
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
		mumlGMFExtensionEClass = createEClass(MUML_GMF_EXTENSION);
		createEReference(mumlGMFExtensionEClass, MUML_GMF_EXTENSION__PROPERTY_GENERATOR);
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
		PropertiesPackage thePropertiesPackage = (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(mumlGMFExtensionEClass, MumlGMFExtension.class, "MumlGMFExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMumlGMFExtension_PropertyGenerator(), thePropertiesPackage.getPropertyGenerator(), null, "propertyGenerator", null, 1, 1, MumlGMFExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GmfextPackageImpl
