/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.CommentableElement;
import org.muml.core.CorePackage;
import org.muml.core.ExtendableElement;
import org.muml.core.Extension;
import org.muml.core.common.adapter.DerivedAttributeAdapter;
import org.muml.core.expressions.Expression;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.realtimestatechart.AbsoluteDeadline;
import org.muml.pim.realtimestatechart.Action;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.ClockConstraint;
import org.muml.pim.realtimestatechart.EventKind;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.RelativeDeadline;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationKind;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.TransitionEvent;
import org.muml.pim.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getSynchronization <em>Synchronization</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getClockResets <em>Clock Resets</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getTriggerMessageEvent <em>Trigger Message Event</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getRaiseMessageEvent <em>Raise Message Event</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getClockConstraints <em>Clock Constraints</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#isBlockable <em>Blockable</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getReceiverMessageTypes <em>Receiver Message Types</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.TransitionImpl#getSenderMessageTypes <em>Sender Message Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends PrioritizedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = "\"no comment provided\"";

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	// TODO: Why is this not generated?
	protected static final SynchronizationKind SYNCHRONIZATION_CHANNEL_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSynchronization() <em>Synchronization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronization()
	 * @generated
	 * @ordered
	 */
	protected Synchronization synchronization;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Vertex target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Vertex source;

	/**
	 * The cached setting delegate for the '{@link #getStatechart() <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate STATECHART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__STATECHART).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getClockResets() <em>Clock Resets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockResets()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> clockResets;

	/**
	 * The cached setting delegate for the '{@link #getTriggerMessageEvent() <em>Trigger Message Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerMessageEvent()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TRIGGER_MESSAGE_EVENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__TRIGGER_MESSAGE_EVENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getRaiseMessageEvent() <em>Raise Message Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseMessageEvent()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RAISE_MESSAGE_EVENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__RAISE_MESSAGE_EVENT).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getClockConstraints() <em>Clock Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockConstraint> clockConstraints;

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
	 * The cached value of the '{@link #getRelativeDeadline() <em>Relative Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeDeadline()
	 * @generated
	 * @ordered
	 */
	protected RelativeDeadline relativeDeadline;

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
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Expression guard;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionEvent> events;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The default value of the '{@link #isUrgent() <em>Urgent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUrgent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean URGENT_EDEFAULT = true;

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
	 * The cached setting delegate for the '{@link #getReceiverMessageTypes() <em>Receiver Message Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RECEIVER_MESSAGE_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__RECEIVER_MESSAGE_TYPES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSenderMessageTypes() <em>Sender Message Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SENDER_MESSAGE_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__SENDER_MESSAGE_TYPES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TransitionImpl() {
		super();
		DerivedAttributeAdapter derivedAdapter = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.TRANSITION__STATECHART);
		derivedAdapter.addLocalDependency(RealtimestatechartPackage.Literals.TRANSITION__SOURCE);
		derivedAdapter.addLocalDependency(RealtimestatechartPackage.Literals.TRANSITION__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentWithInverseEList<Extension>(Extension.class, this, RealtimestatechartPackage.TRANSITION__EXTENSIONS, CorePackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization getSynchronization() {
		return synchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronization(Synchronization newSynchronization, NotificationChain msgs) {
		Synchronization oldSynchronization = synchronization;
		synchronization = newSynchronization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION, oldSynchronization, newSynchronization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronization(Synchronization newSynchronization) {
		if (newSynchronization != synchronization) {
			NotificationChain msgs = null;
			if (synchronization != null)
				msgs = ((InternalEObject)synchronization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION, null, msgs);
			if (newSynchronization != null)
				msgs = ((InternalEObject)newSynchronization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION, null, msgs);
			msgs = basicSetSynchronization(newSynchronization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION, newSynchronization, newSynchronization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Vertex)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Vertex newTarget, NotificationChain msgs) {
		Vertex oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Vertex newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS, Vertex.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS, Vertex.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Vertex)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Vertex newSource, NotificationChain msgs) {
		Vertex oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Vertex newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS, Vertex.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS, Vertex.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart getStatechart() {
		return (RealtimeStatechart)STATECHART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart basicGetStatechart() {
		return (RealtimeStatechart)STATECHART__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getClockResets() {
		if (clockResets == null) {
			clockResets = new EObjectResolvingEList<Clock>(Clock.class, this, RealtimestatechartPackage.TRANSITION__CLOCK_RESETS);
		}
		return clockResets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEvent getTriggerMessageEvent() {
		return (AsynchronousMessageEvent)TRIGGER_MESSAGE_EVENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEvent basicGetTriggerMessageEvent() {
		return (AsynchronousMessageEvent)TRIGGER_MESSAGE_EVENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTriggerMessageEvent(AsynchronousMessageEvent newTriggerMessageEvent) {
		// TODO: Create ItemProvider in edit code for this!
		if (newTriggerMessageEvent != null) {
			Assert.isLegal(
					newTriggerMessageEvent.getKind() == EventKind.TRIGGER,
					"This AsynchronousMessageEvent does not have an EventType of TRIGGER.");
		}

		Iterator<TransitionEvent> it = getEvents().iterator();
		while (it.hasNext()) {
			TransitionEvent event = it.next();
			if (event instanceof AsynchronousMessageEvent && event.getKind() == EventKind.TRIGGER) {
				it.remove();
			}
		}
		
		if (newTriggerMessageEvent != null) {
			getEvents().add(newTriggerMessageEvent);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEvent getRaiseMessageEvent() {
		return (AsynchronousMessageEvent)RAISE_MESSAGE_EVENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEvent basicGetRaiseMessageEvent() {
		return (AsynchronousMessageEvent)RAISE_MESSAGE_EVENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRaiseMessageEvent(AsynchronousMessageEvent newRaiseMessageEvent) {
		// TODO: Create ItemProvider in edit code for this!
		if (newRaiseMessageEvent != null) {
			Assert.isLegal(newRaiseMessageEvent.getKind() == EventKind.RAISE,
					"This AsynchronousMessageEvent does not have an EventType of RAISE.");
		}

		Iterator<TransitionEvent> it = getEvents().iterator();
		while (it.hasNext()) {
			TransitionEvent event = it.next();
			if (event instanceof AsynchronousMessageEvent && event.getKind() == EventKind.RAISE) {
				it.remove();
			}
		}
		
		if (newRaiseMessageEvent != null) {
			getEvents().add(newRaiseMessageEvent);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockConstraint> getClockConstraints() {
		if (clockConstraints == null) {
			clockConstraints = new EObjectContainmentEList<ClockConstraint>(ClockConstraint.class, this, RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINTS);
		}
		return clockConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbsoluteDeadline> getAbsoluteDeadlines() {
		if (absoluteDeadlines == null) {
			absoluteDeadlines = new EObjectContainmentEList<AbsoluteDeadline>(AbsoluteDeadline.class, this, RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES);
		}
		return absoluteDeadlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeDeadline getRelativeDeadline() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE, oldRelativeDeadline, newRelativeDeadline);
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
				msgs = ((InternalEObject)relativeDeadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE, null, msgs);
			if (newRelativeDeadline != null)
				msgs = ((InternalEObject)newRelativeDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE, null, msgs);
			msgs = basicSetRelativeDeadline(newRelativeDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE, newRelativeDeadline, newRelativeDeadline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__BLOCKABLE, oldBlockable, blockable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Expression newGuard, NotificationChain msgs) {
		Expression oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Expression newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<TransitionEvent>(TransitionEvent.class, this, RealtimestatechartPackage.TRANSITION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__ACTION, newAction, newAction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__URGENT, oldUrgent, urgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageType> getReceiverMessageTypes() {
		return (EList<MessageType>)RECEIVER_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageType> getSenderMessageTypes() {
		return (EList<MessageType>)SENDER_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(final EClass type) {
		EList<Extension> extensions = this.getExtensions();
						for (Extension extension : extensions) {
							if (type.isInstance(extension)) {
								return extension;
							}
						}
						return null;
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
			case RealtimestatechartPackage.TRANSITION__EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS, Vertex.class, msgs);
				return basicSetTarget((Vertex)otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS, Vertex.class, msgs);
				return basicSetSource((Vertex)otherEnd, msgs);
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
			case RealtimestatechartPackage.TRANSITION__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
				return basicSetSynchronization(null, msgs);
			case RealtimestatechartPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINTS:
				return ((InternalEList<?>)getClockConstraints()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				return ((InternalEList<?>)getAbsoluteDeadlines()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
				return basicSetRelativeDeadline(null, msgs);
			case RealtimestatechartPackage.TRANSITION__GUARD:
				return basicSetGuard(null, msgs);
			case RealtimestatechartPackage.TRANSITION__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__ACTION:
				return basicSetAction(null, msgs);
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
			case RealtimestatechartPackage.TRANSITION__EXTENSIONS:
				return getExtensions();
			case RealtimestatechartPackage.TRANSITION__COMMENT:
				return getComment();
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
				return getSynchronization();
			case RealtimestatechartPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				if (resolve) return getStatechart();
				return basicGetStatechart();
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				return getClockResets();
			case RealtimestatechartPackage.TRANSITION__TRIGGER_MESSAGE_EVENT:
				if (resolve) return getTriggerMessageEvent();
				return basicGetTriggerMessageEvent();
			case RealtimestatechartPackage.TRANSITION__RAISE_MESSAGE_EVENT:
				if (resolve) return getRaiseMessageEvent();
				return basicGetRaiseMessageEvent();
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINTS:
				return getClockConstraints();
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				return getAbsoluteDeadlines();
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
				return getRelativeDeadline();
			case RealtimestatechartPackage.TRANSITION__BLOCKABLE:
				return isBlockable();
			case RealtimestatechartPackage.TRANSITION__GUARD:
				return getGuard();
			case RealtimestatechartPackage.TRANSITION__EVENTS:
				return getEvents();
			case RealtimestatechartPackage.TRANSITION__ACTION:
				return getAction();
			case RealtimestatechartPackage.TRANSITION__URGENT:
				return isUrgent();
			case RealtimestatechartPackage.TRANSITION__RECEIVER_MESSAGE_TYPES:
				return getReceiverMessageTypes();
			case RealtimestatechartPackage.TRANSITION__SENDER_MESSAGE_TYPES:
				return getSenderMessageTypes();
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
			case RealtimestatechartPackage.TRANSITION__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__COMMENT:
				setComment((String)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
				setSynchronization((Synchronization)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__TARGET:
				setTarget((Vertex)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				setSource((Vertex)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				getClockResets().clear();
				getClockResets().addAll((Collection<? extends Clock>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINTS:
				getClockConstraints().clear();
				getClockConstraints().addAll((Collection<? extends ClockConstraint>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				getAbsoluteDeadlines().clear();
				getAbsoluteDeadlines().addAll((Collection<? extends AbsoluteDeadline>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
				setRelativeDeadline((RelativeDeadline)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__BLOCKABLE:
				setBlockable((Boolean)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__GUARD:
				setGuard((Expression)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends TransitionEvent>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__ACTION:
				setAction((Action)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__URGENT:
				setUrgent((Boolean)newValue);
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
			case RealtimestatechartPackage.TRANSITION__EXTENSIONS:
				getExtensions().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
				setSynchronization((Synchronization)null);
				return;
			case RealtimestatechartPackage.TRANSITION__TARGET:
				setTarget((Vertex)null);
				return;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				setSource((Vertex)null);
				return;
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				getClockResets().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINTS:
				getClockConstraints().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				getAbsoluteDeadlines().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
				setRelativeDeadline((RelativeDeadline)null);
				return;
			case RealtimestatechartPackage.TRANSITION__BLOCKABLE:
				setBlockable(BLOCKABLE_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__GUARD:
				setGuard((Expression)null);
				return;
			case RealtimestatechartPackage.TRANSITION__EVENTS:
				getEvents().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__ACTION:
				setAction((Action)null);
				return;
			case RealtimestatechartPackage.TRANSITION__URGENT:
				setUrgent(URGENT_EDEFAULT);
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
			case RealtimestatechartPackage.TRANSITION__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
			case RealtimestatechartPackage.TRANSITION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
				return synchronization != null;
			case RealtimestatechartPackage.TRANSITION__TARGET:
				return target != null;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				return source != null;
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				return STATECHART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				return clockResets != null && !clockResets.isEmpty();
			case RealtimestatechartPackage.TRANSITION__TRIGGER_MESSAGE_EVENT:
				return TRIGGER_MESSAGE_EVENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.TRANSITION__RAISE_MESSAGE_EVENT:
				return RAISE_MESSAGE_EVENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINTS:
				return clockConstraints != null && !clockConstraints.isEmpty();
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				return absoluteDeadlines != null && !absoluteDeadlines.isEmpty();
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
				return relativeDeadline != null;
			case RealtimestatechartPackage.TRANSITION__BLOCKABLE:
				return blockable != BLOCKABLE_EDEFAULT;
			case RealtimestatechartPackage.TRANSITION__GUARD:
				return guard != null;
			case RealtimestatechartPackage.TRANSITION__EVENTS:
				return events != null && !events.isEmpty();
			case RealtimestatechartPackage.TRANSITION__ACTION:
				return action != null;
			case RealtimestatechartPackage.TRANSITION__URGENT:
				return urgent != URGENT_EDEFAULT;
			case RealtimestatechartPackage.TRANSITION__RECEIVER_MESSAGE_TYPES:
				return RECEIVER_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.TRANSITION__SENDER_MESSAGE_TYPES:
				return SENDER_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == EObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartPackage.TRANSITION__EXTENSIONS: return CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartPackage.TRANSITION__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
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
		if (baseClass == EObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.EXTENDABLE_ELEMENT__EXTENSIONS: return RealtimestatechartPackage.TRANSITION__EXTENSIONS;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return RealtimestatechartPackage.TRANSITION__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (baseOperationID) {
				case EcorePackage.EOBJECT___ECLASS: return RealtimestatechartPackage.TRANSITION___ECLASS;
				case EcorePackage.EOBJECT___EIS_PROXY: return RealtimestatechartPackage.TRANSITION___EIS_PROXY;
				case EcorePackage.EOBJECT___ERESOURCE: return RealtimestatechartPackage.TRANSITION___ERESOURCE;
				case EcorePackage.EOBJECT___ECONTAINER: return RealtimestatechartPackage.TRANSITION___ECONTAINER;
				case EcorePackage.EOBJECT___ECONTAINING_FEATURE: return RealtimestatechartPackage.TRANSITION___ECONTAINING_FEATURE;
				case EcorePackage.EOBJECT___ECONTAINMENT_FEATURE: return RealtimestatechartPackage.TRANSITION___ECONTAINMENT_FEATURE;
				case EcorePackage.EOBJECT___ECONTENTS: return RealtimestatechartPackage.TRANSITION___ECONTENTS;
				case EcorePackage.EOBJECT___EALL_CONTENTS: return RealtimestatechartPackage.TRANSITION___EALL_CONTENTS;
				case EcorePackage.EOBJECT___ECROSS_REFERENCES: return RealtimestatechartPackage.TRANSITION___ECROSS_REFERENCES;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE: return RealtimestatechartPackage.TRANSITION___EGET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN: return RealtimestatechartPackage.TRANSITION___EGET__ESTRUCTURALFEATURE_BOOLEAN;
				case EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT: return RealtimestatechartPackage.TRANSITION___ESET__ESTRUCTURALFEATURE_OBJECT;
				case EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE: return RealtimestatechartPackage.TRANSITION___EIS_SET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE: return RealtimestatechartPackage.TRANSITION___EUNSET__ESTRUCTURALFEATURE;
				case EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST: return RealtimestatechartPackage.TRANSITION___EINVOKE__EOPERATION_ELIST;
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (baseOperationID) {
				case CorePackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS: return RealtimestatechartPackage.TRANSITION___GET_EXTENSION__ECLASS;
				default: return -1;
			}
		}
		if (baseClass == CommentableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.TRANSITION___GET_EXTENSION__ECLASS:
				return getExtension((EClass)arguments.get(0));
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", blockable: ");
		result.append(blockable);
		result.append(", urgent: ");
		result.append(urgent);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
