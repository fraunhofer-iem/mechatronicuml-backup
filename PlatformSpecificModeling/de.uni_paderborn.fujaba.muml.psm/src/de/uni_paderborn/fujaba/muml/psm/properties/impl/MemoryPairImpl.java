/**
 */
package de.uni_paderborn.fujaba.muml.psm.properties.impl;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;

import de.uni_paderborn.fujaba.muml.psm.properties.MemoryPair;
import de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.MemoryPairImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.properties.impl.MemoryPairImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryPairImpl extends MinimalEObjectImpl.Container implements MemoryPair {
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected DataSize amount;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected StructuredResourceInstance resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.MEMORY_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize getAmount() {
		if (amount != null && amount.eIsProxy()) {
			InternalEObject oldAmount = (InternalEObject)amount;
			amount = (DataSize)eResolveProxy(oldAmount);
			if (amount != oldAmount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.MEMORY_PAIR__AMOUNT, oldAmount, amount));
			}
		}
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSize basicGetAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(DataSize newAmount) {
		DataSize oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.MEMORY_PAIR__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (StructuredResourceInstance)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.MEMORY_PAIR__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(StructuredResourceInstance newResource) {
		StructuredResourceInstance oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.MEMORY_PAIR__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.MEMORY_PAIR__AMOUNT:
				if (resolve) return getAmount();
				return basicGetAmount();
			case PropertiesPackage.MEMORY_PAIR__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case PropertiesPackage.MEMORY_PAIR__AMOUNT:
				setAmount((DataSize)newValue);
				return;
			case PropertiesPackage.MEMORY_PAIR__RESOURCE:
				setResource((StructuredResourceInstance)newValue);
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
			case PropertiesPackage.MEMORY_PAIR__AMOUNT:
				setAmount((DataSize)null);
				return;
			case PropertiesPackage.MEMORY_PAIR__RESOURCE:
				setResource((StructuredResourceInstance)null);
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
			case PropertiesPackage.MEMORY_PAIR__AMOUNT:
				return amount != null;
			case PropertiesPackage.MEMORY_PAIR__RESOURCE:
				return resource != null;
		}
		return super.eIsSet(featureID);
	}

} //MemoryPairImpl
