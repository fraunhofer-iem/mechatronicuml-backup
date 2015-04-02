/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlLabel;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.OperandList;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.SimpleOperationFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Operation Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationFunctionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationFunctionImpl#getOperandList <em>Operand List</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.SimpleOperationFunctionImpl#getFunctionName <em>Function Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleOperationFunctionImpl extends MinimalEObjectImpl.Container implements SimpleOperationFunction {
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
	 * The cached value of the '{@link #getOperandList() <em>Operand List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandList()
	 * @generated
	 * @ordered
	 */
	protected OperandList operandList;

	/**
	 * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionName()
	 * @generated
	 * @ordered
	 */
	protected FunctionDeclaration functionName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleOperationFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.SIMPLE_OPERATION_FUNCTION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_FUNCTION__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.SIMPLE_OPERATION_FUNCTION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.SIMPLE_OPERATION_FUNCTION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_FUNCTION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandList getOperandList() {
		return operandList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandList(OperandList newOperandList, NotificationChain msgs) {
		OperandList oldOperandList = operandList;
		operandList = newOperandList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_FUNCTION__OPERAND_LIST, oldOperandList, newOperandList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandList(OperandList newOperandList) {
		if (newOperandList != operandList) {
			NotificationChain msgs = null;
			if (operandList != null)
				msgs = ((InternalEObject)operandList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.SIMPLE_OPERATION_FUNCTION__OPERAND_LIST, null, msgs);
			if (newOperandList != null)
				msgs = ((InternalEObject)newOperandList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.SIMPLE_OPERATION_FUNCTION__OPERAND_LIST, null, msgs);
			msgs = basicSetOperandList(newOperandList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_FUNCTION__OPERAND_LIST, newOperandList, newOperandList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration getFunctionName() {
		if (functionName != null && functionName.eIsProxy()) {
			InternalEObject oldFunctionName = (InternalEObject)functionName;
			functionName = (FunctionDeclaration)eResolveProxy(oldFunctionName);
			if (functionName != oldFunctionName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.SIMPLE_OPERATION_FUNCTION__FUNCTION_NAME, oldFunctionName, functionName));
			}
		}
		return functionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration basicGetFunctionName() {
		return functionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionName(FunctionDeclaration newFunctionName) {
		FunctionDeclaration oldFunctionName = functionName;
		functionName = newFunctionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.SIMPLE_OPERATION_FUNCTION__FUNCTION_NAME, oldFunctionName, functionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlPackage.SIMPLE_OPERATION_FUNCTION__LABEL:
				return basicSetLabel(null, msgs);
			case IlPackage.SIMPLE_OPERATION_FUNCTION__OPERAND_LIST:
				return basicSetOperandList(null, msgs);
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
			case IlPackage.SIMPLE_OPERATION_FUNCTION__LABEL:
				return getLabel();
			case IlPackage.SIMPLE_OPERATION_FUNCTION__OPERAND_LIST:
				return getOperandList();
			case IlPackage.SIMPLE_OPERATION_FUNCTION__FUNCTION_NAME:
				if (resolve) return getFunctionName();
				return basicGetFunctionName();
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
			case IlPackage.SIMPLE_OPERATION_FUNCTION__LABEL:
				setLabel((IlLabel)newValue);
				return;
			case IlPackage.SIMPLE_OPERATION_FUNCTION__OPERAND_LIST:
				setOperandList((OperandList)newValue);
				return;
			case IlPackage.SIMPLE_OPERATION_FUNCTION__FUNCTION_NAME:
				setFunctionName((FunctionDeclaration)newValue);
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
			case IlPackage.SIMPLE_OPERATION_FUNCTION__LABEL:
				setLabel((IlLabel)null);
				return;
			case IlPackage.SIMPLE_OPERATION_FUNCTION__OPERAND_LIST:
				setOperandList((OperandList)null);
				return;
			case IlPackage.SIMPLE_OPERATION_FUNCTION__FUNCTION_NAME:
				setFunctionName((FunctionDeclaration)null);
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
			case IlPackage.SIMPLE_OPERATION_FUNCTION__LABEL:
				return label != null;
			case IlPackage.SIMPLE_OPERATION_FUNCTION__OPERAND_LIST:
				return operandList != null;
			case IlPackage.SIMPLE_OPERATION_FUNCTION__FUNCTION_NAME:
				return functionName != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleOperationFunctionImpl
