/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePortEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortImpl#getInterfaceEntries <em>Interface Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationMessagePortImpl extends ReconfigurationPortImpl implements ReconfigurationMessagePort {
	/**
	 * The cached value of the '{@link #getInterfaceEntries() <em>Interface Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationMessagePortEntry> interfaceEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationMessagePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURATION_MESSAGE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationMessagePortEntry> getInterfaceEntries() {
		if (interfaceEntries == null) {
			interfaceEntries = new EObjectContainmentEList<ReconfigurationMessagePortEntry>(ReconfigurationMessagePortEntry.class, this, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES);
		}
		return interfaceEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES:
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES:
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES:
				getInterfaceEntries().clear();
				getInterfaceEntries().addAll((Collection<? extends ReconfigurationMessagePortEntry>)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES:
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT__INTERFACE_ENTRIES:
				return interfaceEntries != null && !interfaceEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurationMessagePortImpl
