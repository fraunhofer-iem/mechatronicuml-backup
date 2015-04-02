/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.ExternalVarSpecImpl;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.AbstractFunctionBlockDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.FunctionBlockPointer;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Block Pointer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.FunctionBlockPointerImpl#getFunctionBlockType <em>Function Block Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionBlockPointerImpl extends ExternalVarSpecImpl implements FunctionBlockPointer {
	/**
	 * The cached value of the '{@link #getFunctionBlockType() <em>Function Block Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionBlockType()
	 * @generated
	 * @ordered
	 */
	protected AbstractFunctionBlockDeclaration functionBlockType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBlockPointerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PousPackage.Literals.FUNCTION_BLOCK_POINTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunctionBlockDeclaration getFunctionBlockType() {
		if (functionBlockType != null && functionBlockType.eIsProxy()) {
			InternalEObject oldFunctionBlockType = (InternalEObject)functionBlockType;
			functionBlockType = (AbstractFunctionBlockDeclaration)eResolveProxy(oldFunctionBlockType);
			if (functionBlockType != oldFunctionBlockType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PousPackage.FUNCTION_BLOCK_POINTER__FUNCTION_BLOCK_TYPE, oldFunctionBlockType, functionBlockType));
			}
		}
		return functionBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunctionBlockDeclaration basicGetFunctionBlockType() {
		return functionBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionBlockType(AbstractFunctionBlockDeclaration newFunctionBlockType) {
		AbstractFunctionBlockDeclaration oldFunctionBlockType = functionBlockType;
		functionBlockType = newFunctionBlockType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PousPackage.FUNCTION_BLOCK_POINTER__FUNCTION_BLOCK_TYPE, oldFunctionBlockType, functionBlockType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PousPackage.FUNCTION_BLOCK_POINTER__FUNCTION_BLOCK_TYPE:
				if (resolve) return getFunctionBlockType();
				return basicGetFunctionBlockType();
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
			case PousPackage.FUNCTION_BLOCK_POINTER__FUNCTION_BLOCK_TYPE:
				setFunctionBlockType((AbstractFunctionBlockDeclaration)newValue);
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
			case PousPackage.FUNCTION_BLOCK_POINTER__FUNCTION_BLOCK_TYPE:
				setFunctionBlockType((AbstractFunctionBlockDeclaration)null);
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
			case PousPackage.FUNCTION_BLOCK_POINTER__FUNCTION_BLOCK_TYPE:
				return functionBlockType != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionBlockPointerImpl
