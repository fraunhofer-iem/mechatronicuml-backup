/**
 */
package de.uni_paderborn.fujaba.graphviz.plain;

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
 * This package provides classes for the "plain" output format.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainFactory
 * @model kind="package"
 * @generated
 */
public interface PlainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "plain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/graphviz/plain/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "plain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlainPackage eINSTANCE = de.uni_paderborn.fujaba.graphviz.plain.impl.PlainPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.graphviz.plain.impl.PlainGraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainGraphImpl
	 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainPackageImpl#getPlainGraph()
	 * @generated
	 */
	int PLAIN_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_GRAPH__NODES = CommonPackage.GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_GRAPH__EDGES = CommonPackage.GRAPH__EDGES;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_GRAPH__SCALE = CommonPackage.GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_GRAPH__WIDTH = CommonPackage.GRAPH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_GRAPH__HEIGHT = CommonPackage.GRAPH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_GRAPH_FEATURE_COUNT = CommonPackage.GRAPH_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_GRAPH_OPERATION_COUNT = CommonPackage.GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.graphviz.plain.impl.PlainNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainNodeImpl
	 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainPackageImpl#getPlainNode()
	 * @generated
	 */
	int PLAIN_NODE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE__ANNOTATION = CommonPackage.NODE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE__EXTENSION = CommonPackage.NODE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE__NAME = CommonPackage.NODE__NAME;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE__WIDTH = CommonPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE__HEIGHT = CommonPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE__POSITION = CommonPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE_FEATURE_COUNT = CommonPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___ECLASS = CommonPackage.NODE___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___EIS_PROXY = CommonPackage.NODE___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___ERESOURCE = CommonPackage.NODE___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___ECONTAINER = CommonPackage.NODE___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___ECONTAINING_FEATURE = CommonPackage.NODE___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___ECONTAINMENT_FEATURE = CommonPackage.NODE___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___ECONTENTS = CommonPackage.NODE___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___EALL_CONTENTS = CommonPackage.NODE___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___ECROSS_REFERENCES = CommonPackage.NODE___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___EGET__ESTRUCTURALFEATURE = CommonPackage.NODE___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN = CommonPackage.NODE___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___ESET__ESTRUCTURALFEATURE_OBJECT = CommonPackage.NODE___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___EIS_SET__ESTRUCTURALFEATURE = CommonPackage.NODE___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___EUNSET__ESTRUCTURALFEATURE = CommonPackage.NODE___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___EINVOKE__EOPERATION_ELIST = CommonPackage.NODE___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___GET_EXTENSION__ECLASS = CommonPackage.NODE___GET_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Provide Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___PROVIDE_EXTENSION__ECLASS = CommonPackage.NODE___PROVIDE_EXTENSION__ECLASS;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___GET_ANNOTATION__STRING = CommonPackage.NODE___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Provide Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___PROVIDE_ANNOTATION__STRING = CommonPackage.NODE___PROVIDE_ANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE_OPERATION_COUNT = CommonPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.graphviz.plain.impl.PlainEdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainEdgeImpl
	 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainPackageImpl#getPlainEdge()
	 * @generated
	 */
	int PLAIN_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EDGE__SOURCE = CommonPackage.EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EDGE__TARGET = CommonPackage.EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Spline Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EDGE__SPLINE_POINTS = CommonPackage.EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EDGE_FEATURE_COUNT = CommonPackage.EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_EDGE_OPERATION_COUNT = CommonPackage.EDGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainGraph
	 * @generated
	 */
	EClass getPlainGraph();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getScale()
	 * @see #getPlainGraph()
	 * @generated
	 */
	EAttribute getPlainGraph_Scale();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getWidth()
	 * @see #getPlainGraph()
	 * @generated
	 */
	EAttribute getPlainGraph_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainGraph#getHeight()
	 * @see #getPlainGraph()
	 * @generated
	 */
	EAttribute getPlainGraph_Height();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainNode
	 * @generated
	 */
	EClass getPlainNode();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainNode#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainNode#getWidth()
	 * @see #getPlainNode()
	 * @generated
	 */
	EAttribute getPlainNode_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainNode#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainNode#getHeight()
	 * @see #getPlainNode()
	 * @generated
	 */
	EAttribute getPlainNode_Height();

	/**
	 * Returns the meta object for the containment reference '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainNode#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainNode#getPosition()
	 * @see #getPlainNode()
	 * @generated
	 */
	EReference getPlainNode_Position();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainEdge
	 * @generated
	 */
	EClass getPlainEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.graphviz.plain.PlainEdge#getSplinePoints <em>Spline Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spline Points</em>'.
	 * @see de.uni_paderborn.fujaba.graphviz.plain.PlainEdge#getSplinePoints()
	 * @see #getPlainEdge()
	 * @generated
	 */
	EReference getPlainEdge_SplinePoints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlainFactory getPlainFactory();

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
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.graphviz.plain.impl.PlainGraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainGraphImpl
		 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainPackageImpl#getPlainGraph()
		 * @generated
		 */
		EClass PLAIN_GRAPH = eINSTANCE.getPlainGraph();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_GRAPH__SCALE = eINSTANCE.getPlainGraph_Scale();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_GRAPH__WIDTH = eINSTANCE.getPlainGraph_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_GRAPH__HEIGHT = eINSTANCE.getPlainGraph_Height();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.graphviz.plain.impl.PlainNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainNodeImpl
		 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainPackageImpl#getPlainNode()
		 * @generated
		 */
		EClass PLAIN_NODE = eINSTANCE.getPlainNode();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_NODE__WIDTH = eINSTANCE.getPlainNode_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_NODE__HEIGHT = eINSTANCE.getPlainNode_Height();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_NODE__POSITION = eINSTANCE.getPlainNode_Position();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.graphviz.plain.impl.PlainEdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainEdgeImpl
		 * @see de.uni_paderborn.fujaba.graphviz.plain.impl.PlainPackageImpl#getPlainEdge()
		 * @generated
		 */
		EClass PLAIN_EDGE = eINSTANCE.getPlainEdge();

		/**
		 * The meta object literal for the '<em><b>Spline Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_EDGE__SPLINE_POINTS = eINSTANCE.getPlainEdge_SplinePoints();

	}

} //PlainPackage
