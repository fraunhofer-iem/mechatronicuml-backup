/**
 */
package coordination.impl;

import coordination.ConnectorQualityOfServiceAssumptions;
import coordination.CoordinationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Quality Of Service Assumptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link coordination.impl.ConnectorQualityOfServiceAssumptionsImpl#isMessageLossPossible <em>Message Loss Possible</em>}</li>
 *   <li>{@link coordination.impl.ConnectorQualityOfServiceAssumptionsImpl#isPreserveMessageOrder <em>Preserve Message Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorQualityOfServiceAssumptionsImpl extends MinimalEObjectImpl.Container implements ConnectorQualityOfServiceAssumptions {
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
	protected static final boolean PRESERVE_MESSAGE_ORDER_EDEFAULT = false;

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
		return CoordinationPackage.Literals.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE, oldMessageLossPossible, messageLossPossible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER, oldPreserveMessageOrder, preserveMessageOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				return isMessageLossPossible();
			case CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER:
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
			case CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				setMessageLossPossible((Boolean)newValue);
				return;
			case CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER:
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
			case CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				setMessageLossPossible(MESSAGE_LOSS_POSSIBLE_EDEFAULT);
				return;
			case CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER:
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
			case CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__MESSAGE_LOSS_POSSIBLE:
				return messageLossPossible != MESSAGE_LOSS_POSSIBLE_EDEFAULT;
			case CoordinationPackage.CONNECTOR_QUALITY_OF_SERVICE_ASSUMPTIONS__PRESERVE_MESSAGE_ORDER:
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
