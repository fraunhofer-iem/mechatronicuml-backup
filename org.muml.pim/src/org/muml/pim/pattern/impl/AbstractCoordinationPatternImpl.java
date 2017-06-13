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
package org.muml.pim.pattern.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.behavior.Parameter;
import org.muml.pim.pattern.AbstractCoordinationPattern;
import org.muml.pim.pattern.PatternPackage;
import org.muml.pim.pattern.VerifiedConfiguration;
import org.muml.pim.protocol.impl.AbstractCoordinationSpecificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.pattern.impl.AbstractCoordinationPatternImpl#getVerifiedConfigurations <em>Verified Configurations</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.AbstractCoordinationPatternImpl#getPatternParameters <em>Pattern Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCoordinationPatternImpl extends AbstractCoordinationSpecificationImpl implements AbstractCoordinationPattern {
	/**
	 * The cached value of the '{@link #getVerifiedConfigurations() <em>Verified Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<VerifiedConfiguration> verifiedConfigurations;

	/**
	 * The cached value of the '{@link #getPatternParameters() <em>Pattern Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> patternParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCoordinationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.ABSTRACT_COORDINATION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VerifiedConfiguration> getVerifiedConfigurations() {
		if (verifiedConfigurations == null) {
			verifiedConfigurations = new EObjectContainmentWithInverseEList<VerifiedConfiguration>(VerifiedConfiguration.class, this, PatternPackage.ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS, PatternPackage.VERIFIED_CONFIGURATION__COORDINATION_PATTERN);
		}
		return verifiedConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getPatternParameters() {
		if (patternParameters == null) {
			patternParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, PatternPackage.ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS);
		}
		return patternParameters;
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
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVerifiedConfigurations()).basicAdd(otherEnd, msgs);
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
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS:
				return ((InternalEList<?>)getVerifiedConfigurations()).basicRemove(otherEnd, msgs);
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS:
				return ((InternalEList<?>)getPatternParameters()).basicRemove(otherEnd, msgs);
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
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS:
				return getVerifiedConfigurations();
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS:
				return getPatternParameters();
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
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS:
				getVerifiedConfigurations().clear();
				getVerifiedConfigurations().addAll((Collection<? extends VerifiedConfiguration>)newValue);
				return;
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS:
				getPatternParameters().clear();
				getPatternParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS:
				getVerifiedConfigurations().clear();
				return;
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS:
				getPatternParameters().clear();
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
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__VERIFIED_CONFIGURATIONS:
				return verifiedConfigurations != null && !verifiedConfigurations.isEmpty();
			case PatternPackage.ABSTRACT_COORDINATION_PATTERN__PATTERN_PARAMETERS:
				return patternParameters != null && !patternParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractCoordinationPatternImpl
