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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.expressions.Expression;
import org.muml.pim.instance.ComponentInstance;
import org.muml.psm.codegen.CodegenPackage;
import org.muml.psm.codegen.GenComponentInstance;
import org.muml.psm.codegen.GenPortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.codegen.impl.GenComponentInstanceImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.GenComponentInstanceImpl#getInitCommands <em>Init Commands</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.GenComponentInstanceImpl#getGenPortInstances <em>Gen Port Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenComponentInstanceImpl extends MinimalEObjectImpl.Container implements GenComponentInstance {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.GEN_COMPONENT_INSTANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.GEN_COMPONENT_INSTANCE__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.GEN_COMPONENT_INSTANCE__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getInitCommands() {
		if (initCommands == null) {
			initCommands = new EObjectResolvingEList<Expression>(Expression.class, this, CodegenPackage.GEN_COMPONENT_INSTANCE__INIT_COMMANDS);
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
			genPortInstances = new EObjectContainmentEList<GenPortInstance>(GenPortInstance.class, this, CodegenPackage.GEN_COMPONENT_INSTANCE__GEN_PORT_INSTANCES);
		}
		return genPortInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.GEN_COMPONENT_INSTANCE__GEN_PORT_INSTANCES:
				return ((InternalEList<?>)getGenPortInstances()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.GEN_COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				if (resolve) return getComponentInstance();
				return basicGetComponentInstance();
			case CodegenPackage.GEN_COMPONENT_INSTANCE__INIT_COMMANDS:
				return getInitCommands();
			case CodegenPackage.GEN_COMPONENT_INSTANCE__GEN_PORT_INSTANCES:
				return getGenPortInstances();
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
			case CodegenPackage.GEN_COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
				return;
			case CodegenPackage.GEN_COMPONENT_INSTANCE__INIT_COMMANDS:
				getInitCommands().clear();
				getInitCommands().addAll((Collection<? extends Expression>)newValue);
				return;
			case CodegenPackage.GEN_COMPONENT_INSTANCE__GEN_PORT_INSTANCES:
				getGenPortInstances().clear();
				getGenPortInstances().addAll((Collection<? extends GenPortInstance>)newValue);
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
			case CodegenPackage.GEN_COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
				return;
			case CodegenPackage.GEN_COMPONENT_INSTANCE__INIT_COMMANDS:
				getInitCommands().clear();
				return;
			case CodegenPackage.GEN_COMPONENT_INSTANCE__GEN_PORT_INSTANCES:
				getGenPortInstances().clear();
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
			case CodegenPackage.GEN_COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return componentInstance != null;
			case CodegenPackage.GEN_COMPONENT_INSTANCE__INIT_COMMANDS:
				return initCommands != null && !initCommands.isEmpty();
			case CodegenPackage.GEN_COMPONENT_INSTANCE__GEN_PORT_INSTANCES:
				return genPortInstances != null && !genPortInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenComponentInstanceImpl
