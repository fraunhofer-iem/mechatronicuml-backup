/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import de.uni_paderborn.fujaba.muml.model.pattern.RoleConnector;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CorePackage;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.Extension;

import de.uni_paderborn.fujaba.muml.model.pattern.impl.RoleConnectorImpl;
import de.uni_paderborn.fujaba.muml.model.runtime.MessageOnAssembly;
import de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeAssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeRoleAssemblyImpl#getRoleInstances <em>Role Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RuntimeRoleAssemblyImpl#getInstanceOf <em>Instance Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeRoleAssemblyImpl extends RuntimeAssemblyInstanceImpl implements RuntimeRoleAssembly {
	/**
	 * The cached value of the '{@link #getRoleInstances() <em>Role Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleInstance> roleInstances;

	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected RoleConnector instanceOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeRoleAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.RUNTIME_ROLE_ASSEMBLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleInstance> getRoleInstances() {
		if (roleInstances == null) {
			roleInstances = new EObjectWithInverseResolvingEList<RoleInstance>(RoleInstance.class, this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES, RuntimePackage.ROLE_INSTANCE__CONNECTOR);
		}
		return roleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject)instanceOf;
			instanceOf = (RoleConnector)eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__INSTANCE_OF, oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnector basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOf(RoleConnector newInstanceOf) {
		RoleConnector oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__INSTANCE_OF, oldInstanceOf, instanceOf));
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoleInstances()).basicAdd(otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				return ((InternalEList<?>)getRoleInstances()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				return getRoleInstances();
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__INSTANCE_OF:
				if (resolve) return getInstanceOf();
				return basicGetInstanceOf();
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				getRoleInstances().clear();
				getRoleInstances().addAll((Collection<? extends RoleInstance>)newValue);
				return;
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__INSTANCE_OF:
				setInstanceOf((RoleConnector)newValue);
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				getRoleInstances().clear();
				return;
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__INSTANCE_OF:
				setInstanceOf((RoleConnector)null);
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
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES:
				return roleInstances != null && !roleInstances.isEmpty();
			case RuntimePackage.RUNTIME_ROLE_ASSEMBLY__INSTANCE_OF:
				return instanceOf != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeRoleAssemblyImpl
