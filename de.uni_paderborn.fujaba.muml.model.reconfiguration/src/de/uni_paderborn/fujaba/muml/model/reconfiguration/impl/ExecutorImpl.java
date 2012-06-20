/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry;
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
 * An implementation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorImpl#getSpecificationEntries <em>Specification Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutorImpl extends ReconfigurationControllerImpl implements Executor {
	/**
	 * The cached value of the '{@link #getSpecificationEntries() <em>Specification Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutorSpecificationEntry> specificationEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.EXECUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutorSpecificationEntry> getSpecificationEntries() {
		if (specificationEntries == null) {
			specificationEntries = new EObjectContainmentWithInverseEList<ExecutorSpecificationEntry>(ExecutorSpecificationEntry.class, this, ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR);
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				getSpecificationEntries().clear();
				getSpecificationEntries().addAll((Collection<? extends ExecutorSpecificationEntry>)newValue);
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
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
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				return specificationEntries != null && !specificationEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutorImpl
