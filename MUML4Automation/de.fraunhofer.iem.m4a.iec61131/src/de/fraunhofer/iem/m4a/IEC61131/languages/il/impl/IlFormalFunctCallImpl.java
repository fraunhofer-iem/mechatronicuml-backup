/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFormalFunctCall;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlLabel;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Funct Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFormalFunctCallImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFormalFunctCallImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFormalFunctCallImpl#getParamList <em>Param List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IlFormalFunctCallImpl extends MinimalEObjectImpl.Container implements IlFormalFunctCall {
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
	 * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionName()
	 * @generated
	 * @ordered
	 */
	protected FunctionDeclaration functionName;

	/**
	 * The cached value of the '{@link #getParamList() <em>Param List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamList()
	 * @generated
	 * @ordered
	 */
	protected ParamList paramList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IlFormalFunctCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.IL_FORMAL_FUNCT_CALL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.IL_FORMAL_FUNCT_CALL__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_FORMAL_FUNCT_CALL__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_FORMAL_FUNCT_CALL__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_FORMAL_FUNCT_CALL__LABEL, newLabel, newLabel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.IL_FORMAL_FUNCT_CALL__FUNCTION_NAME, oldFunctionName, functionName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_FORMAL_FUNCT_CALL__FUNCTION_NAME, oldFunctionName, functionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamList getParamList() {
		return paramList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamList(ParamList newParamList, NotificationChain msgs) {
		ParamList oldParamList = paramList;
		paramList = newParamList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.IL_FORMAL_FUNCT_CALL__PARAM_LIST, oldParamList, newParamList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamList(ParamList newParamList) {
		if (newParamList != paramList) {
			NotificationChain msgs = null;
			if (paramList != null)
				msgs = ((InternalEObject)paramList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_FORMAL_FUNCT_CALL__PARAM_LIST, null, msgs);
			if (newParamList != null)
				msgs = ((InternalEObject)newParamList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_FORMAL_FUNCT_CALL__PARAM_LIST, null, msgs);
			msgs = basicSetParamList(newParamList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_FORMAL_FUNCT_CALL__PARAM_LIST, newParamList, newParamList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlPackage.IL_FORMAL_FUNCT_CALL__LABEL:
				return basicSetLabel(null, msgs);
			case IlPackage.IL_FORMAL_FUNCT_CALL__PARAM_LIST:
				return basicSetParamList(null, msgs);
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
			case IlPackage.IL_FORMAL_FUNCT_CALL__LABEL:
				return getLabel();
			case IlPackage.IL_FORMAL_FUNCT_CALL__FUNCTION_NAME:
				if (resolve) return getFunctionName();
				return basicGetFunctionName();
			case IlPackage.IL_FORMAL_FUNCT_CALL__PARAM_LIST:
				return getParamList();
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
			case IlPackage.IL_FORMAL_FUNCT_CALL__LABEL:
				setLabel((IlLabel)newValue);
				return;
			case IlPackage.IL_FORMAL_FUNCT_CALL__FUNCTION_NAME:
				setFunctionName((FunctionDeclaration)newValue);
				return;
			case IlPackage.IL_FORMAL_FUNCT_CALL__PARAM_LIST:
				setParamList((ParamList)newValue);
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
			case IlPackage.IL_FORMAL_FUNCT_CALL__LABEL:
				setLabel((IlLabel)null);
				return;
			case IlPackage.IL_FORMAL_FUNCT_CALL__FUNCTION_NAME:
				setFunctionName((FunctionDeclaration)null);
				return;
			case IlPackage.IL_FORMAL_FUNCT_CALL__PARAM_LIST:
				setParamList((ParamList)null);
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
			case IlPackage.IL_FORMAL_FUNCT_CALL__LABEL:
				return label != null;
			case IlPackage.IL_FORMAL_FUNCT_CALL__FUNCTION_NAME:
				return functionName != null;
			case IlPackage.IL_FORMAL_FUNCT_CALL__PARAM_LIST:
				return paramList != null;
		}
		return super.eIsSet(featureID);
	}

} //IlFormalFunctCallImpl
