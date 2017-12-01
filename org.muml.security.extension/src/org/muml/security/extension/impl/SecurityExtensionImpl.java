/**
 */
package org.muml.security.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.core.impl.ExtensionImpl;

import org.muml.security.extension.ExtensionPackage;
import org.muml.security.extension.SecurityExtension;
import org.muml.security.extension.sensitivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.security.extension.impl.SecurityExtensionImpl#getSensitivityFlag <em>Sensitivity Flag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityExtensionImpl extends ExtensionImpl implements SecurityExtension {
	/**
	 * The default value of the '{@link #getSensitivityFlag() <em>Sensitivity Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivityFlag()
	 * @generated
	 * @ordered
	 */
	protected static final sensitivity SENSITIVITY_FLAG_EDEFAULT = sensitivity.NEUTRAL;
	/**
	 * The cached value of the '{@link #getSensitivityFlag() <em>Sensitivity Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivityFlag()
	 * @generated
	 * @ordered
	 */
	protected sensitivity sensitivityFlag = SENSITIVITY_FLAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionPackage.Literals.SECURITY_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sensitivity getSensitivityFlag() {
		return sensitivityFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensitivityFlag(sensitivity newSensitivityFlag) {
		sensitivity oldSensitivityFlag = sensitivityFlag;
		sensitivityFlag = newSensitivityFlag == null ? SENSITIVITY_FLAG_EDEFAULT : newSensitivityFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.SECURITY_EXTENSION__SENSITIVITY_FLAG, oldSensitivityFlag, sensitivityFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionPackage.SECURITY_EXTENSION__SENSITIVITY_FLAG:
				return getSensitivityFlag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionPackage.SECURITY_EXTENSION__SENSITIVITY_FLAG:
				setSensitivityFlag((sensitivity)newValue);
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
			case ExtensionPackage.SECURITY_EXTENSION__SENSITIVITY_FLAG:
				setSensitivityFlag(SENSITIVITY_FLAG_EDEFAULT);
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
			case ExtensionPackage.SECURITY_EXTENSION__SENSITIVITY_FLAG:
				return sensitivityFlag != SENSITIVITY_FLAG_EDEFAULT;
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
		result.append(" (sensitivityFlag: ");
		result.append(sensitivityFlag);
		result.append(')');
		return result.toString();
	}

} //SecurityExtensionImpl
