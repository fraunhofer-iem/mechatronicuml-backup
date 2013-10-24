/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.hardware.platform.AtomicResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.impl.AtomicResourceInstanceImpl#getParentStructuredResourceInstance <em>Parent Structured Resource Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AtomicResourceInstanceImpl extends ResourceInstanceImpl implements AtomicResourceInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicResourceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.ATOMIC_RESOURCE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance getParentStructuredResourceInstance() {
		if (eContainerFeatureID() != PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE) return null;
		return (StructuredResourceInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructuredResourceInstance(StructuredResourceInstance newParentStructuredResourceInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructuredResourceInstance, PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructuredResourceInstance(StructuredResourceInstance newParentStructuredResourceInstance) {
		if (newParentStructuredResourceInstance != eInternalContainer() || (eContainerFeatureID() != PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE && newParentStructuredResourceInstance != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructuredResourceInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructuredResourceInstance != null)
				msgs = ((InternalEObject)newParentStructuredResourceInstance).eInverseAdd(this, PlatformPackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES, StructuredResourceInstance.class, msgs);
			msgs = basicSetParentStructuredResourceInstance(newParentStructuredResourceInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE, newParentStructuredResourceInstance, newParentStructuredResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStructuredResourceInstance((StructuredResourceInstance)otherEnd, msgs);
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
			case PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE:
				return basicSetParentStructuredResourceInstance(null, msgs);
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
			case PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, PlatformPackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES, StructuredResourceInstance.class, msgs);
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
			case PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE:
				return getParentStructuredResourceInstance();
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
			case PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE:
				setParentStructuredResourceInstance((StructuredResourceInstance)newValue);
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
			case PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE:
				setParentStructuredResourceInstance((StructuredResourceInstance)null);
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
			case PlatformPackage.ATOMIC_RESOURCE_INSTANCE__PARENT_STRUCTURED_RESOURCE_INSTANCE:
				return getParentStructuredResourceInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //AtomicResourceInstanceImpl
