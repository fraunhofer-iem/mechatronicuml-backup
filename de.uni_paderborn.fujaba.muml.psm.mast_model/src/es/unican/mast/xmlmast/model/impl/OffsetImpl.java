/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.Offset;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.OffsetImpl#getDelayMaxInterval <em>Delay Max Interval</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.OffsetImpl#getDelayMinInterval <em>Delay Min Interval</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.OffsetImpl#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.OffsetImpl#getOutputEvent <em>Output Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.OffsetImpl#getReferencedEvent <em>Referenced Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OffsetImpl extends MinimalEObjectImpl.Container implements Offset {
	/**
	 * The default value of the '{@link #getDelayMaxInterval() <em>Delay Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayMaxInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float DELAY_MAX_INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDelayMaxInterval() <em>Delay Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayMaxInterval()
	 * @generated
	 * @ordered
	 */
	protected float delayMaxInterval = DELAY_MAX_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Delay Max Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delayMaxIntervalESet;

	/**
	 * The default value of the '{@link #getDelayMinInterval() <em>Delay Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayMinInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float DELAY_MIN_INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDelayMinInterval() <em>Delay Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayMinInterval()
	 * @generated
	 * @ordered
	 */
	protected float delayMinInterval = DELAY_MIN_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Delay Min Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delayMinIntervalESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OffsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.OFFSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDelayMaxInterval() {
		return delayMaxInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayMaxInterval(float newDelayMaxInterval) {
		float oldDelayMaxInterval = delayMaxInterval;
		delayMaxInterval = newDelayMaxInterval;
		boolean oldDelayMaxIntervalESet = delayMaxIntervalESet;
		delayMaxIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OFFSET__DELAY_MAX_INTERVAL, oldDelayMaxInterval, delayMaxInterval, !oldDelayMaxIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelayMaxInterval() {
		float oldDelayMaxInterval = delayMaxInterval;
		boolean oldDelayMaxIntervalESet = delayMaxIntervalESet;
		delayMaxInterval = DELAY_MAX_INTERVAL_EDEFAULT;
		delayMaxIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.OFFSET__DELAY_MAX_INTERVAL, oldDelayMaxInterval, DELAY_MAX_INTERVAL_EDEFAULT, oldDelayMaxIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelayMaxInterval() {
		return delayMaxIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDelayMinInterval() {
		return delayMinInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayMinInterval(float newDelayMinInterval) {
		float oldDelayMinInterval = delayMinInterval;
		delayMinInterval = newDelayMinInterval;
		boolean oldDelayMinIntervalESet = delayMinIntervalESet;
		delayMinIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OFFSET__DELAY_MIN_INTERVAL, oldDelayMinInterval, delayMinInterval, !oldDelayMinIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelayMinInterval() {
		float oldDelayMinInterval = delayMinInterval;
		boolean oldDelayMinIntervalESet = delayMinIntervalESet;
		delayMinInterval = DELAY_MIN_INTERVAL_EDEFAULT;
		delayMinIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.OFFSET__DELAY_MIN_INTERVAL, oldDelayMinInterval, DELAY_MIN_INTERVAL_EDEFAULT, oldDelayMinIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelayMinInterval() {
		return delayMinIntervalESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OFFSET__INPUT_EVENT, oldInputEvent, inputEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OFFSET__OUTPUT_EVENT, oldOutputEvent, outputEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OFFSET__REFERENCED_EVENT, oldReferencedEvent, referencedEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.OFFSET__DELAY_MAX_INTERVAL:
				return getDelayMaxInterval();
			case ModelPackage.OFFSET__DELAY_MIN_INTERVAL:
				return getDelayMinInterval();
			case ModelPackage.OFFSET__INPUT_EVENT:
				return getInputEvent();
			case ModelPackage.OFFSET__OUTPUT_EVENT:
				return getOutputEvent();
			case ModelPackage.OFFSET__REFERENCED_EVENT:
				return getReferencedEvent();
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
			case ModelPackage.OFFSET__DELAY_MAX_INTERVAL:
				setDelayMaxInterval((Float)newValue);
				return;
			case ModelPackage.OFFSET__DELAY_MIN_INTERVAL:
				setDelayMinInterval((Float)newValue);
				return;
			case ModelPackage.OFFSET__INPUT_EVENT:
				setInputEvent((String)newValue);
				return;
			case ModelPackage.OFFSET__OUTPUT_EVENT:
				setOutputEvent((String)newValue);
				return;
			case ModelPackage.OFFSET__REFERENCED_EVENT:
				setReferencedEvent((String)newValue);
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
			case ModelPackage.OFFSET__DELAY_MAX_INTERVAL:
				unsetDelayMaxInterval();
				return;
			case ModelPackage.OFFSET__DELAY_MIN_INTERVAL:
				unsetDelayMinInterval();
				return;
			case ModelPackage.OFFSET__INPUT_EVENT:
				setInputEvent(INPUT_EVENT_EDEFAULT);
				return;
			case ModelPackage.OFFSET__OUTPUT_EVENT:
				setOutputEvent(OUTPUT_EVENT_EDEFAULT);
				return;
			case ModelPackage.OFFSET__REFERENCED_EVENT:
				setReferencedEvent(REFERENCED_EVENT_EDEFAULT);
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
			case ModelPackage.OFFSET__DELAY_MAX_INTERVAL:
				return isSetDelayMaxInterval();
			case ModelPackage.OFFSET__DELAY_MIN_INTERVAL:
				return isSetDelayMinInterval();
			case ModelPackage.OFFSET__INPUT_EVENT:
				return INPUT_EVENT_EDEFAULT == null ? inputEvent != null : !INPUT_EVENT_EDEFAULT.equals(inputEvent);
			case ModelPackage.OFFSET__OUTPUT_EVENT:
				return OUTPUT_EVENT_EDEFAULT == null ? outputEvent != null : !OUTPUT_EVENT_EDEFAULT.equals(outputEvent);
			case ModelPackage.OFFSET__REFERENCED_EVENT:
				return REFERENCED_EVENT_EDEFAULT == null ? referencedEvent != null : !REFERENCED_EVENT_EDEFAULT.equals(referencedEvent);
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
		result.append(" (delayMaxInterval: ");
		if (delayMaxIntervalESet) result.append(delayMaxInterval); else result.append("<unset>");
		result.append(", delayMinInterval: ");
		if (delayMinIntervalESet) result.append(delayMinInterval); else result.append("<unset>");
		result.append(", inputEvent: ");
		result.append(inputEvent);
		result.append(", outputEvent: ");
		result.append(outputEvent);
		result.append(", referencedEvent: ");
		result.append(referencedEvent);
		result.append(')');
		return result.toString();
	}

} //OffsetImpl
