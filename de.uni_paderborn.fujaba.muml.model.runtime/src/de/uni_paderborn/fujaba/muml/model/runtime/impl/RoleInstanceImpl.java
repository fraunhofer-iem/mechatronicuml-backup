/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.protocol.Role;
import de.uni_paderborn.fujaba.muml.model.runtime.RoleInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeRoleAssembly;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RoleInstanceImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RoleInstanceImpl#getAssembly <em>Assembly</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoleInstanceImpl extends RuntimeBehavioralElementImpl implements RoleInstance {
	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected Role instanceOf;

	/**
	 * The cached value of the '{@link #getAssembly() <em>Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembly()
	 * @generated
	 * @ordered
	 */
	protected RuntimeRoleAssembly assembly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.ROLE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject)instanceOf;
			instanceOf = (Role)eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.ROLE_INSTANCE__INSTANCE_OF, oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOf(Role newInstanceOf) {
		Role oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.ROLE_INSTANCE__INSTANCE_OF, oldInstanceOf, instanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeRoleAssembly getAssembly() {
		if (assembly != null && assembly.eIsProxy()) {
			InternalEObject oldAssembly = (InternalEObject)assembly;
			assembly = (RuntimeRoleAssembly)eResolveProxy(oldAssembly);
			if (assembly != oldAssembly) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.ROLE_INSTANCE__ASSEMBLY, oldAssembly, assembly));
			}
		}
		return assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeRoleAssembly basicGetAssembly() {
		return assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssembly(RuntimeRoleAssembly newAssembly, NotificationChain msgs) {
		RuntimeRoleAssembly oldAssembly = assembly;
		assembly = newAssembly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.ROLE_INSTANCE__ASSEMBLY, oldAssembly, newAssembly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssembly(RuntimeRoleAssembly newAssembly) {
		if (newAssembly != assembly) {
			NotificationChain msgs = null;
			if (assembly != null)
				msgs = ((InternalEObject)assembly).eInverseRemove(this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES, RuntimeRoleAssembly.class, msgs);
			if (newAssembly != null)
				msgs = ((InternalEObject)newAssembly).eInverseAdd(this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES, RuntimeRoleAssembly.class, msgs);
			msgs = basicSetAssembly(newAssembly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.ROLE_INSTANCE__ASSEMBLY, newAssembly, newAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.ROLE_INSTANCE__ASSEMBLY:
				if (assembly != null)
					msgs = ((InternalEObject)assembly).eInverseRemove(this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES, RuntimeRoleAssembly.class, msgs);
				return basicSetAssembly((RuntimeRoleAssembly)otherEnd, msgs);
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
			case RuntimePackage.ROLE_INSTANCE__ASSEMBLY:
				return basicSetAssembly(null, msgs);
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
			case RuntimePackage.ROLE_INSTANCE__INSTANCE_OF:
				if (resolve) return getInstanceOf();
				return basicGetInstanceOf();
			case RuntimePackage.ROLE_INSTANCE__ASSEMBLY:
				if (resolve) return getAssembly();
				return basicGetAssembly();
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
			case RuntimePackage.ROLE_INSTANCE__INSTANCE_OF:
				setInstanceOf((Role)newValue);
				return;
			case RuntimePackage.ROLE_INSTANCE__ASSEMBLY:
				setAssembly((RuntimeRoleAssembly)newValue);
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
			case RuntimePackage.ROLE_INSTANCE__INSTANCE_OF:
				setInstanceOf((Role)null);
				return;
			case RuntimePackage.ROLE_INSTANCE__ASSEMBLY:
				setAssembly((RuntimeRoleAssembly)null);
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
			case RuntimePackage.ROLE_INSTANCE__INSTANCE_OF:
				return instanceOf != null;
			case RuntimePackage.ROLE_INSTANCE__ASSEMBLY:
				return assembly != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleInstanceImpl
