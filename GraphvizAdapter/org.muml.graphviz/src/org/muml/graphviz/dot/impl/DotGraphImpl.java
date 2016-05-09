/**
 */
package org.muml.graphviz.dot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.graphviz.common.impl.GraphImpl;
import org.muml.graphviz.dot.DotEdge;
import org.muml.graphviz.dot.DotGraph;
import org.muml.graphviz.dot.DotNode;
import org.muml.graphviz.dot.DotPackage;
import org.muml.graphviz.dot.Setting;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.graphviz.dot.impl.DotGraphImpl#isDirectedGraph <em>Directed Graph</em>}</li>
 *   <li>{@link org.muml.graphviz.dot.impl.DotGraphImpl#getSubgraphs <em>Subgraphs</em>}</li>
 *   <li>{@link org.muml.graphviz.dot.impl.DotGraphImpl#getParentGraph <em>Parent Graph</em>}</li>
 *   <li>{@link org.muml.graphviz.dot.impl.DotGraphImpl#getGraphSettings <em>Graph Settings</em>}</li>
 *   <li>{@link org.muml.graphviz.dot.impl.DotGraphImpl#getNodeSettings <em>Node Settings</em>}</li>
 *   <li>{@link org.muml.graphviz.dot.impl.DotGraphImpl#getEdgeSettings <em>Edge Settings</em>}</li>
 *   <li>{@link org.muml.graphviz.dot.impl.DotGraphImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.muml.graphviz.dot.impl.DotGraphImpl#isCluster <em>Cluster</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DotGraphImpl extends GraphImpl<DotNode, DotEdge> implements DotGraph {
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
	 * The cached value of the '{@link #getSubgraphs() <em>Subgraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<DotGraph> subgraphs;

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
	protected static final String ID_EDEFAULT = "";

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
	 * The default value of the '{@link #isCluster() <em>Cluster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCluster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLUSTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCluster() <em>Cluster</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCluster()
	 * @generated
	 * @ordered
	 */
	protected boolean cluster = CLUSTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DotGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DotPackage.Literals.DOT_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<DotNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<DotNode>(DotNode.class, this, DotPackage.DOT_GRAPH__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<DotEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<DotEdge>(DotEdge.class, this, DotPackage.DOT_GRAPH__EDGES);
		}
		return edges;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.DOT_GRAPH__DIRECTED_GRAPH, oldDirectedGraph, directedGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DotGraph> getSubgraphs() {
		if (subgraphs == null) {
			subgraphs = new EObjectContainmentWithInverseEList<DotGraph>(DotGraph.class, this, DotPackage.DOT_GRAPH__SUBGRAPHS, DotPackage.DOT_GRAPH__PARENT_GRAPH);
		}
		return subgraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotGraph getParentGraph() {
		if (eContainerFeatureID() != DotPackage.DOT_GRAPH__PARENT_GRAPH) return null;
		return (DotGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentGraph(DotGraph newParentGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentGraph, DotPackage.DOT_GRAPH__PARENT_GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentGraph(DotGraph newParentGraph) {
		if (newParentGraph != eInternalContainer() || (eContainerFeatureID() != DotPackage.DOT_GRAPH__PARENT_GRAPH && newParentGraph != null)) {
			if (EcoreUtil.isAncestor(this, newParentGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentGraph != null)
				msgs = ((InternalEObject)newParentGraph).eInverseAdd(this, DotPackage.DOT_GRAPH__SUBGRAPHS, DotGraph.class, msgs);
			msgs = basicSetParentGraph(newParentGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.DOT_GRAPH__PARENT_GRAPH, newParentGraph, newParentGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Setting> getGraphSettings() {
		if (graphSettings == null) {
			graphSettings = new EObjectContainmentEList<Setting>(Setting.class, this, DotPackage.DOT_GRAPH__GRAPH_SETTINGS);
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
			nodeSettings = new EObjectContainmentEList<Setting>(Setting.class, this, DotPackage.DOT_GRAPH__NODE_SETTINGS);
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
			edgeSettings = new EObjectContainmentEList<Setting>(Setting.class, this, DotPackage.DOT_GRAPH__EDGE_SETTINGS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.DOT_GRAPH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCluster() {
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster(boolean newCluster) {
		boolean oldCluster = cluster;
		cluster = newCluster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.DOT_GRAPH__CLUSTER, oldCluster, cluster));
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
			case DotPackage.DOT_GRAPH__SUBGRAPHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubgraphs()).basicAdd(otherEnd, msgs);
			case DotPackage.DOT_GRAPH__PARENT_GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentGraph((DotGraph)otherEnd, msgs);
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
			case DotPackage.DOT_GRAPH__SUBGRAPHS:
				return ((InternalEList<?>)getSubgraphs()).basicRemove(otherEnd, msgs);
			case DotPackage.DOT_GRAPH__PARENT_GRAPH:
				return basicSetParentGraph(null, msgs);
			case DotPackage.DOT_GRAPH__GRAPH_SETTINGS:
				return ((InternalEList<?>)getGraphSettings()).basicRemove(otherEnd, msgs);
			case DotPackage.DOT_GRAPH__NODE_SETTINGS:
				return ((InternalEList<?>)getNodeSettings()).basicRemove(otherEnd, msgs);
			case DotPackage.DOT_GRAPH__EDGE_SETTINGS:
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
			case DotPackage.DOT_GRAPH__PARENT_GRAPH:
				return eInternalContainer().eInverseRemove(this, DotPackage.DOT_GRAPH__SUBGRAPHS, DotGraph.class, msgs);
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
			case DotPackage.DOT_GRAPH__DIRECTED_GRAPH:
				return isDirectedGraph();
			case DotPackage.DOT_GRAPH__SUBGRAPHS:
				return getSubgraphs();
			case DotPackage.DOT_GRAPH__PARENT_GRAPH:
				return getParentGraph();
			case DotPackage.DOT_GRAPH__GRAPH_SETTINGS:
				return getGraphSettings();
			case DotPackage.DOT_GRAPH__NODE_SETTINGS:
				return getNodeSettings();
			case DotPackage.DOT_GRAPH__EDGE_SETTINGS:
				return getEdgeSettings();
			case DotPackage.DOT_GRAPH__ID:
				return getId();
			case DotPackage.DOT_GRAPH__CLUSTER:
				return isCluster();
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
			case DotPackage.DOT_GRAPH__DIRECTED_GRAPH:
				setDirectedGraph((Boolean)newValue);
				return;
			case DotPackage.DOT_GRAPH__SUBGRAPHS:
				getSubgraphs().clear();
				getSubgraphs().addAll((Collection<? extends DotGraph>)newValue);
				return;
			case DotPackage.DOT_GRAPH__PARENT_GRAPH:
				setParentGraph((DotGraph)newValue);
				return;
			case DotPackage.DOT_GRAPH__GRAPH_SETTINGS:
				getGraphSettings().clear();
				getGraphSettings().addAll((Collection<? extends Setting>)newValue);
				return;
			case DotPackage.DOT_GRAPH__NODE_SETTINGS:
				getNodeSettings().clear();
				getNodeSettings().addAll((Collection<? extends Setting>)newValue);
				return;
			case DotPackage.DOT_GRAPH__EDGE_SETTINGS:
				getEdgeSettings().clear();
				getEdgeSettings().addAll((Collection<? extends Setting>)newValue);
				return;
			case DotPackage.DOT_GRAPH__ID:
				setId((String)newValue);
				return;
			case DotPackage.DOT_GRAPH__CLUSTER:
				setCluster((Boolean)newValue);
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
			case DotPackage.DOT_GRAPH__DIRECTED_GRAPH:
				setDirectedGraph(DIRECTED_GRAPH_EDEFAULT);
				return;
			case DotPackage.DOT_GRAPH__SUBGRAPHS:
				getSubgraphs().clear();
				return;
			case DotPackage.DOT_GRAPH__PARENT_GRAPH:
				setParentGraph((DotGraph)null);
				return;
			case DotPackage.DOT_GRAPH__GRAPH_SETTINGS:
				getGraphSettings().clear();
				return;
			case DotPackage.DOT_GRAPH__NODE_SETTINGS:
				getNodeSettings().clear();
				return;
			case DotPackage.DOT_GRAPH__EDGE_SETTINGS:
				getEdgeSettings().clear();
				return;
			case DotPackage.DOT_GRAPH__ID:
				setId(ID_EDEFAULT);
				return;
			case DotPackage.DOT_GRAPH__CLUSTER:
				setCluster(CLUSTER_EDEFAULT);
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
			case DotPackage.DOT_GRAPH__DIRECTED_GRAPH:
				return directedGraph != DIRECTED_GRAPH_EDEFAULT;
			case DotPackage.DOT_GRAPH__SUBGRAPHS:
				return subgraphs != null && !subgraphs.isEmpty();
			case DotPackage.DOT_GRAPH__PARENT_GRAPH:
				return getParentGraph() != null;
			case DotPackage.DOT_GRAPH__GRAPH_SETTINGS:
				return graphSettings != null && !graphSettings.isEmpty();
			case DotPackage.DOT_GRAPH__NODE_SETTINGS:
				return nodeSettings != null && !nodeSettings.isEmpty();
			case DotPackage.DOT_GRAPH__EDGE_SETTINGS:
				return edgeSettings != null && !edgeSettings.isEmpty();
			case DotPackage.DOT_GRAPH__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DotPackage.DOT_GRAPH__CLUSTER:
				return cluster != CLUSTER_EDEFAULT;
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
		result.append(", cluster: ");
		result.append(cluster);
		result.append(')');
		return result.toString();
	}

} //DotGraphImpl
