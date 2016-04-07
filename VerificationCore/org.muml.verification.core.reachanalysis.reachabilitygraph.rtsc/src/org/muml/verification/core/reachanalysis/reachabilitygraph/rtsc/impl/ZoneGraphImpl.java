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
import org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphImpl;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl.ZoneGraphImpl#getClocks <em>Clocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneGraphImpl extends ReachabilityGraphImpl implements ZoneGraph {
	/**
	 * The cached value of the '{@link #getClocks() <em>Clocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> clocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.ZONE_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getClocks() {
		if (clocks == null) {
			clocks = new EObjectResolvingEList<Clock>(Clock.class, this, RtscPackage.ZONE_GRAPH__CLOCKS);
		}
		return clocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtscPackage.ZONE_GRAPH__CLOCKS:
				return getClocks();
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
			case RtscPackage.ZONE_GRAPH__CLOCKS:
				getClocks().clear();
				getClocks().addAll((Collection<? extends Clock>)newValue);
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
			case RtscPackage.ZONE_GRAPH__CLOCKS:
				getClocks().clear();
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
			case RtscPackage.ZONE_GRAPH__CLOCKS:
				return clocks != null && !clocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZoneGraphImpl
