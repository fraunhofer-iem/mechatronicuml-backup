/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPortInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstancePackage;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.CommunicationResource;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HWPortKind;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.impl.HWPortImpl;

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
 * An implementation of the model object '<em><b>HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getConnectorInstances <em>Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getHwPortType <em>Hw Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getConnectedMediaInstances <em>Connected Media Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.HWPortInstanceImpl#getPortKind <em>Port Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWPortInstanceImpl extends HWPortImpl implements HWPortInstance {
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
	 * The cached value of the '{@link #getConnectorInstances() <em>Connector Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInstance> connectorInstances;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConnectorEndpoint type;

	/**
	 * The cached setting delegate for the '{@link #getHwPortType() <em>Hw Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwPortType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HW_PORT_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.HW_PORT_INSTANCE__HW_PORT_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getConnectedMediaInstances() <em>Connected Media Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedMediaInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_MEDIA_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.HW_PORT_INSTANCE__CONNECTED_MEDIA_INSTANCES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.HW_PORT_INSTANCE__PROTOCOL).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getPortKind() <em>Port Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortKind()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_KIND__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.HW_PORT_INSTANCE__PORT_KIND).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.HW_PORT_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.HW_PORT_INSTANCE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInstance> getConnectorInstances() {
		if (connectorInstances == null) {
			connectorInstances = new EObjectWithInverseResolvingEList.ManyInverse<ConnectorInstance>(ConnectorInstance.class, this, HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTOR_INSTANCES, ConnectorPackage.CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES);
		}
		return connectorInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEndpoint getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ConnectorEndpoint)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatforminstancePackage.HW_PORT_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEndpoint basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConnectorEndpoint newType) {
		ConnectorEndpoint oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.HW_PORT_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationResource getHwPortType() {
		return (CommunicationResource)HW_PORT_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationResource basicGetHwPortType() {
		return (CommunicationResource)HW_PORT_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwPortType(CommunicationResource newHwPortType) {
		HW_PORT_TYPE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newHwPortType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CommunicationMediaInstance> getConnectedMediaInstances() {
		return (EList<CommunicationMediaInstance>)CONNECTED_MEDIA_INSTANCES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	public HWPortKind getPortKind() {
		return (HWPortKind)PORT_KIND__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortKind(HWPortKind newPortKind) {
		PORT_KIND__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPortKind);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTOR_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectorInstances()).basicAdd(otherEnd, msgs);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTOR_INSTANCES:
				return ((InternalEList<?>)getConnectorInstances()).basicRemove(otherEnd, msgs);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__COMMENT:
				return getComment();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTOR_INSTANCES:
				return getConnectorInstances();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__HW_PORT_TYPE:
				if (resolve) return getHwPortType();
				return basicGetHwPortType();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_MEDIA_INSTANCES:
				return getConnectedMediaInstances();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				return getPortKind();
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__COMMENT:
				setComment((String)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				getConnectorInstances().addAll((Collection<? extends ConnectorInstance>)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__TYPE:
				setType((ConnectorEndpoint)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__HW_PORT_TYPE:
				setHwPortType((CommunicationResource)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_MEDIA_INSTANCES:
				getConnectedMediaInstances().clear();
				getConnectedMediaInstances().addAll((Collection<? extends CommunicationMediaInstance>)newValue);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				setPortKind((HWPortKind)newValue);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__TYPE:
				setType((ConnectorEndpoint)null);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__HW_PORT_TYPE:
				setHwPortType((CommunicationResource)null);
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_MEDIA_INSTANCES:
				getConnectedMediaInstances().clear();
				return;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				PORT_KIND__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case HwplatforminstancePackage.HW_PORT_INSTANCE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTOR_INSTANCES:
				return connectorInstances != null && !connectorInstances.isEmpty();
			case HwplatforminstancePackage.HW_PORT_INSTANCE__TYPE:
				return type != null;
			case HwplatforminstancePackage.HW_PORT_INSTANCE__HW_PORT_TYPE:
				return HW_PORT_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTED_MEDIA_INSTANCES:
				return CONNECTED_MEDIA_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PROTOCOL:
				return PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatforminstancePackage.HW_PORT_INSTANCE__PORT_KIND:
				return PORT_KIND__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case HwplatforminstancePackage.HW_PORT_INSTANCE__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConnectorEndpointInstance.class) {
			switch (derivedFeatureID) {
				case HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTOR_INSTANCES: return ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;
				case HwplatforminstancePackage.HW_PORT_INSTANCE__TYPE: return ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__TYPE;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return HwplatforminstancePackage.HW_PORT_INSTANCE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConnectorEndpointInstance.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES: return HwplatforminstancePackage.HW_PORT_INSTANCE__CONNECTOR_INSTANCES;
				case ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__TYPE: return HwplatforminstancePackage.HW_PORT_INSTANCE__TYPE;
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

} //HWPortInstanceImpl
