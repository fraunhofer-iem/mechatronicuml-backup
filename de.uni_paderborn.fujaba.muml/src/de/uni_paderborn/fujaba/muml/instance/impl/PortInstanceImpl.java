/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.connector.impl.ConnectorEndpointInstanceImpl;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.instance.PortConnectorInstance;
import de.uni_paderborn.fujaba.muml.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.impl.PortInstanceImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.impl.PortInstanceImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.impl.PortInstanceImpl#getPortConnectorInstances <em>Port Connector Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PortInstanceImpl extends ConnectorEndpointInstanceImpl implements PortInstance {
	/**
	 * The cached setting delegate for the '{@link #getPortType() <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getPortConnectorInstances() <em>Port Connector Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConnectorInstances()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_CONNECTOR_INSTANCES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.PORT_INSTANCE__PORT_CONNECTOR_INSTANCES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PortInstanceImpl() {
		super();

//		// Install a notification adapter that informs the
//		// requiredMessageInterfaceDerived-reference, whenever one of the dependent
//		// features
//		// was modified
//		DerivedAttributeAdapter requiredMessageInterfaceDerived = new DerivedAttributeAdapter(
//				this,
//				InstancePackage.Literals.PORT_INSTANCE__SENDER_MESSAGE_INTERFACE);
//		requiredMessageInterfaceDerived.addNavigatedDependency(
//				InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE,
//				ComponentPackage.Literals.PORT__SENDER_MESSAGE_INTERFACE);
//
//		// Install a notification adapter that informs the
//		// providedMessageInterfaceDerived-reference, whenever one of the dependent
//		// features
//		// was modified
//		DerivedAttributeAdapter providedMessageInterfaceDerived = new DerivedAttributeAdapter(
//				this,
//				InstancePackage.Literals.PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE);
//		providedMessageInterfaceDerived.addNavigatedDependency(
//				InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE,
//				ComponentPackage.Literals.PORT__RECEIVER_MESSAGE_INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPortType() {
		return (Port)PORT_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPortType() {
		return (Port)PORT_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		if (eContainerFeatureID() != InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE) return null;
		return (ComponentInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstance(ComponentInstance newComponentInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentInstance, InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		if (newComponentInstance != eInternalContainer() || (eContainerFeatureID() != InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE && newComponentInstance != null)) {
			if (EcoreUtil.isAncestor(this, newComponentInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentInstance != null)
				msgs = ((InternalEObject)newComponentInstance).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES, ComponentInstance.class, msgs);
			msgs = basicSetComponentInstance(newComponentInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE, newComponentInstance, newComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PortConnectorInstance> getPortConnectorInstances() {
		return (EList<PortConnectorInstance>)PORT_CONNECTOR_INSTANCES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponentInstance((ComponentInstance)otherEnd, msgs);
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
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return basicSetComponentInstance(null, msgs);
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
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return eInternalContainer().eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES, ComponentInstance.class, msgs);
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
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
				if (resolve) return getPortType();
				return basicGetPortType();
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return getComponentInstance();
			case InstancePackage.PORT_INSTANCE__PORT_CONNECTOR_INSTANCES:
				return getPortConnectorInstances();
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
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
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
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
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
			case InstancePackage.PORT_INSTANCE__PORT_TYPE:
				return PORT_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.PORT_INSTANCE__COMPONENT_INSTANCE:
				return getComponentInstance() != null;
			case InstancePackage.PORT_INSTANCE__PORT_CONNECTOR_INSTANCES:
				return PORT_CONNECTOR_INSTANCES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //PortInstanceImpl
