/**
 */
package de.uni_paderborn.fujaba.muml.psm.swplatform.impl;

import de.uni_paderborn.fujaba.muml.psm.swplatform.EnumerationDataType;
import de.uni_paderborn.fujaba.muml.psm.swplatform.EnumerationValue;
import de.uni_paderborn.fujaba.muml.psm.swplatform.SwplatformPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.storydriven.core.impl.ExtendableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.swplatform.impl.EnumerationValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.swplatform.impl.EnumerationValueImpl#getEnumerationDataType <em>Enumeration Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationValueImpl extends ExtendableElementImpl implements EnumerationValue {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwplatformPackage.Literals.ENUMERATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwplatformPackage.ENUMERATION_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationDataType getEnumerationDataType() {
		if (eContainerFeatureID() != SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE) return null;
		return (EnumerationDataType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumerationDataType(EnumerationDataType newEnumerationDataType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnumerationDataType, SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationDataType(EnumerationDataType newEnumerationDataType) {
		if (newEnumerationDataType != eInternalContainer() || (eContainerFeatureID() != SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE && newEnumerationDataType != null)) {
			if (EcoreUtil.isAncestor(this, newEnumerationDataType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnumerationDataType != null)
				msgs = ((InternalEObject)newEnumerationDataType).eInverseAdd(this, SwplatformPackage.ENUMERATION_DATA_TYPE__ENUMERATION_VALUES, EnumerationDataType.class, msgs);
			msgs = basicSetEnumerationDataType(newEnumerationDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE, newEnumerationDataType, newEnumerationDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnumerationDataType((EnumerationDataType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE:
				return basicSetEnumerationDataType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE:
				return eInternalContainer().eInverseRemove(this, SwplatformPackage.ENUMERATION_DATA_TYPE__ENUMERATION_VALUES, EnumerationDataType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SwplatformPackage.ENUMERATION_VALUE__VALUE:
				return getValue();
			case SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE:
				return getEnumerationDataType();
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
			case SwplatformPackage.ENUMERATION_VALUE__VALUE:
				setValue((String)newValue);
				return;
			case SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE:
				setEnumerationDataType((EnumerationDataType)newValue);
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
			case SwplatformPackage.ENUMERATION_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE:
				setEnumerationDataType((EnumerationDataType)null);
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
			case SwplatformPackage.ENUMERATION_VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SwplatformPackage.ENUMERATION_VALUE__ENUMERATION_DATA_TYPE:
				return getEnumerationDataType() != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //EnumerationValueImpl
