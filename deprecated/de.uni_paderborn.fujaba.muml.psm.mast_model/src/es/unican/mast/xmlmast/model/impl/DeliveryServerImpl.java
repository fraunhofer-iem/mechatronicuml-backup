/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.DeliveryPolicy;
import es.unican.mast.xmlmast.model.DeliveryServer;
import es.unican.mast.xmlmast.model.ModelPackage;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.DeliveryServerImpl#getDeliveryPolicy <em>Delivery Policy</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.DeliveryServerImpl#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.DeliveryServerImpl#getOutputEventsList <em>Output Events List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeliveryServerImpl extends MinimalEObjectImpl.Container implements DeliveryServer {
	/**
	 * The default value of the '{@link #getDeliveryPolicy() <em>Delivery Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final DeliveryPolicy DELIVERY_POLICY_EDEFAULT = DeliveryPolicy.SCAN;

	/**
	 * The cached value of the '{@link #getDeliveryPolicy() <em>Delivery Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryPolicy()
	 * @generated
	 * @ordered
	 */
	protected DeliveryPolicy deliveryPolicy = DELIVERY_POLICY_EDEFAULT;

	/**
	 * This is true if the Delivery Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deliveryPolicyESet;

	/**
	 * The default value of the '{@link #getInputEvent() <em>Input Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputEvent() <em>Input Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEvent()
	 * @generated
	 * @ordered
	 */
	protected String inputEvent = INPUT_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputEventsList() <em>Output Events List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEventsList()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> OUTPUT_EVENTS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputEventsList() <em>Output Events List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEventsList()
	 * @generated
	 * @ordered
	 */
	protected List<String> outputEventsList = OUTPUT_EVENTS_LIST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DELIVERY_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryPolicy getDeliveryPolicy() {
		return deliveryPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryPolicy(DeliveryPolicy newDeliveryPolicy) {
		DeliveryPolicy oldDeliveryPolicy = deliveryPolicy;
		deliveryPolicy = newDeliveryPolicy == null ? DELIVERY_POLICY_EDEFAULT : newDeliveryPolicy;
		boolean oldDeliveryPolicyESet = deliveryPolicyESet;
		deliveryPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DELIVERY_SERVER__DELIVERY_POLICY, oldDeliveryPolicy, deliveryPolicy, !oldDeliveryPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeliveryPolicy() {
		DeliveryPolicy oldDeliveryPolicy = deliveryPolicy;
		boolean oldDeliveryPolicyESet = deliveryPolicyESet;
		deliveryPolicy = DELIVERY_POLICY_EDEFAULT;
		deliveryPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.DELIVERY_SERVER__DELIVERY_POLICY, oldDeliveryPolicy, DELIVERY_POLICY_EDEFAULT, oldDeliveryPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeliveryPolicy() {
		return deliveryPolicyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputEvent() {
		return inputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputEvent(String newInputEvent) {
		String oldInputEvent = inputEvent;
		inputEvent = newInputEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DELIVERY_SERVER__INPUT_EVENT, oldInputEvent, inputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getOutputEventsList() {
		return outputEventsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputEventsList(List<String> newOutputEventsList) {
		List<String> oldOutputEventsList = outputEventsList;
		outputEventsList = newOutputEventsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DELIVERY_SERVER__OUTPUT_EVENTS_LIST, oldOutputEventsList, outputEventsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DELIVERY_SERVER__DELIVERY_POLICY:
				return getDeliveryPolicy();
			case ModelPackage.DELIVERY_SERVER__INPUT_EVENT:
				return getInputEvent();
			case ModelPackage.DELIVERY_SERVER__OUTPUT_EVENTS_LIST:
				return getOutputEventsList();
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
			case ModelPackage.DELIVERY_SERVER__DELIVERY_POLICY:
				setDeliveryPolicy((DeliveryPolicy)newValue);
				return;
			case ModelPackage.DELIVERY_SERVER__INPUT_EVENT:
				setInputEvent((String)newValue);
				return;
			case ModelPackage.DELIVERY_SERVER__OUTPUT_EVENTS_LIST:
				setOutputEventsList((List<String>)newValue);
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
			case ModelPackage.DELIVERY_SERVER__DELIVERY_POLICY:
				unsetDeliveryPolicy();
				return;
			case ModelPackage.DELIVERY_SERVER__INPUT_EVENT:
				setInputEvent(INPUT_EVENT_EDEFAULT);
				return;
			case ModelPackage.DELIVERY_SERVER__OUTPUT_EVENTS_LIST:
				setOutputEventsList(OUTPUT_EVENTS_LIST_EDEFAULT);
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
			case ModelPackage.DELIVERY_SERVER__DELIVERY_POLICY:
				return isSetDeliveryPolicy();
			case ModelPackage.DELIVERY_SERVER__INPUT_EVENT:
				return INPUT_EVENT_EDEFAULT == null ? inputEvent != null : !INPUT_EVENT_EDEFAULT.equals(inputEvent);
			case ModelPackage.DELIVERY_SERVER__OUTPUT_EVENTS_LIST:
				return OUTPUT_EVENTS_LIST_EDEFAULT == null ? outputEventsList != null : !OUTPUT_EVENTS_LIST_EDEFAULT.equals(outputEventsList);
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
		result.append(" (deliveryPolicy: ");
		if (deliveryPolicyESet) result.append(deliveryPolicy); else result.append("<unset>");
		result.append(", inputEvent: ");
		result.append(inputEvent);
		result.append(", outputEventsList: ");
		result.append(outputEventsList);
		result.append(')');
		return result.toString();
	}

} //DeliveryServerImpl
