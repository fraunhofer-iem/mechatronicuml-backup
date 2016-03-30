/**
 */
package org.muml.pm.hardware.hwresourceinstance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pm.hardware.hwresource.MemoryKind;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance;
import org.muml.pm.hardware.hwvaluetype.DataRate;
import org.muml.pm.hardware.hwvaluetype.DataSize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwresourceinstance.impl.MemoryResourceInstanceImpl#getMemoryType <em>Memory Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemoryResourceInstanceImpl extends AtomicResourceInstanceImpl implements MemoryResourceInstance {
	/**
	 * The cached value of the '{@link #getMemorySize() <em>Memory Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySize()
	 * @generated
	 * @ordered
	 */
	protected DataSize memorySize;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected DataRate throughput;

	/**
	 * The cached setting delegate for the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MEMORY_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwresourceinstancePackage.Literals.MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryResourceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwresourceinstancePackage.Literals.MEMORY_RESOURCE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize getMemorySize() {
		return memorySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemorySize(DataSize newMemorySize, NotificationChain msgs) {
		DataSize oldMemorySize = memorySize;
		memorySize = newMemorySize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE, oldMemorySize, newMemorySize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorySize(DataSize newMemorySize) {
		if (newMemorySize != memorySize) {
			NotificationChain msgs = null;
			if (memorySize != null)
				msgs = ((InternalEObject)memorySize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE, null, msgs);
			if (newMemorySize != null)
				msgs = ((InternalEObject)newMemorySize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE, null, msgs);
			msgs = basicSetMemorySize(newMemorySize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE, newMemorySize, newMemorySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRate getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThroughput(DataRate newThroughput, NotificationChain msgs) {
		DataRate oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__THROUGHPUT, oldThroughput, newThroughput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(DataRate newThroughput) {
		if (newThroughput != throughput) {
			NotificationChain msgs = null;
			if (throughput != null)
				msgs = ((InternalEObject)throughput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__THROUGHPUT, null, msgs);
			if (newThroughput != null)
				msgs = ((InternalEObject)newThroughput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__THROUGHPUT, null, msgs);
			msgs = basicSetThroughput(newThroughput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__THROUGHPUT, newThroughput, newThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryKind getMemoryType() {
		return (MemoryKind)MEMORY_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE:
				return basicSetMemorySize(null, msgs);
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__THROUGHPUT:
				return basicSetThroughput(null, msgs);
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
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE:
				return getMemorySize();
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__THROUGHPUT:
				return getThroughput();
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE:
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
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE:
				setMemorySize((DataSize)newValue);
				return;
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__THROUGHPUT:
				setThroughput((DataRate)newValue);
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
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE:
				setMemorySize((DataSize)null);
				return;
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__THROUGHPUT:
				setThroughput((DataRate)null);
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
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE:
				return memorySize != null;
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__THROUGHPUT:
				return throughput != null;
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE:
				return MEMORY_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //MemoryResourceInstanceImpl
