/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatform.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.muml.pim.connector.impl.ConnectorImpl;
import org.muml.pm.hardware.hwplatform.DelegationHWPort;
import org.muml.pm.hardware.hwplatform.HWPortPart;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatform.NetworkConnector;
import org.muml.pm.hardware.hwresource.CommunicationKind;
import org.muml.pm.hardware.hwresource.CommunicationProtocol;
import org.muml.pm.hardware.hwvaluetype.DataRate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.NetworkConnectorImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.NetworkConnectorImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.NetworkConnectorImpl#getHwportParts <em>Hwport Parts</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.NetworkConnectorImpl#getConnectorKind <em>Connector Kind</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwplatform.impl.NetworkConnectorImpl#getDelegationHWPorts <em>Delegation HW Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkConnectorImpl extends ConnectorImpl implements NetworkConnector {
	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.NETWORK_CONNECTOR__PROTOCOL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getBandwidth() <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BANDWIDTH__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.NETWORK_CONNECTOR__BANDWIDTH).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getHwportParts() <em>Hwport Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwportParts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HWPORT_PARTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.NETWORK_CONNECTOR__HWPORT_PARTS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getConnectorKind() <em>Connector Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorKind()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTOR_KIND__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.NETWORK_CONNECTOR__CONNECTOR_KIND).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getDelegationHWPorts() <em>Delegation HW Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationHWPorts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DELEGATION_HW_PORTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.NETWORK_CONNECTOR__DELEGATION_HW_PORTS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.NETWORK_CONNECTOR;
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
	@SuppressWarnings("unchecked")
	public EList<HWPortPart> getHwportParts() {
		return (EList<HWPortPart>)HWPORT_PARTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	@SuppressWarnings("unchecked")
	public EList<DelegationHWPort> getDelegationHWPorts() {
		return (EList<DelegationHWPort>)DELEGATION_HW_PORTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatformPackage.NETWORK_CONNECTOR__BANDWIDTH:
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
			case HwplatformPackage.NETWORK_CONNECTOR__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwplatformPackage.NETWORK_CONNECTOR__BANDWIDTH:
				return getBandwidth();
			case HwplatformPackage.NETWORK_CONNECTOR__HWPORT_PARTS:
				return getHwportParts();
			case HwplatformPackage.NETWORK_CONNECTOR__CONNECTOR_KIND:
				return getConnectorKind();
			case HwplatformPackage.NETWORK_CONNECTOR__DELEGATION_HW_PORTS:
				return getDelegationHWPorts();
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
			case HwplatformPackage.NETWORK_CONNECTOR__PROTOCOL:
				setProtocol((CommunicationProtocol)newValue);
				return;
			case HwplatformPackage.NETWORK_CONNECTOR__BANDWIDTH:
				setBandwidth((DataRate)newValue);
				return;
			case HwplatformPackage.NETWORK_CONNECTOR__CONNECTOR_KIND:
				setConnectorKind((CommunicationKind)newValue);
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
			case HwplatformPackage.NETWORK_CONNECTOR__PROTOCOL:
				setProtocol((CommunicationProtocol)null);
				return;
			case HwplatformPackage.NETWORK_CONNECTOR__BANDWIDTH:
				setBandwidth((DataRate)null);
				return;
			case HwplatformPackage.NETWORK_CONNECTOR__CONNECTOR_KIND:
				CONNECTOR_KIND__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case HwplatformPackage.NETWORK_CONNECTOR__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.NETWORK_CONNECTOR__BANDWIDTH:
				return BANDWIDTH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.NETWORK_CONNECTOR__HWPORT_PARTS:
				return HWPORT_PARTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.NETWORK_CONNECTOR__CONNECTOR_KIND:
				return CONNECTOR_KIND__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.NETWORK_CONNECTOR__DELEGATION_HW_PORTS:
				return DELEGATION_HW_PORTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //NetworkConnectorImpl
