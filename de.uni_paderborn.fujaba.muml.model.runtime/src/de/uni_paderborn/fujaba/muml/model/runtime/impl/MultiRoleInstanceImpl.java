/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Role Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.MultiRoleInstanceImpl#getSingleRoleInstances <em>Single Role Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiRoleInstanceImpl extends RoleInstanceImpl implements MultiRoleInstance {
	/**
	 * The cached value of the '{@link #getSingleRoleInstances() <em>Single Role Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleRoleInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleRoleInstance> singleRoleInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiRoleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.MULTI_ROLE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleRoleInstance> getSingleRoleInstances() {
		if (singleRoleInstances == null) {
			singleRoleInstances = new EObjectWithInverseResolvingEList<SingleRoleInstance>(SingleRoleInstance.class, this, RuntimePackage.MULTI_ROLE_INSTANCE__SINGLE_ROLE_INSTANCES, RuntimePackage.SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE);
		}
		return singleRoleInstances;
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
			case RuntimePackage.MULTI_ROLE_INSTANCE__SINGLE_ROLE_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSingleRoleInstances()).basicAdd(otherEnd, msgs);
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
			case RuntimePackage.MULTI_ROLE_INSTANCE__SINGLE_ROLE_INSTANCES:
				return ((InternalEList<?>)getSingleRoleInstances()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.MULTI_ROLE_INSTANCE__SINGLE_ROLE_INSTANCES:
				return getSingleRoleInstances();
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
			case RuntimePackage.MULTI_ROLE_INSTANCE__SINGLE_ROLE_INSTANCES:
				getSingleRoleInstances().clear();
				getSingleRoleInstances().addAll((Collection<? extends SingleRoleInstance>)newValue);
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
			case RuntimePackage.MULTI_ROLE_INSTANCE__SINGLE_ROLE_INSTANCES:
				getSingleRoleInstances().clear();
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
			case RuntimePackage.MULTI_ROLE_INSTANCE__SINGLE_ROLE_INSTANCES:
				return singleRoleInstances != null && !singleRoleInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiRoleInstanceImpl
