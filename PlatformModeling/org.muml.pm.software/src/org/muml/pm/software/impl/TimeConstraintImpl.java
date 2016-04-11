/**
 */
package org.muml.pm.software.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.pim.valuetype.TimeValue;

import org.muml.pm.software.SoftwarePackage;
import org.muml.pm.software.TimeConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.software.impl.TimeConstraintImpl#getSamplingTime <em>Sampling Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeConstraintImpl extends ConstraintImpl implements TimeConstraint {
	/**
	 * The cached value of the '{@link #getSamplingTime() <em>Sampling Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValue samplingTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.TIME_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getSamplingTime() {
		return samplingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSamplingTime(TimeValue newSamplingTime, NotificationChain msgs) {
		TimeValue oldSamplingTime = samplingTime;
		samplingTime = newSamplingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwarePackage.TIME_CONSTRAINT__SAMPLING_TIME, oldSamplingTime, newSamplingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingTime(TimeValue newSamplingTime) {
		if (newSamplingTime != samplingTime) {
			NotificationChain msgs = null;
			if (samplingTime != null)
				msgs = ((InternalEObject)samplingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwarePackage.TIME_CONSTRAINT__SAMPLING_TIME, null, msgs);
			if (newSamplingTime != null)
				msgs = ((InternalEObject)newSamplingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwarePackage.TIME_CONSTRAINT__SAMPLING_TIME, null, msgs);
			msgs = basicSetSamplingTime(newSamplingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.TIME_CONSTRAINT__SAMPLING_TIME, newSamplingTime, newSamplingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwarePackage.TIME_CONSTRAINT__SAMPLING_TIME:
				return basicSetSamplingTime(null, msgs);
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
			case SoftwarePackage.TIME_CONSTRAINT__SAMPLING_TIME:
				return getSamplingTime();
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
			case SoftwarePackage.TIME_CONSTRAINT__SAMPLING_TIME:
				setSamplingTime((TimeValue)newValue);
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
			case SoftwarePackage.TIME_CONSTRAINT__SAMPLING_TIME:
				setSamplingTime((TimeValue)null);
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
			case SoftwarePackage.TIME_CONSTRAINT__SAMPLING_TIME:
				return samplingTime != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeConstraintImpl
