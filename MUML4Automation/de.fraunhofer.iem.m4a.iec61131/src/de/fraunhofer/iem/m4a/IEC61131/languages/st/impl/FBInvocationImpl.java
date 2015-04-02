/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.FBInvocation;
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
 * An implementation of the model object '<em><b>FB Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FBInvocationImpl#getFunctionBlock <em>Function Block</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.FBInvocationImpl#getParamAssignmentList <em>Param Assignment List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FBInvocationImpl extends MinimalEObjectImpl.Container implements FBInvocation {
	/**
	 * The cached value of the '{@link #getFunctionBlock() <em>Function Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected FBInstance functionBlock;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FBInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.FB_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBInstance getFunctionBlock() {
		if (functionBlock != null && functionBlock.eIsProxy()) {
			InternalEObject oldFunctionBlock = (InternalEObject)functionBlock;
			functionBlock = (FBInstance)eResolveProxy(oldFunctionBlock);
			if (functionBlock != oldFunctionBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StPackage.FB_INVOCATION__FUNCTION_BLOCK, oldFunctionBlock, functionBlock));
			}
		}
		return functionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBInstance basicGetFunctionBlock() {
		return functionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionBlock(FBInstance newFunctionBlock) {
		FBInstance oldFunctionBlock = functionBlock;
		functionBlock = newFunctionBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.FB_INVOCATION__FUNCTION_BLOCK, oldFunctionBlock, functionBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamAssignment> getParamAssignmentList() {
		if (paramAssignmentList == null) {
			paramAssignmentList = new EObjectContainmentEList<ParamAssignment>(ParamAssignment.class, this, StPackage.FB_INVOCATION__PARAM_ASSIGNMENT_LIST);
		}
		return paramAssignmentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StPackage.FB_INVOCATION__PARAM_ASSIGNMENT_LIST:
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
			case StPackage.FB_INVOCATION__FUNCTION_BLOCK:
				if (resolve) return getFunctionBlock();
				return basicGetFunctionBlock();
			case StPackage.FB_INVOCATION__PARAM_ASSIGNMENT_LIST:
				return getParamAssignmentList();
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
			case StPackage.FB_INVOCATION__FUNCTION_BLOCK:
				setFunctionBlock((FBInstance)newValue);
				return;
			case StPackage.FB_INVOCATION__PARAM_ASSIGNMENT_LIST:
				getParamAssignmentList().clear();
				getParamAssignmentList().addAll((Collection<? extends ParamAssignment>)newValue);
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
			case StPackage.FB_INVOCATION__FUNCTION_BLOCK:
				setFunctionBlock((FBInstance)null);
				return;
			case StPackage.FB_INVOCATION__PARAM_ASSIGNMENT_LIST:
				getParamAssignmentList().clear();
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
			case StPackage.FB_INVOCATION__FUNCTION_BLOCK:
				return functionBlock != null;
			case StPackage.FB_INVOCATION__PARAM_ASSIGNMENT_LIST:
				return paramAssignmentList != null && !paramAssignmentList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FBInvocationImpl
