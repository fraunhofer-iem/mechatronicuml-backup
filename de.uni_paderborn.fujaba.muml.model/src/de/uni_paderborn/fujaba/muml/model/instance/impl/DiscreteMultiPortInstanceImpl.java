/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.model.connector.DiscreteMultiInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Multi Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteMultiPortInstanceImpl#getSubInteractionEndpointInstances <em>Sub Interaction Endpoint Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteMultiPortInstanceImpl#getGmfSubPortInstances <em>Gmf Sub Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteMultiPortInstanceImpl extends DiscretePortInstanceImpl implements DiscreteMultiPortInstance {
	/**
	 * The cached value of the '{@link #getSubInteractionEndpointInstances() <em>Sub Interaction Endpoint Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubInteractionEndpointInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteSingleInteractionEndpointInstance> subInteractionEndpointInstances;

	/**
	 * The cached setting delegate for the '{@link #getGmfSubPortInstances() <em>Gmf Sub Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmfSubPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GMF_SUB_PORT_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteMultiPortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.DISCRETE_MULTI_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteSingleInteractionEndpointInstance> getSubInteractionEndpointInstances() {
		if (subInteractionEndpointInstances == null) {
			subInteractionEndpointInstances = new EObjectWithInverseResolvingEList<DiscreteSingleInteractionEndpointInstance>(DiscreteSingleInteractionEndpointInstance.class, this, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE);
		}
		return subInteractionEndpointInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DiscreteSingleInteractionEndpointInstance> getGmfSubPortInstances() {
		// Make sure, adding and removing elements works.
		return getSubInteractionEndpointInstances();
		//return (EList<DiscreteSinglePortInstance>)GMF_SUB_PORT_INSTANCES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubInteractionEndpointInstances()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				return ((InternalEList<?>)getSubInteractionEndpointInstances()).basicRemove(otherEnd, msgs);
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES:
				return ((InternalEList<?>)getGmfSubPortInstances()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				return getSubInteractionEndpointInstances();
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES:
				return getGmfSubPortInstances();
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				getSubInteractionEndpointInstances().clear();
				getSubInteractionEndpointInstances().addAll((Collection<? extends DiscreteSingleInteractionEndpointInstance>)newValue);
				return;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES:
				getGmfSubPortInstances().clear();
				getGmfSubPortInstances().addAll((Collection<? extends DiscreteSingleInteractionEndpointInstance>)newValue);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				getSubInteractionEndpointInstances().clear();
				return;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES:
				getGmfSubPortInstances().clear();
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES:
				return subInteractionEndpointInstances != null && !subInteractionEndpointInstances.isEmpty();
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__GMF_SUB_PORT_INSTANCES:
				return GMF_SUB_PORT_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == DiscreteMultiInteractionEndpointInstance.class) {
			switch (derivedFeatureID) {
				case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES: return ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES;
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
		if (baseClass == DiscreteMultiInteractionEndpointInstance.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES: return InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiscreteMultiPortInstanceImpl
