/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

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

import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl#getCoordinatorBehavior <em>Coordinator Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl#getSubroleBehavior <em>Subrole Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationPortImpl#isMulti <em>Multi</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReconfigurationPortImpl extends PortImpl implements ReconfigurationPort {
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
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (Behavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR, oldBehavior, behavior));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR, oldBehavior, newBehavior);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getSenderMessageTypes() {
		if (senderMessageTypes == null) {
			senderMessageTypes = new EObjectResolvingEList<MessageType>(MessageType.class, this, ReconfigurationPackage.RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES);
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
			receiverMessageTypes = new EObjectResolvingEList<MessageType>(MessageType.class, this, ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR, oldCoordinatorBehavior, coordinatorBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR, oldCoordinatorBehavior, coordinatorBehavior));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.RECONFIGURATION_PORT__SUBROLE_BEHAVIOR, oldSubroleBehavior, subroleBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_PORT__SUBROLE_BEHAVIOR, oldSubroleBehavior, subroleBehavior));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY, oldCardinality, newCardinality);
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
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageBuffer> getReceiverMessageBuffer() {
		if (receiverMessageBuffer == null) {
			receiverMessageBuffer = new EObjectContainmentWithInverseEList<MessageBuffer>(MessageBuffer.class, this, ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER, ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT);
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR:
				if (behavior != null)
					msgs = ((InternalEObject)behavior).eInverseRemove(this, BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
				return basicSetBehavior((Behavior)otherEnd, msgs);
			case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER:
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER:
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case ReconfigurationPackage.RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES:
				return getSenderMessageTypes();
			case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES:
				return getReceiverMessageTypes();
			case ReconfigurationPackage.RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR:
				if (resolve) return getCoordinatorBehavior();
				return basicGetCoordinatorBehavior();
			case ReconfigurationPackage.RECONFIGURATION_PORT__SUBROLE_BEHAVIOR:
				if (resolve) return getSubroleBehavior();
				return basicGetSubroleBehavior();
			case ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY:
				return getCardinality();
			case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER:
				return getReceiverMessageBuffer();
			case ReconfigurationPackage.RECONFIGURATION_PORT__MULTI:
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES:
				getSenderMessageTypes().clear();
				getSenderMessageTypes().addAll((Collection<? extends MessageType>)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES:
				getReceiverMessageTypes().clear();
				getReceiverMessageTypes().addAll((Collection<? extends MessageType>)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR:
				setCoordinatorBehavior((Behavior)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__SUBROLE_BEHAVIOR:
				setSubroleBehavior((Behavior)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER:
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES:
				getSenderMessageTypes().clear();
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES:
				getReceiverMessageTypes().clear();
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR:
				setCoordinatorBehavior((Behavior)null);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__SUBROLE_BEHAVIOR:
				setSubroleBehavior((Behavior)null);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER:
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
			case ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR:
				return behavior != null;
			case ReconfigurationPackage.RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES:
				return senderMessageTypes != null && !senderMessageTypes.isEmpty();
			case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES:
				return receiverMessageTypes != null && !receiverMessageTypes.isEmpty();
			case ReconfigurationPackage.RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR:
				return coordinatorBehavior != null;
			case ReconfigurationPackage.RECONFIGURATION_PORT__SUBROLE_BEHAVIOR:
				return subroleBehavior != null;
			case ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY:
				return cardinality != null;
			case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER:
				return receiverMessageBuffer != null && !receiverMessageBuffer.isEmpty();
			case ReconfigurationPackage.RECONFIGURATION_PORT__MULTI:
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
				case ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR: return BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == DiscreteInteractionEndpoint.class) {
			switch (derivedFeatureID) {
				case ReconfigurationPackage.RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES;
				case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES;
				case ReconfigurationPackage.RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR;
				case ReconfigurationPackage.RECONFIGURATION_PORT__SUBROLE_BEHAVIOR: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR;
				case ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY;
				case ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER;
				case ReconfigurationPackage.RECONFIGURATION_PORT__MULTI: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__MULTI;
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
				case BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return ReconfigurationPackage.RECONFIGURATION_PORT__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == DiscreteInteractionEndpoint.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES: return ReconfigurationPackage.RECONFIGURATION_PORT__SENDER_MESSAGE_TYPES;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES: return ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_TYPES;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR: return ReconfigurationPackage.RECONFIGURATION_PORT__COORDINATOR_BEHAVIOR;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR: return ReconfigurationPackage.RECONFIGURATION_PORT__SUBROLE_BEHAVIOR;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY: return ReconfigurationPackage.RECONFIGURATION_PORT__CARDINALITY;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER: return ReconfigurationPackage.RECONFIGURATION_PORT__RECEIVER_MESSAGE_BUFFER;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__MULTI: return ReconfigurationPackage.RECONFIGURATION_PORT__MULTI;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReconfigurationPortImpl
