/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification;

import de.uni_paderborn.fujaba.muml.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.core.AdaptationBehavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getRealtimeStatechart <em>Realtime Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getEventQueueSize <em>Event Queue Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getAdaptationBehavior <em>Adaptation Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscretePortSpecificationImpl extends PortSpecificationImpl implements DiscretePortSpecification {
	/**
	 * The cached value of the '{@link #getRealtimeStatechart() <em>Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealtimeStatechart()
	 * @generated
	 * @ordered
	 */
	protected AbstractRealtimeStatechart realtimeStatechart;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected Role refines;

	/**
	 * The cached value of the '{@link #getSenderMessageInterface() <em>Sender Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface senderMessageInterface;

	/**
	 * The cached value of the '{@link #getReceiverMessageInterface() <em>Receiver Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected MessageInterface receiverMessageInterface;

	/**
	 * The default value of the '{@link #getEventQueueSize() <em>Event Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final int EVENT_QUEUE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEventQueueSize() <em>Event Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventQueueSize()
	 * @generated
	 * @ordered
	 */
	protected int eventQueueSize = EVENT_QUEUE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscretePortSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentPackage.Literals.DISCRETE_PORT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart getRealtimeStatechart() {
		if (realtimeStatechart != null && realtimeStatechart.eIsProxy()) {
			InternalEObject oldRealtimeStatechart = (InternalEObject)realtimeStatechart;
			realtimeStatechart = (AbstractRealtimeStatechart)eResolveProxy(oldRealtimeStatechart);
			if (realtimeStatechart != oldRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART, oldRealtimeStatechart, realtimeStatechart));
			}
		}
		return realtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart basicGetRealtimeStatechart() {
		return realtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealtimeStatechart(AbstractRealtimeStatechart newRealtimeStatechart, NotificationChain msgs) {
		AbstractRealtimeStatechart oldRealtimeStatechart = realtimeStatechart;
		realtimeStatechart = newRealtimeStatechart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART, oldRealtimeStatechart, newRealtimeStatechart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealtimeStatechart(AbstractRealtimeStatechart newRealtimeStatechart) {
		if (newRealtimeStatechart != realtimeStatechart) {
			NotificationChain msgs = null;
			if (realtimeStatechart != null)
				msgs = ((InternalEObject)realtimeStatechart).eInverseRemove(this, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, AbstractRealtimeStatechart.class, msgs);
			if (newRealtimeStatechart != null)
				msgs = ((InternalEObject)newRealtimeStatechart).eInverseAdd(this, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, AbstractRealtimeStatechart.class, msgs);
			msgs = basicSetRealtimeStatechart(newRealtimeStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART, newRealtimeStatechart, newRealtimeStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject)refines;
			refines = (Role)eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES, oldRefines, refines));
			}
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefines(Role newRefines, NotificationChain msgs) {
		Role oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES, oldRefines, newRefines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(Role newRefines) {
		if (newRefines != refines) {
			NotificationChain msgs = null;
			if (refines != null)
				msgs = ((InternalEObject)refines).eInverseRemove(this, PatternPackage.ROLE__PORT, Role.class, msgs);
			if (newRefines != null)
				msgs = ((InternalEObject)newRefines).eInverseAdd(this, PatternPackage.ROLE__PORT, Role.class, msgs);
			msgs = basicSetRefines(newRefines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES, newRefines, newRefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getSenderMessageInterface() {
		if (senderMessageInterface != null && senderMessageInterface.eIsProxy()) {
			InternalEObject oldSenderMessageInterface = (InternalEObject)senderMessageInterface;
			senderMessageInterface = (MessageInterface)eResolveProxy(oldSenderMessageInterface);
			if (senderMessageInterface != oldSenderMessageInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__SENDER_MESSAGE_INTERFACE, oldSenderMessageInterface, senderMessageInterface));
			}
		}
		return senderMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetSenderMessageInterface() {
		return senderMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenderMessageInterface(MessageInterface newSenderMessageInterface) {
		MessageInterface oldSenderMessageInterface = senderMessageInterface;
		senderMessageInterface = newSenderMessageInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__SENDER_MESSAGE_INTERFACE, oldSenderMessageInterface, senderMessageInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getReceiverMessageInterface() {
		if (receiverMessageInterface != null && receiverMessageInterface.eIsProxy()) {
			InternalEObject oldReceiverMessageInterface = (InternalEObject)receiverMessageInterface;
			receiverMessageInterface = (MessageInterface)eResolveProxy(oldReceiverMessageInterface);
			if (receiverMessageInterface != oldReceiverMessageInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__RECEIVER_MESSAGE_INTERFACE, oldReceiverMessageInterface, receiverMessageInterface));
			}
		}
		return receiverMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetReceiverMessageInterface() {
		return receiverMessageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverMessageInterface(MessageInterface newReceiverMessageInterface) {
		MessageInterface oldReceiverMessageInterface = receiverMessageInterface;
		receiverMessageInterface = newReceiverMessageInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__RECEIVER_MESSAGE_INTERFACE, oldReceiverMessageInterface, receiverMessageInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEventQueueSize() {
		return eventQueueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventQueueSize(int newEventQueueSize) {
		int oldEventQueueSize = eventQueueSize;
		eventQueueSize = newEventQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__EVENT_QUEUE_SIZE, oldEventQueueSize, eventQueueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationBehavior getAdaptationBehavior() {
		if (eContainerFeatureID() != ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR) return null;
		return (AdaptationBehavior)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdaptationBehavior(AdaptationBehavior newAdaptationBehavior, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAdaptationBehavior, ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationBehavior(AdaptationBehavior newAdaptationBehavior) {
		if (newAdaptationBehavior != eInternalContainer() || (eContainerFeatureID() != ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR && newAdaptationBehavior != null)) {
			if (EcoreUtil.isAncestor(this, newAdaptationBehavior))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAdaptationBehavior != null)
				msgs = ((InternalEObject)newAdaptationBehavior).eInverseAdd(this, CorePackage.ADAPTATION_BEHAVIOR__PORT, AdaptationBehavior.class, msgs);
			msgs = basicSetAdaptationBehavior(newAdaptationBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR, newAdaptationBehavior, newAdaptationBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART:
				if (realtimeStatechart != null)
					msgs = ((InternalEObject)realtimeStatechart).eInverseRemove(this, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, AbstractRealtimeStatechart.class, msgs);
				return basicSetRealtimeStatechart((AbstractRealtimeStatechart)otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				if (refines != null)
					msgs = ((InternalEObject)refines).eInverseRemove(this, PatternPackage.ROLE__PORT, Role.class, msgs);
				return basicSetRefines((Role)otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAdaptationBehavior((AdaptationBehavior)otherEnd, msgs);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART:
				return basicSetRealtimeStatechart(null, msgs);
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				return basicSetRefines(null, msgs);
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				return basicSetAdaptationBehavior(null, msgs);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				return eInternalContainer().eInverseRemove(this, CorePackage.ADAPTATION_BEHAVIOR__PORT, AdaptationBehavior.class, msgs);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART:
				if (resolve) return getRealtimeStatechart();
				return basicGetRealtimeStatechart();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__SENDER_MESSAGE_INTERFACE:
				if (resolve) return getSenderMessageInterface();
				return basicGetSenderMessageInterface();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__RECEIVER_MESSAGE_INTERFACE:
				if (resolve) return getReceiverMessageInterface();
				return basicGetReceiverMessageInterface();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__EVENT_QUEUE_SIZE:
				return getEventQueueSize();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				return getAdaptationBehavior();
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART:
				setRealtimeStatechart((AbstractRealtimeStatechart)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				setRefines((Role)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__SENDER_MESSAGE_INTERFACE:
				setSenderMessageInterface((MessageInterface)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__RECEIVER_MESSAGE_INTERFACE:
				setReceiverMessageInterface((MessageInterface)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__EVENT_QUEUE_SIZE:
				setEventQueueSize((Integer)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				setAdaptationBehavior((AdaptationBehavior)newValue);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART:
				setRealtimeStatechart((AbstractRealtimeStatechart)null);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				setRefines((Role)null);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__SENDER_MESSAGE_INTERFACE:
				setSenderMessageInterface((MessageInterface)null);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__RECEIVER_MESSAGE_INTERFACE:
				setReceiverMessageInterface((MessageInterface)null);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__EVENT_QUEUE_SIZE:
				setEventQueueSize(EVENT_QUEUE_SIZE_EDEFAULT);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				setAdaptationBehavior((AdaptationBehavior)null);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART:
				return realtimeStatechart != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				return refines != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__SENDER_MESSAGE_INTERFACE:
				return senderMessageInterface != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__RECEIVER_MESSAGE_INTERFACE:
				return receiverMessageInterface != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__EVENT_QUEUE_SIZE:
				return eventQueueSize != EVENT_QUEUE_SIZE_EDEFAULT;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				return getAdaptationBehavior() != null;
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
				case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART: return CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART;
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
				case CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART: return ComponentPackage.DISCRETE_PORT_SPECIFICATION__REALTIME_STATECHART;
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
		result.append(" (eventQueueSize: ");
		result.append(eventQueueSize);
		result.append(')');
		return result.toString();
	}

} //DiscretePortSpecificationImpl
