/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPortPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.LinkPart;

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
 * An implementation of the model object '<em><b>Link Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.LinkPartImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.LinkPartImpl#getConnectorEndpoints <em>Connector Endpoints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.LinkPartImpl#isSelfConnector <em>Self Connector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.LinkPartImpl#getConnectedHWPortParts <em>Connected HW Port Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkPartImpl extends CommunicationMediaPartImpl implements LinkPart {
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
	 * The cached value of the '{@link #getConnectorEndpoints() <em>Connector Endpoints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEndpoint> connectorEndpoints;

	/**
	 * The cached setting delegate for the '{@link #isSelfConnector() <em>Self Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelfConnector()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SELF_CONNECTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ConnectorPackage.Literals.CONNECTOR__SELF_CONNECTOR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getConnectedHWPortParts() <em>Connected HW Port Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedHWPortParts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_HW_PORT_PARTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.LINK_PART__CONNECTED_HW_PORT_PARTS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.LINK_PART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.LINK_PART__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEndpoint> getConnectorEndpoints() {
		if (connectorEndpoints == null) {
			connectorEndpoints = new EObjectWithInverseResolvingEList.ManyInverse<ConnectorEndpoint>(ConnectorEndpoint.class, this, HwplatformPackage.LINK_PART__CONNECTOR_ENDPOINTS, ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS);
		}
		return connectorEndpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelfConnector() {
		return (Boolean)SELF_CONNECTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwplatformPackage.LINK_PART__CONNECTOR_ENDPOINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectorEndpoints()).basicAdd(otherEnd, msgs);
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
			case HwplatformPackage.LINK_PART__CONNECTOR_ENDPOINTS:
				return ((InternalEList<?>)getConnectorEndpoints()).basicRemove(otherEnd, msgs);
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
			case HwplatformPackage.LINK_PART__COMMENT:
				return getComment();
			case HwplatformPackage.LINK_PART__CONNECTOR_ENDPOINTS:
				return getConnectorEndpoints();
			case HwplatformPackage.LINK_PART__SELF_CONNECTOR:
				return isSelfConnector();
			case HwplatformPackage.LINK_PART__CONNECTED_HW_PORT_PARTS:
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
			case HwplatformPackage.LINK_PART__COMMENT:
				setComment((String)newValue);
				return;
			case HwplatformPackage.LINK_PART__CONNECTOR_ENDPOINTS:
				getConnectorEndpoints().clear();
				getConnectorEndpoints().addAll((Collection<? extends ConnectorEndpoint>)newValue);
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
			case HwplatformPackage.LINK_PART__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case HwplatformPackage.LINK_PART__CONNECTOR_ENDPOINTS:
				getConnectorEndpoints().clear();
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
			case HwplatformPackage.LINK_PART__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case HwplatformPackage.LINK_PART__CONNECTOR_ENDPOINTS:
				return connectorEndpoints != null && !connectorEndpoints.isEmpty();
			case HwplatformPackage.LINK_PART__SELF_CONNECTOR:
				return SELF_CONNECTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.LINK_PART__CONNECTED_HW_PORT_PARTS:
				return CONNECTED_HW_PORT_PARTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case HwplatformPackage.LINK_PART__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (derivedFeatureID) {
				case HwplatformPackage.LINK_PART__CONNECTOR_ENDPOINTS: return ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS;
				case HwplatformPackage.LINK_PART__SELF_CONNECTOR: return ConnectorPackage.CONNECTOR__SELF_CONNECTOR;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return HwplatformPackage.LINK_PART__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS: return HwplatformPackage.LINK_PART__CONNECTOR_ENDPOINTS;
				case ConnectorPackage.CONNECTOR__SELF_CONNECTOR: return HwplatformPackage.LINK_PART__SELF_CONNECTOR;
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

} //LinkPartImpl
