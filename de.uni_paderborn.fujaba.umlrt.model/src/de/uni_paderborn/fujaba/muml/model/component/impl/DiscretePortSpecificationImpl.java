/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePortSpecification;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getAdaptationBehavior <em>Adaptation Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortSpecificationImpl#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscretePortSpecificationImpl extends PortSpecificationImpl implements DiscretePortSpecification {
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
	 * The cached value of the '{@link #getAdaptationBehavior() <em>Adaptation Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior adaptationBehavior;

	/**
	 * The cached value of the '{@link #getRoleAndAdaptationBehavior() <em>Role And Adaptation Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAndAdaptationBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior roleAndAdaptationBehavior;

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
	public EList<Behavior> getBehavior() {
		if (behavior == null) {
			behavior = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, ComponentPackage.DISCRETE_PORT_SPECIFICATION__BEHAVIOR, CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT);
		}
		return behavior;
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
	public Behavior getAdaptationBehavior() {
		if (adaptationBehavior != null && adaptationBehavior.eIsProxy()) {
			InternalEObject oldAdaptationBehavior = (InternalEObject)adaptationBehavior;
			adaptationBehavior = (Behavior)eResolveProxy(oldAdaptationBehavior);
			if (adaptationBehavior != oldAdaptationBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR, oldAdaptationBehavior, adaptationBehavior));
			}
		}
		return adaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetAdaptationBehavior() {
		return adaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationBehavior(Behavior newAdaptationBehavior) {
		Behavior oldAdaptationBehavior = adaptationBehavior;
		adaptationBehavior = newAdaptationBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR, oldAdaptationBehavior, adaptationBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getRoleAndAdaptationBehavior() {
		if (roleAndAdaptationBehavior != null && roleAndAdaptationBehavior.eIsProxy()) {
			InternalEObject oldRoleAndAdaptationBehavior = (InternalEObject)roleAndAdaptationBehavior;
			roleAndAdaptationBehavior = (Behavior)eResolveProxy(oldRoleAndAdaptationBehavior);
			if (roleAndAdaptationBehavior != oldRoleAndAdaptationBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT_SPECIFICATION__ROLE_AND_ADAPTATION_BEHAVIOR, oldRoleAndAdaptationBehavior, roleAndAdaptationBehavior));
			}
		}
		return roleAndAdaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetRoleAndAdaptationBehavior() {
		return roleAndAdaptationBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleAndAdaptationBehavior(Behavior newRoleAndAdaptationBehavior) {
		Behavior oldRoleAndAdaptationBehavior = roleAndAdaptationBehavior;
		roleAndAdaptationBehavior = newRoleAndAdaptationBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT_SPECIFICATION__ROLE_AND_ADAPTATION_BEHAVIOR, oldRoleAndAdaptationBehavior, roleAndAdaptationBehavior));
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__BEHAVIOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBehavior()).basicAdd(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				if (refines != null)
					msgs = ((InternalEObject)refines).eInverseRemove(this, PatternPackage.ROLE__PORT, Role.class, msgs);
				return basicSetRefines((Role)otherEnd, msgs);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__BEHAVIOR:
				return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				return basicSetRefines(null, msgs);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__BEHAVIOR:
				return getBehavior();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__SENDER_MESSAGE_INTERFACE:
				if (resolve) return getSenderMessageInterface();
				return basicGetSenderMessageInterface();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__RECEIVER_MESSAGE_INTERFACE:
				if (resolve) return getReceiverMessageInterface();
				return basicGetReceiverMessageInterface();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				if (resolve) return getAdaptationBehavior();
				return basicGetAdaptationBehavior();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ROLE_AND_ADAPTATION_BEHAVIOR:
				if (resolve) return getRoleAndAdaptationBehavior();
				return basicGetRoleAndAdaptationBehavior();
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				setAdaptationBehavior((Behavior)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ROLE_AND_ADAPTATION_BEHAVIOR:
				setRoleAndAdaptationBehavior((Behavior)newValue);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__BEHAVIOR:
				getBehavior().clear();
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				setAdaptationBehavior((Behavior)null);
				return;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ROLE_AND_ADAPTATION_BEHAVIOR:
				setRoleAndAdaptationBehavior((Behavior)null);
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
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__BEHAVIOR:
				return behavior != null && !behavior.isEmpty();
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__REFINES:
				return refines != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__SENDER_MESSAGE_INTERFACE:
				return senderMessageInterface != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__RECEIVER_MESSAGE_INTERFACE:
				return receiverMessageInterface != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ADAPTATION_BEHAVIOR:
				return adaptationBehavior != null;
			case ComponentPackage.DISCRETE_PORT_SPECIFICATION__ROLE_AND_ADAPTATION_BEHAVIOR:
				return roleAndAdaptationBehavior != null;
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
				case ComponentPackage.DISCRETE_PORT_SPECIFICATION__BEHAVIOR: return CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
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
				case CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return ComponentPackage.DISCRETE_PORT_SPECIFICATION__BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiscretePortSpecificationImpl
