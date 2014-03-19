/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.CommentableElementImpl;

import de.uni_paderborn.fujaba.muml.hardware.platform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import java.util.Collection;

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
	 * The cached value of the '{@link #getHwPortInstance() <em>Hw Port Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwPortInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPortInstance> hwPortInstance;
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
	public EList<HWPortInstance> getHwPortInstance() {
		if (hwPortInstance == null) {
			hwPortInstance = new EObjectWithInverseResolvingEList.ManyInverse<HWPortInstance>(HWPortInstance.class, this, PlatformPackage.DELEGATION__HW_PORT_INSTANCE, PlatformPackage.HW_PORT_INSTANCE__DELEGATION);
		}
		return hwPortInstance;
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
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHwPortInstance()).basicAdd(otherEnd, msgs);
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
				return ((InternalEList<?>)getHwPortInstance()).basicRemove(otherEnd, msgs);
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
				return getHwPortInstance();
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
				getHwPortInstance().clear();
				getHwPortInstance().addAll((Collection<? extends HWPortInstance>)newValue);
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
				getHwPortInstance().clear();
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
				return hwPortInstance != null && !hwPortInstance.isEmpty();
			case PlatformPackage.DELEGATION__HW_PORT_PART:
				return hwPortPart != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationImpl
