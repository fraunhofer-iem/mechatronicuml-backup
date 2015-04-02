/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlLabel;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.Operand;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationOperand;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Operation Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationOperandImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationOperandImpl#getSimpleOperator <em>Simple Operator</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationOperandImpl#getExprOperator <em>Expr Operator</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationOperandImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleOperationOperandImpl extends MinimalEObjectImpl.Container implements SimpleOperationOperand {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected IlLabel label;

	/**
	 * The default value of the '{@link #getSimpleOperator() <em>Simple Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleOperator()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleOperator SIMPLE_OPERATOR_EDEFAULT = SimpleOperator.LD;

	/**
	 * The cached value of the '{@link #getSimpleOperator() <em>Simple Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleOperator()
	 * @generated
	 * @ordered
	 */
	protected SimpleOperator simpleOperator = SIMPLE_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getExprOperator() <em>Expr Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ExprOperator EXPR_OPERATOR_EDEFAULT = ExprOperator.AND;

	/**
	 * The cached value of the '{@link #getExprOperator() <em>Expr Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprOperator()
	 * @generated
	 * @ordered
	 */
	protected ExprOperator exprOperator = EXPR_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected Operand operand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleOperationOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.SIMPLE_OPERATION_OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlLabel getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(IlLabel newLabel, NotificationChain msgs) {
		IlLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_OPERAND__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(IlLabel newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.SIMPLE_OPERATION_OPERAND__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.SIMPLE_OPERATION_OPERAND__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_OPERAND__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleOperator getSimpleOperator() {
		return simpleOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleOperator(SimpleOperator newSimpleOperator) {
		SimpleOperator oldSimpleOperator = simpleOperator;
		simpleOperator = newSimpleOperator == null ? SIMPLE_OPERATOR_EDEFAULT : newSimpleOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_OPERAND__SIMPLE_OPERATOR, oldSimpleOperator, simpleOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExprOperator getExprOperator() {
		return exprOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExprOperator(ExprOperator newExprOperator) {
		ExprOperator oldExprOperator = exprOperator;
		exprOperator = newExprOperator == null ? EXPR_OPERATOR_EDEFAULT : newExprOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_OPERAND__EXPR_OPERATOR, oldExprOperator, exprOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand getOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand(Operand newOperand, NotificationChain msgs) {
		Operand oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_OPERAND__OPERAND, oldOperand, newOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand(Operand newOperand) {
		if (newOperand != operand) {
			NotificationChain msgs = null;
			if (operand != null)
				msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.SIMPLE_OPERATION_OPERAND__OPERAND, null, msgs);
			if (newOperand != null)
				msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.SIMPLE_OPERATION_OPERAND__OPERAND, null, msgs);
			msgs = basicSetOperand(newOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_OPERAND__OPERAND, newOperand, newOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlPackage.SIMPLE_OPERATION_OPERAND__LABEL:
				return basicSetLabel(null, msgs);
			case IlPackage.SIMPLE_OPERATION_OPERAND__OPERAND:
				return basicSetOperand(null, msgs);
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
			case IlPackage.SIMPLE_OPERATION_OPERAND__LABEL:
				return getLabel();
			case IlPackage.SIMPLE_OPERATION_OPERAND__SIMPLE_OPERATOR:
				return getSimpleOperator();
			case IlPackage.SIMPLE_OPERATION_OPERAND__EXPR_OPERATOR:
				return getExprOperator();
			case IlPackage.SIMPLE_OPERATION_OPERAND__OPERAND:
				return getOperand();
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
			case IlPackage.SIMPLE_OPERATION_OPERAND__LABEL:
				setLabel((IlLabel)newValue);
				return;
			case IlPackage.SIMPLE_OPERATION_OPERAND__SIMPLE_OPERATOR:
				setSimpleOperator((SimpleOperator)newValue);
				return;
			case IlPackage.SIMPLE_OPERATION_OPERAND__EXPR_OPERATOR:
				setExprOperator((ExprOperator)newValue);
				return;
			case IlPackage.SIMPLE_OPERATION_OPERAND__OPERAND:
				setOperand((Operand)newValue);
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
			case IlPackage.SIMPLE_OPERATION_OPERAND__LABEL:
				setLabel((IlLabel)null);
				return;
			case IlPackage.SIMPLE_OPERATION_OPERAND__SIMPLE_OPERATOR:
				setSimpleOperator(SIMPLE_OPERATOR_EDEFAULT);
				return;
			case IlPackage.SIMPLE_OPERATION_OPERAND__EXPR_OPERATOR:
				setExprOperator(EXPR_OPERATOR_EDEFAULT);
				return;
			case IlPackage.SIMPLE_OPERATION_OPERAND__OPERAND:
				setOperand((Operand)null);
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
			case IlPackage.SIMPLE_OPERATION_OPERAND__LABEL:
				return label != null;
			case IlPackage.SIMPLE_OPERATION_OPERAND__SIMPLE_OPERATOR:
				return simpleOperator != SIMPLE_OPERATOR_EDEFAULT;
			case IlPackage.SIMPLE_OPERATION_OPERAND__EXPR_OPERATOR:
				return exprOperator != EXPR_OPERATOR_EDEFAULT;
			case IlPackage.SIMPLE_OPERATION_OPERAND__OPERAND:
				return operand != null;
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
		result.append(" (SimpleOperator: ");
		result.append(simpleOperator);
		result.append(", ExprOperator: ");
		result.append(exprOperator);
		result.append(')');
		return result.toString();
	}

} //SimpleOperationOperandImpl
