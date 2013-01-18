/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.storydriven.core.impl.CommentableElementImpl;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ManagerSpecificationEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationCondition;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl#isTreat <em>Treat</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl#isPropagate <em>Propagate</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ManagerSpecificationEntryImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerSpecificationEntryImpl extends CommentableElementImpl implements ManagerSpecificationEntry {
	/**
	 * The default value of the '{@link #isTreat() <em>Treat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTreat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TREAT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTreat() <em>Treat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTreat()
	 * @generated
	 * @ordered
	 */
	protected boolean treat = TREAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPropagate() <em>Propagate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPropagate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROPAGATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPropagate() <em>Propagate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPropagate()
	 * @generated
	 * @ordered
	 */
	protected boolean propagate = PROPAGATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected MessageType messageType;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationCondition guard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerSpecificationEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.MANAGER_SPECIFICATION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTreat() {
		return treat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreat(boolean newTreat) {
		boolean oldTreat = treat;
		treat = newTreat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TREAT, oldTreat, treat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPropagate() {
		return propagate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagate(boolean newPropagate) {
		boolean oldPropagate = propagate;
		propagate = newPropagate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__PROPAGATE, oldPropagate, propagate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getManager() {
		if (eContainerFeatureID() != ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER) return null;
		return (Manager)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(Manager newManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newManager, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Manager newManager) {
		if (newManager != eInternalContainer() || (eContainerFeatureID() != ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER && newManager != null)) {
			if (EcoreUtil.isAncestor(this, newManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newManager != null)
				msgs = ((InternalEObject)newManager).eInverseAdd(this, ReconfigurationPackage.MANAGER__SPECIFICATION_ENTRIES, Manager.class, msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER, newManager, newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getMessageType() {
		if (messageType != null && messageType.eIsProxy()) {
			InternalEObject oldMessageType = (InternalEObject)messageType;
			messageType = (MessageType)eResolveProxy(oldMessageType);
			if (messageType != oldMessageType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE, oldMessageType, messageType));
			}
		}
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageType(MessageType newMessageType) {
		MessageType oldMessageType = messageType;
		messageType = newMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE, oldMessageType, messageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationCondition getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject)guard;
			guard = (ReconfigurationCondition)eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__GUARD, oldGuard, guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationCondition basicGetGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(ReconfigurationCondition newGuard) {
		ReconfigurationCondition oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetManager((Manager)otherEnd, msgs);
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER:
				return basicSetManager(null, msgs);
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER:
				return eInternalContainer().eInverseRemove(this, ReconfigurationPackage.MANAGER__SPECIFICATION_ENTRIES, Manager.class, msgs);
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TREAT:
				return isTreat();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__PROPAGATE:
				return isPropagate();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER:
				return getManager();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE:
				if (resolve) return getMessageType();
				return basicGetMessageType();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__GUARD:
				if (resolve) return getGuard();
				return basicGetGuard();
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TREAT:
				setTreat((Boolean)newValue);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__PROPAGATE:
				setPropagate((Boolean)newValue);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER:
				setManager((Manager)newValue);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE:
				setMessageType((MessageType)newValue);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__GUARD:
				setGuard((ReconfigurationCondition)newValue);
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TREAT:
				setTreat(TREAT_EDEFAULT);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__PROPAGATE:
				setPropagate(PROPAGATE_EDEFAULT);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER:
				setManager((Manager)null);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE:
				setMessageType((MessageType)null);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__GUARD:
				setGuard((ReconfigurationCondition)null);
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TREAT:
				return treat != TREAT_EDEFAULT;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__PROPAGATE:
				return propagate != PROPAGATE_EDEFAULT;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MANAGER:
				return getManager() != null;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__MESSAGE_TYPE:
				return messageType != null;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__GUARD:
				return guard != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (treat: ");
		result.append(treat);
		result.append(", propagate: ");
		result.append(propagate);
		result.append(')');
		return result.toString();
	}

} //ManagerSpecificationEntryImpl
