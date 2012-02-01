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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.modeling.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.component.ContinuousPort;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getFromPort <em>From Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getToPort <em>To Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getToDiscretePort <em>To Discrete Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getFromDiscretePort <em>From Discrete Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getToContinuousPort <em>To Continuous Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getFromContinuousPort <em>From Continuous Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectorTypeImpl extends ExtendableElementImpl implements ConnectorType {
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
	 * The cached value of the '{@link #getToPort() <em>To Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected Port toPort;

	/**
	 * The cached setting delegate for the '{@link #getToDiscretePort() <em>To Discrete Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDiscretePort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TO_DISCRETE_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.CONNECTOR_TYPE__TO_DISCRETE_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getFromDiscretePort() <em>From Discrete Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDiscretePort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FROM_DISCRETE_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.CONNECTOR_TYPE__FROM_DISCRETE_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getToContinuousPort() <em>To Continuous Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToContinuousPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TO_CONTINUOUS_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.CONNECTOR_TYPE__TO_CONTINUOUS_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getFromContinuousPort() <em>From Continuous Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromContinuousPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FROM_CONTINUOUS_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.CONNECTOR_TYPE__FROM_CONTINUOUS_PORT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.CONNECTOR_TYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.CONNECTOR_TYPE__FROM_PORT, oldFromPort, fromPort));
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
	public NotificationChain basicSetFromPort(Port newFromPort, NotificationChain msgs) {
		Port oldFromPort = fromPort;
		fromPort = newFromPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.CONNECTOR_TYPE__FROM_PORT, oldFromPort, newFromPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPort(Port newFromPort) {
		if (newFromPort != fromPort) {
			NotificationChain msgs = null;
			if (fromPort != null)
				msgs = ((InternalEObject)fromPort).eInverseRemove(this, ComponentPackage.PORT__OUTGOING_CONNECTORS, Port.class, msgs);
			if (newFromPort != null)
				msgs = ((InternalEObject)newFromPort).eInverseAdd(this, ComponentPackage.PORT__OUTGOING_CONNECTORS, Port.class, msgs);
			msgs = basicSetFromPort(newFromPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CONNECTOR_TYPE__FROM_PORT, newFromPort, newFromPort));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.CONNECTOR_TYPE__TO_PORT, oldToPort, toPort));
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
	public NotificationChain basicSetToPort(Port newToPort, NotificationChain msgs) {
		Port oldToPort = toPort;
		toPort = newToPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.CONNECTOR_TYPE__TO_PORT, oldToPort, newToPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPort(Port newToPort) {
		if (newToPort != toPort) {
			NotificationChain msgs = null;
			if (toPort != null)
				msgs = ((InternalEObject)toPort).eInverseRemove(this, ComponentPackage.PORT__INCOMING_CONNECTORS, Port.class, msgs);
			if (newToPort != null)
				msgs = ((InternalEObject)newToPort).eInverseAdd(this, ComponentPackage.PORT__INCOMING_CONNECTORS, Port.class, msgs);
			msgs = basicSetToPort(newToPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CONNECTOR_TYPE__TO_PORT, newToPort, newToPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredComponent getParentComponent() {
		if (eContainerFeatureID() != ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT) return null;
		return (StructuredComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentComponent(StructuredComponent newParentComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentComponent, ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponent(StructuredComponent newParentComponent) {
		if (newParentComponent != eInternalContainer() || (eContainerFeatureID() != ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT && newParentComponent != null)) {
			if (EcoreUtil.isAncestor(this, newParentComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentComponent != null)
				msgs = ((InternalEObject)newParentComponent).eInverseAdd(this, ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS, StructuredComponent.class, msgs);
			msgs = basicSetParentComponent(newParentComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT, newParentComponent, newParentComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscretePort getToDiscretePort() {
		return (DiscretePort)TO_DISCRETE_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscretePort basicGetToDiscretePort() {
		return (DiscretePort)TO_DISCRETE_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDiscretePort(DiscretePort newToDiscretePort) {
		TO_DISCRETE_PORT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newToDiscretePort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscretePort getFromDiscretePort() {
		return (DiscretePort)FROM_DISCRETE_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscretePort basicGetFromDiscretePort() {
		return (DiscretePort)FROM_DISCRETE_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDiscretePort(DiscretePort newFromDiscretePort) {
		FROM_DISCRETE_PORT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newFromDiscretePort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPort getToContinuousPort() {
		return (ContinuousPort)TO_CONTINUOUS_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPort basicGetToContinuousPort() {
		return (ContinuousPort)TO_CONTINUOUS_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToContinuousPort(ContinuousPort newToContinuousPort) {
		TO_CONTINUOUS_PORT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newToContinuousPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPort getFromContinuousPort() {
		return (ContinuousPort)FROM_CONTINUOUS_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPort basicGetFromContinuousPort() {
		return (ContinuousPort)FROM_CONTINUOUS_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromContinuousPort(ContinuousPort newFromContinuousPort) {
		FROM_CONTINUOUS_PORT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newFromContinuousPort);
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
			case ComponentPackage.CONNECTOR_TYPE__FROM_PORT:
				if (fromPort != null)
					msgs = ((InternalEObject)fromPort).eInverseRemove(this, ComponentPackage.PORT__OUTGOING_CONNECTORS, Port.class, msgs);
				return basicSetFromPort((Port)otherEnd, msgs);
			case ComponentPackage.CONNECTOR_TYPE__TO_PORT:
				if (toPort != null)
					msgs = ((InternalEObject)toPort).eInverseRemove(this, ComponentPackage.PORT__INCOMING_CONNECTORS, Port.class, msgs);
				return basicSetToPort((Port)otherEnd, msgs);
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentComponent((StructuredComponent)otherEnd, msgs);
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
			case ComponentPackage.CONNECTOR_TYPE__FROM_PORT:
				return basicSetFromPort(null, msgs);
			case ComponentPackage.CONNECTOR_TYPE__TO_PORT:
				return basicSetToPort(null, msgs);
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				return basicSetParentComponent(null, msgs);
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
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				return eInternalContainer().eInverseRemove(this, ComponentPackage.STRUCTURED_COMPONENT__CONNECTORS, StructuredComponent.class, msgs);
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
			case ComponentPackage.CONNECTOR_TYPE__FROM_PORT:
				if (resolve) return getFromPort();
				return basicGetFromPort();
			case ComponentPackage.CONNECTOR_TYPE__TO_PORT:
				if (resolve) return getToPort();
				return basicGetToPort();
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				return getParentComponent();
			case ComponentPackage.CONNECTOR_TYPE__TO_DISCRETE_PORT:
				if (resolve) return getToDiscretePort();
				return basicGetToDiscretePort();
			case ComponentPackage.CONNECTOR_TYPE__FROM_DISCRETE_PORT:
				if (resolve) return getFromDiscretePort();
				return basicGetFromDiscretePort();
			case ComponentPackage.CONNECTOR_TYPE__TO_CONTINUOUS_PORT:
				if (resolve) return getToContinuousPort();
				return basicGetToContinuousPort();
			case ComponentPackage.CONNECTOR_TYPE__FROM_CONTINUOUS_PORT:
				if (resolve) return getFromContinuousPort();
				return basicGetFromContinuousPort();
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
			case ComponentPackage.CONNECTOR_TYPE__FROM_PORT:
				setFromPort((Port)newValue);
				return;
			case ComponentPackage.CONNECTOR_TYPE__TO_PORT:
				setToPort((Port)newValue);
				return;
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				setParentComponent((StructuredComponent)newValue);
				return;
			case ComponentPackage.CONNECTOR_TYPE__TO_DISCRETE_PORT:
				setToDiscretePort((DiscretePort)newValue);
				return;
			case ComponentPackage.CONNECTOR_TYPE__FROM_DISCRETE_PORT:
				setFromDiscretePort((DiscretePort)newValue);
				return;
			case ComponentPackage.CONNECTOR_TYPE__TO_CONTINUOUS_PORT:
				setToContinuousPort((ContinuousPort)newValue);
				return;
			case ComponentPackage.CONNECTOR_TYPE__FROM_CONTINUOUS_PORT:
				setFromContinuousPort((ContinuousPort)newValue);
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
			case ComponentPackage.CONNECTOR_TYPE__FROM_PORT:
				setFromPort((Port)null);
				return;
			case ComponentPackage.CONNECTOR_TYPE__TO_PORT:
				setToPort((Port)null);
				return;
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				setParentComponent((StructuredComponent)null);
				return;
			case ComponentPackage.CONNECTOR_TYPE__TO_DISCRETE_PORT:
				setToDiscretePort((DiscretePort)null);
				return;
			case ComponentPackage.CONNECTOR_TYPE__FROM_DISCRETE_PORT:
				setFromDiscretePort((DiscretePort)null);
				return;
			case ComponentPackage.CONNECTOR_TYPE__TO_CONTINUOUS_PORT:
				setToContinuousPort((ContinuousPort)null);
				return;
			case ComponentPackage.CONNECTOR_TYPE__FROM_CONTINUOUS_PORT:
				setFromContinuousPort((ContinuousPort)null);
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
			case ComponentPackage.CONNECTOR_TYPE__FROM_PORT:
				return fromPort != null;
			case ComponentPackage.CONNECTOR_TYPE__TO_PORT:
				return toPort != null;
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				return getParentComponent() != null;
			case ComponentPackage.CONNECTOR_TYPE__TO_DISCRETE_PORT:
				return TO_DISCRETE_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.CONNECTOR_TYPE__FROM_DISCRETE_PORT:
				return FROM_DISCRETE_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.CONNECTOR_TYPE__TO_CONTINUOUS_PORT:
				return TO_CONTINUOUS_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.CONNECTOR_TYPE__FROM_CONTINUOUS_PORT:
				return FROM_CONTINUOUS_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ConnectorTypeImpl
