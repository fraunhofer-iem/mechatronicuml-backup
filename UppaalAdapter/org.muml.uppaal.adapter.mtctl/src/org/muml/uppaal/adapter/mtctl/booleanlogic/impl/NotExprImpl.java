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
import org.muml.uppaal.adapter.mtctl.booleanlogic.NotExpr;
import org.muml.uppaal.adapter.mtctl.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.adapter.mtctl.booleanlogic.impl.NotExprImpl#getOpd <em>Opd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotExprImpl extends ExpressionImpl implements NotExpr {
	/**
	 * The cached value of the '{@link #getOpd() <em>Opd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpd()
	 * @generated
	 * @ordered
	 */
	protected Expression opd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BooleanlogicPackage.Literals.NOT_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOpd() {
		return opd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpd(Expression newOpd, NotificationChain msgs) {
		Expression oldOpd = opd;
		opd = newOpd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BooleanlogicPackage.NOT_EXPR__OPD, oldOpd, newOpd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpd(Expression newOpd) {
		if (newOpd != opd) {
			NotificationChain msgs = null;
			if (opd != null)
				msgs = ((InternalEObject)opd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BooleanlogicPackage.NOT_EXPR__OPD, null, msgs);
			if (newOpd != null)
				msgs = ((InternalEObject)newOpd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BooleanlogicPackage.NOT_EXPR__OPD, null, msgs);
			msgs = basicSetOpd(newOpd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BooleanlogicPackage.NOT_EXPR__OPD, newOpd, newOpd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BooleanlogicPackage.NOT_EXPR__OPD:
				return basicSetOpd(null, msgs);
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
			case BooleanlogicPackage.NOT_EXPR__OPD:
				return getOpd();
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
			case BooleanlogicPackage.NOT_EXPR__OPD:
				setOpd((Expression)newValue);
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
			case BooleanlogicPackage.NOT_EXPR__OPD:
				setOpd((Expression)null);
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
			case BooleanlogicPackage.NOT_EXPR__OPD:
				return opd != null;
		}
		return super.eIsSet(featureID);
	}

} //NotExprImpl
