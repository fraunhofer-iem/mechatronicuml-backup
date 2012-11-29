/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.HybridPort;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#isIsHybridInPort <em>Is Hybrid In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#isIsHybridOutPort <em>Is Hybrid Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#getSamplingInterval <em>Sampling Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HybridPortImpl extends DirectedTypedPortImpl implements HybridPort {
	/**
	 * The cached setting delegate for the '{@link #isIsHybridInPort() <em>Is Hybrid In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHybridInPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_HYBRID_IN_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.HYBRID_PORT__IS_HYBRID_IN_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isIsHybridOutPort() <em>Is Hybrid Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHybridOutPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_HYBRID_OUT_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.HYBRID_PORT__IS_HYBRID_OUT_PORT).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getSamplingInterval() <em>Sampling Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingInterval()
	 * @generated
	 * @ordered
	 */
	protected NaturalNumber samplingInterval;

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
	public boolean isIsHybridInPort() {
		return (Boolean)IS_HYBRID_IN_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHybridOutPort() {
		return (Boolean)IS_HYBRID_OUT_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber getSamplingInterval() {
		return samplingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSamplingInterval(NaturalNumber newSamplingInterval, NotificationChain msgs) {
		NaturalNumber oldSamplingInterval = samplingInterval;
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
	public void setSamplingInterval(NaturalNumber newSamplingInterval) {
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
			case ComponentPackage.HYBRID_PORT__IS_HYBRID_IN_PORT:
				return isIsHybridInPort();
			case ComponentPackage.HYBRID_PORT__IS_HYBRID_OUT_PORT:
				return isIsHybridOutPort();
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
				setSamplingInterval((NaturalNumber)newValue);
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
				setSamplingInterval((NaturalNumber)null);
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
			case ComponentPackage.HYBRID_PORT__IS_HYBRID_IN_PORT:
				return IS_HYBRID_IN_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.HYBRID_PORT__IS_HYBRID_OUT_PORT:
				return IS_HYBRID_OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL:
				return samplingInterval != null;
		}
		return super.eIsSet(featureID);
	}

} //HybridPortImpl
