/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex;
import de.uni_paderborn.fujaba.muml.model.runtime.AttributeBinding;
import de.uni_paderborn.fujaba.muml.model.runtime.RealtimeStatechartInstance;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimeBehavioralElement;
import de.uni_paderborn.fujaba.muml.model.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realtime Statechart Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RealtimeStatechartInstanceImpl#getRuntimeBehavioralElement <em>Runtime Behavioral Element</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RealtimeStatechartInstanceImpl#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RealtimeStatechartInstanceImpl#getActive <em>Active</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RealtimeStatechartInstanceImpl#getSubRealtimeStatechartInstances <em>Sub Realtime Statechart Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.runtime.impl.RealtimeStatechartInstanceImpl#getAttributeBindings <em>Attribute Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealtimeStatechartInstanceImpl extends ExtendableElementImpl implements RealtimeStatechartInstance {
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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected State active;

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
	 * The cached value of the '{@link #getAttributeBindings() <em>Attribute Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeBinding> attributeBindings;

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
		if (eContainerFeatureID() != RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT) return null;
		return (RuntimeBehavioralElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeBehavioralElement(RuntimeBehavioralElement newRuntimeBehavioralElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRuntimeBehavioralElement, RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeBehavioralElement(RuntimeBehavioralElement newRuntimeBehavioralElement) {
		if (newRuntimeBehavioralElement != eInternalContainer() || (eContainerFeatureID() != RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT && newRuntimeBehavioralElement != null)) {
			if (EcoreUtil.isAncestor(this, newRuntimeBehavioralElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
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
	 * @generated NOT
	 * 
	 * Returns all States of the real-time statechart. This method has been implemented in Java rather than OCL
	 * to improve the run-time performance.
	 */
	public EList<State> getStates() {
		
		EList<State> states = new BasicEList<State>(this.getInstanceOf().getVertices().size());
		for(Vertex curObject : this.getInstanceOf().getVertices()){
			if (curObject instanceof State){
				states.add((State)curObject);
			}
		}
		
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getActive() {
		if (active != null && active.eIsProxy()) {
			InternalEObject oldActive = (InternalEObject)active;
			active = (State)eResolveProxy(oldActive);
			if (active != oldActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE, oldActive, active));
			}
		}
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(State newActive) {
		State oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealtimeStatechartInstance> getSubRealtimeStatechartInstances() {
		if (subRealtimeStatechartInstances == null) {
			subRealtimeStatechartInstances = new EObjectContainmentEList<RealtimeStatechartInstance>(RealtimeStatechartInstance.class, this, RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES);
		}
		return subRealtimeStatechartInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeBinding> getAttributeBindings() {
		if (attributeBindings == null) {
			attributeBindings = new EObjectContainmentEList<AttributeBinding>(AttributeBinding.class, this, RuntimePackage.REALTIME_STATECHART_INSTANCE__ATTRIBUTE_BINDINGS);
		}
		return attributeBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRuntimeBehavioralElement((RuntimeBehavioralElement)otherEnd, msgs);
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ATTRIBUTE_BINDINGS:
				return ((InternalEList<?>)getAttributeBindings()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__RUNTIME_BEHAVIORAL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, RuntimePackage.RUNTIME_BEHAVIORAL_ELEMENT__STATECHART_INSTANCE, RuntimeBehavioralElement.class, msgs);
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
				return getRuntimeBehavioralElement();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__INSTANCE_OF:
				if (resolve) return getInstanceOf();
				return basicGetInstanceOf();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE:
				if (resolve) return getActive();
				return basicGetActive();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES:
				return getSubRealtimeStatechartInstances();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ATTRIBUTE_BINDINGS:
				return getAttributeBindings();
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE:
				setActive((State)newValue);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES:
				getSubRealtimeStatechartInstances().clear();
				getSubRealtimeStatechartInstances().addAll((Collection<? extends RealtimeStatechartInstance>)newValue);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ATTRIBUTE_BINDINGS:
				getAttributeBindings().clear();
				getAttributeBindings().addAll((Collection<? extends AttributeBinding>)newValue);
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
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE:
				setActive((State)null);
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES:
				getSubRealtimeStatechartInstances().clear();
				return;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ATTRIBUTE_BINDINGS:
				getAttributeBindings().clear();
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
				return getRuntimeBehavioralElement() != null;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__INSTANCE_OF:
				return instanceOf != null;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ACTIVE:
				return active != null;
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__SUB_REALTIME_STATECHART_INSTANCES:
				return subRealtimeStatechartInstances != null && !subRealtimeStatechartInstances.isEmpty();
			case RuntimePackage.REALTIME_STATECHART_INSTANCE__ATTRIBUTE_BINDINGS:
				return attributeBindings != null && !attributeBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RealtimeStatechartInstanceImpl
