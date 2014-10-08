/**
 */
package de.uni_paderborn.fujaba.graphviz.graphviz.input;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#isDirectedGraph <em>Directed Graph</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getEdges <em>Edges</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getSubgraphs <em>Subgraphs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getParentGraph <em>Parent Graph</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getGraphSettings <em>Graph Settings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getNodeSettings <em>Node Settings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getEdgeSettings <em>Edge Settings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Directed Graph</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directed Graph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directed Graph</em>' attribute.
	 * @see #setDirectedGraph(boolean)
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getGraph_DirectedGraph()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDirectedGraph();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#isDirectedGraph <em>Directed Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Graph</em>' attribute.
	 * @see #isDirectedGraph()
	 * @generated
	 */
	void setDirectedGraph(boolean value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getGraph_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Subgraphs</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getParentGraph <em>Parent Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgraphs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgraphs</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getGraph_Subgraphs()
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getParentGraph
	 * @model opposite="parentGraph" containment="true"
	 * @generated
	 */
	EList<Graph> getSubgraphs();

	/**
	 * Returns the value of the '<em><b>Parent Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getSubgraphs <em>Subgraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Graph</em>' container reference.
	 * @see #setParentGraph(Graph)
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getGraph_ParentGraph()
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getSubgraphs
	 * @model opposite="subgraphs" transient="false"
	 * @generated
	 */
	Graph getParentGraph();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getParentGraph <em>Parent Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Graph</em>' container reference.
	 * @see #getParentGraph()
	 * @generated
	 */
	void setParentGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Graph Settings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Settings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getGraph_GraphSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getGraphSettings();

	/**
	 * Returns the value of the '<em><b>Node Settings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Settings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getGraph_NodeSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getNodeSettings();

	/**
	 * Returns the value of the '<em><b>Edge Settings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Settings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getGraph_EdgeSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getEdgeSettings();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage#getGraph_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Graph
