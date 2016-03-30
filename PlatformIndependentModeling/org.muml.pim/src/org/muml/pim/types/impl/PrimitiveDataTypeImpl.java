/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.PrimitiveTypes;
import org.muml.pim.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.types.impl.PrimitiveDataTypeImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveDataTypeImpl extends DataTypeImpl implements PrimitiveDataType {
	/**
	 * The default value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveTypes PRIMITIVE_TYPE_EDEFAULT = PrimitiveTypes.VOID;

	/**
	 * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveTypes primitiveType = PRIMITIVE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.PRIMITIVE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypes getPrimitiveType() {
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveType(PrimitiveTypes newPrimitiveType) {
		PrimitiveTypes oldPrimitiveType = primitiveType;
		primitiveType = newPrimitiveType == null ? PRIMITIVE_TYPE_EDEFAULT : newPrimitiveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PRIMITIVE_DATA_TYPE__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.PRIMITIVE_DATA_TYPE__PRIMITIVE_TYPE:
				return getPrimitiveType();
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
			case TypesPackage.PRIMITIVE_DATA_TYPE__PRIMITIVE_TYPE:
				setPrimitiveType((PrimitiveTypes)newValue);
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
			case TypesPackage.PRIMITIVE_DATA_TYPE__PRIMITIVE_TYPE:
				setPrimitiveType(PRIMITIVE_TYPE_EDEFAULT);
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
			case TypesPackage.PRIMITIVE_DATA_TYPE__PRIMITIVE_TYPE:
				return primitiveType != PRIMITIVE_TYPE_EDEFAULT;
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
		result.append(" (primitiveType: ");
		result.append(primitiveType);
		result.append(')');
		return result.toString();
	}

} //PrimitiveDataTypeImpl
