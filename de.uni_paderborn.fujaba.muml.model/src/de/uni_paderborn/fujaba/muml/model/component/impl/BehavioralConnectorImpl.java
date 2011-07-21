/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.component.BehavioralConnector;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.core.impl.BehavioralElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.BehavioralConnectorImpl#getConnectorClass <em>Connector Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioralConnectorImpl extends BehavioralElementImpl implements BehavioralConnector {
	/**
	 * The cached value of the '{@link #getConnectorClass() <em>Connector Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorClass()
	 * @generated
	 * @ordered
	 */
	protected EClass connectorClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.BEHAVIORAL_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorClass() {
		return connectorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorClass(EClass newConnectorClass, NotificationChain msgs) {
		EClass oldConnectorClass = connectorClass;
		connectorClass = newConnectorClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS, oldConnectorClass, newConnectorClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorClass(EClass newConnectorClass) {
		if (newConnectorClass != connectorClass) {
			NotificationChain msgs = null;
			if (connectorClass != null)
				msgs = ((InternalEObject)connectorClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS, null, msgs);
			if (newConnectorClass != null)
				msgs = ((InternalEObject)newConnectorClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS, null, msgs);
			msgs = basicSetConnectorClass(newConnectorClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS, newConnectorClass, newConnectorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS:
				return basicSetConnectorClass(null, msgs);
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
			case ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS:
				return getConnectorClass();
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
			case ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS:
				setConnectorClass((EClass)newValue);
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
			case ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS:
				setConnectorClass((EClass)null);
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
			case ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS:
				return connectorClass != null;
		}
		return super.eIsSet(featureID);
	}

} //BehavioralConnectorImpl
