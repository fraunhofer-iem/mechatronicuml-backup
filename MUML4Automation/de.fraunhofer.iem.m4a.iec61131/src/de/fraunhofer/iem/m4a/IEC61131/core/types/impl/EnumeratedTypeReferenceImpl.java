/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SharedVarSpecImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.EnumeratedTypeReference;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumerated Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.EnumeratedTypeReferenceImpl#getEnumeratedType <em>Enumerated Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumeratedTypeReferenceImpl extends SharedVarSpecImpl implements EnumeratedTypeReference {
	/**
	 * The cached value of the '{@link #getEnumeratedType() <em>Enumerated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeratedType()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedTypeDeclaration enumeratedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumeratedTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUMERATED_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedTypeDeclaration getEnumeratedType() {
		if (enumeratedType != null && enumeratedType.eIsProxy()) {
			InternalEObject oldEnumeratedType = (InternalEObject)enumeratedType;
			enumeratedType = (EnumeratedTypeDeclaration)eResolveProxy(oldEnumeratedType);
			if (enumeratedType != oldEnumeratedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ENUMERATED_TYPE_REFERENCE__ENUMERATED_TYPE, oldEnumeratedType, enumeratedType));
			}
		}
		return enumeratedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedTypeDeclaration basicGetEnumeratedType() {
		return enumeratedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeratedType(EnumeratedTypeDeclaration newEnumeratedType) {
		EnumeratedTypeDeclaration oldEnumeratedType = enumeratedType;
		enumeratedType = newEnumeratedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATED_TYPE_REFERENCE__ENUMERATED_TYPE, oldEnumeratedType, enumeratedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.ENUMERATED_TYPE_REFERENCE__ENUMERATED_TYPE:
				if (resolve) return getEnumeratedType();
				return basicGetEnumeratedType();
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
			case TypesPackage.ENUMERATED_TYPE_REFERENCE__ENUMERATED_TYPE:
				setEnumeratedType((EnumeratedTypeDeclaration)newValue);
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
			case TypesPackage.ENUMERATED_TYPE_REFERENCE__ENUMERATED_TYPE:
				setEnumeratedType((EnumeratedTypeDeclaration)null);
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
			case TypesPackage.ENUMERATED_TYPE_REFERENCE__ENUMERATED_TYPE:
				return enumeratedType != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumeratedTypeReferenceImpl
