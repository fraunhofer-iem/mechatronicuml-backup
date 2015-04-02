/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionDeclaration;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.FunctionInvocation;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.ParamAssignment;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;

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
 * An implementation of the model object '<em><b>Function Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FunctionInvocationImpl#getParamAssignmentList <em>Param Assignment List</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FunctionInvocationImpl#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionInvocationImpl extends MinimalEObjectImpl.Container implements FunctionInvocation {
	/**
	 * The cached value of the '{@link #getParamAssignmentList() <em>Param Assignment List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamAssignmentList()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamAssignment> paramAssignmentList;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionDeclaration function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.FUNCTION_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamAssignment> getParamAssignmentList() {
		if (paramAssignmentList == null) {
			paramAssignmentList = new EObjectContainmentEList<ParamAssignment>(ParamAssignment.class, this, StPackage.FUNCTION_INVOCATION__PARAM_ASSIGNMENT_LIST);
		}
		return paramAssignmentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (FunctionDeclaration)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.FUNCTION_INVOCATION__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(FunctionDeclaration newFunction) {
		FunctionDeclaration oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.FUNCTION_INVOCATION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StPackage.FUNCTION_INVOCATION__PARAM_ASSIGNMENT_LIST:
				return ((InternalEList<?>)getParamAssignmentList()).basicRemove(otherEnd, msgs);
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
			case StPackage.FUNCTION_INVOCATION__PARAM_ASSIGNMENT_LIST:
				return getParamAssignmentList();
			case StPackage.FUNCTION_INVOCATION__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
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
			case StPackage.FUNCTION_INVOCATION__PARAM_ASSIGNMENT_LIST:
				getParamAssignmentList().clear();
				getParamAssignmentList().addAll((Collection<? extends ParamAssignment>)newValue);
				return;
			case StPackage.FUNCTION_INVOCATION__FUNCTION:
				setFunction((FunctionDeclaration)newValue);
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
			case StPackage.FUNCTION_INVOCATION__PARAM_ASSIGNMENT_LIST:
				getParamAssignmentList().clear();
				return;
			case StPackage.FUNCTION_INVOCATION__FUNCTION:
				setFunction((FunctionDeclaration)null);
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
			case StPackage.FUNCTION_INVOCATION__PARAM_ASSIGNMENT_LIST:
				return paramAssignmentList != null && !paramAssignmentList.isEmpty();
			case StPackage.FUNCTION_INVOCATION__FUNCTION:
				return function != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionInvocationImpl
