/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component.impl;

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
import org.muml.pim.component.ComponentPackage;
import org.muml.pim.component.DiscretePort;
import org.muml.pim.connector.ConnectorPackage;
import org.muml.pim.connector.DiscreteInteractionEndpoint;
import org.muml.pim.connector.MessageBuffer;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.protocol.CoordinationProtocol;
import org.muml.pim.protocol.Role;
import org.muml.pim.valuetype.Cardinality;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#getCoordinatorBehavior <em>Coordinator Behavior</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#getSubroleBehavior <em>Subrole Behavior</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#isMulti <em>Multi</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#getRefinedRole <em>Refined Role</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#isIsDiscreteInPort <em>Is Discrete In Port</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#isIsDiscreteOutPort <em>Is Discrete Out Port</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#isIsDiscreteInOutPort <em>Is Discrete In Out Port</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#isMultiPort <em>Multi Port</em>}</li>
 *   <li>{@link org.muml.pim.component.impl.DiscretePortImpl#getCoordinationProtocol <em>Coordination Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscretePortImpl extends PortImpl implements DiscretePort {
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
	 * The cached value of the '{@link #getRefinedRole() <em>Refined Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedRole()
	 * @generated
	 * @ordered
	 */
	protected Role refinedRole;

	/**
	 * The cached setting delegate for the '{@link #isIsDiscreteInPort() <em>Is Discrete In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDiscreteInPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_DISCRETE_IN_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.DISCRETE_PORT__IS_DISCRETE_IN_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isIsDiscreteOutPort() <em>Is Discrete Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDiscreteOutPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_DISCRETE_OUT_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.DISCRETE_PORT__IS_DISCRETE_OUT_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isIsDiscreteInOutPort() <em>Is Discrete In Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDiscreteInOutPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_DISCRETE_IN_OUT_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isMultiPort() <em>Multi Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MULTI_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.DISCRETE_PORT__MULTI_PORT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCoordinationProtocol() <em>Coordination Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationProtocol()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COORDINATION_PROTOCOL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.DISCRETE_PORT__COORDINATION_PROTOCOL).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscretePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.DISCRETE_PORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__BEHAVIOR, oldBehavior, behavior));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__BEHAVIOR, oldBehavior, newBehavior);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getSenderMessageTypes() {
		if (senderMessageTypes == null) {
			senderMessageTypes = new EObjectResolvingEList<MessageType>(MessageType.class, this, ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES);
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
			receiverMessageTypes = new EObjectResolvingEList<MessageType>(MessageType.class, this, ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__COORDINATOR_BEHAVIOR, oldCoordinatorBehavior, coordinatorBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__COORDINATOR_BEHAVIOR, oldCoordinatorBehavior, coordinatorBehavior));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__SUBROLE_BEHAVIOR, oldSubroleBehavior, subroleBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__SUBROLE_BEHAVIOR, oldSubroleBehavior, subroleBehavior));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__CARDINALITY, oldCardinality, newCardinality);
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
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.DISCRETE_PORT__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.DISCRETE_PORT__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__CARDINALITY, newCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRefinedRole() {
		if (refinedRole != null && refinedRole.eIsProxy()) {
			InternalEObject oldRefinedRole = (InternalEObject)refinedRole;
			refinedRole = (Role)eResolveProxy(oldRefinedRole);
			if (refinedRole != oldRefinedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__REFINED_ROLE, oldRefinedRole, refinedRole));
			}
		}
		return refinedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRefinedRole() {
		return refinedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedRole(Role newRefinedRole) {
		Role oldRefinedRole = refinedRole;
		refinedRole = newRefinedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__REFINED_ROLE, oldRefinedRole, refinedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDiscreteInPort() {
		return (Boolean)IS_DISCRETE_IN_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDiscreteOutPort() {
		return (Boolean)IS_DISCRETE_OUT_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDiscreteInOutPort() {
		return (Boolean)IS_DISCRETE_IN_OUT_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageBuffer> getReceiverMessageBuffer() {
		if (receiverMessageBuffer == null) {
			receiverMessageBuffer = new EObjectContainmentWithInverseEList<MessageBuffer>(MessageBuffer.class, this, ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER, ConnectorPackage.MESSAGE_BUFFER__DISCRETE_INTERACTION_ENDPOINT);
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
	public boolean isMultiPort() {
		return (Boolean)MULTI_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocol getCoordinationProtocol() {
		return (CoordinationProtocol)COORDINATION_PROTOCOL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationProtocol basicGetCoordinationProtocol() {
		return (CoordinationProtocol)COORDINATION_PROTOCOL__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
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
			case ComponentPackage.DISCRETE_PORT__BEHAVIOR:
				if (behavior != null)
					msgs = ((InternalEObject)behavior).eInverseRemove(this, BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
				return basicSetBehavior((Behavior)otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER:
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
			case ComponentPackage.DISCRETE_PORT__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER:
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
			case ComponentPackage.DISCRETE_PORT__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES:
				return getSenderMessageTypes();
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES:
				return getReceiverMessageTypes();
			case ComponentPackage.DISCRETE_PORT__COORDINATOR_BEHAVIOR:
				if (resolve) return getCoordinatorBehavior();
				return basicGetCoordinatorBehavior();
			case ComponentPackage.DISCRETE_PORT__SUBROLE_BEHAVIOR:
				if (resolve) return getSubroleBehavior();
				return basicGetSubroleBehavior();
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
				return getCardinality();
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER:
				return getReceiverMessageBuffer();
			case ComponentPackage.DISCRETE_PORT__MULTI:
				return isMulti();
			case ComponentPackage.DISCRETE_PORT__REFINED_ROLE:
				if (resolve) return getRefinedRole();
				return basicGetRefinedRole();
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_PORT:
				return isIsDiscreteInPort();
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_OUT_PORT:
				return isIsDiscreteOutPort();
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT:
				return isIsDiscreteInOutPort();
			case ComponentPackage.DISCRETE_PORT__MULTI_PORT:
				return isMultiPort();
			case ComponentPackage.DISCRETE_PORT__COORDINATION_PROTOCOL:
				if (resolve) return getCoordinationProtocol();
				return basicGetCoordinationProtocol();
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
			case ComponentPackage.DISCRETE_PORT__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES:
				getSenderMessageTypes().clear();
				getSenderMessageTypes().addAll((Collection<? extends MessageType>)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES:
				getReceiverMessageTypes().clear();
				getReceiverMessageTypes().addAll((Collection<? extends MessageType>)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__COORDINATOR_BEHAVIOR:
				setCoordinatorBehavior((Behavior)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__SUBROLE_BEHAVIOR:
				setSubroleBehavior((Behavior)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER:
				getReceiverMessageBuffer().clear();
				getReceiverMessageBuffer().addAll((Collection<? extends MessageBuffer>)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__REFINED_ROLE:
				setRefinedRole((Role)newValue);
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
			case ComponentPackage.DISCRETE_PORT__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES:
				getSenderMessageTypes().clear();
				return;
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES:
				getReceiverMessageTypes().clear();
				return;
			case ComponentPackage.DISCRETE_PORT__COORDINATOR_BEHAVIOR:
				setCoordinatorBehavior((Behavior)null);
				return;
			case ComponentPackage.DISCRETE_PORT__SUBROLE_BEHAVIOR:
				setSubroleBehavior((Behavior)null);
				return;
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER:
				getReceiverMessageBuffer().clear();
				return;
			case ComponentPackage.DISCRETE_PORT__REFINED_ROLE:
				setRefinedRole((Role)null);
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
			case ComponentPackage.DISCRETE_PORT__BEHAVIOR:
				return behavior != null;
			case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES:
				return senderMessageTypes != null && !senderMessageTypes.isEmpty();
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES:
				return receiverMessageTypes != null && !receiverMessageTypes.isEmpty();
			case ComponentPackage.DISCRETE_PORT__COORDINATOR_BEHAVIOR:
				return coordinatorBehavior != null;
			case ComponentPackage.DISCRETE_PORT__SUBROLE_BEHAVIOR:
				return subroleBehavior != null;
			case ComponentPackage.DISCRETE_PORT__CARDINALITY:
				return cardinality != null;
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER:
				return receiverMessageBuffer != null && !receiverMessageBuffer.isEmpty();
			case ComponentPackage.DISCRETE_PORT__MULTI:
				return MULTI__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DISCRETE_PORT__REFINED_ROLE:
				return refinedRole != null;
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_PORT:
				return IS_DISCRETE_IN_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_OUT_PORT:
				return IS_DISCRETE_OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT:
				return IS_DISCRETE_IN_OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DISCRETE_PORT__MULTI_PORT:
				return MULTI_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DISCRETE_PORT__COORDINATION_PROTOCOL:
				return COORDINATION_PROTOCOL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case ComponentPackage.DISCRETE_PORT__BEHAVIOR: return BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == DiscreteInteractionEndpoint.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES;
				case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES;
				case ComponentPackage.DISCRETE_PORT__COORDINATOR_BEHAVIOR: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR;
				case ComponentPackage.DISCRETE_PORT__SUBROLE_BEHAVIOR: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR;
				case ComponentPackage.DISCRETE_PORT__CARDINALITY: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY;
				case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER;
				case ComponentPackage.DISCRETE_PORT__MULTI: return ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__MULTI;
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
				case BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return ComponentPackage.DISCRETE_PORT__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == DiscreteInteractionEndpoint.class) {
			switch (baseFeatureID) {
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SENDER_MESSAGE_TYPES: return ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_TYPES: return ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__COORDINATOR_BEHAVIOR: return ComponentPackage.DISCRETE_PORT__COORDINATOR_BEHAVIOR;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__SUBROLE_BEHAVIOR: return ComponentPackage.DISCRETE_PORT__SUBROLE_BEHAVIOR;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__CARDINALITY: return ComponentPackage.DISCRETE_PORT__CARDINALITY;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__RECEIVER_MESSAGE_BUFFER: return ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER;
				case ConnectorPackage.DISCRETE_INTERACTION_ENDPOINT__MULTI: return ComponentPackage.DISCRETE_PORT__MULTI;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiscretePortImpl
