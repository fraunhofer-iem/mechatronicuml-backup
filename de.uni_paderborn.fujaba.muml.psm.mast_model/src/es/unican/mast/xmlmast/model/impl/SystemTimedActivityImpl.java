/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.SystemTimedActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Timed Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SystemTimedActivityImpl#getActivityOperation <em>Activity Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SystemTimedActivityImpl#getActivityServer <em>Activity Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SystemTimedActivityImpl#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SystemTimedActivityImpl#getOutputEvent <em>Output Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemTimedActivityImpl extends MinimalEObjectImpl.Container implements SystemTimedActivity {
	/**
	 * The default value of the '{@link #getActivityOperation() <em>Activity Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityOperation() <em>Activity Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityOperation()
	 * @generated
	 * @ordered
	 */
	protected String activityOperation = ACTIVITY_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivityServer() <em>Activity Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityServer()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityServer() <em>Activity Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityServer()
	 * @generated
	 * @ordered
	 */
	protected String activityServer = ACTIVITY_SERVER_EDEFAULT;

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
	 * The default value of the '{@link #getOutputEvent() <em>Output Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputEvent() <em>Output Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEvent()
	 * @generated
	 * @ordered
	 */
	protected String outputEvent = OUTPUT_EVENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemTimedActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SYSTEM_TIMED_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityOperation() {
		return activityOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityOperation(String newActivityOperation) {
		String oldActivityOperation = activityOperation;
		activityOperation = newActivityOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM_TIMED_ACTIVITY__ACTIVITY_OPERATION, oldActivityOperation, activityOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityServer() {
		return activityServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityServer(String newActivityServer) {
		String oldActivityServer = activityServer;
		activityServer = newActivityServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM_TIMED_ACTIVITY__ACTIVITY_SERVER, oldActivityServer, activityServer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM_TIMED_ACTIVITY__INPUT_EVENT, oldInputEvent, inputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputEvent() {
		return outputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputEvent(String newOutputEvent) {
		String oldOutputEvent = outputEvent;
		outputEvent = newOutputEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM_TIMED_ACTIVITY__OUTPUT_EVENT, oldOutputEvent, outputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__ACTIVITY_OPERATION:
				return getActivityOperation();
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__ACTIVITY_SERVER:
				return getActivityServer();
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__INPUT_EVENT:
				return getInputEvent();
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__OUTPUT_EVENT:
				return getOutputEvent();
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
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__ACTIVITY_OPERATION:
				setActivityOperation((String)newValue);
				return;
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__ACTIVITY_SERVER:
				setActivityServer((String)newValue);
				return;
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__INPUT_EVENT:
				setInputEvent((String)newValue);
				return;
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__OUTPUT_EVENT:
				setOutputEvent((String)newValue);
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
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__ACTIVITY_OPERATION:
				setActivityOperation(ACTIVITY_OPERATION_EDEFAULT);
				return;
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__ACTIVITY_SERVER:
				setActivityServer(ACTIVITY_SERVER_EDEFAULT);
				return;
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__INPUT_EVENT:
				setInputEvent(INPUT_EVENT_EDEFAULT);
				return;
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__OUTPUT_EVENT:
				setOutputEvent(OUTPUT_EVENT_EDEFAULT);
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
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__ACTIVITY_OPERATION:
				return ACTIVITY_OPERATION_EDEFAULT == null ? activityOperation != null : !ACTIVITY_OPERATION_EDEFAULT.equals(activityOperation);
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__ACTIVITY_SERVER:
				return ACTIVITY_SERVER_EDEFAULT == null ? activityServer != null : !ACTIVITY_SERVER_EDEFAULT.equals(activityServer);
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__INPUT_EVENT:
				return INPUT_EVENT_EDEFAULT == null ? inputEvent != null : !INPUT_EVENT_EDEFAULT.equals(inputEvent);
			case ModelPackage.SYSTEM_TIMED_ACTIVITY__OUTPUT_EVENT:
				return OUTPUT_EVENT_EDEFAULT == null ? outputEvent != null : !OUTPUT_EVENT_EDEFAULT.equals(outputEvent);
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
		result.append(" (activityOperation: ");
		result.append(activityOperation);
		result.append(", activityServer: ");
		result.append(activityServer);
		result.append(", inputEvent: ");
		result.append(inputEvent);
		result.append(", outputEvent: ");
		result.append(outputEvent);
		result.append(')');
		return result.toString();
	}

} //SystemTimedActivityImpl
