/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component.impl;

import de.uni_paderborn.fujaba.umlrt.model.component.BehavioralConnector;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;

import de.uni_paderborn.fujaba.umlrt.model.core.impl.BehavioralElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.impl.BehavioralConnectorImpl#getConnectorClass <em>Connector Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehavioralConnectorImpl extends BehavioralElementImpl implements BehavioralConnector {
	/**
	 * The cached value of the '{@link #getConnectorClass() <em>Connector Class</em>}' reference.
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
		if (connectorClass != null && connectorClass.eIsProxy()) {
			InternalEObject oldConnectorClass = (InternalEObject)connectorClass;
			connectorClass = (EClass)eResolveProxy(oldConnectorClass);
			if (connectorClass != oldConnectorClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS, oldConnectorClass, connectorClass));
			}
		}
		return connectorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetConnectorClass() {
		return connectorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorClass(EClass newConnectorClass) {
		EClass oldConnectorClass = connectorClass;
		connectorClass = newConnectorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS, oldConnectorClass, connectorClass));
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
				if (resolve) return getConnectorClass();
				return basicGetConnectorClass();
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
