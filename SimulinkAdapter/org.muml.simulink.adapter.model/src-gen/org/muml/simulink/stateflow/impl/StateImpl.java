/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.stateflow.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.simulink.stateflow.Action;
import org.muml.simulink.stateflow.Data;
import org.muml.simulink.stateflow.EmbeddedFunction;
import org.muml.simulink.stateflow.Event;
import org.muml.simulink.stateflow.Node;
import org.muml.simulink.stateflow.State;
import org.muml.simulink.stateflow.StateflowPackage;
import org.muml.simulink.stateflow.SubStateType;
import org.muml.simulink.stateflow.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getSubStateType <em>Sub State Type</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#isInitial <em>Initial</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getEmbeddedFunctions <em>Embedded Functions</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getDuringAction <em>During Action</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.muml.simulink.stateflow.impl.StateImpl#getInitial_guard <em>Initial guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends NodeImpl implements State {
	/**
	 * The default value of the '{@link #getSubStateType() <em>Sub State Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStateType()
	 * @generated
	 * @ordered
	 */
	protected static final SubStateType SUB_STATE_TYPE_EDEFAULT = SubStateType.EXCLUSIVE;

	/**
	 * The cached value of the '{@link #getSubStateType() <em>Sub State Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStateType()
	 * @generated
	 * @ordered
	 */
	protected SubStateType subStateType = SUB_STATE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The default value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitial() <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean initial = INITIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmbeddedFunctions() <em>Embedded Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<EmbeddedFunction> embeddedFunctions;

	/**
	 * The cached value of the '{@link #getEntryAction() <em>Entry Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> entryAction;

	/**
	 * The cached value of the '{@link #getExitAction() <em>Exit Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> exitAction;

	/**
	 * The cached value of the '{@link #getDuringAction() <em>During Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuringAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> duringAction;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> local;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> constant;

	/**
	 * The cached value of the '{@link #getInitial_guard() <em>Initial guard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_guard()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> initial_guard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateflowPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubStateType getSubStateType() {
		return subStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubStateType(SubStateType newSubStateType) {
		SubStateType oldSubStateType = subStateType;
		subStateType = newSubStateType == null ? SUB_STATE_TYPE_EDEFAULT : newSubStateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateflowPackage.STATE__SUB_STATE_TYPE, oldSubStateType, subStateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<Node>(Node.class, this, StateflowPackage.STATE__NODES, StateflowPackage.NODE__PARENT);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, StateflowPackage.STATE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateflowPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getEntryAction() {
		if (entryAction == null) {
			entryAction = new EObjectContainmentEList<Action>(Action.class, this, StateflowPackage.STATE__ENTRY_ACTION);
		}
		return entryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getExitAction() {
		if (exitAction == null) {
			exitAction = new EObjectContainmentEList<Action>(Action.class, this, StateflowPackage.STATE__EXIT_ACTION);
		}
		return exitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getDuringAction() {
		if (duringAction == null) {
			duringAction = new EObjectContainmentEList<Action>(Action.class, this, StateflowPackage.STATE__DURING_ACTION);
		}
		return duringAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getLocal() {
		if (local == null) {
			local = new EObjectContainmentEList<Data>(Data.class, this, StateflowPackage.STATE__LOCAL);
		}
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getConstant() {
		if (constant == null) {
			constant = new EObjectContainmentEList<Data>(Data.class, this, StateflowPackage.STATE__CONSTANT);
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getInitial_guard() {
		if (initial_guard == null) {
			initial_guard = new EObjectContainmentEList<Action>(Action.class, this, StateflowPackage.STATE__INITIAL_GUARD);
		}
		return initial_guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateflowPackage.STATE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, StateflowPackage.STATE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(boolean newInitial) {
		boolean oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateflowPackage.STATE__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmbeddedFunction> getEmbeddedFunctions() {
		if (embeddedFunctions == null) {
			embeddedFunctions = new EObjectContainmentEList<EmbeddedFunction>(EmbeddedFunction.class, this, StateflowPackage.STATE__EMBEDDED_FUNCTIONS);
		}
		return embeddedFunctions;
	}

	/**
	 * The cached invocation delegate for the '{@link #getSubState(java.lang.String) <em>Get Sub State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubState(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_SUB_STATE_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)StateflowPackage.Literals.STATE___GET_SUB_STATE__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSubState(String name) {
		try {
			return (State)GET_SUB_STATE_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{name}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case StateflowPackage.STATE__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
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
			case StateflowPackage.STATE__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case StateflowPackage.STATE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case StateflowPackage.STATE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case StateflowPackage.STATE__EMBEDDED_FUNCTIONS:
				return ((InternalEList<?>)getEmbeddedFunctions()).basicRemove(otherEnd, msgs);
			case StateflowPackage.STATE__ENTRY_ACTION:
				return ((InternalEList<?>)getEntryAction()).basicRemove(otherEnd, msgs);
			case StateflowPackage.STATE__EXIT_ACTION:
				return ((InternalEList<?>)getExitAction()).basicRemove(otherEnd, msgs);
			case StateflowPackage.STATE__DURING_ACTION:
				return ((InternalEList<?>)getDuringAction()).basicRemove(otherEnd, msgs);
			case StateflowPackage.STATE__LOCAL:
				return ((InternalEList<?>)getLocal()).basicRemove(otherEnd, msgs);
			case StateflowPackage.STATE__CONSTANT:
				return ((InternalEList<?>)getConstant()).basicRemove(otherEnd, msgs);
			case StateflowPackage.STATE__INITIAL_GUARD:
				return ((InternalEList<?>)getInitial_guard()).basicRemove(otherEnd, msgs);
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
			case StateflowPackage.STATE__SUB_STATE_TYPE:
				return getSubStateType();
			case StateflowPackage.STATE__NODES:
				return getNodes();
			case StateflowPackage.STATE__TRANSITIONS:
				return getTransitions();
			case StateflowPackage.STATE__NAME:
				return getName();
			case StateflowPackage.STATE__PRIORITY:
				return getPriority();
			case StateflowPackage.STATE__EVENTS:
				return getEvents();
			case StateflowPackage.STATE__INITIAL:
				return isInitial();
			case StateflowPackage.STATE__EMBEDDED_FUNCTIONS:
				return getEmbeddedFunctions();
			case StateflowPackage.STATE__ENTRY_ACTION:
				return getEntryAction();
			case StateflowPackage.STATE__EXIT_ACTION:
				return getExitAction();
			case StateflowPackage.STATE__DURING_ACTION:
				return getDuringAction();
			case StateflowPackage.STATE__LOCAL:
				return getLocal();
			case StateflowPackage.STATE__CONSTANT:
				return getConstant();
			case StateflowPackage.STATE__INITIAL_GUARD:
				return getInitial_guard();
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
			case StateflowPackage.STATE__SUB_STATE_TYPE:
				setSubStateType((SubStateType)newValue);
				return;
			case StateflowPackage.STATE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case StateflowPackage.STATE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case StateflowPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case StateflowPackage.STATE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case StateflowPackage.STATE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case StateflowPackage.STATE__INITIAL:
				setInitial((Boolean)newValue);
				return;
			case StateflowPackage.STATE__EMBEDDED_FUNCTIONS:
				getEmbeddedFunctions().clear();
				getEmbeddedFunctions().addAll((Collection<? extends EmbeddedFunction>)newValue);
				return;
			case StateflowPackage.STATE__ENTRY_ACTION:
				getEntryAction().clear();
				getEntryAction().addAll((Collection<? extends Action>)newValue);
				return;
			case StateflowPackage.STATE__EXIT_ACTION:
				getExitAction().clear();
				getExitAction().addAll((Collection<? extends Action>)newValue);
				return;
			case StateflowPackage.STATE__DURING_ACTION:
				getDuringAction().clear();
				getDuringAction().addAll((Collection<? extends Action>)newValue);
				return;
			case StateflowPackage.STATE__LOCAL:
				getLocal().clear();
				getLocal().addAll((Collection<? extends Data>)newValue);
				return;
			case StateflowPackage.STATE__CONSTANT:
				getConstant().clear();
				getConstant().addAll((Collection<? extends Data>)newValue);
				return;
			case StateflowPackage.STATE__INITIAL_GUARD:
				getInitial_guard().clear();
				getInitial_guard().addAll((Collection<? extends Action>)newValue);
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
			case StateflowPackage.STATE__SUB_STATE_TYPE:
				setSubStateType(SUB_STATE_TYPE_EDEFAULT);
				return;
			case StateflowPackage.STATE__NODES:
				getNodes().clear();
				return;
			case StateflowPackage.STATE__TRANSITIONS:
				getTransitions().clear();
				return;
			case StateflowPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StateflowPackage.STATE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case StateflowPackage.STATE__EVENTS:
				getEvents().clear();
				return;
			case StateflowPackage.STATE__INITIAL:
				setInitial(INITIAL_EDEFAULT);
				return;
			case StateflowPackage.STATE__EMBEDDED_FUNCTIONS:
				getEmbeddedFunctions().clear();
				return;
			case StateflowPackage.STATE__ENTRY_ACTION:
				getEntryAction().clear();
				return;
			case StateflowPackage.STATE__EXIT_ACTION:
				getExitAction().clear();
				return;
			case StateflowPackage.STATE__DURING_ACTION:
				getDuringAction().clear();
				return;
			case StateflowPackage.STATE__LOCAL:
				getLocal().clear();
				return;
			case StateflowPackage.STATE__CONSTANT:
				getConstant().clear();
				return;
			case StateflowPackage.STATE__INITIAL_GUARD:
				getInitial_guard().clear();
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
			case StateflowPackage.STATE__SUB_STATE_TYPE:
				return subStateType != SUB_STATE_TYPE_EDEFAULT;
			case StateflowPackage.STATE__NODES:
				return nodes != null && !nodes.isEmpty();
			case StateflowPackage.STATE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case StateflowPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StateflowPackage.STATE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case StateflowPackage.STATE__EVENTS:
				return events != null && !events.isEmpty();
			case StateflowPackage.STATE__INITIAL:
				return initial != INITIAL_EDEFAULT;
			case StateflowPackage.STATE__EMBEDDED_FUNCTIONS:
				return embeddedFunctions != null && !embeddedFunctions.isEmpty();
			case StateflowPackage.STATE__ENTRY_ACTION:
				return entryAction != null && !entryAction.isEmpty();
			case StateflowPackage.STATE__EXIT_ACTION:
				return exitAction != null && !exitAction.isEmpty();
			case StateflowPackage.STATE__DURING_ACTION:
				return duringAction != null && !duringAction.isEmpty();
			case StateflowPackage.STATE__LOCAL:
				return local != null && !local.isEmpty();
			case StateflowPackage.STATE__CONSTANT:
				return constant != null && !constant.isEmpty();
			case StateflowPackage.STATE__INITIAL_GUARD:
				return initial_guard != null && !initial_guard.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StateflowPackage.STATE___GET_SUB_STATE__STRING:
				return getSubState((String)arguments.get(0));
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
		result.append(" (subStateType: ");
		result.append(subStateType);
		result.append(", name: ");
		result.append(name);
		result.append(", priority: ");
		result.append(priority);
		result.append(", initial: ");
		result.append(initial);
		result.append(')');
		return result.toString();
	}

} //StateImpl
