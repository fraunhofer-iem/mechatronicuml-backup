/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getWcetDocument <em>Wcet Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getSystemWcetMap <em>System Wcet Map</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getScheduleDocument <em>Schedule Document</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getBehavioralElement <em>Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.impl.AbstractRealtimeStatechartImpl#getAvailableClocks <em>Available Clocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractRealtimeStatechartImpl extends NamedElementImpl implements AbstractRealtimeStatechart {
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
	 * The cached value of the '{@link #getBehavioralElement() <em>Behavioral Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavioralElement()
	 * @generated
	 * @ordered
	 */
	protected BehavioralElement behavioralElement;

	/**
	 * The default value of the '{@link #isEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedded()
	 * @generated
	 * @ordered
	 */
	protected boolean embedded = EMBEDDED_EDEFAULT;

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
	 * The default value of the '{@link #getAvailableClocks() <em>Available Clocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableClocks()
	 * @generated
	 * @ordered
	 */
	protected static final Iterator AVAILABLE_CLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableClocks() <em>Available Clocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableClocks()
	 * @generated
	 * @ordered
	 */
	protected Iterator availableClocks = AVAILABLE_CLOCKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRealtimeStatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ABSTRACT_REALTIME_STATECHART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT, oldComment, comment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__WCET_DOCUMENT, oldWcetDocument, wcetDocument));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__SYSTEM_WCET_MAP, oldSystemWcetMap, systemWcetMap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION, oldUtilisation, utilisation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT, oldScheduleDocument, scheduleDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, CorePackage.ABSTRACT_REALTIME_STATECHART__TRANSITIONS, RealtimestatechartPackage.TRANSITION__STATECHART);
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
			vertices = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, CorePackage.ABSTRACT_REALTIME_STATECHART__VERTICES, RealtimestatechartPackage.VERTEX__STATECHART);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__ECLASS, oldEClass, newEClass);
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
				msgs = ((InternalEObject)eClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_REALTIME_STATECHART__ECLASS, null, msgs);
			if (newEClass != null)
				msgs = ((InternalEObject)newEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ABSTRACT_REALTIME_STATECHART__ECLASS, null, msgs);
			msgs = basicSetEClass(newEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__ECLASS, newEClass, newEClass));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, oldBehavioralElement, behavioralElement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, oldBehavioralElement, newBehavioralElement);
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
				msgs = ((InternalEObject)behavioralElement).eInverseRemove(this, CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART, BehavioralElement.class, msgs);
			if (newBehavioralElement != null)
				msgs = ((InternalEObject)newBehavioralElement).eInverseAdd(this, CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART, BehavioralElement.class, msgs);
			msgs = basicSetBehavioralElement(newBehavioralElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT, newBehavioralElement, newBehavioralElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbedded() {
		return embedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedded(boolean newEmbedded) {
		boolean oldEmbedded = embedded;
		embedded = newEmbedded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__EMBEDDED, oldEmbedded, embedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getClocks() {
		if (clocks == null) {
			clocks = new EObjectContainmentWithInverseEList<Clock>(Clock.class, this, CorePackage.ABSTRACT_REALTIME_STATECHART__CLOCKS, RealtimestatechartPackage.CLOCK__STATECHART);
		}
		return clocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator getAvailableClocks() {
		return availableClocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableClocks(Iterator newAvailableClocks) {
		Iterator oldAvailableClocks = availableClocks;
		availableClocks = newAvailableClocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_REALTIME_STATECHART__AVAILABLE_CLOCKS, oldAvailableClocks, availableClocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart getHighestParentStatechart() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		result.append(", wcetDocument: ");
		result.append(wcetDocument);
		result.append(", securityLevel: ");
		result.append(securityLevel);
		result.append(", systemWcetMap: ");
		result.append(systemWcetMap);
		result.append(", utilisation: ");
		result.append(utilisation);
		result.append(", scheduleDocument: ");
		result.append(scheduleDocument);
		result.append(", embedded: ");
		result.append(embedded);
		result.append(", availableClocks: ");
		result.append(availableClocks);
		result.append(')');
		return result.toString();
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__VERTICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVertices()).basicAdd(otherEnd, msgs);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				if (behavioralElement != null)
					msgs = ((InternalEObject)behavioralElement).eInverseRemove(this, CorePackage.BEHAVIORAL_ELEMENT__REALTIME_STATECHART, BehavioralElement.class, msgs);
				return basicSetBehavioralElement((BehavioralElement)otherEnd, msgs);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__CLOCKS:
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__VERTICES:
				return ((InternalEList<?>)getVertices()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__ECLASS:
				return basicSetEClass(null, msgs);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				return basicSetBehavioralElement(null, msgs);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__CLOCKS:
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT:
				return getComment();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__WCET_DOCUMENT:
				return getWcetDocument();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL:
				return getSecurityLevel();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SYSTEM_WCET_MAP:
				return getSystemWcetMap();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION:
				return getUtilisation();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				return getScheduleDocument();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__TRANSITIONS:
				return getTransitions();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__VERTICES:
				return getVertices();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__ECLASS:
				return getEClass();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				if (resolve) return getBehavioralElement();
				return basicGetBehavioralElement();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__EMBEDDED:
				return isEmbedded();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__CLOCKS:
				return getClocks();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__AVAILABLE_CLOCKS:
				return getAvailableClocks();
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT:
				setComment((String)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__WCET_DOCUMENT:
				setWcetDocument((String)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL:
				setSecurityLevel((Integer)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SYSTEM_WCET_MAP:
				setSystemWcetMap((Map)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION:
				setUtilisation((Double)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				setScheduleDocument((String)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__VERTICES:
				getVertices().clear();
				getVertices().addAll((Collection<? extends Vertex>)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__ECLASS:
				setEClass((EClass)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				setBehavioralElement((BehavioralElement)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__EMBEDDED:
				setEmbedded((Boolean)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__CLOCKS:
				getClocks().clear();
				getClocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__AVAILABLE_CLOCKS:
				setAvailableClocks((Iterator)newValue);
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__WCET_DOCUMENT:
				setWcetDocument(WCET_DOCUMENT_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL:
				setSecurityLevel(SECURITY_LEVEL_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SYSTEM_WCET_MAP:
				setSystemWcetMap(SYSTEM_WCET_MAP_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION:
				setUtilisation(UTILISATION_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				setScheduleDocument(SCHEDULE_DOCUMENT_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__TRANSITIONS:
				getTransitions().clear();
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__VERTICES:
				getVertices().clear();
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__ECLASS:
				setEClass((EClass)null);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				setBehavioralElement((BehavioralElement)null);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__EMBEDDED:
				setEmbedded(EMBEDDED_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__CLOCKS:
				getClocks().clear();
				return;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__AVAILABLE_CLOCKS:
				setAvailableClocks(AVAILABLE_CLOCKS_EDEFAULT);
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__WCET_DOCUMENT:
				return WCET_DOCUMENT_EDEFAULT == null ? wcetDocument != null : !WCET_DOCUMENT_EDEFAULT.equals(wcetDocument);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SECURITY_LEVEL:
				return securityLevel != SECURITY_LEVEL_EDEFAULT;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SYSTEM_WCET_MAP:
				return SYSTEM_WCET_MAP_EDEFAULT == null ? systemWcetMap != null : !SYSTEM_WCET_MAP_EDEFAULT.equals(systemWcetMap);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__UTILISATION:
				return utilisation != UTILISATION_EDEFAULT;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__SCHEDULE_DOCUMENT:
				return SCHEDULE_DOCUMENT_EDEFAULT == null ? scheduleDocument != null : !SCHEDULE_DOCUMENT_EDEFAULT.equals(scheduleDocument);
			case CorePackage.ABSTRACT_REALTIME_STATECHART__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__VERTICES:
				return vertices != null && !vertices.isEmpty();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__ECLASS:
				return eClass != null;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				return behavioralElement != null;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__EMBEDDED:
				return embedded != EMBEDDED_EDEFAULT;
			case CorePackage.ABSTRACT_REALTIME_STATECHART__CLOCKS:
				return clocks != null && !clocks.isEmpty();
			case CorePackage.ABSTRACT_REALTIME_STATECHART__AVAILABLE_CLOCKS:
				return AVAILABLE_CLOCKS_EDEFAULT == null ? availableClocks != null : !AVAILABLE_CLOCKS_EDEFAULT.equals(availableClocks);
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
				case CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT: return SDMPackage.COMMENTABLE_ELEMENT__COMMENT;
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
				case SDMPackage.COMMENTABLE_ELEMENT__COMMENT: return CorePackage.ABSTRACT_REALTIME_STATECHART__COMMENT;
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
			case CorePackage.ABSTRACT_REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART:
				return getHighestParentStatechart();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractRealtimeStatechartImpl
