/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.impl.CommentableElementImpl;

import de.uni_paderborn.fujaba.muml.hardware.platform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.DelegationImpl#getHwPortInstance <em>Hw Port Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.DelegationImpl#getHwPortPart <em>Hw Port Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationImpl extends CommentableElementImpl implements Delegation {
	/**
	 * The cached value of the '{@link #getHwPortInstance() <em>Hw Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwPortInstance()
	 * @generated
	 * @ordered
	 */
	protected HWPortInstance hwPortInstance;
	/**
	 * The cached value of the '{@link #getHwPortPart() <em>Hw Port Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwPortPart()
	 * @generated
	 * @ordered
	 */
	protected HWPortPart hwPortPart;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.DELEGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortInstance getHwPortInstance() {
		if (hwPortInstance != null && hwPortInstance.eIsProxy()) {
			InternalEObject oldHwPortInstance = (InternalEObject)hwPortInstance;
			hwPortInstance = (HWPortInstance)eResolveProxy(oldHwPortInstance);
			if (hwPortInstance != oldHwPortInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.DELEGATION__HW_PORT_INSTANCE, oldHwPortInstance, hwPortInstance));
			}
		}
		return hwPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortInstance basicGetHwPortInstance() {
		return hwPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHwPortInstance(HWPortInstance newHwPortInstance, NotificationChain msgs) {
		HWPortInstance oldHwPortInstance = hwPortInstance;
		hwPortInstance = newHwPortInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatformPackage.DELEGATION__HW_PORT_INSTANCE, oldHwPortInstance, newHwPortInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwPortInstance(HWPortInstance newHwPortInstance) {
		if (newHwPortInstance != hwPortInstance) {
			NotificationChain msgs = null;
			if (hwPortInstance != null)
				msgs = ((InternalEObject)hwPortInstance).eInverseRemove(this, PlatformPackage.HW_PORT_INSTANCE__DELEGATION, HWPortInstance.class, msgs);
			if (newHwPortInstance != null)
				msgs = ((InternalEObject)newHwPortInstance).eInverseAdd(this, PlatformPackage.HW_PORT_INSTANCE__DELEGATION, HWPortInstance.class, msgs);
			msgs = basicSetHwPortInstance(newHwPortInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DELEGATION__HW_PORT_INSTANCE, newHwPortInstance, newHwPortInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortPart getHwPortPart() {
		if (hwPortPart != null && hwPortPart.eIsProxy()) {
			InternalEObject oldHwPortPart = (InternalEObject)hwPortPart;
			hwPortPart = (HWPortPart)eResolveProxy(oldHwPortPart);
			if (hwPortPart != oldHwPortPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.DELEGATION__HW_PORT_PART, oldHwPortPart, hwPortPart));
			}
		}
		return hwPortPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPortPart basicGetHwPortPart() {
		return hwPortPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwPortPart(HWPortPart newHwPortPart) {
		HWPortPart oldHwPortPart = hwPortPart;
		hwPortPart = newHwPortPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DELEGATION__HW_PORT_PART, oldHwPortPart, hwPortPart));
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
			case PlatformPackage.DELEGATION__HW_PORT_INSTANCE:
				if (hwPortInstance != null)
					msgs = ((InternalEObject)hwPortInstance).eInverseRemove(this, PlatformPackage.HW_PORT_INSTANCE__DELEGATION, HWPortInstance.class, msgs);
				return basicSetHwPortInstance((HWPortInstance)otherEnd, msgs);
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
			case PlatformPackage.DELEGATION__HW_PORT_INSTANCE:
				return basicSetHwPortInstance(null, msgs);
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
			case PlatformPackage.DELEGATION__HW_PORT_INSTANCE:
				if (resolve) return getHwPortInstance();
				return basicGetHwPortInstance();
			case PlatformPackage.DELEGATION__HW_PORT_PART:
				if (resolve) return getHwPortPart();
				return basicGetHwPortPart();
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
			case PlatformPackage.DELEGATION__HW_PORT_INSTANCE:
				setHwPortInstance((HWPortInstance)newValue);
				return;
			case PlatformPackage.DELEGATION__HW_PORT_PART:
				setHwPortPart((HWPortPart)newValue);
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
			case PlatformPackage.DELEGATION__HW_PORT_INSTANCE:
				setHwPortInstance((HWPortInstance)null);
				return;
			case PlatformPackage.DELEGATION__HW_PORT_PART:
				setHwPortPart((HWPortPart)null);
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
			case PlatformPackage.DELEGATION__HW_PORT_INSTANCE:
				return hwPortInstance != null;
			case PlatformPackage.DELEGATION__HW_PORT_PART:
				return hwPortPart != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationImpl
