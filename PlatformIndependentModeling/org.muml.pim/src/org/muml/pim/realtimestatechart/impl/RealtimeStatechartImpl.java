/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.impl;

import java.lang.reflect.InvocationTargetException;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.CommentableElement;
import org.muml.core.CorePackage;
import org.muml.core.common.algorithm.BreadthFirstSearchAlgorithm;
import org.muml.core.common.algorithm.ISearchVisitor;
import org.muml.core.impl.NamedElementImpl;
import org.muml.pim.behavior.Behavior;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.behavior.BehavioralElement;
import org.muml.pim.behavior.Operation;
import org.muml.pim.behavior.OperationRepository;
import org.muml.pim.behavior.Variable;
import org.muml.pim.component.Port;
import org.muml.pim.protocol.Role;
import org.muml.pim.realtimestatechart.Clock;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getBehavioralElement <em>Behavioral Element</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getParentRegion <em>Parent Region</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#isFlat <em>Flat</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getAvailableClocks <em>Available Clocks</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getAllAvailableVariables <em>All Available Variables</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getAllAvailableOperations <em>All Available Operations</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getUsedOperationRepositories <em>Used Operation Repositories</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#isUsesOneToManyCommunicationSchemata <em>Uses One To Many Communication Schemata</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getSubRoleSpecificVariables <em>Sub Role Specific Variables</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getSubRoleSpecificClocks <em>Sub Role Specific Clocks</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.RealtimeStatechartImpl#getSubRoleSpecificOperations <em>Sub Role Specific Operations</em>}</li>
 * </ul>
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
	 * The cached value of the '{@link #getUsedOperationRepositories() <em>Used Operation Repositories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedOperationRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationRepository> usedOperationRepositories;

	/**
	 * The cached setting delegate for the '{@link #isUsesOneToManyCommunicationSchemata() <em>Uses One To Many Communication Schemata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsesOneToManyCommunicationSchemata()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getSubRoleSpecificVariables() <em>Sub Role Specific Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRoleSpecificVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> subRoleSpecificVariables;

	/**
	 * The cached value of the '{@link #getSubRoleSpecificClocks() <em>Sub Role Specific Clocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRoleSpecificClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> subRoleSpecificClocks;

	/**
	 * The cached value of the '{@link #getSubRoleSpecificOperations() <em>Sub Role Specific Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRoleSpecificOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> subRoleSpecificOperations;

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
				msgs = ((InternalEObject)behavioralElement).eInverseRemove(this, BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
			if (newBehavioralElement != null)
				msgs = ((InternalEObject)newBehavioralElement).eInverseAdd(this, BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
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
	public Region getParentRegion() {
		if (eContainerFeatureID() != RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION) return null;
		return (Region)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRegion(Region newParentRegion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRegion, RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRegion(Region newParentRegion) {
		if (newParentRegion != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION && newParentRegion != null)) {
			if (EcoreUtil.isAncestor(this, newParentRegion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRegion != null)
				msgs = ((InternalEObject)newParentRegion).eInverseAdd(this, RealtimestatechartPackage.REGION__EMBEDDED_STATECHART, Region.class, msgs);
			msgs = basicSetParentRegion(newParentRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION, newParentRegion, newParentRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS);
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
			states = new EObjectContainmentWithInverseEList<State>(State.class, this, RealtimestatechartPackage.REALTIME_STATECHART__STATES, RealtimestatechartPackage.STATE__PARENT_STATECHART);
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
	 * @generated
	 */
	public EList<OperationRepository> getUsedOperationRepositories() {
		if (usedOperationRepositories == null) {
			usedOperationRepositories = new EObjectResolvingEList<OperationRepository>(OperationRepository.class, this, RealtimestatechartPackage.REALTIME_STATECHART__USED_OPERATION_REPOSITORIES);
		}
		return usedOperationRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsesOneToManyCommunicationSchemata() {
		return (Boolean)USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesOneToManyCommunicationSchemata(boolean newUsesOneToManyCommunicationSchemata) {
		USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA__ESETTING_DELEGATE.dynamicSet(this, null, 0, newUsesOneToManyCommunicationSchemata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getSubRoleSpecificVariables() {
		if (subRoleSpecificVariables == null) {
			subRoleSpecificVariables = new EObjectContainmentEList<Variable>(Variable.class, this, RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES);
		}
		return subRoleSpecificVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getSubRoleSpecificClocks() {
		if (subRoleSpecificClocks == null) {
			subRoleSpecificClocks = new EObjectContainmentEList<Clock>(Clock.class, this, RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS);
		}
		return subRoleSpecificClocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getSubRoleSpecificOperations() {
		if (subRoleSpecificOperations == null) {
			subRoleSpecificOperations = new EObjectContainmentEList<Operation>(Operation.class, this, RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS);
		}
		return subRoleSpecificOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuperStatechartOf(final RealtimeStatechart statechart) {
		// TODO: Replace by OCL's transitive closure?
				
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
		
				Region region = rtsc.getParentRegion();
				if (region != null) {
					// List<Region> regions = rtsc.getParentRegions();
					// for (Region region : regions) {
					State state = region.getParentState();
					if (state != null && state.getParentStatechart() != null) {
						parentStatecharts.add(state.getParentStatechart());
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
		{rtsc = rtsc.getParentRegion().getParentState().getParentStatechart();} 
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
		rtsc = rtsc.getParentRegion().getParentState().getParentStatechart();
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
					msgs = ((InternalEObject)behavioralElement).eInverseRemove(this, BehaviorPackage.BEHAVIORAL_ELEMENT__BEHAVIOR, BehavioralElement.class, msgs);
				return basicSetBehavioralElement((BehavioralElement)otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRegion((Region)otherEnd, msgs);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION:
				return basicSetParentRegion(null, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
				return ((InternalEList<?>)getClocks()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES:
				return ((InternalEList<?>)getSubRoleSpecificVariables()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS:
				return ((InternalEList<?>)getSubRoleSpecificClocks()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS:
				return ((InternalEList<?>)getSubRoleSpecificOperations()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.REGION__EMBEDDED_STATECHART, Region.class, msgs);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION:
				return getParentRegion();
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return getTransitions();
			case RealtimestatechartPackage.REALTIME_STATECHART__STATES:
				return getStates();
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
				return getClocks();
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
			case RealtimestatechartPackage.REALTIME_STATECHART__USED_OPERATION_REPOSITORIES:
				return getUsedOperationRepositories();
			case RealtimestatechartPackage.REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA:
				return isUsesOneToManyCommunicationSchemata();
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES:
				return getSubRoleSpecificVariables();
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS:
				return getSubRoleSpecificClocks();
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS:
				return getSubRoleSpecificOperations();
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
			case RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION:
				setParentRegion((Region)newValue);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__USED_OPERATION_REPOSITORIES:
				getUsedOperationRepositories().clear();
				getUsedOperationRepositories().addAll((Collection<? extends OperationRepository>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA:
				setUsesOneToManyCommunicationSchemata((Boolean)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES:
				getSubRoleSpecificVariables().clear();
				getSubRoleSpecificVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS:
				getSubRoleSpecificClocks().clear();
				getSubRoleSpecificClocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS:
				getSubRoleSpecificOperations().clear();
				getSubRoleSpecificOperations().addAll((Collection<? extends Operation>)newValue);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION:
				setParentRegion((Region)null);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__USED_OPERATION_REPOSITORIES:
				getUsedOperationRepositories().clear();
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA:
				USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES:
				getSubRoleSpecificVariables().clear();
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS:
				getSubRoleSpecificClocks().clear();
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS:
				getSubRoleSpecificOperations().clear();
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
			case RealtimestatechartPackage.REALTIME_STATECHART__PARENT_REGION:
				return getParentRegion() != null;
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__STATES:
				return states != null && !states.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
				return clocks != null && !clocks.isEmpty();
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
			case RealtimestatechartPackage.REALTIME_STATECHART__USED_OPERATION_REPOSITORIES:
				return usedOperationRepositories != null && !usedOperationRepositories.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA:
				return USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES:
				return subRoleSpecificVariables != null && !subRoleSpecificVariables.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS:
				return subRoleSpecificClocks != null && !subRoleSpecificClocks.isEmpty();
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS:
				return subRoleSpecificOperations != null && !subRoleSpecificOperations.isEmpty();
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
				case RealtimestatechartPackage.REALTIME_STATECHART__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Behavior.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT: return BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT;
				case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS: return BehaviorPackage.BEHAVIOR__OPERATIONS;
				case RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES: return BehaviorPackage.BEHAVIOR__VARIABLES;
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
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return RealtimestatechartPackage.REALTIME_STATECHART__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Behavior.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.BEHAVIOR__BEHAVIORAL_ELEMENT: return RealtimestatechartPackage.REALTIME_STATECHART__BEHAVIORAL_ELEMENT;
				case BehaviorPackage.BEHAVIOR__OPERATIONS: return RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS;
				case BehaviorPackage.BEHAVIOR__VARIABLES: return RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.REALTIME_STATECHART___IS_SUPER_STATECHART_OF__REALTIMESTATECHART:
				return isSuperStatechartOf((RealtimeStatechart)arguments.get(0));
			case RealtimestatechartPackage.REALTIME_STATECHART___GET_HIGHEST_PARENT_STATECHART:
				return getHighestParentStatechart();
			case RealtimestatechartPackage.REALTIME_STATECHART___GET_PORT_OR_ROLE_STATECHART:
				return getPortOrRoleStatechart();
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
		result.append(')');
		return result.toString();
	}

} //RealtimeStatechartImpl
