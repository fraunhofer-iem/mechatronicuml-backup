/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonTransition;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage;

import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMTransitionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gt Automaton Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonTransitionImpl#getTimeGuards <em>Time Guards</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonTransitionImpl#getClockResets <em>Clock Resets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GtAutomatonTransitionImpl extends SDMTransitionImpl implements GtAutomatonTransition {
	/**
	 * The cached value of the '{@link #getTimeGuards() <em>Time Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<GtAutomatonClockConstraint> timeGuards;

	/**
	 * The cached value of the '{@link #getClockResets() <em>Clock Resets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockResets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> clockResets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GtAutomatonTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtautomatonPackage.Literals.GT_AUTOMATON_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GtAutomatonClockConstraint> getTimeGuards() {
		if (timeGuards == null) {
			timeGuards = new EObjectContainmentEList<GtAutomatonClockConstraint>(GtAutomatonClockConstraint.class, this, GtautomatonPackage.GT_AUTOMATON_TRANSITION__TIME_GUARDS);
		}
		return timeGuards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClockResets() {
		if (clockResets == null) {
			clockResets = new EDataTypeUniqueEList<String>(String.class, this, GtautomatonPackage.GT_AUTOMATON_TRANSITION__CLOCK_RESETS);
		}
		return clockResets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION__TIME_GUARDS:
				return ((InternalEList<?>)getTimeGuards()).basicRemove(otherEnd, msgs);
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
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION__TIME_GUARDS:
				return getTimeGuards();
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION__CLOCK_RESETS:
				return getClockResets();
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
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION__TIME_GUARDS:
				getTimeGuards().clear();
				getTimeGuards().addAll((Collection<? extends GtAutomatonClockConstraint>)newValue);
				return;
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION__CLOCK_RESETS:
				getClockResets().clear();
				getClockResets().addAll((Collection<? extends String>)newValue);
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
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION__TIME_GUARDS:
				getTimeGuards().clear();
				return;
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION__CLOCK_RESETS:
				getClockResets().clear();
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
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION__TIME_GUARDS:
				return timeGuards != null && !timeGuards.isEmpty();
			case GtautomatonPackage.GT_AUTOMATON_TRANSITION__CLOCK_RESETS:
				return clockResets != null && !clockResets.isEmpty();
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
		result.append(" (clockResets: ");
		result.append(clockResets);
		result.append(')');
		return result.toString();
	}

} //GtAutomatonTransitionImpl
