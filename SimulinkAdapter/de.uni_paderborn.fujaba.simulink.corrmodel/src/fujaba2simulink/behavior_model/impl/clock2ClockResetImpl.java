/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.clock2ClockReset;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>clock2 Clock Reset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.clock2ClockResetImpl#getScClock <em>Sc Clock</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.clock2ClockResetImpl#getSfClockReset <em>Sf Clock Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class clock2ClockResetImpl extends AbstractContainerCorrespondenceNodeImpl implements clock2ClockReset {
	/**
	 * The cached value of the '{@link #getScClock() <em>Sc Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScClock()
	 * @generated
	 * @ordered
	 */
	protected Clock scClock;

	/**
	 * The cached value of the '{@link #getSfClockReset() <em>Sf Clock Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfClockReset()
	 * @generated
	 * @ordered
	 */
	protected Action sfClockReset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected clock2ClockResetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.CLOCK2_CLOCK_RESET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock getScClock() {
		if (scClock != null && scClock.eIsProxy()) {
			InternalEObject oldScClock = (InternalEObject)scClock;
			scClock = (Clock)eResolveProxy(oldScClock);
			if (scClock != oldScClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.CLOCK2_CLOCK_RESET__SC_CLOCK, oldScClock, scClock));
			}
		}
		return scClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock basicGetScClock() {
		return scClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScClock(Clock newScClock) {
		Clock oldScClock = scClock;
		scClock = newScClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.CLOCK2_CLOCK_RESET__SC_CLOCK, oldScClock, scClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfClockReset() {
		if (sfClockReset != null && ((EObject)sfClockReset).eIsProxy()) {
			InternalEObject oldSfClockReset = (InternalEObject)sfClockReset;
			sfClockReset = (Action)eResolveProxy(oldSfClockReset);
			if (sfClockReset != oldSfClockReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.CLOCK2_CLOCK_RESET__SF_CLOCK_RESET, oldSfClockReset, sfClockReset));
			}
		}
		return sfClockReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfClockReset() {
		return sfClockReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfClockReset(Action newSfClockReset) {
		Action oldSfClockReset = sfClockReset;
		sfClockReset = newSfClockReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.CLOCK2_CLOCK_RESET__SF_CLOCK_RESET, oldSfClockReset, sfClockReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.CLOCK2_CLOCK_RESET__SC_CLOCK:
				if (resolve) return getScClock();
				return basicGetScClock();
			case Behavior_modelPackage.CLOCK2_CLOCK_RESET__SF_CLOCK_RESET:
				if (resolve) return getSfClockReset();
				return basicGetSfClockReset();
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
			case Behavior_modelPackage.CLOCK2_CLOCK_RESET__SC_CLOCK:
				setScClock((Clock)newValue);
				return;
			case Behavior_modelPackage.CLOCK2_CLOCK_RESET__SF_CLOCK_RESET:
				setSfClockReset((Action)newValue);
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
			case Behavior_modelPackage.CLOCK2_CLOCK_RESET__SC_CLOCK:
				setScClock((Clock)null);
				return;
			case Behavior_modelPackage.CLOCK2_CLOCK_RESET__SF_CLOCK_RESET:
				setSfClockReset((Action)null);
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
			case Behavior_modelPackage.CLOCK2_CLOCK_RESET__SC_CLOCK:
				return scClock != null;
			case Behavior_modelPackage.CLOCK2_CLOCK_RESET__SF_CLOCK_RESET:
				return sfClockReset != null;
		}
		return super.eIsSet(featureID);
	}

} //clock2ClockResetImpl
