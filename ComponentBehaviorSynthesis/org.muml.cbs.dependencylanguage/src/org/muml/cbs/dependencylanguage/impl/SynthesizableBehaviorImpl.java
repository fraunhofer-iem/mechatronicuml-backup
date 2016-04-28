/**
 */
package org.muml.cbs.dependencylanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.cbs.dependencylanguage.DependencyModel;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.cbs.dependencylanguage.SynthesizableBehavior;
import org.muml.core.impl.ExtensionImpl;
import org.muml.pim.behavior.Behavior;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.BehavioralElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synthesizable Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.SynthesizableBehaviorImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.SynthesizableBehaviorImpl#getDependencyModel <em>Dependency Model</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.SynthesizableBehaviorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynthesizableBehaviorImpl extends ExtensionImpl implements SynthesizableBehavior {
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
	 * The cached value of the '{@link #getDependencyModel() <em>Dependency Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyModel()
	 * @generated
	 * @ordered
	 */
	protected DependencyModel dependencyModel;

	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DependencylanguagePackage.Literals.SYNTHESIZABLE_BEHAVIOR__NAME).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynthesizableBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencylanguagePackage.Literals.SYNTHESIZABLE_BEHAVIOR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR, oldBehavior, behavior));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR, oldBehavior, newBehavior);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyModel getDependencyModel() {
		return dependencyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencyModel(DependencyModel newDependencyModel, NotificationChain msgs) {
		DependencyModel oldDependencyModel = dependencyModel;
		dependencyModel = newDependencyModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL, oldDependencyModel, newDependencyModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyModel(DependencyModel newDependencyModel) {
		if (newDependencyModel != dependencyModel) {
			NotificationChain msgs = null;
			if (dependencyModel != null)
				msgs = ((InternalEObject)dependencyModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL, null, msgs);
			if (newDependencyModel != null)
				msgs = ((InternalEObject)newDependencyModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL, null, msgs);
			msgs = basicSetDependencyModel(newDependencyModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL, newDependencyModel, newDependencyModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR:
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
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL:
				return basicSetDependencyModel(null, msgs);
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
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL:
				return getDependencyModel();
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__NAME:
				return getName();
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
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL:
				setDependencyModel((DependencyModel)newValue);
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
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL:
				setDependencyModel((DependencyModel)null);
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
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR:
				return behavior != null;
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__DEPENDENCY_MODEL:
				return dependencyModel != null;
			case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR: return BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
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
				case BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return DependencylanguagePackage.SYNTHESIZABLE_BEHAVIOR__BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SynthesizableBehaviorImpl
