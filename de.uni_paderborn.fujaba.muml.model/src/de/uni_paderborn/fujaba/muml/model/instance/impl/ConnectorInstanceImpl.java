/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.model.component.BehavioralConnector;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.instance.BehaviorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.BehavioralElementInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.PortInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getBehaviorInstance <em>Behavior Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getBehavioralElementType <em>Behavioral Element Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.ConnectorInstanceImpl#getTarget <em>Target</em>}</li>
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
	 * The cached value of the '{@link #getBehaviorInstance() <em>Behavior Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorInstance> behaviorInstance;

	/**
	 * The cached value of the '{@link #getBehavioralElementType() <em>Behavioral Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralElementType()
	 * @generated
	 * @ordered
	 */
	protected BehavioralElement behavioralElementType;

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
	public EList<BehaviorInstance> getBehaviorInstance() {
		if (behaviorInstance == null) {
			behaviorInstance = new EObjectContainmentWithInverseEList<BehaviorInstance>(BehaviorInstance.class, this, InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR_INSTANCE, InstancePackage.BEHAVIOR_INSTANCE__BEHAVIORAL_ELEMENT_INSTANCE);
		}
		return behaviorInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement getBehavioralElementType() {
		if (behavioralElementType != null && behavioralElementType.eIsProxy()) {
			InternalEObject oldBehavioralElementType = (InternalEObject)behavioralElementType;
			behavioralElementType = (BehavioralElement)eResolveProxy(oldBehavioralElementType);
			if (behavioralElementType != oldBehavioralElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE, oldBehavioralElementType, behavioralElementType));
			}
		}
		return behavioralElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement basicGetBehavioralElementType() {
		return behavioralElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralElementType(BehavioralElement newBehavioralElementType) {
		BehavioralElement oldBehavioralElementType = behavioralElementType;
		behavioralElementType = newBehavioralElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE, oldBehavioralElementType, behavioralElementType));
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehaviorInstance()).basicAdd(otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, InstancePackage.PORT_INSTANCE__OUTGOING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
				return basicSetSource((PortInstance)otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, InstancePackage.PORT_INSTANCE__INCOMING_CONNECTOR_INSTANCES, PortInstance.class, msgs);
				return basicSetTarget((PortInstance)otherEnd, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR_INSTANCE:
				return ((InternalEList<?>)getBehaviorInstance()).basicRemove(otherEnd, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				return basicSetSource(null, msgs);
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				return basicSetTarget(null, msgs);
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR:
				return getBehavior();
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR_INSTANCE:
				return getBehaviorInstance();
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				if (resolve) return getBehavioralElementType();
				return basicGetBehavioralElementType();
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR_INSTANCE:
				getBehaviorInstance().clear();
				getBehaviorInstance().addAll((Collection<? extends BehaviorInstance>)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				setBehavioralElementType((BehavioralElement)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				setSource((PortInstance)newValue);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				setTarget((PortInstance)newValue);
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR_INSTANCE:
				getBehaviorInstance().clear();
				return;
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				setBehavioralElementType((BehavioralElement)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				setSource((PortInstance)null);
				return;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				setTarget((PortInstance)null);
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
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR_INSTANCE:
				return behaviorInstance != null && !behaviorInstance.isEmpty();
			case InstancePackage.CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE:
				return behavioralElementType != null;
			case InstancePackage.CONNECTOR_INSTANCE__SOURCE:
				return source != null;
			case InstancePackage.CONNECTOR_INSTANCE__TARGET:
				return target != null;
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
				default: return -1;
			}
		}
		if (baseClass == BehavioralElementInstance.class) {
			switch (derivedFeatureID) {
				case InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR_INSTANCE: return InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIOR_INSTANCE;
				case InstancePackage.CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE: return InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;
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
				default: return -1;
			}
		}
		if (baseClass == BehavioralElementInstance.class) {
			switch (baseFeatureID) {
				case InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIOR_INSTANCE: return InstancePackage.CONNECTOR_INSTANCE__BEHAVIOR_INSTANCE;
				case InstancePackage.BEHAVIORAL_ELEMENT_INSTANCE__BEHAVIORAL_ELEMENT_TYPE: return InstancePackage.CONNECTOR_INSTANCE__BEHAVIORAL_ELEMENT_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectorInstanceImpl
