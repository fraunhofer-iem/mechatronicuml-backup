/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorPackage;

import de.uni_paderborn.fujaba.muml.component.ComponentPackage;

import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;

import de.uni_paderborn.fujaba.muml.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.msgtype.MsgtypePackage;

import de.uni_paderborn.fujaba.muml.protocol.ProtocolPackage;

import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.muml.types.TypesPackage;

import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.BooleanLogicPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.BooleanLogic.impl.BooleanLogicPackageImpl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl.ComparablesPackageImpl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.BufferOverflowExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.ComparisonOp;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DeadlockExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.DynamicPredicateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.FalseExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInBufferExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.MessageInTransitExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateActiveExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StateInStatechartExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.StaticPredicateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.SubstateOfExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TransitionFiringExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.TrueExpr;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.impl.MtctlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PredicatesPackageImpl extends EPackageImpl implements PredicatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadlockExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferOverflowExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageInBufferExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageInTransitExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateActiveExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substateOfExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionFiringExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicPredicateExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticPredicateExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass falseExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateInStatechartExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOpEEnum = null;

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
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PredicatesPackageImpl() {
		super(eNS_URI, PredicatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PredicatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PredicatesPackage init() {
		if (isInited) return (PredicatesPackage)EPackage.Registry.INSTANCE.getEPackage(PredicatesPackage.eNS_URI);

		// Obtain or create and register package
		PredicatesPackageImpl thePredicatesPackage = (PredicatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PredicatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PredicatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ComponentPackage.eINSTANCE.eClass();
		ConstraintPackage.eINSTANCE.eClass();
		InstancePackage.eINSTANCE.eClass();
		ProtocolPackage.eINSTANCE.eClass();
		RealtimestatechartPackage.eINSTANCE.eClass();
		MsgtypePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ConnectorPackage.eINSTANCE.eClass();
		ValuetypePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MtctlPackageImpl theMtctlPackage = (MtctlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MtctlPackage.eNS_URI) instanceof MtctlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MtctlPackage.eNS_URI) : MtctlPackage.eINSTANCE);
		QuantifiersPackageImpl theQuantifiersPackage = (QuantifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuantifiersPackage.eNS_URI) instanceof QuantifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuantifiersPackage.eNS_URI) : QuantifiersPackage.eINSTANCE);
		SetsPackageImpl theSetsPackage = (SetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI) instanceof SetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI) : SetsPackage.eINSTANCE);
		BooleanLogicPackageImpl theBooleanLogicPackage = (BooleanLogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI) instanceof BooleanLogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI) : BooleanLogicPackage.eINSTANCE);
		ComparablesPackageImpl theComparablesPackage = (ComparablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI) instanceof ComparablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI) : ComparablesPackage.eINSTANCE);

		// Create package meta-data objects
		thePredicatesPackage.createPackageContents();
		theMtctlPackage.createPackageContents();
		theQuantifiersPackage.createPackageContents();
		theSetsPackage.createPackageContents();
		theBooleanLogicPackage.createPackageContents();
		theComparablesPackage.createPackageContents();

		// Initialize created meta-data
		thePredicatesPackage.initializePackageContents();
		theMtctlPackage.initializePackageContents();
		theQuantifiersPackage.initializePackageContents();
		theSetsPackage.initializePackageContents();
		theBooleanLogicPackage.initializePackageContents();
		theComparablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePredicatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PredicatesPackage.eNS_URI, thePredicatesPackage);
		return thePredicatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadlockExpr() {
		return deadlockExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferOverflowExpr() {
		return bufferOverflowExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonExpr() {
		return comparisonExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonExpr_Lhs() {
		return (EReference)comparisonExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonExpr_Op() {
		return (EAttribute)comparisonExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonExpr_Rhs() {
		return (EReference)comparisonExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageInBufferExpr() {
		return messageInBufferExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageInBufferExpr_Buffer() {
		return (EReference)messageInBufferExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageInBufferExpr_Message() {
		return (EReference)messageInBufferExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageInTransitExpr() {
		return messageInTransitExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageInTransitExpr_Message() {
		return (EReference)messageInTransitExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateActiveExpr() {
		return stateActiveExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateActiveExpr_State() {
		return (EReference)stateActiveExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstateOfExpr() {
		return substateOfExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstateOfExpr_Superstate() {
		return (EReference)substateOfExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstateOfExpr_State() {
		return (EReference)substateOfExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionFiringExpr() {
		return transitionFiringExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionFiringExpr_Transition() {
		return (EReference)transitionFiringExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateExpr() {
		return predicateExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicPredicateExpr() {
		return dynamicPredicateExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticPredicateExpr() {
		return staticPredicateExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueExpr() {
		return trueExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFalseExpr() {
		return falseExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateInStatechartExpr() {
		return stateInStatechartExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateInStatechartExpr_State() {
		return (EReference)stateInStatechartExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateInStatechartExpr_Statechart() {
		return (EReference)stateInStatechartExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOp() {
		return comparisonOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicatesFactory getPredicatesFactory() {
		return (PredicatesFactory)getEFactoryInstance();
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
		deadlockExprEClass = createEClass(DEADLOCK_EXPR);

		bufferOverflowExprEClass = createEClass(BUFFER_OVERFLOW_EXPR);

		comparisonExprEClass = createEClass(COMPARISON_EXPR);
		createEReference(comparisonExprEClass, COMPARISON_EXPR__LHS);
		createEAttribute(comparisonExprEClass, COMPARISON_EXPR__OP);
		createEReference(comparisonExprEClass, COMPARISON_EXPR__RHS);

		messageInBufferExprEClass = createEClass(MESSAGE_IN_BUFFER_EXPR);
		createEReference(messageInBufferExprEClass, MESSAGE_IN_BUFFER_EXPR__BUFFER);
		createEReference(messageInBufferExprEClass, MESSAGE_IN_BUFFER_EXPR__MESSAGE);

		messageInTransitExprEClass = createEClass(MESSAGE_IN_TRANSIT_EXPR);
		createEReference(messageInTransitExprEClass, MESSAGE_IN_TRANSIT_EXPR__MESSAGE);

		stateActiveExprEClass = createEClass(STATE_ACTIVE_EXPR);
		createEReference(stateActiveExprEClass, STATE_ACTIVE_EXPR__STATE);

		substateOfExprEClass = createEClass(SUBSTATE_OF_EXPR);
		createEReference(substateOfExprEClass, SUBSTATE_OF_EXPR__SUPERSTATE);
		createEReference(substateOfExprEClass, SUBSTATE_OF_EXPR__STATE);

		transitionFiringExprEClass = createEClass(TRANSITION_FIRING_EXPR);
		createEReference(transitionFiringExprEClass, TRANSITION_FIRING_EXPR__TRANSITION);

		predicateExprEClass = createEClass(PREDICATE_EXPR);

		dynamicPredicateExprEClass = createEClass(DYNAMIC_PREDICATE_EXPR);

		staticPredicateExprEClass = createEClass(STATIC_PREDICATE_EXPR);

		trueExprEClass = createEClass(TRUE_EXPR);

		falseExprEClass = createEClass(FALSE_EXPR);

		stateInStatechartExprEClass = createEClass(STATE_IN_STATECHART_EXPR);
		createEReference(stateInStatechartExprEClass, STATE_IN_STATECHART_EXPR__STATE);
		createEReference(stateInStatechartExprEClass, STATE_IN_STATECHART_EXPR__STATECHART);

		// Create enums
		comparisonOpEEnum = createEEnum(COMPARISON_OP);
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
		ComparablesPackage theComparablesPackage = (ComparablesPackage)EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI);
		MtctlPackage theMtctlPackage = (MtctlPackage)EPackage.Registry.INSTANCE.getEPackage(MtctlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deadlockExprEClass.getESuperTypes().add(this.getDynamicPredicateExpr());
		bufferOverflowExprEClass.getESuperTypes().add(this.getDynamicPredicateExpr());
		comparisonExprEClass.getESuperTypes().add(this.getPredicateExpr());
		messageInBufferExprEClass.getESuperTypes().add(this.getDynamicPredicateExpr());
		messageInTransitExprEClass.getESuperTypes().add(this.getDynamicPredicateExpr());
		stateActiveExprEClass.getESuperTypes().add(this.getDynamicPredicateExpr());
		substateOfExprEClass.getESuperTypes().add(this.getStaticPredicateExpr());
		transitionFiringExprEClass.getESuperTypes().add(this.getDynamicPredicateExpr());
		predicateExprEClass.getESuperTypes().add(theMtctlPackage.getExpression());
		dynamicPredicateExprEClass.getESuperTypes().add(this.getPredicateExpr());
		staticPredicateExprEClass.getESuperTypes().add(this.getPredicateExpr());
		trueExprEClass.getESuperTypes().add(this.getStaticPredicateExpr());
		falseExprEClass.getESuperTypes().add(this.getStaticPredicateExpr());
		stateInStatechartExprEClass.getESuperTypes().add(this.getStaticPredicateExpr());

		// Initialize classes, features, and operations; add parameters
		initEClass(deadlockExprEClass, DeadlockExpr.class, "DeadlockExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bufferOverflowExprEClass, BufferOverflowExpr.class, "BufferOverflowExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(comparisonExprEClass, ComparisonExpr.class, "ComparisonExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparisonExpr_Lhs(), theComparablesPackage.getMapExpr(), null, "lhs", null, 0, 1, ComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonExpr_Op(), this.getComparisonOp(), "op", null, 0, 1, ComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonExpr_Rhs(), theComparablesPackage.getMapExpr(), null, "rhs", null, 0, 1, ComparisonExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageInBufferExprEClass, MessageInBufferExpr.class, "MessageInBufferExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageInBufferExpr_Buffer(), theComparablesPackage.getMapExpr(), null, "buffer", null, 0, 1, MessageInBufferExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageInBufferExpr_Message(), theComparablesPackage.getMapExpr(), null, "message", null, 0, 1, MessageInBufferExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageInTransitExprEClass, MessageInTransitExpr.class, "MessageInTransitExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageInTransitExpr_Message(), theComparablesPackage.getMapExpr(), null, "message", null, 0, 1, MessageInTransitExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateActiveExprEClass, StateActiveExpr.class, "StateActiveExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateActiveExpr_State(), theComparablesPackage.getMapExpr(), null, "state", null, 0, 1, StateActiveExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substateOfExprEClass, SubstateOfExpr.class, "SubstateOfExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstateOfExpr_Superstate(), theComparablesPackage.getMapExpr(), null, "superstate", null, 0, 1, SubstateOfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstateOfExpr_State(), theComparablesPackage.getMapExpr(), null, "state", null, 0, 1, SubstateOfExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionFiringExprEClass, TransitionFiringExpr.class, "TransitionFiringExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionFiringExpr_Transition(), theComparablesPackage.getMapExpr(), null, "transition", null, 0, 1, TransitionFiringExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateExprEClass, PredicateExpr.class, "PredicateExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicPredicateExprEClass, DynamicPredicateExpr.class, "DynamicPredicateExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticPredicateExprEClass, StaticPredicateExpr.class, "StaticPredicateExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trueExprEClass, TrueExpr.class, "TrueExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falseExprEClass, FalseExpr.class, "FalseExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateInStatechartExprEClass, StateInStatechartExpr.class, "StateInStatechartExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateInStatechartExpr_State(), theComparablesPackage.getMapExpr(), null, "state", null, 0, 1, StateInStatechartExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateInStatechartExpr_Statechart(), theComparablesPackage.getMapExpr(), null, "statechart", null, 0, 1, StateInStatechartExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparisonOpEEnum, ComparisonOp.class, "ComparisonOp");
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.EQUALS);
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.GREATER);
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.GREATER_OR_EQUAL);
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.LESS);
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.LESS_OR_EQUAL);
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.NOT_EQUAL);
	}

} //PredicatesPackageImpl
