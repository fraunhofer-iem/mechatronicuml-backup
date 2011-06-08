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
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.expressions.Expression;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ActionExpression;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.AsynchronousEvent;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getSynchronization <em>Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getClockResets <em>Clock Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getTriggerEvents <em>Trigger Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getRaisedEvents <em>Raised Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getClockConstraints <em>Clock Constraints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#isSafetyTransition <em>Safety Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends PrioritizableImpl implements Transition {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> extensions;

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
	 * The cached value of the '{@link #getTransitionAction() <em>Transition Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionExpression> transitionAction;

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
	 * The cached value of the '{@link #getClockResets() <em>Clock Resets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockResets()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> clockResets;

	/**
	 * The cached value of the '{@link #getTriggerEvents() <em>Trigger Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<AsynchronousEvent> triggerEvents;

	/**
	 * The cached value of the '{@link #getRaisedEvents() <em>Raised Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<AsynchronousEvent> raisedEvents;

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
	 * The default value of the '{@link #isSafetyTransition() <em>Safety Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafetyTransition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFETY_TRANSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafetyTransition() <em>Safety Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafetyTransition()
	 * @generated
	 * @ordered
	 */
	protected boolean safetyTransition = SAFETY_TRANSITION_EDEFAULT;

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
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
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
	protected TransitionImpl() {
		super();
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
	public EList<EAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList.Resolving<EAnnotation>(EAnnotation.class, this, RealtimestatechartPackage.TRANSITION__ANNOTATION);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentWithInverseEList.Resolving<Extension>(Extension.class, this, RealtimestatechartPackage.TRANSITION__EXTENSION, SDMPackage.EXTENSION__EXTENDABLE_BASE);
		}
		return extensions;
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
	public EList<ActionExpression> getTransitionAction() {
		if (transitionAction == null) {
			transitionAction = new EObjectContainmentEList<ActionExpression>(ActionExpression.class, this, RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION);
		}
		return transitionAction;
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
	public FujabaRealtimeStatechart getStatechart() {
		if (eContainerFeatureID() != RealtimestatechartPackage.TRANSITION__STATECHART) return null;
		return (FujabaRealtimeStatechart)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechart(FujabaRealtimeStatechart newStatechart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatechart, RealtimestatechartPackage.TRANSITION__STATECHART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(FujabaRealtimeStatechart newStatechart) {
		if (newStatechart != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.TRANSITION__STATECHART && newStatechart != null)) {
			if (EcoreUtil.isAncestor(this, newStatechart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatechart != null)
				msgs = ((InternalEObject)newStatechart).eInverseAdd(this, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS, FujabaRealtimeStatechart.class, msgs);
			msgs = basicSetStatechart(newStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__STATECHART, newStatechart, newStatechart));
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
	public EList<AsynchronousEvent> getTriggerEvents() {
		if (triggerEvents == null) {
			triggerEvents = new EObjectContainmentWithInverseEList<AsynchronousEvent>(AsynchronousEvent.class, this, RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGERED_TRANSITION);
		}
		return triggerEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsynchronousEvent> getRaisedEvents() {
		if (raisedEvents == null) {
			raisedEvents = new EObjectContainmentWithInverseEList<AsynchronousEvent>(AsynchronousEvent.class, this, RealtimestatechartPackage.TRANSITION__RAISED_EVENTS, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISED_TRANSITION);
		}
		return raisedEvents;
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
			absoluteDeadlines = new EObjectContainmentWithInverseEList<AbsoluteDeadline>(AbsoluteDeadline.class, this, RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES, RealtimestatechartPackage.ABSOLUTE_DEADLINE__TRANSITION);
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
				msgs = ((InternalEObject)relativeDeadline).eInverseRemove(this, RealtimestatechartPackage.RELATIVE_DEADLINE__TRANSITION, RelativeDeadline.class, msgs);
			if (newRelativeDeadline != null)
				msgs = ((InternalEObject)newRelativeDeadline).eInverseAdd(this, RealtimestatechartPackage.RELATIVE_DEADLINE__TRANSITION, RelativeDeadline.class, msgs);
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
	public boolean isSafetyTransition() {
		return safetyTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafetyTransition(boolean newSafetyTransition) {
		boolean oldSafetyTransition = safetyTransition;
		safetyTransition = newSafetyTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SAFETY_TRANSITION, oldSafetyTransition, safetyTransition));
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
	public Extension getExtension(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension provideExtension(EClass type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation provideAnnotation(String source) {
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
			case RealtimestatechartPackage.TRANSITION__EXTENSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS, Vertex.class, msgs);
				return basicSetTarget((Vertex)otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS, Vertex.class, msgs);
				return basicSetSource((Vertex)otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatechart((FujabaRealtimeStatechart)otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggerEvents()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRaisedEvents()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbsoluteDeadlines()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
				if (relativeDeadline != null)
					msgs = ((InternalEObject)relativeDeadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE, null, msgs);
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
			case RealtimestatechartPackage.TRANSITION__ANNOTATION:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__EXTENSION:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
				return basicSetSynchronization(null, msgs);
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION:
				return ((InternalEList<?>)getTransitionAction()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				return basicSetStatechart(null, msgs);
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				return ((InternalEList<?>)getTriggerEvents()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				return ((InternalEList<?>)getRaisedEvents()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINTS:
				return ((InternalEList<?>)getClockConstraints()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				return ((InternalEList<?>)getAbsoluteDeadlines()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
				return basicSetRelativeDeadline(null, msgs);
			case RealtimestatechartPackage.TRANSITION__GUARD:
				return basicSetGuard(null, msgs);
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
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS, FujabaRealtimeStatechart.class, msgs);
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
			case RealtimestatechartPackage.TRANSITION__ANNOTATION:
				return getAnnotations();
			case RealtimestatechartPackage.TRANSITION__EXTENSION:
				return getExtensions();
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
				return getSynchronization();
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION:
				return getTransitionAction();
			case RealtimestatechartPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				return getStatechart();
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				return getClockResets();
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				return getTriggerEvents();
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				return getRaisedEvents();
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINTS:
				return getClockConstraints();
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				return getAbsoluteDeadlines();
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
				return getRelativeDeadline();
			case RealtimestatechartPackage.TRANSITION__SAFETY_TRANSITION:
				return isSafetyTransition();
			case RealtimestatechartPackage.TRANSITION__URGENT:
				return isUrgent();
			case RealtimestatechartPackage.TRANSITION__GUARD:
				return getGuard();
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
			case RealtimestatechartPackage.TRANSITION__ANNOTATION:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__EXTENSION:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends Extension>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
				setSynchronization((Synchronization)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION:
				getTransitionAction().clear();
				getTransitionAction().addAll((Collection<? extends ActionExpression>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__TARGET:
				setTarget((Vertex)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				setSource((Vertex)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				setStatechart((FujabaRealtimeStatechart)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				getClockResets().clear();
				getClockResets().addAll((Collection<? extends Clock>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				getTriggerEvents().clear();
				getTriggerEvents().addAll((Collection<? extends AsynchronousEvent>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				getRaisedEvents().clear();
				getRaisedEvents().addAll((Collection<? extends AsynchronousEvent>)newValue);
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
			case RealtimestatechartPackage.TRANSITION__SAFETY_TRANSITION:
				setSafetyTransition((Boolean)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__URGENT:
				setUrgent((Boolean)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__GUARD:
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
			case RealtimestatechartPackage.TRANSITION__ANNOTATION:
				getAnnotations().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__EXTENSION:
				getExtensions().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
				setSynchronization((Synchronization)null);
				return;
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION:
				getTransitionAction().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__TARGET:
				setTarget((Vertex)null);
				return;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				setSource((Vertex)null);
				return;
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				setStatechart((FujabaRealtimeStatechart)null);
				return;
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				getClockResets().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				getTriggerEvents().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				getRaisedEvents().clear();
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
			case RealtimestatechartPackage.TRANSITION__SAFETY_TRANSITION:
				setSafetyTransition(SAFETY_TRANSITION_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__URGENT:
				setUrgent(URGENT_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__GUARD:
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
			case RealtimestatechartPackage.TRANSITION__ANNOTATION:
				return annotations != null && !annotations.isEmpty();
			case RealtimestatechartPackage.TRANSITION__EXTENSION:
				return extensions != null && !extensions.isEmpty();
			case RealtimestatechartPackage.TRANSITION__SYNCHRONIZATION:
				return synchronization != null;
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION:
				return transitionAction != null && !transitionAction.isEmpty();
			case RealtimestatechartPackage.TRANSITION__TARGET:
				return target != null;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				return source != null;
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				return getStatechart() != null;
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				return clockResets != null && !clockResets.isEmpty();
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				return triggerEvents != null && !triggerEvents.isEmpty();
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				return raisedEvents != null && !raisedEvents.isEmpty();
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINTS:
				return clockConstraints != null && !clockConstraints.isEmpty();
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				return absoluteDeadlines != null && !absoluteDeadlines.isEmpty();
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
				return relativeDeadline != null;
			case RealtimestatechartPackage.TRANSITION__SAFETY_TRANSITION:
				return safetyTransition != SAFETY_TRANSITION_EDEFAULT;
			case RealtimestatechartPackage.TRANSITION__URGENT:
				return urgent != URGENT_EDEFAULT;
			case RealtimestatechartPackage.TRANSITION__GUARD:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExtendableElement.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartPackage.TRANSITION__ANNOTATION: return SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION;
				case RealtimestatechartPackage.TRANSITION__EXTENSION: return SDMPackage.EXTENDABLE_ELEMENT__EXTENSION;
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
				case SDMPackage.EXTENDABLE_ELEMENT__ANNOTATION: return RealtimestatechartPackage.TRANSITION__ANNOTATION;
				case SDMPackage.EXTENDABLE_ELEMENT__EXTENSION: return RealtimestatechartPackage.TRANSITION__EXTENSION;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (safetyTransition: ");
		result.append(safetyTransition);
		result.append(", urgent: ");
		result.append(urgent);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
