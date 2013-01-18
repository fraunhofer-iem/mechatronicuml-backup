/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ExternalReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reconfiguration Execution Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExternalReconfigurationExecutionPortImpl#getSpecificationEntries <em>Specification Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalReconfigurationExecutionPortImpl extends ReconfigurationExecutionPortImpl implements ExternalReconfigurationExecutionPort {
	/**
	 * The cached setting delegate for the '{@link #getSpecificationEntries() <em>Specification Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationEntries()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SPECIFICATION_ENTRIES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ReconfigurationPackage.Literals.EXTERNAL_RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReconfigurationExecutionPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.EXTERNAL_RECONFIGURATION_EXECUTION_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExecutorSpecificationEntry> getSpecificationEntries() {
		return (EList<ExecutorSpecificationEntry>)SPECIFICATION_ENTRIES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfigurationPackage.EXTERNAL_RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES:
				return getSpecificationEntries();
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
			case ReconfigurationPackage.EXTERNAL_RECONFIGURATION_EXECUTION_PORT__SPECIFICATION_ENTRIES:
				return SPECIFICATION_ENTRIES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ExternalReconfigurationExecutionPortImpl
