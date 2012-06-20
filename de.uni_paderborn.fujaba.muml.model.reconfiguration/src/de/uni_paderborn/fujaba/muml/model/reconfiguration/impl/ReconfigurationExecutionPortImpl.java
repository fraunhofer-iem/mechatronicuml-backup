/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationExecutionPortImpl#getSpecificationEntries <em>Specification Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationExecutionPortImpl extends ReconfigurationPortImpl implements ReconfigurationExecutionPort {
	/**
	 * The cached setting delegate for the '{@link #getSpecificationEntries() <em>Specification Entries</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationEntries()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SPECIFICATION_ENTRIES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ReconfigurationPackage.Literals.RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES).getSettingDelegate();

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
	public ExecutorSpecificationEntry getSpecificationEntries() {
		return (ExecutorSpecificationEntry)SPECIFICATION_ENTRIES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutorSpecificationEntry basicGetSpecificationEntries() {
		return (ExecutorSpecificationEntry)SPECIFICATION_ENTRIES__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES:
				if (resolve) return getSpecificationEntries();
				return basicGetSpecificationEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES:
				return SPECIFICATION_ENTRIES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurationExecutionPortImpl
