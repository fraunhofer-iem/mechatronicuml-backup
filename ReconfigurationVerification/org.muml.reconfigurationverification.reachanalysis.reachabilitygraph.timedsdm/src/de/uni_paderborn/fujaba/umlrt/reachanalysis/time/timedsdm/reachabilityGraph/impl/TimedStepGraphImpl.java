/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;

import de.uni_paderborn.fujaba.muml.reachanalysis.reachabilityGraph.sdm.impl.StepGraphImpl;
import de.uni_paderborn.fujaba.muml.timedstorydiagram.ClockInstance;
import de.uni_paderborn.fujaba.udbm.Federation;
import de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.ReachabilityGraphPackage;
import de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.TimedStepGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Step Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.TimedStepGraphImpl#getClockInstances <em>Clock Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.reachanalysis.time.timedsdm.reachabilityGraph.impl.TimedStepGraphImpl#getFederation <em>Federation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimedStepGraphImpl extends StepGraphImpl implements TimedStepGraph {
	/**
	 * The cached value of the '{@link #getClockInstances() <em>Clock Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockInstance> clockInstances;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedStepGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReachabilityGraphPackage.Literals.TIMED_STEP_GRAPH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReachabilityGraphPackage.TIMED_STEP_GRAPH__FEDERATION, oldFederation, federation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockInstance> getClockInstances() {
		if (clockInstances == null) {
			clockInstances = new EObjectEList<ClockInstance>(ClockInstance.class, this, ReachabilityGraphPackage.TIMED_STEP_GRAPH__CLOCK_INSTANCES);
		}
		return clockInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReachabilityGraphPackage.TIMED_STEP_GRAPH__CLOCK_INSTANCES:
				return getClockInstances();
			case ReachabilityGraphPackage.TIMED_STEP_GRAPH__FEDERATION:
				return getFederation();
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
			case ReachabilityGraphPackage.TIMED_STEP_GRAPH__CLOCK_INSTANCES:
				getClockInstances().clear();
				getClockInstances().addAll((Collection<? extends ClockInstance>)newValue);
				return;
			case ReachabilityGraphPackage.TIMED_STEP_GRAPH__FEDERATION:
				setFederation((Federation)newValue);
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
			case ReachabilityGraphPackage.TIMED_STEP_GRAPH__CLOCK_INSTANCES:
				getClockInstances().clear();
				return;
			case ReachabilityGraphPackage.TIMED_STEP_GRAPH__FEDERATION:
				setFederation(FEDERATION_EDEFAULT);
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
			case ReachabilityGraphPackage.TIMED_STEP_GRAPH__CLOCK_INSTANCES:
				return clockInstances != null && !clockInstances.isEmpty();
			case ReachabilityGraphPackage.TIMED_STEP_GRAPH__FEDERATION:
				return FEDERATION_EDEFAULT == null ? federation != null : !FEDERATION_EDEFAULT.equals(federation);
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
		result.append(" (federation: ");
		result.append(federation);
		result.append(')');
		return result.toString();
	}

} //TimedStepGraphImpl
