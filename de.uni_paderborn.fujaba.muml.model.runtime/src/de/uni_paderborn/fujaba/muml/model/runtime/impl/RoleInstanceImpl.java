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

import de.uni_paderborn.fujaba.muml.model.pattern.Role;
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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RoleInstanceImpl#getConnector <em>Connector</em>}</li>
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
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected RuntimeRoleAssembly connector;

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
	public RuntimeRoleAssembly getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject)connector;
			connector = (RuntimeRoleAssembly)eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.ROLE_INSTANCE__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeRoleAssembly basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(RuntimeRoleAssembly newConnector, NotificationChain msgs) {
		RuntimeRoleAssembly oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.ROLE_INSTANCE__CONNECTOR, oldConnector, newConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(RuntimeRoleAssembly newConnector) {
		if (newConnector != connector) {
			NotificationChain msgs = null;
			if (connector != null)
				msgs = ((InternalEObject)connector).eInverseRemove(this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES, RuntimeRoleAssembly.class, msgs);
			if (newConnector != null)
				msgs = ((InternalEObject)newConnector).eInverseAdd(this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES, RuntimeRoleAssembly.class, msgs);
			msgs = basicSetConnector(newConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.ROLE_INSTANCE__CONNECTOR, newConnector, newConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.ROLE_INSTANCE__CONNECTOR:
				if (connector != null)
					msgs = ((InternalEObject)connector).eInverseRemove(this, RuntimePackage.RUNTIME_ROLE_ASSEMBLY__ROLE_INSTANCES, RuntimeRoleAssembly.class, msgs);
				return basicSetConnector((RuntimeRoleAssembly)otherEnd, msgs);
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
			case RuntimePackage.ROLE_INSTANCE__CONNECTOR:
				return basicSetConnector(null, msgs);
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
			case RuntimePackage.ROLE_INSTANCE__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
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
			case RuntimePackage.ROLE_INSTANCE__CONNECTOR:
				setConnector((RuntimeRoleAssembly)newValue);
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
			case RuntimePackage.ROLE_INSTANCE__CONNECTOR:
				setConnector((RuntimeRoleAssembly)null);
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
			case RuntimePackage.ROLE_INSTANCE__CONNECTOR:
				return connector != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleInstanceImpl
