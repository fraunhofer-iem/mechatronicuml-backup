/**
 */
package org.muml.pm.hardware.hwplatforminstance.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.NamedElementImpl;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Platform Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl#getHwplatformType <em>Hwplatform Type</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl#getDelegationPorts <em>Delegation Ports</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl#getEmbeddedHPIC <em>Embedded HPIC</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.HWPlatformInstanceImpl#getParentHPIC <em>Parent HPIC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HWPlatformInstanceImpl extends NamedElementImpl implements HWPlatformInstance {
	/**
	 * The cached value of the '{@link #getHwplatformType() <em>Hwplatform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwplatformType()
	 * @generated
	 * @ordered
	 */
	protected HWPlatform hwplatformType;

	/**
	 * The cached value of the '{@link #getDelegationPorts() <em>Delegation Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DelegationHWPortInstance> delegationPorts;

	/**
	 * The cached value of the '{@link #getEmbeddedHPIC() <em>Embedded HPIC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedHPIC()
	 * @generated
	 * @ordered
	 */
	protected HWPlatformInstanceConfiguration embeddedHPIC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPlatformInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.HW_PLATFORM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform getHwplatformType() {
		if (hwplatformType != null && hwplatformType.eIsProxy()) {
			InternalEObject oldHwplatformType = (InternalEObject)hwplatformType;
			hwplatformType = (HWPlatform)eResolveProxy(oldHwplatformType);
			if (hwplatformType != oldHwplatformType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE, oldHwplatformType, hwplatformType));
			}
		}
		return hwplatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform basicGetHwplatformType() {
		return hwplatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwplatformType(HWPlatform newHwplatformType) {
		HWPlatform oldHwplatformType = hwplatformType;
		hwplatformType = newHwplatformType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE, oldHwplatformType, hwplatformType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegationHWPortInstance> getDelegationPorts() {
		if (delegationPorts == null) {
			delegationPorts = new EObjectContainmentWithInverseEList<DelegationHWPortInstance>(DelegationHWPortInstance.class, this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS, HwplatforminstancePackage.DELEGATION_HW_PORT_INSTANCE__PARENT_HW_PLATFORM_INSTANCE);
		}
		return delegationPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration getEmbeddedHPIC() {
		return embeddedHPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddedHPIC(HWPlatformInstanceConfiguration newEmbeddedHPIC, NotificationChain msgs) {
		HWPlatformInstanceConfiguration oldEmbeddedHPIC = embeddedHPIC;
		embeddedHPIC = newEmbeddedHPIC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC, oldEmbeddedHPIC, newEmbeddedHPIC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddedHPIC(HWPlatformInstanceConfiguration newEmbeddedHPIC) {
		if (newEmbeddedHPIC != embeddedHPIC) {
			NotificationChain msgs = null;
			if (embeddedHPIC != null)
				msgs = ((InternalEObject)embeddedHPIC).eInverseRemove(this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE, HWPlatformInstanceConfiguration.class, msgs);
			if (newEmbeddedHPIC != null)
				msgs = ((InternalEObject)newEmbeddedHPIC).eInverseAdd(this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__PARENT_HW_PLATFORM_INSTANCE, HWPlatformInstanceConfiguration.class, msgs);
			msgs = basicSetEmbeddedHPIC(newEmbeddedHPIC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC, newEmbeddedHPIC, newEmbeddedHPIC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration getParentHPIC() {
		if (eContainerFeatureID() != HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC) return null;
		return (HWPlatformInstanceConfiguration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentHPIC(HWPlatformInstanceConfiguration newParentHPIC, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentHPIC, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentHPIC(HWPlatformInstanceConfiguration newParentHPIC) {
		if (newParentHPIC != eInternalContainer() || (eContainerFeatureID() != HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC && newParentHPIC != null)) {
			if (EcoreUtil.isAncestor(this, newParentHPIC))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentHPIC != null)
				msgs = ((InternalEObject)newParentHPIC).eInverseAdd(this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES, HWPlatformInstanceConfiguration.class, msgs);
			msgs = basicSetParentHPIC(newParentHPIC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC, newParentHPIC, newParentHPIC));
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegationPorts()).basicAdd(otherEnd, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC:
				if (embeddedHPIC != null)
					msgs = ((InternalEObject)embeddedHPIC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC, null, msgs);
				return basicSetEmbeddedHPIC((HWPlatformInstanceConfiguration)otherEnd, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentHPIC((HWPlatformInstanceConfiguration)otherEnd, msgs);
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return ((InternalEList<?>)getDelegationPorts()).basicRemove(otherEnd, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC:
				return basicSetEmbeddedHPIC(null, msgs);
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC:
				return basicSetParentHPIC(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC:
				return eInternalContainer().eInverseRemove(this, HwplatforminstancePackage.HW_PLATFORM_INSTANCE_CONFIGURATION__HWPLATFORM_INSTANCES, HWPlatformInstanceConfiguration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				if (resolve) return getHwplatformType();
				return basicGetHwplatformType();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return getDelegationPorts();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC:
				return getEmbeddedHPIC();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC:
				return getParentHPIC();
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				setHwplatformType((HWPlatform)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				getDelegationPorts().clear();
				getDelegationPorts().addAll((Collection<? extends DelegationHWPortInstance>)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC:
				setEmbeddedHPIC((HWPlatformInstanceConfiguration)newValue);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC:
				setParentHPIC((HWPlatformInstanceConfiguration)newValue);
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				setHwplatformType((HWPlatform)null);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				getDelegationPorts().clear();
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC:
				setEmbeddedHPIC((HWPlatformInstanceConfiguration)null);
				return;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC:
				setParentHPIC((HWPlatformInstanceConfiguration)null);
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
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__HWPLATFORM_TYPE:
				return hwplatformType != null;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__DELEGATION_PORTS:
				return delegationPorts != null && !delegationPorts.isEmpty();
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__EMBEDDED_HPIC:
				return embeddedHPIC != null;
			case HwplatforminstancePackage.HW_PLATFORM_INSTANCE__PARENT_HPIC:
				return getParentHPIC() != null;
		}
		return super.eIsSet(featureID);
	}

} //HWPlatformInstanceImpl
