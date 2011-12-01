/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.common.algorithm.BreadthFirstSearchAlgorithm;
import de.uni_paderborn.fujaba.common.algorithm.ISearchVisitor;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getBehavioralElement <em>Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getEmbeddingRegion <em>Embedding Region</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#isHistory <em>History</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getEventQueueSize <em>Event Queue Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#isFlat <em>Flat</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getAvailableClocks <em>Available Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getScheduleDocument <em>Schedule Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getAllAvailableAttributes <em>All Available Attributes</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getAllAvailableOperations <em>All Available Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealtimeStatechartImpl extends NamedElementImpl implements RealtimeStatechart {
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
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<EOperation> operations;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<EAttribute> attributes;

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
	 * The cached value of the '{@link #getClocks() <em>Clocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> clocks;

	/**
	 * The default value of the '{@link #isHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HISTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistory()
	 * @generated
	 * @ordered
	 */
	protected boolean history = HISTORY_EDEFAULT;

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
	 * The cached setting delegate for the '{@link #isFlat() <em>Flat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlat()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FLAT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REALTIME_STATECHART__FLAT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAvailableClocks() <em>Available Clocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableClocks()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate AVAILABLE_CLOCKS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REALTIME_STATECHART__AVAILABLE_CLOCKS).getSettingDelegate();

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
	 * The cached setting delegate for the '{@link #isEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedded()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EMBEDDED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REALTIME_STATECHART__EMBEDDED).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllAvailableAttributes() <em>All Available Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAvailableAttributes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_AVAILABLE_ATTRIBUTES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REALTIME_STATECHART__ALL_AVAILABLE_ATTRIBUTES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllAvailableOperations() <em>All Available Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAvailableOperations()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_AVAILABLE_OPERATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimeStatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.REALTIME_STATECHART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__COMMENT, oldComment, comment));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT, oldBehavioralElement, behavioralElement));
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
	public NotificationChain basicSetBehavioralElement(BehavioralElement newBehavioralElement, NotificationChain msgs) {
		BehavioralElement oldBehavioralElement = behavioralElement;
		behavioralElement = newBehavioralElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT, oldBehavioralElement, newBehavioralElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavioralElement(BehavioralElement newBehavioralElement) {
		if (newBehavioralElement != behavioralElement) {
			NotificationChain msgs = null;
			if (behavioralElement != null)
				msgs = ((InternalEObject)behavioralElement).eInverseRemove(this, CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
			if (newBehavioralElement != null)
				msgs = ((InternalEObject)newBehavioralElement).eInverseAdd(this, CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
			msgs = basicSetBehavioralElement(newBehavioralElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT, newBehavioralElement, newBehavioralElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<EOperation>(EOperation.class, this, RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<EAttribute>(EAttribute.class, this, RealtimestatechartPackage.REALTIME_STATECHART__ATTRIBUTES);
		}
		return attributes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION, oldEmbeddingRegion, embeddingRegion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION, oldEmbeddingRegion, newEmbeddingRegion);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION, newEmbeddingRegion, newEmbeddingRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS, RealtimestatechartPackage.TRANSITION__STATECHART);
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
			vertices = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, RealtimestatechartPackage.REALTIME_STATECHART__VERTICES, RealtimestatechartPackage.VERTEX__STATECHART);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getClocks() {
		if (clocks == null) {
			clocks = new EObjectContainmentWithInverseEList<Clock>(Clock.class, this, RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS, RealtimestatechartPackage.CLOCK__STATECHART);
		}
		return clocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistory(boolean newHistory) {
		boolean oldHistory = history;
		history = newHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__HISTORY, oldHistory, history));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__EVENT_QUEUE_SIZE, oldEventQueueSize, eventQueueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlat() {
		return (Boolean)FLAT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Clock> getAvailableClocks() {
		return (EList<Clock>)AVAILABLE_CLOCKS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__UTILISATION, oldUtilisation, utilisation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__SCHEDULE_DOCUMENT, oldScheduleDocument, scheduleDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isEmbedded() {
		return getEmbeddingRegion() != null;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EAttribute> getAllAvailableAttributes() {
		return (EList<EAttribute>)ALL_AVAILABLE_ATTRIBUTES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EOperation> getAllAvailableOperations() {
		return (EList<EOperation>)ALL_AVAILABLE_OPERATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSuperStatechartOf(RealtimeStatechart statechart) {
		Assert.isLegal(statechart != null);

		BreadthFirstSearchAlgorithm bfs = new BreadthFirstSearchAlgorithm();
		return bfs.search(statechart, new ISearchVisitor() {

			@Override
			public boolean visit(Object object) {
				return !RealtimeStatechartImpl.this.equals(object);
			}

			@Override
			public List<?> getAdjacentNodes(Object object) {
				RealtimeStatechart rtsc = (RealtimeStatechart) object;

				List<Object> parentStatecharts = new ArrayList<Object>();

				Region region = rtsc.getEmbeddingRegion();
				if (region != null) {
					// List<Region> regions = rtsc.getEmbeddingRegions();
					// for (Region region : regions) {
					State state = region.getParentState();
					if (state != null && state.getStatechart() != null) {
						parentStatecharts.add(state.getStatechart());
					}
					// }
				}

				return parentStatecharts;
			}

		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getHighestParentStatechart() {
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
			case RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				if (behavioralElement != null)
					msgs = ((InternalEObject)behavioralElement).eInverseRemove(this, CorePackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
				return basicSetBehavioralElement((BehavioralElement)otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				if (embeddingRegion != null)
					msgs = ((InternalEObject)embeddingRegion).eInverseRemove(this, RealtimestatechartPackage.REGION__STATECHART, Region.class, msgs);
				return basicSetEmbeddingRegion((Region)otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__VERTICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVertices()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClocks()).basicAdd(otherEnd, msgs);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				return basicSetBehavioralElement(null, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				return basicSetEmbeddingRegion(null, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__VERTICES:
				return ((InternalEList<?>)getVertices()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
				return ((InternalEList<?>)getClocks()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__COMMENT:
				return getComment();
			case RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				if (resolve) return getBehavioralElement();
				return basicGetBehavioralElement();
			case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS:
				return getOperations();
			case RealtimestatechartPackage.REALTIME_STATECHART__ATTRIBUTES:
				return getAttributes();
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				if (resolve) return getEmbeddingRegion();
				return basicGetEmbeddingRegion();
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return getTransitions();
			case RealtimestatechartPackage.REALTIME_STATECHART__VERTICES:
				return getVertices();
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
				return getClocks();
			case RealtimestatechartPackage.REALTIME_STATECHART__HISTORY:
				return isHistory();
			case RealtimestatechartPackage.REALTIME_STATECHART__EVENT_QUEUE_SIZE:
				return getEventQueueSize();
			case RealtimestatechartPackage.REALTIME_STATECHART__FLAT:
				return isFlat();
			case RealtimestatechartPackage.REALTIME_STATECHART__AVAILABLE_CLOCKS:
				return getAvailableClocks();
			case RealtimestatechartPackage.REALTIME_STATECHART__SECURITY_LEVEL:
				return getSecurityLevel();
			case RealtimestatechartPackage.REALTIME_STATECHART__UTILISATION:
				return getUtilisation();
			case RealtimestatechartPackage.REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				return getScheduleDocument();
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDED:
				return isEmbedded();
			case RealtimestatechartPackage.REALTIME_STATECHART__ALL_AVAILABLE_ATTRIBUTES:
				return getAllAvailableAttributes();
			case RealtimestatechartPackage.REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS:
				return getAllAvailableOperations();
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
			case RealtimestatechartPackage.REALTIME_STATECHART__COMMENT:
				setComment((String)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				setBehavioralElement((BehavioralElement)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends EOperation>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends EAttribute>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				setEmbeddingRegion((Region)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__VERTICES:
				getVertices().clear();
				getVertices().addAll((Collection<? extends Vertex>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
				getClocks().clear();
				getClocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__HISTORY:
				setHistory((Boolean)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__EVENT_QUEUE_SIZE:
				setEventQueueSize((Integer)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__SECURITY_LEVEL:
				setSecurityLevel((Integer)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__UTILISATION:
				setUtilisation((Double)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				setScheduleDocument((String)newValue);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				setBehavioralElement((BehavioralElement)null);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS:
				getOperations().clear();
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__ATTRIBUTES:
				getAttributes().clear();
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				setEmbeddingRegion((Region)null);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				getTransitions().clear();
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__VERTICES:
				getVertices().clear();
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
				getClocks().clear();
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__HISTORY:
				setHistory(HISTORY_EDEFAULT);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__EVENT_QUEUE_SIZE:
				setEventQueueSize(EVENT_QUEUE_SIZE_EDEFAULT);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__SECURITY_LEVEL:
				setSecurityLevel(SECURITY_LEVEL_EDEFAULT);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__UTILISATION:
				setUtilisation(UTILISATION_EDEFAULT);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				setScheduleDocument(SCHEDULE_DOCUMENT_EDEFAULT);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				return behavioralElement != null;
			case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				return embeddingRegion != null;
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__VERTICES:
				return vertices != null && !vertices.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
				return clocks != null && !clocks.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__HISTORY:
				return history != HISTORY_EDEFAULT;
			case RealtimestatechartPackage.REALTIME_STATECHART__EVENT_QUEUE_SIZE:
				return eventQueueSize != EVENT_QUEUE_SIZE_EDEFAULT;
			case RealtimestatechartPackage.REALTIME_STATECHART__FLAT:
				return FLAT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.REALTIME_STATECHART__AVAILABLE_CLOCKS:
				return AVAILABLE_CLOCKS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.REALTIME_STATECHART__SECURITY_LEVEL:
				return securityLevel != SECURITY_LEVEL_EDEFAULT;
			case RealtimestatechartPackage.REALTIME_STATECHART__UTILISATION:
				return utilisation != UTILISATION_EDEFAULT;
			case RealtimestatechartPackage.REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				return SCHEDULE_DOCUMENT_EDEFAULT == null ? scheduleDocument != null : !SCHEDULE_DOCUMENT_EDEFAULT.equals(scheduleDocument);
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDED:
				return EMBEDDED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.REALTIME_STATECHART__ALL_AVAILABLE_ATTRIBUTES:
				return ALL_AVAILABLE_ATTRIBUTES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS:
				return ALL_AVAILABLE_OPERATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case RealtimestatechartPackage.REALTIME_STATECHART__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Behavior.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT: return CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT;
				case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS: return CorePackage.BEHAVIOR__OPERATIONS;
				case RealtimestatechartPackage.REALTIME_STATECHART__ATTRIBUTES: return CorePackage.BEHAVIOR__ATTRIBUTES;
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
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return RealtimestatechartPackage.REALTIME_STATECHART__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Behavior.class) {
			switch (baseFeatureID) {
				case CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT: return RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT;
				case CorePackage.BEHAVIOR__OPERATIONS: return RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS;
				case CorePackage.BEHAVIOR__ATTRIBUTES: return RealtimestatechartPackage.REALTIME_STATECHART__ATTRIBUTES;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", history: ");
		result.append(history);
		result.append(", eventQueueSize: ");
		result.append(eventQueueSize);
		result.append(", securityLevel: ");
		result.append(securityLevel);
		result.append(", utilisation: ");
		result.append(utilisation);
		result.append(", scheduleDocument: ");
		result.append(scheduleDocument);
		result.append(')');
		return result.toString();
	}

} //RealtimeStatechartImpl
