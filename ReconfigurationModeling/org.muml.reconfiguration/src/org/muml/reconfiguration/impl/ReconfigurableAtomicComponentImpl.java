/**
 */
package org.muml.reconfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.component.impl.AtomicComponentImpl;
import org.muml.reconfiguration.HybridPortMapping;
import org.muml.reconfiguration.ReconfigurableAtomicComponent;
import org.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfigurable Atomic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.impl.ReconfigurableAtomicComponentImpl#getExecutionEntries <em>Execution Entries</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ReconfigurableAtomicComponentImpl#getManagementEntries <em>Management Entries</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ReconfigurableAtomicComponentImpl#getHybridPortMappings <em>Hybrid Port Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurableAtomicComponentImpl extends AtomicComponentImpl implements ReconfigurableAtomicComponent {
	/**
	 * The cached value of the '{@link #getExecutionEntries() <em>Execution Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationExecutionSpecificationEntry> executionEntries;
	/**
	 * The cached value of the '{@link #getManagementEntries() <em>Management Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationManagementSpecificationEntry> managementEntries;
	/**
	 * The cached value of the '{@link #getHybridPortMappings() <em>Hybrid Port Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHybridPortMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<HybridPortMapping> hybridPortMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurableAtomicComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURABLE_ATOMIC_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationExecutionSpecificationEntry> getExecutionEntries() {
		if (executionEntries == null) {
			executionEntries = new EObjectContainmentEList<ReconfigurationExecutionSpecificationEntry>(ReconfigurationExecutionSpecificationEntry.class, this, ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__EXECUTION_ENTRIES);
		}
		return executionEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationManagementSpecificationEntry> getManagementEntries() {
		if (managementEntries == null) {
			managementEntries = new EObjectContainmentEList<ReconfigurationManagementSpecificationEntry>(ReconfigurationManagementSpecificationEntry.class, this, ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__MANAGEMENT_ENTRIES);
		}
		return managementEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HybridPortMapping> getHybridPortMappings() {
		if (hybridPortMappings == null) {
			hybridPortMappings = new EObjectContainmentEList<HybridPortMapping>(HybridPortMapping.class, this, ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__HYBRID_PORT_MAPPINGS);
		}
		return hybridPortMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__EXECUTION_ENTRIES:
				return ((InternalEList<?>)getExecutionEntries()).basicRemove(otherEnd, msgs);
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__MANAGEMENT_ENTRIES:
				return ((InternalEList<?>)getManagementEntries()).basicRemove(otherEnd, msgs);
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__HYBRID_PORT_MAPPINGS:
				return ((InternalEList<?>)getHybridPortMappings()).basicRemove(otherEnd, msgs);
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
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__EXECUTION_ENTRIES:
				return getExecutionEntries();
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__MANAGEMENT_ENTRIES:
				return getManagementEntries();
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__HYBRID_PORT_MAPPINGS:
				return getHybridPortMappings();
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
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__EXECUTION_ENTRIES:
				getExecutionEntries().clear();
				getExecutionEntries().addAll((Collection<? extends ReconfigurationExecutionSpecificationEntry>)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__MANAGEMENT_ENTRIES:
				getManagementEntries().clear();
				getManagementEntries().addAll((Collection<? extends ReconfigurationManagementSpecificationEntry>)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__HYBRID_PORT_MAPPINGS:
				getHybridPortMappings().clear();
				getHybridPortMappings().addAll((Collection<? extends HybridPortMapping>)newValue);
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
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__EXECUTION_ENTRIES:
				getExecutionEntries().clear();
				return;
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__MANAGEMENT_ENTRIES:
				getManagementEntries().clear();
				return;
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__HYBRID_PORT_MAPPINGS:
				getHybridPortMappings().clear();
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
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__EXECUTION_ENTRIES:
				return executionEntries != null && !executionEntries.isEmpty();
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__MANAGEMENT_ENTRIES:
				return managementEntries != null && !managementEntries.isEmpty();
			case ReconfigurationPackage.RECONFIGURABLE_ATOMIC_COMPONENT__HYBRID_PORT_MAPPINGS:
				return hybridPortMappings != null && !hybridPortMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurableAtomicComponentImpl
