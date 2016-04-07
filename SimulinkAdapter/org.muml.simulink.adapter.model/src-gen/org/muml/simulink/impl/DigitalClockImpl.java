/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.simulink.DigitalClock;
import org.muml.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.impl.DigitalClockImpl#getSampleTime <em>Sample Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitalClockImpl extends BlockImpl implements DigitalClock {
	/**
	 * The default value of the '{@link #getSampleTime() <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTime()
	 * @generated
	 * @ordered
	 */
	protected static final double SAMPLE_TIME_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getSampleTime() <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTime()
	 * @generated
	 * @ordered
	 */
	protected double sampleTime = SAMPLE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalClockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.DIGITAL_CLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSampleTime() {
		return sampleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleTime(double newSampleTime) {
		double oldSampleTime = sampleTime;
		sampleTime = newSampleTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.DIGITAL_CLOCK__SAMPLE_TIME, oldSampleTime, sampleTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.DIGITAL_CLOCK__SAMPLE_TIME:
				return getSampleTime();
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
			case SimulinkPackage.DIGITAL_CLOCK__SAMPLE_TIME:
				setSampleTime((Double)newValue);
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
			case SimulinkPackage.DIGITAL_CLOCK__SAMPLE_TIME:
				setSampleTime(SAMPLE_TIME_EDEFAULT);
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
			case SimulinkPackage.DIGITAL_CLOCK__SAMPLE_TIME:
				return sampleTime != SAMPLE_TIME_EDEFAULT;
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
		result.append(" (sampleTime: ");
		result.append(sampleTime);
		result.append(')');
		return result.toString();
	}

} //DigitalClockImpl
