/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedValue;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.EnumeratedValueRef;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Value Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.EnumeratedValueRefImpl#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumeratedValueRefImpl extends MinimalEObjectImpl.Container implements EnumeratedValueRef {
	/**
	 * The cached value of the '{@link #getEnumValue() <em>Enum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumValue()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedValue enumValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedValueRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.ENUMERATED_VALUE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValue getEnumValue() {
		if (enumValue != null && enumValue.eIsProxy()) {
			InternalEObject oldEnumValue = (InternalEObject)enumValue;
			enumValue = (EnumeratedValue)eResolveProxy(oldEnumValue);
			if (enumValue != oldEnumValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.ENUMERATED_VALUE_REF__ENUM_VALUE, oldEnumValue, enumValue));
			}
		}
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValue basicGetEnumValue() {
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumValue(EnumeratedValue newEnumValue) {
		EnumeratedValue oldEnumValue = enumValue;
		enumValue = newEnumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.ENUMERATED_VALUE_REF__ENUM_VALUE, oldEnumValue, enumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StPackage.ENUMERATED_VALUE_REF__ENUM_VALUE:
				if (resolve) return getEnumValue();
				return basicGetEnumValue();
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
			case StPackage.ENUMERATED_VALUE_REF__ENUM_VALUE:
				setEnumValue((EnumeratedValue)newValue);
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
			case StPackage.ENUMERATED_VALUE_REF__ENUM_VALUE:
				setEnumValue((EnumeratedValue)null);
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
			case StPackage.ENUMERATED_VALUE_REF__ENUM_VALUE:
				return enumValue != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedValueRefImpl
