/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.verification.core.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.ExtendableElementImpl;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.Transition;
import org.muml.pim.realtimestatechart.Vertex;
import org.muml.verification.core.runtime.RealtimeStatechartInstance;
import org.muml.verification.core.runtime.RuntimeBehavioralElement;
import org.muml.verification.core.runtime.RuntimePackage;
import org.muml.verification.core.runtime.VariableBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtime Statechart Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl#getActiveVertex <em>Active Vertex</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl#getSubRealtimeStatechartInstances <em>Sub Realtime Statechart Instances</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl#getParentRealtimeStatechartInstance <em>Parent Realtime Statechart Instance</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl#getVariableBindings <em>Variable Bindings</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl#getAllAvailableVariableBindings <em>All Available Variable Bindings</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl#getNearestRuntimeBehavioralElement <em>Nearest Runtime Behavioral Element</em>}</li>
 *   <li>{@link org.muml.verification.core.runtime.impl.RealtimeStatechartInstanceImpl#getActiveTransition <em>Active Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealtimeStatechartInstanceImpl extends ExtendableElementImpl implements RealtimeStatechartInstance {
	/**
	 * The cached value of the '{@link #getRuntimeBehavioralElement() <em>Runtime Behavioral Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeBehavioralElement()
	 * @generated
	 * @ordered
	 */
	protected RuntimeBehavioralElement runtimeBehavioralElement;

	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected RealtimeStatechart instanceOf;

	/**
	 * The cached value of the '{@link #getActiveVertex() <em>Active Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveVertex()
	 * @generated
	 * @ordered
	 */
	protected Vertex activeVertex;

	/**
	 * The cached value of the '{@link #getSubRealtimeStatechartInstances() <em>Sub Realtime Statechart Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRealtimeStatechartInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<RealtimeStatechartInstance> subRealtimeStatechartInstances;

	/**
	 * The cached value of the '{@link #getVariableBindings() <em>Variable Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableBinding> variableBindings;

	/**
	 * The cached setting delegate for the '{@link #getAllAvailableVariableBindings() <em>All Available Variable Bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAvailableVariableBindings()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_AVAILABLE_VARIABLE_BINDINGS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RuntimePackage.Literals.REALTIME_STATECHART_INSTANCE__ALL_AVAILABLE_VARIABLE_BINDINGS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getNearestRuntimeBehavioralElement() <em>Nearest Runtime Behavioral Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNearestRuntimeBehavioralElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NEAREST_RUNTIME_BEHAVIORAL_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RuntimePackage.Literals.REALTIME_STATECHART_INSTANCE__NEAREST_RUNTIME_BEHAVIORAL_ELEMENT).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getActiveTransition() <em>Active Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition activeTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealtimeStatechartInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.REALTIME_STATECHART_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeBehavioralElement getRuntimeBehavioralElement() {
		if (runtimeBehavioralElement != null && runtimeBehavioralElement.eIsProxy()) {
			InternalEObject oldRuntimeBehavioralElement = (InternalEObject)runtimeBehavioralElement;
			runtimeBehavioralElement = (RuntimeBehavioralElement)eResolveProxy(oldRuntimeBehavioralElement);
			if (runtimeBehavioralElement != oldRuntimeBehavioralElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT, oldRuntimeBehavioralElement, runtimeBehavioralElement));
			}
		}
		return runtimeBehavioralElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeBehavioralElement basicGetRuntimeBehavioralElement() {
		return runtimeBehavioralElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeBehavioralElement(RuntimeBehavioralElement newRuntimeBehavioralElement, NotificationChain msgs) {
		RuntimeBehavioralElement oldRuntimeBehavioralElement = runtimeBehavioralElement;
		runtimeBehavioralElement = newRuntimeBehavioralElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT, oldRuntimeBehavioralElement, newRuntimeBehavioralElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeBehavioralElement(RuntimeBehavioralElement newRuntimeBehavioralElement) {
		if (newRuntimeBehavioralElement != runtimeBehavioralElement) {
			NotificationChain msgs = null;
			if (runtimeBehavioralElement != null)
				msgs = ((InternalEObject)runtimeBehavioralElement).eInverseRemove(this, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE, RuntimeBehavioralElement.class, msgs);
			if (newRuntimeBehavioralElement != null)
				msgs = ((InternalEObject)newRuntimeBehavioralElement).eInverseAdd(this, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE, RuntimeBehavioralElement.class, msgs);
			msgs = basicSetRuntimeBehavioralElement(newRuntimeBehavioralElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT, newRuntimeBehavioralElement, newRuntimeBehavioralElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject)instanceOf;
			instanceOf = (RealtimeStatechart)eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.REALTIME_STATECHART_INSTANCE__INSTANCE_OF, oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOf(RealtimeStatechart newInstanceOf) {
		RealtimeStatechart oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.REALTIME_STATECHART_INSTANCE__INSTANCE_OF, oldInstanceOf, instanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getActiveVertex() {
		if (activeVertex != null && activeVertex.eIsProxy()) {
			InternalEObject oldActiveVertex = (InternalEObject)activeVertex;
			activeVertex = (Vertex)eResolveProxy(oldActiveVertex);
			if (activeVertex != oldActiveVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_VERTEX, oldActiveVertex, activeVertex));
			}
		}
		return activeVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetActiveVertex() {
		return activeVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveVertex(Vertex newActiveVertex) {
		Vertex oldActiveVertex = activeVertex;
		activeVertex = newActiveVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_VERTEX, oldActiveVertex, activeVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * 
	 * Returns all States of the real-time statechart. This method has been implemented in Java rather than OCL
	 * to improve the run-time performance.
	 */
	public EList<State> getStates() {
		// BEGIN: Deactivated because RealtimeStatechart does not have a reference to vertices anymore 
//		EList<State> states = new BasicEList<State>(this.getInstanceOf().getVertices().size());
//		for(Vertex curObject : this.getInstanceOf().getVertices()){
//			if (curObject instanceof State){
//				states.add((State)curObject);
//			}
//		}
		// END Deactivated

		// The following code replaces it:

		RealtimeStatechart statechart = getInstanceOf();
		if (statechart != null) {
			return statechart.getStates();
		}
		return ECollections.emptyEList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealtimeStatechartInstance> getSubRealtimeStatechartInstances() {
		if (subRealtimeStatechartInstances == null) {
			subRealtimeStatechartInstances = new EObjectContainmentWithInverseEList<RealtimeStatechartInstance>(RealtimeStatechartInstance.class, this, RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES, RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE);
		}
		return subRealtimeStatechartInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartInstance getParentRealtimeStatechartInstance() {
		if (eContainerFeatureID() != RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE) return null;
		return (RealtimeStatechartInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRealtimeStatechartInstance(RealtimeStatechartInstance newParentRealtimeStatechartInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRealtimeStatechartInstance, RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRealtimeStatechartInstance(RealtimeStatechartInstance newParentRealtimeStatechartInstance) {
		if (newParentRealtimeStatechartInstance != eInternalContainer() || (eContainerFeatureID() != RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE && newParentRealtimeStatechartInstance != null)) {
			if (EcoreUtil.isAncestor(this, newParentRealtimeStatechartInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRealtimeStatechartInstance != null)
				msgs = ((InternalEObject)newParentRealtimeStatechartInstance).eInverseAdd(this, RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES, RealtimeStatechartInstance.class, msgs);
			msgs = basicSetParentRealtimeStatechartInstance(newParentRealtimeStatechartInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE, newParentRealtimeStatechartInstance, newParentRealtimeStatechartInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableBinding> getVariableBindings() {
		if (variableBindings == null) {
			variableBindings = new EObjectContainmentEList<VariableBinding>(VariableBinding.class, this, RuntimePackage.REALTIME_STATECHART_INSTANCE__VARIABLE_BINDINGS);
		}
		return variableBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<VariableBinding> getAllAvailableVariableBindings() {
		return (EList<VariableBinding>)ALL_AVAILABLE_VARIABLE_BINDINGS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeBehavioralElement getNearestRuntimeBehavioralElement() {
		return (RuntimeBehavioralElement)NEAREST_RUNTIME_BEHAVIORAL_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeBehavioralElement basicGetNearestRuntimeBehavioralElement() {
		return (RuntimeBehavioralElement)NEAREST_RUNTIME_BEHAVIORAL_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNearestRuntimeBehavioralElement(RuntimeBehavioralElement newNearestRuntimeBehavioralElement) {
		NEAREST_RUNTIME_BEHAVIORAL_ELEMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newNearestRuntimeBehavioralElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getActiveTransition() {
		if (activeTransition != null && activeTransition.eIsProxy()) {
			InternalEObject oldActiveTransition = (InternalEObject)activeTransition;
			activeTransition = (Transition)eResolveProxy(oldActiveTransition);
			if (activeTransition != oldActiveTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_TRANSITION, oldActiveTransition, activeTransition));
			}
		}
		return activeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetActiveTransition() {
		return activeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveTransition(Transition newActiveTransition) {
		Transition oldActiveTransition = activeTransition;
		activeTransition = newActiveTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_TRANSITION, oldActiveTransition, activeTransition));
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT:
				if (runtimeBehavioralElement != null)
					msgs = ((InternalEObject)runtimeBehavioralElement).eInverseRemove(this, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE, RuntimeBehavioralElement.class, msgs);
				return basicSetRuntimeBehavioralElement((RuntimeBehavioralElement)otherEnd, msgs);
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubRealtimeStatechartInstances()).basicAdd(otherEnd, msgs);
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRealtimeStatechartInstance((RealtimeStatechartInstance)otherEnd, msgs);
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT:
				return basicSetRuntimeBehavioralElement(null, msgs);
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES:
				return ((InternalEList<?>)getSubRealtimeStatechartInstances()).basicRemove(otherEnd, msgs);
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE:
				return basicSetParentRealtimeStatechartInstance(null, msgs);
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__VARIABLE_BINDINGS:
				return ((InternalEList<?>)getVariableBindings()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE:
				return eInternalContainer().eInverseRemove(this, RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES, RealtimeStatechartInstance.class, msgs);
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT:
				if (resolve) return getRuntimeBehavioralElement();
				return basicGetRuntimeBehavioralElement();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__INSTANCE_OF:
				if (resolve) return getInstanceOf();
				return basicGetInstanceOf();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_VERTEX:
				if (resolve) return getActiveVertex();
				return basicGetActiveVertex();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES:
				return getSubRealtimeStatechartInstances();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE:
				return getParentRealtimeStatechartInstance();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__VARIABLE_BINDINGS:
				return getVariableBindings();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ALL_AVAILABLE_VARIABLE_BINDINGS:
				return getAllAvailableVariableBindings();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__NEAREST_RUNTIME_BEHAVIORAL_ELEMENT:
				if (resolve) return getNearestRuntimeBehavioralElement();
				return basicGetNearestRuntimeBehavioralElement();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_TRANSITION:
				if (resolve) return getActiveTransition();
				return basicGetActiveTransition();
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT:
				setRuntimeBehavioralElement((RuntimeBehavioralElement)newValue);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__INSTANCE_OF:
				setInstanceOf((RealtimeStatechart)newValue);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_VERTEX:
				setActiveVertex((Vertex)newValue);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES:
				getSubRealtimeStatechartInstances().clear();
				getSubRealtimeStatechartInstances().addAll((Collection<? extends RealtimeStatechartInstance>)newValue);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE:
				setParentRealtimeStatechartInstance((RealtimeStatechartInstance)newValue);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__VARIABLE_BINDINGS:
				getVariableBindings().clear();
				getVariableBindings().addAll((Collection<? extends VariableBinding>)newValue);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__NEAREST_RUNTIME_BEHAVIORAL_ELEMENT:
				setNearestRuntimeBehavioralElement((RuntimeBehavioralElement)newValue);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_TRANSITION:
				setActiveTransition((Transition)newValue);
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT:
				setRuntimeBehavioralElement((RuntimeBehavioralElement)null);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__INSTANCE_OF:
				setInstanceOf((RealtimeStatechart)null);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_VERTEX:
				setActiveVertex((Vertex)null);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES:
				getSubRealtimeStatechartInstances().clear();
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE:
				setParentRealtimeStatechartInstance((RealtimeStatechartInstance)null);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__VARIABLE_BINDINGS:
				getVariableBindings().clear();
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__NEAREST_RUNTIME_BEHAVIORAL_ELEMENT:
				setNearestRuntimeBehavioralElement((RuntimeBehavioralElement)null);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_TRANSITION:
				setActiveTransition((Transition)null);
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT:
				return runtimeBehavioralElement != null;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__INSTANCE_OF:
				return instanceOf != null;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_VERTEX:
				return activeVertex != null;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES:
				return subRealtimeStatechartInstances != null && !subRealtimeStatechartInstances.isEmpty();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__PARENT_REALTIME_STATECHART_INSTANCE:
				return getParentRealtimeStatechartInstance() != null;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__VARIABLE_BINDINGS:
				return variableBindings != null && !variableBindings.isEmpty();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ALL_AVAILABLE_VARIABLE_BINDINGS:
				return ALL_AVAILABLE_VARIABLE_BINDINGS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__NEAREST_RUNTIME_BEHAVIORAL_ELEMENT:
				return NEAREST_RUNTIME_BEHAVIORAL_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE_TRANSITION:
				return activeTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //RealtimeStatechartInstanceImpl
