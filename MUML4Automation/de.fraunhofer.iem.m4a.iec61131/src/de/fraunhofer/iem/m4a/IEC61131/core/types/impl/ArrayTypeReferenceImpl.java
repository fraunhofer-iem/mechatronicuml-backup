/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ArrayStructVarSpecImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeReference;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeReferenceImpl#getArrayType <em>Array Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayTypeReferenceImpl extends ArrayStructVarSpecImpl implements ArrayTypeReference {
	/**
	 * The cached value of the '{@link #getArrayType() <em>Array Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayType()
	 * @generated
	 * @ordered
	 */
	protected ArrayTypeDeclaration arrayType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ARRAY_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeDeclaration getArrayType() {
		if (arrayType != null && arrayType.eIsProxy()) {
			InternalEObject oldArrayType = (InternalEObject)arrayType;
			arrayType = (ArrayTypeDeclaration)eResolveProxy(oldArrayType);
			if (arrayType != oldArrayType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ARRAY_TYPE_REFERENCE__ARRAY_TYPE, oldArrayType, arrayType));
			}
		}
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeDeclaration basicGetArrayType() {
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayType(ArrayTypeDeclaration newArrayType) {
		ArrayTypeDeclaration oldArrayType = arrayType;
		arrayType = newArrayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ARRAY_TYPE_REFERENCE__ARRAY_TYPE, oldArrayType, arrayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.ARRAY_TYPE_REFERENCE__ARRAY_TYPE:
				if (resolve) return getArrayType();
				return basicGetArrayType();
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
			case TypesPackage.ARRAY_TYPE_REFERENCE__ARRAY_TYPE:
				setArrayType((ArrayTypeDeclaration)newValue);
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
			case TypesPackage.ARRAY_TYPE_REFERENCE__ARRAY_TYPE:
				setArrayType((ArrayTypeDeclaration)null);
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
			case TypesPackage.ARRAY_TYPE_REFERENCE__ARRAY_TYPE:
				return arrayType != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayTypeReferenceImpl
