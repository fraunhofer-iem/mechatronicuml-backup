/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
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
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Statechart;
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
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getResets <em>Resets</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getUMLRealtimeFlatSwitching <em>UML Realtime Flat Switching</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getUMLRealtimeFadingFunction <em>UML Realtime Fading Function</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getTriggerEvents <em>Trigger Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getRaisedEvents <em>Raised Events</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getTimeguard <em>Timeguard</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getAbsoluteDeadlines <em>Absolute Deadlines</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getRelativeDeadline <em>Relative Deadline</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#isUrgent <em>Urgent</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
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
	 * The cached value of the '{@link #getStatechart() <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechart()
	 * @generated
	 * @ordered
	 */
	protected AbstractStatechart statechart;

	/**
	 * The cached value of the '{@link #getResets() <em>Resets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResets()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> resets;

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
	public void setTarget(Vertex newTarget) {
		Vertex oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__TARGET, oldTarget, target));
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
	public void setSource(Vertex newSource) {
		Vertex oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStatechart getStatechart() {
		if (statechart != null && statechart.eIsProxy()) {
			InternalEObject oldStatechart = (InternalEObject)statechart;
			statechart = (AbstractStatechart)eResolveProxy(oldStatechart);
			if (statechart != oldStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.TRANSITION__STATECHART, oldStatechart, statechart));
			}
		}
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStatechart basicGetStatechart() {
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(AbstractStatechart newStatechart) {
		AbstractStatechart oldStatechart = statechart;
		statechart = newStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.TRANSITION__STATECHART, oldStatechart, statechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getResets() {
		if (resets == null) {
			resets = new EObjectResolvingEList<Clock>(Clock.class, this, RealtimestatechartPackage.TRANSITION__RESETS);
		}
		return resets;
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
			triggerEvents = new EObjectContainmentEList<RealtimeEvent>(RealtimeEvent.class, this, RealtimestatechartPackage.TRANSITION__TRIGGER_EVENTS);
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
			raisedEvents = new EObjectContainmentEList<RealtimeEvent>(RealtimeEvent.class, this, RealtimestatechartPackage.TRANSITION__RAISED_EVENTS);
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
	public EObject clone(AbstractStatechart rtsc, Transition newTransition) {
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
			case RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION:
				if (uMLRealtimeFadingFunction != null)
					msgs = ((InternalEObject)uMLRealtimeFadingFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.TRANSITION__UML_REALTIME_FADING_FUNCTION, null, msgs);
				return basicSetUMLRealtimeFadingFunction((FadingFunction)otherEnd, msgs);
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
				if (resolve) return getStatechart();
				return basicGetStatechart();
			case RealtimestatechartPackage.TRANSITION__RESETS:
				return getResets();
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
			case RealtimestatechartPackage.TRANSITION__URGENT:
				return isUrgent();
			case RealtimestatechartPackage.TRANSITION__GUARD:
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
			case RealtimestatechartPackage.TRANSITION__RESETS:
				getResets().clear();
				getResets().addAll((Collection<? extends Clock>)newValue);
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
			case RealtimestatechartPackage.TRANSITION__RESETS:
				getResets().clear();
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
				return statechart != null;
			case RealtimestatechartPackage.TRANSITION__RESETS:
				return resets != null && !resets.isEmpty();
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
			case RealtimestatechartPackage.TRANSITION___GET_DEFAULT_NAME:
				return getDefaultName();
			case RealtimestatechartPackage.TRANSITION___CLONE__ABSTRACTSTATECHART_TRANSITION:
				return clone((AbstractStatechart)arguments.get(0), (Transition)arguments.get(1));
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
		result.append(", urgent: ");
		result.append(urgent);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
