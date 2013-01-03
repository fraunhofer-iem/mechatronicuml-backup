/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.connector.impl;

import de.uni_paderborn.fujaba.muml.model.connector.ConnectorPackage;
import de.uni_paderborn.fujaba.muml.model.connector.DiscreteMultiInteractionEndpointInstance;
import de.uni_paderborn.fujaba.muml.model.connector.DiscreteSingleInteractionEndpointInstance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Single Interaction Endpoint Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiscreteSingleInteractionEndpointInstanceImpl extends DiscreteInteractionEndpointInstanceImpl implements DiscreteSingleInteractionEndpointInstance {
	/**
	 * The cached value of the '{@link #getMultiInteractionEndpointInstance() <em>Multi Interaction Endpoint Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiInteractionEndpointInstance()
	 * @generated
	 * @ordered
	 */
	protected DiscreteMultiInteractionEndpointInstance multiInteractionEndpointInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteSingleInteractionEndpointInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectorPackage.Literals.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteMultiInteractionEndpointInstance getMultiInteractionEndpointInstance() {
		if (multiInteractionEndpointInstance != null && multiInteractionEndpointInstance.eIsProxy()) {
			InternalEObject oldMultiInteractionEndpointInstance = (InternalEObject)multiInteractionEndpointInstance;
			multiInteractionEndpointInstance = (DiscreteMultiInteractionEndpointInstance)eResolveProxy(oldMultiInteractionEndpointInstance);
			if (multiInteractionEndpointInstance != oldMultiInteractionEndpointInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE, oldMultiInteractionEndpointInstance, multiInteractionEndpointInstance));
			}
		}
		return multiInteractionEndpointInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteMultiInteractionEndpointInstance basicGetMultiInteractionEndpointInstance() {
		return multiInteractionEndpointInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance newMultiInteractionEndpointInstance, NotificationChain msgs) {
		DiscreteMultiInteractionEndpointInstance oldMultiInteractionEndpointInstance = multiInteractionEndpointInstance;
		multiInteractionEndpointInstance = newMultiInteractionEndpointInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE, oldMultiInteractionEndpointInstance, newMultiInteractionEndpointInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiInteractionEndpointInstance(DiscreteMultiInteractionEndpointInstance newMultiInteractionEndpointInstance) {
		if (newMultiInteractionEndpointInstance != multiInteractionEndpointInstance) {
			NotificationChain msgs = null;
			if (multiInteractionEndpointInstance != null)
				msgs = ((InternalEObject)multiInteractionEndpointInstance).eInverseRemove(this, ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES, DiscreteMultiInteractionEndpointInstance.class, msgs);
			if (newMultiInteractionEndpointInstance != null)
				msgs = ((InternalEObject)newMultiInteractionEndpointInstance).eInverseAdd(this, ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES, DiscreteMultiInteractionEndpointInstance.class, msgs);
			msgs = basicSetMultiInteractionEndpointInstance(newMultiInteractionEndpointInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE, newMultiInteractionEndpointInstance, newMultiInteractionEndpointInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE:
				if (multiInteractionEndpointInstance != null)
					msgs = ((InternalEObject)multiInteractionEndpointInstance).eInverseRemove(this, ConnectorPackage.DISCRETE_MULTI_INTERACTION_ENDPOINT_INSTANCE__SUB_INTERACTION_ENDPOINT_INSTANCES, DiscreteMultiInteractionEndpointInstance.class, msgs);
				return basicSetMultiInteractionEndpointInstance((DiscreteMultiInteractionEndpointInstance)otherEnd, msgs);
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE:
				return basicSetMultiInteractionEndpointInstance(null, msgs);
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE:
				if (resolve) return getMultiInteractionEndpointInstance();
				return basicGetMultiInteractionEndpointInstance();
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE:
				setMultiInteractionEndpointInstance((DiscreteMultiInteractionEndpointInstance)newValue);
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE:
				setMultiInteractionEndpointInstance((DiscreteMultiInteractionEndpointInstance)null);
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__MULTI_INTERACTION_ENDPOINT_INSTANCE:
				return multiInteractionEndpointInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //DiscreteSingleInteractionEndpointInstanceImpl
