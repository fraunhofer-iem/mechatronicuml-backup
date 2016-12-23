/**
 */
package org.muml.graphviz.dot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.graphviz.common.CommonPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package provides classes for the graphviz "dot" format. The classes
 * can be used as a "dot" input as well as a "dot" output.
 * <!-- end-model-doc -->
 * @see org.muml.graphviz.dot.DotFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface DotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/graphviz/dot/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DotPackage eINSTANCE = org.muml.graphviz.dot.impl.DotPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.graphviz.dot.impl.DotGraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.graphviz.dot.impl.DotGraphImpl
	 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getDotGraph()
	 * @generated
	 */
	int DOT_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH__NODES = CommonPackage.GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH__EDGES = CommonPackage.GRAPH__EDGES;

	/**
	 * The feature id for the '<em><b>Directed Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH__DIRECTED_GRAPH = CommonPackage.GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subgraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH__SUBGRAPHS = CommonPackage.GRAPH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH__PARENT_GRAPH = CommonPackage.GRAPH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH__GRAPH_SETTINGS = CommonPackage.GRAPH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Node Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH__NODE_SETTINGS = CommonPackage.GRAPH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Edge Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH__EDGE_SETTINGS = CommonPackage.GRAPH_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH__ID = CommonPackage.GRAPH_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH__CLUSTER = CommonPackage.GRAPH_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH_FEATURE_COUNT = CommonPackage.GRAPH_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH_OPERATION_COUNT = CommonPackage.GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.graphviz.dot.impl.DotNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.graphviz.dot.impl.DotNodeImpl
	 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getDotNode()
	 * @generated
	 */
	int DOT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE__EXTENSIONS = CommonPackage.NODE__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE__NAME = CommonPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE__SETTINGS = CommonPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE_FEATURE_COUNT = CommonPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___GET_EXTENSION__ECLASS = CommonPackage.NODE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE_OPERATION_COUNT = CommonPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.graphviz.dot.impl.DotEdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.graphviz.dot.impl.DotEdgeImpl
	 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getDotEdge()
	 * @generated
	 */
	int DOT_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_EDGE__SOURCE = CommonPackage.EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_EDGE__TARGET = CommonPackage.EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_EDGE__SETTINGS = CommonPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_EDGE_FEATURE_COUNT = CommonPackage.EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_EDGE_OPERATION_COUNT = CommonPackage.EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.graphviz.dot.impl.SettingImpl <em>Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.graphviz.dot.impl.SettingImpl
	 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getSetting()
	 * @generated
	 */
	int SETTING = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.graphviz.dot.impl.DirectedDotEdgeImpl <em>Directed Dot Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.graphviz.dot.impl.DirectedDotEdgeImpl
	 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getDirectedDotEdge()
	 * @generated
	 */
	int DIRECTED_DOT_EDGE = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_DOT_EDGE__SOURCE = DOT_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_DOT_EDGE__TARGET = DOT_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_DOT_EDGE__SETTINGS = DOT_EDGE__SETTINGS;

	/**
	 * The number of structural features of the '<em>Directed Dot Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_DOT_EDGE_FEATURE_COUNT = DOT_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Directed Dot Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_DOT_EDGE_OPERATION_COUNT = DOT_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.graphviz.dot.impl.UndirectedDotEdgeImpl <em>Undirected Dot Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.graphviz.dot.impl.UndirectedDotEdgeImpl
	 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getUndirectedDotEdge()
	 * @generated
	 */
	int UNDIRECTED_DOT_EDGE = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_DOT_EDGE__SOURCE = DOT_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_DOT_EDGE__TARGET = DOT_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_DOT_EDGE__SETTINGS = DOT_EDGE__SETTINGS;

	/**
	 * The number of structural features of the '<em>Undirected Dot Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_DOT_EDGE_FEATURE_COUNT = DOT_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Undirected Dot Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDIRECTED_DOT_EDGE_OPERATION_COUNT = DOT_EDGE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.muml.graphviz.dot.DotGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see org.muml.graphviz.dot.DotGraph
	 * @generated
	 */
	EClass getDotGraph();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.graphviz.dot.DotGraph#isDirectedGraph <em>Directed Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directed Graph</em>'.
	 * @see org.muml.graphviz.dot.DotGraph#isDirectedGraph()
	 * @see #getDotGraph()
	 * @generated
	 */
	EAttribute getDotGraph_DirectedGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.graphviz.dot.DotGraph#getSubgraphs <em>Subgraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgraphs</em>'.
	 * @see org.muml.graphviz.dot.DotGraph#getSubgraphs()
	 * @see #getDotGraph()
	 * @generated
	 */
	EReference getDotGraph_Subgraphs();

	/**
	 * Returns the meta object for the container reference '{@link org.muml.graphviz.dot.DotGraph#getParentGraph <em>Parent Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Graph</em>'.
	 * @see org.muml.graphviz.dot.DotGraph#getParentGraph()
	 * @see #getDotGraph()
	 * @generated
	 */
	EReference getDotGraph_ParentGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.graphviz.dot.DotGraph#getGraphSettings <em>Graph Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graph Settings</em>'.
	 * @see org.muml.graphviz.dot.DotGraph#getGraphSettings()
	 * @see #getDotGraph()
	 * @generated
	 */
	EReference getDotGraph_GraphSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.graphviz.dot.DotGraph#getNodeSettings <em>Node Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Settings</em>'.
	 * @see org.muml.graphviz.dot.DotGraph#getNodeSettings()
	 * @see #getDotGraph()
	 * @generated
	 */
	EReference getDotGraph_NodeSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.graphviz.dot.DotGraph#getEdgeSettings <em>Edge Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge Settings</em>'.
	 * @see org.muml.graphviz.dot.DotGraph#getEdgeSettings()
	 * @see #getDotGraph()
	 * @generated
	 */
	EReference getDotGraph_EdgeSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.graphviz.dot.DotGraph#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.muml.graphviz.dot.DotGraph#getId()
	 * @see #getDotGraph()
	 * @generated
	 */
	EAttribute getDotGraph_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.graphviz.dot.DotGraph#isCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster</em>'.
	 * @see org.muml.graphviz.dot.DotGraph#isCluster()
	 * @see #getDotGraph()
	 * @generated
	 */
	EAttribute getDotGraph_Cluster();

	/**
	 * Returns the meta object for class '{@link org.muml.graphviz.dot.DotNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.muml.graphviz.dot.DotNode
	 * @generated
	 */
	EClass getDotNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.graphviz.dot.DotNode#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see org.muml.graphviz.dot.DotNode#getSettings()
	 * @see #getDotNode()
	 * @generated
	 */
	EReference getDotNode_Settings();

	/**
	 * Returns the meta object for class '{@link org.muml.graphviz.dot.DotEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.muml.graphviz.dot.DotEdge
	 * @generated
	 */
	EClass getDotEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.graphviz.dot.DotEdge#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see org.muml.graphviz.dot.DotEdge#getSettings()
	 * @see #getDotEdge()
	 * @generated
	 */
	EReference getDotEdge_Settings();

	/**
	 * Returns the meta object for class '{@link org.muml.graphviz.dot.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting</em>'.
	 * @see org.muml.graphviz.dot.Setting
	 * @generated
	 */
	EClass getSetting();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.graphviz.dot.Setting#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see org.muml.graphviz.dot.Setting#getAttribute()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.graphviz.dot.Setting#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.muml.graphviz.dot.Setting#getValue()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Value();

	/**
	 * Returns the meta object for class '{@link org.muml.graphviz.dot.DirectedDotEdge <em>Directed Dot Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Dot Edge</em>'.
	 * @see org.muml.graphviz.dot.DirectedDotEdge
	 * @generated
	 */
	EClass getDirectedDotEdge();

	/**
	 * Returns the meta object for class '{@link org.muml.graphviz.dot.UndirectedDotEdge <em>Undirected Dot Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undirected Dot Edge</em>'.
	 * @see org.muml.graphviz.dot.UndirectedDotEdge
	 * @generated
	 */
	EClass getUndirectedDotEdge();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DotFactory getDotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.graphviz.dot.impl.DotGraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.graphviz.dot.impl.DotGraphImpl
		 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getDotGraph()
		 * @generated
		 */
		EClass DOT_GRAPH = eINSTANCE.getDotGraph();

		/**
		 * The meta object literal for the '<em><b>Directed Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOT_GRAPH__DIRECTED_GRAPH = eINSTANCE.getDotGraph_DirectedGraph();

		/**
		 * The meta object literal for the '<em><b>Subgraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_GRAPH__SUBGRAPHS = eINSTANCE.getDotGraph_Subgraphs();

		/**
		 * The meta object literal for the '<em><b>Parent Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_GRAPH__PARENT_GRAPH = eINSTANCE.getDotGraph_ParentGraph();

		/**
		 * The meta object literal for the '<em><b>Graph Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_GRAPH__GRAPH_SETTINGS = eINSTANCE.getDotGraph_GraphSettings();

		/**
		 * The meta object literal for the '<em><b>Node Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_GRAPH__NODE_SETTINGS = eINSTANCE.getDotGraph_NodeSettings();

		/**
		 * The meta object literal for the '<em><b>Edge Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_GRAPH__EDGE_SETTINGS = eINSTANCE.getDotGraph_EdgeSettings();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOT_GRAPH__ID = eINSTANCE.getDotGraph_Id();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOT_GRAPH__CLUSTER = eINSTANCE.getDotGraph_Cluster();

		/**
		 * The meta object literal for the '{@link org.muml.graphviz.dot.impl.DotNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.graphviz.dot.impl.DotNodeImpl
		 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getDotNode()
		 * @generated
		 */
		EClass DOT_NODE = eINSTANCE.getDotNode();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_NODE__SETTINGS = eINSTANCE.getDotNode_Settings();

		/**
		 * The meta object literal for the '{@link org.muml.graphviz.dot.impl.DotEdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.graphviz.dot.impl.DotEdgeImpl
		 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getDotEdge()
		 * @generated
		 */
		EClass DOT_EDGE = eINSTANCE.getDotEdge();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_EDGE__SETTINGS = eINSTANCE.getDotEdge_Settings();

		/**
		 * The meta object literal for the '{@link org.muml.graphviz.dot.impl.SettingImpl <em>Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.graphviz.dot.impl.SettingImpl
		 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getSetting()
		 * @generated
		 */
		EClass SETTING = eINSTANCE.getSetting();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING__ATTRIBUTE = eINSTANCE.getSetting_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING__VALUE = eINSTANCE.getSetting_Value();

		/**
		 * The meta object literal for the '{@link org.muml.graphviz.dot.impl.DirectedDotEdgeImpl <em>Directed Dot Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.graphviz.dot.impl.DirectedDotEdgeImpl
		 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getDirectedDotEdge()
		 * @generated
		 */
		EClass DIRECTED_DOT_EDGE = eINSTANCE.getDirectedDotEdge();

		/**
		 * The meta object literal for the '{@link org.muml.graphviz.dot.impl.UndirectedDotEdgeImpl <em>Undirected Dot Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.graphviz.dot.impl.UndirectedDotEdgeImpl
		 * @see org.muml.graphviz.dot.impl.DotPackageImpl#getUndirectedDotEdge()
		 * @generated
		 */
		EClass UNDIRECTED_DOT_EDGE = eINSTANCE.getUndirectedDotEdge();

	}

} //DotPackage
