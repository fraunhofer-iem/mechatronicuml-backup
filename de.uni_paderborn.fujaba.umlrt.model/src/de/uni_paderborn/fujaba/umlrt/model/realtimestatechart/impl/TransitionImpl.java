/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
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
import org.storydriven.modeling.calls.ParameterBinding;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.expressions.LiteralExpression;

import de.uni_paderborn.fujaba.umlrt.model.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AsynchronousEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getSendSynchronization <em>Send Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getReceiveSynchronization <em>Receive Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getClockResets <em>Clock Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getTriggerEvents <em>Trigger Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getRaisedEvents <em>Raised Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getClockConstraints <em>Clock Constraints</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#isSafetyTransition <em>Safety Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getEventExpr <em>Event Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getTransitionActionExpr <em>Transition Action Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getClockConstraintExpr <em>Clock Constraint Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getAbsoluteDeadlineExpr <em>Absolute Deadline Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getRelativeDeadlineExpr <em>Relative Deadline Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getGuardExpr <em>Guard Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getSynchroExpr <em>Synchro Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getClockResetsExpr <em>Clock Resets Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getSafetyTransitionExpr <em>Safety Transition Expr</em>}</li>
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
	 * The cached value of the '{@link #getSendSynchronization() <em>Send Synchronization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendSynchronization()
	 * @generated
	 * @ordered
	 */
	protected Synchronization sendSynchronization;

	/**
	 * The cached value of the '{@link #getReceiveSynchronization() <em>Receive Synchronization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveSynchronization()
	 * @generated
	 * @ordered
	 */
	protected Synchronization receiveSynchronization;

	/**
	 * The cached value of the '{@link #getTransitionAction() <em>Transition Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionAction()
	 * @generated
	 * @ordered
	 */
	protected Action transitionAction;

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
	 * The default value of the '{@link #getEventExpr() <em>Event Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EXPR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEventExpr() <em>Event Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventExpr()
	 * @generated
	 * @ordered
	 */
	protected String eventExpr = EVENT_EXPR_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getTransitionActionExpr() <em>Transition Action Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionActionExpr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TRANSITION_ACTION_EXPR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__TRANSITION_ACTION_EXPR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getClockConstraintExpr() <em>Clock Constraint Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockConstraintExpr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CLOCK_CONSTRAINT_EXPR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__CLOCK_CONSTRAINT_EXPR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAbsoluteDeadlineExpr() <em>Absolute Deadline Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteDeadlineExpr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ABSOLUTE_DEADLINE_EXPR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__ABSOLUTE_DEADLINE_EXPR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getRelativeDeadlineExpr() <em>Relative Deadline Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeDeadlineExpr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RELATIVE_DEADLINE_EXPR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE_EXPR).getSettingDelegate();

	/**
	 * The default value of the '{@link #getGuardExpr() <em>Guard Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getGuardExpr() <em>Guard Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpr()
	 * @generated
	 * @ordered
	 */
	protected String guardExpr = GUARD_EXPR_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getSynchroExpr() <em>Synchro Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchroExpr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SYNCHRO_EXPR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__SYNCHRO_EXPR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getClockResetsExpr() <em>Clock Resets Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockResetsExpr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CLOCK_RESETS_EXPR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__CLOCK_RESETS_EXPR).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSafetyTransitionExpr() <em>Safety Transition Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyTransitionExpr()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SAFETY_TRANSITION_EXPR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.TRANSITION__SAFETY_TRANSITION_EXPR).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TransitionImpl() {
		super();
		
		// Install a notification adapter that informs the
		// clockResetExpr-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter clockResetExprAdapter = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.TRANSITION__CLOCK_RESETS_EXPR, false);
		clockResetExprAdapter.addLocalDependency(RealtimestatechartPackage.Literals.TRANSITION__CLOCK_RESETS);

		// Install a notification adapter that informs the
		// relativeDeadlineExpr-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter relativeDeadlineExprAdapter = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE_EXPR, false);
		relativeDeadlineExprAdapter.addLocalDependency(RealtimestatechartPackage.Literals.TRANSITION__RELATIVE_DEADLINE);

		// Install a notification adapter that informs the
		// absoluteDeadlineExpr-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter absoluteDeadlineExprAdapter = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.TRANSITION__ABSOLUTE_DEADLINE_EXPR, false);
		absoluteDeadlineExprAdapter.addLocalDependency(RealtimestatechartPackage.Literals.TRANSITION__ABSOLUTE_DEADLINES);
		
		// Install a notification adapter that informs the
		// safetyTransitionExpr-reference, whenever one of the dependent features
		// was modified
		DerivedAttributeAdapter safetyTransitionExprAdapter = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.TRANSITION__SAFETY_TRANSITION_EXPR, false);
		safetyTransitionExprAdapter.addLocalDependency(RealtimestatechartPackage.Literals.TRANSITION__SAFETY_TRANSITION);

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
	public Synchronization getSendSynchronization() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION, oldSendSynchronization, newSendSynchronization);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION, newSendSynchronization, newSendSynchronization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization getReceiveSynchronization() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION, oldReceiveSynchronization, newReceiveSynchronization);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION, newReceiveSynchronization, newReceiveSynchronization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getTransitionAction() {
		return transitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionAction(Action newTransitionAction, NotificationChain msgs) {
		Action oldTransitionAction = transitionAction;
		transitionAction = newTransitionAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION, oldTransitionAction, newTransitionAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionAction(Action newTransitionAction) {
		if (newTransitionAction != transitionAction) {
			NotificationChain msgs = null;
			if (transitionAction != null)
				msgs = ((InternalEObject)transitionAction).eInverseRemove(this, RealtimestatechartPackage.ACTION__TRANSITION, Action.class, msgs);
			if (newTransitionAction != null)
				msgs = ((InternalEObject)newTransitionAction).eInverseAdd(this, RealtimestatechartPackage.ACTION__TRANSITION, Action.class, msgs);
			msgs = basicSetTransitionAction(newTransitionAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION, newTransitionAction, newTransitionAction));
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
	public AbstractRealtimeStatechart getStatechart() {
		if (eContainerFeatureID() != RealtimestatechartPackage.TRANSITION__STATECHART) return null;
		return (AbstractRealtimeStatechart)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechart(AbstractRealtimeStatechart newStatechart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatechart, RealtimestatechartPackage.TRANSITION__STATECHART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(AbstractRealtimeStatechart newStatechart) {
		if (newStatechart != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.TRANSITION__STATECHART && newStatechart != null)) {
			if (EcoreUtil.isAncestor(this, newStatechart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatechart != null)
				msgs = ((InternalEObject)newStatechart).eInverseAdd(this, CorePackage.ABSTRACT_REALTIME_STATECHART__TRANSITIONS, AbstractRealtimeStatechart.class, msgs);
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
			triggerEvents = new EObjectContainmentWithInverseEList<AsynchronousEvent>(AsynchronousEvent.class, this, RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__TRIGGEREDTRANSITION);
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
			raisedEvents = new EObjectContainmentWithInverseEList<AsynchronousEvent>(AsynchronousEvent.class, this, RealtimestatechartPackage.TRANSITION__RAISED_EVENTS, RealtimestatechartPackage.ASYNCHRONOUS_EVENT__RAISEDTRANSITION);
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
	public String getEventExpr() {
		return eventExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventExpr(String newEventExpr) {
		String oldEventExpr = eventExpr;
		eventExpr = newEventExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__EVENT_EXPR, oldEventExpr, eventExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransitionActionExpr() {
		return (String)TRANSITION_ACTION_EXPR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransitionActionExpr() {
		return TRANSITION_ACTION_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClockConstraintExpr() {
		return (String)CLOCK_CONSTRAINT_EXPR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClockConstraintExpr() {
		return CLOCK_CONSTRAINT_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbsoluteDeadlineExpr() {
		return (String)ABSOLUTE_DEADLINE_EXPR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAbsoluteDeadlineExpr() {
		return ABSOLUTE_DEADLINE_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelativeDeadlineExpr() {
		return (String)RELATIVE_DEADLINE_EXPR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelativeDeadlineExpr() {
		return RELATIVE_DEADLINE_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardExpr() {
		return guardExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardExpr(String newGuardExpr) {
		String oldGuardExpr = guardExpr;
		guardExpr = newGuardExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__GUARD_EXPR, oldGuardExpr, guardExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSynchroExpr() {
		return (String)SYNCHRO_EXPR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSynchroExpr() {
		return SYNCHRO_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClockResetsExpr() {
		return (String)CLOCK_RESETS_EXPR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClockResetsExpr() {
		return CLOCK_RESETS_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSafetyTransitionExpr() {
		return (String)SAFETY_TRANSITION_EXPR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSafetyTransitionExpr() {
		return SAFETY_TRANSITION_EXPR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
	public String computeClockResetsExpr() {
		String value = "";
		if(clockResets!=null){
		java.util.Iterator<Clock> iter = clockResets.iterator();
		while(iter.hasNext()){
			Clock clock = iter.next();
				if(value.equals("")){
					value = value + clock.getName() + clock.getId() + ":=0";
				}else{
					value = value + ", " + clock.getName() + clock.getId() + ":=0";
					}
				}
			}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String computeSynchroExpr() {
		String returnString = "";
		Synchronization synchro = null;
		if(getSendSynchronization()!=null){
			synchro = getSendSynchronization();
		}else if (getReceiveSynchronization()!=null){
			synchro = getReceiveSynchronization();
		}
								
		if(synchro!=null){
			returnString = ((de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.
					SynchronizationChannel)synchro.getCallee()).getName() + "(";
									
			java.util.Iterator<ParameterBinding> iter = synchro.getOwnedParameterBindings().iterator();
			boolean firstTime = true;
			while(iter.hasNext()){
				ParameterBinding tmp = iter.next();
				String value = ((LiteralExpression)tmp.getValueExpression()).getValue();
				EDataType type = ((LiteralExpression)tmp.getValueExpression()).getValueType();
				if(firstTime){
					firstTime = false;
					returnString = returnString + value + ":" + type.getName();
					}else{
					returnString = returnString + ", " + value + ":" + type.getName();
					}
				}
			if(getReceiveSynchronization()!=null){
				returnString = returnString + ")?";
			}else{
				returnString = returnString + ")!";
			}
		}
		return returnString;
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
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
				if (sendSynchronization != null)
					msgs = ((InternalEObject)sendSynchronization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION, null, msgs);
				return basicSetSendSynchronization((Synchronization)otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
				if (receiveSynchronization != null)
					msgs = ((InternalEObject)receiveSynchronization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION, null, msgs);
				return basicSetReceiveSynchronization((Synchronization)otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION:
				if (transitionAction != null)
					msgs = ((InternalEObject)transitionAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION, null, msgs);
				return basicSetTransitionAction((Action)otherEnd, msgs);
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
				return basicSetStatechart((AbstractRealtimeStatechart)otherEnd, msgs);
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
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
				return basicSetSendSynchronization(null, msgs);
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
				return basicSetReceiveSynchronization(null, msgs);
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION:
				return basicSetTransitionAction(null, msgs);
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
				return eInternalContainer().eInverseRemove(this, CorePackage.ABSTRACT_REALTIME_STATECHART__TRANSITIONS, AbstractRealtimeStatechart.class, msgs);
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
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
				return getSendSynchronization();
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
				return getReceiveSynchronization();
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
			case RealtimestatechartPackage.TRANSITION__EVENT_EXPR:
				return getEventExpr();
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION_EXPR:
				return getTransitionActionExpr();
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINT_EXPR:
				return getClockConstraintExpr();
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINE_EXPR:
				return getAbsoluteDeadlineExpr();
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE_EXPR:
				return getRelativeDeadlineExpr();
			case RealtimestatechartPackage.TRANSITION__GUARD_EXPR:
				return getGuardExpr();
			case RealtimestatechartPackage.TRANSITION__SYNCHRO_EXPR:
				return getSynchroExpr();
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS_EXPR:
				return getClockResetsExpr();
			case RealtimestatechartPackage.TRANSITION__SAFETY_TRANSITION_EXPR:
				return getSafetyTransitionExpr();
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
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
				setSendSynchronization((Synchronization)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
				setReceiveSynchronization((Synchronization)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION:
				setTransitionAction((Action)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__TARGET:
				setTarget((Vertex)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				setSource((Vertex)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				setStatechart((AbstractRealtimeStatechart)newValue);
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
			case RealtimestatechartPackage.TRANSITION__EVENT_EXPR:
				setEventExpr((String)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__GUARD_EXPR:
				setGuardExpr((String)newValue);
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
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
				setSendSynchronization((Synchronization)null);
				return;
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
				setReceiveSynchronization((Synchronization)null);
				return;
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION:
				setTransitionAction((Action)null);
				return;
			case RealtimestatechartPackage.TRANSITION__TARGET:
				setTarget((Vertex)null);
				return;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				setSource((Vertex)null);
				return;
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				setStatechart((AbstractRealtimeStatechart)null);
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
			case RealtimestatechartPackage.TRANSITION__EVENT_EXPR:
				setEventExpr(EVENT_EXPR_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__GUARD_EXPR:
				setGuardExpr(GUARD_EXPR_EDEFAULT);
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
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
				return sendSynchronization != null;
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
				return receiveSynchronization != null;
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION:
				return transitionAction != null;
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
			case RealtimestatechartPackage.TRANSITION__EVENT_EXPR:
				return EVENT_EXPR_EDEFAULT == null ? eventExpr != null : !EVENT_EXPR_EDEFAULT.equals(eventExpr);
			case RealtimestatechartPackage.TRANSITION__TRANSITION_ACTION_EXPR:
				return isSetTransitionActionExpr();
			case RealtimestatechartPackage.TRANSITION__CLOCK_CONSTRAINT_EXPR:
				return isSetClockConstraintExpr();
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINE_EXPR:
				return isSetAbsoluteDeadlineExpr();
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE_EXPR:
				return isSetRelativeDeadlineExpr();
			case RealtimestatechartPackage.TRANSITION__GUARD_EXPR:
				return GUARD_EXPR_EDEFAULT == null ? guardExpr != null : !GUARD_EXPR_EDEFAULT.equals(guardExpr);
			case RealtimestatechartPackage.TRANSITION__SYNCHRO_EXPR:
				return isSetSynchroExpr();
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS_EXPR:
				return isSetClockResetsExpr();
			case RealtimestatechartPackage.TRANSITION__SAFETY_TRANSITION_EXPR:
				return isSetSafetyTransitionExpr();
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
				case SDMPackage.EXTENDABLE_ELEMENT___GET_EXTENSION__ECLASS: return RealtimestatechartPackage.TRANSITION___GET_EXTENSION__ECLASS;
				case SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_EXTENSION__ECLASS: return RealtimestatechartPackage.TRANSITION___PROVIDE_EXTENSION__ECLASS;
				case SDMPackage.EXTENDABLE_ELEMENT___GET_ANNOTATION__STRING: return RealtimestatechartPackage.TRANSITION___GET_ANNOTATION__STRING;
				case SDMPackage.EXTENDABLE_ELEMENT___PROVIDE_ANNOTATION__STRING: return RealtimestatechartPackage.TRANSITION___PROVIDE_ANNOTATION__STRING;
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
			case RealtimestatechartPackage.TRANSITION___CALCULATE_WORST_CASE_DEADLINE_AS_NATURAL_NUMBER:
				return calculateWorstCaseDeadlineAsNaturalNumber();
			case RealtimestatechartPackage.TRANSITION___COMPUTE_CLOCK_RESETS_EXPR:
				return computeClockResetsExpr();
			case RealtimestatechartPackage.TRANSITION___COMPUTE_SYNCHRO_EXPR:
				return computeSynchroExpr();
			case RealtimestatechartPackage.TRANSITION___GET_EXTENSION__ECLASS:
				return getExtension((EClass)arguments.get(0));
			case RealtimestatechartPackage.TRANSITION___PROVIDE_EXTENSION__ECLASS:
				return provideExtension((EClass)arguments.get(0));
			case RealtimestatechartPackage.TRANSITION___GET_ANNOTATION__STRING:
				return getAnnotation((String)arguments.get(0));
			case RealtimestatechartPackage.TRANSITION___PROVIDE_ANNOTATION__STRING:
				return provideAnnotation((String)arguments.get(0));
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
		result.append(" (safetyTransition: ");
		result.append(safetyTransition);
		result.append(", urgent: ");
		result.append(urgent);
		result.append(", eventExpr: ");
		result.append(eventExpr);
		result.append(", guardExpr: ");
		result.append(guardExpr);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
