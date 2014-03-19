/**
 */
package de.uni_paderborn.fujaba.properties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.properties.CustomPropertyEditor;
import de.uni_paderborn.fujaba.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Property Editor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.properties.impl.CustomPropertyEditorImpl#getFullyQualifiedClassName <em>Fully Qualified Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomPropertyEditorImpl extends PropertyEditorImpl implements CustomPropertyEditor {
	/**
	 * The default value of the '{@link #getFullyQualifiedClassName() <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULLY_QUALIFIED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullyQualifiedClassName() <em>Fully Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullyQualifiedClassName()
	 * @generated
	 * @ordered
	 */
	protected String fullyQualifiedClassName = FULLY_QUALIFIED_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomPropertyEditorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.CUSTOM_PROPERTY_EDITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullyQualifiedClassName() {
		return fullyQualifiedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullyQualifiedClassName(String newFullyQualifiedClassName) {
		String oldFullyQualifiedClassName = fullyQualifiedClassName;
		fullyQualifiedClassName = newFullyQualifiedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.CUSTOM_PROPERTY_EDITOR__FULLY_QUALIFIED_CLASS_NAME, oldFullyQualifiedClassName, fullyQualifiedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.CUSTOM_PROPERTY_EDITOR__FULLY_QUALIFIED_CLASS_NAME:
				return getFullyQualifiedClassName();
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
			case PropertiesPackage.CUSTOM_PROPERTY_EDITOR__FULLY_QUALIFIED_CLASS_NAME:
				setFullyQualifiedClassName((String)newValue);
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
			case PropertiesPackage.CUSTOM_PROPERTY_EDITOR__FULLY_QUALIFIED_CLASS_NAME:
				setFullyQualifiedClassName(FULLY_QUALIFIED_CLASS_NAME_EDEFAULT);
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
			case PropertiesPackage.CUSTOM_PROPERTY_EDITOR__FULLY_QUALIFIED_CLASS_NAME:
				return FULLY_QUALIFIED_CLASS_NAME_EDEFAULT == null ? fullyQualifiedClassName != null : !FULLY_QUALIFIED_CLASS_NAME_EDEFAULT.equals(fullyQualifiedClassName);
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
		result.append(" (fullyQualifiedClassName: ");
		result.append(fullyQualifiedClassName);
		result.append(')');
		return result.toString();
	}

} //CustomPropertyEditorImpl
