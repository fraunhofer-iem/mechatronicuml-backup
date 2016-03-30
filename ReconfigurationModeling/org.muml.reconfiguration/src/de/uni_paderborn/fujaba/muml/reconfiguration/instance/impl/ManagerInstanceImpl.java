/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ManagerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurationPortInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.RuleBasedReconfigurationControllerInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ManagerInstanceImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ManagerInstanceImpl#getReconfigurationControllerInstance <em>Reconfiguration Controller Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ManagerInstanceImpl#getPortInstances <em>Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerInstanceImpl extends NamedElementImpl implements ManagerInstance {
	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Manager manager;

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
	protected ManagerInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.MANAGER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject)manager;
			manager = (Manager)eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.MANAGER_INSTANCE__MANAGER, oldManager, manager));
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Manager newManager) {
		Manager oldManager = manager;
		manager = newManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.MANAGER_INSTANCE__MANAGER, oldManager, manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBasedReconfigurationControllerInstance getReconfigurationControllerInstance() {
		if (eContainerFeatureID() != InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE) return null;
		return (RuleBasedReconfigurationControllerInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance newReconfigurationControllerInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReconfigurationControllerInstance, InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationControllerInstance(RuleBasedReconfigurationControllerInstance newReconfigurationControllerInstance) {
		if (newReconfigurationControllerInstance != eInternalContainer() || (eContainerFeatureID() != InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE && newReconfigurationControllerInstance != null)) {
			if (EcoreUtil.isAncestor(this, newReconfigurationControllerInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReconfigurationControllerInstance != null)
				msgs = ((InternalEObject)newReconfigurationControllerInstance).eInverseAdd(this, InstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE, RuleBasedReconfigurationControllerInstance.class, msgs);
			msgs = basicSetReconfigurationControllerInstance(newReconfigurationControllerInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE, newReconfigurationControllerInstance, newReconfigurationControllerInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationPortInstance> getPortInstances() {
		if (portInstances == null) {
			portInstances = new EObjectResolvingEList<ReconfigurationPortInstance>(ReconfigurationPortInstance.class, this, InstancePackage.MANAGER_INSTANCE__PORT_INSTANCES);
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
			case InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
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
			case InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
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
			case InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				return eInternalContainer().eInverseRemove(this, InstancePackage.RULE_BASED_RECONFIGURATION_CONTROLLER_INSTANCE__MANAGER_INSTANCE, RuleBasedReconfigurationControllerInstance.class, msgs);
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
			case InstancePackage.MANAGER_INSTANCE__MANAGER:
				if (resolve) return getManager();
				return basicGetManager();
			case InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				return getReconfigurationControllerInstance();
			case InstancePackage.MANAGER_INSTANCE__PORT_INSTANCES:
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
			case InstancePackage.MANAGER_INSTANCE__MANAGER:
				setManager((Manager)newValue);
				return;
			case InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				setReconfigurationControllerInstance((RuleBasedReconfigurationControllerInstance)newValue);
				return;
			case InstancePackage.MANAGER_INSTANCE__PORT_INSTANCES:
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
			case InstancePackage.MANAGER_INSTANCE__MANAGER:
				setManager((Manager)null);
				return;
			case InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				setReconfigurationControllerInstance((RuleBasedReconfigurationControllerInstance)null);
				return;
			case InstancePackage.MANAGER_INSTANCE__PORT_INSTANCES:
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
			case InstancePackage.MANAGER_INSTANCE__MANAGER:
				return manager != null;
			case InstancePackage.MANAGER_INSTANCE__RECONFIGURATION_CONTROLLER_INSTANCE:
				return getReconfigurationControllerInstance() != null;
			case InstancePackage.MANAGER_INSTANCE__PORT_INSTANCES:
				return portInstances != null && !portInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManagerInstanceImpl
