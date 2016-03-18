/**
 */
package de.uni_paderborn.fujaba.graphviz.dot;

import de.uni_paderborn.fujaba.graphviz.common.Graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#isDirectedGraph <em>Directed Graph</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getSubgraphs <em>Subgraphs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getParentGraph <em>Parent Graph</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getGraphSettings <em>Graph Settings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getNodeSettings <em>Node Settings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getEdgeSettings <em>Edge Settings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.graphviz.dot.DotPackage#getDotGraph()
 * @model
 * @generated
 */
public interface DotGraph extends Graph<DotNode, DotEdge> {
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
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotPackage#getDotGraph_DirectedGraph()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDirectedGraph();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#isDirectedGraph <em>Directed Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directed Graph</em>' attribute.
	 * @see #isDirectedGraph()
	 * @generated
	 */
	void setDirectedGraph(boolean value);

	/**
	 * Returns the value of the '<em><b>Subgraphs</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getParentGraph <em>Parent Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgraphs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgraphs</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotPackage#getDotGraph_Subgraphs()
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getParentGraph
	 * @model opposite="parentGraph" containment="true"
	 * @generated
	 */
	EList<DotGraph> getSubgraphs();

	/**
	 * Returns the value of the '<em><b>Parent Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getSubgraphs <em>Subgraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Graph</em>' container reference.
	 * @see #setParentGraph(DotGraph)
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotPackage#getDotGraph_ParentGraph()
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getSubgraphs
	 * @model opposite="subgraphs" transient="false"
	 * @generated
	 */
	DotGraph getParentGraph();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getParentGraph <em>Parent Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Graph</em>' container reference.
	 * @see #getParentGraph()
	 * @generated
	 */
	void setParentGraph(DotGraph value);

	/**
	 * Returns the value of the '<em><b>Graph Settings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.dot.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Settings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotPackage#getDotGraph_GraphSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getGraphSettings();

	/**
	 * Returns the value of the '<em><b>Node Settings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.dot.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Settings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotPackage#getDotGraph_NodeSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getNodeSettings();

	/**
	 * Returns the value of the '<em><b>Edge Settings</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.graphviz.dot.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Settings</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotPackage#getDotGraph_EdgeSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setting> getEdgeSettings();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.uni_paderborn.fujaba.graphviz.dot.DotPackage#getDotGraph_Id()
	 * @model default=""
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.graphviz.dot.DotGraph#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // DotGraph
