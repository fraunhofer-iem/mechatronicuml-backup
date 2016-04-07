/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.simulink.Bus;
import org.muml.simulink.BusSelector;
import org.muml.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.impl.BusSelectorImpl#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusSelectorImpl extends BlockImpl implements BusSelector {
	/**
	 * The cached setting delegate for the '{@link #getBus() <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BUS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SimulinkPackage.Literals.BUS_SELECTOR__BUS).getSettingDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.BUS_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBus() {
		return (Bus)BUS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus basicGetBus() {
		return (Bus)BUS__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.BUS_SELECTOR__BUS:
				if (resolve) return getBus();
				return basicGetBus();
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
			case SimulinkPackage.BUS_SELECTOR__BUS:
				return BUS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //BusSelectorImpl
