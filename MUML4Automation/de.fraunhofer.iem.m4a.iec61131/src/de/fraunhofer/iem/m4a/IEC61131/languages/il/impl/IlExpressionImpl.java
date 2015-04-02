/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.ExprOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlExpression;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlLabel;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.Operand;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleInstruction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlExpressionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlExpressionImpl#getExprOperator <em>Expr Operator</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlExpressionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlExpressionImpl#getSimpleInstructionList <em>Simple Instruction List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IlExpressionImpl extends MinimalEObjectImpl.Container implements IlExpression {
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
	 * The cached value of the '{@link #getSimpleInstructionList() <em>Simple Instruction List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleInstructionList()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleInstruction> simpleInstructionList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IlExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.IL_EXPRESSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.IL_EXPRESSION__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_EXPRESSION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_EXPRESSION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_EXPRESSION__LABEL, newLabel, newLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_EXPRESSION__EXPR_OPERATOR, oldExprOperator, exprOperator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.IL_EXPRESSION__OPERAND, oldOperand, newOperand);
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
				msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_EXPRESSION__OPERAND, null, msgs);
			if (newOperand != null)
				msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_EXPRESSION__OPERAND, null, msgs);
			msgs = basicSetOperand(newOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_EXPRESSION__OPERAND, newOperand, newOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleInstruction> getSimpleInstructionList() {
		if (simpleInstructionList == null) {
			simpleInstructionList = new EObjectContainmentEList<SimpleInstruction>(SimpleInstruction.class, this, IlPackage.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST);
		}
		return simpleInstructionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlPackage.IL_EXPRESSION__LABEL:
				return basicSetLabel(null, msgs);
			case IlPackage.IL_EXPRESSION__OPERAND:
				return basicSetOperand(null, msgs);
			case IlPackage.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST:
				return ((InternalEList<?>)getSimpleInstructionList()).basicRemove(otherEnd, msgs);
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
			case IlPackage.IL_EXPRESSION__LABEL:
				return getLabel();
			case IlPackage.IL_EXPRESSION__EXPR_OPERATOR:
				return getExprOperator();
			case IlPackage.IL_EXPRESSION__OPERAND:
				return getOperand();
			case IlPackage.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST:
				return getSimpleInstructionList();
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
			case IlPackage.IL_EXPRESSION__LABEL:
				setLabel((IlLabel)newValue);
				return;
			case IlPackage.IL_EXPRESSION__EXPR_OPERATOR:
				setExprOperator((ExprOperator)newValue);
				return;
			case IlPackage.IL_EXPRESSION__OPERAND:
				setOperand((Operand)newValue);
				return;
			case IlPackage.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST:
				getSimpleInstructionList().clear();
				getSimpleInstructionList().addAll((Collection<? extends SimpleInstruction>)newValue);
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
			case IlPackage.IL_EXPRESSION__LABEL:
				setLabel((IlLabel)null);
				return;
			case IlPackage.IL_EXPRESSION__EXPR_OPERATOR:
				setExprOperator(EXPR_OPERATOR_EDEFAULT);
				return;
			case IlPackage.IL_EXPRESSION__OPERAND:
				setOperand((Operand)null);
				return;
			case IlPackage.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST:
				getSimpleInstructionList().clear();
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
			case IlPackage.IL_EXPRESSION__LABEL:
				return label != null;
			case IlPackage.IL_EXPRESSION__EXPR_OPERATOR:
				return exprOperator != EXPR_OPERATOR_EDEFAULT;
			case IlPackage.IL_EXPRESSION__OPERAND:
				return operand != null;
			case IlPackage.IL_EXPRESSION__SIMPLE_INSTRUCTION_LIST:
				return simpleInstructionList != null && !simpleInstructionList.isEmpty();
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
		result.append(" (ExprOperator: ");
		result.append(exprOperator);
		result.append(')');
		return result.toString();
	}

} //IlExpressionImpl
