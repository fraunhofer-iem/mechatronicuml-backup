/**
 */
package de.uni_paderborn.fujaba.muml.psm.realtimestatechart.impl;

import de.uni_paderborn.fujaba.muml.actionlanguage.impl.OperationCallImpl;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.APICall;
import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.RealtimestatechartPackage;

import de.uni_paderborn.fujaba.muml.psm.realtimestatechart.realtimestatechartparameter.APICallParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.realtimestatechart.impl.APICallImpl#getApiCallSignature <em>Api Call Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class APICallImpl extends OperationCallImpl implements APICall {
	/**
	 * The cached value of the '{@link #getApiCallSignature() <em>Api Call Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiCallSignature()
	 * @generated
	 * @ordered
	 */
	protected APICallParameter apiCallSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APICallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.API_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APICallParameter getApiCallSignature() {
		if (apiCallSignature != null && apiCallSignature.eIsProxy()) {
			InternalEObject oldApiCallSignature = (InternalEObject)apiCallSignature;
			apiCallSignature = (APICallParameter)eResolveProxy(oldApiCallSignature);
			if (apiCallSignature != oldApiCallSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.API_CALL__API_CALL_SIGNATURE, oldApiCallSignature, apiCallSignature));
			}
		}
		return apiCallSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APICallParameter basicGetApiCallSignature() {
		return apiCallSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiCallSignature(APICallParameter newApiCallSignature) {
		APICallParameter oldApiCallSignature = apiCallSignature;
		apiCallSignature = newApiCallSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.API_CALL__API_CALL_SIGNATURE, oldApiCallSignature, apiCallSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.API_CALL__API_CALL_SIGNATURE:
				if (resolve) return getApiCallSignature();
				return basicGetApiCallSignature();
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
			case RealtimestatechartPackage.API_CALL__API_CALL_SIGNATURE:
				setApiCallSignature((APICallParameter)newValue);
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
			case RealtimestatechartPackage.API_CALL__API_CALL_SIGNATURE:
				setApiCallSignature((APICallParameter)null);
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
			case RealtimestatechartPackage.API_CALL__API_CALL_SIGNATURE:
				return apiCallSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //APICallImpl
