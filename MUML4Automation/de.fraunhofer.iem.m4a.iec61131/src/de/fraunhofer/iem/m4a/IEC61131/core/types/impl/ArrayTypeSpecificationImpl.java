/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ArrayStructVarSpecImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.ArrayTypeSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.NonGenericType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeSpecificationImpl#getRanges <em>Ranges</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.ArrayTypeSpecificationImpl#getOfType <em>Of Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayTypeSpecificationImpl extends ArrayStructVarSpecImpl implements ArrayTypeSpecification {
	/**
	 * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<Subrange> ranges;

	/**
	 * The cached value of the '{@link #getOfType() <em>Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfType()
	 * @generated
	 * @ordered
	 */
	protected NonGenericType ofType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ARRAY_TYPE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subrange> getRanges() {
		if (ranges == null) {
			ranges = new EObjectContainmentEList<Subrange>(Subrange.class, this, TypesPackage.ARRAY_TYPE_SPECIFICATION__RANGES);
		}
		return ranges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonGenericType getOfType() {
		if (ofType != null && ofType.eIsProxy()) {
			InternalEObject oldOfType = (InternalEObject)ofType;
			ofType = (NonGenericType)eResolveProxy(oldOfType);
			if (ofType != oldOfType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.ARRAY_TYPE_SPECIFICATION__OF_TYPE, oldOfType, ofType));
			}
		}
		return ofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonGenericType basicGetOfType() {
		return ofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfType(NonGenericType newOfType) {
		NonGenericType oldOfType = ofType;
		ofType = newOfType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ARRAY_TYPE_SPECIFICATION__OF_TYPE, oldOfType, ofType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ARRAY_TYPE_SPECIFICATION__RANGES:
				return ((InternalEList<?>)getRanges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.ARRAY_TYPE_SPECIFICATION__RANGES:
				return getRanges();
			case TypesPackage.ARRAY_TYPE_SPECIFICATION__OF_TYPE:
				if (resolve) return getOfType();
				return basicGetOfType();
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
			case TypesPackage.ARRAY_TYPE_SPECIFICATION__RANGES:
				getRanges().clear();
				getRanges().addAll((Collection<? extends Subrange>)newValue);
				return;
			case TypesPackage.ARRAY_TYPE_SPECIFICATION__OF_TYPE:
				setOfType((NonGenericType)newValue);
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
			case TypesPackage.ARRAY_TYPE_SPECIFICATION__RANGES:
				getRanges().clear();
				return;
			case TypesPackage.ARRAY_TYPE_SPECIFICATION__OF_TYPE:
				setOfType((NonGenericType)null);
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
			case TypesPackage.ARRAY_TYPE_SPECIFICATION__RANGES:
				return ranges != null && !ranges.isEmpty();
			case TypesPackage.ARRAY_TYPE_SPECIFICATION__OF_TYPE:
				return ofType != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayTypeSpecificationImpl
