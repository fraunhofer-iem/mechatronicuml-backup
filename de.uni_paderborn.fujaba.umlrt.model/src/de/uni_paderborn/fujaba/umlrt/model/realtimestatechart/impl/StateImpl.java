/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.DoEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.EntryOrExitEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Statechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.SynchronizationChannel;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfDiagram;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl#getReconfDiagram <em>Reconf Diagram</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl#getInterfacedStates <em>Interfaced States</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.StateImpl#getInterfaceState <em>Interface State</em>}</li>
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
	protected EntryOrExitEvent exitAction;

	/**
	 * The cached value of the '{@link #getEntryAction() <em>Entry Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryAction()
	 * @generated
	 * @ordered
	 */
	protected EntryOrExitEvent entryAction;

	/**
	 * The cached value of the '{@link #getReconfDiagram() <em>Reconf Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfDiagram()
	 * @generated
	 * @ordered
	 */
	protected ReconfDiagram reconfDiagram;

	/**
	 * The cached value of the '{@link #getInterfacedStates() <em>Interfaced States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> interfacedStates;

	/**
	 * The cached value of the '{@link #getInterfaceState() <em>Interface State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceState()
	 * @generated
	 * @ordered
	 */
	protected State interfaceState;

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
	public EntryOrExitEvent getExitAction() {
		return exitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitAction(EntryOrExitEvent newExitAction, NotificationChain msgs) {
		EntryOrExitEvent oldExitAction = exitAction;
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
	public void setExitAction(EntryOrExitEvent newExitAction) {
		if (newExitAction != exitAction) {
			NotificationChain msgs = null;
			if (exitAction != null)
				msgs = ((InternalEObject)exitAction).eInverseRemove(this, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV, EntryOrExitEvent.class, msgs);
			if (newExitAction != null)
				msgs = ((InternalEObject)newExitAction).eInverseAdd(this, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__EXIT_ACTION_REV, EntryOrExitEvent.class, msgs);
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
	public EntryOrExitEvent getEntryAction() {
		return entryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryAction(EntryOrExitEvent newEntryAction, NotificationChain msgs) {
		EntryOrExitEvent oldEntryAction = entryAction;
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
	public void setEntryAction(EntryOrExitEvent newEntryAction) {
		if (newEntryAction != entryAction) {
			NotificationChain msgs = null;
			if (entryAction != null)
				msgs = ((InternalEObject)entryAction).eInverseRemove(this, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV, EntryOrExitEvent.class, msgs);
			if (newEntryAction != null)
				msgs = ((InternalEObject)newEntryAction).eInverseAdd(this, RealtimestatechartPackage.ENTRY_OR_EXIT_EVENT__ENTRY_ACTION_REV, EntryOrExitEvent.class, msgs);
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
	public ReconfDiagram getReconfDiagram() {
		return reconfDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconfDiagram(ReconfDiagram newReconfDiagram, NotificationChain msgs) {
		ReconfDiagram oldReconfDiagram = reconfDiagram;
		reconfDiagram = newReconfDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__RECONF_DIAGRAM, oldReconfDiagram, newReconfDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfDiagram(ReconfDiagram newReconfDiagram) {
		if (newReconfDiagram != reconfDiagram) {
			NotificationChain msgs = null;
			if (reconfDiagram != null)
				msgs = ((InternalEObject)reconfDiagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__RECONF_DIAGRAM, null, msgs);
			if (newReconfDiagram != null)
				msgs = ((InternalEObject)newReconfDiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__RECONF_DIAGRAM, null, msgs);
			msgs = basicSetReconfDiagram(newReconfDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__RECONF_DIAGRAM, newReconfDiagram, newReconfDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getInterfacedStates() {
		if (interfacedStates == null) {
			interfacedStates = new EObjectResolvingEList<State>(State.class, this, RealtimestatechartPackage.STATE__INTERFACED_STATES);
		}
		return interfacedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInterfaceState() {
		if (interfaceState != null && interfaceState.eIsProxy()) {
			InternalEObject oldInterfaceState = (InternalEObject)interfaceState;
			interfaceState = (State)eResolveProxy(oldInterfaceState);
			if (interfaceState != oldInterfaceState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.STATE__INTERFACE_STATE, oldInterfaceState, interfaceState));
			}
		}
		return interfaceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInterfaceState() {
		return interfaceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceState(State newInterfaceState) {
		State oldInterfaceState = interfaceState;
		interfaceState = newInterfaceState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__INTERFACE_STATE, oldInterfaceState, interfaceState));
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
	public EObject clone(AbstractStatechart rtsc, State newComplexState) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
				return basicSetExitAction((EntryOrExitEvent)otherEnd, msgs);
			case RealtimestatechartPackage.STATE__ENTRY_ACTION:
				if (entryAction != null)
					msgs = ((InternalEObject)entryAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.STATE__ENTRY_ACTION, null, msgs);
				return basicSetEntryAction((EntryOrExitEvent)otherEnd, msgs);
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
			case RealtimestatechartPackage.STATE__RECONF_DIAGRAM:
				return basicSetReconfDiagram(null, msgs);
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
			case RealtimestatechartPackage.STATE__RECONF_DIAGRAM:
				return getReconfDiagram();
			case RealtimestatechartPackage.STATE__INTERFACED_STATES:
				return getInterfacedStates();
			case RealtimestatechartPackage.STATE__INTERFACE_STATE:
				if (resolve) return getInterfaceState();
				return basicGetInterfaceState();
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
				setExitAction((EntryOrExitEvent)newValue);
				return;
			case RealtimestatechartPackage.STATE__ENTRY_ACTION:
				setEntryAction((EntryOrExitEvent)newValue);
				return;
			case RealtimestatechartPackage.STATE__RECONF_DIAGRAM:
				setReconfDiagram((ReconfDiagram)newValue);
				return;
			case RealtimestatechartPackage.STATE__INTERFACED_STATES:
				getInterfacedStates().clear();
				getInterfacedStates().addAll((Collection<? extends State>)newValue);
				return;
			case RealtimestatechartPackage.STATE__INTERFACE_STATE:
				setInterfaceState((State)newValue);
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
				setExitAction((EntryOrExitEvent)null);
				return;
			case RealtimestatechartPackage.STATE__ENTRY_ACTION:
				setEntryAction((EntryOrExitEvent)null);
				return;
			case RealtimestatechartPackage.STATE__RECONF_DIAGRAM:
				setReconfDiagram((ReconfDiagram)null);
				return;
			case RealtimestatechartPackage.STATE__INTERFACED_STATES:
				getInterfacedStates().clear();
				return;
			case RealtimestatechartPackage.STATE__INTERFACE_STATE:
				setInterfaceState((State)null);
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
			case RealtimestatechartPackage.STATE__RECONF_DIAGRAM:
				return reconfDiagram != null;
			case RealtimestatechartPackage.STATE__INTERFACED_STATES:
				return interfacedStates != null && !interfacedStates.isEmpty();
			case RealtimestatechartPackage.STATE__INTERFACE_STATE:
				return interfaceState != null;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.STATE___CLONE__ABSTRACTSTATECHART_STATE:
				return clone((AbstractStatechart)arguments.get(0), (State)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
