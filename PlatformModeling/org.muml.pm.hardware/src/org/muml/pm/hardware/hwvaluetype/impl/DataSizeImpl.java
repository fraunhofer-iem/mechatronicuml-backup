/**
 */
package org.muml.pm.hardware.hwvaluetype.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.pm.hardware.hwvaluetype.DataSize;
import org.muml.pm.hardware.hwvaluetype.DataSizeUnit;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.impl.DataSizeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.muml.pm.hardware.hwvaluetype.impl.DataSizeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSizeImpl extends MinimalEObjectImpl.Container implements DataSize {
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
	protected static final DataSizeUnit UNIT_EDEFAULT = DataSizeUnit.BYTE;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected DataSizeUnit unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HwvaluetypePackage.Literals.DATA_SIZE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HwvaluetypePackage.DATA_SIZE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSizeUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(DataSizeUnit newUnit) {
		DataSizeUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwvaluetypePackage.DATA_SIZE__UNIT, oldUnit, unit));
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
	public double getInByte() {
		double inByte=0;
				if(unit!=null){
				inByte=value*Math.pow(2, unit.getValue());	
				}
		return inByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwvaluetypePackage.DATA_SIZE__VALUE:
				return getValue();
			case HwvaluetypePackage.DATA_SIZE__UNIT:
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
			case HwvaluetypePackage.DATA_SIZE__VALUE:
				setValue((Double)newValue);
				return;
			case HwvaluetypePackage.DATA_SIZE__UNIT:
				setUnit((DataSizeUnit)newValue);
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
			case HwvaluetypePackage.DATA_SIZE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case HwvaluetypePackage.DATA_SIZE__UNIT:
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
			case HwvaluetypePackage.DATA_SIZE__VALUE:
				return value != VALUE_EDEFAULT;
			case HwvaluetypePackage.DATA_SIZE__UNIT:
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
			case HwvaluetypePackage.DATA_SIZE___TO_STRING:
				return toString();
			case HwvaluetypePackage.DATA_SIZE___GET_IN_BYTE:
				return getInByte();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataSizeImpl
