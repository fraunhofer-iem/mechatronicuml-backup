/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.reachanalysis.reachabilitygraph.impl.ReachabilityGraphStateImpl;
import org.muml.udbm.Federation;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraphState;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone Graph State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl.ZoneGraphStateImpl#getFederation <em>Federation</em>}</li>
 *   <li>{@link org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl.ZoneGraphStateImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl.ZoneGraphStateImpl#getContainedToplevelStatechartInstances <em>Contained Toplevel Statechart Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneGraphStateImpl extends ReachabilityGraphStateImpl implements ZoneGraphState {
	/**
	 * The default value of the '{@link #getFederation() <em>Federation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederation()
	 * @generated
	 * @ordered
	 */
	protected static final Federation FEDERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFederation() <em>Federation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederation()
	 * @generated
	 * @ordered
	 */
	protected Federation federation = FEDERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<RealtimeStatechartInstance> locations;

	/**
	 * The cached value of the '{@link #getContainedToplevelStatechartInstances() <em>Contained Toplevel Statechart Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedToplevelStatechartInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<RealtimeStatechartInstance> containedToplevelStatechartInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneGraphStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtscPackage.Literals.ZONE_GRAPH_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Federation getFederation() {
		return federation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederation(Federation newFederation) {
		Federation oldFederation = federation;
		federation = newFederation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtscPackage.ZONE_GRAPH_STATE__FEDERATION, oldFederation, federation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealtimeStatechartInstance> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<RealtimeStatechartInstance>(RealtimeStatechartInstance.class, this, RtscPackage.ZONE_GRAPH_STATE__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealtimeStatechartInstance> getContainedToplevelStatechartInstances() {
		if (containedToplevelStatechartInstances == null) {
			containedToplevelStatechartInstances = new EObjectContainmentEList<RealtimeStatechartInstance>(RealtimeStatechartInstance.class, this, RtscPackage.ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES);
		}
		return containedToplevelStatechartInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		Vector<String> locationNames = new Vector<String>();
		for (RealtimeStatechartInstance location : locations) {
			locationNames.add(location.getInstanceOf().getName());
		}
		
		String[] locationNamesArray = locationNames.toArray(new String[0]);
		Arrays.sort(locationNamesArray);
		
		locationNames = new Vector<String>();
		
		for (String name : locationNamesArray) {
			locationNames.add(name);
		}
		
		return "[zone locations:" + locationNames.toString() + "; federation:"
			+ federation.toString() + "]";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtscPackage.ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES:
				return ((InternalEList<?>)getContainedToplevelStatechartInstances()).basicRemove(otherEnd, msgs);
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
			case RtscPackage.ZONE_GRAPH_STATE__FEDERATION:
				return getFederation();
			case RtscPackage.ZONE_GRAPH_STATE__LOCATIONS:
				return getLocations();
			case RtscPackage.ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES:
				return getContainedToplevelStatechartInstances();
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
			case RtscPackage.ZONE_GRAPH_STATE__FEDERATION:
				setFederation((Federation)newValue);
				return;
			case RtscPackage.ZONE_GRAPH_STATE__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends RealtimeStatechartInstance>)newValue);
				return;
			case RtscPackage.ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES:
				getContainedToplevelStatechartInstances().clear();
				getContainedToplevelStatechartInstances().addAll((Collection<? extends RealtimeStatechartInstance>)newValue);
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
			case RtscPackage.ZONE_GRAPH_STATE__FEDERATION:
				setFederation(FEDERATION_EDEFAULT);
				return;
			case RtscPackage.ZONE_GRAPH_STATE__LOCATIONS:
				getLocations().clear();
				return;
			case RtscPackage.ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES:
				getContainedToplevelStatechartInstances().clear();
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
			case RtscPackage.ZONE_GRAPH_STATE__FEDERATION:
				return FEDERATION_EDEFAULT == null ? federation != null : !FEDERATION_EDEFAULT.equals(federation);
			case RtscPackage.ZONE_GRAPH_STATE__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case RtscPackage.ZONE_GRAPH_STATE__CONTAINED_TOPLEVEL_STATECHART_INSTANCES:
				return containedToplevelStatechartInstances != null && !containedToplevelStatechartInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZoneGraphStateImpl
