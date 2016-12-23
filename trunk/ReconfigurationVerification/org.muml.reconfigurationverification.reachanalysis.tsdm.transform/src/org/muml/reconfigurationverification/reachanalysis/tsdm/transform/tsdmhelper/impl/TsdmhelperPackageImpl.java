/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.pim.PimPackage;
import org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.BoundClockInstances;
import org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.TsdmhelperFactory;
import org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.TsdmhelperPackage;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TsdmhelperPackageImpl extends EPackageImpl implements TsdmhelperPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundClockInstancesEClass = null;

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
	 * @see org.muml.reconfigurationverification.reachanalysis.tsdm.transform.tsdmhelper.TsdmhelperPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TsdmhelperPackageImpl() {
		super(eNS_URI, TsdmhelperFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TsdmhelperPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TsdmhelperPackage init() {
		if (isInited) return (TsdmhelperPackage)EPackage.Registry.INSTANCE.getEPackage(TsdmhelperPackage.eNS_URI);

		// Obtain or create and register package
		TsdmhelperPackageImpl theTsdmhelperPackage = (TsdmhelperPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TsdmhelperPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TsdmhelperPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PimPackage.eINSTANCE.eClass();
		TimedstorydiagramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTsdmhelperPackage.createPackageContents();

		// Initialize created meta-data
		theTsdmhelperPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTsdmhelperPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TsdmhelperPackage.eNS_URI, theTsdmhelperPackage);
		return theTsdmhelperPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundClockInstances() {
		return boundClockInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundClockInstances_ClockInstances() {
		return (EReference)boundClockInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TsdmhelperFactory getTsdmhelperFactory() {
		return (TsdmhelperFactory)getEFactoryInstance();
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
		boundClockInstancesEClass = createEClass(BOUND_CLOCK_INSTANCES);
		createEReference(boundClockInstancesEClass, BOUND_CLOCK_INSTANCES__CLOCK_INSTANCES);
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
		TimedstorydiagramPackage theTimedstorydiagramPackage = (TimedstorydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(TimedstorydiagramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(boundClockInstancesEClass, BoundClockInstances.class, "BoundClockInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundClockInstances_ClockInstances(), theTimedstorydiagramPackage.getClockInstance(), null, "clockInstances", null, 0, -1, BoundClockInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TsdmhelperPackageImpl
