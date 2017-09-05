/**
 */
package org.opendds.modeling.sdk.model.GeneratorSpecification.Impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.opendds.modeling.sdk.model.GeneratorSpecification.GeneratorPackage;
import org.opendds.modeling.sdk.model.GeneratorSpecification.PassiveConnectDuration;
import org.opendds.modeling.sdk.model.GeneratorSpecification.SwapBytes;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TransportConfig;
import org.opendds.modeling.sdk.model.GeneratorSpecification.TransportRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportConfigImpl#getTransportRef <em>Transport Ref</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportConfigImpl#getPassive_connect_duration <em>Passive connect duration</em>}</li>
 *   <li>{@link org.opendds.modeling.sdk.model.GeneratorSpecification.Impl.TransportConfigImpl#getSwap_bytes <em>Swap bytes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportConfigImpl extends EObjectImpl implements TransportConfig {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransportRef() <em>Transport Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportRef()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportRef> transportRef;

	/**
	 * The cached value of the '{@link #getPassive_connect_duration() <em>Passive connect duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassive_connect_duration()
	 * @generated
	 * @ordered
	 */
	protected PassiveConnectDuration passive_connect_duration;

	/**
	 * The cached value of the '{@link #getSwap_bytes() <em>Swap bytes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwap_bytes()
	 * @generated
	 * @ordered
	 */
	protected SwapBytes swap_bytes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.TRANSPORT_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TRANSPORT_CONFIG__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransportRef> getTransportRef() {
		if (transportRef == null) {
			transportRef = new EObjectContainmentEList<TransportRef>(TransportRef.class, this,
					GeneratorPackage.TRANSPORT_CONFIG__TRANSPORT_REF);
		}
		return transportRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveConnectDuration getPassive_connect_duration() {
		return passive_connect_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassive_connect_duration(PassiveConnectDuration newPassive_connect_duration,
			NotificationChain msgs) {
		PassiveConnectDuration oldPassive_connect_duration = passive_connect_duration;
		passive_connect_duration = newPassive_connect_duration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION, oldPassive_connect_duration,
					newPassive_connect_duration);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassive_connect_duration(PassiveConnectDuration newPassive_connect_duration) {
		if (newPassive_connect_duration != passive_connect_duration) {
			NotificationChain msgs = null;
			if (passive_connect_duration != null)
				msgs = ((InternalEObject) passive_connect_duration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION, null,
						msgs);
			if (newPassive_connect_duration != null)
				msgs = ((InternalEObject) newPassive_connect_duration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION, null,
						msgs);
			msgs = basicSetPassive_connect_duration(newPassive_connect_duration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION, newPassive_connect_duration,
					newPassive_connect_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwapBytes getSwap_bytes() {
		return swap_bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwap_bytes(SwapBytes newSwap_bytes, NotificationChain msgs) {
		SwapBytes oldSwap_bytes = swap_bytes;
		swap_bytes = newSwap_bytes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.TRANSPORT_CONFIG__SWAP_BYTES, oldSwap_bytes, newSwap_bytes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwap_bytes(SwapBytes newSwap_bytes) {
		if (newSwap_bytes != swap_bytes) {
			NotificationChain msgs = null;
			if (swap_bytes != null)
				msgs = ((InternalEObject) swap_bytes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_CONFIG__SWAP_BYTES, null, msgs);
			if (newSwap_bytes != null)
				msgs = ((InternalEObject) newSwap_bytes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.TRANSPORT_CONFIG__SWAP_BYTES, null, msgs);
			msgs = basicSetSwap_bytes(newSwap_bytes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TRANSPORT_CONFIG__SWAP_BYTES,
					newSwap_bytes, newSwap_bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.TRANSPORT_CONFIG__TRANSPORT_REF:
			return ((InternalEList<?>) getTransportRef()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION:
			return basicSetPassive_connect_duration(null, msgs);
		case GeneratorPackage.TRANSPORT_CONFIG__SWAP_BYTES:
			return basicSetSwap_bytes(null, msgs);
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
		case GeneratorPackage.TRANSPORT_CONFIG__NAME:
			return getName();
		case GeneratorPackage.TRANSPORT_CONFIG__TRANSPORT_REF:
			return getTransportRef();
		case GeneratorPackage.TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION:
			return getPassive_connect_duration();
		case GeneratorPackage.TRANSPORT_CONFIG__SWAP_BYTES:
			return getSwap_bytes();
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
		case GeneratorPackage.TRANSPORT_CONFIG__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.TRANSPORT_CONFIG__TRANSPORT_REF:
			getTransportRef().clear();
			getTransportRef().addAll((Collection<? extends TransportRef>) newValue);
			return;
		case GeneratorPackage.TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION:
			setPassive_connect_duration((PassiveConnectDuration) newValue);
			return;
		case GeneratorPackage.TRANSPORT_CONFIG__SWAP_BYTES:
			setSwap_bytes((SwapBytes) newValue);
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
		case GeneratorPackage.TRANSPORT_CONFIG__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.TRANSPORT_CONFIG__TRANSPORT_REF:
			getTransportRef().clear();
			return;
		case GeneratorPackage.TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION:
			setPassive_connect_duration((PassiveConnectDuration) null);
			return;
		case GeneratorPackage.TRANSPORT_CONFIG__SWAP_BYTES:
			setSwap_bytes((SwapBytes) null);
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
		case GeneratorPackage.TRANSPORT_CONFIG__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.TRANSPORT_CONFIG__TRANSPORT_REF:
			return transportRef != null && !transportRef.isEmpty();
		case GeneratorPackage.TRANSPORT_CONFIG__PASSIVE_CONNECT_DURATION:
			return passive_connect_duration != null;
		case GeneratorPackage.TRANSPORT_CONFIG__SWAP_BYTES:
			return swap_bytes != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransportConfigImpl
