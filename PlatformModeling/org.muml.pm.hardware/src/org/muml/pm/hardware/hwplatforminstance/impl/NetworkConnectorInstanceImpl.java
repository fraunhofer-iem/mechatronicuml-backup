/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatforminstance.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.muml.pim.connector.impl.ConnectorInstanceImpl;
import org.muml.pm.hardware.hwplatform.NetworkConnector;
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;
import org.muml.pm.hardware.hwresource.CommunicationKind;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwvaluetype.DataRate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkConnectorInstanceImpl#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkConnectorInstanceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkConnectorInstanceImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkConnectorInstanceImpl#getConnectorKind <em>Connector Kind</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatforminstance.impl.NetworkConnectorInstanceImpl#getNetworkConnectorType <em>Network Connector Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkConnectorInstanceImpl extends ConnectorInstanceImpl implements NetworkConnectorInstance {
	/**
	 * The cached setting delegate for the '{@link #getConnectedHWPortInstances() <em>Connected HW Port Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedHWPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_HW_PORT_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.NETWORK_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.NETWORK_CONNECTOR_INSTANCE__PROTOCOL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getBandwidth() <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BANDWIDTH__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.NETWORK_CONNECTOR_INSTANCE__BANDWIDTH).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getConnectorKind() <em>Connector Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorKind()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTOR_KIND__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.NETWORK_CONNECTOR_INSTANCE__CONNECTOR_KIND).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getNetworkConnectorType() <em>Network Connector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkConnectorType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NETWORK_CONNECTOR_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.NETWORK_CONNECTOR_INSTANCE__NETWORK_CONNECTOR_TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.NETWORK_CONNECTOR_INSTANCE;
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
	public CommunicationKind getConnectorKind() {
		return (CommunicationKind)CONNECTOR_KIND__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorKind(CommunicationKind newConnectorKind) {
		CONNECTOR_KIND__ESETTING_DELEGATE.dynamicSet(this, null, 0, newConnectorKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConnector getNetworkConnectorType() {
		return (NetworkConnector)NETWORK_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConnector basicGetNetworkConnectorType() {
		return (NetworkConnector)NETWORK_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkConnectorType(NetworkConnector newNetworkConnectorType) {
		NETWORK_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newNetworkConnectorType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__BANDWIDTH:
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
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES:
				return getConnectedHWPortInstances();
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__BANDWIDTH:
				return getBandwidth();
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__CONNECTOR_KIND:
				return getConnectorKind();
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__NETWORK_CONNECTOR_TYPE:
				if (resolve) return getNetworkConnectorType();
				return basicGetNetworkConnectorType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__PROTOCOL:
				setProtocol((CommunicationProtocol)newValue);
				return;
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__BANDWIDTH:
				setBandwidth((DataRate)newValue);
				return;
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__CONNECTOR_KIND:
				setConnectorKind((CommunicationKind)newValue);
				return;
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__NETWORK_CONNECTOR_TYPE:
				setNetworkConnectorType((NetworkConnector)newValue);
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
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__PROTOCOL:
				setProtocol((CommunicationProtocol)null);
				return;
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__BANDWIDTH:
				setBandwidth((DataRate)null);
				return;
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__CONNECTOR_KIND:
				CONNECTOR_KIND__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__NETWORK_CONNECTOR_TYPE:
				setNetworkConnectorType((NetworkConnector)null);
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
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES:
				return CONNECTED_HW_PORT_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__BANDWIDTH:
				return BANDWIDTH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__CONNECTOR_KIND:
				return CONNECTOR_KIND__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.NETWORK_CONNECTOR_INSTANCE__NETWORK_CONNECTOR_TYPE:
				return NETWORK_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //NetworkConnectorInstanceImpl
