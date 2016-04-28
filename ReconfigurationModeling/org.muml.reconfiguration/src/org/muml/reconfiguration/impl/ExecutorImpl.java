/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.impl.CommentableElementImpl;
import org.muml.pim.behavior.Behavior;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.reconfiguration.Executor;
import org.muml.reconfiguration.ExecutorSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationExecutionPort;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.ReconfigurationPort;
import org.muml.reconfiguration.RuleBasedReconfigurationController;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.impl.ExecutorImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ExecutorImpl#getSpecificationEntries <em>Specification Entries</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ExecutorImpl#getReconfigurationController <em>Reconfiguration Controller</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ExecutorImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ExecutorImpl#getReconfigurationExecutionPorts <em>Reconfiguration Execution Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutorImpl extends CommentableElementImpl implements Executor {
	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;
	/**
	 * The cached value of the '{@link #getSpecificationEntries() <em>Specification Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutorSpecificationEntry> specificationEntries;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationPort> ports;

	/**
	 * The cached setting delegate for the '{@link #getReconfigurationExecutionPorts() <em>Reconfiguration Execution Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationExecutionPorts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RECONFIGURATION_EXECUTION_PORTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ReconfigurationPackage.Literals.EXECUTOR__RECONFIGURATION_EXECUTION_PORTS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.EXECUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (Behavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.EXECUTOR__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(Behavior newBehavior, NotificationChain msgs) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR__BEHAVIOR, oldBehavior, newBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = ((InternalEObject)behavior).eInverseRemove(this, BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject)newBehavior).eInverseAdd(this, BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutorSpecificationEntry> getSpecificationEntries() {
		if (specificationEntries == null) {
			specificationEntries = new EObjectContainmentWithInverseEList<ExecutorSpecificationEntry>(ExecutorSpecificationEntry.class, this, ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR);
		}
		return specificationEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBasedReconfigurationController getReconfigurationController() {
		if (eContainerFeatureID() != ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER) return null;
		return (RuleBasedReconfigurationController)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconfigurationController(RuleBasedReconfigurationController newReconfigurationController, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReconfigurationController, ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationController(RuleBasedReconfigurationController newReconfigurationController) {
		if (newReconfigurationController != eInternalContainer() || (eContainerFeatureID() != ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER && newReconfigurationController != null)) {
			if (EcoreUtil.isAncestor(this, newReconfigurationController))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReconfigurationController != null)
				msgs = ((InternalEObject)newReconfigurationController).eInverseAdd(this, ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR, RuleBasedReconfigurationController.class, msgs);
			msgs = basicSetReconfigurationController(newReconfigurationController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER, newReconfigurationController, newReconfigurationController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<ReconfigurationPort>(ReconfigurationPort.class, this, ReconfigurationPackage.EXECUTOR__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ReconfigurationExecutionPort> getReconfigurationExecutionPorts() {
		return (EList<ReconfigurationExecutionPort>)RECONFIGURATION_EXECUTION_PORTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case ReconfigurationPackage.EXECUTOR__BEHAVIOR:
				if (behavior != null)
					msgs = ((InternalEObject)behavior).eInverseRemove(this, BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
				return basicSetBehavior((Behavior)otherEnd, msgs);
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecificationEntries()).basicAdd(otherEnd, msgs);
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReconfigurationController((RuleBasedReconfigurationController)otherEnd, msgs);
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
			case ReconfigurationPackage.EXECUTOR__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				return ((InternalEList<?>)getSpecificationEntries()).basicRemove(otherEnd, msgs);
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				return basicSetReconfigurationController(null, msgs);
			case ReconfigurationPackage.EXECUTOR__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				return eInternalContainer().eInverseRemove(this, ReconfigurationPackage.RULE_BASED_RECONFIGURATION_CONTROLLER__EXECUTOR, RuleBasedReconfigurationController.class, msgs);
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
			case ReconfigurationPackage.EXECUTOR__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				return getSpecificationEntries();
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				return getReconfigurationController();
			case ReconfigurationPackage.EXECUTOR__PORTS:
				return getPorts();
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_EXECUTION_PORTS:
				return getReconfigurationExecutionPorts();
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
			case ReconfigurationPackage.EXECUTOR__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				getSpecificationEntries().clear();
				getSpecificationEntries().addAll((Collection<? extends ExecutorSpecificationEntry>)newValue);
				return;
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				setReconfigurationController((RuleBasedReconfigurationController)newValue);
				return;
			case ReconfigurationPackage.EXECUTOR__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends ReconfigurationPort>)newValue);
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
			case ReconfigurationPackage.EXECUTOR__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				getSpecificationEntries().clear();
				return;
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				setReconfigurationController((RuleBasedReconfigurationController)null);
				return;
			case ReconfigurationPackage.EXECUTOR__PORTS:
				getPorts().clear();
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
			case ReconfigurationPackage.EXECUTOR__BEHAVIOR:
				return behavior != null;
			case ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES:
				return specificationEntries != null && !specificationEntries.isEmpty();
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_CONTROLLER:
				return getReconfigurationController() != null;
			case ReconfigurationPackage.EXECUTOR__PORTS:
				return ports != null && !ports.isEmpty();
			case ReconfigurationPackage.EXECUTOR__RECONFIGURATION_EXECUTION_PORTS:
				return RECONFIGURATION_EXECUTION_PORTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == BehavioralElement.class) {
			switch (derivedFeatureID) {
				case ReconfigurationPackage.EXECUTOR__BEHAVIOR: return BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
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
		if (baseClass == BehavioralElement.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return ReconfigurationPackage.EXECUTOR__BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExecutorImpl
