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
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ExitPoint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getDerivedExitPoints <em>Derived Exit Points</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getDerivedEntryPoints <em>Derived Entry Points</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.StateImpl#getChannels <em>Channels</em>}</li>
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
	protected ExitEvent exitEvent;

	/**
	 * The cached value of the '{@link #getEntryEvent() <em>Entry Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryEvent()
	 * @generated
	 * @ordered
	 */
	protected EntryEvent entryEvent;

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
	 * The cached value of the '{@link #getDerivedExitPoints() <em>Derived Exit Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedExitPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ExitPoint> derivedExitPoints;

	/**
	 * The cached value of the '{@link #getDerivedEntryPoints() <em>Derived Entry Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedEntryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryPoint> derivedEntryPoints;

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
				msgs = ((InternalEObject)doEvent).eInverseRemove(this, RealtimestatechartPackage.DO_EVENT__STATE, DoEvent.class, msgs);
			if (newDoEvent != null)
				msgs = ((InternalEObject)newDoEvent).eInverseAdd(this, RealtimestatechartPackage.DO_EVENT__STATE, DoEvent.class, msgs);
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
	public ExitEvent getExitEvent() {
		return exitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitEvent(ExitEvent newExitEvent, NotificationChain msgs) {
		ExitEvent oldExitEvent = exitEvent;
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
	public void setExitEvent(ExitEvent newExitEvent) {
		if (newExitEvent != exitEvent) {
			NotificationChain msgs = null;
			if (exitEvent != null)
				msgs = ((InternalEObject)exitEvent).eInverseRemove(this, RealtimestatechartPackage.EXIT_EVENT__STATE, ExitEvent.class, msgs);
			if (newExitEvent != null)
				msgs = ((InternalEObject)newExitEvent).eInverseAdd(this, RealtimestatechartPackage.EXIT_EVENT__STATE, ExitEvent.class, msgs);
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
	public EntryEvent getEntryEvent() {
		return entryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryEvent(EntryEvent newEntryEvent, NotificationChain msgs) {
		EntryEvent oldEntryEvent = entryEvent;
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
	public void setEntryEvent(EntryEvent newEntryEvent) {
		if (newEntryEvent != entryEvent) {
			NotificationChain msgs = null;
			if (entryEvent != null)
				msgs = ((InternalEObject)entryEvent).eInverseRemove(this, RealtimestatechartPackage.ENTRY_EVENT__STATE, EntryEvent.class, msgs);
			if (newEntryEvent != null)
				msgs = ((InternalEObject)newEntryEvent).eInverseAdd(this, RealtimestatechartPackage.ENTRY_EVENT__STATE, EntryEvent.class, msgs);
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
	public EList<ExitPoint> getDerivedExitPoints() {
		if (derivedExitPoints == null) {
			derivedExitPoints = new EObjectResolvingEList<ExitPoint>(ExitPoint.class, this, RealtimestatechartPackage.STATE__DERIVED_EXIT_POINTS);
		}
		return derivedExitPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryPoint> getDerivedEntryPoints() {
		if (derivedEntryPoints == null) {
			derivedEntryPoints = new EObjectResolvingEList<EntryPoint>(EntryPoint.class, this, RealtimestatechartPackage.STATE__DERIVED_ENTRY_POINTS);
		}
		return derivedEntryPoints;
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
			case RealtimestatechartPackage.STATE__DO_EVENT:
				if (doEvent != null)
					msgs = ((InternalEObject)doEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__DO_EVENT, null, msgs);
				return basicSetDoEvent((DoEvent)otherEnd, msgs);
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
				if (exitEvent != null)
					msgs = ((InternalEObject)exitEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__EXIT_EVENT, null, msgs);
				return basicSetExitEvent((ExitEvent)otherEnd, msgs);
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
				if (entryEvent != null)
					msgs = ((InternalEObject)entryEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__ENTRY_EVENT, null, msgs);
				return basicSetEntryEvent((EntryEvent)otherEnd, msgs);
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
			case RealtimestatechartPackage.STATE__DERIVED_EXIT_POINTS:
				return getDerivedExitPoints();
			case RealtimestatechartPackage.STATE__DERIVED_ENTRY_POINTS:
				return getDerivedEntryPoints();
			case RealtimestatechartPackage.STATE__URGENT:
				return isUrgent();
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
			case RealtimestatechartPackage.STATE__DO_EVENT:
				setDoEvent((DoEvent)newValue);
				return;
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
				setExitEvent((ExitEvent)newValue);
				return;
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
				setEntryEvent((EntryEvent)newValue);
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
			case RealtimestatechartPackage.STATE__DERIVED_EXIT_POINTS:
				getDerivedExitPoints().clear();
				getDerivedExitPoints().addAll((Collection<? extends ExitPoint>)newValue);
				return;
			case RealtimestatechartPackage.STATE__DERIVED_ENTRY_POINTS:
				getDerivedEntryPoints().clear();
				getDerivedEntryPoints().addAll((Collection<? extends EntryPoint>)newValue);
				return;
			case RealtimestatechartPackage.STATE__URGENT:
				setUrgent((Boolean)newValue);
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
			case RealtimestatechartPackage.STATE__DO_EVENT:
				setDoEvent((DoEvent)null);
				return;
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
				setExitEvent((ExitEvent)null);
				return;
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
				setEntryEvent((EntryEvent)null);
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
			case RealtimestatechartPackage.STATE__DERIVED_EXIT_POINTS:
				getDerivedExitPoints().clear();
				return;
			case RealtimestatechartPackage.STATE__DERIVED_ENTRY_POINTS:
				getDerivedEntryPoints().clear();
				return;
			case RealtimestatechartPackage.STATE__URGENT:
				setUrgent(URGENT_EDEFAULT);
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
			case RealtimestatechartPackage.STATE__DERIVED_EXIT_POINTS:
				return derivedExitPoints != null && !derivedExitPoints.isEmpty();
			case RealtimestatechartPackage.STATE__DERIVED_ENTRY_POINTS:
				return derivedEntryPoints != null && !derivedEntryPoints.isEmpty();
			case RealtimestatechartPackage.STATE__URGENT:
				return urgent != URGENT_EDEFAULT;
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
