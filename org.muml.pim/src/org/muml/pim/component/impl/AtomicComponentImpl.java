/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.behavior.Behavior;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.component.AtomicComponent;
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.constraint.ConstraintPackage;
import org.muml.pim.constraint.VerifiableElement;
import org.muml.pim.constraint.VerificationConstraintRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.impl.AtomicComponentImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.AtomicComponentImpl#getContainedBehavior <em>Contained Behavior</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.AtomicComponentImpl#getVerificationConstraintRepositories <em>Verification Constraint Repositories</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AtomicComponentImpl extends ComponentImpl implements AtomicComponent {
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
	 * The cached value of the '{@link #getContainedBehavior() <em>Contained Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior containedBehavior;
	/**
	 * The cached value of the '{@link #getVerificationConstraintRepositories() <em>Verification Constraint Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationConstraintRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationConstraintRepository> verificationConstraintRepositories;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.ATOMIC_COMPONENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR, oldBehavior, behavior));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR, oldBehavior, newBehavior);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getContainedBehavior() {
		return containedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedBehavior(Behavior newContainedBehavior, NotificationChain msgs) {
		Behavior oldContainedBehavior = containedBehavior;
		containedBehavior = newContainedBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR, oldContainedBehavior, newContainedBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedBehavior(Behavior newContainedBehavior) {
		if (newContainedBehavior != containedBehavior) {
			NotificationChain msgs = null;
			if (containedBehavior != null)
				msgs = ((InternalEObject)containedBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR, null, msgs);
			if (newContainedBehavior != null)
				msgs = ((InternalEObject)newContainedBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR, null, msgs);
			msgs = basicSetContainedBehavior(newContainedBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR, newContainedBehavior, newContainedBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VerificationConstraintRepository> getVerificationConstraintRepositories() {
		if (verificationConstraintRepositories == null) {
			verificationConstraintRepositories = new EObjectContainmentEList<VerificationConstraintRepository>(VerificationConstraintRepository.class, this, ComponentPackage.ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES);
		}
		return verificationConstraintRepositories;
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
			case ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR:
				if (behavior != null)
					msgs = ((InternalEObject)behavior).eInverseRemove(this, BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
				return basicSetBehavior((Behavior)otherEnd, msgs);
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
			case ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR:
				return basicSetContainedBehavior(null, msgs);
			case ComponentPackage.ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES:
				return ((InternalEList<?>)getVerificationConstraintRepositories()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR:
				return getContainedBehavior();
			case ComponentPackage.ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES:
				return getVerificationConstraintRepositories();
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
			case ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR:
				setContainedBehavior((Behavior)newValue);
				return;
			case ComponentPackage.ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES:
				getVerificationConstraintRepositories().clear();
				getVerificationConstraintRepositories().addAll((Collection<? extends VerificationConstraintRepository>)newValue);
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
			case ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR:
				setContainedBehavior((Behavior)null);
				return;
			case ComponentPackage.ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES:
				getVerificationConstraintRepositories().clear();
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
			case ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR:
				return behavior != null;
			case ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR:
				return containedBehavior != null;
			case ComponentPackage.ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES:
				return verificationConstraintRepositories != null && !verificationConstraintRepositories.isEmpty();
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
				case ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR: return BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
				case ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR: return BehaviorPackage.BEHAVIORAL_ELEMENT__CONTAINED_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES: return ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES;
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
				case BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return ComponentPackage.ATOMIC_COMPONENT__BEHAVIOR;
				case BehaviorPackage.BEHAVIORAL_ELEMENT__CONTAINED_BEHAVIOR: return ComponentPackage.ATOMIC_COMPONENT__CONTAINED_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (baseFeatureID) {
				case ConstraintPackage.VERIFIABLE_ELEMENT__VERIFICATION_CONSTRAINT_REPOSITORIES: return ComponentPackage.ATOMIC_COMPONENT__VERIFICATION_CONSTRAINT_REPOSITORIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ComponentPackage.ATOMIC_COMPONENT___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Atomic_Component_" + getName();
	}

} //AtomicComponentImpl
