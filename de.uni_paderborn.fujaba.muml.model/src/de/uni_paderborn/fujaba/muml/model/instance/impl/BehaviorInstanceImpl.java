/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.instance.AttributeBinding;
import de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.BehaviorInstanceImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.BehaviorInstanceImpl#getBehavioralElementInstance <em>Behavioral Element Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorInstanceImpl extends EObjectImpl implements BehaviorInstance {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.BEHAVIOR_INSTANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.BEHAVIOR_INSTANCE__BEHAVIOR, oldBehavior, behavior));
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
	public void setBehavior(Behavior newBehavior) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.BEHAVIOR_INSTANCE__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElementInstance getBehavioralElementInstance() {
		if (eContainerFeatureID() != InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE) return null;
		return (BehavioralElementInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavioralElementInstance(BehavioralElementInstance newBehavioralElementInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBehavioralElementInstance, InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralElementInstance(BehavioralElementInstance newBehavioralElementInstance) {
		if (newBehavioralElementInstance != eInternalContainer() || (eContainerFeatureID() != InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE && newBehavioralElementInstance != null)) {
			if (EcoreUtil.isAncestor(this, newBehavioralElementInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBehavioralElementInstance != null)
				msgs = ((InternalEObject)newBehavioralElementInstance).eInverseAdd(this, InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIOR_INSTANCE, BehavioralElementInstance.class, msgs);
			msgs = basicSetBehavioralElementInstance(newBehavioralElementInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE, newBehavioralElementInstance, newBehavioralElementInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBehavioralElementInstance((BehavioralElementInstance)otherEnd, msgs);
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
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE:
				return basicSetBehavioralElementInstance(null, msgs);
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
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE:
				return eInternalContainer().eInverseRemove(this, InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIOR_INSTANCE, BehavioralElementInstance.class, msgs);
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
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE:
				return getBehavioralElementInstance();
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
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE:
				setBehavioralElementInstance((BehavioralElementInstance)newValue);
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
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE:
				setBehavioralElementInstance((BehavioralElementInstance)null);
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
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIOR:
				return behavior != null;
			case InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE:
				return getBehavioralElementInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviorInstanceImpl
