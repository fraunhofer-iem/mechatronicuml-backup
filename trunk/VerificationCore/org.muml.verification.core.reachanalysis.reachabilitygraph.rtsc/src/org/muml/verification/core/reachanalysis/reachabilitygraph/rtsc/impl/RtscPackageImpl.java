/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.udbm.Federation;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.DelayTransition;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscFactory;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraph;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphState;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphTransition;
import org.muml.verification.core.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtscPackageImpl extends EPackageImpl implements RtscPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneGraphStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneGraphTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayTransitionEClass = null;

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
	 * @see org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RtscPackageImpl() {
		super(eNS_URI, RtscFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RtscPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RtscPackage init() {
		if (isInited) return (RtscPackage)EPackage.Registry.INSTANCE.getEPackage(RtscPackage.eNS_URI);

		// Obtain or create and register package
		RtscPackageImpl theRtscPackage = (RtscPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RtscPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RtscPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ReachabilityGraphPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRtscPackage.createPackageContents();

		// Initialize created meta-data
		theRtscPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRtscPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RtscPackage.eNS_URI, theRtscPackage);
		return theRtscPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneGraph() {
		return zoneGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneGraph_Clocks() {
		return (EReference)zoneGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneGraphState() {
		return zoneGraphStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneGraphState_Locations() {
		return (EReference)zoneGraphStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneGraphState_ContainedToplevelStatechartInstances() {
		return (EReference)zoneGraphStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneGraphState_Federation() {
		return (EAttribute)zoneGraphStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneGraphTransition() {
		return zoneGraphTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneGraphTransition_FiredRTSCTransitions() {
		return (EReference)zoneGraphTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayTransition() {
		return delayTransitionEClass;
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
	public RtscFactory getRtscFactory() {
		return (RtscFactory)getEFactoryInstance();
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
		zoneGraphEClass = createEClass(ZONE_GRAPH);
		createEReference(zoneGraphEClass, ZONE_GRAPH__CLOCKS);

		zoneGraphStateEClass = createEClass(ZONE_GRAPH_STATE);
		createEAttribute(zoneGraphStateEClass, ZONE_GRAPH_STATE__FEDERATION);
		createEReference(zoneGraphStateEClass, ZONE_GRAPH_STATE__LOCATIONS);
		createEReference(zoneGraphStateEClass, ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES);

		zoneGraphTransitionEClass = createEClass(ZONE_GRAPH_TRANSITION);
		createEReference(zoneGraphTransitionEClass, ZONE_GRAPH_TRANSITION__FIRED_RTSC_TRANSITIONS);

		delayTransitionEClass = createEClass(DELAY_TRANSITION);

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
		ReachabilityGraphPackage theReachabilityGraphPackage = (ReachabilityGraphPackage)EPackage.Registry.INSTANCE.getEPackage(ReachabilityGraphPackage.eNS_URI);
		RealtimestatechartPackage theRealtimestatechartPackage = (RealtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		zoneGraphEClass.getESuperTypes().add(theReachabilityGraphPackage.getReachabilityGraph());
		zoneGraphStateEClass.getESuperTypes().add(theReachabilityGraphPackage.getReachabilityGraphState());
		zoneGraphTransitionEClass.getESuperTypes().add(theReachabilityGraphPackage.getActionTransition());
		delayTransitionEClass.getESuperTypes().add(theReachabilityGraphPackage.getReachabilityGraphTransition());

		// Initialize classes and features; add operations and parameters
		initEClass(zoneGraphEClass, ZoneGraph.class, "ZoneGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoneGraph_Clocks(), theRealtimestatechartPackage.getClock(), null, "clocks", null, 0, -1, ZoneGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(zoneGraphStateEClass, ZoneGraphState.class, "ZoneGraphState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZoneGraphState_Federation(), this.getFederationObject(), "federation", null, 0, 1, ZoneGraphState.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneGraphState_Locations(), theRuntimePackage.getRealtimeStatechartInstance(), null, "locations", null, 0, -1, ZoneGraphState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneGraphState_ContainedToplevelStatechartInstances(), theRuntimePackage.getRealtimeStatechartInstance(), null, "containedToplevelStatechartInstances", null, 0, -1, ZoneGraphState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(zoneGraphStateEClass, theEcorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(zoneGraphTransitionEClass, ZoneGraphTransition.class, "ZoneGraphTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoneGraphTransition_FiredRTSCTransitions(), theRealtimestatechartPackage.getTransition(), null, "firedRTSCTransitions", null, 0, -1, ZoneGraphTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(zoneGraphTransitionEClass, theEcorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(delayTransitionEClass, DelayTransition.class, "DelayTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(federationObjectEDataType, Federation.class, "FederationObject", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RtscPackageImpl
