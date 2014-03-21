/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package de.uni_paderborn.fujaba.muml.constraint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_paderborn.fujaba.muml.constraint.ConstraintPackage;
import de.uni_paderborn.fujaba.muml.constraint.TemporalLogicConstraint;
import de.uni_paderborn.fujaba.muml.constraint.VerifiableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verifiable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.constraint.impl.VerifiableElementImpl#getTemporalLogicConstraints <em>Temporal Logic Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VerifiableElementImpl extends EObjectImpl implements VerifiableElement {
	/**
	 * The cached value of the '{@link #getTemporalLogicConstraints() <em>Temporal Logic Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalLogicConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalLogicConstraint> temporalLogicConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerifiableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.VERIFIABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalLogicConstraint> getTemporalLogicConstraints() {
		if (temporalLogicConstraints == null) {
			temporalLogicConstraints = new EObjectContainmentEList<TemporalLogicConstraint>(TemporalLogicConstraint.class, this, ConstraintPackage.VERIFIABLE_ELEMENT__TEMPORAL_LOGIC_CONSTRAINTS);
		}
		return temporalLogicConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintPackage.VERIFIABLE_ELEMENT__TEMPORAL_LOGIC_CONSTRAINTS:
				return ((InternalEList<?>)getTemporalLogicConstraints()).basicRemove(otherEnd, msgs);
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__TEMPORAL_LOGIC_CONSTRAINTS:
				return getTemporalLogicConstraints();
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__TEMPORAL_LOGIC_CONSTRAINTS:
				getTemporalLogicConstraints().clear();
				getTemporalLogicConstraints().addAll((Collection<? extends TemporalLogicConstraint>)newValue);
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__TEMPORAL_LOGIC_CONSTRAINTS:
				getTemporalLogicConstraints().clear();
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
			case ConstraintPackage.VERIFIABLE_ELEMENT__TEMPORAL_LOGIC_CONSTRAINTS:
				return temporalLogicConstraints != null && !temporalLogicConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerifiableElementImpl
