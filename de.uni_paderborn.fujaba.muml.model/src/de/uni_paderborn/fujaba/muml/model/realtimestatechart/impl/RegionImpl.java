/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Prioritizable;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.NamedElementImpl;
import org.storydriven.modeling.ExtendableElement;
import org.storydriven.modeling.Extension;
import org.storydriven.modeling.NamedElement;
import org.storydriven.modeling.SDMPackage;

import de.uni_paderborn.fujaba.common.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Region;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RegionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RegionImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RegionImpl#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RegionImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RegionImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.impl.RegionImpl#getStatechartDerived <em>Statechart Derived</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends NamedElementImpl implements Region {
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
	 * The cached value of the '{@link #getStatechart() <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechart()
	 * @generated
	 * @ordered
	 */
	protected RealtimeStatechart statechart;

	/**
	 * The cached setting delegate for the '{@link #getVertices() <em>Vertices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VERTICES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REGION__VERTICES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TRANSITIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REGION__TRANSITIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getStatechartDerived() <em>Statechart Derived</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechartDerived()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate STATECHART_DERIVED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RealtimestatechartPackage.Literals.REGION__STATECHART_DERIVED).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected RegionImpl() {
		super();
	

		DerivedAttributeAdapter regionTransitionAdapter = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.REGION__TRANSITIONS);
		regionTransitionAdapter.addNavigatedDependency(RealtimestatechartPackage.Literals.REGION__STATECHART, RealtimestatechartPackage.Literals.REALTIME_STATECHART__TRANSITIONS);
		
		DerivedAttributeAdapter regionVerticesAdapter = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.REGION__VERTICES);
		regionVerticesAdapter.addNavigatedDependency(RealtimestatechartPackage.Literals.REGION__STATECHART, RealtimestatechartPackage.Literals.REALTIME_STATECHART__VERTICES);
		
		DerivedAttributeAdapter regionStatechartAdapter = new DerivedAttributeAdapter(this, RealtimestatechartPackage.Literals.REGION__STATECHART_DERIVED);
		regionStatechartAdapter.addLocalDependency(RealtimestatechartPackage.Literals.REGION__STATECHART);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.REGION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REGION__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart getStatechart() {
		if (statechart != null && statechart.eIsProxy()) {
			InternalEObject oldStatechart = (InternalEObject)statechart;
			statechart = (RealtimeStatechart)eResolveProxy(oldStatechart);
			if (statechart != oldStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.REGION__STATECHART, oldStatechart, statechart));
			}
		}
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart basicGetStatechart() {
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechart(RealtimeStatechart newStatechart, NotificationChain msgs) {
		RealtimeStatechart oldStatechart = statechart;
		statechart = newStatechart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REGION__STATECHART, oldStatechart, newStatechart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(RealtimeStatechart newStatechart) {
		if (newStatechart != statechart) {
			NotificationChain msgs = null;
			if (statechart != null)
				msgs = ((InternalEObject)statechart).eInverseRemove(this, RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION, RealtimeStatechart.class, msgs);
			if (newStatechart != null)
				msgs = ((InternalEObject)newStatechart).eInverseAdd(this, RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION, RealtimeStatechart.class, msgs);
			msgs = basicSetStatechart(newStatechart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REGION__STATECHART, newStatechart, newStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getParentState() {
		if (eContainerFeatureID() != RealtimestatechartPackage.REGION__PARENT_STATE) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentState(State newParentState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentState, RealtimestatechartPackage.REGION__PARENT_STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentState(State newParentState) {
		if (newParentState != eInternalContainer() || (eContainerFeatureID() != RealtimestatechartPackage.REGION__PARENT_STATE && newParentState != null)) {
			if (EcoreUtil.isAncestor(this, newParentState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentState != null)
				msgs = ((InternalEObject)newParentState).eInverseAdd(this, RealtimestatechartPackage.STATE__REGIONS, State.class, msgs);
			msgs = basicSetParentState(newParentState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.REGION__PARENT_STATE, newParentState, newParentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public EList<Vertex> getVertices() {
//		return (EList<Vertex>)VERTICES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
		if (getStatechart() != null) {
			return getStatechart().getVertices();
		}
		return (EList<Vertex>) ECollections.EMPTY_ELIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public EList<Transition> getTransitions() {
//		return (EList<Transition>)TRANSITIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
		if (getStatechart() != null) {
			return getStatechart().getTransitions();
		}
		return (EList<Transition>) ECollections.EMPTY_ELIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart getStatechartDerived() {
		return (RealtimeStatechart)STATECHART_DERIVED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatechartDerived(RealtimeStatechart newStatechartDerived, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Statechart Derived' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechartDerived(RealtimeStatechart newStatechartDerived) {
		STATECHART_DERIVED__ESETTING_DELEGATE.dynamicSet(this, null, 0, newStatechartDerived);
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
			case RealtimestatechartPackage.REGION__STATECHART:
				if (statechart != null)
					msgs = ((InternalEObject)statechart).eInverseRemove(this, RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDING_REGION, RealtimeStatechart.class, msgs);
				return basicSetStatechart((RealtimeStatechart)otherEnd, msgs);
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentState((State)otherEnd, msgs);
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
			case RealtimestatechartPackage.REGION__STATECHART:
				return basicSetStatechart(null, msgs);
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				return basicSetParentState(null, msgs);
			case RealtimestatechartPackage.REGION__VERTICES:
				return ((InternalEList<?>)getVertices()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REGION__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.REGION__STATECHART_DERIVED:
				return basicSetStatechartDerived(null, msgs);
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
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				return eInternalContainer().eInverseRemove(this, RealtimestatechartPackage.STATE__REGIONS, State.class, msgs);
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
			case RealtimestatechartPackage.REGION__PRIORITY:
				return getPriority();
			case RealtimestatechartPackage.REGION__STATECHART:
				if (resolve) return getStatechart();
				return basicGetStatechart();
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				return getParentState();
			case RealtimestatechartPackage.REGION__VERTICES:
				return getVertices();
			case RealtimestatechartPackage.REGION__TRANSITIONS:
				return getTransitions();
			case RealtimestatechartPackage.REGION__STATECHART_DERIVED:
				return getStatechartDerived();
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
			case RealtimestatechartPackage.REGION__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case RealtimestatechartPackage.REGION__STATECHART:
				setStatechart((RealtimeStatechart)newValue);
				return;
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				setParentState((State)newValue);
				return;
			case RealtimestatechartPackage.REGION__VERTICES:
				getVertices().clear();
				getVertices().addAll((Collection<? extends Vertex>)newValue);
				return;
			case RealtimestatechartPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RealtimestatechartPackage.REGION__STATECHART_DERIVED:
				setStatechartDerived((RealtimeStatechart)newValue);
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
			case RealtimestatechartPackage.REGION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RealtimestatechartPackage.REGION__STATECHART:
				setStatechart((RealtimeStatechart)null);
				return;
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				setParentState((State)null);
				return;
			case RealtimestatechartPackage.REGION__VERTICES:
				getVertices().clear();
				return;
			case RealtimestatechartPackage.REGION__TRANSITIONS:
				getTransitions().clear();
				return;
			case RealtimestatechartPackage.REGION__STATECHART_DERIVED:
				setStatechartDerived((RealtimeStatechart)null);
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
			case RealtimestatechartPackage.REGION__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case RealtimestatechartPackage.REGION__STATECHART:
				return statechart != null;
			case RealtimestatechartPackage.REGION__PARENT_STATE:
				return getParentState() != null;
			case RealtimestatechartPackage.REGION__VERTICES:
				return VERTICES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.REGION__TRANSITIONS:
				return TRANSITIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RealtimestatechartPackage.REGION__STATECHART_DERIVED:
				return STATECHART_DERIVED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == Prioritizable.class) {
			switch (derivedFeatureID) {
				case RealtimestatechartPackage.REGION__PRIORITY: return RealtimestatechartPackage.PRIORITIZABLE__PRIORITY;
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
		if (baseClass == Prioritizable.class) {
			switch (baseFeatureID) {
				case RealtimestatechartPackage.PRIORITIZABLE__PRIORITY: return RealtimestatechartPackage.REGION__PRIORITY;
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //RegionImpl
