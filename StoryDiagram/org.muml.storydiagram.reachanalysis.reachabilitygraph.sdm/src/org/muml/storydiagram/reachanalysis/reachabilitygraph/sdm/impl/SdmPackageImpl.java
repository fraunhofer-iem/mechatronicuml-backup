/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage;
import org.muml.storydiagram.StorydiagramPackage;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.GraphTransformationSystem;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMReachabilityGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SDMTransition;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmFactory;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.StepGraph;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SuccessorStepGraphs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdmPackageImpl extends EPackageImpl implements SdmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdmTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successorStepGraphsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphTransformationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdmReachabilityGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingEntryEClass = null;

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
	 * @see org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SdmPackageImpl() {
		super(eNS_URI, SdmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SdmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SdmPackage init() {
		if (isInited) return (SdmPackage)EPackage.Registry.INSTANCE.getEPackage(SdmPackage.eNS_URI);

		// Obtain or create and register package
		SdmPackageImpl theSdmPackage = (SdmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SdmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SdmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ReachabilityGraphPackage.eINSTANCE.eClass();
		StorydiagramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSdmPackage.createPackageContents();

		// Initialize created meta-data
		theSdmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSdmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SdmPackage.eNS_URI, theSdmPackage);
		return theSdmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepGraph() {
		return stepGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepGraph_ChangeableNodes() {
		return (EReference)stepGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepGraph_Contains() {
		return (EReference)stepGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepGraph_UnchangeableNodes() {
		return (EReference)stepGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepGraph_ContainedNodes() {
		return (EReference)stepGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDMTransition() {
		return sdmTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDMTransition_Index() {
		return (EReference)sdmTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDMTransition_AppliedActivity() {
		return (EReference)sdmTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDMTransition_Matching() {
		return (EReference)sdmTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexEntry() {
		return indexEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexEntry_Key() {
		return (EReference)indexEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexEntry_Value() {
		return (EReference)indexEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuccessorStepGraphs() {
		return successorStepGraphsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuccessorStepGraphs_Successors() {
		return (EReference)successorStepGraphsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphTransformationSystem() {
		return graphTransformationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphTransformationSystem_Activities() {
		return (EReference)graphTransformationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphTransformationSystem_UnchangeableNodes() {
		return (EReference)graphTransformationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDMReachabilityGraph() {
		return sdmReachabilityGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDMReachabilityGraph_UnchangeableNodes() {
		return (EReference)sdmReachabilityGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDMReachabilityGraph_ContainedUnchangeableNodes() {
		return (EReference)sdmReachabilityGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchingEntry() {
		return matchingEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchingEntry_Key() {
		return (EAttribute)matchingEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchingEntry_Value() {
		return (EReference)matchingEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdmFactory getSdmFactory() {
		return (SdmFactory)getEFactoryInstance();
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
		stepGraphEClass = createEClass(STEP_GRAPH);
		createEReference(stepGraphEClass, STEP_GRAPH__CHANGEABLE_NODES);
		createEReference(stepGraphEClass, STEP_GRAPH__CONTAINS);
		createEReference(stepGraphEClass, STEP_GRAPH__UNCHANGEABLE_NODES);
		createEReference(stepGraphEClass, STEP_GRAPH__CONTAINED_NODES);

		sdmTransitionEClass = createEClass(SDM_TRANSITION);
		createEReference(sdmTransitionEClass, SDM_TRANSITION__INDEX);
		createEReference(sdmTransitionEClass, SDM_TRANSITION__APPLIED_ACTIVITY);
		createEReference(sdmTransitionEClass, SDM_TRANSITION__MATCHING);

		indexEntryEClass = createEClass(INDEX_ENTRY);
		createEReference(indexEntryEClass, INDEX_ENTRY__KEY);
		createEReference(indexEntryEClass, INDEX_ENTRY__VALUE);

		successorStepGraphsEClass = createEClass(SUCCESSOR_STEP_GRAPHS);
		createEReference(successorStepGraphsEClass, SUCCESSOR_STEP_GRAPHS__SUCCESSORS);

		graphTransformationSystemEClass = createEClass(GRAPH_TRANSFORMATION_SYSTEM);
		createEReference(graphTransformationSystemEClass, GRAPH_TRANSFORMATION_SYSTEM__ACTIVITIES);
		createEReference(graphTransformationSystemEClass, GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES);

		sdmReachabilityGraphEClass = createEClass(SDM_REACHABILITY_GRAPH);
		createEReference(sdmReachabilityGraphEClass, SDM_REACHABILITY_GRAPH__UNCHANGEABLE_NODES);
		createEReference(sdmReachabilityGraphEClass, SDM_REACHABILITY_GRAPH__CONTAINED_UNCHANGEABLE_NODES);

		matchingEntryEClass = createEClass(MATCHING_ENTRY);
		createEAttribute(matchingEntryEClass, MATCHING_ENTRY__KEY);
		createEReference(matchingEntryEClass, MATCHING_ENTRY__VALUE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stepGraphEClass.getESuperTypes().add(theReachabilityGraphPackage.getReachabilityGraphState());
		sdmTransitionEClass.getESuperTypes().add(theReachabilityGraphPackage.getActionTransition());
		sdmReachabilityGraphEClass.getESuperTypes().add(theReachabilityGraphPackage.getReachabilityGraph());

		// Initialize classes and features; add operations and parameters
		initEClass(stepGraphEClass, StepGraph.class, "StepGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStepGraph_ChangeableNodes(), ecorePackage.getEObject(), null, "changeableNodes", null, 0, -1, StepGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStepGraph_Contains(), theEcorePackage.getEObject(), null, "contains", null, 0, -1, StepGraph.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStepGraph_UnchangeableNodes(), theEcorePackage.getEObject(), null, "unchangeableNodes", null, 0, -1, StepGraph.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStepGraph_ContainedNodes(), theEcorePackage.getEObject(), null, "containedNodes", null, 0, -1, StepGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sdmTransitionEClass, SDMTransition.class, "SDMTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSDMTransition_Index(), this.getIndexEntry(), null, "index", null, 0, -1, SDMTransition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSDMTransition_AppliedActivity(), theActivitiesPackage.getActivity(), null, "appliedActivity", null, 0, 1, SDMTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSDMTransition_Matching(), this.getMatchingEntry(), null, "matching", null, 0, -1, SDMTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexEntryEClass, Map.Entry.class, "IndexEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndexEntry_Key(), theEcorePackage.getEObject(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndexEntry_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(successorStepGraphsEClass, SuccessorStepGraphs.class, "SuccessorStepGraphs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuccessorStepGraphs_Successors(), this.getStepGraph(), null, "successors", null, 0, -1, SuccessorStepGraphs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphTransformationSystemEClass, GraphTransformationSystem.class, "GraphTransformationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphTransformationSystem_Activities(), theActivitiesPackage.getActivity(), null, "activities", null, 0, -1, GraphTransformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphTransformationSystem_UnchangeableNodes(), theEcorePackage.getEClass(), null, "unchangeableNodes", null, 0, -1, GraphTransformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sdmReachabilityGraphEClass, SDMReachabilityGraph.class, "SDMReachabilityGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSDMReachabilityGraph_UnchangeableNodes(), theEcorePackage.getEObject(), null, "unchangeableNodes", null, 0, -1, SDMReachabilityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSDMReachabilityGraph_ContainedUnchangeableNodes(), ecorePackage.getEObject(), null, "containedUnchangeableNodes", null, 0, -1, SDMReachabilityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(matchingEntryEClass, Map.Entry.class, "MatchingEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchingEntry_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchingEntry_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SdmPackageImpl
