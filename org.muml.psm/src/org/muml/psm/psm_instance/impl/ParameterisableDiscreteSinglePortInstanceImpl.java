/**
 */
package org.muml.psm.psm_instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.instance.impl.DiscreteSinglePortInstanceImpl;
import org.muml.psm.psm_instance.ParameterisableDiscreteSinglePortInstance;
import org.muml.psm.psm_instance.Psm_instancePackage;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimeStatechartParameterBinding;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterisable Discrete Single Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.psm_instance.impl.ParameterisableDiscreteSinglePortInstanceImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterisableDiscreteSinglePortInstanceImpl extends DiscreteSinglePortInstanceImpl implements ParameterisableDiscreteSinglePortInstance {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<RealtimeStatechartParameterBinding> bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterisableDiscreteSinglePortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Psm_instancePackage.Literals.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealtimeStatechartParameterBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<RealtimeStatechartParameterBinding>(RealtimeStatechartParameterBinding.class, this, Psm_instancePackage.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS, RealtimestatechartparameterbindingPackage.REALTIME_STATECHART_PARAMETER_BINDING__PORT_INSTANCE);
		}
		return bindings;
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
			case Psm_instancePackage.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBindings()).basicAdd(otherEnd, msgs);
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
			case Psm_instancePackage.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case Psm_instancePackage.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS:
				return getBindings();
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
			case Psm_instancePackage.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends RealtimeStatechartParameterBinding>)newValue);
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
			case Psm_instancePackage.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS:
				getBindings().clear();
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
			case Psm_instancePackage.PARAMETERISABLE_DISCRETE_SINGLE_PORT_INSTANCE__BINDINGS:
				return bindings != null && !bindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterisableDiscreteSinglePortInstanceImpl
