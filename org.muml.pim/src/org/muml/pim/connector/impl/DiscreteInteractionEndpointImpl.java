/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.connector.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.CorePackage;
import org.muml.core.NamedElement;
import org.muml.pim.behavior.Behavior;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.valuetype.Cardinality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Interaction Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl#getContainedBehavior <em>Contained Behavior</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl#getCoordinatorBehavior <em>Coordinator Behavior</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl#getSubroleBehavior <em>Subrole Behavior</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 *   <li>{@link org.muml.pim.connector.impl.DiscreteInteractionEndpointImpl#isMulti <em>Multi</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiscreteInteractionEndpointImpl extends ConnectorEndpointImpl implements DiscreteInteractionEndpoint {
	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

	/**
	 * The cached value of the '{@link #getContainedBehavior() <em>Contained Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior containedBehavior;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSenderMessageTypes() <em>Sender Message Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> senderMessageTypes;

	/**
	 * The cached value of the '{@link #getReceiverMessageTypes() <em>Receiver Message Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> receiverMessageTypes;

	/**
	 * The cached value of the '{@link #getCoordinatorBehavior() <em>Coordinator Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinatorBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior coordinatorBehavior;

	/**
	 * The cached value of the '{@link #getSubroleBehavior() <em>Subrole Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubroleBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior subroleBehavior;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality;

	/**
	 * The cached value of the '{@link #getReceiverMessageBuffer() <em>Receiver Message Buffer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageBuffer()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageBuffer> receiverMessageBuffer;

	/**
	 * The cached setting delegate for the '{@link #isMulti() <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulti()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MULTI__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT__MULTI).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteInteractionEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectorPackage.Literals.DISCRETE_INTERACTION_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (Behavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(Behavior newBehavior, NotificationChain msgs) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR, oldBehavior, newBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = ((InternalEObject)behavior).eInverseRemove(this, BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject)newBehavior).eInverseAdd(this, BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getContainedBehavior() {
		return containedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedBehavior(Behavior newContainedBehavior, NotificationChain msgs) {
		Behavior oldContainedBehavior = containedBehavior;
		containedBehavior = newContainedBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR, oldContainedBehavior, newContainedBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedBehavior(Behavior newContainedBehavior) {
		if (newContainedBehavior != containedBehavior) {
			NotificationChain msgs = null;
			if (containedBehavior != null)
				msgs = ((InternalEObject)containedBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR, null, msgs);
			if (newContainedBehavior != null)
				msgs = ((InternalEObject)newContainedBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR, null, msgs);
			msgs = basicSetContainedBehavior(newContainedBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR, newContainedBehavior, newContainedBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getSenderMessageTypes() {
		if (senderMessageTypes == null) {
			senderMessageTypes = new EObjectResolvingEList<MessageType>(MessageType.class, this, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES);
		}
		return senderMessageTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getReceiverMessageTypes() {
		if (receiverMessageTypes == null) {
			receiverMessageTypes = new EObjectResolvingEList<MessageType>(MessageType.class, this, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES);
		}
		return receiverMessageTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getCoordinatorBehavior() {
		if (coordinatorBehavior != null && coordinatorBehavior.eIsProxy()) {
			InternalEObject oldCoordinatorBehavior = (InternalEObject)coordinatorBehavior;
			coordinatorBehavior = (Behavior)eResolveProxy(oldCoordinatorBehavior);
			if (coordinatorBehavior != oldCoordinatorBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR, oldCoordinatorBehavior, coordinatorBehavior));
			}
		}
		return coordinatorBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetCoordinatorBehavior() {
		return coordinatorBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinatorBehavior(Behavior newCoordinatorBehavior) {
		Behavior oldCoordinatorBehavior = coordinatorBehavior;
		coordinatorBehavior = newCoordinatorBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR, oldCoordinatorBehavior, coordinatorBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getSubroleBehavior() {
		if (subroleBehavior != null && subroleBehavior.eIsProxy()) {
			InternalEObject oldSubroleBehavior = (InternalEObject)subroleBehavior;
			subroleBehavior = (Behavior)eResolveProxy(oldSubroleBehavior);
			if (subroleBehavior != oldSubroleBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR, oldSubroleBehavior, subroleBehavior));
			}
		}
		return subroleBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetSubroleBehavior() {
		return subroleBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubroleBehavior(Behavior newSubroleBehavior) {
		Behavior oldSubroleBehavior = subroleBehavior;
		subroleBehavior = newSubroleBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR, oldSubroleBehavior, subroleBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageBuffer> getReceiverMessageBuffer() {
		if (receiverMessageBuffer == null) {
			receiverMessageBuffer = new EObjectContainmentWithInverseEList<MessageBuffer>(MessageBuffer.class, this, ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER, ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT);
		}
		return receiverMessageBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulti() {
		return (Boolean)MULTI__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR:
				if (behavior != null)
					msgs = ((InternalEObject)behavior).eInverseRemove(this, BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
				return basicSetBehavior((Behavior)otherEnd, msgs);
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceiverMessageBuffer()).basicAdd(otherEnd, msgs);
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
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR:
				return basicSetContainedBehavior(null, msgs);
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER:
				return ((InternalEList<?>)getReceiverMessageBuffer()).basicRemove(otherEnd, msgs);
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
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR:
				return getContainedBehavior();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__NAME:
				return getName();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES:
				return getSenderMessageTypes();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES:
				return getReceiverMessageTypes();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR:
				if (resolve) return getCoordinatorBehavior();
				return basicGetCoordinatorBehavior();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR:
				if (resolve) return getSubroleBehavior();
				return basicGetSubroleBehavior();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY:
				return getCardinality();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER:
				return getReceiverMessageBuffer();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__MULTI:
				return isMulti();
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
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR:
				setContainedBehavior((Behavior)newValue);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__NAME:
				setName((String)newValue);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES:
				getSenderMessageTypes().clear();
				getSenderMessageTypes().addAll((Collection<? extends MessageType>)newValue);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES:
				getReceiverMessageTypes().clear();
				getReceiverMessageTypes().addAll((Collection<? extends MessageType>)newValue);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR:
				setCoordinatorBehavior((Behavior)newValue);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR:
				setSubroleBehavior((Behavior)newValue);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER:
				getReceiverMessageBuffer().clear();
				getReceiverMessageBuffer().addAll((Collection<? extends MessageBuffer>)newValue);
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
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR:
				setContainedBehavior((Behavior)null);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES:
				getSenderMessageTypes().clear();
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES:
				getReceiverMessageTypes().clear();
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR:
				setCoordinatorBehavior((Behavior)null);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR:
				setSubroleBehavior((Behavior)null);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER:
				getReceiverMessageBuffer().clear();
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
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR:
				return behavior != null;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR:
				return containedBehavior != null;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES:
				return senderMessageTypes != null && !senderMessageTypes.isEmpty();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES:
				return receiverMessageTypes != null && !receiverMessageTypes.isEmpty();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR:
				return coordinatorBehavior != null;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR:
				return subroleBehavior != null;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY:
				return cardinality != null;
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER:
				return receiverMessageBuffer != null && !receiverMessageBuffer.isEmpty();
			case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__MULTI:
				return MULTI__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR: return BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR: return BehaviorPackage.BEHAVIORAL_ELEMENT__CONTAINED_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__NAME: return CorePackage.NAMED_ELEMENT__NAME;
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
				case BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__BEHAVIOR;
				case BehaviorPackage.BEHAVIORAL_ELEMENT__CONTAINED_BEHAVIOR: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CONTAINED_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DiscreteInteractionEndpointImpl
