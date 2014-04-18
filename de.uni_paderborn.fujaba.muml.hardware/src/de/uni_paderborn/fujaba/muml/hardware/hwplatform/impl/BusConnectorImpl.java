/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorImpl;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusConnector;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.BusPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusConnectorImpl#getConnectedBusPart <em>Connected Bus Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BusConnectorImpl#getConnectedHWPortParts <em>Connected HW Port Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusConnectorImpl extends ConnectorImpl implements BusConnector {
	/**
	 * The cached setting delegate for the '{@link #getConnectedBusPart() <em>Connected Bus Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedBusPart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_BUS_PART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.BUS_CONNECTOR__CONNECTED_BUS_PART).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getConnectedHWPortParts() <em>Connected HW Port Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedHWPortParts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_HW_PORT_PARTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.BUS_CONNECTOR__CONNECTED_HW_PORT_PARTS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.BUS_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BusPart> getConnectedBusPart() {
		return (EList<BusPart>)CONNECTED_BUS_PART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<HWPortPart> getConnectedHWPortParts() {
		return (EList<HWPortPart>)CONNECTED_HW_PORT_PARTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwplatformPackage.BUS_CONNECTOR__CONNECTED_BUS_PART:
				return getConnectedBusPart();
			case HwplatformPackage.BUS_CONNECTOR__CONNECTED_HW_PORT_PARTS:
				return getConnectedHWPortParts();
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
			case HwplatformPackage.BUS_CONNECTOR__CONNECTED_BUS_PART:
				getConnectedBusPart().clear();
				getConnectedBusPart().addAll((Collection<? extends BusPart>)newValue);
				return;
			case HwplatformPackage.BUS_CONNECTOR__CONNECTED_HW_PORT_PARTS:
				getConnectedHWPortParts().clear();
				getConnectedHWPortParts().addAll((Collection<? extends HWPortPart>)newValue);
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
			case HwplatformPackage.BUS_CONNECTOR__CONNECTED_BUS_PART:
				getConnectedBusPart().clear();
				return;
			case HwplatformPackage.BUS_CONNECTOR__CONNECTED_HW_PORT_PARTS:
				getConnectedHWPortParts().clear();
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
			case HwplatformPackage.BUS_CONNECTOR__CONNECTED_BUS_PART:
				return CONNECTED_BUS_PART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.BUS_CONNECTOR__CONNECTED_HW_PORT_PARTS:
				return CONNECTED_HW_PORT_PARTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //BusConnectorImpl
