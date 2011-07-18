/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import de.uni_paderborn.fujaba.muml.model.component.BehavioralConnector;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
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
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.component.impl.BehavioralConnectorImpl;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getConnectorClass <em>Connector Class</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getParentComponentInstance <em>Parent Component Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getConnectorType <em>Connector Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorInstanceImpl extends ExtendableElementImpl implements ConnectorInstance {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PortInstance source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected PortInstance target;

	/**
	 * The cached value of the '{@link #getConnectorType() <em>Connector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorType()
	 * @generated
	 * @ordered
	 */
	protected ConnectorType connectorType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.CONNECTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehavior() {
		if (behavior == null) {
			behavior = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR, CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_CLASS, oldConnectorClass, connectorClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_CLASS, oldConnectorClass, connectorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (PortInstance)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(PortInstance newSource, NotificationChain msgs) {
		PortInstance oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PortInstance newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (PortInstance)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(PortInstance newTarget, NotificationChain msgs) {
		PortInstance oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(PortInstance newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getParentComponentInstance() {
		if (eContainerFeatureID() != InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE) return null;
		return (ComponentInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentComponentInstance(ComponentInstance newParentComponentInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentComponentInstance, InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponentInstance(ComponentInstance newParentComponentInstance) {
		if (newParentComponentInstance != eInternalContainer() || (eContainerFeatureID() != InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE && newParentComponentInstance != null)) {
			if (EcoreUtil.isAncestor(this, newParentComponentInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentComponentInstance != null)
				msgs = ((InternalEObject)newParentComponentInstance).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES, ComponentInstance.class, msgs);
			msgs = basicSetParentComponentInstance(newParentComponentInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE, newParentComponentInstance, newParentComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getConnectorType() {
		if (connectorType != null && connectorType.eIsProxy()) {
			InternalEObject oldConnectorType = (InternalEObject)connectorType;
			connectorType = (ConnectorType)eResolveProxy(oldConnectorType);
			if (connectorType != oldConnectorType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE, oldConnectorType, connectorType));
			}
		}
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType basicGetConnectorType() {
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorType(ConnectorType newConnectorType) {
		ConnectorType oldConnectorType = connectorType;
		connectorType = newConnectorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE, oldConnectorType, connectorType));
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehavior()).basicAdd(otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
				return basicSetSource((PortInstance)otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
				return basicSetTarget((PortInstance)otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentComponentInstance((ComponentInstance)otherEnd, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR:
				return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				return basicSetSource(null, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				return basicSetTarget(null, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				return basicSetParentComponentInstance(null, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				return eInternalContainer().eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__CONNECTOR_INSTANCES, ComponentInstance.class, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR:
				return getBehavior();
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_CLASS:
				if (resolve) return getConnectorClass();
				return basicGetConnectorClass();
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				return getParentComponentInstance();
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE:
				if (resolve) return getConnectorType();
				return basicGetConnectorType();
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_CLASS:
				setConnectorClass((EClass)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				setSource((PortInstance)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				setTarget((PortInstance)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				setParentComponentInstance((ComponentInstance)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE:
				setConnectorType((ConnectorType)newValue);
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR:
				getBehavior().clear();
				return;
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_CLASS:
				setConnectorClass((EClass)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				setSource((PortInstance)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				setTarget((PortInstance)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				setParentComponentInstance((ComponentInstance)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE:
				setConnectorType((ConnectorType)null);
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR:
				return behavior != null && !behavior.isEmpty();
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_CLASS:
				return connectorClass != null;
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				return source != null;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				return target != null;
			case InstancePackage.CONNECTOR_INSTANCE__PARENT_COMPONENT_INSTANCE:
				return getParentComponentInstance() != null;
			case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_TYPE:
				return connectorType != null;
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
				case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR: return CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == BehavioralConnector.class) {
			switch (derivedFeatureID) {
				case InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_CLASS: return ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS;
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
				case CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == BehavioralConnector.class) {
			switch (baseFeatureID) {
				case ComponentPackage.BEHAVIORAL_CONNECTOR__CONNECTOR_CLASS: return InstancePackage.CONNECTOR_INSTANCE__CONNECTOR_CLASS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectorInstanceImpl
