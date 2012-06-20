/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerImpl#getSpecificationEntries <em>Specification Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerImpl extends ReconfigurationControllerImpl implements Manager {
	/**
	 * The cached value of the '{@link #getSpecificationEntries() <em>Specification Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagerSpecificationEntry> specificationEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagerSpecificationEntry> getSpecificationEntries() {
		if (specificationEntries == null) {
			specificationEntries = new EObjectContainmentWithInverseEList<ManagerSpecificationEntry>(ManagerSpecificationEntry.class, this, ReconfigurationPackage.MANAGER__SPECIFICATION_ENTRIES, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER);
		}
		return specificationEntries;
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
			case ReconfigurationPackage.MANAGER__SPECIFICATION_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecificationEntries()).basicAdd(otherEnd, msgs);
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
			case ReconfigurationPackage.MANAGER__SPECIFICATION_ENTRIES:
				return ((InternalEList<?>)getSpecificationEntries()).basicRemove(otherEnd, msgs);
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
			case ReconfigurationPackage.MANAGER__SPECIFICATION_ENTRIES:
				return getSpecificationEntries();
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
			case ReconfigurationPackage.MANAGER__SPECIFICATION_ENTRIES:
				getSpecificationEntries().clear();
				getSpecificationEntries().addAll((Collection<? extends ManagerSpecificationEntry>)newValue);
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
			case ReconfigurationPackage.MANAGER__SPECIFICATION_ENTRIES:
				getSpecificationEntries().clear();
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
			case ReconfigurationPackage.MANAGER__SPECIFICATION_ENTRIES:
				return specificationEntries != null && !specificationEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManagerImpl
