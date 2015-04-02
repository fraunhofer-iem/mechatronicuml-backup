/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpression;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.PrimaryExpressionValue;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.UnaryOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.PrimaryExpressionImpl#getUnaryOperator <em>Unary Operator</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.PrimaryExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryExpressionImpl extends ExpressionImpl implements PrimaryExpression {
	/**
	 * The cached value of the '{@link #getUnaryOperator() <em>Unary Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryOperator()
	 * @generated
	 * @ordered
	 */
	protected UnaryOperator unaryOperator;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected PrimaryExpressionValue value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.PRIMARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator getUnaryOperator() {
		return unaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryOperator(UnaryOperator newUnaryOperator, NotificationChain msgs) {
		UnaryOperator oldUnaryOperator = unaryOperator;
		unaryOperator = newUnaryOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StPackage.PRIMARY_EXPRESSION__UNARY_OPERATOR, oldUnaryOperator, newUnaryOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryOperator(UnaryOperator newUnaryOperator) {
		if (newUnaryOperator != unaryOperator) {
			NotificationChain msgs = null;
			if (unaryOperator != null)
				msgs = ((InternalEObject)unaryOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StPackage.PRIMARY_EXPRESSION__UNARY_OPERATOR, null, msgs);
			if (newUnaryOperator != null)
				msgs = ((InternalEObject)newUnaryOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StPackage.PRIMARY_EXPRESSION__UNARY_OPERATOR, null, msgs);
			msgs = basicSetUnaryOperator(newUnaryOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.PRIMARY_EXPRESSION__UNARY_OPERATOR, newUnaryOperator, newUnaryOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryExpressionValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(PrimaryExpressionValue newValue, NotificationChain msgs) {
		PrimaryExpressionValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StPackage.PRIMARY_EXPRESSION__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(PrimaryExpressionValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StPackage.PRIMARY_EXPRESSION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StPackage.PRIMARY_EXPRESSION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.PRIMARY_EXPRESSION__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StPackage.PRIMARY_EXPRESSION__UNARY_OPERATOR:
				return basicSetUnaryOperator(null, msgs);
			case StPackage.PRIMARY_EXPRESSION__VALUE:
				return basicSetValue(null, msgs);
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
			case StPackage.PRIMARY_EXPRESSION__UNARY_OPERATOR:
				return getUnaryOperator();
			case StPackage.PRIMARY_EXPRESSION__VALUE:
				return getValue();
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
			case StPackage.PRIMARY_EXPRESSION__UNARY_OPERATOR:
				setUnaryOperator((UnaryOperator)newValue);
				return;
			case StPackage.PRIMARY_EXPRESSION__VALUE:
				setValue((PrimaryExpressionValue)newValue);
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
			case StPackage.PRIMARY_EXPRESSION__UNARY_OPERATOR:
				setUnaryOperator((UnaryOperator)null);
				return;
			case StPackage.PRIMARY_EXPRESSION__VALUE:
				setValue((PrimaryExpressionValue)null);
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
			case StPackage.PRIMARY_EXPRESSION__UNARY_OPERATOR:
				return unaryOperator != null;
			case StPackage.PRIMARY_EXPRESSION__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimaryExpressionImpl
