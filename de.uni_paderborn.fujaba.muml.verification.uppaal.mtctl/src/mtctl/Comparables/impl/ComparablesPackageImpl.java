/**
 */
package mtctl.Comparables.impl;

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

import mtctl.Comparables.BufferMsgCountExpr;
import mtctl.Comparables.ComparablesFactory;
import mtctl.Comparables.ComparablesPackage;
import mtctl.Comparables.ConstExpr;
import mtctl.Comparables.DynamicMapExpr;
import mtctl.Comparables.MapExpr;
import mtctl.Comparables.PrimitiveVariableExpr;

import mtctl.Comparables.StaticMapExpr;
import mtctl.MtctlPackage;

import mtctl.Predicates.PredicatesPackage;

import mtctl.Predicates.impl.PredicatesPackageImpl;

import mtctl.Quantifiers.QuantifiersPackage;

import mtctl.Quantifiers.impl.QuantifiersPackageImpl;

import mtctl.Sets.SetsPackage;

import mtctl.Sets.impl.SetsPackageImpl;

import mtctl.impl.MtctlPackageImpl;

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
	private EClass primitiveVariableExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticMapExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicMapExprEClass = null;

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
	 * @see mtctl.Comparables.ComparablesPackage#eNS_URI
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
	public EClass getMapExpr() {
		return mapExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveVariableExpr() {
		return primitiveVariableExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveVariableExpr_Var() {
		return (EReference)primitiveVariableExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticMapExpr() {
		return staticMapExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicMapExpr() {
		return dynamicMapExprEClass;
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

		mapExprEClass = createEClass(MAP_EXPR);

		primitiveVariableExprEClass = createEClass(PRIMITIVE_VARIABLE_EXPR);
		createEReference(primitiveVariableExprEClass, PRIMITIVE_VARIABLE_EXPR__VAR);

		staticMapExprEClass = createEClass(STATIC_MAP_EXPR);

		dynamicMapExprEClass = createEClass(DYNAMIC_MAP_EXPR);
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
		bufferMsgCountExprEClass.getESuperTypes().add(this.getDynamicMapExpr());
		constExprEClass.getESuperTypes().add(this.getStaticMapExpr());
		mapExprEClass.getESuperTypes().add(theMtctlPackage.getExpression());
		primitiveVariableExprEClass.getESuperTypes().add(this.getDynamicMapExpr());
		staticMapExprEClass.getESuperTypes().add(this.getMapExpr());
		dynamicMapExprEClass.getESuperTypes().add(this.getMapExpr());

		// Initialize classes, features, and operations; add parameters
		initEClass(bufferMsgCountExprEClass, BufferMsgCountExpr.class, "BufferMsgCountExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBufferMsgCountExpr_Buffer(), ecorePackage.getEObject(), null, "buffer", null, 0, 1, BufferMsgCountExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constExprEClass, ConstExpr.class, "ConstExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstExpr_Val(), ecorePackage.getEInt(), "val", null, 0, 1, ConstExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapExprEClass, MapExpr.class, "MapExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveVariableExprEClass, PrimitiveVariableExpr.class, "PrimitiveVariableExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveVariableExpr_Var(), ecorePackage.getEObject(), null, "var", null, 0, 1, PrimitiveVariableExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticMapExprEClass, StaticMapExpr.class, "StaticMapExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicMapExprEClass, DynamicMapExpr.class, "DynamicMapExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ComparablesPackageImpl
