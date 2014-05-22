/**
 */
package de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.impl;

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

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.BufferMsgCountExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesFactory;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ConstExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MapExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.MumlElemExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.SourceStateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TargetStateExpr;
import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.TransitionMap;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.MtctlPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.PredicatesPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Predicates.impl.PredicatesPackageImpl;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.QuantifiersPackage;

import de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Quantifiers.impl.QuantifiersPackageImpl;

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
public class ComparablesPackageImpl extends EPackageImpl implements ComparablesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferMsgCountExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mumlElemExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceStateExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetStateExprEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.verification.uppaal.mtctl.Comparables.ComparablesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComparablesPackageImpl() {
		super(eNS_URI, ComparablesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComparablesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComparablesPackage init() {
		if (isInited) return (ComparablesPackage)EPackage.Registry.INSTANCE.getEPackage(ComparablesPackage.eNS_URI);

		// Obtain or create and register package
		ComparablesPackageImpl theComparablesPackage = (ComparablesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComparablesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComparablesPackageImpl());

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
		SetsPackageImpl theSetsPackage = (SetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI) instanceof SetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SetsPackage.eNS_URI) : SetsPackage.eINSTANCE);
		BooleanLogicPackageImpl theBooleanLogicPackage = (BooleanLogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI) instanceof BooleanLogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleanLogicPackage.eNS_URI) : BooleanLogicPackage.eINSTANCE);

		// Create package meta-data objects
		theComparablesPackage.createPackageContents();
		theMtctlPackage.createPackageContents();
		theQuantifiersPackage.createPackageContents();
		thePredicatesPackage.createPackageContents();
		theSetsPackage.createPackageContents();
		theBooleanLogicPackage.createPackageContents();

		// Initialize created meta-data
		theComparablesPackage.initializePackageContents();
		theMtctlPackage.initializePackageContents();
		theQuantifiersPackage.initializePackageContents();
		thePredicatesPackage.initializePackageContents();
		theSetsPackage.initializePackageContents();
		theBooleanLogicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComparablesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComparablesPackage.eNS_URI, theComparablesPackage);
		return theComparablesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferMsgCountExpr() {
		return bufferMsgCountExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBufferMsgCountExpr_Buffer() {
		return (EReference)bufferMsgCountExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstExpr() {
		return constExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstExpr_Val() {
		return (EAttribute)constExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstExpr_TimeUnit() {
		return (EAttribute)constExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapExpr() {
		return mapExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMumlElemExpr() {
		return mumlElemExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMumlElemExpr_Elem() {
		return (EReference)mumlElemExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMumlElemExpr_ConnectorEndpointInstance() {
		return (EReference)mumlElemExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionMap() {
		return transitionMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionMap_Transition() {
		return (EReference)transitionMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceStateExpr() {
		return sourceStateExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetStateExpr() {
		return targetStateExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparablesFactory getComparablesFactory() {
		return (ComparablesFactory)getEFactoryInstance();
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
		bufferMsgCountExprEClass = createEClass(BUFFER_MSG_COUNT_EXPR);
		createEReference(bufferMsgCountExprEClass, BUFFER_MSG_COUNT_EXPR__BUFFER);

		constExprEClass = createEClass(CONST_EXPR);
		createEAttribute(constExprEClass, CONST_EXPR__VAL);
		createEAttribute(constExprEClass, CONST_EXPR__TIME_UNIT);

		mapExprEClass = createEClass(MAP_EXPR);

		mumlElemExprEClass = createEClass(MUML_ELEM_EXPR);
		createEReference(mumlElemExprEClass, MUML_ELEM_EXPR__ELEM);
		createEReference(mumlElemExprEClass, MUML_ELEM_EXPR__CONNECTOR_ENDPOINT_INSTANCE);

		transitionMapEClass = createEClass(TRANSITION_MAP);
		createEReference(transitionMapEClass, TRANSITION_MAP__TRANSITION);

		sourceStateExprEClass = createEClass(SOURCE_STATE_EXPR);

		targetStateExprEClass = createEClass(TARGET_STATE_EXPR);
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
		ValuetypePackage theValuetypePackage = (ValuetypePackage)EPackage.Registry.INSTANCE.getEPackage(ValuetypePackage.eNS_URI);
		MtctlPackage theMtctlPackage = (MtctlPackage)EPackage.Registry.INSTANCE.getEPackage(MtctlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bufferMsgCountExprEClass.getESuperTypes().add(this.getMapExpr());
		constExprEClass.getESuperTypes().add(this.getMapExpr());
		mapExprEClass.getESuperTypes().add(theMtctlPackage.getExpression());
		mumlElemExprEClass.getESuperTypes().add(this.getMapExpr());
		transitionMapEClass.getESuperTypes().add(this.getMapExpr());
		sourceStateExprEClass.getESuperTypes().add(this.getTransitionMap());
		targetStateExprEClass.getESuperTypes().add(this.getTransitionMap());

		// Initialize classes, features, and operations; add parameters
		initEClass(bufferMsgCountExprEClass, BufferMsgCountExpr.class, "BufferMsgCountExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBufferMsgCountExpr_Buffer(), this.getMapExpr(), null, "buffer", null, 0, 1, BufferMsgCountExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constExprEClass, ConstExpr.class, "ConstExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstExpr_Val(), ecorePackage.getEInt(), "val", null, 0, 1, ConstExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstExpr_TimeUnit(), theValuetypePackage.getTimeUnit(), "timeUnit", null, 0, 1, ConstExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapExprEClass, MapExpr.class, "MapExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mumlElemExprEClass, MumlElemExpr.class, "MumlElemExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMumlElemExpr_Elem(), ecorePackage.getEObject(), null, "elem", null, 0, 1, MumlElemExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMumlElemExpr_ConnectorEndpointInstance(), ecorePackage.getEObject(), null, "connectorEndpointInstance", null, 0, 1, MumlElemExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionMapEClass, TransitionMap.class, "TransitionMap", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionMap_Transition(), this.getMapExpr(), null, "transition", null, 0, 1, TransitionMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceStateExprEClass, SourceStateExpr.class, "SourceStateExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetStateExprEClass, TargetStateExpr.class, "TargetStateExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ComparablesPackageImpl
