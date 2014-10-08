/**
 */
package de.uni_paderborn.fujaba.graphviz.dot;

import de.uni_paderborn.fujaba.graphviz.common.CommonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.uni_paderborn.fujaba.graphviz.dot.DotFactory
 * @model kind="package"
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
	String eNS_URI = "http://www.fujaba.de/graphviz/dot/0.1.0";

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
	DotPackage eINSTANCE = de.uni_paderborn.fujaba.graphviz.dot.impl.DotPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.graphviz.dot.impl.DotGraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotGraphImpl
	 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotPackageImpl#getDotGraph()
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
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH_FEATURE_COUNT = CommonPackage.GRAPH_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_GRAPH_OPERATION_COUNT = CommonPackage.GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.graphviz.dot.impl.DotNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotNodeImpl
	 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotPackageImpl#getDotNode()
	 * @generated
	 */
	int DOT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE__ANNOTATION = CommonPackage.NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE__EXTENSION = CommonPackage.NODE__EXTENSION;

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
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___ECLASS = CommonPackage.NODE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___EIS_PROXY = CommonPackage.NODE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___ERESOURCE = CommonPackage.NODE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___ECONTAINER = CommonPackage.NODE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___ECONTAINING_FEATURE = CommonPackage.NODE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___ECONTAINMENT_FEATURE = CommonPackage.NODE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___ECONTENTS = CommonPackage.NODE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___EALL_CONTENTS = CommonPackage.NODE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___ECROSS_REFERENCES = CommonPackage.NODE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___EGET__ESTRUCTURALFEATURE = CommonPackage.NODE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CommonPackage.NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = CommonPackage.NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___EIS_SET__ESTRUCTURALFEATURE = CommonPackage.NODE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___EUNSET__ESTRUCTURALFEATURE = CommonPackage.NODE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___EINVOKE__EOPERATION_ELIST = CommonPackage.NODE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___GET_EXTENSION__ECLASS = CommonPackage.NODE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___PROVIDE_EXTENSION__ECLASS = CommonPackage.NODE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___GET_ANNOTATION__STRING = CommonPackage.NODE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE___PROVIDE_ANNOTATION__STRING = CommonPackage.NODE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_NODE_OPERATION_COUNT = CommonPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.graphviz.dot.impl.DotEdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotEdgeImpl
	 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotPackageImpl#getDotEdge()
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
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.graphviz.dot.impl.SettingImpl <em>Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.SettingImpl
	 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotPackageImpl#getSetting()
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
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotGraph
	 * @generated
	 */
	EClass getDotGraph();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#isDirectedGraph <em>Directed Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directed Graph</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotGraph#isDirectedGraph()
	 * @see #getDotGraph()
	 * @generated
	 */
	EAttribute getDotGraph_DirectedGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getSubgraphs <em>Subgraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgraphs</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getSubgraphs()
	 * @see #getDotGraph()
	 * @generated
	 */
	EReference getDotGraph_Subgraphs();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getParentGraph <em>Parent Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Graph</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getParentGraph()
	 * @see #getDotGraph()
	 * @generated
	 */
	EReference getDotGraph_ParentGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getGraphSettings <em>Graph Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graph Settings</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getGraphSettings()
	 * @see #getDotGraph()
	 * @generated
	 */
	EReference getDotGraph_GraphSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getNodeSettings <em>Node Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Settings</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getNodeSettings()
	 * @see #getDotGraph()
	 * @generated
	 */
	EReference getDotGraph_NodeSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getEdgeSettings <em>Edge Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge Settings</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getEdgeSettings()
	 * @see #getDotGraph()
	 * @generated
	 */
	EReference getDotGraph_EdgeSettings();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getId()
	 * @see #getDotGraph()
	 * @generated
	 */
	EAttribute getDotGraph_Id();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.graphviz.dot.DotNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotNode
	 * @generated
	 */
	EClass getDotNode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.graphviz.dot.DotNode#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotNode#getSettings()
	 * @see #getDotNode()
	 * @generated
	 */
	EReference getDotNode_Settings();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.graphviz.dot.DotEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotEdge
	 * @generated
	 */
	EClass getDotEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.graphviz.dot.DotEdge#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotEdge#getSettings()
	 * @see #getDotEdge()
	 * @generated
	 */
	EReference getDotEdge_Settings();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.graphviz.dot.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.Setting
	 * @generated
	 */
	EClass getSetting();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.graphviz.dot.Setting#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.Setting#getAttribute()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.graphviz.dot.Setting#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.Setting#getValue()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Value();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.graphviz.dot.impl.DotGraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotGraphImpl
		 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotPackageImpl#getDotGraph()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.graphviz.dot.impl.DotNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotNodeImpl
		 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotPackageImpl#getDotNode()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.graphviz.dot.impl.DotEdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotEdgeImpl
		 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotPackageImpl#getDotEdge()
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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.graphviz.dot.impl.SettingImpl <em>Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.SettingImpl
		 * @see de.uni_paderborn.fujaba.graphviz.dot.impl.DotPackageImpl#getSetting()
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

	}

} //DotPackage
