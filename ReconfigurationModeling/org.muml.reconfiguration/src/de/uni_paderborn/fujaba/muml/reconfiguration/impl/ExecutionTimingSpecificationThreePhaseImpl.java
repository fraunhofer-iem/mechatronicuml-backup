/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.valuetype.TimeValue;

import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecificationThreePhase;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Timing Specification Three Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutionTimingSpecificationThreePhaseImpl#getTimeForSetup <em>Time For Setup</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutionTimingSpecificationThreePhaseImpl#getTimeForFading <em>Time For Fading</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutionTimingSpecificationThreePhaseImpl#getTimeForTeardown <em>Time For Teardown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionTimingSpecificationThreePhaseImpl extends ExecutionTimingSpecificationImpl implements ExecutionTimingSpecificationThreePhase {
	/**
	 * The cached value of the '{@link #getTimeForSetup() <em>Time For Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeForSetup()
	 * @generated
	 * @ordered
	 */
	protected TimeValue timeForSetup;

	/**
	 * The cached value of the '{@link #getTimeForFading() <em>Time For Fading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeForFading()
	 * @generated
	 * @ordered
	 */
	protected TimeValue timeForFading;

	/**
	 * The cached value of the '{@link #getTimeForTeardown() <em>Time For Teardown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeForTeardown()
	 * @generated
	 * @ordered
	 */
	protected TimeValue timeForTeardown;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionTimingSpecificationThreePhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getTimeForSetup() {
		return timeForSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeForSetup(TimeValue newTimeForSetup, NotificationChain msgs) {
		TimeValue oldTimeForSetup = timeForSetup;
		timeForSetup = newTimeForSetup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP, oldTimeForSetup, newTimeForSetup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeForSetup(TimeValue newTimeForSetup) {
		if (newTimeForSetup != timeForSetup) {
			NotificationChain msgs = null;
			if (timeForSetup != null)
				msgs = ((InternalEObject)timeForSetup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP, null, msgs);
			if (newTimeForSetup != null)
				msgs = ((InternalEObject)newTimeForSetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP, null, msgs);
			msgs = basicSetTimeForSetup(newTimeForSetup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP, newTimeForSetup, newTimeForSetup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getTimeForFading() {
		return timeForFading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeForFading(TimeValue newTimeForFading, NotificationChain msgs) {
		TimeValue oldTimeForFading = timeForFading;
		timeForFading = newTimeForFading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING, oldTimeForFading, newTimeForFading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeForFading(TimeValue newTimeForFading) {
		if (newTimeForFading != timeForFading) {
			NotificationChain msgs = null;
			if (timeForFading != null)
				msgs = ((InternalEObject)timeForFading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING, null, msgs);
			if (newTimeForFading != null)
				msgs = ((InternalEObject)newTimeForFading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING, null, msgs);
			msgs = basicSetTimeForFading(newTimeForFading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING, newTimeForFading, newTimeForFading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getTimeForTeardown() {
		return timeForTeardown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeForTeardown(TimeValue newTimeForTeardown, NotificationChain msgs) {
		TimeValue oldTimeForTeardown = timeForTeardown;
		timeForTeardown = newTimeForTeardown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN, oldTimeForTeardown, newTimeForTeardown);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeForTeardown(TimeValue newTimeForTeardown) {
		if (newTimeForTeardown != timeForTeardown) {
			NotificationChain msgs = null;
			if (timeForTeardown != null)
				msgs = ((InternalEObject)timeForTeardown).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN, null, msgs);
			if (newTimeForTeardown != null)
				msgs = ((InternalEObject)newTimeForTeardown).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN, null, msgs);
			msgs = basicSetTimeForTeardown(newTimeForTeardown, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN, newTimeForTeardown, newTimeForTeardown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP:
				return basicSetTimeForSetup(null, msgs);
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING:
				return basicSetTimeForFading(null, msgs);
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN:
				return basicSetTimeForTeardown(null, msgs);
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
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP:
				return getTimeForSetup();
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING:
				return getTimeForFading();
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN:
				return getTimeForTeardown();
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
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP:
				setTimeForSetup((TimeValue)newValue);
				return;
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING:
				setTimeForFading((TimeValue)newValue);
				return;
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN:
				setTimeForTeardown((TimeValue)newValue);
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
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP:
				setTimeForSetup((TimeValue)null);
				return;
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING:
				setTimeForFading((TimeValue)null);
				return;
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN:
				setTimeForTeardown((TimeValue)null);
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
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_SETUP:
				return timeForSetup != null;
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_FADING:
				return timeForFading != null;
			case ReconfigurationPackage.EXECUTION_TIMING_SPECIFICATION_THREE_PHASE__TIME_FOR_TEARDOWN:
				return timeForTeardown != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionTimingSpecificationThreePhaseImpl
