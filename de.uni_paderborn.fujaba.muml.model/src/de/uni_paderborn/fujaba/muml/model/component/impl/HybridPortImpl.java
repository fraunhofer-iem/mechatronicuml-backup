/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import de.uni_paderborn.fujaba.muml.model.behavior.BehaviorPackage;
import de.uni_paderborn.fujaba.muml.model.behavior.ITypedNamedElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.HybridPort;
import de.uni_paderborn.fujaba.muml.model.types.DataType;
import de.uni_paderborn.fujaba.muml.model.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.HybridPortImpl#getSamplingInterval <em>Sampling Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HybridPortImpl extends DirectedTypedPortImpl implements HybridPort {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType;

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
	public DataType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (DataType)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.HYBRID_PORT__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.HYBRID_PORT__DATA_TYPE, oldDataType, dataType));
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
			case ComponentPackage.HYBRID_PORT__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
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
			case ComponentPackage.HYBRID_PORT__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
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
			case ComponentPackage.HYBRID_PORT__DATA_TYPE:
				setDataType((DataType)null);
				return;
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
			case ComponentPackage.HYBRID_PORT__DATA_TYPE:
				return dataType != null;
			case ComponentPackage.HYBRID_PORT__SAMPLING_INTERVAL:
				return samplingInterval != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ITypedNamedElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.HYBRID_PORT__DATA_TYPE: return BehaviorPackage.ITYPED_NAMED_ELEMENT__DATA_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ITypedNamedElement.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.ITYPED_NAMED_ELEMENT__DATA_TYPE: return ComponentPackage.HYBRID_PORT__DATA_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HybridPortImpl
