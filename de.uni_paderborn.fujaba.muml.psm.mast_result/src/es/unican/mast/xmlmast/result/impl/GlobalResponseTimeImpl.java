/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.GlobalResponseTime;
import es.unican.mast.xmlmast.result.ResultPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Response Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.GlobalResponseTimeImpl#getReferencedEvent <em>Referenced Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.GlobalResponseTimeImpl#getTimeValue <em>Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalResponseTimeImpl extends MinimalEObjectImpl.Container implements GlobalResponseTime {
	/**
	 * The default value of the '{@link #getReferencedEvent() <em>Referenced Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedEvent() <em>Referenced Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedEvent()
	 * @generated
	 * @ordered
	 */
	protected String referencedEvent = REFERENCED_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeValue() <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeValue() <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected float timeValue = TIME_VALUE_EDEFAULT;

	/**
	 * This is true if the Time Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalResponseTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.GLOBAL_RESPONSE_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencedEvent() {
		return referencedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedEvent(String newReferencedEvent) {
		String oldReferencedEvent = referencedEvent;
		referencedEvent = newReferencedEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.GLOBAL_RESPONSE_TIME__REFERENCED_EVENT, oldReferencedEvent, referencedEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeValue() {
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValue(float newTimeValue) {
		float oldTimeValue = timeValue;
		timeValue = newTimeValue;
		boolean oldTimeValueESet = timeValueESet;
		timeValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.GLOBAL_RESPONSE_TIME__TIME_VALUE, oldTimeValue, timeValue, !oldTimeValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeValue() {
		float oldTimeValue = timeValue;
		boolean oldTimeValueESet = timeValueESet;
		timeValue = TIME_VALUE_EDEFAULT;
		timeValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ResultPackage.GLOBAL_RESPONSE_TIME__TIME_VALUE, oldTimeValue, TIME_VALUE_EDEFAULT, oldTimeValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeValue() {
		return timeValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.GLOBAL_RESPONSE_TIME__REFERENCED_EVENT:
				return getReferencedEvent();
			case ResultPackage.GLOBAL_RESPONSE_TIME__TIME_VALUE:
				return getTimeValue();
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
			case ResultPackage.GLOBAL_RESPONSE_TIME__REFERENCED_EVENT:
				setReferencedEvent((String)newValue);
				return;
			case ResultPackage.GLOBAL_RESPONSE_TIME__TIME_VALUE:
				setTimeValue((Float)newValue);
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
			case ResultPackage.GLOBAL_RESPONSE_TIME__REFERENCED_EVENT:
				setReferencedEvent(REFERENCED_EVENT_EDEFAULT);
				return;
			case ResultPackage.GLOBAL_RESPONSE_TIME__TIME_VALUE:
				unsetTimeValue();
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
			case ResultPackage.GLOBAL_RESPONSE_TIME__REFERENCED_EVENT:
				return REFERENCED_EVENT_EDEFAULT == null ? referencedEvent != null : !REFERENCED_EVENT_EDEFAULT.equals(referencedEvent);
			case ResultPackage.GLOBAL_RESPONSE_TIME__TIME_VALUE:
				return isSetTimeValue();
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
		result.append(" (referencedEvent: ");
		result.append(referencedEvent);
		result.append(", timeValue: ");
		if (timeValueESet) result.append(timeValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GlobalResponseTimeImpl
