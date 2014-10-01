/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.GlobalResponseTime;
import es.unican.mast.xmlmast.result.GlobalResponseTimeList;
import es.unican.mast.xmlmast.result.ResultPackage;

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
 * An implementation of the model object '<em><b>Global Response Time List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.GlobalResponseTimeListImpl#getGlobalResponseTime <em>Global Response Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalResponseTimeListImpl extends MinimalEObjectImpl.Container implements GlobalResponseTimeList {
	/**
	 * The cached value of the '{@link #getGlobalResponseTime() <em>Global Response Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalResponseTime()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalResponseTime> globalResponseTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalResponseTimeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.GLOBAL_RESPONSE_TIME_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalResponseTime> getGlobalResponseTime() {
		if (globalResponseTime == null) {
			globalResponseTime = new EObjectContainmentEList<GlobalResponseTime>(GlobalResponseTime.class, this, ResultPackage.GLOBAL_RESPONSE_TIME_LIST__GLOBAL_RESPONSE_TIME);
		}
		return globalResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.GLOBAL_RESPONSE_TIME_LIST__GLOBAL_RESPONSE_TIME:
				return ((InternalEList<?>)getGlobalResponseTime()).basicRemove(otherEnd, msgs);
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
			case ResultPackage.GLOBAL_RESPONSE_TIME_LIST__GLOBAL_RESPONSE_TIME:
				return getGlobalResponseTime();
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
			case ResultPackage.GLOBAL_RESPONSE_TIME_LIST__GLOBAL_RESPONSE_TIME:
				getGlobalResponseTime().clear();
				getGlobalResponseTime().addAll((Collection<? extends GlobalResponseTime>)newValue);
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
			case ResultPackage.GLOBAL_RESPONSE_TIME_LIST__GLOBAL_RESPONSE_TIME:
				getGlobalResponseTime().clear();
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
			case ResultPackage.GLOBAL_RESPONSE_TIME_LIST__GLOBAL_RESPONSE_TIME:
				return globalResponseTime != null && !globalResponseTime.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlobalResponseTimeListImpl
