/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.core.reachanalysis.reachabilitygraph.impl.ActionTransitionImpl;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone Graph Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl.ZoneGraphTransitionImpl#getFiredRTSCTransitions <em>Fired RTSC Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneGraphTransitionImpl extends ActionTransitionImpl implements ZoneGraphTransition {
	/**
	 * The cached value of the '{@link #getFiredRTSCTransitions() <em>Fired RTSC Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiredRTSCTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> firedRTSCTransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneGraphTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.ZONE_GRAPH_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getFiredRTSCTransitions() {
		if (firedRTSCTransitions == null) {
			firedRTSCTransitions = new EObjectResolvingEList<Transition>(Transition.class, this, RtscPackage.ZONE_GRAPH_TRANSITION__FIRED_RTSC_TRANSITIONS);
		}
		return firedRTSCTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return this.getSource().toString() + " --> " + this.getTarget().toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtscPackage.ZONE_GRAPH_TRANSITION__FIRED_RTSC_TRANSITIONS:
				return getFiredRTSCTransitions();
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
			case RtscPackage.ZONE_GRAPH_TRANSITION__FIRED_RTSC_TRANSITIONS:
				getFiredRTSCTransitions().clear();
				getFiredRTSCTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case RtscPackage.ZONE_GRAPH_TRANSITION__FIRED_RTSC_TRANSITIONS:
				getFiredRTSCTransitions().clear();
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
			case RtscPackage.ZONE_GRAPH_TRANSITION__FIRED_RTSC_TRANSITIONS:
				return firedRTSCTransitions != null && !firedRTSCTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZoneGraphTransitionImpl
