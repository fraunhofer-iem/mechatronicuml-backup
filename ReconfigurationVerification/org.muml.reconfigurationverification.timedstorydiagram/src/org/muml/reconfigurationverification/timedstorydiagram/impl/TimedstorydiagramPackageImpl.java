/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.mumlcore.CorePackage;
import org.muml.mumlcore.expressions.common.CommonExpressionsPackage;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable;
import org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedActivityNode;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryPattern;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramFactory;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.reconfigurationverification.timedstorydiagram.util.TimedstorydiagramValidator;
import org.muml.storydiagram.StorydiagramPackage;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.patterns.PatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedstorydiagramPackageImpl extends EPackageImpl implements TimedstorydiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedGraphTransformationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedStoryDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invariantStoryDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockInstanceStoryDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockInstanceConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockInstanceVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedStoryPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedActivityNodeEClass = null;

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
	 * @see org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimedstorydiagramPackageImpl() {
		super(eNS_URI, TimedstorydiagramFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimedstorydiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimedstorydiagramPackage init() {
		if (isInited) return (TimedstorydiagramPackage)EPackage.Registry.INSTANCE.getEPackage(TimedstorydiagramPackage.eNS_URI);

		// Obtain or create and register package
		TimedstorydiagramPackageImpl theTimedstorydiagramPackage = (TimedstorydiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimedstorydiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimedstorydiagramPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StorydiagramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTimedstorydiagramPackage.createPackageContents();

		// Initialize created meta-data
		theTimedstorydiagramPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTimedstorydiagramPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TimedstorydiagramValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTimedstorydiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimedstorydiagramPackage.eNS_URI, theTimedstorydiagramPackage);
		return theTimedstorydiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedGraphTransformationSystem() {
		return timedGraphTransformationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedGraphTransformationSystem_Rules() {
		return (EReference)timedGraphTransformationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedGraphTransformationSystem_Invariants() {
		return (EReference)timedGraphTransformationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedGraphTransformationSystem_ClockInstanceRules() {
		return (EReference)timedGraphTransformationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedGraphTransformationSystem_InitialGraphObjects() {
		return (EReference)timedGraphTransformationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedGraphTransformationSystem_UnchangeableNodes() {
		return (EReference)timedGraphTransformationSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedGraphTransformationSystem_HelperStoryDiagrams() {
		return (EReference)timedGraphTransformationSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedGraphTransformationSystem_TypeGraphObjects() {
		return (EReference)timedGraphTransformationSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedStoryDiagram() {
		return timedStoryDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedStoryDiagram_ClockInstConstraint() {
		return (EReference)timedStoryDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedStoryDiagram_Resets() {
		return (EReference)timedStoryDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedStoryDiagram_MinDuration() {
		return (EAttribute)timedStoryDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedStoryDiagram_MaxDuration() {
		return (EAttribute)timedStoryDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvariantStoryDiagram() {
		return invariantStoryDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvariantStoryDiagram_ClockInstConstraint() {
		return (EReference)invariantStoryDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockInstanceStoryDiagram() {
		return clockInstanceStoryDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockInstance() {
		return clockInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockInstance_Id() {
		return (EAttribute)clockInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockInstance_HasNode() {
		return (EReference)clockInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockInstanceConstraint() {
		return clockInstanceConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockInstanceConstraint_ClockInstanceVariable() {
		return (EReference)clockInstanceConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockInstanceConstraint_Operator() {
		return (EAttribute)clockInstanceConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockInstanceConstraint_Value() {
		return (EAttribute)clockInstanceConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockInstanceVariable() {
		return clockInstanceVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClockInstanceVariable_ClockInstanceConstraints() {
		return (EReference)clockInstanceVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedStoryPattern() {
		return timedStoryPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedStoryPattern_NonModifyingStoryPattern() {
		return (EAttribute)timedStoryPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedActivityNode() {
		return timedActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedActivityNode_OwnedTimedStoryPattern() {
		return (EReference)timedActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedstorydiagramFactory getTimedstorydiagramFactory() {
		return (TimedstorydiagramFactory)getEFactoryInstance();
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
		timedGraphTransformationSystemEClass = createEClass(TIMED_GRAPH_TRANSFORMATION_SYSTEM);
		createEReference(timedGraphTransformationSystemEClass, TIMED_GRAPH_TRANSFORMATION_SYSTEM__RULES);
		createEReference(timedGraphTransformationSystemEClass, TIMED_GRAPH_TRANSFORMATION_SYSTEM__INVARIANTS);
		createEReference(timedGraphTransformationSystemEClass, TIMED_GRAPH_TRANSFORMATION_SYSTEM__CLOCK_INSTANCE_RULES);
		createEReference(timedGraphTransformationSystemEClass, TIMED_GRAPH_TRANSFORMATION_SYSTEM__INITIAL_GRAPH_OBJECTS);
		createEReference(timedGraphTransformationSystemEClass, TIMED_GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES);
		createEReference(timedGraphTransformationSystemEClass, TIMED_GRAPH_TRANSFORMATION_SYSTEM__HELPER_STORY_DIAGRAMS);
		createEReference(timedGraphTransformationSystemEClass, TIMED_GRAPH_TRANSFORMATION_SYSTEM__TYPE_GRAPH_OBJECTS);

		timedStoryDiagramEClass = createEClass(TIMED_STORY_DIAGRAM);
		createEReference(timedStoryDiagramEClass, TIMED_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT);
		createEReference(timedStoryDiagramEClass, TIMED_STORY_DIAGRAM__RESETS);
		createEAttribute(timedStoryDiagramEClass, TIMED_STORY_DIAGRAM__MIN_DURATION);
		createEAttribute(timedStoryDiagramEClass, TIMED_STORY_DIAGRAM__MAX_DURATION);

		invariantStoryDiagramEClass = createEClass(INVARIANT_STORY_DIAGRAM);
		createEReference(invariantStoryDiagramEClass, INVARIANT_STORY_DIAGRAM__CLOCK_INST_CONSTRAINT);

		clockInstanceStoryDiagramEClass = createEClass(CLOCK_INSTANCE_STORY_DIAGRAM);

		clockInstanceEClass = createEClass(CLOCK_INSTANCE);
		createEAttribute(clockInstanceEClass, CLOCK_INSTANCE__ID);
		createEReference(clockInstanceEClass, CLOCK_INSTANCE__HAS_NODE);

		clockInstanceConstraintEClass = createEClass(CLOCK_INSTANCE_CONSTRAINT);
		createEReference(clockInstanceConstraintEClass, CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE);
		createEAttribute(clockInstanceConstraintEClass, CLOCK_INSTANCE_CONSTRAINT__OPERATOR);
		createEAttribute(clockInstanceConstraintEClass, CLOCK_INSTANCE_CONSTRAINT__VALUE);

		clockInstanceVariableEClass = createEClass(CLOCK_INSTANCE_VARIABLE);
		createEReference(clockInstanceVariableEClass, CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS);

		timedStoryPatternEClass = createEClass(TIMED_STORY_PATTERN);
		createEAttribute(timedStoryPatternEClass, TIMED_STORY_PATTERN__NON_MODIFYING_STORY_PATTERN);

		timedActivityNodeEClass = createEClass(TIMED_ACTIVITY_NODE);
		createEReference(timedActivityNodeEClass, TIMED_ACTIVITY_NODE__OWNED_TIMED_STORY_PATTERN);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		CommonExpressionsPackage theCommonExpressionsPackage = (CommonExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonExpressionsPackage.eNS_URI);
		PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		timedGraphTransformationSystemEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		timedStoryDiagramEClass.getESuperTypes().add(theActivitiesPackage.getActivity());
		invariantStoryDiagramEClass.getESuperTypes().add(theActivitiesPackage.getActivity());
		clockInstanceStoryDiagramEClass.getESuperTypes().add(theActivitiesPackage.getActivity());
		clockInstanceEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		clockInstanceVariableEClass.getESuperTypes().add(thePatternsPackage.getObjectVariable());
		timedStoryPatternEClass.getESuperTypes().add(thePatternsPackage.getStoryPattern());
		timedActivityNodeEClass.getESuperTypes().add(theActivitiesPackage.getModifyingStoryNode());

		// Initialize classes and features; add operations and parameters
		initEClass(timedGraphTransformationSystemEClass, TimedGraphTransformationSystem.class, "TimedGraphTransformationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedGraphTransformationSystem_Rules(), this.getTimedStoryDiagram(), null, "rules", null, 0, -1, TimedGraphTransformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedGraphTransformationSystem_Invariants(), this.getInvariantStoryDiagram(), null, "invariants", null, 0, -1, TimedGraphTransformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedGraphTransformationSystem_ClockInstanceRules(), this.getClockInstanceStoryDiagram(), null, "clockInstanceRules", null, 0, -1, TimedGraphTransformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedGraphTransformationSystem_InitialGraphObjects(), theEcorePackage.getEObject(), null, "initialGraphObjects", null, 0, -1, TimedGraphTransformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedGraphTransformationSystem_UnchangeableNodes(), theEcorePackage.getEClass(), null, "unchangeableNodes", null, 0, -1, TimedGraphTransformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedGraphTransformationSystem_HelperStoryDiagrams(), theActivitiesPackage.getActivity(), null, "helperStoryDiagrams", null, 0, -1, TimedGraphTransformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedGraphTransformationSystem_TypeGraphObjects(), theEcorePackage.getEObject(), null, "typeGraphObjects", null, 0, -1, TimedGraphTransformationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedStoryDiagramEClass, TimedStoryDiagram.class, "TimedStoryDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedStoryDiagram_ClockInstConstraint(), this.getClockInstanceConstraint(), null, "clockInstConstraint", null, 0, -1, TimedStoryDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedStoryDiagram_Resets(), this.getClockInstanceVariable(), null, "resets", null, 0, -1, TimedStoryDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedStoryDiagram_MinDuration(), theEcorePackage.getEInt(), "minDuration", "0", 0, 1, TimedStoryDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedStoryDiagram_MaxDuration(), theEcorePackage.getEInt(), "maxDuration", "0", 0, 1, TimedStoryDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invariantStoryDiagramEClass, InvariantStoryDiagram.class, "InvariantStoryDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvariantStoryDiagram_ClockInstConstraint(), this.getClockInstanceConstraint(), null, "clockInstConstraint", null, 0, 1, InvariantStoryDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockInstanceStoryDiagramEClass, ClockInstanceStoryDiagram.class, "ClockInstanceStoryDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockInstanceEClass, ClockInstance.class, "ClockInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClockInstance_Id(), ecorePackage.getEString(), "id", null, 0, 1, ClockInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClockInstance_HasNode(), theEcorePackage.getEObject(), null, "hasNode", null, 1, -1, ClockInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clockInstanceConstraintEClass, ClockInstanceConstraint.class, "ClockInstanceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockInstanceConstraint_ClockInstanceVariable(), this.getClockInstanceVariable(), this.getClockInstanceVariable_ClockInstanceConstraints(), "clockInstanceVariable", null, 0, 1, ClockInstanceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockInstanceConstraint_Operator(), theCommonExpressionsPackage.getComparingOperator(), "operator", "LESS_OR_EQUAL", 0, 1, ClockInstanceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClockInstanceConstraint_Value(), theEcorePackage.getEInt(), "value", "1", 0, 1, ClockInstanceConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockInstanceVariableEClass, ClockInstanceVariable.class, "ClockInstanceVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClockInstanceVariable_ClockInstanceConstraints(), this.getClockInstanceConstraint(), this.getClockInstanceConstraint_ClockInstanceVariable(), "clockInstanceConstraints", null, 0, -1, ClockInstanceVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedStoryPatternEClass, TimedStoryPattern.class, "TimedStoryPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedStoryPattern_NonModifyingStoryPattern(), theEcorePackage.getEBoolean(), "nonModifyingStoryPattern", null, 0, 1, TimedStoryPattern.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(timedActivityNodeEClass, TimedActivityNode.class, "TimedActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedActivityNode_OwnedTimedStoryPattern(), this.getTimedStoryPattern(), null, "ownedTimedStoryPattern", null, 0, 1, TimedActivityNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (timedStoryDiagramEClass, 
		   source, 
		   new String[] {
			 "validDurations", "self.minDuration >= 0 and self.minDuration <= self.maxDuration",
			 "OnlyContainsTimedActivityNodes", "-- A TimedStoryDiagram may only contain an initial node, a final node, TimedActivityNodes, StatementNodes, and ActivityCallNodes --\r\nself.ownedActivityNode  -> select(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) or v.oclIsTypeOf(storydiagrams::activities::InitialNode) or v.oclIsTypeOf(storydiagrams::activities::ActivityFinalNode) or \r\nv.oclIsTypeOf(storydiagrams::activities::ActivityCallNode) or v.oclIsTypeOf(storydiagrams::activities::JunctionNode) or v.oclIsTypeOf(storydiagrams::activities::StatementNode)) -> size() = self.ownedActivityNode -> size()"
		   });	
		addAnnotation
		  (invariantStoryDiagramEClass, 
		   source, 
		   new String[] {
			 "NoModificationInInvariantRule", "-- In an InvariantStoryDiagram, all TimedActivityNodes need to be non-modifying--\r\nself.ownedActivityNode -> forAll(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) implies (v.oclAsType(timedstorydiagram::TimedActivityNode).ownedRule.oclAsType(timedstorydiagram::TimedStoryPattern).nonModifyingStoryPattern = true))",
			 "OnlyContainsTimedActivityNodes", "-- An InvariantStoryDiagram may only contain an initial node, a final node, and TimedActivityNodes --\r\nself.ownedActivityNode  -> select(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) or v.oclIsTypeOf(storydiagrams::activities::InitialNode) or v.oclIsTypeOf(storydiagrams::activities::ActivityFinalNode)) -> size() = self.ownedActivityNode -> size()"
		   });	
		addAnnotation
		  (clockInstanceStoryDiagramEClass, 
		   source, 
		   new String[] {
			 "OnlyContainsTimedActivityNodes", "-- A ClockInstanceStoryDiagram may only contain an initial node, a final node, and TimedActivityNodes --\r\nself.ownedActivityNode  -> select(v | v.oclIsTypeOf(timedstorydiagram::TimedActivityNode) or v.oclIsTypeOf(storydiagrams::activities::InitialNode) or v.oclIsTypeOf(storydiagrams::activities::ActivityFinalNode)) -> size() = self.ownedActivityNode -> size()"
		   });	
		addAnnotation
		  (clockInstanceVariableEClass, 
		   source, 
		   new String[] {
			 "ClockInstanceVariableOnlyRefersToClockInstances", "self.classifier = timedstorydiagram::ClockInstance",
			 "SetNameUponCreationOfClockInstance", "if self.bindingOperator = storydiagrams::patterns::BindingOperator::CREATE then (self.attributeAssignment -> size() >= 1 and self.attributeAssignment -> select(attribute.name = \'name\') -> size() >= 1) else true endif"
		   });	
		addAnnotation
		  (getTimedStoryPattern_NonModifyingStoryPattern(), 
		   source, 
		   new String[] {
			 "derivation", "-- Checks that all ObjectVariables and LinkVariables are check only and that no ObjectVariable has an AttributeAssignment--\r\nself.variable -> forAll(v | v.oclIsTypeOf(storydiagrams::patterns::ObjectVariable) implies (v.oclAsType(storydiagrams::patterns::ObjectVariable).bindingOperator = storydiagrams::patterns::BindingOperator::CHECK_ONLY and v.oclAsType(storydiagrams::patterns::ObjectVariable).attributeAssignment -> size() = 0)) and\r\nself.linkVariable -> forAll(bindingOperator = storydiagrams::patterns::BindingOperator::CHECK_ONLY)"
		   });	
		addAnnotation
		  (timedActivityNodeEClass, 
		   source, 
		   new String[] {
			 "TimedActivityNodeMayOnlyContainTimedStoryPattern", "self.ownedRule.oclIsKindOf(timedstorydiagram::TimedStoryPattern)"
		   });	
		addAnnotation
		  (getTimedActivityNode_OwnedTimedStoryPattern(), 
		   source, 
		   new String[] {
			 "derivation", "if(self.ownedRule.oclIsKindOf(timedstorydiagram::TimedStoryPattern) )then self.ownedRule.oclAsType(timedstorydiagram::TimedStoryPattern) else null endif"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (timedStoryDiagramEClass, 
		   source, 
		   new String[] {
			 "constraints", "validDurations OnlyContainsTimedActivityNodes"
		   });	
		addAnnotation
		  (invariantStoryDiagramEClass, 
		   source, 
		   new String[] {
			 "constraints", "NoModificationInInvariantRule OnlyContainsTimedActivityNodes"
		   });	
		addAnnotation
		  (clockInstanceStoryDiagramEClass, 
		   source, 
		   new String[] {
			 "constraints", "OnlyContainsTimedActivityNodes"
		   });	
		addAnnotation
		  (clockInstanceVariableEClass, 
		   source, 
		   new String[] {
			 "constraints", "ClockInstanceVariableOnlyRefersToClockInstances SetNameUponCreationOfClockInstance"
		   });	
		addAnnotation
		  (timedActivityNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "TimedActivityNodeMayOnlyContainTimedStoryPattern"
		   });
	}

} //TimedstorydiagramPackageImpl
