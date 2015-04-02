/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.FBTask;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FB Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.FBTaskImpl#getWith <em>With</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.FBTaskImpl#getFunctionBlock <em>Function Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FBTaskImpl extends MinimalEObjectImpl.Container implements FBTask {
	/**
	 * The cached value of the '{@link #getWith() <em>With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith()
	 * @generated
	 * @ordered
	 */
	protected TaskConfiguration with;

	/**
	 * The cached value of the '{@link #getFunctionBlock() <em>Function Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionBlock()
	 * @generated
	 * @ordered
	 */
	protected FunctionBlockDeclaration functionBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FBTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationsPackage.Literals.FB_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskConfiguration getWith() {
		if (with != null && with.eIsProxy()) {
			InternalEObject oldWith = (InternalEObject)with;
			with = (TaskConfiguration)eResolveProxy(oldWith);
			if (with != oldWith) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationsPackage.FB_TASK__WITH, oldWith, with));
			}
		}
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskConfiguration basicGetWith() {
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWith(TaskConfiguration newWith) {
		TaskConfiguration oldWith = with;
		with = newWith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.FB_TASK__WITH, oldWith, with));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockDeclaration getFunctionBlock() {
		if (functionBlock != null && functionBlock.eIsProxy()) {
			InternalEObject oldFunctionBlock = (InternalEObject)functionBlock;
			functionBlock = (FunctionBlockDeclaration)eResolveProxy(oldFunctionBlock);
			if (functionBlock != oldFunctionBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationsPackage.FB_TASK__FUNCTION_BLOCK, oldFunctionBlock, functionBlock));
			}
		}
		return functionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockDeclaration basicGetFunctionBlock() {
		return functionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionBlock(FunctionBlockDeclaration newFunctionBlock) {
		FunctionBlockDeclaration oldFunctionBlock = functionBlock;
		functionBlock = newFunctionBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.FB_TASK__FUNCTION_BLOCK, oldFunctionBlock, functionBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationsPackage.FB_TASK__WITH:
				if (resolve) return getWith();
				return basicGetWith();
			case ConfigurationsPackage.FB_TASK__FUNCTION_BLOCK:
				if (resolve) return getFunctionBlock();
				return basicGetFunctionBlock();
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
			case ConfigurationsPackage.FB_TASK__WITH:
				setWith((TaskConfiguration)newValue);
				return;
			case ConfigurationsPackage.FB_TASK__FUNCTION_BLOCK:
				setFunctionBlock((FunctionBlockDeclaration)newValue);
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
			case ConfigurationsPackage.FB_TASK__WITH:
				setWith((TaskConfiguration)null);
				return;
			case ConfigurationsPackage.FB_TASK__FUNCTION_BLOCK:
				setFunctionBlock((FunctionBlockDeclaration)null);
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
			case ConfigurationsPackage.FB_TASK__WITH:
				return with != null;
			case ConfigurationsPackage.FB_TASK__FUNCTION_BLOCK:
				return functionBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //FBTaskImpl
