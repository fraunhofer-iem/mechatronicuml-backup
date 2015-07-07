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
package de.uni_paderborn.fujaba.muml.pattern.impl;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;

import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.LegalConfiguration;
import de.uni_paderborn.fujaba.muml.pattern.PatternPackage;
import de.uni_paderborn.fujaba.muml.pattern.PlainTextualDescriptionAspects;

import de.uni_paderborn.fujaba.muml.protocol.impl.AbstractCoordinationSpecificationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternImpl#getDescriptionAspects <em>Description Aspects</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternImpl#getLegalConfigurations <em>Legal Configurations</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternImpl#getPatternParameters <em>Pattern Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternImpl#getCombineablePatterns <em>Combineable Patterns</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.impl.CoordinationPatternImpl#getAlternativePatterns <em>Alternative Patterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationPatternImpl extends AbstractCoordinationSpecificationImpl implements CoordinationPattern {
	/**
	 * The cached value of the '{@link #getDescriptionAspects() <em>Description Aspects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionAspects()
	 * @generated
	 * @ordered
	 */
	protected PlainTextualDescriptionAspects descriptionAspects;

	/**
	 * The cached value of the '{@link #getLegalConfigurations() <em>Legal Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<LegalConfiguration> legalConfigurations;

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
	 * The cached value of the '{@link #getCombineablePatterns() <em>Combineable Patterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombineablePatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinationPattern> combineablePatterns;

	/**
	 * The cached value of the '{@link #getAlternativePatterns() <em>Alternative Patterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativePatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinationPattern> alternativePatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.COORDINATION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainTextualDescriptionAspects getDescriptionAspects() {
		return descriptionAspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionAspects(PlainTextualDescriptionAspects newDescriptionAspects, NotificationChain msgs) {
		PlainTextualDescriptionAspects oldDescriptionAspects = descriptionAspects;
		descriptionAspects = newDescriptionAspects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS, oldDescriptionAspects, newDescriptionAspects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionAspects(PlainTextualDescriptionAspects newDescriptionAspects) {
		if (newDescriptionAspects != descriptionAspects) {
			NotificationChain msgs = null;
			if (descriptionAspects != null)
				msgs = ((InternalEObject)descriptionAspects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS, null, msgs);
			if (newDescriptionAspects != null)
				msgs = ((InternalEObject)newDescriptionAspects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS, null, msgs);
			msgs = basicSetDescriptionAspects(newDescriptionAspects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS, newDescriptionAspects, newDescriptionAspects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegalConfiguration> getLegalConfigurations() {
		if (legalConfigurations == null) {
			legalConfigurations = new EObjectContainmentWithInverseEList<LegalConfiguration>(LegalConfiguration.class, this, PatternPackage.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS, PatternPackage.LEGAL_CONFIGURATION__COORDINATION_PATTERN);
		}
		return legalConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getPatternParameters() {
		if (patternParameters == null) {
			patternParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, PatternPackage.COORDINATION_PATTERN__PATTERN_PARAMETERS);
		}
		return patternParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinationPattern> getCombineablePatterns() {
		if (combineablePatterns == null) {
			combineablePatterns = new EObjectResolvingEList<CoordinationPattern>(CoordinationPattern.class, this, PatternPackage.COORDINATION_PATTERN__COMBINEABLE_PATTERNS);
		}
		return combineablePatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinationPattern> getAlternativePatterns() {
		if (alternativePatterns == null) {
			alternativePatterns = new EObjectResolvingEList<CoordinationPattern>(CoordinationPattern.class, this, PatternPackage.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS);
		}
		return alternativePatterns;
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
			case PatternPackage.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLegalConfigurations()).basicAdd(otherEnd, msgs);
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
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
				return basicSetDescriptionAspects(null, msgs);
			case PatternPackage.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS:
				return ((InternalEList<?>)getLegalConfigurations()).basicRemove(otherEnd, msgs);
			case PatternPackage.COORDINATION_PATTERN__PATTERN_PARAMETERS:
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
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
				return getDescriptionAspects();
			case PatternPackage.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS:
				return getLegalConfigurations();
			case PatternPackage.COORDINATION_PATTERN__PATTERN_PARAMETERS:
				return getPatternParameters();
			case PatternPackage.COORDINATION_PATTERN__COMBINEABLE_PATTERNS:
				return getCombineablePatterns();
			case PatternPackage.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS:
				return getAlternativePatterns();
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
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
				setDescriptionAspects((PlainTextualDescriptionAspects)newValue);
				return;
			case PatternPackage.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS:
				getLegalConfigurations().clear();
				getLegalConfigurations().addAll((Collection<? extends LegalConfiguration>)newValue);
				return;
			case PatternPackage.COORDINATION_PATTERN__PATTERN_PARAMETERS:
				getPatternParameters().clear();
				getPatternParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case PatternPackage.COORDINATION_PATTERN__COMBINEABLE_PATTERNS:
				getCombineablePatterns().clear();
				getCombineablePatterns().addAll((Collection<? extends CoordinationPattern>)newValue);
				return;
			case PatternPackage.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS:
				getAlternativePatterns().clear();
				getAlternativePatterns().addAll((Collection<? extends CoordinationPattern>)newValue);
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
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
				setDescriptionAspects((PlainTextualDescriptionAspects)null);
				return;
			case PatternPackage.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS:
				getLegalConfigurations().clear();
				return;
			case PatternPackage.COORDINATION_PATTERN__PATTERN_PARAMETERS:
				getPatternParameters().clear();
				return;
			case PatternPackage.COORDINATION_PATTERN__COMBINEABLE_PATTERNS:
				getCombineablePatterns().clear();
				return;
			case PatternPackage.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS:
				getAlternativePatterns().clear();
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
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
				return descriptionAspects != null;
			case PatternPackage.COORDINATION_PATTERN__LEGAL_CONFIGURATIONS:
				return legalConfigurations != null && !legalConfigurations.isEmpty();
			case PatternPackage.COORDINATION_PATTERN__PATTERN_PARAMETERS:
				return patternParameters != null && !patternParameters.isEmpty();
			case PatternPackage.COORDINATION_PATTERN__COMBINEABLE_PATTERNS:
				return combineablePatterns != null && !combineablePatterns.isEmpty();
			case PatternPackage.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS:
				return alternativePatterns != null && !alternativePatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoordinationPatternImpl
