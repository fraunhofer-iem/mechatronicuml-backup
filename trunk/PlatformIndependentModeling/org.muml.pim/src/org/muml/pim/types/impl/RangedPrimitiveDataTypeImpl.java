/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.types.PrimitiveDataType;
import org.muml.pim.types.RangedPrimitiveDataType;
import org.muml.pim.types.TypesPackage;
import org.muml.pim.valuetype.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranged Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.types.impl.RangedPrimitiveDataTypeImpl#getRangedType <em>Ranged Type</em>}</li>
 *   <li>{@link org.muml.pim.types.impl.RangedPrimitiveDataTypeImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangedPrimitiveDataTypeImpl extends DataTypeImpl implements RangedPrimitiveDataType {
	/**
	 * The cached value of the '{@link #getRangedType() <em>Ranged Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangedType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveDataType rangedType;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangedPrimitiveDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.RANGED_PRIMITIVE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType getRangedType() {
		if (rangedType != null && rangedType.eIsProxy()) {
			InternalEObject oldRangedType = (InternalEObject)rangedType;
			rangedType = (PrimitiveDataType)eResolveProxy(oldRangedType);
			if (rangedType != oldRangedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGED_TYPE, oldRangedType, rangedType));
			}
		}
		return rangedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType basicGetRangedType() {
		return rangedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangedType(PrimitiveDataType newRangedType) {
		PrimitiveDataType oldRangedType = rangedType;
		rangedType = newRangedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGED_TYPE, oldRangedType, rangedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGE:
				return basicSetRange(null, msgs);
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
			case TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGED_TYPE:
				if (resolve) return getRangedType();
				return basicGetRangedType();
			case TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGE:
				return getRange();
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
			case TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGED_TYPE:
				setRangedType((PrimitiveDataType)newValue);
				return;
			case TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGE:
				setRange((Range)newValue);
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
			case TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGED_TYPE:
				setRangedType((PrimitiveDataType)null);
				return;
			case TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGE:
				setRange((Range)null);
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
			case TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGED_TYPE:
				return rangedType != null;
			case TypesPackage.RANGED_PRIMITIVE_DATA_TYPE__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

} //RangedPrimitiveDataTypeImpl
