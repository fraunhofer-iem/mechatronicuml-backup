/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortImpl#getInterfaceEntries <em>Interface Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationExecutionPortImpl extends ReconfigurationPortImpl implements ReconfigurationExecutionPort {
	/**
	 * The cached value of the '{@link #getInterfaceEntries() <em>Interface Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationExecutionPortInterfaceEntry> interfaceEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationExecutionPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURATION_EXECUTION_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationExecutionPortInterfaceEntry> getInterfaceEntries() {
		if (interfaceEntries == null) {
			interfaceEntries = new EObjectContainmentWithInverseEList<ReconfigurationExecutionPortInterfaceEntry>(ReconfigurationExecutionPortInterfaceEntry.class, this, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT);
		}
		return interfaceEntries;
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceEntries()).basicAdd(otherEnd, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES:
				return ((InternalEList<?>)getInterfaceEntries()).basicRemove(otherEnd, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES:
				return getInterfaceEntries();
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES:
				getInterfaceEntries().clear();
				getInterfaceEntries().addAll((Collection<? extends ReconfigurationExecutionPortInterfaceEntry>)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES:
				getInterfaceEntries().clear();
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES:
				return interfaceEntries != null && !interfaceEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurationExecutionPortImpl
