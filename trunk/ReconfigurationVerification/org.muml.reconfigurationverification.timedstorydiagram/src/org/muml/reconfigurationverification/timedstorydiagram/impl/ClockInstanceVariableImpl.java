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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceConstraint;
import org.muml.reconfigurationverification.timedstorydiagram.ClockInstanceVariable;
import org.muml.reconfigurationverification.timedstorydiagram.TimedstorydiagramPackage;
import org.muml.storydiagram.patterns.impl.ObjectVariableImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Instance Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.timedstorydiagram.impl.ClockInstanceVariableImpl#getClockInstanceConstraints <em>Clock Instance Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockInstanceVariableImpl extends ObjectVariableImpl implements ClockInstanceVariable {
	/**
	 * The cached value of the '{@link #getClockInstanceConstraints() <em>Clock Instance Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstanceConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockInstanceConstraint> clockInstanceConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockInstanceVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimedstorydiagramPackage.Literals.CLOCK_INSTANCE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockInstanceConstraint> getClockInstanceConstraints() {
		if (clockInstanceConstraints == null) {
			clockInstanceConstraints = new EObjectWithInverseResolvingEList<ClockInstanceConstraint>(ClockInstanceConstraint.class, this, TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS, TimedstorydiagramPackage.CLOCK_INSTANCE_CONSTRAINT__CLOCK_INSTANCE_VARIABLE);
		}
		return clockInstanceConstraints;
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClockInstanceConstraints()).basicAdd(otherEnd, msgs);
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS:
				return ((InternalEList<?>)getClockInstanceConstraints()).basicRemove(otherEnd, msgs);
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS:
				return getClockInstanceConstraints();
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS:
				getClockInstanceConstraints().clear();
				getClockInstanceConstraints().addAll((Collection<? extends ClockInstanceConstraint>)newValue);
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS:
				getClockInstanceConstraints().clear();
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
			case TimedstorydiagramPackage.CLOCK_INSTANCE_VARIABLE__CLOCK_INSTANCE_CONSTRAINTS:
				return clockInstanceConstraints != null && !clockInstanceConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClockInstanceVariableImpl
