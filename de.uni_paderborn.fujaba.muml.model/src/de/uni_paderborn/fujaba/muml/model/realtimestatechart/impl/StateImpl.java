/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEntryOrExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.StateEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationChannel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getDoEvent <em>Do Event</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getExitEvent <em>Exit Event</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getEntryEvent <em>Entry Event</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#isCommitted <em>Committed</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#isInitial <em>Initial</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getStateEntryOrExitPoints <em>State Entry Or Exit Points</em>}</li>
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
	 * The cached value of the '{@link #getDoEvent() <em>Do Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoEvent()
	 * @generated
	 * @ordered
	 */
	protected DoEvent doEvent;

	/**
	 * The cached value of the '{@link #getExitEvent() <em>Exit Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitEvent()
	 * @generated
	 * @ordered
	 */
	protected EntryOrExitEvent exitEvent;

	/**
	 * The cached value of the '{@link #getEntryEvent() <em>Entry Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryEvent()
	 * @generated
	 * @ordered
	 */
	protected EntryOrExitEvent entryEvent;

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
	 * The default value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean initial = INITIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUrgent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean URGENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUrgent()
	 * @generated
	 * @ordered
	 */
	protected boolean urgent = URGENT_EDEFAULT;

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
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<StateEvent> events;

	/**
	 * The cached value of the '{@link #getStateEntryOrExitPoints() <em>State Entry Or Exit Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateEntryOrExitPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<StateEntryOrExitPoint> stateEntryOrExitPoints;

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
	public DoEvent getDoEvent() {
		return doEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoEvent(DoEvent newDoEvent, NotificationChain msgs) {
		DoEvent oldDoEvent = doEvent;
		doEvent = newDoEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__DO_EVENT, oldDoEvent, newDoEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoEvent(DoEvent newDoEvent) {
		if (newDoEvent != doEvent) {
			NotificationChain msgs = null;
			if (doEvent != null)
				msgs = ((InternalEObject)doEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__DO_EVENT, null, msgs);
			if (newDoEvent != null)
				msgs = ((InternalEObject)newDoEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__DO_EVENT, null, msgs);
			msgs = basicSetDoEvent(newDoEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__DO_EVENT, newDoEvent, newDoEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryOrExitEvent getExitEvent() {
		return exitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitEvent(EntryOrExitEvent newExitEvent, NotificationChain msgs) {
		EntryOrExitEvent oldExitEvent = exitEvent;
		exitEvent = newExitEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__EXIT_EVENT, oldExitEvent, newExitEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitEvent(EntryOrExitEvent newExitEvent) {
		if (newExitEvent != exitEvent) {
			NotificationChain msgs = null;
			if (exitEvent != null)
				msgs = ((InternalEObject)exitEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__EXIT_EVENT, null, msgs);
			if (newExitEvent != null)
				msgs = ((InternalEObject)newExitEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__EXIT_EVENT, null, msgs);
			msgs = basicSetExitEvent(newExitEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__EXIT_EVENT, newExitEvent, newExitEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryOrExitEvent getEntryEvent() {
		return entryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryEvent(EntryOrExitEvent newEntryEvent, NotificationChain msgs) {
		EntryOrExitEvent oldEntryEvent = entryEvent;
		entryEvent = newEntryEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__ENTRY_EVENT, oldEntryEvent, newEntryEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryEvent(EntryOrExitEvent newEntryEvent) {
		if (newEntryEvent != entryEvent) {
			NotificationChain msgs = null;
			if (entryEvent != null)
				msgs = ((InternalEObject)entryEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__ENTRY_EVENT, null, msgs);
			if (newEntryEvent != null)
				msgs = ((InternalEObject)newEntryEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__ENTRY_EVENT, null, msgs);
			msgs = basicSetEntryEvent(newEntryEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__ENTRY_EVENT, newEntryEvent, newEntryEvent));
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
	public EList<StateEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<StateEvent>(StateEvent.class, this, RealtimestatechartPackage.STATE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateEntryOrExitPoint> getStateEntryOrExitPoints() {
		if (stateEntryOrExitPoints == null) {
			stateEntryOrExitPoints = new EObjectResolvingEList<StateEntryOrExitPoint>(StateEntryOrExitPoint.class, this, RealtimestatechartPackage.STATE__STATE_ENTRY_OR_EXIT_POINTS);
		}
		return stateEntryOrExitPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(boolean newInitial) {
		boolean oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUrgent() {
		return urgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrgent(boolean newUrgent) {
		boolean oldUrgent = urgent;
		urgent = newUrgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__URGENT, oldUrgent, urgent));
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
			case RealtimestatechartPackage.STATE__DO_EVENT:
				return basicSetDoEvent(null, msgs);
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
				return basicSetExitEvent(null, msgs);
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
				return basicSetEntryEvent(null, msgs);
			case RealtimestatechartPackage.STATE__INVARIANTS:
				return ((InternalEList<?>)getInvariants()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.STATE__DO_EVENT:
				return getDoEvent();
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
				return getExitEvent();
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
				return getEntryEvent();
			case RealtimestatechartPackage.STATE__INVARIANTS:
				return getInvariants();
			case RealtimestatechartPackage.STATE__COMMITTED:
				return isCommitted();
			case RealtimestatechartPackage.STATE__INITIAL:
				return isInitial();
			case RealtimestatechartPackage.STATE__FINAL:
				return isFinal();
			case RealtimestatechartPackage.STATE__URGENT:
				return isUrgent();
			case RealtimestatechartPackage.STATE__CHANNELS:
				return getChannels();
			case RealtimestatechartPackage.STATE__EVENTS:
				return getEvents();
			case RealtimestatechartPackage.STATE__STATE_ENTRY_OR_EXIT_POINTS:
				return getStateEntryOrExitPoints();
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
			case RealtimestatechartPackage.STATE__DO_EVENT:
				setDoEvent((DoEvent)newValue);
				return;
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
				setExitEvent((EntryOrExitEvent)newValue);
				return;
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
				setEntryEvent((EntryOrExitEvent)newValue);
				return;
			case RealtimestatechartPackage.STATE__INVARIANTS:
				getInvariants().clear();
				getInvariants().addAll((Collection<? extends ClockConstraint>)newValue);
				return;
			case RealtimestatechartPackage.STATE__COMMITTED:
				setCommitted((Boolean)newValue);
				return;
			case RealtimestatechartPackage.STATE__INITIAL:
				setInitial((Boolean)newValue);
				return;
			case RealtimestatechartPackage.STATE__FINAL:
				setFinal((Boolean)newValue);
				return;
			case RealtimestatechartPackage.STATE__URGENT:
				setUrgent((Boolean)newValue);
				return;
			case RealtimestatechartPackage.STATE__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends SynchronizationChannel>)newValue);
				return;
			case RealtimestatechartPackage.STATE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends StateEvent>)newValue);
				return;
			case RealtimestatechartPackage.STATE__STATE_ENTRY_OR_EXIT_POINTS:
				getStateEntryOrExitPoints().clear();
				getStateEntryOrExitPoints().addAll((Collection<? extends StateEntryOrExitPoint>)newValue);
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
			case RealtimestatechartPackage.STATE__DO_EVENT:
				setDoEvent((DoEvent)null);
				return;
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
				setExitEvent((EntryOrExitEvent)null);
				return;
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
				setEntryEvent((EntryOrExitEvent)null);
				return;
			case RealtimestatechartPackage.STATE__INVARIANTS:
				getInvariants().clear();
				return;
			case RealtimestatechartPackage.STATE__COMMITTED:
				setCommitted(COMMITTED_EDEFAULT);
				return;
			case RealtimestatechartPackage.STATE__INITIAL:
				setInitial(INITIAL_EDEFAULT);
				return;
			case RealtimestatechartPackage.STATE__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case RealtimestatechartPackage.STATE__URGENT:
				setUrgent(URGENT_EDEFAULT);
				return;
			case RealtimestatechartPackage.STATE__CHANNELS:
				getChannels().clear();
				return;
			case RealtimestatechartPackage.STATE__EVENTS:
				getEvents().clear();
				return;
			case RealtimestatechartPackage.STATE__STATE_ENTRY_OR_EXIT_POINTS:
				getStateEntryOrExitPoints().clear();
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
			case RealtimestatechartPackage.STATE__DO_EVENT:
				return doEvent != null;
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
				return exitEvent != null;
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
				return entryEvent != null;
			case RealtimestatechartPackage.STATE__INVARIANTS:
				return invariants != null && !invariants.isEmpty();
			case RealtimestatechartPackage.STATE__COMMITTED:
				return committed != COMMITTED_EDEFAULT;
			case RealtimestatechartPackage.STATE__INITIAL:
				return initial != INITIAL_EDEFAULT;
			case RealtimestatechartPackage.STATE__FINAL:
				return final_ != FINAL_EDEFAULT;
			case RealtimestatechartPackage.STATE__URGENT:
				return urgent != URGENT_EDEFAULT;
			case RealtimestatechartPackage.STATE__CHANNELS:
				return channels != null && !channels.isEmpty();
			case RealtimestatechartPackage.STATE__EVENTS:
				return events != null && !events.isEmpty();
			case RealtimestatechartPackage.STATE__STATE_ENTRY_OR_EXIT_POINTS:
				return stateEntryOrExitPoints != null && !stateEntryOrExitPoints.isEmpty();
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
		result.append(", initial: ");
		result.append(initial);
		result.append(", final: ");
		result.append(final_);
		result.append(", urgent: ");
		result.append(urgent);
		result.append(')');
		return result.toString();
	}

} //StateImpl
