/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.umlrt.model.component.Delegation;
import de.uni_paderborn.fujaba.umlrt.model.instance.DelegationInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.DelegationInstanceImpl#getDelegationType <em>Delegation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationInstanceImpl extends ConnectorInstanceImpl implements DelegationInstance {
	/**
	 * The cached value of the '{@link #getDelegationType() <em>Delegation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationType()
	 * @generated
	 * @ordered
	 */
	protected Delegation delegationType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.DELEGATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegation getDelegationType() {
		if (delegationType != null && delegationType.eIsProxy()) {
			InternalEObject oldDelegationType = (InternalEObject)delegationType;
			delegationType = (Delegation)eResolveProxy(oldDelegationType);
			if (delegationType != oldDelegationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.DELEGATION_INSTANCE__DELEGATION_TYPE, oldDelegationType, delegationType));
			}
		}
		return delegationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegation basicGetDelegationType() {
		return delegationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegationType(Delegation newDelegationType) {
		Delegation oldDelegationType = delegationType;
		delegationType = newDelegationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DELEGATION_INSTANCE__DELEGATION_TYPE, oldDelegationType, delegationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.DELEGATION_INSTANCE__DELEGATION_TYPE:
				if (resolve) return getDelegationType();
				return basicGetDelegationType();
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
			case InstancePackage.DELEGATION_INSTANCE__DELEGATION_TYPE:
				setDelegationType((Delegation)newValue);
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
			case InstancePackage.DELEGATION_INSTANCE__DELEGATION_TYPE:
				setDelegationType((Delegation)null);
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
			case InstancePackage.DELEGATION_INSTANCE__DELEGATION_TYPE:
				return delegationType != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationInstanceImpl
