/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.reconfiguration.Executor;
import org.muml.reconfiguration.Manager;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.RuleBasedReconfigurationController;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Based Reconfiguration Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.impl.RuleBasedReconfigurationControllerImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.RuleBasedReconfigurationControllerImpl#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleBasedReconfigurationControllerImpl extends ReconfigurationControllerImpl implements RuleBasedReconfigurationController {
	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Executor executor;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Manager manager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleBasedReconfigurationControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RULE_BASED_RECONFIGURATION_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutor(Executor newExecutor, NotificationChain msgs) {
		Executor oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR, oldExecutor, newExecutor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor(Executor newExecutor) {
		if (newExecutor != executor) {
			NotificationChain msgs = null;
			if (executor != null)
				msgs = ((InternalEObject)executor).eInverseRemove(this, ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER, Executor.class, msgs);
			if (newExecutor != null)
				msgs = ((InternalEObject)newExecutor).eInverseAdd(this, ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER, Executor.class, msgs);
			msgs = basicSetExecutor(newExecutor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR, newExecutor, newExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(Manager newManager, NotificationChain msgs) {
		Manager oldManager = manager;
		manager = newManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER, oldManager, newManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Manager newManager) {
		if (newManager != manager) {
			NotificationChain msgs = null;
			if (manager != null)
				msgs = ((InternalEObject)manager).eInverseRemove(this, ReconfigurationPackage.MANAGER__RECONFIGURATION_CONTROLLER, Manager.class, msgs);
			if (newManager != null)
				msgs = ((InternalEObject)newManager).eInverseAdd(this, ReconfigurationPackage.MANAGER__RECONFIGURATION_CONTROLLER, Manager.class, msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER, newManager, newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR:
				if (executor != null)
					msgs = ((InternalEObject)executor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR, null, msgs);
				return basicSetExecutor((Executor)otherEnd, msgs);
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER:
				if (manager != null)
					msgs = ((InternalEObject)manager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER, null, msgs);
				return basicSetManager((Manager)otherEnd, msgs);
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
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR:
				return basicSetExecutor(null, msgs);
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER:
				return basicSetManager(null, msgs);
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
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR:
				return getExecutor();
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER:
				return getManager();
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
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR:
				setExecutor((Executor)newValue);
				return;
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER:
				setManager((Manager)newValue);
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
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR:
				setExecutor((Executor)null);
				return;
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER:
				setManager((Manager)null);
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
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR:
				return executor != null;
			case ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__MANAGER:
				return manager != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleBasedReconfigurationControllerImpl
