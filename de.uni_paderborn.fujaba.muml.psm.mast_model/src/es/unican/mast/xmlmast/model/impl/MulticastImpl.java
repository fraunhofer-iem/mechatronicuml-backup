/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.Multicast;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multicast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MulticastImpl#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MulticastImpl#getOutputEventsList <em>Output Events List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MulticastImpl extends MinimalEObjectImpl.Container implements Multicast {
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
	protected MulticastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MULTICAST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTICAST__INPUT_EVENT, oldInputEvent, inputEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MULTICAST__OUTPUT_EVENTS_LIST, oldOutputEventsList, outputEventsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MULTICAST__INPUT_EVENT:
				return getInputEvent();
			case ModelPackage.MULTICAST__OUTPUT_EVENTS_LIST:
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
			case ModelPackage.MULTICAST__INPUT_EVENT:
				setInputEvent((String)newValue);
				return;
			case ModelPackage.MULTICAST__OUTPUT_EVENTS_LIST:
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
			case ModelPackage.MULTICAST__INPUT_EVENT:
				setInputEvent(INPUT_EVENT_EDEFAULT);
				return;
			case ModelPackage.MULTICAST__OUTPUT_EVENTS_LIST:
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
			case ModelPackage.MULTICAST__INPUT_EVENT:
				return INPUT_EVENT_EDEFAULT == null ? inputEvent != null : !INPUT_EVENT_EDEFAULT.equals(inputEvent);
			case ModelPackage.MULTICAST__OUTPUT_EVENTS_LIST:
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
		result.append(" (inputEvent: ");
		result.append(inputEvent);
		result.append(", outputEventsList: ");
		result.append(outputEventsList);
		result.append(')');
		return result.toString();
	}

} //MulticastImpl
