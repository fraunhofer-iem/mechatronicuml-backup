/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.muml.core.expressions.common.CommonExpressionsPackage;

import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonFactory;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier;

import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;

import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.SdmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GtautomatonPackageImpl extends EPackageImpl implements GtautomatonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtStepGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectToIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierToEObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtAutomatonTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtAutomatonClockConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtAutomatonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockInstanceStoryDiagramToIdentifierEClass = null;

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
	 * @see org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GtautomatonPackageImpl() {
		super(eNS_URI, GtautomatonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GtautomatonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GtautomatonPackage init() {
		if (isInited) return (GtautomatonPackage)EPackage.Registry.INSTANCE.getEPackage(GtautomatonPackage.eNS_URI);

		// Obtain or create and register package
		GtautomatonPackageImpl theGtautomatonPackage = (GtautomatonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GtautomatonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GtautomatonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();
		TimedstorydiagramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGtautomatonPackage.createPackageContents();

		// Initialize created meta-data
		theGtautomatonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGtautomatonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GtautomatonPackage.eNS_URI, theGtautomatonPackage);
		return theGtautomatonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGtStepGraph() {
		return gtStepGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGtStepGraph_Invariant() {
		return (EReference)gtStepGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGtStepGraph_ObjectIdentifier() {
		return (EReference)gtStepGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGtStepGraph_ClockInstances() {
		return (EReference)gtStepGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIdentifier() {
		return objectIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIdentifier_IdentifierToEObject() {
		return (EReference)objectIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIdentifier_EObjectToIdentifier() {
		return (EReference)objectIdentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIdentifier_FreeClockInstanceIdentifiers() {
		return (EReference)objectIdentifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObjectToIdentifier() {
		return eObjectToIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEObjectToIdentifier_Key() {
		return (EReference)eObjectToIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEObjectToIdentifier_Value() {
		return (EAttribute)eObjectToIdentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierToEObject() {
		return identifierToEObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierToEObject_Key() {
		return (EAttribute)identifierToEObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifierToEObject_Value() {
		return (EReference)identifierToEObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGtAutomatonTransition() {
		return gtAutomatonTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGtAutomatonTransition_TimeGuards() {
		return (EReference)gtAutomatonTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGtAutomatonTransition_ClockResets() {
		return (EAttribute)gtAutomatonTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGtAutomatonClockConstraint() {
		return gtAutomatonClockConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGtAutomatonClockConstraint_ClockInstanceIdentifier() {
		return (EAttribute)gtAutomatonClockConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGtAutomatonClockConstraint_Operator() {
		return (EAttribute)gtAutomatonClockConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGtAutomatonClockConstraint_Value() {
		return (EAttribute)gtAutomatonClockConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGtAutomaton() {
		return gtAutomatonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGtAutomaton_ClockInstanceIdentifiers() {
		return (EAttribute)gtAutomatonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockInstanceStoryDiagramToIdentifier() {
		return clockInstanceStoryDiagramToIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockInstanceStoryDiagramToIdentifier_Key() {
		return (EReference)clockInstanceStoryDiagramToIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockInstanceStoryDiagramToIdentifier_Value() {
		return (EAttribute)clockInstanceStoryDiagramToIdentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtautomatonFactory getGtautomatonFactory() {
		return (GtautomatonFactory)getEFactoryInstance();
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
		gtStepGraphEClass = createEClass(GT_STEP_GRAPH);
		createEReference(gtStepGraphEClass, GT_STEP_GRAPH__INVARIANT);
		createEReference(gtStepGraphEClass, GT_STEP_GRAPH__OBJECT_IDENTIFIER);
		createEReference(gtStepGraphEClass, GT_STEP_GRAPH__CLOCK_INSTANCES);

		objectIdentifierEClass = createEClass(OBJECT_IDENTIFIER);
		createEReference(objectIdentifierEClass, OBJECT_IDENTIFIER__IDENTIFIER_TO_EOBJECT);
		createEReference(objectIdentifierEClass, OBJECT_IDENTIFIER__EOBJECT_TO_IDENTIFIER);
		createEReference(objectIdentifierEClass, OBJECT_IDENTIFIER__FREE_CLOCK_INSTANCE_IDENTIFIERS);

		eObjectToIdentifierEClass = createEClass(EOBJECT_TO_IDENTIFIER);
		createEReference(eObjectToIdentifierEClass, EOBJECT_TO_IDENTIFIER__KEY);
		createEAttribute(eObjectToIdentifierEClass, EOBJECT_TO_IDENTIFIER__VALUE);

		identifierToEObjectEClass = createEClass(IDENTIFIER_TO_EOBJECT);
		createEAttribute(identifierToEObjectEClass, IDENTIFIER_TO_EOBJECT__KEY);
		createEReference(identifierToEObjectEClass, IDENTIFIER_TO_EOBJECT__VALUE);

		gtAutomatonTransitionEClass = createEClass(GT_AUTOMATON_TRANSITION);
		createEReference(gtAutomatonTransitionEClass, GT_AUTOMATON_TRANSITION__TIME_GUARDS);
		createEAttribute(gtAutomatonTransitionEClass, GT_AUTOMATON_TRANSITION__CLOCK_RESETS);

		gtAutomatonClockConstraintEClass = createEClass(GT_AUTOMATON_CLOCK_CONSTRAINT);
		createEAttribute(gtAutomatonClockConstraintEClass, GT_AUTOMATON_CLOCK_CONSTRAINT__CLOCK_INSTANCE_IDENTIFIER);
		createEAttribute(gtAutomatonClockConstraintEClass, GT_AUTOMATON_CLOCK_CONSTRAINT__OPERATOR);
		createEAttribute(gtAutomatonClockConstraintEClass, GT_AUTOMATON_CLOCK_CONSTRAINT__VALUE);

		gtAutomatonEClass = createEClass(GT_AUTOMATON);
		createEAttribute(gtAutomatonEClass, GT_AUTOMATON__CLOCK_INSTANCE_IDENTIFIERS);

		clockInstanceStoryDiagramToIdentifierEClass = createEClass(CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER);
		createEReference(clockInstanceStoryDiagramToIdentifierEClass, CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__KEY);
		createEAttribute(clockInstanceStoryDiagramToIdentifierEClass, CLOCK_INSTANCE_STORY_DIAGRAM_TO_IDENTIFIER__VALUE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CommonExpressionsPackage theCommonExpressionsPackage = (CommonExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gtStepGraphEClass.getESuperTypes().add(theSdmPackage.getStepGraph());
		gtAutomatonTransitionEClass.getESuperTypes().add(theSdmPackage.getSDMTransition());
		gtAutomatonEClass.getESuperTypes().add(theSdmPackage.getSDMReachabilityGraph());

		// Initialize classes and features; add operations and parameters
		initEClass(gtStepGraphEClass, GtStepGraph.class, "GtStepGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGtStepGraph_Invariant(), this.getGtAutomatonClockConstraint(), null, "invariant", null, 0, -1, GtStepGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGtStepGraph_ObjectIdentifier(), this.getObjectIdentifier(), null, "objectIdentifier", null, 0, 1, GtStepGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGtStepGraph_ClockInstances(), theTimedstorydiagramPackage.getClockInstance(), null, "clockInstances", null, 0, -1, GtStepGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectIdentifierEClass, ObjectIdentifier.class, "ObjectIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectIdentifier_IdentifierToEObject(), this.getIdentifierToEObject(), null, "IdentifierToEObject", null, 0, -1, ObjectIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectIdentifier_EObjectToIdentifier(), this.getEObjectToIdentifier(), null, "EObjectToIdentifier", null, 0, -1, ObjectIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectIdentifier_FreeClockInstanceIdentifiers(), this.getClockInstanceStoryDiagramToIdentifier(), null, "freeClockInstanceIdentifiers", null, 0, -1, ObjectIdentifier.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(objectIdentifierEClass, null, "putEObjectToIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "currentObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "identifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectIdentifierEClass, null, "putIdentifierToEObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "identifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "currentObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectIdentifierEClass, theEcorePackage.getEString(), "getIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "currentObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectIdentifierEClass, theEcorePackage.getEObject(), "getEObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "currentIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectIdentifierEClass, theEcorePackage.getEString(), "getFreeClockInstanceIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTimedstorydiagramPackage.getClockInstanceStoryDiagram(), "clockInstanceStoryDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eObjectToIdentifierEClass, Map.Entry.class, "EObjectToIdentifier", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectToIdentifier_Key(), theEcorePackage.getEObject(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEObjectToIdentifier_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierToEObjectEClass, Map.Entry.class, "IdentifierToEObject", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifierToEObject_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifierToEObject_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gtAutomatonTransitionEClass, GtAutomatonTransition.class, "GtAutomatonTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGtAutomatonTransition_TimeGuards(), this.getGtAutomatonClockConstraint(), null, "timeGuards", null, 0, -1, GtAutomatonTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGtAutomatonTransition_ClockResets(), theEcorePackage.getEString(), "clockResets", null, 0, -1, GtAutomatonTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gtAutomatonClockConstraintEClass, GtAutomatonClockConstraint.class, "GtAutomatonClockConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGtAutomatonClockConstraint_ClockInstanceIdentifier(), theEcorePackage.getEString(), "clockInstanceIdentifier", null, 0, 1, GtAutomatonClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGtAutomatonClockConstraint_Operator(), theCommonExpressionsPackage.getComparingOperator(), "operator", null, 0, 1, GtAutomatonClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGtAutomatonClockConstraint_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, GtAutomatonClockConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gtAutomatonEClass, GtAutomaton.class, "GtAutomaton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGtAutomaton_ClockInstanceIdentifiers(), theEcorePackage.getEString(), "clockInstanceIdentifiers", null, 0, -1, GtAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockInstanceStoryDiagramToIdentifierEClass, Map.Entry.class, "ClockInstanceStoryDiagramToIdentifier", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockInstanceStoryDiagramToIdentifier_Key(), theTimedstorydiagramPackage.getClockInstanceStoryDiagram(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockInstanceStoryDiagramToIdentifier_Value(), theEcorePackage.getEString(), "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GtautomatonPackageImpl
