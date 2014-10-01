/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl;

import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusConnectorInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BusInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusConnectorInstanceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusConnectorInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusConnectorInstanceImpl#getConnectorEndpointInstances <em>Connector Endpoint Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusConnectorInstanceImpl#getConnectedBusInstance <em>Connected Bus Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BusConnectorInstanceImpl#getConnectedHWPortInstances <em>Connected HW Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusConnectorInstanceImpl extends NetworkingHardwareInstanceImpl implements BusConnectorInstance {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Connector type;

	/**
	 * The cached value of the '{@link #getConnectorEndpointInstances() <em>Connector Endpoint Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorEndpointInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEndpointInstance> connectorEndpointInstances;

	/**
	 * The cached setting delegate for the '{@link #getConnectedBusInstance() <em>Connected Bus Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedBusInstance()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_BUS_INSTANCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.BUS_CONNECTOR_INSTANCE__CONNECTED_BUS_INSTANCE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getConnectedHWPortInstances() <em>Connected HW Port Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedHWPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_HW_PORT_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.BUS_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.BUS_CONNECTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Connector)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Connector newType) {
		Connector oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEndpointInstance> getConnectorEndpointInstances() {
		if (connectorEndpointInstances == null) {
			connectorEndpointInstances = new EObjectWithInverseResolvingEList.ManyInverse<ConnectorEndpointInstance>(ConnectorEndpointInstance.class, this, HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES, ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES);
		}
		return connectorEndpointInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BusInstance> getConnectedBusInstance() {
		return (EList<BusInstance>)CONNECTED_BUS_INSTANCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectorEndpointInstances()).basicAdd(otherEnd, msgs);
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
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES:
				return ((InternalEList<?>)getConnectorEndpointInstances()).basicRemove(otherEnd, msgs);
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
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__COMMENT:
				return getComment();
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES:
				return getConnectorEndpointInstances();
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTED_BUS_INSTANCE:
				return getConnectedBusInstance();
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES:
				return getConnectedHWPortInstances();
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
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__COMMENT:
				setComment((String)newValue);
				return;
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__TYPE:
				setType((Connector)newValue);
				return;
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES:
				getConnectorEndpointInstances().clear();
				getConnectorEndpointInstances().addAll((Collection<? extends ConnectorEndpointInstance>)newValue);
				return;
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTED_BUS_INSTANCE:
				getConnectedBusInstance().clear();
				getConnectedBusInstance().addAll((Collection<? extends BusInstance>)newValue);
				return;
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES:
				getConnectedHWPortInstances().clear();
				getConnectedHWPortInstances().addAll((Collection<? extends HWPortInstance>)newValue);
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
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__TYPE:
				setType((Connector)null);
				return;
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES:
				getConnectorEndpointInstances().clear();
				return;
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTED_BUS_INSTANCE:
				getConnectedBusInstance().clear();
				return;
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES:
				getConnectedHWPortInstances().clear();
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
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__TYPE:
				return type != null;
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES:
				return connectorEndpointInstances != null && !connectorEndpointInstances.isEmpty();
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTED_BUS_INSTANCE:
				return CONNECTED_BUS_INSTANCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTED_HW_PORT_INSTANCES:
				return CONNECTED_HW_PORT_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConnectorInstance.class) {
			switch (derivedFeatureID) {
				case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__TYPE: return ConnectorPackage.CONNECTOR_INSTANCE__TYPE;
				case HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES: return ConnectorPackage.CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConnectorInstance.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.CONNECTOR_INSTANCE__TYPE: return HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__TYPE;
				case ConnectorPackage.CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES: return HwplatforminstancePackage.BUS_CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //BusConnectorInstanceImpl
