/**
 */
package org.muml.reconfiguration.reconfInstance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.reconfiguration.Executor;
import org.muml.reconfiguration.reconfInstance.ExecutorInstance;
import org.muml.reconfiguration.reconfInstance.ReconfInstancePackage;
import org.muml.reconfiguration.reconfInstance.ReconfigurationPortInstance;
import org.muml.reconfiguration.reconfInstance.RuleBasedReconfigurationControllerInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executor Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.reconfInstance.impl.ExecutorInstanceImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link org.muml.reconfiguration.reconfInstance.impl.ExecutorInstanceImpl#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}</li>
 *   <li>{@link org.muml.reconfiguration.reconfInstance.impl.ExecutorInstanceImpl#getPortInstances <em>Port Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutorInstanceImpl extends NamedElementImpl implements ExecutorInstance {
	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Executor executor;

	/**
	 * The cached value of the '{@link #getPortInstances() <em>Port Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationPortInstance> portInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfInstancePackage.Literals.EXECUTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		if (executor != null && executor.eIsProxy()) {
			InternalEObject oldExecutor = (InternalEObject)executor;
			executor = (Executor)eResolveProxy(oldExecutor);
			if (executor != oldExecutor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfInstancePackage.EXECUTOR_INSTANCE__EXECUTOR, oldExecutor, executor));
			}
		}
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor basicGetExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor(Executor newExecutor) {
		Executor oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfInstancePackage.EXECUTOR_INSTANCE__EXECUTOR, oldExecutor, executor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBasedReconfigurationControllerInstance getReconfigurationControllerInstance() {
		if (eContainerFeatureID() != ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE) return null;
		return (RuleBasedReconfigurationControllerInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance newReconfigurationControllerInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReconfigurationControllerInstance, ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance newReconfigurationControllerInstance) {
		if (newReconfigurationControllerInstance != eInternalContainer() || (eContainerFeatureID() != ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE && newReconfigurationControllerInstance != null)) {
			if (EcoreUtil.isAncestor(this, newReconfigurationControllerInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReconfigurationControllerInstance != null)
				msgs = ((InternalEObject)newReconfigurationControllerInstance).eInverseAdd(this, ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE, RuleBasedReconfigurationControllerInstance.class, msgs);
			msgs = basicSetReconfigurationControllerInstance(newReconfigurationControllerInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE, newReconfigurationControllerInstance, newReconfigurationControllerInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationPortInstance> getPortInstances() {
		if (portInstances == null) {
			portInstances = new EObjectResolvingEList<ReconfigurationPortInstance>(ReconfigurationPortInstance.class, this, ReconfInstancePackage.EXECUTOR_INSTANCE__PORT_INSTANCES);
		}
		return portInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReconfigurationControllerInstance((RuleBasedReconfigurationControllerInstance)otherEnd, msgs);
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
			case ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				return basicSetReconfigurationControllerInstance(null, msgs);
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
			case ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				return eInternalContainer().eInverseRemove(this, ReconfInstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__EXECUTOR_INSTANCE, RuleBasedReconfigurationControllerInstance.class, msgs);
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
			case ReconfInstancePackage.EXECUTOR_INSTANCE__EXECUTOR:
				if (resolve) return getExecutor();
				return basicGetExecutor();
			case ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				return getReconfigurationControllerInstance();
			case ReconfInstancePackage.EXECUTOR_INSTANCE__PORT_INSTANCES:
				return getPortInstances();
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
			case ReconfInstancePackage.EXECUTOR_INSTANCE__EXECUTOR:
				setExecutor((Executor)newValue);
				return;
			case ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				setReconfigurationControllerInstance((RuleBasedReconfigurationControllerInstance)newValue);
				return;
			case ReconfInstancePackage.EXECUTOR_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
				getPortInstances().addAll((Collection<? extends ReconfigurationPortInstance>)newValue);
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
			case ReconfInstancePackage.EXECUTOR_INSTANCE__EXECUTOR:
				setExecutor((Executor)null);
				return;
			case ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				setReconfigurationControllerInstance((RuleBasedReconfigurationControllerInstance)null);
				return;
			case ReconfInstancePackage.EXECUTOR_INSTANCE__PORT_INSTANCES:
				getPortInstances().clear();
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
			case ReconfInstancePackage.EXECUTOR_INSTANCE__EXECUTOR:
				return executor != null;
			case ReconfInstancePackage.EXECUTOR_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				return getReconfigurationControllerInstance() != null;
			case ReconfInstancePackage.EXECUTOR_INSTANCE__PORT_INSTANCES:
				return portInstances != null && !portInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutorInstanceImpl
