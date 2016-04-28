/**
 */
package org.muml.pm.hardware.hwplatform.impl;

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
import org.muml.pim.valuetype.Cardinality;
import org.muml.pm.hardware.hwplatform.HWPlatform;
import org.muml.pm.hardware.hwplatform.HWPortPart;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.PlatformPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.PlatformPartImpl#getParentHWPlatform <em>Parent HW Platform</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.PlatformPartImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.PlatformPartImpl#getHwPortParts <em>Hw Port Parts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PlatformPartImpl extends NamedElementImpl implements PlatformPart {
	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

	/**
	 * The cached value of the '{@link #getHwPortParts() <em>Hw Port Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwPortParts()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPortPart> hwPortParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.PLATFORM_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatform getParentHWPlatform() {
		if (eContainerFeatureID() != HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM) return null;
		return (HWPlatform)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentHWPlatform(HWPlatform newParentHWPlatform, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentHWPlatform, HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentHWPlatform(HWPlatform newParentHWPlatform) {
		if (newParentHWPlatform != eInternalContainer() || (eContainerFeatureID() != HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM && newParentHWPlatform != null)) {
			if (EcoreUtil.isAncestor(this, newParentHWPlatform))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentHWPlatform != null)
				msgs = ((InternalEObject)newParentHWPlatform).eInverseAdd(this, HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS, HWPlatform.class, msgs);
			msgs = basicSetParentHWPlatform(newParentHWPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM, newParentHWPlatform, newParentHWPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwplatformPackage.PLATFORM_PART__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwplatformPackage.PLATFORM_PART__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwplatformPackage.PLATFORM_PART__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.PLATFORM_PART__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPortPart> getHwPortParts() {
		if (hwPortParts == null) {
			hwPortParts = new EObjectContainmentWithInverseEList<HWPortPart>(HWPortPart.class, this, HwplatformPackage.PLATFORM_PART__HW_PORT_PARTS, HwplatformPackage.HW_PORT_PART__PARENT_PLATFORM_PART);
		}
		return hwPortParts;
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
			case HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentHWPlatform((HWPlatform)otherEnd, msgs);
			case HwplatformPackage.PLATFORM_PART__HW_PORT_PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHwPortParts()).basicAdd(otherEnd, msgs);
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
			case HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM:
				return basicSetParentHWPlatform(null, msgs);
			case HwplatformPackage.PLATFORM_PART__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case HwplatformPackage.PLATFORM_PART__HW_PORT_PARTS:
				return ((InternalEList<?>)getHwPortParts()).basicRemove(otherEnd, msgs);
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
			case HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM:
				return eInternalContainer().eInverseRemove(this, HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS, HWPlatform.class, msgs);
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
			case HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM:
				return getParentHWPlatform();
			case HwplatformPackage.PLATFORM_PART__CARDINALITY:
				return getCardinality();
			case HwplatformPackage.PLATFORM_PART__HW_PORT_PARTS:
				return getHwPortParts();
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
			case HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM:
				setParentHWPlatform((HWPlatform)newValue);
				return;
			case HwplatformPackage.PLATFORM_PART__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case HwplatformPackage.PLATFORM_PART__HW_PORT_PARTS:
				getHwPortParts().clear();
				getHwPortParts().addAll((Collection<? extends HWPortPart>)newValue);
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
			case HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM:
				setParentHWPlatform((HWPlatform)null);
				return;
			case HwplatformPackage.PLATFORM_PART__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case HwplatformPackage.PLATFORM_PART__HW_PORT_PARTS:
				getHwPortParts().clear();
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
			case HwplatformPackage.PLATFORM_PART__PARENT_HW_PLATFORM:
				return getParentHWPlatform() != null;
			case HwplatformPackage.PLATFORM_PART__CARDINALITY:
				return cardinality != null;
			case HwplatformPackage.PLATFORM_PART__HW_PORT_PARTS:
				return hwPortParts != null && !hwPortParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformPartImpl
