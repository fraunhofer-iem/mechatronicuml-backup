/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl;

import de.uni_paderborn.fujaba.muml.connector.Connector;
import de.uni_paderborn.fujaba.muml.connector.ConnectorEndpoint;
import de.uni_paderborn.fujaba.muml.connector.ConnectorPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.CommunicationMediaPart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;

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
 * An implementation of the model object '<em><b>Bridge Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BridgePartImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BridgePartImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BridgePartImpl#getConnectedCommunicationMediaPart <em>Connected Communication Media Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.impl.BridgePartImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BridgePartImpl extends NetworkingHardwarePartImpl implements BridgePart {
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
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached setting delegate for the '{@link #getConnectedCommunicationMediaPart() <em>Connected Communication Media Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedCommunicationMediaPart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTED_COMMUNICATION_MEDIA_PART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HwplatformPackage.Literals.BRIDGE_PART__CONNECTED_COMMUNICATION_MEDIA_PART).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval delay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BridgePartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwplatformPackage.Literals.BRIDGE_PART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.BRIDGE_PART__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectWithInverseResolvingEList.ManyInverse<Connector>(Connector.class, this, HwplatformPackage.BRIDGE_PART__CONNECTORS, ConnectorPackage.CONNECTOR__CONNECTOR_ENDPOINTS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CommunicationMediaPart> getConnectedCommunicationMediaPart() {
		return (EList<CommunicationMediaPart>)CONNECTED_COMMUNICATION_MEDIA_PART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelay(TimeInterval newDelay, NotificationChain msgs) {
		TimeInterval oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwplatformPackage.BRIDGE_PART__DELAY, oldDelay, newDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(TimeInterval newDelay) {
		if (newDelay != delay) {
			NotificationChain msgs = null;
			if (delay != null)
				msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwplatformPackage.BRIDGE_PART__DELAY, null, msgs);
			if (newDelay != null)
				msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwplatformPackage.BRIDGE_PART__DELAY, null, msgs);
			msgs = basicSetDelay(newDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwplatformPackage.BRIDGE_PART__DELAY, newDelay, newDelay));
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
			case HwplatformPackage.BRIDGE_PART__CONNECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectors()).basicAdd(otherEnd, msgs);
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
			case HwplatformPackage.BRIDGE_PART__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case HwplatformPackage.BRIDGE_PART__DELAY:
				return basicSetDelay(null, msgs);
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
			case HwplatformPackage.BRIDGE_PART__COMMENT:
				return getComment();
			case HwplatformPackage.BRIDGE_PART__CONNECTORS:
				return getConnectors();
			case HwplatformPackage.BRIDGE_PART__CONNECTED_COMMUNICATION_MEDIA_PART:
				return getConnectedCommunicationMediaPart();
			case HwplatformPackage.BRIDGE_PART__DELAY:
				return getDelay();
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
			case HwplatformPackage.BRIDGE_PART__COMMENT:
				setComment((String)newValue);
				return;
			case HwplatformPackage.BRIDGE_PART__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case HwplatformPackage.BRIDGE_PART__CONNECTED_COMMUNICATION_MEDIA_PART:
				getConnectedCommunicationMediaPart().clear();
				getConnectedCommunicationMediaPart().addAll((Collection<? extends CommunicationMediaPart>)newValue);
				return;
			case HwplatformPackage.BRIDGE_PART__DELAY:
				setDelay((TimeInterval)newValue);
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
			case HwplatformPackage.BRIDGE_PART__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case HwplatformPackage.BRIDGE_PART__CONNECTORS:
				getConnectors().clear();
				return;
			case HwplatformPackage.BRIDGE_PART__CONNECTED_COMMUNICATION_MEDIA_PART:
				getConnectedCommunicationMediaPart().clear();
				return;
			case HwplatformPackage.BRIDGE_PART__DELAY:
				setDelay((TimeInterval)null);
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
			case HwplatformPackage.BRIDGE_PART__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case HwplatformPackage.BRIDGE_PART__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case HwplatformPackage.BRIDGE_PART__CONNECTED_COMMUNICATION_MEDIA_PART:
				return CONNECTED_COMMUNICATION_MEDIA_PART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HwplatformPackage.BRIDGE_PART__DELAY:
				return delay != null;
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
				case HwplatformPackage.BRIDGE_PART__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConnectorEndpoint.class) {
			switch (derivedFeatureID) {
				case HwplatformPackage.BRIDGE_PART__CONNECTORS: return ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return HwplatformPackage.BRIDGE_PART__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ConnectorEndpoint.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.CONNECTOR_ENDPOINT__CONNECTORS: return HwplatformPackage.BRIDGE_PART__CONNECTORS;
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

} //BridgePartImpl
