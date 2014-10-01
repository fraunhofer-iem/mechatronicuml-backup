/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl;

import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpointInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.CommunicationMediaInstance;
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
import org.storydriven.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bridge Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BridgeInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BridgeInstanceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BridgeInstanceImpl#getConnectorInstances <em>Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BridgeInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.impl.BridgeInstanceImpl#getConnectedCommunicationMediaInstance <em>Connected Communication Media Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BridgeInstanceImpl extends NetworkingHardwareInstanceImpl implements BridgeInstance {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached setting delegate for the '{@link #getConnectedCommunicationMediaInstance() <em>Connected Communication Media Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedCommunicationMediaInstance()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_COMMUNICATION_MEDIA_INSTANCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatforminstancePackage.Literals.BRIDGE_INSTANCE__CONNECTED_COMMUNICATION_MEDIA_INSTANCE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BridgeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatforminstancePackage.Literals.BRIDGE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.BRIDGE_INSTANCE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.BRIDGE_INSTANCE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInstance> getConnectorInstances() {
		if (connectorInstances == null) {
			connectorInstances = new EObjectWithInverseResolvingEList.ManyInverse<ConnectorInstance>(ConnectorInstance.class, this, HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTOR_INSTANCES, ConnectorPackage.CONNECTOR_INSTANCE__CONNECTOR_ENDPOINT_INSTANCES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HwplatforminstancePackage.BRIDGE_INSTANCE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatforminstancePackage.BRIDGE_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CommunicationMediaInstance> getConnectedCommunicationMediaInstance() {
		return (EList<CommunicationMediaInstance>)CONNECTED_COMMUNICATION_MEDIA_INSTANCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTOR_INSTANCES:
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
			case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTOR_INSTANCES:
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
			case HwplatforminstancePackage.BRIDGE_INSTANCE__NAME:
				return getName();
			case HwplatforminstancePackage.BRIDGE_INSTANCE__COMMENT:
				return getComment();
			case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTOR_INSTANCES:
				return getConnectorInstances();
			case HwplatforminstancePackage.BRIDGE_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTED_COMMUNICATION_MEDIA_INSTANCE:
				return getConnectedCommunicationMediaInstance();
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
			case HwplatforminstancePackage.BRIDGE_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case HwplatforminstancePackage.BRIDGE_INSTANCE__COMMENT:
				setComment((String)newValue);
				return;
			case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				getConnectorInstances().addAll((Collection<? extends ConnectorInstance>)newValue);
				return;
			case HwplatforminstancePackage.BRIDGE_INSTANCE__TYPE:
				setType((ConnectorEndpoint)newValue);
				return;
			case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTED_COMMUNICATION_MEDIA_INSTANCE:
				getConnectedCommunicationMediaInstance().clear();
				getConnectedCommunicationMediaInstance().addAll((Collection<? extends CommunicationMediaInstance>)newValue);
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
			case HwplatforminstancePackage.BRIDGE_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HwplatforminstancePackage.BRIDGE_INSTANCE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTOR_INSTANCES:
				getConnectorInstances().clear();
				return;
			case HwplatforminstancePackage.BRIDGE_INSTANCE__TYPE:
				setType((ConnectorEndpoint)null);
				return;
			case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTED_COMMUNICATION_MEDIA_INSTANCE:
				getConnectedCommunicationMediaInstance().clear();
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
			case HwplatforminstancePackage.BRIDGE_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HwplatforminstancePackage.BRIDGE_INSTANCE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTOR_INSTANCES:
				return connectorInstances != null && !connectorInstances.isEmpty();
			case HwplatforminstancePackage.BRIDGE_INSTANCE__TYPE:
				return type != null;
			case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTED_COMMUNICATION_MEDIA_INSTANCE:
				return CONNECTED_COMMUNICATION_MEDIA_INSTANCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case HwplatforminstancePackage.BRIDGE_INSTANCE__NAME: return CorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case HwplatforminstancePackage.BRIDGE_INSTANCE__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConnectorEndpointInstance.class) {
			switch (derivedFeatureID) {
				case HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTOR_INSTANCES: return ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES;
				case HwplatforminstancePackage.BRIDGE_INSTANCE__TYPE: return ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__TYPE;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return HwplatforminstancePackage.BRIDGE_INSTANCE__NAME;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return HwplatforminstancePackage.BRIDGE_INSTANCE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConnectorEndpointInstance.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__CONNECTOR_INSTANCES: return HwplatforminstancePackage.BRIDGE_INSTANCE__CONNECTOR_INSTANCES;
				case ConnectorPackage.CONNECTOR_ENDPOINT_INSTANCE__TYPE: return HwplatforminstancePackage.BRIDGE_INSTANCE__TYPE;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //BridgeInstanceImpl
