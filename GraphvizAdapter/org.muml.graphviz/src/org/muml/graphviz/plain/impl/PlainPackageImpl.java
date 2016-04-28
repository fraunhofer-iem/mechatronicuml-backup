/**
 */
package org.muml.graphviz.plain.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.graphviz.GraphvizPackage;
import org.muml.graphviz.common.CommonPackage;
import org.muml.graphviz.common.impl.CommonPackageImpl;
import org.muml.graphviz.dot.DotPackage;
import org.muml.graphviz.dot.impl.DotPackageImpl;
import org.muml.graphviz.impl.GraphvizPackageImpl;
import org.muml.graphviz.plain.PlainEdge;
import org.muml.graphviz.plain.PlainFactory;
import org.muml.graphviz.plain.PlainGraph;
import org.muml.graphviz.plain.PlainNode;
import org.muml.graphviz.plain.PlainPackage;
import org.muml.graphviz.util.UtilPackage;
import org.muml.graphviz.util.impl.UtilPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlainPackageImpl extends EPackageImpl implements PlainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainEdgeEClass = null;

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
	 * @see org.muml.graphviz.plain.PlainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlainPackageImpl() {
		super(eNS_URI, PlainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PlainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlainPackage init() {
		if (isInited) return (PlainPackage)EPackage.Registry.INSTANCE.getEPackage(PlainPackage.eNS_URI);

		// Obtain or create and register package
		PlainPackageImpl thePlainPackage = (PlainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlainPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GraphvizPackageImpl theGraphvizPackage = (GraphvizPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphvizPackage.eNS_URI) instanceof GraphvizPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphvizPackage.eNS_URI) : GraphvizPackage.eINSTANCE);
		DotPackageImpl theDotPackage = (DotPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DotPackage.eNS_URI) instanceof DotPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DotPackage.eNS_URI) : DotPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		thePlainPackage.createPackageContents();
		theGraphvizPackage.createPackageContents();
		theDotPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		thePlainPackage.initializePackageContents();
		theGraphvizPackage.initializePackageContents();
		theDotPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlainPackage.eNS_URI, thePlainPackage);
		return thePlainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainGraph() {
		return plainGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainGraph_Scale() {
		return (EAttribute)plainGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainGraph_Width() {
		return (EAttribute)plainGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainGraph_Height() {
		return (EAttribute)plainGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainNode() {
		return plainNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainNode_Width() {
		return (EAttribute)plainNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainNode_Height() {
		return (EAttribute)plainNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainNode_Position() {
		return (EReference)plainNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainEdge() {
		return plainEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainEdge_SplinePoints() {
		return (EReference)plainEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainFactory getPlainFactory() {
		return (PlainFactory)getEFactoryInstance();
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
		plainGraphEClass = createEClass(PLAIN_GRAPH);
		createEAttribute(plainGraphEClass, PLAIN_GRAPH__SCALE);
		createEAttribute(plainGraphEClass, PLAIN_GRAPH__WIDTH);
		createEAttribute(plainGraphEClass, PLAIN_GRAPH__HEIGHT);

		plainNodeEClass = createEClass(PLAIN_NODE);
		createEAttribute(plainNodeEClass, PLAIN_NODE__WIDTH);
		createEAttribute(plainNodeEClass, PLAIN_NODE__HEIGHT);
		createEReference(plainNodeEClass, PLAIN_NODE__POSITION);

		plainEdgeEClass = createEClass(PLAIN_EDGE);
		createEReference(plainEdgeEClass, PLAIN_EDGE__SPLINE_POINTS);
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
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theCommonPackage.getGraph());
		EGenericType g2 = createEGenericType(this.getPlainNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getPlainEdge());
		g1.getETypeArguments().add(g2);
		plainGraphEClass.getEGenericSuperTypes().add(g1);
		plainNodeEClass.getESuperTypes().add(theCommonPackage.getNode());
		g1 = createEGenericType(theCommonPackage.getEdge());
		g2 = createEGenericType(this.getPlainNode());
		g1.getETypeArguments().add(g2);
		plainEdgeEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(plainGraphEClass, PlainGraph.class, "PlainGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainGraph_Scale(), ecorePackage.getEDouble(), "scale", null, 1, 1, PlainGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainGraph_Width(), ecorePackage.getEDouble(), "width", null, 1, 1, PlainGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainGraph_Height(), ecorePackage.getEDouble(), "height", null, 1, 1, PlainGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainNodeEClass, PlainNode.class, "PlainNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainNode_Width(), ecorePackage.getEDouble(), "width", null, 1, 1, PlainNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainNode_Height(), ecorePackage.getEDouble(), "height", null, 1, 1, PlainNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainNode_Position(), theUtilPackage.getPoint(), null, "position", null, 1, 1, PlainNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainEdgeEClass, PlainEdge.class, "PlainEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlainEdge_SplinePoints(), theUtilPackage.getPoint(), null, "splinePoints", null, 0, -1, PlainEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PlainPackageImpl
