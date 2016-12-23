/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.simulink.SimulinkPackage;
import org.muml.simulink.TriggerEvent;
import org.muml.simulink.TriggerPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.impl.TriggerPortImpl#getTriggerInput <em>Trigger Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerPortImpl extends InPortBlockImpl implements TriggerPort {
	/**
	 * The default value of the '{@link #getTriggerInput() <em>Trigger Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerInput()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerEvent TRIGGER_INPUT_EDEFAULT = TriggerEvent.RISING;

	/**
	 * The cached value of the '{@link #getTriggerInput() <em>Trigger Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerInput()
	 * @generated
	 * @ordered
	 */
	protected TriggerEvent triggerInput = TRIGGER_INPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.TRIGGER_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent getTriggerInput() {
		return triggerInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerInput(TriggerEvent newTriggerInput) {
		TriggerEvent oldTriggerInput = triggerInput;
		triggerInput = newTriggerInput == null ? TRIGGER_INPUT_EDEFAULT : newTriggerInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRIGGER_PORT__TRIGGER_INPUT, oldTriggerInput, triggerInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.TRIGGER_PORT__TRIGGER_INPUT:
				return getTriggerInput();
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
			case SimulinkPackage.TRIGGER_PORT__TRIGGER_INPUT:
				setTriggerInput((TriggerEvent)newValue);
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
			case SimulinkPackage.TRIGGER_PORT__TRIGGER_INPUT:
				setTriggerInput(TRIGGER_INPUT_EDEFAULT);
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
			case SimulinkPackage.TRIGGER_PORT__TRIGGER_INPUT:
				return triggerInput != TRIGGER_INPUT_EDEFAULT;
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
		result.append(" (triggerInput: ");
		result.append(triggerInput);
		result.append(')');
		return result.toString();
	}

} //TriggerPortImpl
