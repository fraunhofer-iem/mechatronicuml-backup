/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.reachanalysis.reachabilitygraph.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.core.reachanalysis.reachabilitygraph.ActionTransition;
import org.muml.core.reachanalysis.reachabilitygraph.HashToStateList;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphFactory;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;

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
	private EClass hashToStateListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashToStateListMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reachabilityGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reachabilityGraphTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reachabilityGraphStateEClass = null;

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
	 * @see org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage#eNS_URI
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
		CorePackage.eINSTANCE.eClass();

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
	public EClass getHashToStateList() {
		return hashToStateListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashToStateList_Hash() {
		return (EAttribute)hashToStateListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHashToStateList_States() {
		return (EReference)hashToStateListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHashToStateListMapEntry() {
		return hashToStateListMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashToStateListMapEntry_Key() {
		return (EAttribute)hashToStateListMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHashToStateListMapEntry_Value() {
		return (EReference)hashToStateListMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReachabilityGraph() {
		return reachabilityGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachabilityGraph_States() {
		return (EReference)reachabilityGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachabilityGraph_Transitions() {
		return (EReference)reachabilityGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachabilityGraph_StartState() {
		return (EReference)reachabilityGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachabilityGraph_StatesWithHash() {
		return (EReference)reachabilityGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReachabilityGraphTransition() {
		return reachabilityGraphTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachabilityGraphTransition_Source() {
		return (EReference)reachabilityGraphTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachabilityGraphTransition_Target() {
		return (EReference)reachabilityGraphTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachabilityGraphTransition_ReachabilityGraph() {
		return (EReference)reachabilityGraphTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionTransition() {
		return actionTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReachabilityGraphState() {
		return reachabilityGraphStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReachabilityGraphState_Hash() {
		return (EAttribute)reachabilityGraphStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachabilityGraphState_IncomingTransitions() {
		return (EReference)reachabilityGraphStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachabilityGraphState_OutgoingTransitions() {
		return (EReference)reachabilityGraphStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReachabilityGraphState_ReachabilityGraph() {
		return (EReference)reachabilityGraphStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReachabilityGraphState_PathDepth() {
		return (EAttribute)reachabilityGraphStateEClass.getEStructuralFeatures().get(4);
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
		hashToStateListEClass = createEClass(HASH_TO_STATE_LIST);
		createEAttribute(hashToStateListEClass, HASH_TO_STATE_LIST__HASH);
		createEReference(hashToStateListEClass, HASH_TO_STATE_LIST__STATES);

		hashToStateListMapEntryEClass = createEClass(HASH_TO_STATE_LIST_MAP_ENTRY);
		createEAttribute(hashToStateListMapEntryEClass, HASH_TO_STATE_LIST_MAP_ENTRY__KEY);
		createEReference(hashToStateListMapEntryEClass, HASH_TO_STATE_LIST_MAP_ENTRY__VALUE);

		reachabilityGraphEClass = createEClass(REACHABILITY_GRAPH);
		createEReference(reachabilityGraphEClass, REACHABILITY_GRAPH__STATES);
		createEReference(reachabilityGraphEClass, REACHABILITY_GRAPH__TRANSITIONS);
		createEReference(reachabilityGraphEClass, REACHABILITY_GRAPH__START_STATE);
		createEReference(reachabilityGraphEClass, REACHABILITY_GRAPH__STATES_WITH_HASH);

		reachabilityGraphTransitionEClass = createEClass(REACHABILITY_GRAPH_TRANSITION);
		createEReference(reachabilityGraphTransitionEClass, REACHABILITY_GRAPH_TRANSITION__SOURCE);
		createEReference(reachabilityGraphTransitionEClass, REACHABILITY_GRAPH_TRANSITION__TARGET);
		createEReference(reachabilityGraphTransitionEClass, REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH);

		actionTransitionEClass = createEClass(ACTION_TRANSITION);

		reachabilityGraphStateEClass = createEClass(REACHABILITY_GRAPH_STATE);
		createEAttribute(reachabilityGraphStateEClass, REACHABILITY_GRAPH_STATE__HASH);
		createEReference(reachabilityGraphStateEClass, REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS);
		createEReference(reachabilityGraphStateEClass, REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS);
		createEReference(reachabilityGraphStateEClass, REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH);
		createEAttribute(reachabilityGraphStateEClass, REACHABILITY_GRAPH_STATE__PATH_DEPTH);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reachabilityGraphEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		reachabilityGraphTransitionEClass.getESuperTypes().add(theCorePackage.getExtendableElement());
		actionTransitionEClass.getESuperTypes().add(this.getReachabilityGraphTransition());
		reachabilityGraphStateEClass.getESuperTypes().add(theCorePackage.getExtendableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(hashToStateListEClass, HashToStateList.class, "HashToStateList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHashToStateList_Hash(), ecorePackage.getELong(), "hash", null, 0, 1, HashToStateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHashToStateList_States(), this.getReachabilityGraphState(), null, "states", null, 0, -1, HashToStateList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashToStateListMapEntryEClass, Map.Entry.class, "HashToStateListMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHashToStateListMapEntry_Key(), ecorePackage.getELongObject(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHashToStateListMapEntry_Value(), this.getHashToStateList(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reachabilityGraphEClass, ReachabilityGraph.class, "ReachabilityGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReachabilityGraph_States(), this.getReachabilityGraphState(), this.getReachabilityGraphState_ReachabilityGraph(), "states", null, 0, -1, ReachabilityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReachabilityGraph_Transitions(), this.getReachabilityGraphTransition(), this.getReachabilityGraphTransition_ReachabilityGraph(), "transitions", null, 0, -1, ReachabilityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReachabilityGraph_StartState(), this.getReachabilityGraphState(), null, "startState", null, 0, 1, ReachabilityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReachabilityGraph_StatesWithHash(), this.getHashToStateListMapEntry(), null, "statesWithHash", null, 0, -1, ReachabilityGraph.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(reachabilityGraphEClass, null, "addToStatesMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getReachabilityGraphState(), "state", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reachabilityGraphTransitionEClass, ReachabilityGraphTransition.class, "ReachabilityGraphTransition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReachabilityGraphTransition_Source(), this.getReachabilityGraphState(), this.getReachabilityGraphState_OutgoingTransitions(), "source", null, 0, 1, ReachabilityGraphTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReachabilityGraphTransition_Target(), this.getReachabilityGraphState(), this.getReachabilityGraphState_IncomingTransitions(), "target", null, 0, 1, ReachabilityGraphTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReachabilityGraphTransition_ReachabilityGraph(), this.getReachabilityGraph(), this.getReachabilityGraph_Transitions(), "reachabilityGraph", null, 0, 1, ReachabilityGraphTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionTransitionEClass, ActionTransition.class, "ActionTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reachabilityGraphStateEClass, ReachabilityGraphState.class, "ReachabilityGraphState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReachabilityGraphState_Hash(), ecorePackage.getELong(), "hash", "1", 0, 1, ReachabilityGraphState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReachabilityGraphState_IncomingTransitions(), this.getReachabilityGraphTransition(), this.getReachabilityGraphTransition_Target(), "incomingTransitions", null, 0, -1, ReachabilityGraphState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReachabilityGraphState_OutgoingTransitions(), this.getReachabilityGraphTransition(), this.getReachabilityGraphTransition_Source(), "outgoingTransitions", null, 0, -1, ReachabilityGraphState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReachabilityGraphState_ReachabilityGraph(), this.getReachabilityGraph(), this.getReachabilityGraph_States(), "reachabilityGraph", null, 0, 1, ReachabilityGraphState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReachabilityGraphState_PathDepth(), ecorePackage.getEInt(), "pathDepth", "0", 0, 1, ReachabilityGraphState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ReachabilityGraphPackageImpl
