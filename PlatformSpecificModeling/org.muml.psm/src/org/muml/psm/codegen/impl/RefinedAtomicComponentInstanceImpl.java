/**
 */
package org.muml.psm.codegen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.expressions.Expression;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.impl.AtomicComponentInstanceImpl;
import org.muml.psm.codegen.CodegenPackage;
import org.muml.psm.codegen.GenComponentInstance;
import org.muml.psm.codegen.GenPortInstance;
import org.muml.psm.codegen.RefinedAtomicComponentInstance;
import org.muml.psm.codegen.RefinedStructuredResourceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refined Atomic Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl#getInitCommands <em>Init Commands</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl#getGenPortInstances <em>Gen Port Instances</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.RefinedAtomicComponentInstanceImpl#getAllocatedResourceInstance <em>Allocated Resource Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinedAtomicComponentInstanceImpl extends AtomicComponentInstanceImpl implements RefinedAtomicComponentInstance {
	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance componentInstance;
	/**
	 * The cached value of the '{@link #getInitCommands() <em>Init Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> initCommands;
	/**
	 * The cached value of the '{@link #getGenPortInstances() <em>Gen Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<GenPortInstance> genPortInstances;
	/**
	 * The cached value of the '{@link #getAllocatedResourceInstance() <em>Allocated Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedResourceInstance()
	 * @generated
	 * @ordered
	 */
	protected RefinedStructuredResourceInstance allocatedResourceInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinedAtomicComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.REFINED_ATOMIC_COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		if (componentInstance != null && componentInstance.eIsProxy()) {
			InternalEObject oldComponentInstance = (InternalEObject)componentInstance;
			componentInstance = (ComponentInstance)eResolveProxy(oldComponentInstance);
			if (componentInstance != oldComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
			}
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponentInstance() {
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		ComponentInstance oldComponentInstance = componentInstance;
		componentInstance = newComponentInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getInitCommands() {
		if (initCommands == null) {
			initCommands = new EObjectResolvingEList<Expression>(Expression.class, this, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__INIT_COMMANDS);
		}
		return initCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenPortInstance> getGenPortInstances() {
		if (genPortInstances == null) {
			genPortInstances = new EObjectContainmentEList<GenPortInstance>(GenPortInstance.class, this, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__GEN_PORT_INSTANCES);
		}
		return genPortInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedStructuredResourceInstance getAllocatedResourceInstance() {
		if (allocatedResourceInstance != null && allocatedResourceInstance.eIsProxy()) {
			InternalEObject oldAllocatedResourceInstance = (InternalEObject)allocatedResourceInstance;
			allocatedResourceInstance = (RefinedStructuredResourceInstance)eResolveProxy(oldAllocatedResourceInstance);
			if (allocatedResourceInstance != oldAllocatedResourceInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE, oldAllocatedResourceInstance, allocatedResourceInstance));
			}
		}
		return allocatedResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedStructuredResourceInstance basicGetAllocatedResourceInstance() {
		return allocatedResourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedResourceInstance(RefinedStructuredResourceInstance newAllocatedResourceInstance, NotificationChain msgs) {
		RefinedStructuredResourceInstance oldAllocatedResourceInstance = allocatedResourceInstance;
		allocatedResourceInstance = newAllocatedResourceInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE, oldAllocatedResourceInstance, newAllocatedResourceInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedResourceInstance(RefinedStructuredResourceInstance newAllocatedResourceInstance) {
		if (newAllocatedResourceInstance != allocatedResourceInstance) {
			NotificationChain msgs = null;
			if (allocatedResourceInstance != null)
				msgs = ((InternalEObject)allocatedResourceInstance).eInverseRemove(this, CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES, RefinedStructuredResourceInstance.class, msgs);
			if (newAllocatedResourceInstance != null)
				msgs = ((InternalEObject)newAllocatedResourceInstance).eInverseAdd(this, CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES, RefinedStructuredResourceInstance.class, msgs);
			msgs = basicSetAllocatedResourceInstance(newAllocatedResourceInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE, newAllocatedResourceInstance, newAllocatedResourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				if (allocatedResourceInstance != null)
					msgs = ((InternalEObject)allocatedResourceInstance).eInverseRemove(this, CodegenPackage.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES, RefinedStructuredResourceInstance.class, msgs);
				return basicSetAllocatedResourceInstance((RefinedStructuredResourceInstance)otherEnd, msgs);
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
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__GEN_PORT_INSTANCES:
				return ((InternalEList<?>)getGenPortInstances()).basicRemove(otherEnd, msgs);
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				return basicSetAllocatedResourceInstance(null, msgs);
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
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				if (resolve) return getComponentInstance();
				return basicGetComponentInstance();
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__INIT_COMMANDS:
				return getInitCommands();
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__GEN_PORT_INSTANCES:
				return getGenPortInstances();
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				if (resolve) return getAllocatedResourceInstance();
				return basicGetAllocatedResourceInstance();
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
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
				return;
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__INIT_COMMANDS:
				getInitCommands().clear();
				getInitCommands().addAll((Collection<? extends Expression>)newValue);
				return;
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__GEN_PORT_INSTANCES:
				getGenPortInstances().clear();
				getGenPortInstances().addAll((Collection<? extends GenPortInstance>)newValue);
				return;
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				setAllocatedResourceInstance((RefinedStructuredResourceInstance)newValue);
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
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
				return;
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__INIT_COMMANDS:
				getInitCommands().clear();
				return;
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__GEN_PORT_INSTANCES:
				getGenPortInstances().clear();
				return;
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				setAllocatedResourceInstance((RefinedStructuredResourceInstance)null);
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
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return componentInstance != null;
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__INIT_COMMANDS:
				return initCommands != null && !initCommands.isEmpty();
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__GEN_PORT_INSTANCES:
				return genPortInstances != null && !genPortInstances.isEmpty();
			case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__ALLOCATED_RESOURCE_INSTANCE:
				return allocatedResourceInstance != null;
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
		if (baseClass == GenComponentInstance.class) {
			switch (derivedFeatureID) {
				case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_INSTANCE: return CodegenPackage.GEN_COMPONENT_INSTANCE__COMPONENT_INSTANCE;
				case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__INIT_COMMANDS: return CodegenPackage.GEN_COMPONENT_INSTANCE__INIT_COMMANDS;
				case CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__GEN_PORT_INSTANCES: return CodegenPackage.GEN_COMPONENT_INSTANCE__GEN_PORT_INSTANCES;
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
		if (baseClass == GenComponentInstance.class) {
			switch (baseFeatureID) {
				case CodegenPackage.GEN_COMPONENT_INSTANCE__COMPONENT_INSTANCE: return CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__COMPONENT_INSTANCE;
				case CodegenPackage.GEN_COMPONENT_INSTANCE__INIT_COMMANDS: return CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__INIT_COMMANDS;
				case CodegenPackage.GEN_COMPONENT_INSTANCE__GEN_PORT_INSTANCES: return CodegenPackage.REFINED_ATOMIC_COMPONENT_INSTANCE__GEN_PORT_INSTANCES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RefinedAtomicComponentInstanceImpl
