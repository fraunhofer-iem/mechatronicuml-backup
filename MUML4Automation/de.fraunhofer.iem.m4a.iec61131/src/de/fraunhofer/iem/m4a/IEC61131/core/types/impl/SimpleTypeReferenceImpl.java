/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SimpleTypeReference;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SimpleTypeReferenceImpl#getSimpleType <em>Simple Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTypeReferenceImpl extends SimpleSpecificationImpl implements SimpleTypeReference {
	/**
	 * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected SimpleTypeDeclaration simpleType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.SIMPLE_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeDeclaration getSimpleType() {
		if (simpleType != null && simpleType.eIsProxy()) {
			InternalEObject oldSimpleType = (InternalEObject)simpleType;
			simpleType = (SimpleTypeDeclaration)eResolveProxy(oldSimpleType);
			if (simpleType != oldSimpleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SIMPLE_TYPE_REFERENCE__SIMPLE_TYPE, oldSimpleType, simpleType));
			}
		}
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeDeclaration basicGetSimpleType() {
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleType(SimpleTypeDeclaration newSimpleType) {
		SimpleTypeDeclaration oldSimpleType = simpleType;
		simpleType = newSimpleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SIMPLE_TYPE_REFERENCE__SIMPLE_TYPE, oldSimpleType, simpleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.SIMPLE_TYPE_REFERENCE__SIMPLE_TYPE:
				if (resolve) return getSimpleType();
				return basicGetSimpleType();
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
			case TypesPackage.SIMPLE_TYPE_REFERENCE__SIMPLE_TYPE:
				setSimpleType((SimpleTypeDeclaration)newValue);
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
			case TypesPackage.SIMPLE_TYPE_REFERENCE__SIMPLE_TYPE:
				setSimpleType((SimpleTypeDeclaration)null);
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
			case TypesPackage.SIMPLE_TYPE_REFERENCE__SIMPLE_TYPE:
				return simpleType != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleTypeReferenceImpl
