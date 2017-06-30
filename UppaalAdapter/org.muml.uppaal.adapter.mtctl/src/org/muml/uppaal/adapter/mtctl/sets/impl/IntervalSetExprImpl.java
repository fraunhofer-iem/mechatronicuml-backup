/**
 */
package org.muml.uppaal.adapter.mtctl.sets.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.uppaal.adapter.mtctl.sets.IntervalSetExpr;
import org.muml.uppaal.adapter.mtctl.sets.SetsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval Set Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.sets.impl.IntervalSetExprImpl#getLowerVal <em>Lower Val</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.sets.impl.IntervalSetExprImpl#getUpperVal <em>Upper Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalSetExprImpl extends SetExprImpl implements IntervalSetExpr {
	/**
	 * The default value of the '{@link #getLowerVal() <em>Lower Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerVal()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerVal() <em>Lower Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerVal()
	 * @generated
	 * @ordered
	 */
	protected int lowerVal = LOWER_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperVal() <em>Upper Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperVal()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperVal() <em>Upper Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperVal()
	 * @generated
	 * @ordered
	 */
	protected int upperVal = UPPER_VAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalSetExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SetsPackage.Literals.INTERVAL_SET_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerVal() {
		return lowerVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerVal(int newLowerVal) {
		int oldLowerVal = lowerVal;
		lowerVal = newLowerVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetsPackage.INTERVAL_SET_EXPR__LOWER_VAL, oldLowerVal, lowerVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperVal() {
		return upperVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperVal(int newUpperVal) {
		int oldUpperVal = upperVal;
		upperVal = newUpperVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SetsPackage.INTERVAL_SET_EXPR__UPPER_VAL, oldUpperVal, upperVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SetsPackage.INTERVAL_SET_EXPR__LOWER_VAL:
				return getLowerVal();
			case SetsPackage.INTERVAL_SET_EXPR__UPPER_VAL:
				return getUpperVal();
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
			case SetsPackage.INTERVAL_SET_EXPR__LOWER_VAL:
				setLowerVal((Integer)newValue);
				return;
			case SetsPackage.INTERVAL_SET_EXPR__UPPER_VAL:
				setUpperVal((Integer)newValue);
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
			case SetsPackage.INTERVAL_SET_EXPR__LOWER_VAL:
				setLowerVal(LOWER_VAL_EDEFAULT);
				return;
			case SetsPackage.INTERVAL_SET_EXPR__UPPER_VAL:
				setUpperVal(UPPER_VAL_EDEFAULT);
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
			case SetsPackage.INTERVAL_SET_EXPR__LOWER_VAL:
				return lowerVal != LOWER_VAL_EDEFAULT;
			case SetsPackage.INTERVAL_SET_EXPR__UPPER_VAL:
				return upperVal != UPPER_VAL_EDEFAULT;
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
		result.append(" (lowerVal: ");
		result.append(lowerVal);
		result.append(", upperVal: ");
		result.append(upperVal);
		result.append(')');
		return result.toString();
	}

} //IntervalSetExprImpl
