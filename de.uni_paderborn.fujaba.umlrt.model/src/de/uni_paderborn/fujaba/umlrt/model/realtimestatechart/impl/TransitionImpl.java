/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
import de.uni_paderborn.fujaba.umlrt.model.core.NaturalNumber;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.AbsoluteDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Action;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.ClockConstraint;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FadingFunction;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FlatSwitching;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimeEvent;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RelativeDeadline;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
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

import org.storydriven.modeling.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getAnnotations <em>Annotation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getUMLRealtimeTransitionMappingVector <em>UML Realtime Transition Mapping Vector</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getSendSynchronization <em>Send Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getReceiveSynchronization <em>Receive Synchronization</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getSideEffect <em>Side Effect</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getClockResets <em>Clock Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getUMLRealtimeFlatSwitching <em>UML Realtime Flat Switching</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getUMLRealtimeFadingFunction <em>UML Realtime Fading Function</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getTriggerEvents <em>Trigger Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getRaisedEvents <em>Raised Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getTimeguard <em>Timeguard</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#isSafetyTransition <em>Safety Transition</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getEventExpr <em>Event Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getSideEffectExpr <em>Side Effect Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getTimeGuardExpr <em>Time Guard Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getDeadlineExpr <em>Deadline Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getGuardExpr <em>Guard Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getSynchroExpr <em>Synchro Expr</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getClockResetsExpr <em>Clock Resets Expr</em>}</li>
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
	 * The cached value of the '{@link #getSideEffect() <em>Side Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideEffect()
	 * @generated
	 * @ordered
	 */
	protected Action sideEffect;

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
	 * The cached value of the '{@link #getUMLRealtimeFlatSwitching() <em>UML Realtime Flat Switching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeFlatSwitching()
	 * @generated
	 * @ordered
	 */
	protected FlatSwitching uMLRealtimeFlatSwitching;

	/**
	 * The cached value of the '{@link #getUMLRealtimeFadingFunction() <em>UML Realtime Fading Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeFadingFunction()
	 * @generated
	 * @ordered
	 */
	protected FadingFunction uMLRealtimeFadingFunction;

	/**
	 * The cached value of the '{@link #getTriggerEvents() <em>Trigger Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<RealtimeEvent> triggerEvents;

	/**
	 * The cached value of the '{@link #getRaisedEvents() <em>Raised Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<RealtimeEvent> raisedEvents;

	/**
	 * The cached value of the '{@link #getTimeguard() <em>Timeguard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeguard()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockConstraint> timeguard;

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
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
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
	protected static final String EVENT_EXPR_EDEFAULT = "eventExpr";

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
	 * The default value of the '{@link #getSideEffectExpr() <em>Side Effect Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideEffectExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_EFFECT_EXPR_EDEFAULT = "sideEffectExpr";

	/**
	 * The cached value of the '{@link #getSideEffectExpr() <em>Side Effect Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideEffectExpr()
	 * @generated
	 * @ordered
	 */
	protected String sideEffectExpr = SIDE_EFFECT_EXPR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeGuardExpr() <em>Time Guard Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeGuardExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_GUARD_EXPR_EDEFAULT = "timeGuardExpr";

	/**
	 * The cached value of the '{@link #getTimeGuardExpr() <em>Time Guard Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeGuardExpr()
	 * @generated
	 * @ordered
	 */
	protected String timeGuardExpr = TIME_GUARD_EXPR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadlineExpr() <em>Deadline Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlineExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String DEADLINE_EXPR_EDEFAULT = "deadlineExpr";

	/**
	 * The cached value of the '{@link #getDeadlineExpr() <em>Deadline Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlineExpr()
	 * @generated
	 * @ordered
	 */
	protected String deadlineExpr = DEADLINE_EXPR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuardExpr() <em>Guard Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EXPR_EDEFAULT = "guardExpr";

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
	 * The default value of the '{@link #getSynchroExpr() <em>Synchro Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchroExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNCHRO_EXPR_EDEFAULT = "synchroExpr";

	/**
	 * The cached value of the '{@link #getSynchroExpr() <em>Synchro Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchroExpr()
	 * @generated
	 * @ordered
	 */
	protected String synchroExpr = SYNCHRO_EXPR_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR, oldUMLRealtimeTransitionMappingVector, uMLRealtimeTransitionMappingVector));
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
	public Action getSideEffect() {
		return sideEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSideEffect(Action newSideEffect, NotificationChain msgs) {
		Action oldSideEffect = sideEffect;
		sideEffect = newSideEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SIDE_EFFECT, oldSideEffect, newSideEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideEffect(Action newSideEffect) {
		if (newSideEffect != sideEffect) {
			NotificationChain msgs = null;
			if (sideEffect != null)
				msgs = ((InternalEObject)sideEffect).eInverseRemove(this, RealtimestatechartPackage.ACTION__UML_REALTIME_TRANSITION, Action.class, msgs);
			if (newSideEffect != null)
				msgs = ((InternalEObject)newSideEffect).eInverseAdd(this, RealtimestatechartPackage.ACTION__UML_REALTIME_TRANSITION, Action.class, msgs);
			msgs = basicSetSideEffect(newSideEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SIDE_EFFECT, newSideEffect, newSideEffect));
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
	public AbstractStatechart getStatechart() {
		if (eContainerFeatureID() != RealtimestatechartPackage.TRANSITION__STATECHART) return null;
		return (AbstractStatechart)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechart(AbstractStatechart newStatechart, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatechart, RealtimestatechartPackage.TRANSITION__STATECHART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(AbstractStatechart newStatechart) {
		if (newStatechart != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.TRANSITION__STATECHART && newStatechart != null)) {
			if (EcoreUtil.isAncestor(this, newStatechart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatechart != null)
				msgs = ((InternalEObject)newStatechart).eInverseAdd(this, CorePackage.ABSTRACT_STATECHART__TRANSITIONS, AbstractStatechart.class, msgs);
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
	public FlatSwitching getUMLRealtimeFlatSwitching() {
		return uMLRealtimeFlatSwitching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeFlatSwitching(FlatSwitching newUMLRealtimeFlatSwitching, NotificationChain msgs) {
		FlatSwitching oldUMLRealtimeFlatSwitching = uMLRealtimeFlatSwitching;
		uMLRealtimeFlatSwitching = newUMLRealtimeFlatSwitching;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__UML_REALTIME_FLAT_SWITCHING, oldUMLRealtimeFlatSwitching, newUMLRealtimeFlatSwitching);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeFlatSwitching(FlatSwitching newUMLRealtimeFlatSwitching) {
		if (newUMLRealtimeFlatSwitching != uMLRealtimeFlatSwitching) {
			NotificationChain msgs = null;
			if (uMLRealtimeFlatSwitching != null)
				msgs = ((InternalEObject)uMLRealtimeFlatSwitching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__UML_REALTIME_FLAT_SWITCHING, null, msgs);
			if (newUMLRealtimeFlatSwitching != null)
				msgs = ((InternalEObject)newUMLRealtimeFlatSwitching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__UML_REALTIME_FLAT_SWITCHING, null, msgs);
			msgs = basicSetUMLRealtimeFlatSwitching(newUMLRealtimeFlatSwitching, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__UML_REALTIME_FLAT_SWITCHING, newUMLRealtimeFlatSwitching, newUMLRealtimeFlatSwitching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadingFunction getUMLRealtimeFadingFunction() {
		return uMLRealtimeFadingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeFadingFunction(FadingFunction newUMLRealtimeFadingFunction, NotificationChain msgs) {
		FadingFunction oldUMLRealtimeFadingFunction = uMLRealtimeFadingFunction;
		uMLRealtimeFadingFunction = newUMLRealtimeFadingFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION, oldUMLRealtimeFadingFunction, newUMLRealtimeFadingFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeFadingFunction(FadingFunction newUMLRealtimeFadingFunction) {
		if (newUMLRealtimeFadingFunction != uMLRealtimeFadingFunction) {
			NotificationChain msgs = null;
			if (uMLRealtimeFadingFunction != null)
				msgs = ((InternalEObject)uMLRealtimeFadingFunction).eInverseRemove(this, RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS, FadingFunction.class, msgs);
			if (newUMLRealtimeFadingFunction != null)
				msgs = ((InternalEObject)newUMLRealtimeFadingFunction).eInverseAdd(this, RealtimestatechartPackage.FADING_FUNCTION__UML_REALTIME_TRANSITIONS, FadingFunction.class, msgs);
			msgs = basicSetUMLRealtimeFadingFunction(newUMLRealtimeFadingFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION, newUMLRealtimeFadingFunction, newUMLRealtimeFadingFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealtimeEvent> getTriggerEvents() {
		if (triggerEvents == null) {
			triggerEvents = new EObjectContainmentWithInverseEList<RealtimeEvent>(RealtimeEvent.class, this, RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS, RealtimestatechartPackage.REALTIME_EVENT__TRIGGERED_UML_REALTIME_TRANSITION);
		}
		return triggerEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealtimeEvent> getRaisedEvents() {
		if (raisedEvents == null) {
			raisedEvents = new EObjectContainmentWithInverseEList<RealtimeEvent>(RealtimeEvent.class, this, RealtimestatechartPackage.TRANSITION__RAISED_EVENTS, RealtimestatechartPackage.REALTIME_EVENT__RAISED_UML_REALTIME_TRANSITION);
		}
		return raisedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockConstraint> getTimeguard() {
		if (timeguard == null) {
			timeguard = new EObjectContainmentEList<ClockConstraint>(ClockConstraint.class, this, RealtimestatechartPackage.TRANSITION__TIMEGUARD);
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
			absoluteDeadlines = new EObjectContainmentWithInverseEList<AbsoluteDeadline>(AbsoluteDeadline.class, this, RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES, RealtimestatechartPackage.ABSOLUTE_DEADLINE__UML_REALTIME_TRANSITION);
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
				msgs = ((InternalEObject)relativeDeadline).eInverseRemove(this, RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION, RelativeDeadline.class, msgs);
			if (newRelativeDeadline != null)
				msgs = ((InternalEObject)newRelativeDeadline).eInverseAdd(this, RealtimestatechartPackage.RELATIVE_DEADLINE__UML_REALTIME_TRANSITION, RelativeDeadline.class, msgs);
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
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject)guard;
			guard = (Expression)eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.TRANSITION__GUARD, oldGuard, guard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__GUARD, oldGuard, guard));
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
	public String getSideEffectExpr() {
		return sideEffectExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSideEffectExpr(String newSideEffectExpr) {
		String oldSideEffectExpr = sideEffectExpr;
		sideEffectExpr = newSideEffectExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SIDE_EFFECT_EXPR, oldSideEffectExpr, sideEffectExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeGuardExpr() {
		return timeGuardExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeGuardExpr(String newTimeGuardExpr) {
		String oldTimeGuardExpr = timeGuardExpr;
		timeGuardExpr = newTimeGuardExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__TIME_GUARD_EXPR, oldTimeGuardExpr, timeGuardExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeadlineExpr() {
		return deadlineExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadlineExpr(String newDeadlineExpr) {
		String oldDeadlineExpr = deadlineExpr;
		deadlineExpr = newDeadlineExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__DEADLINE_EXPR, oldDeadlineExpr, deadlineExpr));
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
		return synchroExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchroExpr(String newSynchroExpr) {
		String oldSynchroExpr = synchroExpr;
		synchroExpr = newSynchroExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SYNCHRO_EXPR, oldSynchroExpr, synchroExpr));
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
	public void setClockResetsExpr(String newClockResetsExpr) {
		CLOCK_RESETS_EXPR__ESETTING_DELEGATE.dynamicSet(this, null, 0, newClockResetsExpr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClockResetsExpr() {
		CLOCK_RESETS_EXPR__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT:
				if (sideEffect != null)
					msgs = ((InternalEObject)sideEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__SIDE_EFFECT, null, msgs);
				return basicSetSideEffect((Action)otherEnd, msgs);
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
				return basicSetStatechart((AbstractStatechart)otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION:
				if (uMLRealtimeFadingFunction != null)
					msgs = ((InternalEObject)uMLRealtimeFadingFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION, null, msgs);
				return basicSetUMLRealtimeFadingFunction((FadingFunction)otherEnd, msgs);
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
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT:
				return basicSetSideEffect(null, msgs);
			case RealtimestatechartPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				return basicSetStatechart(null, msgs);
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FLAT_SWITCHING:
				return basicSetUMLRealtimeFlatSwitching(null, msgs);
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION:
				return basicSetUMLRealtimeFadingFunction(null, msgs);
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				return ((InternalEList<?>)getTriggerEvents()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				return ((InternalEList<?>)getRaisedEvents()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__TIMEGUARD:
				return ((InternalEList<?>)getTimeguard()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				return ((InternalEList<?>)getAbsoluteDeadlines()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				return eInternalContainer().eInverseRemove(this, CorePackage.ABSTRACT_STATECHART__TRANSITIONS, AbstractStatechart.class, msgs);
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
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR:
				return getUMLRealtimeTransitionMappingVector();
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
				return getSendSynchronization();
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
				return getReceiveSynchronization();
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT:
				return getSideEffect();
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
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FLAT_SWITCHING:
				return getUMLRealtimeFlatSwitching();
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION:
				return getUMLRealtimeFadingFunction();
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				return getTriggerEvents();
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				return getRaisedEvents();
			case RealtimestatechartPackage.TRANSITION__TIMEGUARD:
				return getTimeguard();
			case RealtimestatechartPackage.TRANSITION__ABSOLUTE_DEADLINES:
				return getAbsoluteDeadlines();
			case RealtimestatechartPackage.TRANSITION__RELATIVE_DEADLINE:
				return getRelativeDeadline();
			case RealtimestatechartPackage.TRANSITION__SAFETY_TRANSITION:
				return isSafetyTransition();
			case RealtimestatechartPackage.TRANSITION__URGENT:
				return isUrgent();
			case RealtimestatechartPackage.TRANSITION__GUARD:
				if (resolve) return getGuard();
				return basicGetGuard();
			case RealtimestatechartPackage.TRANSITION__EVENT_EXPR:
				return getEventExpr();
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT_EXPR:
				return getSideEffectExpr();
			case RealtimestatechartPackage.TRANSITION__TIME_GUARD_EXPR:
				return getTimeGuardExpr();
			case RealtimestatechartPackage.TRANSITION__DEADLINE_EXPR:
				return getDeadlineExpr();
			case RealtimestatechartPackage.TRANSITION__GUARD_EXPR:
				return getGuardExpr();
			case RealtimestatechartPackage.TRANSITION__SYNCHRO_EXPR:
				return getSynchroExpr();
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS_EXPR:
				return getClockResetsExpr();
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
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR:
				setUMLRealtimeTransitionMappingVector((Vector)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
				setSendSynchronization((Synchronization)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
				setReceiveSynchronization((Synchronization)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT:
				setSideEffect((Action)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__TARGET:
				setTarget((Vertex)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				setSource((Vertex)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				setStatechart((AbstractStatechart)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				getClockResets().clear();
				getClockResets().addAll((Collection<? extends Clock>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FLAT_SWITCHING:
				setUMLRealtimeFlatSwitching((FlatSwitching)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION:
				setUMLRealtimeFadingFunction((FadingFunction)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				getTriggerEvents().clear();
				getTriggerEvents().addAll((Collection<? extends RealtimeEvent>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				getRaisedEvents().clear();
				getRaisedEvents().addAll((Collection<? extends RealtimeEvent>)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__TIMEGUARD:
				getTimeguard().clear();
				getTimeguard().addAll((Collection<? extends ClockConstraint>)newValue);
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
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT_EXPR:
				setSideEffectExpr((String)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__TIME_GUARD_EXPR:
				setTimeGuardExpr((String)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__DEADLINE_EXPR:
				setDeadlineExpr((String)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__GUARD_EXPR:
				setGuardExpr((String)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__SYNCHRO_EXPR:
				setSynchroExpr((String)newValue);
				return;
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS_EXPR:
				setClockResetsExpr((String)newValue);
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
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR:
				setUMLRealtimeTransitionMappingVector(UML_REALTIME_TRANSITION_MAPPING_VECTOR_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
				setSendSynchronization((Synchronization)null);
				return;
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
				setReceiveSynchronization((Synchronization)null);
				return;
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT:
				setSideEffect((Action)null);
				return;
			case RealtimestatechartPackage.TRANSITION__TARGET:
				setTarget((Vertex)null);
				return;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				setSource((Vertex)null);
				return;
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				setStatechart((AbstractStatechart)null);
				return;
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				getClockResets().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FLAT_SWITCHING:
				setUMLRealtimeFlatSwitching((FlatSwitching)null);
				return;
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION:
				setUMLRealtimeFadingFunction((FadingFunction)null);
				return;
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				getTriggerEvents().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				getRaisedEvents().clear();
				return;
			case RealtimestatechartPackage.TRANSITION__TIMEGUARD:
				getTimeguard().clear();
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
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT_EXPR:
				setSideEffectExpr(SIDE_EFFECT_EXPR_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__TIME_GUARD_EXPR:
				setTimeGuardExpr(TIME_GUARD_EXPR_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__DEADLINE_EXPR:
				setDeadlineExpr(DEADLINE_EXPR_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__GUARD_EXPR:
				setGuardExpr(GUARD_EXPR_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__SYNCHRO_EXPR:
				setSynchroExpr(SYNCHRO_EXPR_EDEFAULT);
				return;
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS_EXPR:
				unsetClockResetsExpr();
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
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR:
				return UML_REALTIME_TRANSITION_MAPPING_VECTOR_EDEFAULT == null ? uMLRealtimeTransitionMappingVector != null : !UML_REALTIME_TRANSITION_MAPPING_VECTOR_EDEFAULT.equals(uMLRealtimeTransitionMappingVector);
			case RealtimestatechartPackage.TRANSITION__SEND_SYNCHRONIZATION:
				return sendSynchronization != null;
			case RealtimestatechartPackage.TRANSITION__RECEIVE_SYNCHRONIZATION:
				return receiveSynchronization != null;
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT:
				return sideEffect != null;
			case RealtimestatechartPackage.TRANSITION__TARGET:
				return target != null;
			case RealtimestatechartPackage.TRANSITION__SOURCE:
				return source != null;
			case RealtimestatechartPackage.TRANSITION__STATECHART:
				return getStatechart() != null;
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS:
				return clockResets != null && !clockResets.isEmpty();
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FLAT_SWITCHING:
				return uMLRealtimeFlatSwitching != null;
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION:
				return uMLRealtimeFadingFunction != null;
			case RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS:
				return triggerEvents != null && !triggerEvents.isEmpty();
			case RealtimestatechartPackage.TRANSITION__RAISED_EVENTS:
				return raisedEvents != null && !raisedEvents.isEmpty();
			case RealtimestatechartPackage.TRANSITION__TIMEGUARD:
				return timeguard != null && !timeguard.isEmpty();
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
			case RealtimestatechartPackage.TRANSITION__SIDE_EFFECT_EXPR:
				return SIDE_EFFECT_EXPR_EDEFAULT == null ? sideEffectExpr != null : !SIDE_EFFECT_EXPR_EDEFAULT.equals(sideEffectExpr);
			case RealtimestatechartPackage.TRANSITION__TIME_GUARD_EXPR:
				return TIME_GUARD_EXPR_EDEFAULT == null ? timeGuardExpr != null : !TIME_GUARD_EXPR_EDEFAULT.equals(timeGuardExpr);
			case RealtimestatechartPackage.TRANSITION__DEADLINE_EXPR:
				return DEADLINE_EXPR_EDEFAULT == null ? deadlineExpr != null : !DEADLINE_EXPR_EDEFAULT.equals(deadlineExpr);
			case RealtimestatechartPackage.TRANSITION__GUARD_EXPR:
				return GUARD_EXPR_EDEFAULT == null ? guardExpr != null : !GUARD_EXPR_EDEFAULT.equals(guardExpr);
			case RealtimestatechartPackage.TRANSITION__SYNCHRO_EXPR:
				return SYNCHRO_EXPR_EDEFAULT == null ? synchroExpr != null : !SYNCHRO_EXPR_EDEFAULT.equals(synchroExpr);
			case RealtimestatechartPackage.TRANSITION__CLOCK_RESETS_EXPR:
				return isSetClockResetsExpr();
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
		result.append(" (uMLRealtimeTransitionMappingVector: ");
		result.append(uMLRealtimeTransitionMappingVector);
		result.append(", safetyTransition: ");
		result.append(safetyTransition);
		result.append(", urgent: ");
		result.append(urgent);
		result.append(", eventExpr: ");
		result.append(eventExpr);
		result.append(", sideEffectExpr: ");
		result.append(sideEffectExpr);
		result.append(", timeGuardExpr: ");
		result.append(timeGuardExpr);
		result.append(", deadlineExpr: ");
		result.append(deadlineExpr);
		result.append(", guardExpr: ");
		result.append(guardExpr);
		result.append(", synchroExpr: ");
		result.append(synchroExpr);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
