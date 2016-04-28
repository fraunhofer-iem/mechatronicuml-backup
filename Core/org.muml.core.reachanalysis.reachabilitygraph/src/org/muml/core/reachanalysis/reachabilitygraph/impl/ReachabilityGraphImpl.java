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
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.ExtendableElementImpl;
import org.muml.core.reachanalysis.reachabilitygraph.HashToStateList;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraph;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphFactory;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reachability Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphImpl#getStartState <em>Start State</em>}</li>
 *   <li>{@link org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphImpl#getStatesWithHash <em>States With Hash</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReachabilityGraphImpl extends ExtendableElementImpl implements ReachabilityGraph {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<ReachabilityGraphState> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReachabilityGraphTransition> transitions;

	/**
	 * The cached value of the '{@link #getStartState() <em>Start State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartState()
	 * @generated
	 * @ordered
	 */
	protected ReachabilityGraphState startState;

	/**
	 * The cached value of the '{@link #getStatesWithHash() <em>States With Hash</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesWithHash()
	 * @generated
	 * @ordered
	 */
	protected EMap<Long, HashToStateList> statesWithHash;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReachabilityGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReachabilityGraphPackage.Literals.REACHABILITY_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReachabilityGraphState> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<ReachabilityGraphState>(ReachabilityGraphState.class, this, ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES, ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__REACHABILITY_GRAPH);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReachabilityGraphTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<ReachabilityGraphTransition>(ReachabilityGraphTransition.class, this, ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS, ReachabilityGraphPackage.REACHABILITY_GRAPH_TRANSITION__REACHABILITY_GRAPH);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraphState getStartState() {
		if (startState != null && startState.eIsProxy()) {
			InternalEObject oldStartState = (InternalEObject)startState;
			startState = (ReachabilityGraphState)eResolveProxy(oldStartState);
			if (startState != oldStartState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReachabilityGraphPackage.REACHABILITY_GRAPH__START_STATE, oldStartState, startState));
			}
		}
		return startState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraphState basicGetStartState() {
		return startState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartState(ReachabilityGraphState newStartState) {
		ReachabilityGraphState oldStartState = startState;
		startState = newStartState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.REACHABILITY_GRAPH__START_STATE, oldStartState, startState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Long, HashToStateList> getStatesWithHash() {
		if (statesWithHash == null) {
			statesWithHash = new EcoreEMap<Long,HashToStateList>(ReachabilityGraphPackage.Literals.HASH_TO_STATE_LIST_MAP_ENTRY, HashToStateListMapEntryImpl.class, this, ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES_WITH_HASH);
		}
		return statesWithHash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addToStatesMap(final ReachabilityGraphState state) {
		Long hashValue = state.getHash();
		
		//check if entry for that hash exists
		HashToStateList list = this.getStatesWithHash().get(hashValue);
				
		//create new list and add it to the map
		if (list == null){
			list = ReachabilityGraphFactory.eINSTANCE.createHashToStateList();
			list.setHash(hashValue);
			list.getStates().add(state);
			this.getStatesWithHash().put(hashValue, list);
		}
				
		//add state to list
		list.getStates().add(state);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES_WITH_HASH:
				return ((InternalEList<?>)getStatesWithHash()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES:
				return getStates();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS:
				return getTransitions();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__START_STATE:
				if (resolve) return getStartState();
				return basicGetStartState();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES_WITH_HASH:
				if (coreType) return getStatesWithHash();
				else return getStatesWithHash().map();
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends ReachabilityGraphState>)newValue);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends ReachabilityGraphTransition>)newValue);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__START_STATE:
				setStartState((ReachabilityGraphState)newValue);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES_WITH_HASH:
				((EStructuralFeature.Setting)getStatesWithHash()).set(newValue);
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES:
				getStates().clear();
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS:
				getTransitions().clear();
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__START_STATE:
				setStartState((ReachabilityGraphState)null);
				return;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES_WITH_HASH:
				getStatesWithHash().clear();
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
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES:
				return states != null && !states.isEmpty();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__START_STATE:
				return startState != null;
			case ReachabilityGraphPackage.REACHABILITY_GRAPH__STATES_WITH_HASH:
				return statesWithHash != null && !statesWithHash.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReachabilityGraphImpl
