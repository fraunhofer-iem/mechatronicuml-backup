/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.runtime.MultiRoleInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.model.runtime.SingleRoleInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Role Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.SingleRoleInstanceImpl#getMultiRoleInstance <em>Multi Role Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleRoleInstanceImpl extends RoleInstanceImpl implements SingleRoleInstance {
	/**
	 * The cached value of the '{@link #getMultiRoleInstance() <em>Multi Role Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiRoleInstance()
	 * @generated
	 * @ordered
	 */
	protected MultiRoleInstance multiRoleInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleRoleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.SINGLE_ROLE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiRoleInstance getMultiRoleInstance() {
		if (multiRoleInstance != null && multiRoleInstance.eIsProxy()) {
			InternalEObject oldMultiRoleInstance = (InternalEObject)multiRoleInstance;
			multiRoleInstance = (MultiRoleInstance)eResolveProxy(oldMultiRoleInstance);
			if (multiRoleInstance != oldMultiRoleInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE, oldMultiRoleInstance, multiRoleInstance));
			}
		}
		return multiRoleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiRoleInstance basicGetMultiRoleInstance() {
		return multiRoleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiRoleInstance(MultiRoleInstance newMultiRoleInstance, NotificationChain msgs) {
		MultiRoleInstance oldMultiRoleInstance = multiRoleInstance;
		multiRoleInstance = newMultiRoleInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE, oldMultiRoleInstance, newMultiRoleInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiRoleInstance(MultiRoleInstance newMultiRoleInstance) {
		if (newMultiRoleInstance != multiRoleInstance) {
			NotificationChain msgs = null;
			if (multiRoleInstance != null)
				msgs = ((InternalEObject)multiRoleInstance).eInverseRemove(this, RuntimePackage.MULTI_ROLE_INSTANCE__SUB_ROLE_INSTANCES, MultiRoleInstance.class, msgs);
			if (newMultiRoleInstance != null)
				msgs = ((InternalEObject)newMultiRoleInstance).eInverseAdd(this, RuntimePackage.MULTI_ROLE_INSTANCE__SUB_ROLE_INSTANCES, MultiRoleInstance.class, msgs);
			msgs = basicSetMultiRoleInstance(newMultiRoleInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE, newMultiRoleInstance, newMultiRoleInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE:
				if (multiRoleInstance != null)
					msgs = ((InternalEObject)multiRoleInstance).eInverseRemove(this, RuntimePackage.MULTI_ROLE_INSTANCE__SUB_ROLE_INSTANCES, MultiRoleInstance.class, msgs);
				return basicSetMultiRoleInstance((MultiRoleInstance)otherEnd, msgs);
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
			case RuntimePackage.SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE:
				return basicSetMultiRoleInstance(null, msgs);
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
			case RuntimePackage.SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE:
				if (resolve) return getMultiRoleInstance();
				return basicGetMultiRoleInstance();
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
			case RuntimePackage.SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE:
				setMultiRoleInstance((MultiRoleInstance)newValue);
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
			case RuntimePackage.SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE:
				setMultiRoleInstance((MultiRoleInstance)null);
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
			case RuntimePackage.SINGLE_ROLE_INSTANCE__MULTI_ROLE_INSTANCE:
				return multiRoleInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleRoleInstanceImpl
