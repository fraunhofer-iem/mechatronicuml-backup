/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.CallOperator;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.FBCallParamPlaceHolder;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlFBCall;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlLabel;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FB Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFBCallImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFBCallImpl#getCallOperator <em>Call Operator</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFBCallImpl#getFbName <em>Fb Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlFBCallImpl#getFbCallParam <em>Fb Call Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IlFBCallImpl extends MinimalEObjectImpl.Container implements IlFBCall {
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
	 * The default value of the '{@link #getCallOperator() <em>Call Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallOperator()
	 * @generated
	 * @ordered
	 */
	protected static final CallOperator CALL_OPERATOR_EDEFAULT = CallOperator.CAL;

	/**
	 * The cached value of the '{@link #getCallOperator() <em>Call Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallOperator()
	 * @generated
	 * @ordered
	 */
	protected CallOperator callOperator = CALL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFbName() <em>Fb Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFbName()
	 * @generated
	 * @ordered
	 */
	protected FBInstance fbName;

	/**
	 * The cached value of the '{@link #getFbCallParam() <em>Fb Call Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFbCallParam()
	 * @generated
	 * @ordered
	 */
	protected FBCallParamPlaceHolder fbCallParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IlFBCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.IL_FB_CALL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.IL_FB_CALL__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_FB_CALL__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_FB_CALL__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_FB_CALL__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperator getCallOperator() {
		return callOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallOperator(CallOperator newCallOperator) {
		CallOperator oldCallOperator = callOperator;
		callOperator = newCallOperator == null ? CALL_OPERATOR_EDEFAULT : newCallOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_FB_CALL__CALL_OPERATOR, oldCallOperator, callOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBInstance getFbName() {
		if (fbName != null && fbName.eIsProxy()) {
			InternalEObject oldFbName = (InternalEObject)fbName;
			fbName = (FBInstance)eResolveProxy(oldFbName);
			if (fbName != oldFbName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.IL_FB_CALL__FB_NAME, oldFbName, fbName));
			}
		}
		return fbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBInstance basicGetFbName() {
		return fbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFbName(FBInstance newFbName) {
		FBInstance oldFbName = fbName;
		fbName = newFbName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_FB_CALL__FB_NAME, oldFbName, fbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBCallParamPlaceHolder getFbCallParam() {
		return fbCallParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFbCallParam(FBCallParamPlaceHolder newFbCallParam, NotificationChain msgs) {
		FBCallParamPlaceHolder oldFbCallParam = fbCallParam;
		fbCallParam = newFbCallParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IlPackage.IL_FB_CALL__FB_CALL_PARAM, oldFbCallParam, newFbCallParam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFbCallParam(FBCallParamPlaceHolder newFbCallParam) {
		if (newFbCallParam != fbCallParam) {
			NotificationChain msgs = null;
			if (fbCallParam != null)
				msgs = ((InternalEObject)fbCallParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_FB_CALL__FB_CALL_PARAM, null, msgs);
			if (newFbCallParam != null)
				msgs = ((InternalEObject)newFbCallParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IlPackage.IL_FB_CALL__FB_CALL_PARAM, null, msgs);
			msgs = basicSetFbCallParam(newFbCallParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_FB_CALL__FB_CALL_PARAM, newFbCallParam, newFbCallParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlPackage.IL_FB_CALL__LABEL:
				return basicSetLabel(null, msgs);
			case IlPackage.IL_FB_CALL__FB_CALL_PARAM:
				return basicSetFbCallParam(null, msgs);
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
			case IlPackage.IL_FB_CALL__LABEL:
				return getLabel();
			case IlPackage.IL_FB_CALL__CALL_OPERATOR:
				return getCallOperator();
			case IlPackage.IL_FB_CALL__FB_NAME:
				if (resolve) return getFbName();
				return basicGetFbName();
			case IlPackage.IL_FB_CALL__FB_CALL_PARAM:
				return getFbCallParam();
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
			case IlPackage.IL_FB_CALL__LABEL:
				setLabel((IlLabel)newValue);
				return;
			case IlPackage.IL_FB_CALL__CALL_OPERATOR:
				setCallOperator((CallOperator)newValue);
				return;
			case IlPackage.IL_FB_CALL__FB_NAME:
				setFbName((FBInstance)newValue);
				return;
			case IlPackage.IL_FB_CALL__FB_CALL_PARAM:
				setFbCallParam((FBCallParamPlaceHolder)newValue);
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
			case IlPackage.IL_FB_CALL__LABEL:
				setLabel((IlLabel)null);
				return;
			case IlPackage.IL_FB_CALL__CALL_OPERATOR:
				setCallOperator(CALL_OPERATOR_EDEFAULT);
				return;
			case IlPackage.IL_FB_CALL__FB_NAME:
				setFbName((FBInstance)null);
				return;
			case IlPackage.IL_FB_CALL__FB_CALL_PARAM:
				setFbCallParam((FBCallParamPlaceHolder)null);
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
			case IlPackage.IL_FB_CALL__LABEL:
				return label != null;
			case IlPackage.IL_FB_CALL__CALL_OPERATOR:
				return callOperator != CALL_OPERATOR_EDEFAULT;
			case IlPackage.IL_FB_CALL__FB_NAME:
				return fbName != null;
			case IlPackage.IL_FB_CALL__FB_CALL_PARAM:
				return fbCallParam != null;
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
		result.append(" (callOperator: ");
		result.append(callOperator);
		result.append(')');
		return result.toString();
	}

} //IlFBCallImpl
