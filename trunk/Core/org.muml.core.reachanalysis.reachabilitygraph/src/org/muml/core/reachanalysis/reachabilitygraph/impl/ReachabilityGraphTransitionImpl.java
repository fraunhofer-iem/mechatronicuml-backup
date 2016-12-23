/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core.reachanalysis.reachabilitygraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.core.impl.ExtendableElementImpl;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphTransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphTransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphTransitionImpl#getReachabilityGraph <em>Reachability Graph</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReachabilityGraphTransitionImpl extends ExtendableElementImpl implements ReachabilityGraphTransition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ReachabilityGraphState source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ReachabilityGraphState target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReachabilityGraphTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReachabilityGraphPackage.Literals.REACHABILITY_GRAPH_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraphState getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ReachabilityGraphState)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraphState basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ReachabilityGraphState newSource, NotificationChain msgs) {
		ReachabilityGraphState oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ReachabilityGraphState newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS, ReachabilityGraphState.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS, ReachabilityGraphState.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraphState getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ReachabilityGraphState)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraphState basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ReachabilityGraphState newTarget, NotificationChain msgs) {
		ReachabilityGraphState oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ReachabilityGraphState newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS, ReachabilityGraphState.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS, ReachabilityGraphState.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraph getReachabilityGraph() {
		if (eContainerFeatureID() != ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH) return null;
		return (ReachabilityGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReachabilityGraph(ReachabilityGraph newReachabilityGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReachabilityGraph, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReachabilityGraph(ReachabilityGraph newReachabilityGraph) {
		if (newReachabilityGraph != eInternalContainer() || (eContainerFeatureID() != ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH && newReachabilityGraph != null)) {
			if (EcoreUtil.isAncestor(this, newReachabilityGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReachabilityGraph != null)
				msgs = ((InternalEObject)newReachabilityGraph).eInverseAdd(this, ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS, ReachabilityGraph.class, msgs);
			msgs = basicSetReachabilityGraph(newReachabilityGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH, newReachabilityGraph, newReachabilityGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS, ReachabilityGraphState.class, msgs);
				return basicSetSource((ReachabilityGraphState)otherEnd, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS, ReachabilityGraphState.class, msgs);
				return basicSetTarget((ReachabilityGraphState)otherEnd, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH:
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH:
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH:
				return eInternalContainer().eInverseRemove(this, ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS, ReachabilityGraph.class, msgs);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH:
				return getReachabilityGraph();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE:
				setSource((ReachabilityGraphState)newValue);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET:
				setTarget((ReachabilityGraphState)newValue);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH:
				setReachabilityGraph((ReachabilityGraph)newValue);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE:
				setSource((ReachabilityGraphState)null);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET:
				setTarget((ReachabilityGraphState)null);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH:
				setReachabilityGraph((ReachabilityGraph)null);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__SOURCE:
				return source != null;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__TARGET:
				return target != null;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH:
				return getReachabilityGraph() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReachabilityGraphTransitionImpl
