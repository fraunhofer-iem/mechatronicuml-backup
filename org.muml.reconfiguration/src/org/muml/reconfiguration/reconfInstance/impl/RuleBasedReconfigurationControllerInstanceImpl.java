/**
 */
package org.muml.reconfiguration.reconfInstance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.reconfiguration.reconfInstance.ExecutorInstance;
import org.muml.reconfiguration.reconfInstance.ManagerInstance;
import org.muml.reconfiguration.reconfInstance.ReconfInstancePackage;
import org.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Based Reconfiguration Controller Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.reconfInstance.impl.RuleBasedReconfigurationControllerInstanceImpl#getManagerInstance <em>Manager Instance</em>}</li>
 *   <li>{@link org.muml.reconfiguration.reconfInstance.impl.RuleBasedReconfigurationControllerInstanceImpl#getExecutorInstance <em>Executor Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleBasedReconfigurationControllerInstanceImpl extends ReconfigurationControllerInstanceImpl implements RuleBasedReconfigurationControllerInstance {
	/**
	 * The cached value of the '{@link #getManagerInstance() <em>Manager Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerInstance()
	 * @generated
	 * @ordered
	 */
	protected ManagerInstance managerInstance;

	/**
	 * The cached value of the '{@link #getExecutorInstance() <em>Executor Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutorInstance()
	 * @generated
	 * @ordered
	 */
	protected ExecutorInstance executorInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleBasedReconfigurationControllerInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfInstancePackage.Literals.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerInstance getManagerInstance() {
		return managerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManagerInstance(ManagerInstance newManagerInstance, NotificationChain msgs) {
		ManagerInstance oldManagerInstance = managerInstance;
		managerInstance = newManagerInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE, oldManagerInstance, newManagerInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagerInstance(ManagerInstance newManagerInstance) {
		if (newManagerInstance != managerInstance) {
			NotificationChain msgs = null;
			if (managerInstance != null)
				msgs = ((InternalEObject)managerInstance).eInverseRemove(this, ReconfInstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE, ManagerInstance.class, msgs);
			if (newManagerInstance != null)
				msgs = ((InternalEObject)newManagerInstance).eInverseAdd(this, ReconfInstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE, ManagerInstance.class, msgs);
			msgs = basicSetManagerInstance(newManagerInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE, newManagerInstance, newManagerInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutorInstance getExecutorInstance() {
		return executorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutorInstance(ExecutorInstance newExecutorInstance, NotificationChain msgs) {
		ExecutorInstance oldExecutorInstance = executorInstance;
		executorInstance = newExecutorInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE, oldExecutorInstance, newExecutorInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutorInstance(ExecutorInstance newExecutorInstance) {
		if (newExecutorInstance != executorInstance) {
			NotificationChain msgs = null;
			if (executorInstance != null)
				msgs = ((InternalEObject)executorInstance).eInverseRemove(this, ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE, ExecutorInstance.class, msgs);
			if (newExecutorInstance != null)
				msgs = ((InternalEObject)newExecutorInstance).eInverseAdd(this, ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE, ExecutorInstance.class, msgs);
			msgs = basicSetExecutorInstance(newExecutorInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE, newExecutorInstance, newExecutorInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE:
				if (managerInstance != null)
					msgs = ((InternalEObject)managerInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE, null, msgs);
				return basicSetManagerInstance((ManagerInstance)otherEnd, msgs);
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE:
				if (executorInstance != null)
					msgs = ((InternalEObject)executorInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE, null, msgs);
				return basicSetExecutorInstance((ExecutorInstance)otherEnd, msgs);
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
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE:
				return basicSetManagerInstance(null, msgs);
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE:
				return basicSetExecutorInstance(null, msgs);
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
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE:
				return getManagerInstance();
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE:
				return getExecutorInstance();
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
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE:
				setManagerInstance((ManagerInstance)newValue);
				return;
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE:
				setExecutorInstance((ExecutorInstance)newValue);
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
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE:
				setManagerInstance((ManagerInstance)null);
				return;
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE:
				setExecutorInstance((ExecutorInstance)null);
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
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE:
				return managerInstance != null;
			case ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE:
				return executorInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleBasedReconfigurationControllerInstanceImpl
