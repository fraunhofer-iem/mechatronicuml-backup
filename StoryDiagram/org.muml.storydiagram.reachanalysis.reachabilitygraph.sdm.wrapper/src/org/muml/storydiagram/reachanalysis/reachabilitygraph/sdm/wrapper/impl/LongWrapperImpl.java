/**
 */
package org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.LongWrapper;
import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.WrapperPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.wrapper.impl.LongWrapperImpl#getLongValue <em>Long Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LongWrapperImpl extends MinimalEObjectImpl.Container implements LongWrapper {
	/**
	 * The default value of the '{@link #getLongValue() <em>Long Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongValue()
	 * @generated
	 * @ordered
	 */
	protected static final long LONG_VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLongValue() <em>Long Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongValue()
	 * @generated
	 * @ordered
	 */
	protected long longValue = LONG_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongWrapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WrapperPackage.Literals.LONG_WRAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLongValue() {
		return longValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongValue(long newLongValue) {
		long oldLongValue = longValue;
		longValue = newLongValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WrapperPackage.LONG_WRAPPER__LONG_VALUE, oldLongValue, longValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WrapperPackage.LONG_WRAPPER__LONG_VALUE:
				return getLongValue();
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
			case WrapperPackage.LONG_WRAPPER__LONG_VALUE:
				setLongValue((Long)newValue);
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
			case WrapperPackage.LONG_WRAPPER__LONG_VALUE:
				setLongValue(LONG_VALUE_EDEFAULT);
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
			case WrapperPackage.LONG_WRAPPER__LONG_VALUE:
				return longValue != LONG_VALUE_EDEFAULT;
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
		result.append(" (longValue: ");
		result.append(longValue);
		result.append(')');
		return result.toString();
	}

} //LongWrapperImpl
