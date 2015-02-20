/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.SdmPackage;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.TimedstorydiagramPackage;
import de.uni_paderborn.fujaba.udbm.Federation;
import de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphFactory;
import de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphPackage;
import de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedGTSDelayTransition;
import de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReachabilityGraphPackageImpl extends EPackageImpl implements ReachabilityGraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedStepGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedGTSDelayTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType federationObjectEDataType = null;

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
	 * @see de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReachabilityGraphPackageImpl() {
		super(eNS_URI, ReachabilityGraphFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReachabilityGraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReachabilityGraphPackage init() {
		if (isInited) return (ReachabilityGraphPackage)EPackage.Registry.INSTANCE.getEPackage(ReachabilityGraphPackage.eNS_URI);

		// Obtain or create and register package
		ReachabilityGraphPackageImpl theReachabilityGraphPackage = (ReachabilityGraphPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReachabilityGraphPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReachabilityGraphPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();
		TimedstorydiagramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReachabilityGraphPackage.createPackageContents();

		// Initialize created meta-data
		theReachabilityGraphPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReachabilityGraphPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReachabilityGraphPackage.eNS_URI, theReachabilityGraphPackage);
		return theReachabilityGraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedStepGraph() {
		return timedStepGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedStepGraph_ClockInstances() {
		return (EReference)timedStepGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedStepGraph_Federation() {
		return (EAttribute)timedStepGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedGTSDelayTransition() {
		return timedGTSDelayTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFederationObject() {
		return federationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraphFactory getReachabilityGraphFactory() {
		return (ReachabilityGraphFactory)getEFactoryInstance();
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
		timedStepGraphEClass = createEClass(TIMED_STEP_GRAPH);
		createEReference(timedStepGraphEClass, TIMED_STEP_GRAPH__CLOCK_INSTANCES);
		createEAttribute(timedStepGraphEClass, TIMED_STEP_GRAPH__FEDERATION);

		timedGTSDelayTransitionEClass = createEClass(TIMED_GTS_DELAY_TRANSITION);

		// Create data types
		federationObjectEDataType = createEDataType(FEDERATION_OBJECT);
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
		SdmPackage theSdmPackage = (SdmPackage)EPackage.Registry.INSTANCE.getEPackage(SdmPackage.eNS_URI);
		TimedstorydiagramPackage theTimedstorydiagramPackage = (TimedstorydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(TimedstorydiagramPackage.eNS_URI);
		de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage theReachabilityGraphPackage_1 = (de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage)EPackage.Registry.INSTANCE.getEPackage(de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.ReachabilityGraphPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timedStepGraphEClass.getESuperTypes().add(theSdmPackage.getStepGraph());
		timedGTSDelayTransitionEClass.getESuperTypes().add(theReachabilityGraphPackage_1.getReachabilityGraphTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(timedStepGraphEClass, TimedStepGraph.class, "TimedStepGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedStepGraph_ClockInstances(), theTimedstorydiagramPackage.getClockInstance(), null, "clockInstances", null, 0, -1, TimedStepGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedStepGraph_Federation(), this.getFederationObject(), "federation", null, 0, 1, TimedStepGraph.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedGTSDelayTransitionEClass, TimedGTSDelayTransition.class, "TimedGTSDelayTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(federationObjectEDataType, Federation.class, "FederationObject", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ReachabilityGraphPackageImpl
