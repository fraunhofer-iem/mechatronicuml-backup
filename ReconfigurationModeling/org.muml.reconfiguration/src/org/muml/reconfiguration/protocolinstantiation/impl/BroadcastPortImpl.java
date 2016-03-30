/**
 */
package org.muml.reconfiguration.protocolinstantiation.impl;

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
import org.muml.pim.behavior.Behavior;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.component.impl.PortImpl;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.valuetype.Cardinality;
import org.muml.reconfiguration.protocolinstantiation.BroadcastPort;
import org.muml.reconfiguration.protocolinstantiation.BroadcastPortKind;
import org.muml.reconfiguration.protocolinstantiation.BroadcastPortSpecification;
import org.muml.reconfiguration.protocolinstantiation.ProtocolinstantiationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broadcast Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 *   <li>{@link org.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link org.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl#getCoordinatorBehavior <em>Coordinator Behavior</em>}</li>
 *   <li>{@link org.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl#getSubroleBehavior <em>Subrole Behavior</em>}</li>
 *   <li>{@link org.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 *   <li>{@link org.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl#isMulti <em>Multi</em>}</li>
 *   <li>{@link org.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.muml.reconfiguration.protocolinstantiation.impl.BroadcastPortImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BroadcastPortImpl extends PortImpl implements BroadcastPort {
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
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected BroadcastPortSpecification specification;

	/**
	 * This is true if the Specification containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specificationESet;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final BroadcastPortKind KIND_EDEFAULT = BroadcastPortKind.DISCOVERY;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected BroadcastPortKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BroadcastPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolinstantiationPackage.Literals.BROADCAST_PORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR, oldBehavior, behavior));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR, oldBehavior, newBehavior);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getSenderMessageTypes() {
		if (senderMessageTypes == null) {
			senderMessageTypes = new EObjectResolvingEList<MessageType>(MessageType.class, this, ProtocolinstantiationPackage.BROADCAST_PORT__SENDER_MESSAGE_TYPES);
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
			receiverMessageTypes = new EObjectResolvingEList<MessageType>(MessageType.class, this, ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_TYPES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolinstantiationPackage.BROADCAST_PORT__COORDINATOR_BEHAVIOR, oldCoordinatorBehavior, coordinatorBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolinstantiationPackage.BROADCAST_PORT__COORDINATOR_BEHAVIOR, oldCoordinatorBehavior, coordinatorBehavior));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolinstantiationPackage.BROADCAST_PORT__SUBROLE_BEHAVIOR, oldSubroleBehavior, subroleBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolinstantiationPackage.BROADCAST_PORT__SUBROLE_BEHAVIOR, oldSubroleBehavior, subroleBehavior));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY, oldCardinality, newCardinality);
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
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageBuffer> getReceiverMessageBuffer() {
		if (receiverMessageBuffer == null) {
			receiverMessageBuffer = new EObjectContainmentWithInverseEList<MessageBuffer>(MessageBuffer.class, this, ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_BUFFER, ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT);
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
	public BroadcastPortSpecification getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(BroadcastPortSpecification newSpecification, NotificationChain msgs) {
		BroadcastPortSpecification oldSpecification = specification;
		specification = newSpecification;
		boolean oldSpecificationESet = specificationESet;
		specificationESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION, oldSpecification, newSpecification, !oldSpecificationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(BroadcastPortSpecification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSpecificationESet = specificationESet;
			specificationESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION, newSpecification, newSpecification, !oldSpecificationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSpecification(NotificationChain msgs) {
		BroadcastPortSpecification oldSpecification = specification;
		specification = null;
		boolean oldSpecificationESet = specificationESet;
		specificationESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION, oldSpecification, null, oldSpecificationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecification() {
		if (specification != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION, null, msgs);
			msgs = basicUnsetSpecification(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSpecificationESet = specificationESet;
			specificationESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION, null, null, oldSpecificationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecification() {
		return specificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastPortKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(BroadcastPortKind newKind) {
		BroadcastPortKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtocolinstantiationPackage.BROADCAST_PORT__KIND, oldKind, kind));
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
			case ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR:
				if (behavior != null)
					msgs = ((InternalEObject)behavior).eInverseRemove(this, BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
				return basicSetBehavior((Behavior)otherEnd, msgs);
			case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_BUFFER:
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
			case ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_BUFFER:
				return ((InternalEList<?>)getReceiverMessageBuffer()).basicRemove(otherEnd, msgs);
			case ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION:
				return basicUnsetSpecification(msgs);
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
			case ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case ProtocolinstantiationPackage.BROADCAST_PORT__SENDER_MESSAGE_TYPES:
				return getSenderMessageTypes();
			case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_TYPES:
				return getReceiverMessageTypes();
			case ProtocolinstantiationPackage.BROADCAST_PORT__COORDINATOR_BEHAVIOR:
				if (resolve) return getCoordinatorBehavior();
				return basicGetCoordinatorBehavior();
			case ProtocolinstantiationPackage.BROADCAST_PORT__SUBROLE_BEHAVIOR:
				if (resolve) return getSubroleBehavior();
				return basicGetSubroleBehavior();
			case ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY:
				return getCardinality();
			case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_BUFFER:
				return getReceiverMessageBuffer();
			case ProtocolinstantiationPackage.BROADCAST_PORT__MULTI:
				return isMulti();
			case ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION:
				return getSpecification();
			case ProtocolinstantiationPackage.BROADCAST_PORT__KIND:
				return getKind();
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
			case ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__SENDER_MESSAGE_TYPES:
				getSenderMessageTypes().clear();
				getSenderMessageTypes().addAll((Collection<? extends MessageType>)newValue);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_TYPES:
				getReceiverMessageTypes().clear();
				getReceiverMessageTypes().addAll((Collection<? extends MessageType>)newValue);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__COORDINATOR_BEHAVIOR:
				setCoordinatorBehavior((Behavior)newValue);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__SUBROLE_BEHAVIOR:
				setSubroleBehavior((Behavior)newValue);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_BUFFER:
				getReceiverMessageBuffer().clear();
				getReceiverMessageBuffer().addAll((Collection<? extends MessageBuffer>)newValue);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION:
				setSpecification((BroadcastPortSpecification)newValue);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__KIND:
				setKind((BroadcastPortKind)newValue);
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
			case ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__SENDER_MESSAGE_TYPES:
				getSenderMessageTypes().clear();
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_TYPES:
				getReceiverMessageTypes().clear();
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__COORDINATOR_BEHAVIOR:
				setCoordinatorBehavior((Behavior)null);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__SUBROLE_BEHAVIOR:
				setSubroleBehavior((Behavior)null);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_BUFFER:
				getReceiverMessageBuffer().clear();
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION:
				unsetSpecification();
				return;
			case ProtocolinstantiationPackage.BROADCAST_PORT__KIND:
				setKind(KIND_EDEFAULT);
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
			case ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR:
				return behavior != null;
			case ProtocolinstantiationPackage.BROADCAST_PORT__SENDER_MESSAGE_TYPES:
				return senderMessageTypes != null && !senderMessageTypes.isEmpty();
			case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_TYPES:
				return receiverMessageTypes != null && !receiverMessageTypes.isEmpty();
			case ProtocolinstantiationPackage.BROADCAST_PORT__COORDINATOR_BEHAVIOR:
				return coordinatorBehavior != null;
			case ProtocolinstantiationPackage.BROADCAST_PORT__SUBROLE_BEHAVIOR:
				return subroleBehavior != null;
			case ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY:
				return cardinality != null;
			case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_BUFFER:
				return receiverMessageBuffer != null && !receiverMessageBuffer.isEmpty();
			case ProtocolinstantiationPackage.BROADCAST_PORT__MULTI:
				return MULTI__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ProtocolinstantiationPackage.BROADCAST_PORT__SPECIFICATION:
				return isSetSpecification();
			case ProtocolinstantiationPackage.BROADCAST_PORT__KIND:
				return kind != KIND_EDEFAULT;
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
				case ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR: return BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == DiscreteInteractionEndpoint.class) {
			switch (derivedFeatureID) {
				case ProtocolinstantiationPackage.BROADCAST_PORT__SENDER_MESSAGE_TYPES: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES;
				case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_TYPES: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES;
				case ProtocolinstantiationPackage.BROADCAST_PORT__COORDINATOR_BEHAVIOR: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR;
				case ProtocolinstantiationPackage.BROADCAST_PORT__SUBROLE_BEHAVIOR: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR;
				case ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY;
				case ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_BUFFER: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER;
				case ProtocolinstantiationPackage.BROADCAST_PORT__MULTI: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__MULTI;
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
				case BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return ProtocolinstantiationPackage.BROADCAST_PORT__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == DiscreteInteractionEndpoint.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES: return ProtocolinstantiationPackage.BROADCAST_PORT__SENDER_MESSAGE_TYPES;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES: return ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_TYPES;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR: return ProtocolinstantiationPackage.BROADCAST_PORT__COORDINATOR_BEHAVIOR;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR: return ProtocolinstantiationPackage.BROADCAST_PORT__SUBROLE_BEHAVIOR;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY: return ProtocolinstantiationPackage.BROADCAST_PORT__CARDINALITY;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER: return ProtocolinstantiationPackage.BROADCAST_PORT__RECEIVER_MESSAGE_BUFFER;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__MULTI: return ProtocolinstantiationPackage.BROADCAST_PORT__MULTI;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //BroadcastPortImpl
