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
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.model.instance.DiscreteMultiPortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.DiscreteSinglePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Single Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscreteSinglePortInstanceImpl#getMultiPortInstance <em>Multi Port Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscreteSinglePortInstanceImpl extends DiscretePortInstanceImpl implements DiscreteSinglePortInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteSinglePortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.DISCRETE_SINGLE_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteMultiPortInstance getMultiPortInstance() {
		if (eContainerFeatureID() != InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE) return null;
		return (DiscreteMultiPortInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPortInstance(DiscreteMultiPortInstance newMultiPortInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMultiPortInstance, InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPortInstance(DiscreteMultiPortInstance newMultiPortInstance) {
		if (newMultiPortInstance != eInternalContainer() || (eContainerFeatureID() != InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE && newMultiPortInstance != null)) {
			if (EcoreUtil.isAncestor(this, newMultiPortInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMultiPortInstance != null)
				msgs = ((InternalEObject)newMultiPortInstance).eInverseAdd(this, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES, DiscreteMultiPortInstance.class, msgs);
			msgs = basicSetMultiPortInstance(newMultiPortInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE, newMultiPortInstance, newMultiPortInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMultiPortInstance((DiscreteMultiPortInstance)otherEnd, msgs);
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
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE:
				return basicSetMultiPortInstance(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE:
				return eInternalContainer().eInverseRemove(this, InstancePackage.DISCRETE_MULTI_PORT_INSTANCE__SUB_PORT_INSTANCES, DiscreteMultiPortInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE:
				return getMultiPortInstance();
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
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE:
				setMultiPortInstance((DiscreteMultiPortInstance)newValue);
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
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE:
				setMultiPortInstance((DiscreteMultiPortInstance)null);
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
			case InstancePackage.DISCRETE_SINGLE_PORT_INSTANCE__MULTI_PORT_INSTANCE:
				return getMultiPortInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //DiscreteSinglePortInstanceImpl
