/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import de.uni_paderborn.fujaba.muml.model.component.BehavioralConnector;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.ExtendableElementImpl;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getConnectorClass <em>Connector Class</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getFromPort <em>From Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getToPort <em>To Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.ConnectorTypeImpl#getParentComponent <em>Parent Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectorTypeImpl extends ExtendableElementImpl implements ConnectorType {
	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behavior;

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
	public EList<Behavior> getBehavior() {
		if (behavior == null) {
			behavior = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, ComponentPackage.CONNECTOR_TYPE__BEHAVIOR, CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT);
		}
		return behavior;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.CONNECTOR_TYPE__CONNECTOR_CLASS, oldConnectorClass, connectorClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.CONNECTOR_TYPE__CONNECTOR_CLASS, oldConnectorClass, connectorClass));
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.CONNECTOR_TYPE__BEHAVIOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehavior()).basicAdd(otherEnd, msgs);
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
			case ComponentPackage.CONNECTOR_TYPE__BEHAVIOR:
				return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
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
			case ComponentPackage.CONNECTOR_TYPE__BEHAVIOR:
				return getBehavior();
			case ComponentPackage.CONNECTOR_TYPE__CONNECTOR_CLASS:
				if (resolve) return getConnectorClass();
				return basicGetConnectorClass();
			case ComponentPackage.CONNECTOR_TYPE__FROM_PORT:
				if (resolve) return getFromPort();
				return basicGetFromPort();
			case ComponentPackage.CONNECTOR_TYPE__TO_PORT:
				if (resolve) return getToPort();
				return basicGetToPort();
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				return getParentComponent();
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
			case ComponentPackage.CONNECTOR_TYPE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case ComponentPackage.CONNECTOR_TYPE__CONNECTOR_CLASS:
				setConnectorClass((EClass)newValue);
				return;
			case ComponentPackage.CONNECTOR_TYPE__FROM_PORT:
				setFromPort((Port)newValue);
				return;
			case ComponentPackage.CONNECTOR_TYPE__TO_PORT:
				setToPort((Port)newValue);
				return;
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				setParentComponent((StructuredComponent)newValue);
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
			case ComponentPackage.CONNECTOR_TYPE__BEHAVIOR:
				getBehavior().clear();
				return;
			case ComponentPackage.CONNECTOR_TYPE__CONNECTOR_CLASS:
				setConnectorClass((EClass)null);
				return;
			case ComponentPackage.CONNECTOR_TYPE__FROM_PORT:
				setFromPort((Port)null);
				return;
			case ComponentPackage.CONNECTOR_TYPE__TO_PORT:
				setToPort((Port)null);
				return;
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				setParentComponent((StructuredComponent)null);
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
			case ComponentPackage.CONNECTOR_TYPE__BEHAVIOR:
				return behavior != null && !behavior.isEmpty();
			case ComponentPackage.CONNECTOR_TYPE__CONNECTOR_CLASS:
				return connectorClass != null;
			case ComponentPackage.CONNECTOR_TYPE__FROM_PORT:
				return fromPort != null;
			case ComponentPackage.CONNECTOR_TYPE__TO_PORT:
				return toPort != null;
			case ComponentPackage.CONNECTOR_TYPE__PARENT_COMPONENT:
				return getParentComponent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BehavioralElement.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.CONNECTOR_TYPE__BEHAVIOR: return CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == BehavioralConnector.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.CONNECTOR_TYPE__CONNECTOR_CLASS: return ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BehavioralElement.class) {
			switch (baseFeatureID) {
				case CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return ComponentPackage.CONNECTOR_TYPE__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == BehavioralConnector.class) {
			switch (baseFeatureID) {
				case ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS: return ComponentPackage.CONNECTOR_TYPE__CONNECTOR_CLASS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectorTypeImpl
