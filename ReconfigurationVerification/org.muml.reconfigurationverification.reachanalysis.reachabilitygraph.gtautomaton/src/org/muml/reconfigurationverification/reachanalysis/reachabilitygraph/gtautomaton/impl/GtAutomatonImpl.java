/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomaton;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage;

import org.muml.storydiagram.reachanalysis.reachabilitygraph.sdm.impl.SDMReachabilityGraphImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gt Automaton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonImpl#getClockInstanceIdentifiers <em>Clock Instance Identifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GtAutomatonImpl extends SDMReachabilityGraphImpl implements GtAutomaton {
	/**
	 * The cached value of the '{@link #getClockInstanceIdentifiers() <em>Clock Instance Identifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstanceIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> clockInstanceIdentifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GtAutomatonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtautomatonPackage.Literals.GT_AUTOMATON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClockInstanceIdentifiers() {
		if (clockInstanceIdentifiers == null) {
			clockInstanceIdentifiers = new EDataTypeUniqueEList<String>(String.class, this, GtautomatonPackage.GT_AUTOMATON__CLOCK_INSTANCE_IDENTIFIERS);
		}
		return clockInstanceIdentifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtautomatonPackage.GT_AUTOMATON__CLOCK_INSTANCE_IDENTIFIERS:
				return getClockInstanceIdentifiers();
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
			case GtautomatonPackage.GT_AUTOMATON__CLOCK_INSTANCE_IDENTIFIERS:
				getClockInstanceIdentifiers().clear();
				getClockInstanceIdentifiers().addAll((Collection<? extends String>)newValue);
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
			case GtautomatonPackage.GT_AUTOMATON__CLOCK_INSTANCE_IDENTIFIERS:
				getClockInstanceIdentifiers().clear();
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
			case GtautomatonPackage.GT_AUTOMATON__CLOCK_INSTANCE_IDENTIFIERS:
				return clockInstanceIdentifiers != null && !clockInstanceIdentifiers.isEmpty();
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
		result.append(" (clockInstanceIdentifiers: ");
		result.append(clockInstanceIdentifiers);
		result.append(')');
		return result.toString();
	}

} //GtAutomatonImpl
