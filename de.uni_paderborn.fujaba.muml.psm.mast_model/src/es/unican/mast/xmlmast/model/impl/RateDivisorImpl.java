/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.RateDivisor;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate Divisor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RateDivisorImpl#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RateDivisorImpl#getOutputEvent <em>Output Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.RateDivisorImpl#getRateFactor <em>Rate Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RateDivisorImpl extends MinimalEObjectImpl.Container implements RateDivisor {
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
	 * The default value of the '{@link #getRateFactor() <em>Rate Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateFactor()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RATE_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateFactor() <em>Rate Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateFactor()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rateFactor = RATE_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateDivisorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RATE_DIVISOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RATE_DIVISOR__INPUT_EVENT, oldInputEvent, inputEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RATE_DIVISOR__OUTPUT_EVENT, oldOutputEvent, outputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRateFactor() {
		return rateFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateFactor(BigInteger newRateFactor) {
		BigInteger oldRateFactor = rateFactor;
		rateFactor = newRateFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RATE_DIVISOR__RATE_FACTOR, oldRateFactor, rateFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RATE_DIVISOR__INPUT_EVENT:
				return getInputEvent();
			case ModelPackage.RATE_DIVISOR__OUTPUT_EVENT:
				return getOutputEvent();
			case ModelPackage.RATE_DIVISOR__RATE_FACTOR:
				return getRateFactor();
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
			case ModelPackage.RATE_DIVISOR__INPUT_EVENT:
				setInputEvent((String)newValue);
				return;
			case ModelPackage.RATE_DIVISOR__OUTPUT_EVENT:
				setOutputEvent((String)newValue);
				return;
			case ModelPackage.RATE_DIVISOR__RATE_FACTOR:
				setRateFactor((BigInteger)newValue);
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
			case ModelPackage.RATE_DIVISOR__INPUT_EVENT:
				setInputEvent(INPUT_EVENT_EDEFAULT);
				return;
			case ModelPackage.RATE_DIVISOR__OUTPUT_EVENT:
				setOutputEvent(OUTPUT_EVENT_EDEFAULT);
				return;
			case ModelPackage.RATE_DIVISOR__RATE_FACTOR:
				setRateFactor(RATE_FACTOR_EDEFAULT);
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
			case ModelPackage.RATE_DIVISOR__INPUT_EVENT:
				return INPUT_EVENT_EDEFAULT == null ? inputEvent != null : !INPUT_EVENT_EDEFAULT.equals(inputEvent);
			case ModelPackage.RATE_DIVISOR__OUTPUT_EVENT:
				return OUTPUT_EVENT_EDEFAULT == null ? outputEvent != null : !OUTPUT_EVENT_EDEFAULT.equals(outputEvent);
			case ModelPackage.RATE_DIVISOR__RATE_FACTOR:
				return RATE_FACTOR_EDEFAULT == null ? rateFactor != null : !RATE_FACTOR_EDEFAULT.equals(rateFactor);
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
		result.append(", outputEvent: ");
		result.append(outputEvent);
		result.append(", rateFactor: ");
		result.append(rateFactor);
		result.append(')');
		return result.toString();
	}

} //RateDivisorImpl
