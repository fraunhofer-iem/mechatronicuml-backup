/**
 */
package org.muml.graphviz.dot.impl;

import static org.muml.graphviz.dot.DotPackage.SETTING;

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
import org.muml.graphviz.dot.DirectedDotEdge;
import org.muml.graphviz.dot.DotEdge;
import org.muml.graphviz.dot.DotFactory;
import org.muml.graphviz.dot.DotGraph;
import org.muml.graphviz.dot.DotNode;
import org.muml.graphviz.dot.DotPackage;
import org.muml.graphviz.dot.Setting;
import org.muml.graphviz.dot.UndirectedDotEdge;
import org.muml.graphviz.impl.GraphvizPackageImpl;
import org.muml.graphviz.plain.PlainPackage;
import org.muml.graphviz.plain.impl.PlainPackageImpl;
import org.muml.graphviz.util.UtilPackage;
import org.muml.graphviz.util.impl.UtilPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DotPackageImpl extends EPackageImpl implements DotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedDotEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undirectedDotEdgeEClass = null;

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
	 * @see org.muml.graphviz.dot.DotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DotPackageImpl() {
		super(eNS_URI, DotFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DotPackage init() {
		if (isInited) return (DotPackage)EPackage.Registry.INSTANCE.getEPackage(DotPackage.eNS_URI);

		// Obtain or create and register package
		DotPackageImpl theDotPackage = (DotPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DotPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DotPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GraphvizPackageImpl theGraphvizPackage = (GraphvizPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphvizPackage.eNS_URI) instanceof GraphvizPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphvizPackage.eNS_URI) : GraphvizPackage.eINSTANCE);
		PlainPackageImpl thePlainPackage = (PlainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlainPackage.eNS_URI) instanceof PlainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlainPackage.eNS_URI) : PlainPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theDotPackage.createPackageContents();
		theGraphvizPackage.createPackageContents();
		thePlainPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theDotPackage.initializePackageContents();
		theGraphvizPackage.initializePackageContents();
		thePlainPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDotPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DotPackage.eNS_URI, theDotPackage);
		return theDotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotGraph() {
		return dotGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDotGraph_DirectedGraph() {
		return (EAttribute)dotGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotGraph_Subgraphs() {
		return (EReference)dotGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotGraph_ParentGraph() {
		return (EReference)dotGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotGraph_GraphSettings() {
		return (EReference)dotGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotGraph_NodeSettings() {
		return (EReference)dotGraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotGraph_EdgeSettings() {
		return (EReference)dotGraphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDotGraph_Id() {
		return (EAttribute)dotGraphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDotGraph_Cluster() {
		return (EAttribute)dotGraphEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotNode() {
		return dotNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotNode_Settings() {
		return (EReference)dotNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotEdge() {
		return dotEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotEdge_Settings() {
		return (EReference)dotEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetting() {
		return settingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetting_Attribute() {
		return (EAttribute)settingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetting_Value() {
		return (EAttribute)settingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedDotEdge() {
		return directedDotEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUndirectedDotEdge() {
		return undirectedDotEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotFactory getDotFactory() {
		return (DotFactory)getEFactoryInstance();
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
		dotGraphEClass = createEClass(DOT_GRAPH);
		createEAttribute(dotGraphEClass, DOT_GRAPH__DIRECTED_GRAPH);
		createEReference(dotGraphEClass, DOT_GRAPH__SUBGRAPHS);
		createEReference(dotGraphEClass, DOT_GRAPH__PARENT_GRAPH);
		createEReference(dotGraphEClass, DOT_GRAPH__GRAPH_SETTINGS);
		createEReference(dotGraphEClass, DOT_GRAPH__NODE_SETTINGS);
		createEReference(dotGraphEClass, DOT_GRAPH__EDGE_SETTINGS);
		createEAttribute(dotGraphEClass, DOT_GRAPH__ID);
		createEAttribute(dotGraphEClass, DOT_GRAPH__CLUSTER);

		dotNodeEClass = createEClass(DOT_NODE);
		createEReference(dotNodeEClass, DOT_NODE__SETTINGS);

		dotEdgeEClass = createEClass(DOT_EDGE);
		createEReference(dotEdgeEClass, DOT_EDGE__SETTINGS);

		settingEClass = createEClass(SETTING);
		createEAttribute(settingEClass, SETTING__ATTRIBUTE);
		createEAttribute(settingEClass, SETTING__VALUE);

		directedDotEdgeEClass = createEClass(DIRECTED_DOT_EDGE);

		undirectedDotEdgeEClass = createEClass(UNDIRECTED_DOT_EDGE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theCommonPackage.getGraph());
		EGenericType g2 = createEGenericType(this.getDotNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getDotEdge());
		g1.getETypeArguments().add(g2);
		dotGraphEClass.getEGenericSuperTypes().add(g1);
		dotNodeEClass.getESuperTypes().add(theCommonPackage.getNode());
		g1 = createEGenericType(theCommonPackage.getEdge());
		g2 = createEGenericType(this.getDotNode());
		g1.getETypeArguments().add(g2);
		dotEdgeEClass.getEGenericSuperTypes().add(g1);
		directedDotEdgeEClass.getESuperTypes().add(this.getDotEdge());
		undirectedDotEdgeEClass.getESuperTypes().add(this.getDotEdge());

		// Initialize classes, features, and operations; add parameters
		initEClass(dotGraphEClass, DotGraph.class, "DotGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDotGraph_DirectedGraph(), ecorePackage.getEBoolean(), "directedGraph", "false", 1, 1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDotGraph_Subgraphs(), this.getDotGraph(), this.getDotGraph_ParentGraph(), "subgraphs", null, 0, -1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDotGraph_ParentGraph(), this.getDotGraph(), this.getDotGraph_Subgraphs(), "parentGraph", null, 0, 1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDotGraph_GraphSettings(), this.getSetting(), null, "graphSettings", null, 0, -1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDotGraph_NodeSettings(), this.getSetting(), null, "nodeSettings", null, 0, -1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDotGraph_EdgeSettings(), this.getSetting(), null, "edgeSettings", null, 0, -1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDotGraph_Id(), ecorePackage.getEString(), "id", "", 0, 1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDotGraph_Cluster(), ecorePackage.getEBoolean(), "cluster", "false", 1, 1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dotNodeEClass, DotNode.class, "DotNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDotNode_Settings(), this.getSetting(), null, "settings", null, 0, -1, DotNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dotEdgeEClass, DotEdge.class, "DotEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDotEdge_Settings(), this.getSetting(), null, "settings", null, 0, -1, DotEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settingEClass, Setting.class, "Setting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetting_Attribute(), ecorePackage.getEString(), "attribute", null, 1, 1, Setting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetting_Value(), ecorePackage.getEString(), "value", null, 1, 1, Setting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directedDotEdgeEClass, DirectedDotEdge.class, "DirectedDotEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(undirectedDotEdgeEClass, UndirectedDotEdge.class, "UndirectedDotEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //DotPackageImpl
