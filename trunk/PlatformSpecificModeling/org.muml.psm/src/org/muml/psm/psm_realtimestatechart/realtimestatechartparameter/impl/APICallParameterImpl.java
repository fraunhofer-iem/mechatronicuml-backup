/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.expressions.Expression;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.types.DataType;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.APICallParameter;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.APICallParameterImpl#getImplementations <em>Implementations</em>}</li>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.APICallParameterImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl.APICallParameterImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APICallParameterImpl extends RealtimeStatechartParameterImpl implements APICallParameter {
	/**
	 * The cached value of the '{@link #getImplementations() <em>Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> implementations;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APICallParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartparameterPackage.Literals.API_CALL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getImplementations() {
		if (implementations == null) {
			implementations = new EObjectContainmentEList<Expression>(Expression.class, this, RealtimestatechartparameterPackage.API_CALL_PARAMETER__IMPLEMENTATIONS);
		}
		return implementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, RealtimestatechartparameterPackage.API_CALL_PARAMETER__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (DataType)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartparameterPackage.API_CALL_PARAMETER__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(DataType newReturnType) {
		DataType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterPackage.API_CALL_PARAMETER__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__IMPLEMENTATIONS:
				return ((InternalEList<?>)getImplementations()).basicRemove(otherEnd, msgs);
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__PARAMETERS:
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
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__IMPLEMENTATIONS:
				return getImplementations();
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__PARAMETERS:
				return getParameters();
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
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
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__IMPLEMENTATIONS:
				getImplementations().clear();
				getImplementations().addAll((Collection<? extends Expression>)newValue);
				return;
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__RETURN_TYPE:
				setReturnType((DataType)newValue);
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
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__IMPLEMENTATIONS:
				getImplementations().clear();
				return;
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__PARAMETERS:
				getParameters().clear();
				return;
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__RETURN_TYPE:
				setReturnType((DataType)null);
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
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__IMPLEMENTATIONS:
				return implementations != null && !implementations.isEmpty();
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case RealtimestatechartparameterPackage.API_CALL_PARAMETER__RETURN_TYPE:
				return returnType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Operation.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartparameterPackage.API_CALL_PARAMETER__IMPLEMENTATIONS: return BehaviorPackage.OPERATION__IMPLEMENTATIONS;
				case RealtimestatechartparameterPackage.API_CALL_PARAMETER__PARAMETERS: return BehaviorPackage.OPERATION__PARAMETERS;
				case RealtimestatechartparameterPackage.API_CALL_PARAMETER__RETURN_TYPE: return BehaviorPackage.OPERATION__RETURN_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Operation.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.OPERATION__IMPLEMENTATIONS: return RealtimestatechartparameterPackage.API_CALL_PARAMETER__IMPLEMENTATIONS;
				case BehaviorPackage.OPERATION__PARAMETERS: return RealtimestatechartparameterPackage.API_CALL_PARAMETER__PARAMETERS;
				case BehaviorPackage.OPERATION__RETURN_TYPE: return RealtimestatechartparameterPackage.API_CALL_PARAMETER__RETURN_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //APICallParameterImpl
