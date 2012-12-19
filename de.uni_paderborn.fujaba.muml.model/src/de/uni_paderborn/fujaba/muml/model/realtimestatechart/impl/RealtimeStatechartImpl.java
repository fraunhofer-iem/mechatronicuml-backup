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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.common.algorithm.BreadthFirstSearchAlgorithm;
import de.uni_paderborn.fujaba.common.algorithm.ISearchVisitor;
import de.uni_paderborn.fujaba.muml.model.component.Port;
import de.uni_paderborn.fujaba.muml.model.core.Behavior;
import de.uni_paderborn.fujaba.muml.model.core.BehavioralElement;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.Operation;
import de.uni_paderborn.fujaba.muml.model.core.Variable;
import de.uni_paderborn.fujaba.muml.model.protocol.Role;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Clock;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getEmbeddingRegion <em>Embedding Region</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getStates <em>States</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#isHistory <em>History</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getEventQueueSize <em>Event Queue Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#isFlat <em>Flat</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getAvailableClocks <em>Available Clocks</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RealtimeStatechartImpl#getAllAvailableVariables <em>All Available Variables</em>}</li>
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
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

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
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

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
	 * The cached setting delegate for the '{@link #isEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedded()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EMBEDDED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REALTIME_STATECHART__EMBEDDED).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAllAvailableVariables() <em>All Available Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAvailableVariables()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_AVAILABLE_VARIABLES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES).getSettingDelegate();

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
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getEmbeddingRegion() {
		if (eContainerFeatureID() != RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION) return null;
		return (Region)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddingRegion(Region newEmbeddingRegion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmbeddingRegion, RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddingRegion(Region newEmbeddingRegion) {
		if (newEmbeddingRegion != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION && newEmbeddingRegion != null)) {
			if (EcoreUtil.isAncestor(this, newEmbeddingRegion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
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
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<State>(State.class, this, RealtimestatechartPackage.REALTIME_STATECHART__STATES, RealtimestatechartPackage.STATE__STATECHART);
		}
		return states;
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
	public boolean isEmbedded() {
		return (Boolean)EMBEDDED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Variable> getAllAvailableVariables() {
		return (EList<Variable>)ALL_AVAILABLE_VARIABLES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Operation> getAllAvailableOperations() {
		return (EList<Operation>)ALL_AVAILABLE_OPERATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	public RealtimeStatechart getHighestParentStatechart() {
		RealtimeStatechart rtsc = this;
		while (rtsc.isEmbedded()==true)
		{rtsc = rtsc.getEmbeddingRegion().getParentState().getStatechart();} 
		return rtsc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart getPortOrRoleStatechart() {
		// check if this rtsc has a behavioral element
		RealtimeStatechart rtsc = this;
		if (rtsc.getBehavioralElement()!=null && ((rtsc.getBehavioralElement() instanceof Port) || (rtsc.getBehavioralElement() instanceof Role))) return rtsc;
		
		// search for ancestor with behavioral element
		while (rtsc.isEmbedded()==true) {
		rtsc = rtsc.getEmbeddingRegion().getParentState().getStatechart();
		if (rtsc.getBehavioralElement()!=null && ((rtsc.getBehavioralElement() instanceof Port) || (rtsc.getBehavioralElement() instanceof Role))) return rtsc;
		} 
		
		// no rtsc found with behavioral element
		return this;
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
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmbeddingRegion((Region)otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				return basicSetEmbeddingRegion(null, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.REGION__STATECHART, Region.class, msgs);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__COMMENT:
				return getComment();
			case RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT:
				if (resolve) return getBehavioralElement();
				return basicGetBehavioralElement();
			case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS:
				return getOperations();
			case RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES:
				return getVariables();
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				return getEmbeddingRegion();
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return getTransitions();
			case RealtimestatechartPackage.REALTIME_STATECHART__STATES:
				return getStates();
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
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDED:
				return isEmbedded();
			case RealtimestatechartPackage.REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES:
				return getAllAvailableVariables();
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
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				setEmbeddingRegion((Region)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES:
				getVariables().clear();
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				setEmbeddingRegion((Region)null);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				getTransitions().clear();
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__STATES:
				getStates().clear();
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
			case RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES:
				return variables != null && !variables.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION:
				return getEmbeddingRegion() != null;
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__STATES:
				return states != null && !states.isEmpty();
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
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDED:
				return EMBEDDED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES:
				return ALL_AVAILABLE_VARIABLES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case RealtimestatechartPackage.REALTIME_STATECHART__COMMENT: return org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Behavior.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT: return CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT;
				case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS: return CorePackage.BEHAVIOR__OPERATIONS;
				case RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES: return CorePackage.BEHAVIOR__VARIABLES;
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
				case org.storydriven.core.CorePackage.COMMENTABLE_ELEMENT__COMMENT: return RealtimestatechartPackage.REALTIME_STATECHART__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Behavior.class) {
			switch (baseFeatureID) {
				case CorePackage.BEHAVIOR__BEHAVIORAL_ELEMENT: return RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT;
				case CorePackage.BEHAVIOR__OPERATIONS: return RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS;
				case CorePackage.BEHAVIOR__VARIABLES: return RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES;
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
		result.append(')');
		return result.toString();
	}

} //RealtimeStatechartImpl
