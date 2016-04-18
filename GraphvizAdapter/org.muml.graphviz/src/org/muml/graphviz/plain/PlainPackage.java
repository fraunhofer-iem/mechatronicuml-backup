/**
 */
package org.muml.graphviz.plain;

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
 * This package provides classes for the "plain" output format.
 * <!-- end-model-doc -->
 * @see org.muml.graphviz.plain.PlainFactory
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
	String eNS_URI = "http://www.muml.org/graphviz/plain/1.0.0";

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
	PlainPackage eINSTANCE = org.muml.graphviz.plain.impl.PlainPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.graphviz.plain.impl.PlainGraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.graphviz.plain.impl.PlainGraphImpl
	 * @see org.muml.graphviz.plain.impl.PlainPackageImpl#getPlainGraph()
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
	 * The meta object id for the '{@link org.muml.graphviz.plain.impl.PlainNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.graphviz.plain.impl.PlainNodeImpl
	 * @see org.muml.graphviz.plain.impl.PlainPackageImpl#getPlainNode()
	 * @generated
	 */
	int PLAIN_NODE = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE__EXTENSIONS = CommonPackage.NODE__EXTENSIONS;

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
	 * The operation id for the '<em>Get Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE___GET_EXTENSION__ECLASS = CommonPackage.NODE___GET_EXTENSION__ECLASS;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_NODE_OPERATION_COUNT = CommonPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.muml.graphviz.plain.impl.PlainEdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.graphviz.plain.impl.PlainEdgeImpl
	 * @see org.muml.graphviz.plain.impl.PlainPackageImpl#getPlainEdge()
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
	 * Returns the meta object for class '{@link org.muml.graphviz.plain.PlainGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see org.muml.graphviz.plain.PlainGraph
	 * @generated
	 */
	EClass getPlainGraph();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.graphviz.plain.PlainGraph#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.muml.graphviz.plain.PlainGraph#getScale()
	 * @see #getPlainGraph()
	 * @generated
	 */
	EAttribute getPlainGraph_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.graphviz.plain.PlainGraph#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.muml.graphviz.plain.PlainGraph#getWidth()
	 * @see #getPlainGraph()
	 * @generated
	 */
	EAttribute getPlainGraph_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.graphviz.plain.PlainGraph#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.muml.graphviz.plain.PlainGraph#getHeight()
	 * @see #getPlainGraph()
	 * @generated
	 */
	EAttribute getPlainGraph_Height();

	/**
	 * Returns the meta object for class '{@link org.muml.graphviz.plain.PlainNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.muml.graphviz.plain.PlainNode
	 * @generated
	 */
	EClass getPlainNode();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.graphviz.plain.PlainNode#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.muml.graphviz.plain.PlainNode#getWidth()
	 * @see #getPlainNode()
	 * @generated
	 */
	EAttribute getPlainNode_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.muml.graphviz.plain.PlainNode#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.muml.graphviz.plain.PlainNode#getHeight()
	 * @see #getPlainNode()
	 * @generated
	 */
	EAttribute getPlainNode_Height();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.graphviz.plain.PlainNode#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.muml.graphviz.plain.PlainNode#getPosition()
	 * @see #getPlainNode()
	 * @generated
	 */
	EReference getPlainNode_Position();

	/**
	 * Returns the meta object for class '{@link org.muml.graphviz.plain.PlainEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.muml.graphviz.plain.PlainEdge
	 * @generated
	 */
	EClass getPlainEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.graphviz.plain.PlainEdge#getSplinePoints <em>Spline Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spline Points</em>'.
	 * @see org.muml.graphviz.plain.PlainEdge#getSplinePoints()
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
		 * The meta object literal for the '{@link org.muml.graphviz.plain.impl.PlainGraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.graphviz.plain.impl.PlainGraphImpl
		 * @see org.muml.graphviz.plain.impl.PlainPackageImpl#getPlainGraph()
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
		 * The meta object literal for the '{@link org.muml.graphviz.plain.impl.PlainNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.graphviz.plain.impl.PlainNodeImpl
		 * @see org.muml.graphviz.plain.impl.PlainPackageImpl#getPlainNode()
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
		 * The meta object literal for the '{@link org.muml.graphviz.plain.impl.PlainEdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.graphviz.plain.impl.PlainEdgeImpl
		 * @see org.muml.graphviz.plain.impl.PlainPackageImpl#getPlainEdge()
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
