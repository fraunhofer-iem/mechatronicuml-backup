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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteMultiPortInstanceImpl#getSubPortInstances <em>Sub Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteMultiPortInstanceImpl extends DiscretePortInstanceImpl implements DiscreteMultiPortInstance {
	/**
	 * The cached value of the '{@link #getSubPortInstances() <em>Sub Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteSinglePortInstance> subPortInstances;

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
			subPortInstances = new EObjectContainmentWithInverseEList<DiscreteSinglePortInstance>(DiscreteSinglePortInstance.class, this, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES, InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE);
		}
		return subPortInstances;
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPortInstances()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES:
				return ((InternalEList<?>)getSubPortInstances()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES:
				return getSubPortInstances();
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
		}
		return super.eIsSet(featureID);
	}

} //DiscreteMultiPortInstanceImpl
