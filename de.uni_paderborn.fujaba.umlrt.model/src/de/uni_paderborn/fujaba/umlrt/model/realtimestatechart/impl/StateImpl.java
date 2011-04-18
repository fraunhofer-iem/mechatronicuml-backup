/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ExitEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl#isCommitted <em>Committed</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl#getChannels <em>Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends VertexImpl implements State {
	/**
	 * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> regions;

	/**
	 * The cached value of the '{@link #getDoAction() <em>Do Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoAction()
	 * @generated
	 * @ordered
	 */
	protected DoEvent doAction;

	/**
	 * The cached value of the '{@link #getExitAction() <em>Exit Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitAction()
	 * @generated
	 * @ordered
	 */
	protected ExitEvent exitAction;

	/**
	 * The cached value of the '{@link #getEntryAction() <em>Entry Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryAction()
	 * @generated
	 * @ordered
	 */
	protected EntryEvent entryAction;

	/**
	 * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariants()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockConstraint> invariants;

	/**
	 * The default value of the '{@link #isCommitted() <em>Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommitted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMMITTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCommitted() <em>Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommitted()
	 * @generated
	 * @ordered
	 */
	protected boolean committed = COMMITTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronizationChannel> channels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegions() {
		if (regions == null) {
			regions = new EObjectContainmentWithInverseEList<Region>(Region.class, this, RealtimestatechartPackage.STATE__REGIONS, RealtimestatechartPackage.REGION__PARENT_STATE);
		}
		return regions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoEvent getDoAction() {
		return doAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoAction(DoEvent newDoAction, NotificationChain msgs) {
		DoEvent oldDoAction = doAction;
		doAction = newDoAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__DO_ACTION, oldDoAction, newDoAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoAction(DoEvent newDoAction) {
		if (newDoAction != doAction) {
			NotificationChain msgs = null;
			if (doAction != null)
				msgs = ((InternalEObject)doAction).eInverseRemove(this, RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV, DoEvent.class, msgs);
			if (newDoAction != null)
				msgs = ((InternalEObject)newDoAction).eInverseAdd(this, RealtimestatechartPackage.DO_EVENT__DO_ACTION_REV, DoEvent.class, msgs);
			msgs = basicSetDoAction(newDoAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__DO_ACTION, newDoAction, newDoAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitEvent getExitAction() {
		return exitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitAction(ExitEvent newExitAction, NotificationChain msgs) {
		ExitEvent oldExitAction = exitAction;
		exitAction = newExitAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__EXIT_ACTION, oldExitAction, newExitAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitAction(ExitEvent newExitAction) {
		if (newExitAction != exitAction) {
			NotificationChain msgs = null;
			if (exitAction != null)
				msgs = ((InternalEObject)exitAction).eInverseRemove(this, RealtimestatechartPackage.EXIT_EVENT__EXIT_ACTION_REV, ExitEvent.class, msgs);
			if (newExitAction != null)
				msgs = ((InternalEObject)newExitAction).eInverseAdd(this, RealtimestatechartPackage.EXIT_EVENT__EXIT_ACTION_REV, ExitEvent.class, msgs);
			msgs = basicSetExitAction(newExitAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__EXIT_ACTION, newExitAction, newExitAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryEvent getEntryAction() {
		return entryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryAction(EntryEvent newEntryAction, NotificationChain msgs) {
		EntryEvent oldEntryAction = entryAction;
		entryAction = newEntryAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__ENTRY_ACTION, oldEntryAction, newEntryAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryAction(EntryEvent newEntryAction) {
		if (newEntryAction != entryAction) {
			NotificationChain msgs = null;
			if (entryAction != null)
				msgs = ((InternalEObject)entryAction).eInverseRemove(this, RealtimestatechartPackage.ENTRY_EVENT__ENTRY_ACTION_REV, EntryEvent.class, msgs);
			if (newEntryAction != null)
				msgs = ((InternalEObject)newEntryAction).eInverseAdd(this, RealtimestatechartPackage.ENTRY_EVENT__ENTRY_ACTION_REV, EntryEvent.class, msgs);
			msgs = basicSetEntryAction(newEntryAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__ENTRY_ACTION, newEntryAction, newEntryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockConstraint> getInvariants() {
		if (invariants == null) {
			invariants = new EObjectContainmentEList<ClockConstraint>(ClockConstraint.class, this, RealtimestatechartPackage.STATE__INVARIANTS);
		}
		return invariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCommitted() {
		return committed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitted(boolean newCommitted) {
		boolean oldCommitted = committed;
		committed = newCommitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__COMMITTED, oldCommitted, committed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchronizationChannel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentWithInverseEList<SynchronizationChannel>(SynchronizationChannel.class, this, RealtimestatechartPackage.STATE__CHANNELS, RealtimestatechartPackage.SYNCHRONIZATION_CHANNEL__STATE);
		}
		return channels;
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
			case RealtimestatechartPackage.STATE__REGIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegions()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__DO_ACTION:
				if (doAction != null)
					msgs = ((InternalEObject)doAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__DO_ACTION, null, msgs);
				return basicSetDoAction((DoEvent)otherEnd, msgs);
			case RealtimestatechartPackage.STATE__EXIT_ACTION:
				if (exitAction != null)
					msgs = ((InternalEObject)exitAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__EXIT_ACTION, null, msgs);
				return basicSetExitAction((ExitEvent)otherEnd, msgs);
			case RealtimestatechartPackage.STATE__ENTRY_ACTION:
				if (entryAction != null)
					msgs = ((InternalEObject)entryAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__ENTRY_ACTION, null, msgs);
				return basicSetEntryAction((EntryEvent)otherEnd, msgs);
			case RealtimestatechartPackage.STATE__CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannels()).basicAdd(otherEnd, msgs);
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
			case RealtimestatechartPackage.STATE__REGIONS:
				return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__DO_ACTION:
				return basicSetDoAction(null, msgs);
			case RealtimestatechartPackage.STATE__EXIT_ACTION:
				return basicSetExitAction(null, msgs);
			case RealtimestatechartPackage.STATE__ENTRY_ACTION:
				return basicSetEntryAction(null, msgs);
			case RealtimestatechartPackage.STATE__INVARIANTS:
				return ((InternalEList<?>)getInvariants()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.STATE__REGIONS:
				return getRegions();
			case RealtimestatechartPackage.STATE__DO_ACTION:
				return getDoAction();
			case RealtimestatechartPackage.STATE__EXIT_ACTION:
				return getExitAction();
			case RealtimestatechartPackage.STATE__ENTRY_ACTION:
				return getEntryAction();
			case RealtimestatechartPackage.STATE__INVARIANTS:
				return getInvariants();
			case RealtimestatechartPackage.STATE__COMMITTED:
				return isCommitted();
			case RealtimestatechartPackage.STATE__CHANNELS:
				return getChannels();
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
			case RealtimestatechartPackage.STATE__REGIONS:
				getRegions().clear();
				getRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case RealtimestatechartPackage.STATE__DO_ACTION:
				setDoAction((DoEvent)newValue);
				return;
			case RealtimestatechartPackage.STATE__EXIT_ACTION:
				setExitAction((ExitEvent)newValue);
				return;
			case RealtimestatechartPackage.STATE__ENTRY_ACTION:
				setEntryAction((EntryEvent)newValue);
				return;
			case RealtimestatechartPackage.STATE__INVARIANTS:
				getInvariants().clear();
				getInvariants().addAll((Collection<? extends ClockConstraint>)newValue);
				return;
			case RealtimestatechartPackage.STATE__COMMITTED:
				setCommitted((Boolean)newValue);
				return;
			case RealtimestatechartPackage.STATE__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends SynchronizationChannel>)newValue);
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
			case RealtimestatechartPackage.STATE__REGIONS:
				getRegions().clear();
				return;
			case RealtimestatechartPackage.STATE__DO_ACTION:
				setDoAction((DoEvent)null);
				return;
			case RealtimestatechartPackage.STATE__EXIT_ACTION:
				setExitAction((ExitEvent)null);
				return;
			case RealtimestatechartPackage.STATE__ENTRY_ACTION:
				setEntryAction((EntryEvent)null);
				return;
			case RealtimestatechartPackage.STATE__INVARIANTS:
				getInvariants().clear();
				return;
			case RealtimestatechartPackage.STATE__COMMITTED:
				setCommitted(COMMITTED_EDEFAULT);
				return;
			case RealtimestatechartPackage.STATE__CHANNELS:
				getChannels().clear();
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
			case RealtimestatechartPackage.STATE__REGIONS:
				return regions != null && !regions.isEmpty();
			case RealtimestatechartPackage.STATE__DO_ACTION:
				return doAction != null;
			case RealtimestatechartPackage.STATE__EXIT_ACTION:
				return exitAction != null;
			case RealtimestatechartPackage.STATE__ENTRY_ACTION:
				return entryAction != null;
			case RealtimestatechartPackage.STATE__INVARIANTS:
				return invariants != null && !invariants.isEmpty();
			case RealtimestatechartPackage.STATE__COMMITTED:
				return committed != COMMITTED_EDEFAULT;
			case RealtimestatechartPackage.STATE__CHANNELS:
				return channels != null && !channels.isEmpty();
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
		result.append(" (committed: ");
		result.append(committed);
		result.append(')');
		return result.toString();
	}

} //StateImpl
