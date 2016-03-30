/**
 */
package org.muml.pm.hardware.hwresource.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.MemoryAccessKind;
import org.muml.pm.hardware.hwresource.MemoryKind;
import org.muml.pm.hardware.hwresource.MemoryResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.MemoryResourceImpl#getMemoryAccess <em>Memory Access</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.MemoryResourceImpl#isIsVolatile <em>Is Volatile</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresource.impl.MemoryResourceImpl#getMemoryType <em>Memory Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryResourceImpl extends AtomicResourceImpl implements MemoryResource {
	/**
	 * The default value of the '{@link #getMemoryAccess() <em>Memory Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryAccess()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryAccessKind MEMORY_ACCESS_EDEFAULT = MemoryAccessKind.READ_WRITE;

	/**
	 * The cached value of the '{@link #getMemoryAccess() <em>Memory Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryAccess()
	 * @generated
	 * @ordered
	 */
	protected MemoryAccessKind memoryAccess = MEMORY_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean isVolatile = IS_VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryKind MEMORY_TYPE_EDEFAULT = MemoryKind.RAM;

	/**
	 * The cached value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected MemoryKind memoryType = MEMORY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourcePackage.Literals.MEMORY_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAccessKind getMemoryAccess() {
		return memoryAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryAccess(MemoryAccessKind newMemoryAccess) {
		MemoryAccessKind oldMemoryAccess = memoryAccess;
		memoryAccess = newMemoryAccess == null ? MEMORY_ACCESS_EDEFAULT : newMemoryAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.MEMORY_RESOURCE__MEMORY_ACCESS, oldMemoryAccess, memoryAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVolatile() {
		return isVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVolatile(boolean newIsVolatile) {
		boolean oldIsVolatile = isVolatile;
		isVolatile = newIsVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.MEMORY_RESOURCE__IS_VOLATILE, oldIsVolatile, isVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryKind getMemoryType() {
		return memoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryType(MemoryKind newMemoryType) {
		MemoryKind oldMemoryType = memoryType;
		memoryType = newMemoryType == null ? MEMORY_TYPE_EDEFAULT : newMemoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourcePackage.MEMORY_RESOURCE__MEMORY_TYPE, oldMemoryType, memoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwresourcePackage.MEMORY_RESOURCE__MEMORY_ACCESS:
				return getMemoryAccess();
			case HwresourcePackage.MEMORY_RESOURCE__IS_VOLATILE:
				return isIsVolatile();
			case HwresourcePackage.MEMORY_RESOURCE__MEMORY_TYPE:
				return getMemoryType();
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
			case HwresourcePackage.MEMORY_RESOURCE__MEMORY_ACCESS:
				setMemoryAccess((MemoryAccessKind)newValue);
				return;
			case HwresourcePackage.MEMORY_RESOURCE__IS_VOLATILE:
				setIsVolatile((Boolean)newValue);
				return;
			case HwresourcePackage.MEMORY_RESOURCE__MEMORY_TYPE:
				setMemoryType((MemoryKind)newValue);
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
			case HwresourcePackage.MEMORY_RESOURCE__MEMORY_ACCESS:
				setMemoryAccess(MEMORY_ACCESS_EDEFAULT);
				return;
			case HwresourcePackage.MEMORY_RESOURCE__IS_VOLATILE:
				setIsVolatile(IS_VOLATILE_EDEFAULT);
				return;
			case HwresourcePackage.MEMORY_RESOURCE__MEMORY_TYPE:
				setMemoryType(MEMORY_TYPE_EDEFAULT);
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
			case HwresourcePackage.MEMORY_RESOURCE__MEMORY_ACCESS:
				return memoryAccess != MEMORY_ACCESS_EDEFAULT;
			case HwresourcePackage.MEMORY_RESOURCE__IS_VOLATILE:
				return isVolatile != IS_VOLATILE_EDEFAULT;
			case HwresourcePackage.MEMORY_RESOURCE__MEMORY_TYPE:
				return memoryType != MEMORY_TYPE_EDEFAULT;
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
		result.append(" (memoryAccess: ");
		result.append(memoryAccess);
		result.append(", isVolatile: ");
		result.append(isVolatile);
		result.append(", memoryType: ");
		result.append(memoryType);
		result.append(')');
		return result.toString();
	}

} //MemoryResourceImpl
