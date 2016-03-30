/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.core.impl.CommentableElementImpl;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.valuetype.TimeValue;
import org.muml.reconfiguration.Manager;
import org.muml.reconfiguration.ManagerSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationPackage;
import org.muml.reconfiguration.ReconfigurationRule;
import org.muml.reconfiguration.StructuralCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl#isTreat <em>Treat</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl#isPropagate <em>Propagate</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl#getStructuralCondition <em>Structural Condition</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl#isInvokePlanner <em>Invoke Planner</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl#getTimeForPlanning <em>Time For Planning</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ManagerSpecificationEntryImpl#isBlockable <em>Blockable</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getStructuralCondition() <em>Structural Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralCondition()
	 * @generated
	 * @ordered
	 */
	protected StructuralCondition structuralCondition;

	/**
	 * The cached value of the '{@link #getReconfigurationRule() <em>Reconfiguration Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationRule()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationRule reconfigurationRule;

	/**
	 * The default value of the '{@link #isInvokePlanner() <em>Invoke Planner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvokePlanner()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVOKE_PLANNER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvokePlanner() <em>Invoke Planner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvokePlanner()
	 * @generated
	 * @ordered
	 */
	protected boolean invokePlanner = INVOKE_PLANNER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeForPlanning() <em>Time For Planning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeForPlanning()
	 * @generated
	 * @ordered
	 */
	protected TimeValue timeForPlanning;

	/**
	 * The default value of the '{@link #isBlockable() <em>Blockable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlockable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOCKABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlockable() <em>Blockable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlockable()
	 * @generated
	 * @ordered
	 */
	protected boolean blockable = BLOCKABLE_EDEFAULT;

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
		return (Manager)eInternalContainer();
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
	public StructuralCondition getStructuralCondition() {
		if (structuralCondition != null && structuralCondition.eIsProxy()) {
			InternalEObject oldStructuralCondition = (InternalEObject)structuralCondition;
			structuralCondition = (StructuralCondition)eResolveProxy(oldStructuralCondition);
			if (structuralCondition != oldStructuralCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__STRUCTURAL_CONDITION, oldStructuralCondition, structuralCondition));
			}
		}
		return structuralCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralCondition basicGetStructuralCondition() {
		return structuralCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralCondition(StructuralCondition newStructuralCondition) {
		StructuralCondition oldStructuralCondition = structuralCondition;
		structuralCondition = newStructuralCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__STRUCTURAL_CONDITION, oldStructuralCondition, structuralCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationRule getReconfigurationRule() {
		if (reconfigurationRule != null && reconfigurationRule.eIsProxy()) {
			InternalEObject oldReconfigurationRule = (InternalEObject)reconfigurationRule;
			reconfigurationRule = (ReconfigurationRule)eResolveProxy(oldReconfigurationRule);
			if (reconfigurationRule != oldReconfigurationRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_RULE, oldReconfigurationRule, reconfigurationRule));
			}
		}
		return reconfigurationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationRule basicGetReconfigurationRule() {
		return reconfigurationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationRule(ReconfigurationRule newReconfigurationRule) {
		ReconfigurationRule oldReconfigurationRule = reconfigurationRule;
		reconfigurationRule = newReconfigurationRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_RULE, oldReconfigurationRule, reconfigurationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvokePlanner() {
		return invokePlanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokePlanner(boolean newInvokePlanner) {
		boolean oldInvokePlanner = invokePlanner;
		invokePlanner = newInvokePlanner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER, oldInvokePlanner, invokePlanner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getTimeForPlanning() {
		return timeForPlanning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeForPlanning(TimeValue newTimeForPlanning, NotificationChain msgs) {
		TimeValue oldTimeForPlanning = timeForPlanning;
		timeForPlanning = newTimeForPlanning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING, oldTimeForPlanning, newTimeForPlanning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeForPlanning(TimeValue newTimeForPlanning) {
		if (newTimeForPlanning != timeForPlanning) {
			NotificationChain msgs = null;
			if (timeForPlanning != null)
				msgs = ((InternalEObject)timeForPlanning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING, null, msgs);
			if (newTimeForPlanning != null)
				msgs = ((InternalEObject)newTimeForPlanning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING, null, msgs);
			msgs = basicSetTimeForPlanning(newTimeForPlanning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING, newTimeForPlanning, newTimeForPlanning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlockable() {
		return blockable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockable(boolean newBlockable) {
		boolean oldBlockable = blockable;
		blockable = newBlockable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__BLOCKABLE, oldBlockable, blockable));
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING:
				return basicSetTimeForPlanning(null, msgs);
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__STRUCTURAL_CONDITION:
				if (resolve) return getStructuralCondition();
				return basicGetStructuralCondition();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				if (resolve) return getReconfigurationRule();
				return basicGetReconfigurationRule();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER:
				return isInvokePlanner();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING:
				return getTimeForPlanning();
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__BLOCKABLE:
				return isBlockable();
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__STRUCTURAL_CONDITION:
				setStructuralCondition((StructuralCondition)newValue);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				setReconfigurationRule((ReconfigurationRule)newValue);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER:
				setInvokePlanner((Boolean)newValue);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING:
				setTimeForPlanning((TimeValue)newValue);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__BLOCKABLE:
				setBlockable((Boolean)newValue);
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__STRUCTURAL_CONDITION:
				setStructuralCondition((StructuralCondition)null);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				setReconfigurationRule((ReconfigurationRule)null);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER:
				setInvokePlanner(INVOKE_PLANNER_EDEFAULT);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING:
				setTimeForPlanning((TimeValue)null);
				return;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__BLOCKABLE:
				setBlockable(BLOCKABLE_EDEFAULT);
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
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__STRUCTURAL_CONDITION:
				return structuralCondition != null;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				return reconfigurationRule != null;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__INVOKE_PLANNER:
				return invokePlanner != INVOKE_PLANNER_EDEFAULT;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__TIME_FOR_PLANNING:
				return timeForPlanning != null;
			case ReconfigurationPackage.MANAGER_SPECIFICATION_ENTRY__BLOCKABLE:
				return blockable != BLOCKABLE_EDEFAULT;
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
		result.append(", invokePlanner: ");
		result.append(invokePlanner);
		result.append(", blockable: ");
		result.append(blockable);
		result.append(')');
		return result.toString();
	}

} //ManagerSpecificationEntryImpl
