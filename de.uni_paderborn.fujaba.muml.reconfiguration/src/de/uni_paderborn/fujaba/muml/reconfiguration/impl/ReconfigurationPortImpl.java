/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.Port;
import de.uni_paderborn.fujaba.muml.component.PortConnector;
import de.uni_paderborn.fujaba.muml.connector.impl.DiscreteInteractionEndpointImpl;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort;
import de.uni_paderborn.fujaba.muml.types.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl#getPortConnectors <em>Port Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReconfigurationPortImpl extends DiscreteInteractionEndpointImpl implements ReconfigurationPort {
	/**
	 * The cached setting delegate for the '{@link #getPortConnectors() <em>Port Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConnectors()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORT_CONNECTORS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.PORT__PORT_CONNECTORS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURATION_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (eContainerFeatureID() != ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT) return null;
		return (Component)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, ComponentPackage.COMPONENT__PORTS, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PortConnector> getPortConnectors() {
		return (EList<PortConnector>)PORT_CONNECTORS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((Component)otherEnd, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT:
				return eInternalContainer().eInverseRemove(this, ComponentPackage.COMPONENT__PORTS, Component.class, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT:
				return getComponent();
			case ReconfigurationPackage.RECONFIGURATION_PORT__PORT_CONNECTORS:
				return getPortConnectors();
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT:
				setComponent((Component)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT:
				setComponent((Component)null);
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT:
				return getComponent() != null;
			case ReconfigurationPackage.RECONFIGURATION_PORT__PORT_CONNECTORS:
				return PORT_CONNECTORS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Port.class) {
			switch (derivedFeatureID) {
				case ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT: return ComponentPackage.PORT__COMPONENT;
				case ReconfigurationPackage.RECONFIGURATION_PORT__PORT_CONNECTORS: return ComponentPackage.PORT__PORT_CONNECTORS;
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
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Port.class) {
			switch (baseFeatureID) {
				case ComponentPackage.PORT__COMPONENT: return ReconfigurationPackage.RECONFIGURATION_PORT__COMPONENT;
				case ComponentPackage.PORT__PORT_CONNECTORS: return ReconfigurationPackage.RECONFIGURATION_PORT__PORT_CONNECTORS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReconfigurationPortImpl
