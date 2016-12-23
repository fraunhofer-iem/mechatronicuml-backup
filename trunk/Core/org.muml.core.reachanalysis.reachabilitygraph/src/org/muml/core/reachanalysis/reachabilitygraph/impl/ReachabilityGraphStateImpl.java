/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.reachanalysis.reachabilitygraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.ExtendableElementImpl;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl#getReachabilityGraph <em>Reachability Graph</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl#getPathDepth <em>Path Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReachabilityGraphStateImpl extends ExtendableElementImpl implements ReachabilityGraphState {
	/**
	 * The default value of the '{@link #getHash() <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected static final long HASH_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected long hash = HASH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReachabilityGraphTransition> incomingTransitions;

	/**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReachabilityGraphTransition> outgoingTransitions;

	/**
	 * The default value of the '{@link #getPathDepth() <em>Path Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int PATH_DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPathDepth() <em>Path Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathDepth()
	 * @generated
	 * @ordered
	 */
	protected int pathDepth = PATH_DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReachabilityGraphStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReachabilityGraphPackage.Literals.REACHABILITY_GRAPH_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getHash() {
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(long newHash) {
		long oldHash = hash;
		hash = newHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__HASH, oldHash, hash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReachabilityGraphTransition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<ReachabilityGraphTransition>(ReachabilityGraphTransition.class, this, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET);
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReachabilityGraphTransition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<ReachabilityGraphTransition>(ReachabilityGraphTransition.class, this, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE);
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraph getReachabilityGraph() {
		if (eContainerFeatureID() != ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH) return null;
		return (ReachabilityGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReachabilityGraph(ReachabilityGraph newReachabilityGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReachabilityGraph, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReachabilityGraph(ReachabilityGraph newReachabilityGraph) {
		if (newReachabilityGraph != eInternalContainer() || (eContainerFeatureID() != ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH && newReachabilityGraph != null)) {
			if (EcoreUtil.isAncestor(this, newReachabilityGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReachabilityGraph != null)
				msgs = ((InternalEObject)newReachabilityGraph).eInverseAdd(this, ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES, ReachabilityGraph.class, msgs);
			msgs = basicSetReachabilityGraph(newReachabilityGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH, newReachabilityGraph, newReachabilityGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPathDepth() {
		return pathDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathDepth(int newPathDepth) {
		int oldPathDepth = pathDepth;
		pathDepth = newPathDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__PATH_DEPTH, oldPathDepth, pathDepth));
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
		result.append(" (hash: ");
		result.append(hash);
		result.append(", pathDepth: ");
		result.append(pathDepth);
		result.append(')');
		return result.toString();
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransitions()).basicAdd(otherEnd, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReachabilityGraph((ReachabilityGraph)otherEnd, msgs);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS:
				return ((InternalEList<?>)getIncomingTransitions()).basicRemove(otherEnd, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH:
				return basicSetReachabilityGraph(null, msgs);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH:
				return eInternalContainer().eInverseRemove(this, ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES, ReachabilityGraph.class, msgs);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__HASH:
				return getHash();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH:
				return getReachabilityGraph();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__PATH_DEPTH:
				return getPathDepth();
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__HASH:
				setHash((Long)newValue);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends ReachabilityGraphTransition>)newValue);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends ReachabilityGraphTransition>)newValue);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH:
				setReachabilityGraph((ReachabilityGraph)newValue);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__PATH_DEPTH:
				setPathDepth((Integer)newValue);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__HASH:
				setHash(HASH_EDEFAULT);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH:
				setReachabilityGraph((ReachabilityGraph)null);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__PATH_DEPTH:
				setPathDepth(PATH_DEPTH_EDEFAULT);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__HASH:
				return hash != HASH_EDEFAULT;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS:
				return incomingTransitions != null && !incomingTransitions.isEmpty();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS:
				return outgoingTransitions != null && !outgoingTransitions.isEmpty();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH:
				return getReachabilityGraph() != null;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__PATH_DEPTH:
				return pathDepth != PATH_DEPTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ReachabilityGraphStateImpl
