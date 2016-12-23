/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.TimedsdmPackage;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.StepGraphImpl;
import org.muml.udbm.Federation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Step Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.impl.TimedStepGraphImpl#getClockInstances <em>Clock Instances</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.timedsdm.impl.TimedStepGraphImpl#getFederation <em>Federation</em>}</li>
 * </ul>
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
		return TimedsdmPackage.Literals.TIMED_STEP_GRAPH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimedsdmPackage.TIMED_STEP_GRAPH__FEDERATION, oldFederation, federation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockInstance> getClockInstances() {
		if (clockInstances == null) {
			clockInstances = new EObjectEList<ClockInstance>(ClockInstance.class, this, TimedsdmPackage.TIMED_STEP_GRAPH__CLOCK_INSTANCES);
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
			case TimedsdmPackage.TIMED_STEP_GRAPH__CLOCK_INSTANCES:
				return getClockInstances();
			case TimedsdmPackage.TIMED_STEP_GRAPH__FEDERATION:
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
			case TimedsdmPackage.TIMED_STEP_GRAPH__CLOCK_INSTANCES:
				getClockInstances().clear();
				getClockInstances().addAll((Collection<? extends ClockInstance>)newValue);
				return;
			case TimedsdmPackage.TIMED_STEP_GRAPH__FEDERATION:
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
			case TimedsdmPackage.TIMED_STEP_GRAPH__CLOCK_INSTANCES:
				getClockInstances().clear();
				return;
			case TimedsdmPackage.TIMED_STEP_GRAPH__FEDERATION:
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
			case TimedsdmPackage.TIMED_STEP_GRAPH__CLOCK_INSTANCES:
				return clockInstances != null && !clockInstances.isEmpty();
			case TimedsdmPackage.TIMED_STEP_GRAPH__FEDERATION:
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
