/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.DoEvent;
import org.muml.pim.realtimestatechart.EntryEvent;
import org.muml.pim.realtimestatechart.ExitEvent;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.StateConnectionPoint;
import org.muml.pim.realtimestatechart.StateEvent;
import org.muml.pim.realtimestatechart.SynchronizationChannel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#getEmbeddedStatecharts <em>Embedded Statecharts</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#getDoEvent <em>Do Event</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#getExitEvent <em>Exit Event</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#getEntryEvent <em>Entry Event</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#isInitial <em>Initial</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#getConnectionPoints <em>Connection Points</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#isSimple <em>Simple</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#getParentStatechart <em>Parent Statechart</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.StateImpl#getAllAvailableChannels <em>All Available Channels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends VertexImpl implements State {
	/**
	 * The cached value of the '{@link #getEmbeddedStatecharts() <em>Embedded Statecharts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedStatecharts()
	 * @generated
	 * @ordered
	 */
	protected EList<RealtimeStatechart> embeddedStatecharts;

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
	 * The cached setting delegate for the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EVENTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.STATE__EVENTS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getConnectionPoints() <em>Connection Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<StateConnectionPoint> connectionPoints;

	/**
	 * The cached setting delegate for the '{@link #isSimple() <em>Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimple()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SIMPLE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.STATE__SIMPLE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllAvailableChannels() <em>All Available Channels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAvailableChannels()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_AVAILABLE_CHANNELS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.STATE__ALL_AVAILABLE_CHANNELS).getSettingDelegate();

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
	public EList<RealtimeStatechart> getEmbeddedStatecharts() {
		if (embeddedStatecharts == null) {
			embeddedStatecharts = new EObjectContainmentWithInverseEList<RealtimeStatechart>(RealtimeStatechart.class, this, RealtimestatechartPackage.STATE__EMBEDDED_STATECHARTS, RealtimestatechartPackage.REALTIME_STATECHART__PARENT_STATE);
		}
		return embeddedStatecharts;
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
	public EList<StateEvent> getEvents() {
		return (EList<StateEvent>)EVENTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateConnectionPoint> getConnectionPoints() {
		if (connectionPoints == null) {
			connectionPoints = new EObjectContainmentWithInverseEList<StateConnectionPoint>(StateConnectionPoint.class, this, RealtimestatechartPackage.STATE__CONNECTION_POINTS, RealtimestatechartPackage.STATE_CONNECTION_POINT__STATE);
		}
		return connectionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSimple() {
		return (Boolean)SIMPLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSimple() {
		return SIMPLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart getParentStatechart() {
		if (eContainerFeatureID() != RealtimestatechartPackage.STATE__PARENT_STATECHART) return null;
		return (RealtimeStatechart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStatechart(RealtimeStatechart newParentStatechart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStatechart, RealtimestatechartPackage.STATE__PARENT_STATECHART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStatechart(RealtimeStatechart newParentStatechart) {
		if (newParentStatechart != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.STATE__PARENT_STATECHART && newParentStatechart != null)) {
			if (EcoreUtil.isAncestor(this, newParentStatechart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStatechart != null)
				msgs = ((InternalEObject)newParentStatechart).eInverseAdd(this, RealtimestatechartPackage.REALTIME_STATECHART__STATES, RealtimeStatechart.class, msgs);
			msgs = basicSetParentStatechart(newParentStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.STATE__PARENT_STATECHART, newParentStatechart, newParentStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SynchronizationChannel> getAllAvailableChannels() {
		return (EList<SynchronizationChannel>)ALL_AVAILABLE_CHANNELS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUniqueRegionPriority(final int hint) {
		int nextHighestPriority=hint;
		for (; hasRegionOfPriority(nextHighestPriority); nextHighestPriority++);
		return nextHighestPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasRegionOfPriority(final int priority) {
		for (RealtimeStatechart statechart : getEmbeddedStatecharts()) {
			if (statechart.getPriority() == priority) {
				return true;
			}
		}
		return false;
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
			case RealtimestatechartPackage.STATE__EMBEDDED_STATECHARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmbeddedStatecharts()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannels()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__CONNECTION_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectionPoints()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__PARENT_STATECHART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStatechart((RealtimeStatechart)otherEnd, msgs);
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
			case RealtimestatechartPackage.STATE__EMBEDDED_STATECHARTS:
				return ((InternalEList<?>)getEmbeddedStatecharts()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.STATE__CONNECTION_POINTS:
				return ((InternalEList<?>)getConnectionPoints()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.STATE__PARENT_STATECHART:
				return basicSetParentStatechart(null, msgs);
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
			case RealtimestatechartPackage.STATE__PARENT_STATECHART:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.REALTIME_STATECHART__STATES, RealtimeStatechart.class, msgs);
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
			case RealtimestatechartPackage.STATE__EMBEDDED_STATECHARTS:
				return getEmbeddedStatecharts();
			case RealtimestatechartPackage.STATE__DO_EVENT:
				return getDoEvent();
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
				return getExitEvent();
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
				return getEntryEvent();
			case RealtimestatechartPackage.STATE__INVARIANTS:
				return getInvariants();
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
			case RealtimestatechartPackage.STATE__CONNECTION_POINTS:
				return getConnectionPoints();
			case RealtimestatechartPackage.STATE__SIMPLE:
				return isSimple();
			case RealtimestatechartPackage.STATE__PARENT_STATECHART:
				return getParentStatechart();
			case RealtimestatechartPackage.STATE__ALL_AVAILABLE_CHANNELS:
				return getAllAvailableChannels();
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
			case RealtimestatechartPackage.STATE__EMBEDDED_STATECHARTS:
				getEmbeddedStatecharts().clear();
				getEmbeddedStatecharts().addAll((Collection<? extends RealtimeStatechart>)newValue);
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
			case RealtimestatechartPackage.STATE__CONNECTION_POINTS:
				getConnectionPoints().clear();
				getConnectionPoints().addAll((Collection<? extends StateConnectionPoint>)newValue);
				return;
			case RealtimestatechartPackage.STATE__PARENT_STATECHART:
				setParentStatechart((RealtimeStatechart)newValue);
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
			case RealtimestatechartPackage.STATE__EMBEDDED_STATECHARTS:
				getEmbeddedStatecharts().clear();
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
			case RealtimestatechartPackage.STATE__CONNECTION_POINTS:
				getConnectionPoints().clear();
				return;
			case RealtimestatechartPackage.STATE__PARENT_STATECHART:
				setParentStatechart((RealtimeStatechart)null);
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
			case RealtimestatechartPackage.STATE__EMBEDDED_STATECHARTS:
				return embeddedStatecharts != null && !embeddedStatecharts.isEmpty();
			case RealtimestatechartPackage.STATE__DO_EVENT:
				return doEvent != null;
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
				return exitEvent != null;
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
				return entryEvent != null;
			case RealtimestatechartPackage.STATE__INVARIANTS:
				return invariants != null && !invariants.isEmpty();
			case RealtimestatechartPackage.STATE__INITIAL:
				return initial != INITIAL_EDEFAULT;
			case RealtimestatechartPackage.STATE__FINAL:
				return final_ != FINAL_EDEFAULT;
			case RealtimestatechartPackage.STATE__URGENT:
				return urgent != URGENT_EDEFAULT;
			case RealtimestatechartPackage.STATE__CHANNELS:
				return channels != null && !channels.isEmpty();
			case RealtimestatechartPackage.STATE__EVENTS:
				return EVENTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.STATE__CONNECTION_POINTS:
				return connectionPoints != null && !connectionPoints.isEmpty();
			case RealtimestatechartPackage.STATE__SIMPLE:
				return isSetSimple();
			case RealtimestatechartPackage.STATE__PARENT_STATECHART:
				return getParentStatechart() != null;
			case RealtimestatechartPackage.STATE__ALL_AVAILABLE_CHANNELS:
				return ALL_AVAILABLE_CHANNELS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case RealtimestatechartPackage.STATE___GET_UNIQUE_REGION_PRIORITY__INT:
				return getUniqueRegionPriority((Integer)arguments.get(0));
			case RealtimestatechartPackage.STATE___HAS_REGION_OF_PRIORITY__INT:
				return hasRegionOfPriority((Integer)arguments.get(0));
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
		result.append(" (initial: ");
		result.append(initial);
		result.append(", final: ");
		result.append(final_);
		result.append(", urgent: ");
		result.append(urgent);
		result.append(')');
		return result.toString();
	}

} //StateImpl
