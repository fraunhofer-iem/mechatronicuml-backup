/**
 */
package org.muml.psm.psm_realtimestatechart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl;
import org.muml.psm.psm_realtimestatechart.ParameterizedRealtimeStatechart;
import org.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.impl.ParameterizedRealtimeStatechartImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.impl.ParameterizedRealtimeStatechartImpl#getAllParameters <em>All Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterizedRealtimeStatechartImpl extends RealtimeStatechartImpl implements ParameterizedRealtimeStatechart {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<RealtimeStatechartParameter> parameters;

	/**
	 * The cached setting delegate for the '{@link #getAllParameters() <em>All Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllParameters()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_PARAMETERS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)Psm_realtimestatechartPackage.Literals.PARAMETERIZED_REALTIME_STATECHART__ALL_PARAMETERS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedRealtimeStatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Psm_realtimestatechartPackage.Literals.PARAMETERIZED_REALTIME_STATECHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealtimeStatechartParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<RealtimeStatechartParameter>(RealtimeStatechartParameter.class, this, Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__PARAMETERS, RealtimestatechartparameterPackage.REALTIME_STATECHART_PARAMETER__STATECHART);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RealtimeStatechartParameter> getAllParameters() {
		return (EList<RealtimeStatechartParameter>)ALL_PARAMETERS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__PARAMETERS:
				return getParameters();
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__ALL_PARAMETERS:
				return getAllParameters();
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
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends RealtimeStatechartParameter>)newValue);
				return;
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__ALL_PARAMETERS:
				getAllParameters().clear();
				getAllParameters().addAll((Collection<? extends RealtimeStatechartParameter>)newValue);
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
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__PARAMETERS:
				getParameters().clear();
				return;
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__ALL_PARAMETERS:
				getAllParameters().clear();
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
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Psm_realtimestatechartPackage.PARAMETERIZED_REALTIME_STATECHART__ALL_PARAMETERS:
				return ALL_PARAMETERS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ParameterizedRealtimeStatechartImpl
