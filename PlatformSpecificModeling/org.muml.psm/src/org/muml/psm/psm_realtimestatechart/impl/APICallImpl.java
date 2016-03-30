/**
 */
package org.muml.psm.psm_realtimestatechart.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.actionlanguage.impl.OperationCallImpl;
import org.muml.psm.psm_realtimestatechart.APICall;
import org.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.APICallParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.impl.APICallImpl#getApiCallSignature <em>Api Call Signature</em>}</li>
 * </ul>
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
		return Psm_realtimestatechartPackage.Literals.API_CALL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Psm_realtimestatechartPackage.API_CALL__API_CALL_SIGNATURE, oldApiCallSignature, apiCallSignature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Psm_realtimestatechartPackage.API_CALL__API_CALL_SIGNATURE, oldApiCallSignature, apiCallSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Psm_realtimestatechartPackage.API_CALL__API_CALL_SIGNATURE:
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
			case Psm_realtimestatechartPackage.API_CALL__API_CALL_SIGNATURE:
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
			case Psm_realtimestatechartPackage.API_CALL__API_CALL_SIGNATURE:
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
			case Psm_realtimestatechartPackage.API_CALL__API_CALL_SIGNATURE:
				return apiCallSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //APICallImpl
