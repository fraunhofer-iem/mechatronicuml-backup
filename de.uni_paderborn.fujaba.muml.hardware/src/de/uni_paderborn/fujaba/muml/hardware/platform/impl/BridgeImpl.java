/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;
import de.uni_paderborn.fujaba.muml.hardware.platform.Bridge;
import de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.BridgeImpl#getConnectedCommunicationMedia <em>Connected Communication Media</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.BridgeImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BridgeImpl extends CommunicationResourceImpl implements Bridge {
	/**
	 * The cached value of the '{@link #getConnectedCommunicationMedia() <em>Connected Communication Media</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedCommunicationMedia()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationMedia> connectedCommunicationMedia;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval delay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BridgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.BRIDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationMedia> getConnectedCommunicationMedia() {
		if (connectedCommunicationMedia == null) {
			connectedCommunicationMedia = new EObjectWithInverseResolvingEList.ManyInverse<CommunicationMedia>(CommunicationMedia.class, this, PlatformPackage.BRIDGE__CONNECTED_COMMUNICATION_MEDIA, PlatformPackage.COMMUNICATION_MEDIA__CONNECTED_BRIDGES);
		}
		return connectedCommunicationMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelay(TimeInterval newDelay, NotificationChain msgs) {
		TimeInterval oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.BRIDGE__DELAY, oldDelay, newDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(TimeInterval newDelay) {
		if (newDelay != delay) {
			NotificationChain msgs = null;
			if (delay != null)
				msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.BRIDGE__DELAY, null, msgs);
			if (newDelay != null)
				msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatformPackage.BRIDGE__DELAY, null, msgs);
			msgs = basicSetDelay(newDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.BRIDGE__DELAY, newDelay, newDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.BRIDGE__CONNECTED_COMMUNICATION_MEDIA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedCommunicationMedia()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.BRIDGE__CONNECTED_COMMUNICATION_MEDIA:
				return ((InternalEList<?>)getConnectedCommunicationMedia()).basicRemove(otherEnd, msgs);
			case PlatformPackage.BRIDGE__DELAY:
				return basicSetDelay(null, msgs);
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
			case PlatformPackage.BRIDGE__CONNECTED_COMMUNICATION_MEDIA:
				return getConnectedCommunicationMedia();
			case PlatformPackage.BRIDGE__DELAY:
				return getDelay();
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
			case PlatformPackage.BRIDGE__CONNECTED_COMMUNICATION_MEDIA:
				getConnectedCommunicationMedia().clear();
				getConnectedCommunicationMedia().addAll((Collection<? extends CommunicationMedia>)newValue);
				return;
			case PlatformPackage.BRIDGE__DELAY:
				setDelay((TimeInterval)newValue);
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
			case PlatformPackage.BRIDGE__CONNECTED_COMMUNICATION_MEDIA:
				getConnectedCommunicationMedia().clear();
				return;
			case PlatformPackage.BRIDGE__DELAY:
				setDelay((TimeInterval)null);
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
			case PlatformPackage.BRIDGE__CONNECTED_COMMUNICATION_MEDIA:
				return connectedCommunicationMedia != null && !connectedCommunicationMedia.isEmpty();
			case PlatformPackage.BRIDGE__DELAY:
				return delay != null;
		}
		return super.eIsSet(featureID);
	}

} //BridgeImpl
