/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SharedVarSpecImpl;
import de.fraunhofer.iem.m4a.IEC61131.core.types.IntegerType;
import de.fraunhofer.iem.m4a.IEC61131.core.types.Subrange;
import de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subrange Type Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeSpecificationImpl#getIntegerType <em>Integer Type</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.SubrangeTypeSpecificationImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubrangeTypeSpecificationImpl extends SharedVarSpecImpl implements SubrangeTypeSpecification {
	/**
	 * The cached value of the '{@link #getIntegerType() <em>Integer Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerType()
	 * @generated
	 * @ordered
	 */
	protected IntegerType integerType;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Subrange range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubrangeTypeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.SUBRANGE_TYPE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType getIntegerType() {
		if (integerType != null && integerType.eIsProxy()) {
			InternalEObject oldIntegerType = (InternalEObject)integerType;
			integerType = (IntegerType)eResolveProxy(oldIntegerType);
			if (integerType != oldIntegerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.SUBRANGE_TYPE_SPECIFICATION__INTEGER_TYPE, oldIntegerType, integerType));
			}
		}
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType basicGetIntegerType() {
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerType(IntegerType newIntegerType) {
		IntegerType oldIntegerType = integerType;
		integerType = newIntegerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBRANGE_TYPE_SPECIFICATION__INTEGER_TYPE, oldIntegerType, integerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subrange getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Subrange newRange, NotificationChain msgs) {
		Subrange oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SUBRANGE_TYPE_SPECIFICATION__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Subrange newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SUBRANGE_TYPE_SPECIFICATION__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SUBRANGE_TYPE_SPECIFICATION__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SUBRANGE_TYPE_SPECIFICATION__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION__RANGE:
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
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION__INTEGER_TYPE:
				if (resolve) return getIntegerType();
				return basicGetIntegerType();
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION__RANGE:
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
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION__INTEGER_TYPE:
				setIntegerType((IntegerType)newValue);
				return;
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION__RANGE:
				setRange((Subrange)newValue);
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
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION__INTEGER_TYPE:
				setIntegerType((IntegerType)null);
				return;
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION__RANGE:
				setRange((Subrange)null);
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
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION__INTEGER_TYPE:
				return integerType != null;
			case TypesPackage.SUBRANGE_TYPE_SPECIFICATION__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

} //SubrangeTypeSpecificationImpl
