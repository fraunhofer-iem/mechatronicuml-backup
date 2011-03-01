/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance.impl;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import de.uni_paderborn.fujaba.umlrt.model.component.impl.BehavioralConnectorImpl;

import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl#getToComponentI <em>To Component I</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl#getFromComponentI <em>From Component I</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl#getToPort <em>To Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ConnectorInstanceImpl#getFromPort <em>From Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorInstanceImpl extends BehavioralConnectorImpl implements ConnectorInstance {
	/**
	 * The cached value of the '{@link #getToComponentI() <em>To Component I</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToComponentI()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance toComponentI;

	/**
	 * The cached value of the '{@link #getFromComponentI() <em>From Component I</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromComponentI()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance fromComponentI;

	/**
	 * The cached value of the '{@link #getToPort() <em>To Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected Port toPort;

	/**
	 * The cached value of the '{@link #getFromPort() <em>From Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected Port fromPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.CONNECTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getToComponentI() {
		if (toComponentI != null && toComponentI.eIsProxy()) {
			InternalEObject oldToComponentI = (InternalEObject)toComponentI;
			toComponentI = (ComponentInstance)eResolveProxy(oldToComponentI);
			if (toComponentI != oldToComponentI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__TO_COMPONENT_I, oldToComponentI, toComponentI));
			}
		}
		return toComponentI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetToComponentI() {
		return toComponentI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToComponentI(ComponentInstance newToComponentI, NotificationChain msgs) {
		ComponentInstance oldToComponentI = toComponentI;
		toComponentI = newToComponentI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__TO_COMPONENT_I, oldToComponentI, newToComponentI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToComponentI(ComponentInstance newToComponentI) {
		if (newToComponentI != toComponentI) {
			NotificationChain msgs = null;
			if (toComponentI != null)
				msgs = ((InternalEObject)toComponentI).eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__TO_REF, ComponentInstance.class, msgs);
			if (newToComponentI != null)
				msgs = ((InternalEObject)newToComponentI).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE__TO_REF, ComponentInstance.class, msgs);
			msgs = basicSetToComponentI(newToComponentI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__TO_COMPONENT_I, newToComponentI, newToComponentI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getFromComponentI() {
		if (fromComponentI != null && fromComponentI.eIsProxy()) {
			InternalEObject oldFromComponentI = (InternalEObject)fromComponentI;
			fromComponentI = (ComponentInstance)eResolveProxy(oldFromComponentI);
			if (fromComponentI != oldFromComponentI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__FROM_COMPONENT_I, oldFromComponentI, fromComponentI));
			}
		}
		return fromComponentI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetFromComponentI() {
		return fromComponentI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromComponentI(ComponentInstance newFromComponentI, NotificationChain msgs) {
		ComponentInstance oldFromComponentI = fromComponentI;
		fromComponentI = newFromComponentI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__FROM_COMPONENT_I, oldFromComponentI, newFromComponentI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromComponentI(ComponentInstance newFromComponentI) {
		if (newFromComponentI != fromComponentI) {
			NotificationChain msgs = null;
			if (fromComponentI != null)
				msgs = ((InternalEObject)fromComponentI).eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__FROM_REF, ComponentInstance.class, msgs);
			if (newFromComponentI != null)
				msgs = ((InternalEObject)newFromComponentI).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE__FROM_REF, ComponentInstance.class, msgs);
			msgs = basicSetFromComponentI(newFromComponentI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__FROM_COMPONENT_I, newFromComponentI, newFromComponentI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getToPort() {
		if (toPort != null && toPort.eIsProxy()) {
			InternalEObject oldToPort = (InternalEObject)toPort;
			toPort = (Port)eResolveProxy(oldToPort);
			if (toPort != oldToPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__TO_PORT, oldToPort, toPort));
			}
		}
		return toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetToPort() {
		return toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPort(Port newToPort) {
		Port oldToPort = toPort;
		toPort = newToPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__TO_PORT, oldToPort, toPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getFromPort() {
		if (fromPort != null && fromPort.eIsProxy()) {
			InternalEObject oldFromPort = (InternalEObject)fromPort;
			fromPort = (Port)eResolveProxy(oldFromPort);
			if (fromPort != oldFromPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__FROM_PORT, oldFromPort, fromPort));
			}
		}
		return fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetFromPort() {
		return fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPort(Port newFromPort) {
		Port oldFromPort = fromPort;
		fromPort = newFromPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__FROM_PORT, oldFromPort, fromPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.CONNECTOR_INSTANCE__TO_COMPONENT_I:
				if (toComponentI != null)
					msgs = ((InternalEObject)toComponentI).eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__TO_REF, ComponentInstance.class, msgs);
				return basicSetToComponentI((ComponentInstance)otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__FROM_COMPONENT_I:
				if (fromComponentI != null)
					msgs = ((InternalEObject)fromComponentI).eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__FROM_REF, ComponentInstance.class, msgs);
				return basicSetFromComponentI((ComponentInstance)otherEnd, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__TO_COMPONENT_I:
				return basicSetToComponentI(null, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__FROM_COMPONENT_I:
				return basicSetFromComponentI(null, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__TO_COMPONENT_I:
				if (resolve) return getToComponentI();
				return basicGetToComponentI();
			case InstancePackage.CONNECTOR_INSTANCE__FROM_COMPONENT_I:
				if (resolve) return getFromComponentI();
				return basicGetFromComponentI();
			case InstancePackage.CONNECTOR_INSTANCE__TO_PORT:
				if (resolve) return getToPort();
				return basicGetToPort();
			case InstancePackage.CONNECTOR_INSTANCE__FROM_PORT:
				if (resolve) return getFromPort();
				return basicGetFromPort();
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
			case InstancePackage.CONNECTOR_INSTANCE__TO_COMPONENT_I:
				setToComponentI((ComponentInstance)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__FROM_COMPONENT_I:
				setFromComponentI((ComponentInstance)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__TO_PORT:
				setToPort((Port)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__FROM_PORT:
				setFromPort((Port)newValue);
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
			case InstancePackage.CONNECTOR_INSTANCE__TO_COMPONENT_I:
				setToComponentI((ComponentInstance)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__FROM_COMPONENT_I:
				setFromComponentI((ComponentInstance)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__TO_PORT:
				setToPort((Port)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__FROM_PORT:
				setFromPort((Port)null);
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
			case InstancePackage.CONNECTOR_INSTANCE__TO_COMPONENT_I:
				return toComponentI != null;
			case InstancePackage.CONNECTOR_INSTANCE__FROM_COMPONENT_I:
				return fromComponentI != null;
			case InstancePackage.CONNECTOR_INSTANCE__TO_PORT:
				return toPort != null;
			case InstancePackage.CONNECTOR_INSTANCE__FROM_PORT:
				return fromPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorInstanceImpl
