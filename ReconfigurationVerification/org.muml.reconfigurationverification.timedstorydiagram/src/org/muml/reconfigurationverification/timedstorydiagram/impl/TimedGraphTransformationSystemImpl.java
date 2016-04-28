/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.timedstorydiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.impl.NamedElementImpl;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.InvariantStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedGraphTransformationSystem;
import org.muml.reconfigurationverification.timedstorydiagram.TimedStoryDiagram;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.activities.Activity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Graph Transformation System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedGraphTransformationSystemImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedGraphTransformationSystemImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedGraphTransformationSystemImpl#getClockInstanceRules <em>Clock Instance Rules</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedGraphTransformationSystemImpl#getInitialGraphObjects <em>Initial Graph Objects</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedGraphTransformationSystemImpl#getUnchangeableNodes <em>Unchangeable Nodes</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedGraphTransformationSystemImpl#getHelperStoryDiagrams <em>Helper Story Diagrams</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.TimedGraphTransformationSystemImpl#getTypeGraphObjects <em>Type Graph Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedGraphTransformationSystemImpl extends NamedElementImpl implements TimedGraphTransformationSystem {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TimedStoryDiagram> rules;

	/**
	 * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariants()
	 * @generated
	 * @ordered
	 */
	protected EList<InvariantStoryDiagram> invariants;

	/**
	 * The cached value of the '{@link #getClockInstanceRules() <em>Clock Instance Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstanceRules()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockInstanceStoryDiagram> clockInstanceRules;

	/**
	 * The cached value of the '{@link #getInitialGraphObjects() <em>Initial Graph Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialGraphObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> initialGraphObjects;

	/**
	 * The cached value of the '{@link #getUnchangeableNodes() <em>Unchangeable Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnchangeableNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> unchangeableNodes;

	/**
	 * The cached value of the '{@link #getHelperStoryDiagrams() <em>Helper Story Diagrams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelperStoryDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> helperStoryDiagrams;

	/**
	 * The cached value of the '{@link #getTypeGraphObjects() <em>Type Graph Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeGraphObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> typeGraphObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedGraphTransformationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimedstorydiagramPackage.Literals.TIMED_GRAPH_TRANSFORMATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimedStoryDiagram> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<TimedStoryDiagram>(TimedStoryDiagram.class, this, TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvariantStoryDiagram> getInvariants() {
		if (invariants == null) {
			invariants = new EObjectContainmentEList<InvariantStoryDiagram>(InvariantStoryDiagram.class, this, TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INVARIANTS);
		}
		return invariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockInstanceStoryDiagram> getClockInstanceRules() {
		if (clockInstanceRules == null) {
			clockInstanceRules = new EObjectContainmentEList<ClockInstanceStoryDiagram>(ClockInstanceStoryDiagram.class, this, TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__CLOCK_INSTANCE_RULES);
		}
		return clockInstanceRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInitialGraphObjects() {
		if (initialGraphObjects == null) {
			initialGraphObjects = new EObjectContainmentEList<EObject>(EObject.class, this, TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INITIAL_GRAPH_OBJECTS);
		}
		return initialGraphObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getUnchangeableNodes() {
		if (unchangeableNodes == null) {
			unchangeableNodes = new EObjectResolvingEList<EClass>(EClass.class, this, TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES);
		}
		return unchangeableNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getHelperStoryDiagrams() {
		if (helperStoryDiagrams == null) {
			helperStoryDiagrams = new EObjectContainmentEList<Activity>(Activity.class, this, TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__HELPER_STORY_DIAGRAMS);
		}
		return helperStoryDiagrams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTypeGraphObjects() {
		if (typeGraphObjects == null) {
			typeGraphObjects = new EObjectContainmentEList<EObject>(EObject.class, this, TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__TYPE_GRAPH_OBJECTS);
		}
		return typeGraphObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INVARIANTS:
				return ((InternalEList<?>)getInvariants()).basicRemove(otherEnd, msgs);
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__CLOCK_INSTANCE_RULES:
				return ((InternalEList<?>)getClockInstanceRules()).basicRemove(otherEnd, msgs);
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INITIAL_GRAPH_OBJECTS:
				return ((InternalEList<?>)getInitialGraphObjects()).basicRemove(otherEnd, msgs);
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__HELPER_STORY_DIAGRAMS:
				return ((InternalEList<?>)getHelperStoryDiagrams()).basicRemove(otherEnd, msgs);
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__TYPE_GRAPH_OBJECTS:
				return ((InternalEList<?>)getTypeGraphObjects()).basicRemove(otherEnd, msgs);
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
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__RULES:
				return getRules();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INVARIANTS:
				return getInvariants();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__CLOCK_INSTANCE_RULES:
				return getClockInstanceRules();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INITIAL_GRAPH_OBJECTS:
				return getInitialGraphObjects();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES:
				return getUnchangeableNodes();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__HELPER_STORY_DIAGRAMS:
				return getHelperStoryDiagrams();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__TYPE_GRAPH_OBJECTS:
				return getTypeGraphObjects();
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
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends TimedStoryDiagram>)newValue);
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INVARIANTS:
				getInvariants().clear();
				getInvariants().addAll((Collection<? extends InvariantStoryDiagram>)newValue);
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__CLOCK_INSTANCE_RULES:
				getClockInstanceRules().clear();
				getClockInstanceRules().addAll((Collection<? extends ClockInstanceStoryDiagram>)newValue);
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INITIAL_GRAPH_OBJECTS:
				getInitialGraphObjects().clear();
				getInitialGraphObjects().addAll((Collection<? extends EObject>)newValue);
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES:
				getUnchangeableNodes().clear();
				getUnchangeableNodes().addAll((Collection<? extends EClass>)newValue);
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__HELPER_STORY_DIAGRAMS:
				getHelperStoryDiagrams().clear();
				getHelperStoryDiagrams().addAll((Collection<? extends Activity>)newValue);
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__TYPE_GRAPH_OBJECTS:
				getTypeGraphObjects().clear();
				getTypeGraphObjects().addAll((Collection<? extends EObject>)newValue);
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
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__RULES:
				getRules().clear();
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INVARIANTS:
				getInvariants().clear();
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__CLOCK_INSTANCE_RULES:
				getClockInstanceRules().clear();
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INITIAL_GRAPH_OBJECTS:
				getInitialGraphObjects().clear();
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES:
				getUnchangeableNodes().clear();
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__HELPER_STORY_DIAGRAMS:
				getHelperStoryDiagrams().clear();
				return;
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__TYPE_GRAPH_OBJECTS:
				getTypeGraphObjects().clear();
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
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__RULES:
				return rules != null && !rules.isEmpty();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INVARIANTS:
				return invariants != null && !invariants.isEmpty();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__CLOCK_INSTANCE_RULES:
				return clockInstanceRules != null && !clockInstanceRules.isEmpty();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__INITIAL_GRAPH_OBJECTS:
				return initialGraphObjects != null && !initialGraphObjects.isEmpty();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__UNCHANGEABLE_NODES:
				return unchangeableNodes != null && !unchangeableNodes.isEmpty();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__HELPER_STORY_DIAGRAMS:
				return helperStoryDiagrams != null && !helperStoryDiagrams.isEmpty();
			case TimedstorydiagramPackage.TIMED_GRAPH_TRANSFORMATION_SYSTEM__TYPE_GRAPH_OBJECTS:
				return typeGraphObjects != null && !typeGraphObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimedGraphTransformationSystemImpl
