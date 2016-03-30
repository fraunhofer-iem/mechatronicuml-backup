/**
 */
package org.muml.pm.hardware.hwresourceinstance.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pm.hardware.hwresourceinstance.CacheInstance;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.ProcessorInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.impl.ProcessorInstanceImpl#getMIPS <em>MIPS</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.impl.ProcessorInstanceImpl#getCPI <em>CPI</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.impl.ProcessorInstanceImpl#getOwnedCacheInstance <em>Owned Cache Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorInstanceImpl extends ComputingResourceInstanceImpl implements ProcessorInstance {
	/**
	 * The default value of the '{@link #getMIPS() <em>MIPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIPS()
	 * @generated
	 * @ordered
	 */
	protected static final float MIPS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMIPS() <em>MIPS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIPS()
	 * @generated
	 * @ordered
	 */
	protected float mips = MIPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCPI() <em>CPI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPI()
	 * @generated
	 * @ordered
	 */
	protected static final float CPI_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCPI() <em>CPI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPI()
	 * @generated
	 * @ordered
	 */
	protected float cpi = CPI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedCacheInstance() <em>Owned Cache Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCacheInstance()
	 * @generated
	 * @ordered
	 */
	protected CacheInstance ownedCacheInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourceinstancePackage.Literals.PROCESSOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMIPS() {
		return mips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMIPS(float newMIPS) {
		float oldMIPS = mips;
		mips = newMIPS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourceinstancePackage.PROCESSOR_INSTANCE__MIPS, oldMIPS, mips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCPI() {
		return cpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPI(float newCPI) {
		float oldCPI = cpi;
		cpi = newCPI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourceinstancePackage.PROCESSOR_INSTANCE__CPI, oldCPI, cpi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheInstance getOwnedCacheInstance() {
		if (ownedCacheInstance != null && ownedCacheInstance.eIsProxy()) {
			InternalEObject oldOwnedCacheInstance = (InternalEObject)ownedCacheInstance;
			ownedCacheInstance = (CacheInstance)eResolveProxy(oldOwnedCacheInstance);
			if (ownedCacheInstance != oldOwnedCacheInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwresourceinstancePackage.PROCESSOR_INSTANCE__OWNED_CACHE_INSTANCE, oldOwnedCacheInstance, ownedCacheInstance));
			}
		}
		return ownedCacheInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheInstance basicGetOwnedCacheInstance() {
		return ownedCacheInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedCacheInstance(CacheInstance newOwnedCacheInstance) {
		CacheInstance oldOwnedCacheInstance = ownedCacheInstance;
		ownedCacheInstance = newOwnedCacheInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourceinstancePackage.PROCESSOR_INSTANCE__OWNED_CACHE_INSTANCE, oldOwnedCacheInstance, ownedCacheInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__MIPS:
				return getMIPS();
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__CPI:
				return getCPI();
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__OWNED_CACHE_INSTANCE:
				if (resolve) return getOwnedCacheInstance();
				return basicGetOwnedCacheInstance();
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
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__MIPS:
				setMIPS((Float)newValue);
				return;
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__CPI:
				setCPI((Float)newValue);
				return;
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__OWNED_CACHE_INSTANCE:
				setOwnedCacheInstance((CacheInstance)newValue);
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
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__MIPS:
				setMIPS(MIPS_EDEFAULT);
				return;
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__CPI:
				setCPI(CPI_EDEFAULT);
				return;
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__OWNED_CACHE_INSTANCE:
				setOwnedCacheInstance((CacheInstance)null);
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
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__MIPS:
				return mips != MIPS_EDEFAULT;
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__CPI:
				return cpi != CPI_EDEFAULT;
			case HwresourceinstancePackage.PROCESSOR_INSTANCE__OWNED_CACHE_INSTANCE:
				return ownedCacheInstance != null;
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
		result.append(" (MIPS: ");
		result.append(mips);
		result.append(", CPI: ");
		result.append(cpi);
		result.append(')');
		return result.toString();
	}

} //ProcessorInstanceImpl
