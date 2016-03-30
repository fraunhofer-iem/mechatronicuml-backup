/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteMultiInteractionEndpointInstance;
import org.muml.pim.connector.DiscreteSingleInteractionEndpointInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Single Interaction Endpoint Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl#getMultiInteractionEndpointInstance <em>Multi Interaction Endpoint Instance</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteSingleInteractionEndpointInstanceImpl#getLast <em>Last</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected DiscreteSingleInteractionEndpointInstance next;
	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected DiscreteSingleInteractionEndpointInstance previous;

	/**
	 * The cached setting delegate for the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FIRST__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ConnectorPackage.Literals.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__FIRST).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getLast() <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate LAST__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ConnectorPackage.Literals.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__LAST).getSettingDelegate();

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
	public DiscreteSingleInteractionEndpointInstance getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (DiscreteSingleInteractionEndpointInstance)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(DiscreteSingleInteractionEndpointInstance newNext, NotificationChain msgs) {
		DiscreteSingleInteractionEndpointInstance oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(DiscreteSingleInteractionEndpointInstance newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS, DiscreteSingleInteractionEndpointInstance.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS, DiscreteSingleInteractionEndpointInstance.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (DiscreteSingleInteractionEndpointInstance)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(DiscreteSingleInteractionEndpointInstance newPrevious, NotificationChain msgs) {
		DiscreteSingleInteractionEndpointInstance oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(DiscreteSingleInteractionEndpointInstance newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT, DiscreteSingleInteractionEndpointInstance.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT, DiscreteSingleInteractionEndpointInstance.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance getFirst() {
		return (DiscreteSingleInteractionEndpointInstance)FIRST__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance basicGetFirst() {
		return (DiscreteSingleInteractionEndpointInstance)FIRST__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance getLast() {
		return (DiscreteSingleInteractionEndpointInstance)LAST__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteSingleInteractionEndpointInstance basicGetLast() {
		return (DiscreteSingleInteractionEndpointInstance)LAST__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS, DiscreteSingleInteractionEndpointInstance.class, msgs);
				return basicSetNext((DiscreteSingleInteractionEndpointInstance)otherEnd, msgs);
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT, DiscreteSingleInteractionEndpointInstance.class, msgs);
				return basicSetPrevious((DiscreteSingleInteractionEndpointInstance)otherEnd, msgs);
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT:
				return basicSetNext(null, msgs);
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS:
				return basicSetPrevious(null, msgs);
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__LAST:
				if (resolve) return getLast();
				return basicGetLast();
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT:
				setNext((DiscreteSingleInteractionEndpointInstance)newValue);
				return;
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS:
				setPrevious((DiscreteSingleInteractionEndpointInstance)newValue);
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT:
				setNext((DiscreteSingleInteractionEndpointInstance)null);
				return;
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS:
				setPrevious((DiscreteSingleInteractionEndpointInstance)null);
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
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__NEXT:
				return next != null;
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__PREVIOUS:
				return previous != null;
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__FIRST:
				return FIRST__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ConnectorPackage.DISCRETE_SINGLE_INTERACTION_ENDPOINT_INSTANCE__LAST:
				return LAST__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //DiscreteSingleInteractionEndpointInstanceImpl
