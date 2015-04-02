/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SharedVarSpecImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeReference;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subrange Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeReferenceImpl#getSubrangeType <em>Subrange Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubrangeTypeReferenceImpl extends SharedVarSpecImpl implements SubrangeTypeReference {
	/**
	 * The cached value of the '{@link #getSubrangeType() <em>Subrange Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubrangeType()
	 * @generated
	 * @ordered
	 */
	protected SubrangeTypeDeclaration subrangeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubrangeTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.SUBRANGE_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeTypeDeclaration getSubrangeType() {
		if (subrangeType != null && subrangeType.eIsProxy()) {
			InternalEObject oldSubrangeType = (InternalEObject)subrangeType;
			subrangeType = (SubrangeTypeDeclaration)eResolveProxy(oldSubrangeType);
			if (subrangeType != oldSubrangeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SUBRANGE_TYPE_REFERENCE__SUBRANGE_TYPE, oldSubrangeType, subrangeType));
			}
		}
		return subrangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeTypeDeclaration basicGetSubrangeType() {
		return subrangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubrangeType(SubrangeTypeDeclaration newSubrangeType) {
		SubrangeTypeDeclaration oldSubrangeType = subrangeType;
		subrangeType = newSubrangeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBRANGE_TYPE_REFERENCE__SUBRANGE_TYPE, oldSubrangeType, subrangeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.SUBRANGE_TYPE_REFERENCE__SUBRANGE_TYPE:
				if (resolve) return getSubrangeType();
				return basicGetSubrangeType();
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
			case TypesPackage.SUBRANGE_TYPE_REFERENCE__SUBRANGE_TYPE:
				setSubrangeType((SubrangeTypeDeclaration)newValue);
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
			case TypesPackage.SUBRANGE_TYPE_REFERENCE__SUBRANGE_TYPE:
				setSubrangeType((SubrangeTypeDeclaration)null);
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
			case TypesPackage.SUBRANGE_TYPE_REFERENCE__SUBRANGE_TYPE:
				return subrangeType != null;
		}
		return super.eIsSet(featureID);
	}

} //SubrangeTypeReferenceImpl
