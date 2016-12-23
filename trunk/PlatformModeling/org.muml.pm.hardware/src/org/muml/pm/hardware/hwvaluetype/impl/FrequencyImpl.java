/**
 */
package org.muml.pm.hardware.hwvaluetype.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.pm.hardware.hwvaluetype.Frequency;
import org.muml.pm.hardware.hwvaluetype.FrequencyUnit;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.impl.FrequencyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.impl.FrequencyImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyImpl extends MinimalEObjectImpl.Container implements Frequency {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final FrequencyUnit UNIT_EDEFAULT = FrequencyUnit.HZ;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected FrequencyUnit unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwvaluetypePackage.Literals.FREQUENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwvaluetypePackage.FREQUENCY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(FrequencyUnit newUnit) {
		FrequencyUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwvaluetypePackage.FREQUENCY__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		// Return value concatenated with unit
		StringBuffer sb = new StringBuffer();
		sb.append(String.valueOf(value));
			if (unit != null) {
				sb.append(' ');
				sb.append(unit.toString());
				}
		return sb.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInHz() {
		double inHz=0;
				if(unit!=null){
				inHz=value*Math.pow(10, unit.getValue());	
				}
		return inHz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwvaluetypePackage.FREQUENCY__VALUE:
				return getValue();
			case HwvaluetypePackage.FREQUENCY__UNIT:
				return getUnit();
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
			case HwvaluetypePackage.FREQUENCY__VALUE:
				setValue((Double)newValue);
				return;
			case HwvaluetypePackage.FREQUENCY__UNIT:
				setUnit((FrequencyUnit)newValue);
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
			case HwvaluetypePackage.FREQUENCY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case HwvaluetypePackage.FREQUENCY__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case HwvaluetypePackage.FREQUENCY__VALUE:
				return value != VALUE_EDEFAULT;
			case HwvaluetypePackage.FREQUENCY__UNIT:
				return unit != UNIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HwvaluetypePackage.FREQUENCY___TO_STRING:
				return toString();
			case HwvaluetypePackage.FREQUENCY___GET_IN_HZ:
				return getInHz();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FrequencyImpl
