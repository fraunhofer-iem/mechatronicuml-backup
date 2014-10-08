/**
 */
package de.uni_paderborn.fujaba.graphviz.graphviz.input.impl;

import de.uni_paderborn.fujaba.graphviz.graphviz.input.Edge;
import de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph;
import de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage;
import de.uni_paderborn.fujaba.graphviz.graphviz.input.Node;
import de.uni_paderborn.fujaba.graphviz.graphviz.input.Setting;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.impl.GraphImpl#isDirectedGraph <em>Directed Graph</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.impl.GraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.impl.GraphImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.impl.GraphImpl#getSubgraphs <em>Subgraphs</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.impl.GraphImpl#getParentGraph <em>Parent Graph</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.impl.GraphImpl#getGraphSettings <em>Graph Settings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.impl.GraphImpl#getNodeSettings <em>Node Settings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.impl.GraphImpl#getEdgeSettings <em>Edge Settings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.graphviz.graphviz.input.impl.GraphImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
	/**
	 * The default value of the '{@link #isDirectedGraph() <em>Directed Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectedGraph()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECTED_GRAPH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirectedGraph() <em>Directed Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectedGraph()
	 * @generated
	 * @ordered
	 */
	protected boolean directedGraph = DIRECTED_GRAPH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getSubgraphs() <em>Subgraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Graph> subgraphs;

	/**
	 * The cached value of the '{@link #getGraphSettings() <em>Graph Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<Setting> graphSettings;

	/**
	 * The cached value of the '{@link #getNodeSettings() <em>Node Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<Setting> nodeSettings;

	/**
	 * The cached value of the '{@link #getEdgeSettings() <em>Edge Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<Setting> edgeSettings;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirectedGraph() {
		return directedGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectedGraph(boolean newDirectedGraph) {
		boolean oldDirectedGraph = directedGraph;
		directedGraph = newDirectedGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.GRAPH__DIRECTED_GRAPH, oldDirectedGraph, directedGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, InputPackage.GRAPH__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, InputPackage.GRAPH__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Graph> getSubgraphs() {
		if (subgraphs == null) {
			subgraphs = new EObjectContainmentWithInverseEList<Graph>(Graph.class, this, InputPackage.GRAPH__SUBGRAPHS, InputPackage.GRAPH__PARENT_GRAPH);
		}
		return subgraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getParentGraph() {
		if (eContainerFeatureID() != InputPackage.GRAPH__PARENT_GRAPH) return null;
		return (Graph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentGraph(Graph newParentGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentGraph, InputPackage.GRAPH__PARENT_GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentGraph(Graph newParentGraph) {
		if (newParentGraph != eInternalContainer() || (eContainerFeatureID() != InputPackage.GRAPH__PARENT_GRAPH && newParentGraph != null)) {
			if (EcoreUtil.isAncestor(this, newParentGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentGraph != null)
				msgs = ((InternalEObject)newParentGraph).eInverseAdd(this, InputPackage.GRAPH__SUBGRAPHS, Graph.class, msgs);
			msgs = basicSetParentGraph(newParentGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.GRAPH__PARENT_GRAPH, newParentGraph, newParentGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Setting> getGraphSettings() {
		if (graphSettings == null) {
			graphSettings = new EObjectContainmentEList<Setting>(Setting.class, this, InputPackage.GRAPH__GRAPH_SETTINGS);
		}
		return graphSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Setting> getNodeSettings() {
		if (nodeSettings == null) {
			nodeSettings = new EObjectContainmentEList<Setting>(Setting.class, this, InputPackage.GRAPH__NODE_SETTINGS);
		}
		return nodeSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Setting> getEdgeSettings() {
		if (edgeSettings == null) {
			edgeSettings = new EObjectContainmentEList<Setting>(Setting.class, this, InputPackage.GRAPH__EDGE_SETTINGS);
		}
		return edgeSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.GRAPH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputPackage.GRAPH__SUBGRAPHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubgraphs()).basicAdd(otherEnd, msgs);
			case InputPackage.GRAPH__PARENT_GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentGraph((Graph)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputPackage.GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case InputPackage.GRAPH__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case InputPackage.GRAPH__SUBGRAPHS:
				return ((InternalEList<?>)getSubgraphs()).basicRemove(otherEnd, msgs);
			case InputPackage.GRAPH__PARENT_GRAPH:
				return basicSetParentGraph(null, msgs);
			case InputPackage.GRAPH__GRAPH_SETTINGS:
				return ((InternalEList<?>)getGraphSettings()).basicRemove(otherEnd, msgs);
			case InputPackage.GRAPH__NODE_SETTINGS:
				return ((InternalEList<?>)getNodeSettings()).basicRemove(otherEnd, msgs);
			case InputPackage.GRAPH__EDGE_SETTINGS:
				return ((InternalEList<?>)getEdgeSettings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InputPackage.GRAPH__PARENT_GRAPH:
				return eInternalContainer().eInverseRemove(this, InputPackage.GRAPH__SUBGRAPHS, Graph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InputPackage.GRAPH__DIRECTED_GRAPH:
				return isDirectedGraph();
			case InputPackage.GRAPH__NODES:
				return getNodes();
			case InputPackage.GRAPH__EDGES:
				return getEdges();
			case InputPackage.GRAPH__SUBGRAPHS:
				return getSubgraphs();
			case InputPackage.GRAPH__PARENT_GRAPH:
				return getParentGraph();
			case InputPackage.GRAPH__GRAPH_SETTINGS:
				return getGraphSettings();
			case InputPackage.GRAPH__NODE_SETTINGS:
				return getNodeSettings();
			case InputPackage.GRAPH__EDGE_SETTINGS:
				return getEdgeSettings();
			case InputPackage.GRAPH__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InputPackage.GRAPH__DIRECTED_GRAPH:
				setDirectedGraph((Boolean)newValue);
				return;
			case InputPackage.GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case InputPackage.GRAPH__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case InputPackage.GRAPH__SUBGRAPHS:
				getSubgraphs().clear();
				getSubgraphs().addAll((Collection<? extends Graph>)newValue);
				return;
			case InputPackage.GRAPH__PARENT_GRAPH:
				setParentGraph((Graph)newValue);
				return;
			case InputPackage.GRAPH__GRAPH_SETTINGS:
				getGraphSettings().clear();
				getGraphSettings().addAll((Collection<? extends Setting>)newValue);
				return;
			case InputPackage.GRAPH__NODE_SETTINGS:
				getNodeSettings().clear();
				getNodeSettings().addAll((Collection<? extends Setting>)newValue);
				return;
			case InputPackage.GRAPH__EDGE_SETTINGS:
				getEdgeSettings().clear();
				getEdgeSettings().addAll((Collection<? extends Setting>)newValue);
				return;
			case InputPackage.GRAPH__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InputPackage.GRAPH__DIRECTED_GRAPH:
				setDirectedGraph(DIRECTED_GRAPH_EDEFAULT);
				return;
			case InputPackage.GRAPH__NODES:
				getNodes().clear();
				return;
			case InputPackage.GRAPH__EDGES:
				getEdges().clear();
				return;
			case InputPackage.GRAPH__SUBGRAPHS:
				getSubgraphs().clear();
				return;
			case InputPackage.GRAPH__PARENT_GRAPH:
				setParentGraph((Graph)null);
				return;
			case InputPackage.GRAPH__GRAPH_SETTINGS:
				getGraphSettings().clear();
				return;
			case InputPackage.GRAPH__NODE_SETTINGS:
				getNodeSettings().clear();
				return;
			case InputPackage.GRAPH__EDGE_SETTINGS:
				getEdgeSettings().clear();
				return;
			case InputPackage.GRAPH__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InputPackage.GRAPH__DIRECTED_GRAPH:
				return directedGraph != DIRECTED_GRAPH_EDEFAULT;
			case InputPackage.GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case InputPackage.GRAPH__EDGES:
				return edges != null && !edges.isEmpty();
			case InputPackage.GRAPH__SUBGRAPHS:
				return subgraphs != null && !subgraphs.isEmpty();
			case InputPackage.GRAPH__PARENT_GRAPH:
				return getParentGraph() != null;
			case InputPackage.GRAPH__GRAPH_SETTINGS:
				return graphSettings != null && !graphSettings.isEmpty();
			case InputPackage.GRAPH__NODE_SETTINGS:
				return nodeSettings != null && !nodeSettings.isEmpty();
			case InputPackage.GRAPH__EDGE_SETTINGS:
				return edgeSettings != null && !edgeSettings.isEmpty();
			case InputPackage.GRAPH__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (directedGraph: ");
		result.append(directedGraph);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
