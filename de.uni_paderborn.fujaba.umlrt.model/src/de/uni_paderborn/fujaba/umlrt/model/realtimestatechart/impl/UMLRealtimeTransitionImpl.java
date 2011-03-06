/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLClock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeAction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFadingFunction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeConstraint;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLTimeguardAtom;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Realtime Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getUMLRealtimeTransitionMappingVector <em>UML Realtime Transition Mapping Vector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getSendSynchronization <em>Send Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getReceiveSynchronization <em>Receive Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getSideEffect <em>Side Effect</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getTargetUMLRealtimeState <em>Target UML Realtime State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getSourceUMLRealtimeState <em>Source UML Realtime State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getUMLRealtimeFlatSwitching <em>UML Realtime Flat Switching</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getUMLRealtimeFadingFunction <em>UML Realtime Fading Function</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getTriggerEvents <em>Trigger Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getRaisedEvents <em>Raised Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getTimeguard <em>Timeguard</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeTransitionImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLRealtimeTransitionImpl extends EObjectImpl implements UMLRealtimeTransition {
	/**
	 * The default value of the '{@link #getUMLRealtimeTransitionMappingVector() <em>UML Realtime Transition Mapping Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeTransitionMappingVector()
	 * @generated
	 * @ordered
	 */
	protected static final Vector UML_REALTIME_TRANSITION_MAPPING_VECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUMLRealtimeTransitionMappingVector() <em>UML Realtime Transition Mapping Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeTransitionMappingVector()
	 * @generated
	 * @ordered
	 */
	protected Vector uMLRealtimeTransitionMappingVector = UML_REALTIME_TRANSITION_MAPPING_VECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSendSynchronization() <em>Send Synchronization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendSynchronization()
	 * @generated
	 * @ordered
	 */
	protected Synchronization sendSynchronization;

	/**
	 * The cached value of the '{@link #getReceiveSynchronization() <em>Receive Synchronization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveSynchronization()
	 * @generated
	 * @ordered
	 */
	protected Synchronization receiveSynchronization;

	/**
	 * The cached value of the '{@link #getSideEffect() <em>Side Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideEffect()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeAction sideEffect;

	/**
	 * The cached value of the '{@link #getTargetUMLRealtimeState() <em>Target UML Realtime State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUMLRealtimeState()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeState targetUMLRealtimeState;

	/**
	 * The cached value of the '{@link #getSourceUMLRealtimeState() <em>Source UML Realtime State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUMLRealtimeState()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeState sourceUMLRealtimeState;

	/**
	 * The cached value of the '{@link #getUMLRealtimeStatechart() <em>UML Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeStatechart uMLRealtimeStatechart;

	/**
	 * The cached value of the '{@link #getResets() <em>Resets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResets()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLClock> resets;

	/**
	 * The cached value of the '{@link #getUMLRealtimeFlatSwitching() <em>UML Realtime Flat Switching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeFlatSwitching()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeFlatSwitching uMLRealtimeFlatSwitching;

	/**
	 * The cached value of the '{@link #getUMLRealtimeFadingFunction() <em>UML Realtime Fading Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeFadingFunction uMLRealtimeFadingFunction;

	/**
	 * The cached value of the '{@link #getTriggerEvents() <em>Trigger Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLRealtimeEvent> triggerEvents;

	/**
	 * The cached value of the '{@link #getRaisedEvents() <em>Raised Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLRealtimeEvent> raisedEvents;

	/**
	 * The cached value of the '{@link #getTimeguard() <em>Timeguard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeguard()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLTimeConstraint> timeguard;

	/**
	 * The cached value of the '{@link #getAbsoluteDeadlines() <em>Absolute Deadlines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteDeadlines()
	 * @generated
	 * @ordered
	 */
	protected EList<AbsoluteDeadline> absoluteDeadlines;

	/**
	 * The cached value of the '{@link #getRelativeDeadline() <em>Relative Deadline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeDeadline()
	 * @generated
	 * @ordered
	 */
	protected RelativeDeadline relativeDeadline;

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
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Expression guard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector getUMLRealtimeTransitionMappingVector() {
		return uMLRealtimeTransitionMappingVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeTransitionMappingVector(Vector newUMLRealtimeTransitionMappingVector) {
		Vector oldUMLRealtimeTransitionMappingVector = uMLRealtimeTransitionMappingVector;
		uMLRealtimeTransitionMappingVector = newUMLRealtimeTransitionMappingVector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR, oldUMLRealtimeTransitionMappingVector, uMLRealtimeTransitionMappingVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization getSendSynchronization() {
		if (sendSynchronization != null && sendSynchronization.eIsProxy()) {
			InternalEObject oldSendSynchronization = (InternalEObject)sendSynchronization;
			sendSynchronization = (Synchronization)eResolveProxy(oldSendSynchronization);
			if (sendSynchronization != oldSendSynchronization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION, oldSendSynchronization, sendSynchronization));
			}
		}
		return sendSynchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization basicGetSendSynchronization() {
		return sendSynchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendSynchronization(Synchronization newSendSynchronization, NotificationChain msgs) {
		Synchronization oldSendSynchronization = sendSynchronization;
		sendSynchronization = newSendSynchronization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION, oldSendSynchronization, newSendSynchronization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendSynchronization(Synchronization newSendSynchronization) {
		if (newSendSynchronization != sendSynchronization) {
			NotificationChain msgs = null;
			if (sendSynchronization != null)
				msgs = ((InternalEObject)sendSynchronization).eInverseRemove(this, RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV, Synchronization.class, msgs);
			if (newSendSynchronization != null)
				msgs = ((InternalEObject)newSendSynchronization).eInverseAdd(this, RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV, Synchronization.class, msgs);
			msgs = basicSetSendSynchronization(newSendSynchronization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION, newSendSynchronization, newSendSynchronization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization getReceiveSynchronization() {
		if (receiveSynchronization != null && receiveSynchronization.eIsProxy()) {
			InternalEObject oldReceiveSynchronization = (InternalEObject)receiveSynchronization;
			receiveSynchronization = (Synchronization)eResolveProxy(oldReceiveSynchronization);
			if (receiveSynchronization != oldReceiveSynchronization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION, oldReceiveSynchronization, receiveSynchronization));
			}
		}
		return receiveSynchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization basicGetReceiveSynchronization() {
		return receiveSynchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveSynchronization(Synchronization newReceiveSynchronization, NotificationChain msgs) {
		Synchronization oldReceiveSynchronization = receiveSynchronization;
		receiveSynchronization = newReceiveSynchronization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION, oldReceiveSynchronization, newReceiveSynchronization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveSynchronization(Synchronization newReceiveSynchronization) {
		if (newReceiveSynchronization != receiveSynchronization) {
			NotificationChain msgs = null;
			if (receiveSynchronization != null)
				msgs = ((InternalEObject)receiveSynchronization).eInverseRemove(this, RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV, Synchronization.class, msgs);
			if (newReceiveSynchronization != null)
				msgs = ((InternalEObject)newReceiveSynchronization).eInverseAdd(this, RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV, Synchronization.class, msgs);
			msgs = basicSetReceiveSynchronization(newReceiveSynchronization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION, newReceiveSynchronization, newReceiveSynchronization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeAction getSideEffect() {
		return sideEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSideEffect(UMLRealtimeAction newSideEffect, NotificationChain msgs) {
		UMLRealtimeAction oldSideEffect = sideEffect;
		sideEffect = newSideEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT, oldSideEffect, newSideEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideEffect(UMLRealtimeAction newSideEffect) {
		if (newSideEffect != sideEffect) {
			NotificationChain msgs = null;
			if (sideEffect != null)
				msgs = ((InternalEObject)sideEffect).eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION, UMLRealtimeAction.class, msgs);
			if (newSideEffect != null)
				msgs = ((InternalEObject)newSideEffect).eInverseAdd(this, RealtimestatechartPackage.UML_REALTIME_ACTION__UML_REALTIME_TRANSITION, UMLRealtimeAction.class, msgs);
			msgs = basicSetSideEffect(newSideEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT, newSideEffect, newSideEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeState getTargetUMLRealtimeState() {
		if (targetUMLRealtimeState != null && targetUMLRealtimeState.eIsProxy()) {
			InternalEObject oldTargetUMLRealtimeState = (InternalEObject)targetUMLRealtimeState;
			targetUMLRealtimeState = (UMLRealtimeState)eResolveProxy(oldTargetUMLRealtimeState);
			if (targetUMLRealtimeState != oldTargetUMLRealtimeState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_REALTIME_TRANSITION__TARGET_UML_REALTIME_STATE, oldTargetUMLRealtimeState, targetUMLRealtimeState));
			}
		}
		return targetUMLRealtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeState basicGetTargetUMLRealtimeState() {
		return targetUMLRealtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUMLRealtimeState(UMLRealtimeState newTargetUMLRealtimeState) {
		UMLRealtimeState oldTargetUMLRealtimeState = targetUMLRealtimeState;
		targetUMLRealtimeState = newTargetUMLRealtimeState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__TARGET_UML_REALTIME_STATE, oldTargetUMLRealtimeState, targetUMLRealtimeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeState getSourceUMLRealtimeState() {
		if (sourceUMLRealtimeState != null && sourceUMLRealtimeState.eIsProxy()) {
			InternalEObject oldSourceUMLRealtimeState = (InternalEObject)sourceUMLRealtimeState;
			sourceUMLRealtimeState = (UMLRealtimeState)eResolveProxy(oldSourceUMLRealtimeState);
			if (sourceUMLRealtimeState != oldSourceUMLRealtimeState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SOURCE_UML_REALTIME_STATE, oldSourceUMLRealtimeState, sourceUMLRealtimeState));
			}
		}
		return sourceUMLRealtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeState basicGetSourceUMLRealtimeState() {
		return sourceUMLRealtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceUMLRealtimeState(UMLRealtimeState newSourceUMLRealtimeState) {
		UMLRealtimeState oldSourceUMLRealtimeState = sourceUMLRealtimeState;
		sourceUMLRealtimeState = newSourceUMLRealtimeState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__SOURCE_UML_REALTIME_STATE, oldSourceUMLRealtimeState, sourceUMLRealtimeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeStatechart getUMLRealtimeStatechart() {
		if (uMLRealtimeStatechart != null && uMLRealtimeStatechart.eIsProxy()) {
			InternalEObject oldUMLRealtimeStatechart = (InternalEObject)uMLRealtimeStatechart;
			uMLRealtimeStatechart = (UMLRealtimeStatechart)eResolveProxy(oldUMLRealtimeStatechart);
			if (uMLRealtimeStatechart != oldUMLRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
			}
		}
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeStatechart basicGetUMLRealtimeStatechart() {
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeStatechart(UMLRealtimeStatechart newUMLRealtimeStatechart) {
		UMLRealtimeStatechart oldUMLRealtimeStatechart = uMLRealtimeStatechart;
		uMLRealtimeStatechart = newUMLRealtimeStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLClock> getResets() {
		if (resets == null) {
			resets = new EObjectContainmentEList<UMLClock>(UMLClock.class, this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RESETS);
		}
		return resets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeFlatSwitching getUMLRealtimeFlatSwitching() {
		return uMLRealtimeFlatSwitching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeFlatSwitching(UMLRealtimeFlatSwitching newUMLRealtimeFlatSwitching, NotificationChain msgs) {
		UMLRealtimeFlatSwitching oldUMLRealtimeFlatSwitching = uMLRealtimeFlatSwitching;
		uMLRealtimeFlatSwitching = newUMLRealtimeFlatSwitching;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING, oldUMLRealtimeFlatSwitching, newUMLRealtimeFlatSwitching);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeFlatSwitching(UMLRealtimeFlatSwitching newUMLRealtimeFlatSwitching) {
		if (newUMLRealtimeFlatSwitching != uMLRealtimeFlatSwitching) {
			NotificationChain msgs = null;
			if (uMLRealtimeFlatSwitching != null)
				msgs = ((InternalEObject)uMLRealtimeFlatSwitching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING, null, msgs);
			if (newUMLRealtimeFlatSwitching != null)
				msgs = ((InternalEObject)newUMLRealtimeFlatSwitching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING, null, msgs);
			msgs = basicSetUMLRealtimeFlatSwitching(newUMLRealtimeFlatSwitching, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING, newUMLRealtimeFlatSwitching, newUMLRealtimeFlatSwitching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeFadingFunction getUMLRealtimeFadingFunction() {
		return uMLRealtimeFadingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeFadingFunction(UMLRealtimeFadingFunction newUMLRealtimeFadingFunction, NotificationChain msgs) {
		UMLRealtimeFadingFunction oldUMLRealtimeFadingFunction = uMLRealtimeFadingFunction;
		uMLRealtimeFadingFunction = newUMLRealtimeFadingFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION, oldUMLRealtimeFadingFunction, newUMLRealtimeFadingFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeFadingFunction(UMLRealtimeFadingFunction newUMLRealtimeFadingFunction) {
		if (newUMLRealtimeFadingFunction != uMLRealtimeFadingFunction) {
			NotificationChain msgs = null;
			if (uMLRealtimeFadingFunction != null)
				msgs = ((InternalEObject)uMLRealtimeFadingFunction).eInverseRemove(this, RealtimestatechartPackage.UML_REALTIME_FADING_FUNCTION__UML_REALTIME_TRANSITIONS, UMLRealtimeFadingFunction.class, msgs);
			if (newUMLRealtimeFadingFunction != null)
				msgs = ((InternalEObject)newUMLRealtimeFadingFunction).eInverseAdd(this, RealtimestatechartPackage.UML_REALTIME_FADING_FUNCTION__UML_REALTIME_TRANSITIONS, UMLRealtimeFadingFunction.class, msgs);
			msgs = basicSetUMLRealtimeFadingFunction(newUMLRealtimeFadingFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION, newUMLRealtimeFadingFunction, newUMLRealtimeFadingFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLRealtimeEvent> getTriggerEvents() {
		if (triggerEvents == null) {
			triggerEvents = new EObjectContainmentEList<UMLRealtimeEvent>(UMLRealtimeEvent.class, this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__TRIGGER_EVENTS);
		}
		return triggerEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLRealtimeEvent> getRaisedEvents() {
		if (raisedEvents == null) {
			raisedEvents = new EObjectContainmentEList<UMLRealtimeEvent>(UMLRealtimeEvent.class, this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RAISED_EVENTS);
		}
		return raisedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLTimeConstraint> getTimeguard() {
		if (timeguard == null) {
			timeguard = new EObjectContainmentEList<UMLTimeConstraint>(UMLTimeConstraint.class, this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__TIMEGUARD);
		}
		return timeguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbsoluteDeadline> getAbsoluteDeadlines() {
		if (absoluteDeadlines == null) {
			absoluteDeadlines = new EObjectContainmentWithInverseEList<AbsoluteDeadline>(AbsoluteDeadline.class, this, RealtimestatechartPackage.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES, RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION);
		}
		return absoluteDeadlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeDeadline getRelativeDeadline() {
		if (relativeDeadline != null && relativeDeadline.eIsProxy()) {
			InternalEObject oldRelativeDeadline = (InternalEObject)relativeDeadline;
			relativeDeadline = (RelativeDeadline)eResolveProxy(oldRelativeDeadline);
			if (relativeDeadline != oldRelativeDeadline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RELATIVE_DEADLINE, oldRelativeDeadline, relativeDeadline));
			}
		}
		return relativeDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeDeadline basicGetRelativeDeadline() {
		return relativeDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativeDeadline(RelativeDeadline newRelativeDeadline, NotificationChain msgs) {
		RelativeDeadline oldRelativeDeadline = relativeDeadline;
		relativeDeadline = newRelativeDeadline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RELATIVE_DEADLINE, oldRelativeDeadline, newRelativeDeadline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeDeadline(RelativeDeadline newRelativeDeadline) {
		if (newRelativeDeadline != relativeDeadline) {
			NotificationChain msgs = null;
			if (relativeDeadline != null)
				msgs = ((InternalEObject)relativeDeadline).eInverseRemove(this, RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION, RelativeDeadline.class, msgs);
			if (newRelativeDeadline != null)
				msgs = ((InternalEObject)newRelativeDeadline).eInverseAdd(this, RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION, RelativeDeadline.class, msgs);
			msgs = basicSetRelativeDeadline(newRelativeDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__RELATIVE_DEADLINE, newRelativeDeadline, newRelativeDeadline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__URGENT, oldUrgent, urgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject)guard;
			guard = (Expression)eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_REALTIME_TRANSITION__GUARD, oldGuard, guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Expression newGuard) {
		Expression oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_TRANSITION__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasClockInUMLClockResetAtom(UMLClock clock) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalNumber calculateWorstCaseDeadlineAsNaturalNumber() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean resetsClock(UMLClock clock) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject clone(UMLRealtimeStatechart rtsc, UMLRealtimeTransition newTransition) {
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
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION:
				if (sendSynchronization != null)
					msgs = ((InternalEObject)sendSynchronization).eInverseRemove(this, RealtimestatechartPackage.SYNCHRONIZATION__SEND_SYNC_REV, Synchronization.class, msgs);
				return basicSetSendSynchronization((Synchronization)otherEnd, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION:
				if (receiveSynchronization != null)
					msgs = ((InternalEObject)receiveSynchronization).eInverseRemove(this, RealtimestatechartPackage.SYNCHRONIZATION__RECEIVE_SYNC_REV, Synchronization.class, msgs);
				return basicSetReceiveSynchronization((Synchronization)otherEnd, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT:
				if (sideEffect != null)
					msgs = ((InternalEObject)sideEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT, null, msgs);
				return basicSetSideEffect((UMLRealtimeAction)otherEnd, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION:
				if (uMLRealtimeFadingFunction != null)
					msgs = ((InternalEObject)uMLRealtimeFadingFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION, null, msgs);
				return basicSetUMLRealtimeFadingFunction((UMLRealtimeFadingFunction)otherEnd, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbsoluteDeadlines()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RELATIVE_DEADLINE:
				if (relativeDeadline != null)
					msgs = ((InternalEObject)relativeDeadline).eInverseRemove(this, RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION, RelativeDeadline.class, msgs);
				return basicSetRelativeDeadline((RelativeDeadline)otherEnd, msgs);
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
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION:
				return basicSetSendSynchronization(null, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION:
				return basicSetReceiveSynchronization(null, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT:
				return basicSetSideEffect(null, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RESETS:
				return ((InternalEList<?>)getResets()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING:
				return basicSetUMLRealtimeFlatSwitching(null, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION:
				return basicSetUMLRealtimeFadingFunction(null, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TRIGGER_EVENTS:
				return ((InternalEList<?>)getTriggerEvents()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RAISED_EVENTS:
				return ((InternalEList<?>)getRaisedEvents()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TIMEGUARD:
				return ((InternalEList<?>)getTimeguard()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES:
				return ((InternalEList<?>)getAbsoluteDeadlines()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RELATIVE_DEADLINE:
				return basicSetRelativeDeadline(null, msgs);
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
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR:
				return getUMLRealtimeTransitionMappingVector();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__PRIORITY:
				return getPriority();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION:
				if (resolve) return getSendSynchronization();
				return basicGetSendSynchronization();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION:
				if (resolve) return getReceiveSynchronization();
				return basicGetReceiveSynchronization();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT:
				return getSideEffect();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TARGET_UML_REALTIME_STATE:
				if (resolve) return getTargetUMLRealtimeState();
				return basicGetTargetUMLRealtimeState();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SOURCE_UML_REALTIME_STATE:
				if (resolve) return getSourceUMLRealtimeState();
				return basicGetSourceUMLRealtimeState();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_STATECHART:
				if (resolve) return getUMLRealtimeStatechart();
				return basicGetUMLRealtimeStatechart();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RESETS:
				return getResets();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING:
				return getUMLRealtimeFlatSwitching();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION:
				return getUMLRealtimeFadingFunction();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TRIGGER_EVENTS:
				return getTriggerEvents();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RAISED_EVENTS:
				return getRaisedEvents();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TIMEGUARD:
				return getTimeguard();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES:
				return getAbsoluteDeadlines();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RELATIVE_DEADLINE:
				if (resolve) return getRelativeDeadline();
				return basicGetRelativeDeadline();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__URGENT:
				return isUrgent();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__GUARD:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR:
				setUMLRealtimeTransitionMappingVector((Vector)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION:
				setSendSynchronization((Synchronization)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION:
				setReceiveSynchronization((Synchronization)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT:
				setSideEffect((UMLRealtimeAction)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TARGET_UML_REALTIME_STATE:
				setTargetUMLRealtimeState((UMLRealtimeState)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SOURCE_UML_REALTIME_STATE:
				setSourceUMLRealtimeState((UMLRealtimeState)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((UMLRealtimeStatechart)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RESETS:
				getResets().clear();
				getResets().addAll((Collection<? extends UMLClock>)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING:
				setUMLRealtimeFlatSwitching((UMLRealtimeFlatSwitching)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION:
				setUMLRealtimeFadingFunction((UMLRealtimeFadingFunction)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TRIGGER_EVENTS:
				getTriggerEvents().clear();
				getTriggerEvents().addAll((Collection<? extends UMLRealtimeEvent>)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RAISED_EVENTS:
				getRaisedEvents().clear();
				getRaisedEvents().addAll((Collection<? extends UMLRealtimeEvent>)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TIMEGUARD:
				getTimeguard().clear();
				getTimeguard().addAll((Collection<? extends UMLTimeConstraint>)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES:
				getAbsoluteDeadlines().clear();
				getAbsoluteDeadlines().addAll((Collection<? extends AbsoluteDeadline>)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RELATIVE_DEADLINE:
				setRelativeDeadline((RelativeDeadline)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__URGENT:
				setUrgent((Boolean)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__GUARD:
				setGuard((Expression)newValue);
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
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR:
				setUMLRealtimeTransitionMappingVector(UML_REALTIME_TRANSITION_MAPPING_VECTOR_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION:
				setSendSynchronization((Synchronization)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION:
				setReceiveSynchronization((Synchronization)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT:
				setSideEffect((UMLRealtimeAction)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TARGET_UML_REALTIME_STATE:
				setTargetUMLRealtimeState((UMLRealtimeState)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SOURCE_UML_REALTIME_STATE:
				setSourceUMLRealtimeState((UMLRealtimeState)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((UMLRealtimeStatechart)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RESETS:
				getResets().clear();
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING:
				setUMLRealtimeFlatSwitching((UMLRealtimeFlatSwitching)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION:
				setUMLRealtimeFadingFunction((UMLRealtimeFadingFunction)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TRIGGER_EVENTS:
				getTriggerEvents().clear();
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RAISED_EVENTS:
				getRaisedEvents().clear();
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TIMEGUARD:
				getTimeguard().clear();
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES:
				getAbsoluteDeadlines().clear();
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RELATIVE_DEADLINE:
				setRelativeDeadline((RelativeDeadline)null);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__URGENT:
				setUrgent(URGENT_EDEFAULT);
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__GUARD:
				setGuard((Expression)null);
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
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR:
				return UML_REALTIME_TRANSITION_MAPPING_VECTOR_EDEFAULT == null ? uMLRealtimeTransitionMappingVector != null : !UML_REALTIME_TRANSITION_MAPPING_VECTOR_EDEFAULT.equals(uMLRealtimeTransitionMappingVector);
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION:
				return sendSynchronization != null;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION:
				return receiveSynchronization != null;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT:
				return sideEffect != null;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TARGET_UML_REALTIME_STATE:
				return targetUMLRealtimeState != null;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SOURCE_UML_REALTIME_STATE:
				return sourceUMLRealtimeState != null;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_STATECHART:
				return uMLRealtimeStatechart != null;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RESETS:
				return resets != null && !resets.isEmpty();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING:
				return uMLRealtimeFlatSwitching != null;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION:
				return uMLRealtimeFadingFunction != null;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TRIGGER_EVENTS:
				return triggerEvents != null && !triggerEvents.isEmpty();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RAISED_EVENTS:
				return raisedEvents != null && !raisedEvents.isEmpty();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TIMEGUARD:
				return timeguard != null && !timeguard.isEmpty();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES:
				return absoluteDeadlines != null && !absoluteDeadlines.isEmpty();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RELATIVE_DEADLINE:
				return relativeDeadline != null;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__URGENT:
				return urgent != URGENT_EDEFAULT;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__GUARD:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION___HAS_CLOCK_IN_UML_CLOCK_RESET_ATOM__UMLCLOCK:
				return hasClockInUMLClockResetAtom((UMLClock)arguments.get(0));
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION___CALCULATE_WORST_CASE_DEADLINE_AS_NATURAL_NUMBER:
				return calculateWorstCaseDeadlineAsNaturalNumber();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION___GET_DEFAULT_NAME:
				return getDefaultName();
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION___RESETS_CLOCK__UMLCLOCK:
				return resetsClock((UMLClock)arguments.get(0));
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION___CLONE__UMLREALTIMESTATECHART_UMLREALTIMETRANSITION:
				return clone((UMLRealtimeStatechart)arguments.get(0), (UMLRealtimeTransition)arguments.get(1));
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
		result.append(" (uMLRealtimeTransitionMappingVector: ");
		result.append(uMLRealtimeTransitionMappingVector);
		result.append(", priority: ");
		result.append(priority);
		result.append(", urgent: ");
		result.append(urgent);
		result.append(')');
		return result.toString();
	}

} //UMLRealtimeTransitionImpl
