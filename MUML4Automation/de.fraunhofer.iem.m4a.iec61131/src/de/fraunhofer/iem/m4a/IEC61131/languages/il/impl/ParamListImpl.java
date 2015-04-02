/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamInstruction;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.ParamList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.ParamListImpl#getParamInstructions <em>Param Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamListImpl extends MinimalEObjectImpl.Container implements ParamList {
	/**
	 * The cached value of the '{@link #getParamInstructions() <em>Param Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamInstruction> paramInstructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.PARAM_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamInstruction> getParamInstructions() {
		if (paramInstructions == null) {
			paramInstructions = new EObjectContainmentEList<ParamInstruction>(ParamInstruction.class, this, IlPackage.PARAM_LIST__PARAM_INSTRUCTIONS);
		}
		return paramInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IlPackage.PARAM_LIST__PARAM_INSTRUCTIONS:
				return ((InternalEList<?>)getParamInstructions()).basicRemove(otherEnd, msgs);
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
			case IlPackage.PARAM_LIST__PARAM_INSTRUCTIONS:
				return getParamInstructions();
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
			case IlPackage.PARAM_LIST__PARAM_INSTRUCTIONS:
				getParamInstructions().clear();
				getParamInstructions().addAll((Collection<? extends ParamInstruction>)newValue);
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
			case IlPackage.PARAM_LIST__PARAM_INSTRUCTIONS:
				getParamInstructions().clear();
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
			case IlPackage.PARAM_LIST__PARAM_INSTRUCTIONS:
				return paramInstructions != null && !paramInstructions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParamListImpl
