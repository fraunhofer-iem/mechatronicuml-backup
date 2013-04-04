/**
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramFactory;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternPackageImpl;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.ControlflowPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.controlflow.impl.ControlflowPackageImpl;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentstorydiagramPackageImpl extends EPackageImpl implements ComponentstorydiagramPackage {
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
	 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentstorydiagramPackageImpl() {
		super(eNS_URI, ComponentstorydiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentstorydiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentstorydiagramPackage init() {
		if (isInited) return (ComponentstorydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentstorydiagramPackage.eNS_URI);

		// Obtain or create and register package
		ComponentstorydiagramPackageImpl theComponentstorydiagramPackage = (ComponentstorydiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentstorydiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentstorydiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ReconfigurationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ControlflowPackageImpl theControlflowPackage = (ControlflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI) instanceof ControlflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI) : ControlflowPackage.eINSTANCE);
		ComponentstorypatternPackageImpl theComponentstorypatternPackage = (ComponentstorypatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI) instanceof ComponentstorypatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI) : ComponentstorypatternPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentstorydiagramPackage.createPackageContents();
		theControlflowPackage.createPackageContents();
		theComponentstorypatternPackage.createPackageContents();

		// Initialize created meta-data
		theComponentstorydiagramPackage.initializePackageContents();
		theControlflowPackage.initializePackageContents();
		theComponentstorypatternPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentstorydiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentstorydiagramPackage.eNS_URI, theComponentstorydiagramPackage);
		return theComponentstorydiagramPackage;
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
	public ComponentstorydiagramFactory getComponentstorydiagramFactory() {
		return (ComponentstorydiagramFactory)getEFactoryInstance();
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
		dummyEClass = createEClass(DUMMY);
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
		ControlflowPackage theControlflowPackage = (ControlflowPackage)EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI);
		ComponentstorypatternPackage theComponentstorypatternPackage = (ComponentstorypatternPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentstorypatternPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theControlflowPackage);
		getESubpackages().add(theComponentstorypatternPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentstorydiagramPackageImpl
