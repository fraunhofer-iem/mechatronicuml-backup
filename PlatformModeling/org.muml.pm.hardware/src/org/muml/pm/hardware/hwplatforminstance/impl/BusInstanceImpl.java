/**
 */
package org.muml.pm.hardware.hwplatforminstance.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.muml.pim.connector.impl.ConnectorEndpointInstanceImpl;
import org.muml.pm.hardware.hwplatform.Bus;
import org.muml.pm.hardware.hwplatforminstance.BusInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwvaluetype.DataRate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.BusInstanceImpl#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.BusInstanceImpl#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.BusInstanceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.BusInstanceImpl#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusInstanceImpl extends ConnectorEndpointInstanceImpl implements BusInstance {
	/**
	 * The cached setting delegate for the '{@link #getConnectedHWPortInstances() <em>Connected HW Port Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedHWPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_HW_PORT_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.BUS_INSTANCE__CONNECTED_HW_PORT_INSTANCES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getBusType() <em>Bus Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BUS_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.BUS_INSTANCE__BUS_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.BUS_INSTANCE__PROTOCOL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getBandwidth() <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BANDWIDTH__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.BUS_INSTANCE__BANDWIDTH).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.BUS_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<HWPortInstance> getConnectedHWPortInstances() {
		return (EList<HWPortInstance>)CONNECTED_HW_PORT_INSTANCES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBusType() {
		return (Bus)BUS_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus basicGetBusType() {
		return (Bus)BUS_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusType(Bus newBusType) {
		BUS_TYPE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newBusType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol getProtocol() {
		return (CommunicationProtocol)PROTOCOL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol basicGetProtocol() {
		return (CommunicationProtocol)PROTOCOL__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(CommunicationProtocol newProtocol) {
		PROTOCOL__ESETTING_DELEGATE.dynamicSet(this, null, 0, newProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRate getBandwidth() {
		return (DataRate)BANDWIDTH__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBandwidth(DataRate newBandwidth, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Bandwidth' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidth(DataRate newBandwidth) {
		BANDWIDTH__ESETTING_DELEGATE.dynamicSet(this, null, 0, newBandwidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatforminstancePackage.BUS_INSTANCE__BANDWIDTH:
				return basicSetBandwidth(null, msgs);
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
			case HwplatforminstancePackage.BUS_INSTANCE__CONNECTED_HW_PORT_INSTANCES:
				return getConnectedHWPortInstances();
			case HwplatforminstancePackage.BUS_INSTANCE__BUS_TYPE:
				if (resolve) return getBusType();
				return basicGetBusType();
			case HwplatforminstancePackage.BUS_INSTANCE__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwplatforminstancePackage.BUS_INSTANCE__BANDWIDTH:
				return getBandwidth();
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
			case HwplatforminstancePackage.BUS_INSTANCE__BUS_TYPE:
				setBusType((Bus)newValue);
				return;
			case HwplatforminstancePackage.BUS_INSTANCE__PROTOCOL:
				setProtocol((CommunicationProtocol)newValue);
				return;
			case HwplatforminstancePackage.BUS_INSTANCE__BANDWIDTH:
				setBandwidth((DataRate)newValue);
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
			case HwplatforminstancePackage.BUS_INSTANCE__BUS_TYPE:
				setBusType((Bus)null);
				return;
			case HwplatforminstancePackage.BUS_INSTANCE__PROTOCOL:
				setProtocol((CommunicationProtocol)null);
				return;
			case HwplatforminstancePackage.BUS_INSTANCE__BANDWIDTH:
				setBandwidth((DataRate)null);
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
			case HwplatforminstancePackage.BUS_INSTANCE__CONNECTED_HW_PORT_INSTANCES:
				return CONNECTED_HW_PORT_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.BUS_INSTANCE__BUS_TYPE:
				return BUS_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.BUS_INSTANCE__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.BUS_INSTANCE__BANDWIDTH:
				return BANDWIDTH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //BusInstanceImpl
