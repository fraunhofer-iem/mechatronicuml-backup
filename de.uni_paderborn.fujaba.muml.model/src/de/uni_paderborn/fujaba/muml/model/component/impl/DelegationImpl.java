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

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.model.component.Delegation;
import de.uni_paderborn.fujaba.muml.model.instance.DelegationInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstanceFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DelegationImpl#getComponentPart <em>Component Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationImpl extends ConnectorTypeImpl implements Delegation {
	/**
	 * The cached value of the '{@link #getComponentPart() <em>Component Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPart()
	 * @generated
	 * @ordered
	 */
	protected ComponentPart componentPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.DELEGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart getComponentPart() {
		if (componentPart != null && componentPart.eIsProxy()) {
			InternalEObject oldComponentPart = (InternalEObject)componentPart;
			componentPart = (ComponentPart)eResolveProxy(oldComponentPart);
			if (componentPart != oldComponentPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DELEGATION__COMPONENT_PART, oldComponentPart, componentPart));
			}
		}
		return componentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart basicGetComponentPart() {
		return componentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentPart(ComponentPart newComponentPart, NotificationChain msgs) {
		ComponentPart oldComponentPart = componentPart;
		componentPart = newComponentPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.DELEGATION__COMPONENT_PART, oldComponentPart, newComponentPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentPart(ComponentPart newComponentPart) {
		if (newComponentPart != componentPart) {
			NotificationChain msgs = null;
			if (componentPart != null)
				msgs = ((InternalEObject)componentPart).eInverseRemove(this, ComponentPackage.COMPONENT_PART__DELEGATION, ComponentPart.class, msgs);
			if (newComponentPart != null)
				msgs = ((InternalEObject)newComponentPart).eInverseAdd(this, ComponentPackage.COMPONENT_PART__DELEGATION, ComponentPart.class, msgs);
			msgs = basicSetComponentPart(newComponentPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DELEGATION__COMPONENT_PART, newComponentPart, newComponentPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DelegationInstance createInstance() {
		DelegationInstance delegationInstance = InstanceFactory.eINSTANCE.createDelegationInstance();
		delegationInstance.setDelegationType(this);
		return delegationInstance;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.DELEGATION__COMPONENT_PART:
				if (componentPart != null)
					msgs = ((InternalEObject)componentPart).eInverseRemove(this, ComponentPackage.COMPONENT_PART__DELEGATION, ComponentPart.class, msgs);
				return basicSetComponentPart((ComponentPart)otherEnd, msgs);
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
			case ComponentPackage.DELEGATION__COMPONENT_PART:
				return basicSetComponentPart(null, msgs);
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
			case ComponentPackage.DELEGATION__COMPONENT_PART:
				if (resolve) return getComponentPart();
				return basicGetComponentPart();
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
			case ComponentPackage.DELEGATION__COMPONENT_PART:
				setComponentPart((ComponentPart)newValue);
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
			case ComponentPackage.DELEGATION__COMPONENT_PART:
				setComponentPart((ComponentPart)null);
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
			case ComponentPackage.DELEGATION__COMPONENT_PART:
				return componentPart != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationImpl
