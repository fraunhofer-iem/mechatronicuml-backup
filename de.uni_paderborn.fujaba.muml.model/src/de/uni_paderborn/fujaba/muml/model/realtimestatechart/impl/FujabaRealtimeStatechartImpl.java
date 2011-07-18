/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.model.core.impl.AbstractRealtimeStatechartImpl;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fujaba Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl#getEmbeddingRegion <em>Embedding Region</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl#isHistory <em>History</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl#getEventQueueSize <em>Event Queue Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.FujabaRealtimeStatechartImpl#getAvailableClocks <em>Available Clocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FujabaRealtimeStatechartImpl extends AbstractRealtimeStatechartImpl implements FujabaRealtimeStatechart {
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
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

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
	 * The cached value of the '{@link #getAvailableClocks() <em>Available Clocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> availableClocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FujabaRealtimeStatechartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION, oldEmbeddingRegion, embeddingRegion));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION, oldEmbeddingRegion, newEmbeddingRegion);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION, newEmbeddingRegion, newEmbeddingRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS, RealtimestatechartPackage.TRANSITION__STATECHART);
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
			vertices = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__VERTICES, RealtimestatechartPackage.VERTEX__STATECHART);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__ECLASS, oldEClass, eClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getClocks() {
		if (clocks == null) {
			clocks = new EObjectContainmentWithInverseEList<Clock>(Clock.class, this, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__CLOCKS, RealtimestatechartPackage.CLOCK__STATECHART);
		}
		return clocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getAvailableClocks() {
		if (availableClocks == null) {
			availableClocks = new EObjectResolvingEList<Clock>(Clock.class, this, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS);
		}
		return availableClocks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__HISTORY, oldHistory, history));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EVENT_QUEUE_SIZE, oldEventQueueSize, eventQueueSize));
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				if (embeddingRegion != null)
					msgs = ((InternalEObject)embeddingRegion).eInverseRemove(this, RealtimestatechartPackage.REGION__STATECHART, Region.class, msgs);
				return basicSetEmbeddingRegion((Region)otherEnd, msgs);
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__VERTICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVertices()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__CLOCKS:
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				return basicSetEmbeddingRegion(null, msgs);
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__VERTICES:
				return ((InternalEList<?>)getVertices()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__CLOCKS:
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				if (resolve) return getEmbeddingRegion();
				return basicGetEmbeddingRegion();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS:
				return getTransitions();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__VERTICES:
				return getVertices();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__CLOCKS:
				return getClocks();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__HISTORY:
				return isHistory();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EVENT_QUEUE_SIZE:
				return getEventQueueSize();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS:
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				setEmbeddingRegion((Region)newValue);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__VERTICES:
				getVertices().clear();
				getVertices().addAll((Collection<? extends Vertex>)newValue);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__ECLASS:
				setEClass((EClass)newValue);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__CLOCKS:
				getClocks().clear();
				getClocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__HISTORY:
				setHistory((Boolean)newValue);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EVENT_QUEUE_SIZE:
				setEventQueueSize((Integer)newValue);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS:
				getAvailableClocks().clear();
				getAvailableClocks().addAll((Collection<? extends Clock>)newValue);
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				setEmbeddingRegion((Region)null);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS:
				getTransitions().clear();
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__VERTICES:
				getVertices().clear();
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__ECLASS:
				setEClass((EClass)null);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__CLOCKS:
				getClocks().clear();
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__HISTORY:
				setHistory(HISTORY_EDEFAULT);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EVENT_QUEUE_SIZE:
				setEventQueueSize(EVENT_QUEUE_SIZE_EDEFAULT);
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS:
				getAvailableClocks().clear();
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
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION:
				return embeddingRegion != null;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__VERTICES:
				return vertices != null && !vertices.isEmpty();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__ECLASS:
				return eClass != null;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__CLOCKS:
				return clocks != null && !clocks.isEmpty();
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__HISTORY:
				return history != HISTORY_EDEFAULT;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EVENT_QUEUE_SIZE:
				return eventQueueSize != EVENT_QUEUE_SIZE_EDEFAULT;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS:
				return availableClocks != null && !availableClocks.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (history: ");
		result.append(history);
		result.append(", eventQueueSize: ");
		result.append(eventQueueSize);
		result.append(')');
		return result.toString();
	}

} //FujabaRealtimeStatechartImpl
