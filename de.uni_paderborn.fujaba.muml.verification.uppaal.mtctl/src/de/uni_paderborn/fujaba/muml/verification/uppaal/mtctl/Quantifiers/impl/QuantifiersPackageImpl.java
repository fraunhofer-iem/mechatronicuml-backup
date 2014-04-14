/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl;

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

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AFExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.AGExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.BoundVariable;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EFExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.EGExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.ExistenceQuantExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.LeadsToExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TemporalQuantifierExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.TimeIntervalExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.UniversalQuantExpr;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.SetsPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Sets.impl.SetsPackageImpl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.impl.MtctlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantifiersPackageImpl extends EPackageImpl implements QuantifiersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass efExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass egExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceQuantExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifierExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalQuantifierExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalQuantExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leadsToExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalExprEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuantifiersPackageImpl() {
		super(eNS_URI, QuantifiersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QuantifiersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuantifiersPackage init() {
		if (isInited) return (QuantifiersPackage)EPackage.Registry.INSTANCE.getEPackage(QuantifiersPackage.eNS_URI);

		// Obtain or create and register package
		QuantifiersPackageImpl theQuantifiersPackage = (QuantifiersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuantifiersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuantifiersPackageImpl());

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
		PredicatesPackageImpl thePredicatesPackage = (PredicatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PredicatesPackage.eNS_URI) instanceof PredicatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PredicatesPackage.eNS_URI) : PredicatesPackage.eINSTANCE);
		SetsPackageImpl theSetsPackage = (SetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI) instanceof SetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI) : SetsPackage.eINSTANCE);
		BooleanLogicPackageImpl theBooleanLogicPackage = (BooleanLogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI) instanceof BooleanLogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI) : BooleanLogicPackage.eINSTANCE);
		ComparablesPackageImpl theComparablesPackage = (ComparablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI) instanceof ComparablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI) : ComparablesPackage.eINSTANCE);

		// Create package meta-data objects
		theQuantifiersPackage.createPackageContents();
		theMtctlPackage.createPackageContents();
		thePredicatesPackage.createPackageContents();
		theSetsPackage.createPackageContents();
		theBooleanLogicPackage.createPackageContents();
		theComparablesPackage.createPackageContents();

		// Initialize created meta-data
		theQuantifiersPackage.initializePackageContents();
		theMtctlPackage.initializePackageContents();
		thePredicatesPackage.initializePackageContents();
		theSetsPackage.initializePackageContents();
		theBooleanLogicPackage.initializePackageContents();
		theComparablesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuantifiersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuantifiersPackage.eNS_URI, theQuantifiersPackage);
		return theQuantifiersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFExpr() {
		return afExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFExpr_Expr() {
		return (EReference)afExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAGExpr() {
		return agExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAGExpr_Expr() {
		return (EReference)agExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFExpr() {
		return efExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFExpr_Expr() {
		return (EReference)efExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGExpr() {
		return egExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGExpr_Expr() {
		return (EReference)egExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistenceQuantExpr() {
		return existenceQuantExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifierExpr() {
		return quantifierExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifierExpr_Formula() {
		return (EReference)quantifierExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifierExpr_Var() {
		return (EReference)quantifierExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundVariable() {
		return boundVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundVariable_Set() {
		return (EReference)boundVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundVariable_Name() {
		return (EAttribute)boundVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalQuantifierExpr() {
		return temporalQuantifierExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversalQuantExpr() {
		return universalQuantExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeadsToExpr() {
		return leadsToExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeadsToExpr_LeftOpd() {
		return (EReference)leadsToExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeadsToExpr_RightOpd() {
		return (EReference)leadsToExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeIntervalExpr() {
		return timeIntervalExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeIntervalExpr_Lhs() {
		return (EReference)timeIntervalExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeIntervalExpr_Lower() {
		return (EAttribute)timeIntervalExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeIntervalExpr_Upper() {
		return (EAttribute)timeIntervalExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeIntervalExpr_Rhs() {
		return (EReference)timeIntervalExprEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiersFactory getQuantifiersFactory() {
		return (QuantifiersFactory)getEFactoryInstance();
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
		afExprEClass = createEClass(AF_EXPR);
		createEReference(afExprEClass, AF_EXPR__EXPR);

		agExprEClass = createEClass(AG_EXPR);
		createEReference(agExprEClass, AG_EXPR__EXPR);

		efExprEClass = createEClass(EF_EXPR);
		createEReference(efExprEClass, EF_EXPR__EXPR);

		egExprEClass = createEClass(EG_EXPR);
		createEReference(egExprEClass, EG_EXPR__EXPR);

		existenceQuantExprEClass = createEClass(EXISTENCE_QUANT_EXPR);

		quantifierExprEClass = createEClass(QUANTIFIER_EXPR);
		createEReference(quantifierExprEClass, QUANTIFIER_EXPR__FORMULA);
		createEReference(quantifierExprEClass, QUANTIFIER_EXPR__VAR);

		boundVariableEClass = createEClass(BOUND_VARIABLE);
		createEReference(boundVariableEClass, BOUND_VARIABLE__SET);
		createEAttribute(boundVariableEClass, BOUND_VARIABLE__NAME);

		temporalQuantifierExprEClass = createEClass(TEMPORAL_QUANTIFIER_EXPR);

		universalQuantExprEClass = createEClass(UNIVERSAL_QUANT_EXPR);

		leadsToExprEClass = createEClass(LEADS_TO_EXPR);
		createEReference(leadsToExprEClass, LEADS_TO_EXPR__LEFT_OPD);
		createEReference(leadsToExprEClass, LEADS_TO_EXPR__RIGHT_OPD);

		timeIntervalExprEClass = createEClass(TIME_INTERVAL_EXPR);
		createEReference(timeIntervalExprEClass, TIME_INTERVAL_EXPR__LHS);
		createEAttribute(timeIntervalExprEClass, TIME_INTERVAL_EXPR__LOWER);
		createEAttribute(timeIntervalExprEClass, TIME_INTERVAL_EXPR__UPPER);
		createEReference(timeIntervalExprEClass, TIME_INTERVAL_EXPR__RHS);
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
		SetsPackage theSetsPackage = (SetsPackage)EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		afExprEClass.getESuperTypes().add(this.getTemporalQuantifierExpr());
		agExprEClass.getESuperTypes().add(this.getTemporalQuantifierExpr());
		efExprEClass.getESuperTypes().add(this.getTemporalQuantifierExpr());
		egExprEClass.getESuperTypes().add(this.getTemporalQuantifierExpr());
		existenceQuantExprEClass.getESuperTypes().add(this.getQuantifierExpr());
		quantifierExprEClass.getESuperTypes().add(theMtctlPackage.getExpression());
		boundVariableEClass.getESuperTypes().add(theMtctlPackage.getExpression());
		temporalQuantifierExprEClass.getESuperTypes().add(theMtctlPackage.getExpression());
		universalQuantExprEClass.getESuperTypes().add(this.getQuantifierExpr());
		leadsToExprEClass.getESuperTypes().add(this.getTemporalQuantifierExpr());
		timeIntervalExprEClass.getESuperTypes().add(this.getTemporalQuantifierExpr());

		// Initialize classes, features, and operations; add parameters
		initEClass(afExprEClass, AFExpr.class, "AFExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAFExpr_Expr(), theMtctlPackage.getExpression(), null, "expr", null, 0, 1, AFExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agExprEClass, AGExpr.class, "AGExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAGExpr_Expr(), theMtctlPackage.getExpression(), null, "expr", null, 0, 1, AGExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(efExprEClass, EFExpr.class, "EFExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEFExpr_Expr(), theMtctlPackage.getExpression(), null, "expr", null, 0, 1, EFExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(egExprEClass, EGExpr.class, "EGExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEGExpr_Expr(), theMtctlPackage.getExpression(), null, "expr", null, 0, 1, EGExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existenceQuantExprEClass, ExistenceQuantExpr.class, "ExistenceQuantExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantifierExprEClass, QuantifierExpr.class, "QuantifierExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifierExpr_Formula(), theMtctlPackage.getExpression(), null, "formula", null, 0, 1, QuantifierExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifierExpr_Var(), this.getBoundVariable(), null, "var", null, 0, 1, QuantifierExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundVariableEClass, BoundVariable.class, "BoundVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundVariable_Set(), theSetsPackage.getSetExpr(), null, "set", null, 0, 1, BoundVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, BoundVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalQuantifierExprEClass, TemporalQuantifierExpr.class, "TemporalQuantifierExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(universalQuantExprEClass, UniversalQuantExpr.class, "UniversalQuantExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leadsToExprEClass, LeadsToExpr.class, "LeadsToExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeadsToExpr_LeftOpd(), theMtctlPackage.getExpression(), null, "leftOpd", null, 0, 1, LeadsToExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeadsToExpr_RightOpd(), theMtctlPackage.getExpression(), null, "rightOpd", null, 0, 1, LeadsToExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeIntervalExprEClass, TimeIntervalExpr.class, "TimeIntervalExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeIntervalExpr_Lhs(), theMtctlPackage.getExpression(), null, "lhs", null, 0, 1, TimeIntervalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeIntervalExpr_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, TimeIntervalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeIntervalExpr_Upper(), ecorePackage.getEInt(), "upper", null, 0, 1, TimeIntervalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeIntervalExpr_Rhs(), theMtctlPackage.getExpression(), null, "rhs", null, 0, 1, TimeIntervalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //QuantifiersPackageImpl
