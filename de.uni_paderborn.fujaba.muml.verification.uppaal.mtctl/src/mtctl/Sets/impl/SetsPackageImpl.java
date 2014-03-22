/**
 */
package mtctl.Sets.impl;

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

import mtctl.BooleanLogic.BooleanLogicPackage;

import mtctl.BooleanLogic.impl.BooleanLogicPackageImpl;

import mtctl.Comparables.ComparablesPackage;

import mtctl.Comparables.impl.ComparablesPackageImpl;

import mtctl.MtctlPackage;

import mtctl.Predicates.PredicatesPackage;

import mtctl.Predicates.impl.PredicatesPackageImpl;

import mtctl.Quantifiers.QuantifiersPackage;

import mtctl.Quantifiers.impl.QuantifiersPackageImpl;

import mtctl.Sets.ClockSetExpr;
import mtctl.Sets.IntervalSetExpr;
import mtctl.Sets.MessageSetExpr;
import mtctl.Sets.SetExpr;
import mtctl.Sets.SetsFactory;
import mtctl.Sets.SetsPackage;
import mtctl.Sets.StateSetExpr;
import mtctl.Sets.TransitionSetExpr;

import mtctl.impl.MtctlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetsPackageImpl extends EPackageImpl implements SetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockSetExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalSetExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSetExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateSetExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionSetExprEClass = null;

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
	 * @see mtctl.Sets.SetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SetsPackageImpl() {
		super(eNS_URI, SetsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SetsPackage init() {
		if (isInited) return (SetsPackage)EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI);

		// Obtain or create and register package
		SetsPackageImpl theSetsPackage = (SetsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SetsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SetsPackageImpl());

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
		PredicatesPackageImpl thePredicatesPackage = (PredicatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PredicatesPackage.eNS_URI) instanceof PredicatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PredicatesPackage.eNS_URI) : PredicatesPackage.eINSTANCE);
		BooleanLogicPackageImpl theBooleanLogicPackage = (BooleanLogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI) instanceof BooleanLogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI) : BooleanLogicPackage.eINSTANCE);
		ComparablesPackageImpl theComparablesPackage = (ComparablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI) instanceof ComparablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI) : ComparablesPackage.eINSTANCE);

		// Create package meta-data objects
		theSetsPackage.createPackageContents();
		theMtctlPackage.createPackageContents();
		theQuantifiersPackage.createPackageContents();
		thePredicatesPackage.createPackageContents();
		theBooleanLogicPackage.createPackageContents();
		theComparablesPackage.createPackageContents();

		// Initialize created meta-data
		theSetsPackage.initializePackageContents();
		theMtctlPackage.initializePackageContents();
		theQuantifiersPackage.initializePackageContents();
		thePredicatesPackage.initializePackageContents();
		theBooleanLogicPackage.initializePackageContents();
		theComparablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SetsPackage.eNS_URI, theSetsPackage);
		return theSetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetExpr() {
		return setExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockSetExpr() {
		return clockSetExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalSetExpr() {
		return intervalSetExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervalSetExpr_LowerVal() {
		return (EAttribute)intervalSetExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervalSetExpr_UpperVal() {
		return (EAttribute)intervalSetExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSetExpr() {
		return messageSetExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateSetExpr() {
		return stateSetExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionSetExpr() {
		return transitionSetExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetsFactory getSetsFactory() {
		return (SetsFactory)getEFactoryInstance();
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
		setExprEClass = createEClass(SET_EXPR);

		clockSetExprEClass = createEClass(CLOCK_SET_EXPR);

		intervalSetExprEClass = createEClass(INTERVAL_SET_EXPR);
		createEAttribute(intervalSetExprEClass, INTERVAL_SET_EXPR__LOWER_VAL);
		createEAttribute(intervalSetExprEClass, INTERVAL_SET_EXPR__UPPER_VAL);

		messageSetExprEClass = createEClass(MESSAGE_SET_EXPR);

		stateSetExprEClass = createEClass(STATE_SET_EXPR);

		transitionSetExprEClass = createEClass(TRANSITION_SET_EXPR);
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
		MtctlPackage theMtctlPackage = (MtctlPackage)EPackage.Registry.INSTANCE.getEPackage(MtctlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		setExprEClass.getESuperTypes().add(theMtctlPackage.getExpression());
		clockSetExprEClass.getESuperTypes().add(this.getSetExpr());
		intervalSetExprEClass.getESuperTypes().add(this.getSetExpr());
		messageSetExprEClass.getESuperTypes().add(this.getSetExpr());
		stateSetExprEClass.getESuperTypes().add(this.getSetExpr());
		transitionSetExprEClass.getESuperTypes().add(this.getSetExpr());

		// Initialize classes, features, and operations; add parameters
		initEClass(setExprEClass, SetExpr.class, "SetExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clockSetExprEClass, ClockSetExpr.class, "ClockSetExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalSetExprEClass, IntervalSetExpr.class, "IntervalSetExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervalSetExpr_LowerVal(), ecorePackage.getEInt(), "lowerVal", null, 0, 1, IntervalSetExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervalSetExpr_UpperVal(), ecorePackage.getEInt(), "upperVal", null, 0, 1, IntervalSetExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageSetExprEClass, MessageSetExpr.class, "MessageSetExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateSetExprEClass, StateSetExpr.class, "StateSetExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionSetExprEClass, TransitionSetExpr.class, "TransitionSetExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //SetsPackageImpl
