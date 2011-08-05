/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Multi Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteMultiPortInstanceImpl#getSubPortInstances <em>Sub Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteMultiPortInstanceImpl#getAdaptationBehaviorInstance <em>Adaptation Behavior Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteMultiPortInstanceImpl extends DiscretePortInstanceImpl implements DiscreteMultiPortInstance {
	/**
	 * The cached value of the '{@link #getSubPortInstances() <em>Sub Port Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteSinglePortInstance> subPortInstances;

	/**
	 * The cached value of the '{@link #getAdaptationBehaviorInstance() <em>Adaptation Behavior Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationBehaviorInstance()
	 * @generated
	 * @ordered
	 */
	protected BehaviorInstance adaptationBehaviorInstance;

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
	public EList<DiscreteSinglePortInstance> getSubPortInstances() {
		if (subPortInstances == null) {
			subPortInstances = new EObjectResolvingEList<DiscreteSinglePortInstance>(DiscreteSinglePortInstance.class, this, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES);
		}
		return subPortInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorInstance getAdaptationBehaviorInstance() {
		if (adaptationBehaviorInstance != null && adaptationBehaviorInstance.eIsProxy()) {
			InternalEObject oldAdaptationBehaviorInstance = (InternalEObject)adaptationBehaviorInstance;
			adaptationBehaviorInstance = (BehaviorInstance)eResolveProxy(oldAdaptationBehaviorInstance);
			if (adaptationBehaviorInstance != oldAdaptationBehaviorInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__ADAPTATION_BEHAVIOR_INSTANCE, oldAdaptationBehaviorInstance, adaptationBehaviorInstance));
			}
		}
		return adaptationBehaviorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorInstance basicGetAdaptationBehaviorInstance() {
		return adaptationBehaviorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationBehaviorInstance(BehaviorInstance newAdaptationBehaviorInstance) {
		BehaviorInstance oldAdaptationBehaviorInstance = adaptationBehaviorInstance;
		adaptationBehaviorInstance = newAdaptationBehaviorInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__ADAPTATION_BEHAVIOR_INSTANCE, oldAdaptationBehaviorInstance, adaptationBehaviorInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES:
				return getSubPortInstances();
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__ADAPTATION_BEHAVIOR_INSTANCE:
				if (resolve) return getAdaptationBehaviorInstance();
				return basicGetAdaptationBehaviorInstance();
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES:
				getSubPortInstances().clear();
				getSubPortInstances().addAll((Collection<? extends DiscreteSinglePortInstance>)newValue);
				return;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__ADAPTATION_BEHAVIOR_INSTANCE:
				setAdaptationBehaviorInstance((BehaviorInstance)newValue);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES:
				getSubPortInstances().clear();
				return;
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__ADAPTATION_BEHAVIOR_INSTANCE:
				setAdaptationBehaviorInstance((BehaviorInstance)null);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES:
				return subPortInstances != null && !subPortInstances.isEmpty();
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__ADAPTATION_BEHAVIOR_INSTANCE:
				return adaptationBehaviorInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //DiscreteMultiPortInstanceImpl
