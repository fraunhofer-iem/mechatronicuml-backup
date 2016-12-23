/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.HybridPort;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.impl.HybridPortImpl#getSamplingInterval <em>Sampling Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HybridPortImpl extends DirectedTypedPortImpl implements HybridPort {
	/**
	 * The cached value of the '{@link #getSamplingInterval() <em>Sampling Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingInterval()
	 * @generated
	 * @ordered
	 */
	protected TimeValue samplingInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.HYBRID_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getSamplingInterval() {
		return samplingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSamplingInterval(TimeValue newSamplingInterval, NotificationChain msgs) {
		TimeValue oldSamplingInterval = samplingInterval;
		samplingInterval = newSamplingInterval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL, oldSamplingInterval, newSamplingInterval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingInterval(TimeValue newSamplingInterval) {
		if (newSamplingInterval != samplingInterval) {
			NotificationChain msgs = null;
			if (samplingInterval != null)
				msgs = ((InternalEObject)samplingInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL, null, msgs);
			if (newSamplingInterval != null)
				msgs = ((InternalEObject)newSamplingInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL, null, msgs);
			msgs = basicSetSamplingInterval(newSamplingInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL, newSamplingInterval, newSamplingInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL:
				return basicSetSamplingInterval(null, msgs);
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
			case ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL:
				return getSamplingInterval();
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
			case ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL:
				setSamplingInterval((TimeValue)newValue);
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
			case ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL:
				setSamplingInterval((TimeValue)null);
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
			case ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL:
				return samplingInterval != null;
		}
		return super.eIsSet(featureID);
	}

} //HybridPortImpl
