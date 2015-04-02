/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandEnumeratedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand Enumerated Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.OperandEnumeratedValueImpl#getEnumeratedValue <em>Enumerated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperandEnumeratedValueImpl extends MinimalEObjectImpl.Container implements OperandEnumeratedValue {
	/**
	 * The cached value of the '{@link #getEnumeratedValue() <em>Enumerated Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeratedValue()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedValue enumeratedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperandEnumeratedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.OPERAND_ENUMERATED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValue getEnumeratedValue() {
		if (enumeratedValue != null && enumeratedValue.eIsProxy()) {
			InternalEObject oldEnumeratedValue = (InternalEObject)enumeratedValue;
			enumeratedValue = (EnumeratedValue)eResolveProxy(oldEnumeratedValue);
			if (enumeratedValue != oldEnumeratedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.OPERAND_ENUMERATED_VALUE__ENUMERATED_VALUE, oldEnumeratedValue, enumeratedValue));
			}
		}
		return enumeratedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValue basicGetEnumeratedValue() {
		return enumeratedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeratedValue(EnumeratedValue newEnumeratedValue) {
		EnumeratedValue oldEnumeratedValue = enumeratedValue;
		enumeratedValue = newEnumeratedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.OPERAND_ENUMERATED_VALUE__ENUMERATED_VALUE, oldEnumeratedValue, enumeratedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IlPackage.OPERAND_ENUMERATED_VALUE__ENUMERATED_VALUE:
				if (resolve) return getEnumeratedValue();
				return basicGetEnumeratedValue();
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
			case IlPackage.OPERAND_ENUMERATED_VALUE__ENUMERATED_VALUE:
				setEnumeratedValue((EnumeratedValue)newValue);
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
			case IlPackage.OPERAND_ENUMERATED_VALUE__ENUMERATED_VALUE:
				setEnumeratedValue((EnumeratedValue)null);
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
			case IlPackage.OPERAND_ENUMERATED_VALUE__ENUMERATED_VALUE:
				return enumeratedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //OperandEnumeratedValueImpl
