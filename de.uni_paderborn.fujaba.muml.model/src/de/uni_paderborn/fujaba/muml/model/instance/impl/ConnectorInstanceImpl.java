/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getConnectorType <em>Connector Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectorInstanceImpl extends ExtendableElementImpl implements ConnectorInstance {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PortInstance source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected PortInstance target;

	/**
	 * The cached value of the '{@link #getConnectorType() <em>Connector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorType()
	 * @generated
	 * @ordered
	 */
	protected ConnectorType connectorType;

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
	public PortInstance getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (PortInstance)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(PortInstance newSource, NotificationChain msgs) {
		PortInstance oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PortInstance newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (PortInstance)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(PortInstance newTarget, NotificationChain msgs) {
		PortInstance oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(PortInstance newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getConnectorType() {
		if (connectorType != null && connectorType.eIsProxy()) {
			InternalEObject oldConnectorType = (InternalEObject)connectorType;
			connectorType = (ConnectorType)eResolveProxy(oldConnectorType);
			if (connectorType != oldConnectorType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE, oldConnectorType, connectorType));
			}
		}
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType basicGetConnectorType() {
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorType(ConnectorType newConnectorType) {
		ConnectorType oldConnectorType = connectorType;
		connectorType = newConnectorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE, oldConnectorType, connectorType));
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
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
				return basicSetSource((PortInstance)otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
				return basicSetTarget((PortInstance)otherEnd, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				return basicSetSource(null, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				return basicSetTarget(null, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE:
				if (resolve) return getConnectorType();
				return basicGetConnectorType();
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
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				setSource((PortInstance)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				setTarget((PortInstance)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE:
				setConnectorType((ConnectorType)newValue);
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
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				setSource((PortInstance)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				setTarget((PortInstance)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE:
				setConnectorType((ConnectorType)null);
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
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				return source != null;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				return target != null;
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE:
				return connectorType != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorInstanceImpl
