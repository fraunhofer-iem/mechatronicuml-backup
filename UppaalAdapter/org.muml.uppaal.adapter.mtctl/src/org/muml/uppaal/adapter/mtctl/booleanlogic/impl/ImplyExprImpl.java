/**
 */
package org.muml.uppaal.adapter.mtctl.booleanlogic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.uppaal.adapter.mtctl.Expression;
import org.muml.uppaal.adapter.mtctl.booleanlogic.BooleanlogicPackage;
import org.muml.uppaal.adapter.mtctl.booleanlogic.ImplyExpr;
import org.muml.uppaal.adapter.mtctl.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imply Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.booleanlogic.impl.ImplyExprImpl#getLeftOpd <em>Left Opd</em>}</li>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.booleanlogic.impl.ImplyExprImpl#getRightOpd <em>Right Opd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplyExprImpl extends ExpressionImpl implements ImplyExpr {
	/**
	 * The cached value of the '{@link #getLeftOpd() <em>Left Opd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOpd()
	 * @generated
	 * @ordered
	 */
	protected Expression leftOpd;

	/**
	 * The cached value of the '{@link #getRightOpd() <em>Right Opd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOpd()
	 * @generated
	 * @ordered
	 */
	protected Expression rightOpd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplyExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BooleanlogicPackage.Literals.IMPLY_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftOpd() {
		return leftOpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftOpd(Expression newLeftOpd, NotificationChain msgs) {
		Expression oldLeftOpd = leftOpd;
		leftOpd = newLeftOpd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BooleanlogicPackage.IMPLY_EXPR__LEFT_OPD, oldLeftOpd, newLeftOpd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftOpd(Expression newLeftOpd) {
		if (newLeftOpd != leftOpd) {
			NotificationChain msgs = null;
			if (leftOpd != null)
				msgs = ((InternalEObject)leftOpd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BooleanlogicPackage.IMPLY_EXPR__LEFT_OPD, null, msgs);
			if (newLeftOpd != null)
				msgs = ((InternalEObject)newLeftOpd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BooleanlogicPackage.IMPLY_EXPR__LEFT_OPD, null, msgs);
			msgs = basicSetLeftOpd(newLeftOpd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BooleanlogicPackage.IMPLY_EXPR__LEFT_OPD, newLeftOpd, newLeftOpd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightOpd() {
		return rightOpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightOpd(Expression newRightOpd, NotificationChain msgs) {
		Expression oldRightOpd = rightOpd;
		rightOpd = newRightOpd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BooleanlogicPackage.IMPLY_EXPR__RIGHT_OPD, oldRightOpd, newRightOpd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightOpd(Expression newRightOpd) {
		if (newRightOpd != rightOpd) {
			NotificationChain msgs = null;
			if (rightOpd != null)
				msgs = ((InternalEObject)rightOpd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BooleanlogicPackage.IMPLY_EXPR__RIGHT_OPD, null, msgs);
			if (newRightOpd != null)
				msgs = ((InternalEObject)newRightOpd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BooleanlogicPackage.IMPLY_EXPR__RIGHT_OPD, null, msgs);
			msgs = basicSetRightOpd(newRightOpd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BooleanlogicPackage.IMPLY_EXPR__RIGHT_OPD, newRightOpd, newRightOpd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BooleanlogicPackage.IMPLY_EXPR__LEFT_OPD:
				return basicSetLeftOpd(null, msgs);
			case BooleanlogicPackage.IMPLY_EXPR__RIGHT_OPD:
				return basicSetRightOpd(null, msgs);
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
			case BooleanlogicPackage.IMPLY_EXPR__LEFT_OPD:
				return getLeftOpd();
			case BooleanlogicPackage.IMPLY_EXPR__RIGHT_OPD:
				return getRightOpd();
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
			case BooleanlogicPackage.IMPLY_EXPR__LEFT_OPD:
				setLeftOpd((Expression)newValue);
				return;
			case BooleanlogicPackage.IMPLY_EXPR__RIGHT_OPD:
				setRightOpd((Expression)newValue);
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
			case BooleanlogicPackage.IMPLY_EXPR__LEFT_OPD:
				setLeftOpd((Expression)null);
				return;
			case BooleanlogicPackage.IMPLY_EXPR__RIGHT_OPD:
				setRightOpd((Expression)null);
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
			case BooleanlogicPackage.IMPLY_EXPR__LEFT_OPD:
				return leftOpd != null;
			case BooleanlogicPackage.IMPLY_EXPR__RIGHT_OPD:
				return rightOpd != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplyExprImpl
