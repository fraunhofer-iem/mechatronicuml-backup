/**
 */
package psm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import psm.PsmFactory;
import psm.PsmPackage;
import psm.allocation.AllocationPackage;
import psm.allocation.impl.AllocationPackageImpl;
import psm.properties.PropertiesPackage;
import psm.properties.impl.PropertiesPackageImpl;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.HwvaluetypePackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platforminstance.PlatforminstancePackage;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsmPackageImpl extends EPackageImpl implements PsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyEClass = null;

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
	 * @see psm.PsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PsmPackageImpl() {
		super(eNS_URI, PsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PsmPackage init() {
		if (isInited) return (PsmPackage)EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI);

		// Obtain or create and register package
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ResourcetypePackage.eINSTANCE.eClass();
		PlatformPackage.eINSTANCE.eClass();
		HwvaluetypePackage.eINSTANCE.eClass();
		PlatforminstancePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) : PropertiesPackage.eINSTANCE);

		// Create package meta-data objects
		thePsmPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();

		// Initialize created meta-data
		thePsmPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PsmPackage.eNS_URI, thePsmPackage);
		return thePsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummy() {
		return dummyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmFactory getPsmFactory() {
		return (PsmFactory)getEFactoryInstance();
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
		AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);
		PropertiesPackage thePropertiesPackage = (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAllocationPackage);
		getESubpackages().add(thePropertiesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters

		// Create resource
		createResource(eNS_URI);
	}

} //PsmPackageImpl
