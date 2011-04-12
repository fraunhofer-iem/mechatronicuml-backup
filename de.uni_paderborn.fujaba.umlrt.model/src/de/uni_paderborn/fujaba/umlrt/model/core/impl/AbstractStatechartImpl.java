/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.InitialState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInterfaceStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Statechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getEventQueueSize <em>Event Queue Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getWcetDocument <em>Wcet Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getSystemWcetMap <em>System Wcet Map</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getScheduleDocument <em>Schedule Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getUMLRealtimeStartState <em>UML Realtime Start State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getUMLInterfaceStatechart <em>UML Interface Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getBehavioralElement <em>Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getProvidedMsgIFace <em>Provided Msg IFace</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getRequiredMsgIFace <em>Required Msg IFace</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#isIsEmbedded <em>Is Embedded</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractStatechartImpl#getEmbeddingRegion <em>Embedding Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractStatechartImpl extends NamedElementImpl implements AbstractStatechart {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventQueueSize() <em>Event Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final int EVENT_QUEUE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEventQueueSize() <em>Event Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventQueueSize()
	 * @generated
	 * @ordered
	 */
	protected int eventQueueSize = EVENT_QUEUE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWcetDocument() <em>Wcet Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcetDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String WCET_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWcetDocument() <em>Wcet Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcetDocument()
	 * @generated
	 * @ordered
	 */
	protected String wcetDocument = WCET_DOCUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityLevel() <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int SECURITY_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected int securityLevel = SECURITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemWcetMap() <em>System Wcet Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemWcetMap()
	 * @generated
	 * @ordered
	 */
	protected static final Map SYSTEM_WCET_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemWcetMap() <em>System Wcet Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemWcetMap()
	 * @generated
	 * @ordered
	 */
	protected Map systemWcetMap = SYSTEM_WCET_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilisation() <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisation()
	 * @generated
	 * @ordered
	 */
	protected static final double UTILISATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUtilisation() <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisation()
	 * @generated
	 * @ordered
	 */
	protected double utilisation = UTILISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduleDocument() <em>Schedule Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_DOCUMENT_EDEFAULT = "\\\"schedule.xml\\\"";

	/**
	 * The cached value of the '{@link #getScheduleDocument() <em>Schedule Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDocument()
	 * @generated
	 * @ordered
	 */
	protected String scheduleDocument = SCHEDULE_DOCUMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUMLRealtimeStartState() <em>UML Realtime Start State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeStartState()
	 * @generated
	 * @ordered
	 */
	protected InitialState uMLRealtimeStartState;

	/**
	 * The cached value of the '{@link #getUMLComplexRealtimeState() <em>UML Complex Realtime State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLComplexRealtimeState()
	 * @generated
	 * @ordered
	 */
	protected State uMLComplexRealtimeState;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getVertices() <em>Vertices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> vertices;

	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The cached value of the '{@link #getUMLInterfaceStatechart() <em>UML Interface Statechart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLInterfaceStatechart()
	 * @generated
	 * @ordered
	 */
	protected UMLInterfaceStatechart uMLInterfaceStatechart;

	/**
	 * The cached value of the '{@link #getBehavioralElement() <em>Behavioral Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralElement()
	 * @generated
	 * @ordered
	 */
	protected BehavioralElement behavioralElement;

	/**
	 * The cached value of the '{@link #getProvidedMsgIFace() <em>Provided Msg IFace</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedMsgIFace()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, EClass> providedMsgIFace;

	/**
	 * The cached value of the '{@link #getRequiredMsgIFace() <em>Required Msg IFace</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMsgIFace()
	 * @generated
	 * @ordered
	 */
	protected Map.Entry<String, EClass> requiredMsgIFace;

	/**
	 * The default value of the '{@link #isIsEmbedded() <em>Is Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EMBEDDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEmbedded() <em>Is Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmbedded()
	 * @generated
	 * @ordered
	 */
	protected boolean isEmbedded = IS_EMBEDDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClocks() <em>Clocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> clocks;

	/**
	 * The cached value of the '{@link #getEmbeddingRegion() <em>Embedding Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddingRegion()
	 * @generated
	 * @ordered
	 */
	protected Region embeddingRegion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ABSTRACT_STATECHART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEventQueueSize() {
		return eventQueueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventQueueSize(int newEventQueueSize) {
		int oldEventQueueSize = eventQueueSize;
		eventQueueSize = newEventQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__EVENT_QUEUE_SIZE, oldEventQueueSize, eventQueueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWcetDocument() {
		return wcetDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWcetDocument(String newWcetDocument) {
		String oldWcetDocument = wcetDocument;
		wcetDocument = newWcetDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__WCET_DOCUMENT, oldWcetDocument, wcetDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecurityLevel() {
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel(int newSecurityLevel) {
		int oldSecurityLevel = securityLevel;
		securityLevel = newSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getSystemWcetMap() {
		return systemWcetMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemWcetMap(Map newSystemWcetMap) {
		Map oldSystemWcetMap = systemWcetMap;
		systemWcetMap = newSystemWcetMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__SYSTEM_WCET_MAP, oldSystemWcetMap, systemWcetMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUtilisation() {
		return utilisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilisation(double newUtilisation) {
		double oldUtilisation = utilisation;
		utilisation = newUtilisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__UTILISATION, oldUtilisation, utilisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheduleDocument() {
		return scheduleDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleDocument(String newScheduleDocument) {
		String oldScheduleDocument = scheduleDocument;
		scheduleDocument = newScheduleDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__SCHEDULE_DOCUMENT, oldScheduleDocument, scheduleDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getUMLRealtimeStartState() {
		return uMLRealtimeStartState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLRealtimeStartState(InitialState newUMLRealtimeStartState, NotificationChain msgs) {
		InitialState oldUMLRealtimeStartState = uMLRealtimeStartState;
		uMLRealtimeStartState = newUMLRealtimeStartState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE, oldUMLRealtimeStartState, newUMLRealtimeStartState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeStartState(InitialState newUMLRealtimeStartState) {
		if (newUMLRealtimeStartState != uMLRealtimeStartState) {
			NotificationChain msgs = null;
			if (uMLRealtimeStartState != null)
				msgs = ((InternalEObject)uMLRealtimeStartState).eInverseRemove(this, RealtimestatechartPackage.INITIAL_STATE__UML_REALTIME_START_STATE_REV, InitialState.class, msgs);
			if (newUMLRealtimeStartState != null)
				msgs = ((InternalEObject)newUMLRealtimeStartState).eInverseAdd(this, RealtimestatechartPackage.INITIAL_STATE__UML_REALTIME_START_STATE_REV, InitialState.class, msgs);
			msgs = basicSetUMLRealtimeStartState(newUMLRealtimeStartState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE, newUMLRealtimeStartState, newUMLRealtimeStartState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getUMLComplexRealtimeState() {
		return uMLComplexRealtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLComplexRealtimeState(State newUMLComplexRealtimeState, NotificationChain msgs) {
		State oldUMLComplexRealtimeState = uMLComplexRealtimeState;
		uMLComplexRealtimeState = newUMLComplexRealtimeState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE, oldUMLComplexRealtimeState, newUMLComplexRealtimeState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLComplexRealtimeState(State newUMLComplexRealtimeState) {
		if (newUMLComplexRealtimeState != uMLComplexRealtimeState) {
			NotificationChain msgs = null;
			if (uMLComplexRealtimeState != null)
				msgs = ((InternalEObject)uMLComplexRealtimeState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE, null, msgs);
			if (newUMLComplexRealtimeState != null)
				msgs = ((InternalEObject)newUMLComplexRealtimeState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE, null, msgs);
			msgs = basicSetUMLComplexRealtimeState(newUMLComplexRealtimeState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE, newUMLComplexRealtimeState, newUMLComplexRealtimeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, CorePackage.ABSTRACT_STATECHART__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getVertices() {
		if (vertices == null) {
			vertices = new EObjectContainmentEList<Vertex>(Vertex.class, this, CorePackage.ABSTRACT_STATECHART__VERTICES);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEClass(EClass newEClass, NotificationChain msgs) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__ECLASS, oldEClass, newEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		if (newEClass != eClass) {
			NotificationChain msgs = null;
			if (eClass != null)
				msgs = ((InternalEObject)eClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__ECLASS, null, msgs);
			if (newEClass != null)
				msgs = ((InternalEObject)newEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__ECLASS, null, msgs);
			msgs = basicSetEClass(newEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__ECLASS, newEClass, newEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLInterfaceStatechart getUMLInterfaceStatechart() {
		return uMLInterfaceStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLInterfaceStatechart(UMLInterfaceStatechart newUMLInterfaceStatechart, NotificationChain msgs) {
		UMLInterfaceStatechart oldUMLInterfaceStatechart = uMLInterfaceStatechart;
		uMLInterfaceStatechart = newUMLInterfaceStatechart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART, oldUMLInterfaceStatechart, newUMLInterfaceStatechart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLInterfaceStatechart(UMLInterfaceStatechart newUMLInterfaceStatechart) {
		if (newUMLInterfaceStatechart != uMLInterfaceStatechart) {
			NotificationChain msgs = null;
			if (uMLInterfaceStatechart != null)
				msgs = ((InternalEObject)uMLInterfaceStatechart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART, null, msgs);
			if (newUMLInterfaceStatechart != null)
				msgs = ((InternalEObject)newUMLInterfaceStatechart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART, null, msgs);
			msgs = basicSetUMLInterfaceStatechart(newUMLInterfaceStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART, newUMLInterfaceStatechart, newUMLInterfaceStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement getBehavioralElement() {
		if (behavioralElement != null && behavioralElement.eIsProxy()) {
			InternalEObject oldBehavioralElement = (InternalEObject)behavioralElement;
			behavioralElement = (BehavioralElement)eResolveProxy(oldBehavioralElement);
			if (behavioralElement != oldBehavioralElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT, oldBehavioralElement, behavioralElement));
			}
		}
		return behavioralElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralElement basicGetBehavioralElement() {
		return behavioralElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralElement(BehavioralElement newBehavioralElement) {
		BehavioralElement oldBehavioralElement = behavioralElement;
		behavioralElement = newBehavioralElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT, oldBehavioralElement, behavioralElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EClass> getProvidedMsgIFace() {
		return providedMsgIFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedMsgIFace(Map.Entry<String, EClass> newProvidedMsgIFace, NotificationChain msgs) {
		Map.Entry<String, EClass> oldProvidedMsgIFace = providedMsgIFace;
		providedMsgIFace = newProvidedMsgIFace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE, oldProvidedMsgIFace, newProvidedMsgIFace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedMsgIFace(Map.Entry<String, EClass> newProvidedMsgIFace) {
		if (newProvidedMsgIFace != providedMsgIFace) {
			NotificationChain msgs = null;
			if (providedMsgIFace != null)
				msgs = ((InternalEObject)providedMsgIFace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE, null, msgs);
			if (newProvidedMsgIFace != null)
				msgs = ((InternalEObject)newProvidedMsgIFace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE, null, msgs);
			msgs = basicSetProvidedMsgIFace(newProvidedMsgIFace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE, newProvidedMsgIFace, newProvidedMsgIFace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EClass> getRequiredMsgIFace() {
		return requiredMsgIFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredMsgIFace(Map.Entry<String, EClass> newRequiredMsgIFace, NotificationChain msgs) {
		Map.Entry<String, EClass> oldRequiredMsgIFace = requiredMsgIFace;
		requiredMsgIFace = newRequiredMsgIFace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE, oldRequiredMsgIFace, newRequiredMsgIFace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredMsgIFace(Map.Entry<String, EClass> newRequiredMsgIFace) {
		if (newRequiredMsgIFace != requiredMsgIFace) {
			NotificationChain msgs = null;
			if (requiredMsgIFace != null)
				msgs = ((InternalEObject)requiredMsgIFace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE, null, msgs);
			if (newRequiredMsgIFace != null)
				msgs = ((InternalEObject)newRequiredMsgIFace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE, null, msgs);
			msgs = basicSetRequiredMsgIFace(newRequiredMsgIFace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE, newRequiredMsgIFace, newRequiredMsgIFace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEmbedded() {
		return isEmbedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEmbedded(boolean newIsEmbedded) {
		boolean oldIsEmbedded = isEmbedded;
		isEmbedded = newIsEmbedded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__IS_EMBEDDED, oldIsEmbedded, isEmbedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getClocks() {
		if (clocks == null) {
			clocks = new EObjectContainmentWithInverseEList<Clock>(Clock.class, this, CorePackage.ABSTRACT_STATECHART__CLOCKS, RealtimestatechartPackage.CLOCK__STATECHART);
		}
		return clocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getEmbeddingRegion() {
		if (embeddingRegion != null && embeddingRegion.eIsProxy()) {
			InternalEObject oldEmbeddingRegion = (InternalEObject)embeddingRegion;
			embeddingRegion = (Region)eResolveProxy(oldEmbeddingRegion);
			if (embeddingRegion != oldEmbeddingRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION, oldEmbeddingRegion, embeddingRegion));
			}
		}
		return embeddingRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetEmbeddingRegion() {
		return embeddingRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddingRegion(Region newEmbeddingRegion, NotificationChain msgs) {
		Region oldEmbeddingRegion = embeddingRegion;
		embeddingRegion = newEmbeddingRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION, oldEmbeddingRegion, newEmbeddingRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddingRegion(Region newEmbeddingRegion) {
		if (newEmbeddingRegion != embeddingRegion) {
			NotificationChain msgs = null;
			if (embeddingRegion != null)
				msgs = ((InternalEObject)embeddingRegion).eInverseRemove(this, RealtimestatechartPackage.REGION__STATECHART, Region.class, msgs);
			if (newEmbeddingRegion != null)
				msgs = ((InternalEObject)newEmbeddingRegion).eInverseAdd(this, RealtimestatechartPackage.REGION__STATECHART, Region.class, msgs);
			msgs = basicSetEmbeddingRegion(newEmbeddingRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION, newEmbeddingRegion, newEmbeddingRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStatechart getHighestParentStatechart() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAllUMLRealtimeStates(Set<Vertex> set, boolean inclusiveStartStates) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addComplexUMLRealtimeStates(Set<State> set) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAllUMLRealtimeTransitions(Set<Transition> set) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator iteratorOfAllUMLClocks(boolean excludeNoClock) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAllUMLClocks(Set<Clock> set, boolean excludeNoClock) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject clone() {
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
			case CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE:
				if (uMLRealtimeStartState != null)
					msgs = ((InternalEObject)uMLRealtimeStartState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE, null, msgs);
				return basicSetUMLRealtimeStartState((InitialState)otherEnd, msgs);
			case CorePackage.ABSTRACT_STATECHART__CLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClocks()).basicAdd(otherEnd, msgs);
			case CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION:
				if (embeddingRegion != null)
					msgs = ((InternalEObject)embeddingRegion).eInverseRemove(this, RealtimestatechartPackage.REGION__STATECHART, Region.class, msgs);
				return basicSetEmbeddingRegion((Region)otherEnd, msgs);
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
			case CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE:
				return basicSetUMLRealtimeStartState(null, msgs);
			case CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE:
				return basicSetUMLComplexRealtimeState(null, msgs);
			case CorePackage.ABSTRACT_STATECHART__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_STATECHART__VERTICES:
				return ((InternalEList<?>)getVertices()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_STATECHART__ECLASS:
				return basicSetEClass(null, msgs);
			case CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART:
				return basicSetUMLInterfaceStatechart(null, msgs);
			case CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE:
				return basicSetProvidedMsgIFace(null, msgs);
			case CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE:
				return basicSetRequiredMsgIFace(null, msgs);
			case CorePackage.ABSTRACT_STATECHART__CLOCKS:
				return ((InternalEList<?>)getClocks()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION:
				return basicSetEmbeddingRegion(null, msgs);
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
			case CorePackage.ABSTRACT_STATECHART__COMMENT:
				return getComment();
			case CorePackage.ABSTRACT_STATECHART__EVENT_QUEUE_SIZE:
				return getEventQueueSize();
			case CorePackage.ABSTRACT_STATECHART__WCET_DOCUMENT:
				return getWcetDocument();
			case CorePackage.ABSTRACT_STATECHART__SECURITY_LEVEL:
				return getSecurityLevel();
			case CorePackage.ABSTRACT_STATECHART__SYSTEM_WCET_MAP:
				return getSystemWcetMap();
			case CorePackage.ABSTRACT_STATECHART__UTILISATION:
				return getUtilisation();
			case CorePackage.ABSTRACT_STATECHART__SCHEDULE_DOCUMENT:
				return getScheduleDocument();
			case CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE:
				return getUMLRealtimeStartState();
			case CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE:
				return getUMLComplexRealtimeState();
			case CorePackage.ABSTRACT_STATECHART__TRANSITIONS:
				return getTransitions();
			case CorePackage.ABSTRACT_STATECHART__VERTICES:
				return getVertices();
			case CorePackage.ABSTRACT_STATECHART__ECLASS:
				return getEClass();
			case CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART:
				return getUMLInterfaceStatechart();
			case CorePackage.ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT:
				if (resolve) return getBehavioralElement();
				return basicGetBehavioralElement();
			case CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE:
				return getProvidedMsgIFace();
			case CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE:
				return getRequiredMsgIFace();
			case CorePackage.ABSTRACT_STATECHART__IS_EMBEDDED:
				return isIsEmbedded();
			case CorePackage.ABSTRACT_STATECHART__CLOCKS:
				return getClocks();
			case CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION:
				if (resolve) return getEmbeddingRegion();
				return basicGetEmbeddingRegion();
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
			case CorePackage.ABSTRACT_STATECHART__COMMENT:
				setComment((String)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__EVENT_QUEUE_SIZE:
				setEventQueueSize((Integer)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__WCET_DOCUMENT:
				setWcetDocument((String)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__SECURITY_LEVEL:
				setSecurityLevel((Integer)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__SYSTEM_WCET_MAP:
				setSystemWcetMap((Map)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__UTILISATION:
				setUtilisation((Double)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__SCHEDULE_DOCUMENT:
				setScheduleDocument((String)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE:
				setUMLRealtimeStartState((InitialState)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE:
				setUMLComplexRealtimeState((State)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__VERTICES:
				getVertices().clear();
				getVertices().addAll((Collection<? extends Vertex>)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__ECLASS:
				setEClass((EClass)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART:
				setUMLInterfaceStatechart((UMLInterfaceStatechart)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT:
				setBehavioralElement((BehavioralElement)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE:
				setProvidedMsgIFace((Map.Entry<String, EClass>)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE:
				setRequiredMsgIFace((Map.Entry<String, EClass>)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__IS_EMBEDDED:
				setIsEmbedded((Boolean)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__CLOCKS:
				getClocks().clear();
				getClocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION:
				setEmbeddingRegion((Region)newValue);
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
			case CorePackage.ABSTRACT_STATECHART__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_STATECHART__EVENT_QUEUE_SIZE:
				setEventQueueSize(EVENT_QUEUE_SIZE_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_STATECHART__WCET_DOCUMENT:
				setWcetDocument(WCET_DOCUMENT_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_STATECHART__SECURITY_LEVEL:
				setSecurityLevel(SECURITY_LEVEL_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_STATECHART__SYSTEM_WCET_MAP:
				setSystemWcetMap(SYSTEM_WCET_MAP_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_STATECHART__UTILISATION:
				setUtilisation(UTILISATION_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_STATECHART__SCHEDULE_DOCUMENT:
				setScheduleDocument(SCHEDULE_DOCUMENT_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE:
				setUMLRealtimeStartState((InitialState)null);
				return;
			case CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE:
				setUMLComplexRealtimeState((State)null);
				return;
			case CorePackage.ABSTRACT_STATECHART__TRANSITIONS:
				getTransitions().clear();
				return;
			case CorePackage.ABSTRACT_STATECHART__VERTICES:
				getVertices().clear();
				return;
			case CorePackage.ABSTRACT_STATECHART__ECLASS:
				setEClass((EClass)null);
				return;
			case CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART:
				setUMLInterfaceStatechart((UMLInterfaceStatechart)null);
				return;
			case CorePackage.ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT:
				setBehavioralElement((BehavioralElement)null);
				return;
			case CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE:
				setProvidedMsgIFace((Map.Entry<String, EClass>)null);
				return;
			case CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE:
				setRequiredMsgIFace((Map.Entry<String, EClass>)null);
				return;
			case CorePackage.ABSTRACT_STATECHART__IS_EMBEDDED:
				setIsEmbedded(IS_EMBEDDED_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_STATECHART__CLOCKS:
				getClocks().clear();
				return;
			case CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION:
				setEmbeddingRegion((Region)null);
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
			case CorePackage.ABSTRACT_STATECHART__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorePackage.ABSTRACT_STATECHART__EVENT_QUEUE_SIZE:
				return eventQueueSize != EVENT_QUEUE_SIZE_EDEFAULT;
			case CorePackage.ABSTRACT_STATECHART__WCET_DOCUMENT:
				return WCET_DOCUMENT_EDEFAULT == null ? wcetDocument != null : !WCET_DOCUMENT_EDEFAULT.equals(wcetDocument);
			case CorePackage.ABSTRACT_STATECHART__SECURITY_LEVEL:
				return securityLevel != SECURITY_LEVEL_EDEFAULT;
			case CorePackage.ABSTRACT_STATECHART__SYSTEM_WCET_MAP:
				return SYSTEM_WCET_MAP_EDEFAULT == null ? systemWcetMap != null : !SYSTEM_WCET_MAP_EDEFAULT.equals(systemWcetMap);
			case CorePackage.ABSTRACT_STATECHART__UTILISATION:
				return utilisation != UTILISATION_EDEFAULT;
			case CorePackage.ABSTRACT_STATECHART__SCHEDULE_DOCUMENT:
				return SCHEDULE_DOCUMENT_EDEFAULT == null ? scheduleDocument != null : !SCHEDULE_DOCUMENT_EDEFAULT.equals(scheduleDocument);
			case CorePackage.ABSTRACT_STATECHART__UML_REALTIME_START_STATE:
				return uMLRealtimeStartState != null;
			case CorePackage.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE:
				return uMLComplexRealtimeState != null;
			case CorePackage.ABSTRACT_STATECHART__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case CorePackage.ABSTRACT_STATECHART__VERTICES:
				return vertices != null && !vertices.isEmpty();
			case CorePackage.ABSTRACT_STATECHART__ECLASS:
				return eClass != null;
			case CorePackage.ABSTRACT_STATECHART__UML_INTERFACE_STATECHART:
				return uMLInterfaceStatechart != null;
			case CorePackage.ABSTRACT_STATECHART__BEHAVIORAL_ELEMENT:
				return behavioralElement != null;
			case CorePackage.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE:
				return providedMsgIFace != null;
			case CorePackage.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE:
				return requiredMsgIFace != null;
			case CorePackage.ABSTRACT_STATECHART__IS_EMBEDDED:
				return isEmbedded != IS_EMBEDDED_EDEFAULT;
			case CorePackage.ABSTRACT_STATECHART__CLOCKS:
				return clocks != null && !clocks.isEmpty();
			case CorePackage.ABSTRACT_STATECHART__EMBEDDING_REGION:
				return embeddingRegion != null;
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
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.ABSTRACT_STATECHART__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
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
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return CorePackage.ABSTRACT_STATECHART__COMMENT;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.ABSTRACT_STATECHART___GET_HIGHEST_PARENT_STATECHART:
				return getHighestParentStatechart();
			case CorePackage.ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_STATES__SET_BOOLEAN:
				addAllUMLRealtimeStates((Set<Vertex>)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case CorePackage.ABSTRACT_STATECHART___ADD_COMPLEX_UML_REALTIME_STATES__SET:
				addComplexUMLRealtimeStates((Set<State>)arguments.get(0));
				return null;
			case CorePackage.ABSTRACT_STATECHART___ADD_ALL_UML_REALTIME_TRANSITIONS__SET:
				addAllUMLRealtimeTransitions((Set<Transition>)arguments.get(0));
				return null;
			case CorePackage.ABSTRACT_STATECHART___ITERATOR_OF_ALL_UML_CLOCKS__BOOLEAN:
				return iteratorOfAllUMLClocks((Boolean)arguments.get(0));
			case CorePackage.ABSTRACT_STATECHART___ADD_ALL_UML_CLOCKS__SET_BOOLEAN:
				addAllUMLClocks((Set<Clock>)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case CorePackage.ABSTRACT_STATECHART___TO_STRING:
				return toString();
			case CorePackage.ABSTRACT_STATECHART___CLONE:
				return clone();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractStatechartImpl
