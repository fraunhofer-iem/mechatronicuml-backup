/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.protocol.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.core.impl.CommentableElementImpl;
import org.muml.pim.protocol.ConnectorQualityOfServiceAssumptions;
import org.muml.pim.protocol.ProtocolPackage;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Quality Of Service Assumptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl#getMaxMessageDelay <em>Max Message Delay</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl#isMessageLossPossible <em>Message Loss Possible</em>}</li>
 *   <li>{@link org.muml.pim.protocol.impl.ConnectorQualityOfServiceAssumptionsImpl#isPreserveMessageOrder <em>Preserve Message Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorQualityOfServiceAssumptionsImpl extends CommentableElementImpl implements ConnectorQualityOfServiceAssumptions {
	/**
	 * The cached value of the '{@link #getMaxMessageDelay() <em>Max Message Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMessageDelay()
	 * @generated
	 * @ordered
	 */
	protected TimeValue maxMessageDelay;

	/**
	 * The default value of the '{@link #isMessageLossPossible() <em>Message Loss Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageLossPossible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESSAGE_LOSS_POSSIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMessageLossPossible() <em>Message Loss Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageLossPossible()
	 * @generated
	 * @ordered
	 */
	protected boolean messageLossPossible = MESSAGE_LOSS_POSSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreserveMessageOrder() <em>Preserve Message Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreserveMessageOrder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRESERVE_MESSAGE_ORDER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPreserveMessageOrder() <em>Preserve Message Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreserveMessageOrder()
	 * @generated
	 * @ordered
	 */
	protected boolean preserveMessageOrder = PRESERVE_MESSAGE_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorQualityOfServiceAssumptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getMaxMessageDelay() {
		return maxMessageDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxMessageDelay(TimeValue newMaxMessageDelay, NotificationChain msgs) {
		TimeValue oldMaxMessageDelay = maxMessageDelay;
		maxMessageDelay = newMaxMessageDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY, oldMaxMessageDelay, newMaxMessageDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMessageDelay(TimeValue newMaxMessageDelay) {
		if (newMaxMessageDelay != maxMessageDelay) {
			NotificationChain msgs = null;
			if (maxMessageDelay != null)
				msgs = ((InternalEObject)maxMessageDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY, null, msgs);
			if (newMaxMessageDelay != null)
				msgs = ((InternalEObject)newMaxMessageDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY, null, msgs);
			msgs = basicSetMaxMessageDelay(newMaxMessageDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY, newMaxMessageDelay, newMaxMessageDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMessageLossPossible() {
		return messageLossPossible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageLossPossible(boolean newMessageLossPossible) {
		boolean oldMessageLossPossible = messageLossPossible;
		messageLossPossible = newMessageLossPossible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE, oldMessageLossPossible, messageLossPossible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreserveMessageOrder() {
		return preserveMessageOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreserveMessageOrder(boolean newPreserveMessageOrder) {
		boolean oldPreserveMessageOrder = preserveMessageOrder;
		preserveMessageOrder = newPreserveMessageOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER, oldPreserveMessageOrder, preserveMessageOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
				return basicSetMaxMessageDelay(null, msgs);
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
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
				return getMaxMessageDelay();
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				return isMessageLossPossible();
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER:
				return isPreserveMessageOrder();
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
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
				setMaxMessageDelay((TimeValue)newValue);
				return;
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				setMessageLossPossible((Boolean)newValue);
				return;
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER:
				setPreserveMessageOrder((Boolean)newValue);
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
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
				setMaxMessageDelay((TimeValue)null);
				return;
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				setMessageLossPossible(MESSAGE_LOSS_POSSIBLE_EDEFAULT);
				return;
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER:
				setPreserveMessageOrder(PRESERVE_MESSAGE_ORDER_EDEFAULT);
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
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MAX_MESSAGE_DELAY:
				return maxMessageDelay != null;
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				return messageLossPossible != MESSAGE_LOSS_POSSIBLE_EDEFAULT;
			case ProtocolPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER:
				return preserveMessageOrder != PRESERVE_MESSAGE_ORDER_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (messageLossPossible: ");
		result.append(messageLossPossible);
		result.append(", preserveMessageOrder: ");
		result.append(preserveMessageOrder);
		result.append(')');
		return result.toString();
	}

} //ConnectorQualityOfServiceAssumptionsImpl
