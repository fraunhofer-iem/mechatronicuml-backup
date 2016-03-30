/**
 */
package org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance;
import org.muml.psm.psm_instance.Psm_instancePackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtime Statechart Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimeStatechartParameterBindingImpl#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimeStatechartParameterBindingImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RealtimeStatechartParameterBindingImpl extends MinimalEObjectImpl.Container implements RealtimeStatechartParameterBinding {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected RealtimeStatechartParameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimeStatechartParameterBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartparameterbindingPackage.Literals.REALTIME_STATECHART_PARAMETER_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterisableDiscreteSinglePortInstance getPortInstance() {
		if (eContainerFeatureID() != RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE) return null;
		return (ParameterisableDiscreteSinglePortInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortInstance(ParameterisableDiscreteSinglePortInstance newPortInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPortInstance, RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortInstance(ParameterisableDiscreteSinglePortInstance newPortInstance) {
		if (newPortInstance != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE && newPortInstance != null)) {
			if (EcoreUtil.isAncestor(this, newPortInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPortInstance != null)
				msgs = ((InternalEObject)newPortInstance).eInverseAdd(this, Psm_instancePackage.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS, ParameterisableDiscreteSinglePortInstance.class, msgs);
			msgs = basicSetPortInstance(newPortInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE, newPortInstance, newPortInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartParameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (RealtimeStatechartParameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartParameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(RealtimeStatechartParameter newParameter) {
		RealtimeStatechartParameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPortInstance((ParameterisableDiscreteSinglePortInstance)otherEnd, msgs);
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
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE:
				return basicSetPortInstance(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE:
				return eInternalContainer().eInverseRemove(this, Psm_instancePackage.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS, ParameterisableDiscreteSinglePortInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE:
				return getPortInstance();
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
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
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE:
				setPortInstance((ParameterisableDiscreteSinglePortInstance)newValue);
				return;
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER:
				setParameter((RealtimeStatechartParameter)newValue);
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
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE:
				setPortInstance((ParameterisableDiscreteSinglePortInstance)null);
				return;
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER:
				setParameter((RealtimeStatechartParameter)null);
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
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE:
				return getPortInstance() != null;
			case RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PARAMETER:
				return parameter != null;
		}
		return super.eIsSet(featureID);
	}

} //RealtimeStatechartParameterBindingImpl
