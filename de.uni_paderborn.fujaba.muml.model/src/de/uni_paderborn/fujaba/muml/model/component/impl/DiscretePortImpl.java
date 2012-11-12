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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.DiscretePort;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.pattern.DiscreteInteractionPoint;
import de.uni_paderborn.fujaba.muml.model.pattern.MessageBuffer;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.model.pattern.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getAdaptationBehavior <em>Adaptation Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getRoleAndAdaptationBehavior <em>Role And Adaptation Behavior</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#isIsDiscreteInPort <em>Is Discrete In Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#isIsDiscreteOutPort <em>Is Discrete Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#isIsDiscreteInOutPort <em>Is Discrete In Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.impl.DiscretePortImpl#getReceiverMessageBuffer <em>Receiver Message Buffer</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected Role refines;

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
	 * The cached setting delegate for the '{@link #getReceiverMessageBuffer() <em>Receiver Message Buffer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageBuffer()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RECEIVER_MESSAGE_BUFFER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ComponentPackage.Literals.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER).getSettingDelegate();

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
				msgs = ((InternalEObject)behavior).eInverseRemove(this, CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject)newBehavior).eInverseAdd(this, CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
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
	public Role getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject)refines;
			refines = (Role)eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__REFINES, oldRefines, refines));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__REFINES, oldRefines, newRefines);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__REFINES, newRefines, newRefines));
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
	public Behavior getAdaptationBehavior() {
		if (adaptationBehavior != null && adaptationBehavior.eIsProxy()) {
			InternalEObject oldAdaptationBehavior = (InternalEObject)adaptationBehavior;
			adaptationBehavior = (Behavior)eResolveProxy(oldAdaptationBehavior);
			if (adaptationBehavior != oldAdaptationBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR, oldAdaptationBehavior, adaptationBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR, oldAdaptationBehavior, adaptationBehavior));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR, oldRoleAndAdaptationBehavior, roleAndAdaptationBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR, oldRoleAndAdaptationBehavior, roleAndAdaptationBehavior));
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
		return (EList<MessageBuffer>)RECEIVER_MESSAGE_BUFFER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
					msgs = ((InternalEObject)behavior).eInverseRemove(this, CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT, Behavior.class, msgs);
				return basicSetBehavior((Behavior)otherEnd, msgs);
			case ComponentPackage.DISCRETE_PORT__REFINES:
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
			case ComponentPackage.DISCRETE_PORT__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case ComponentPackage.DISCRETE_PORT__REFINES:
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
			case ComponentPackage.DISCRETE_PORT__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES:
				return getSenderMessageTypes();
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES:
				return getReceiverMessageTypes();
			case ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR:
				if (resolve) return getAdaptationBehavior();
				return basicGetAdaptationBehavior();
			case ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR:
				if (resolve) return getRoleAndAdaptationBehavior();
				return basicGetRoleAndAdaptationBehavior();
			case ComponentPackage.DISCRETE_PORT__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_PORT:
				return isIsDiscreteInPort();
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_OUT_PORT:
				return isIsDiscreteOutPort();
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT:
				return isIsDiscreteInOutPort();
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER:
				return getReceiverMessageBuffer();
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
			case ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR:
				setAdaptationBehavior((Behavior)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR:
				setRoleAndAdaptationBehavior((Behavior)newValue);
				return;
			case ComponentPackage.DISCRETE_PORT__REFINES:
				setRefines((Role)newValue);
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
			case ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR:
				setAdaptationBehavior((Behavior)null);
				return;
			case ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR:
				setRoleAndAdaptationBehavior((Behavior)null);
				return;
			case ComponentPackage.DISCRETE_PORT__REFINES:
				setRefines((Role)null);
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
			case ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR:
				return adaptationBehavior != null;
			case ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR:
				return roleAndAdaptationBehavior != null;
			case ComponentPackage.DISCRETE_PORT__REFINES:
				return refines != null;
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_PORT:
				return IS_DISCRETE_IN_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_OUT_PORT:
				return IS_DISCRETE_OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DISCRETE_PORT__IS_DISCRETE_IN_OUT_PORT:
				return IS_DISCRETE_IN_OUT_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_BUFFER:
				return RECEIVER_MESSAGE_BUFFER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case ComponentPackage.DISCRETE_PORT__BEHAVIOR: return CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == DiscreteInteractionPoint.class) {
			switch (derivedFeatureID) {
				case ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES: return PatternPackage.DISCRETE_INTERACTION_POINT__SENDER_MESSAGE_TYPES;
				case ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES: return PatternPackage.DISCRETE_INTERACTION_POINT__RECEIVER_MESSAGE_TYPES;
				case ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR: return PatternPackage.DISCRETE_INTERACTION_POINT__ADAPTATION_BEHAVIOR;
				case ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR: return PatternPackage.DISCRETE_INTERACTION_POINT__ROLE_AND_ADAPTATION_BEHAVIOR;
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
				case CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR: return ComponentPackage.DISCRETE_PORT__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == DiscreteInteractionPoint.class) {
			switch (baseFeatureID) {
				case PatternPackage.DISCRETE_INTERACTION_POINT__SENDER_MESSAGE_TYPES: return ComponentPackage.DISCRETE_PORT__SENDER_MESSAGE_TYPES;
				case PatternPackage.DISCRETE_INTERACTION_POINT__RECEIVER_MESSAGE_TYPES: return ComponentPackage.DISCRETE_PORT__RECEIVER_MESSAGE_TYPES;
				case PatternPackage.DISCRETE_INTERACTION_POINT__ADAPTATION_BEHAVIOR: return ComponentPackage.DISCRETE_PORT__ADAPTATION_BEHAVIOR;
				case PatternPackage.DISCRETE_INTERACTION_POINT__ROLE_AND_ADAPTATION_BEHAVIOR: return ComponentPackage.DISCRETE_PORT__ROLE_AND_ADAPTATION_BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiscretePortImpl
