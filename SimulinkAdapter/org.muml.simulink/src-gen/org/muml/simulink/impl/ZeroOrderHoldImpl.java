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
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.ZeroOrderHold;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zero Order Hold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.impl.ZeroOrderHoldImpl#getSampleTime <em>Sample Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZeroOrderHoldImpl extends BlockImpl implements ZeroOrderHold {
	/**
	 * The default value of the '{@link #getSampleTime() <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSampleTime() <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTime()
	 * @generated
	 * @ordered
	 */
	protected String sampleTime = SAMPLE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZeroOrderHoldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.ZERO_ORDER_HOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSampleTime() {
		return sampleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleTime(String newSampleTime) {
		String oldSampleTime = sampleTime;
		sampleTime = newSampleTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.ZERO_ORDER_HOLD__SAMPLE_TIME, oldSampleTime, sampleTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.ZERO_ORDER_HOLD__SAMPLE_TIME:
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
			case SimulinkPackage.ZERO_ORDER_HOLD__SAMPLE_TIME:
				setSampleTime((String)newValue);
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
			case SimulinkPackage.ZERO_ORDER_HOLD__SAMPLE_TIME:
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
			case SimulinkPackage.ZERO_ORDER_HOLD__SAMPLE_TIME:
				return SAMPLE_TIME_EDEFAULT == null ? sampleTime != null : !SAMPLE_TIME_EDEFAULT.equals(sampleTime);
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

} //ZeroOrderHoldImpl
