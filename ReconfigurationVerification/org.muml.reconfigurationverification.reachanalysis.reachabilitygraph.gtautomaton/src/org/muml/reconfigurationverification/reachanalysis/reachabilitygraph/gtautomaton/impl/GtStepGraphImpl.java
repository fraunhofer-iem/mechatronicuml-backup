/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtStepGraph;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.ObjectIdentifier;

import org.muml.reconfigurationverification.timedstorydiagram.ClockInstance;

import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.StepGraphImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gt Step Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtStepGraphImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtStepGraphImpl#getObjectIdentifier <em>Object Identifier</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtStepGraphImpl#getClockInstances <em>Clock Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GtStepGraphImpl extends StepGraphImpl implements GtStepGraph {
	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected EList<GtAutomatonClockConstraint> invariant;

	/**
	 * The cached value of the '{@link #getObjectIdentifier() <em>Object Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectIdentifier()
	 * @generated
	 * @ordered
	 */
	protected ObjectIdentifier objectIdentifier;

	/**
	 * The cached value of the '{@link #getClockInstances() <em>Clock Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockInstance> clockInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GtStepGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtautomatonPackage.Literals.GT_STEP_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GtAutomatonClockConstraint> getInvariant() {
		if (invariant == null) {
			invariant = new EObjectContainmentEList<GtAutomatonClockConstraint>(GtAutomatonClockConstraint.class, this, GtautomatonPackage.GT_STEP_GRAPH__INVARIANT);
		}
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIdentifier getObjectIdentifier() {
		return objectIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectIdentifier(ObjectIdentifier newObjectIdentifier, NotificationChain msgs) {
		ObjectIdentifier oldObjectIdentifier = objectIdentifier;
		objectIdentifier = newObjectIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtautomatonPackage.GT_STEP_GRAPH__OBJECT_IDENTIFIER, oldObjectIdentifier, newObjectIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectIdentifier(ObjectIdentifier newObjectIdentifier) {
		if (newObjectIdentifier != objectIdentifier) {
			NotificationChain msgs = null;
			if (objectIdentifier != null)
				msgs = ((InternalEObject)objectIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtautomatonPackage.GT_STEP_GRAPH__OBJECT_IDENTIFIER, null, msgs);
			if (newObjectIdentifier != null)
				msgs = ((InternalEObject)newObjectIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtautomatonPackage.GT_STEP_GRAPH__OBJECT_IDENTIFIER, null, msgs);
			msgs = basicSetObjectIdentifier(newObjectIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtautomatonPackage.GT_STEP_GRAPH__OBJECT_IDENTIFIER, newObjectIdentifier, newObjectIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockInstance> getClockInstances() {
		if (clockInstances == null) {
			clockInstances = new EObjectContainmentEList<ClockInstance>(ClockInstance.class, this, GtautomatonPackage.GT_STEP_GRAPH__CLOCK_INSTANCES);
		}
		return clockInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtautomatonPackage.GT_STEP_GRAPH__INVARIANT:
				return ((InternalEList<?>)getInvariant()).basicRemove(otherEnd, msgs);
			case GtautomatonPackage.GT_STEP_GRAPH__OBJECT_IDENTIFIER:
				return basicSetObjectIdentifier(null, msgs);
			case GtautomatonPackage.GT_STEP_GRAPH__CLOCK_INSTANCES:
				return ((InternalEList<?>)getClockInstances()).basicRemove(otherEnd, msgs);
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
			case GtautomatonPackage.GT_STEP_GRAPH__INVARIANT:
				return getInvariant();
			case GtautomatonPackage.GT_STEP_GRAPH__OBJECT_IDENTIFIER:
				return getObjectIdentifier();
			case GtautomatonPackage.GT_STEP_GRAPH__CLOCK_INSTANCES:
				return getClockInstances();
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
			case GtautomatonPackage.GT_STEP_GRAPH__INVARIANT:
				getInvariant().clear();
				getInvariant().addAll((Collection<? extends GtAutomatonClockConstraint>)newValue);
				return;
			case GtautomatonPackage.GT_STEP_GRAPH__OBJECT_IDENTIFIER:
				setObjectIdentifier((ObjectIdentifier)newValue);
				return;
			case GtautomatonPackage.GT_STEP_GRAPH__CLOCK_INSTANCES:
				getClockInstances().clear();
				getClockInstances().addAll((Collection<? extends ClockInstance>)newValue);
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
			case GtautomatonPackage.GT_STEP_GRAPH__INVARIANT:
				getInvariant().clear();
				return;
			case GtautomatonPackage.GT_STEP_GRAPH__OBJECT_IDENTIFIER:
				setObjectIdentifier((ObjectIdentifier)null);
				return;
			case GtautomatonPackage.GT_STEP_GRAPH__CLOCK_INSTANCES:
				getClockInstances().clear();
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
			case GtautomatonPackage.GT_STEP_GRAPH__INVARIANT:
				return invariant != null && !invariant.isEmpty();
			case GtautomatonPackage.GT_STEP_GRAPH__OBJECT_IDENTIFIER:
				return objectIdentifier != null;
			case GtautomatonPackage.GT_STEP_GRAPH__CLOCK_INSTANCES:
				return clockInstances != null && !clockInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GtStepGraphImpl
