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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.pattern.CoordinationPattern;
import org.muml.pim.pattern.CoordinationPatternVariant;
import org.muml.pim.pattern.DescriptionAspects;
import org.muml.pim.pattern.PatternPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.pattern.impl.CoordinationPatternImpl#getCombineablePatterns <em>Combineable Patterns</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.CoordinationPatternImpl#getAlternativePatterns <em>Alternative Patterns</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.CoordinationPatternImpl#getDescriptionAspects <em>Description Aspects</em>}</li>
 *   <li>{@link org.muml.pim.pattern.impl.CoordinationPatternImpl#getPatternVariants <em>Pattern Variants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationPatternImpl extends AbstractCoordinationPatternImpl implements CoordinationPattern {
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
	 * The cached value of the '{@link #getDescriptionAspects() <em>Description Aspects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionAspects()
	 * @generated
	 * @ordered
	 */
	protected DescriptionAspects descriptionAspects;

	/**
	 * The cached value of the '{@link #getPatternVariants() <em>Pattern Variants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinationPatternVariant> patternVariants;

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
	public DescriptionAspects getDescriptionAspects() {
		return descriptionAspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionAspects(DescriptionAspects newDescriptionAspects, NotificationChain msgs) {
		DescriptionAspects oldDescriptionAspects = descriptionAspects;
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
	public void setDescriptionAspects(DescriptionAspects newDescriptionAspects) {
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
	public EList<CoordinationPatternVariant> getPatternVariants() {
		if (patternVariants == null) {
			patternVariants = new EObjectWithInverseResolvingEList<CoordinationPatternVariant>(CoordinationPatternVariant.class, this, PatternPackage.COORDINATION_PATTERN__PATTERN_VARIANTS, PatternPackage.COORDINATION_PATTERN_VARIANT__ORIGINAL_PATTERN);
		}
		return patternVariants;
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
			case PatternPackage.COORDINATION_PATTERN__PATTERN_VARIANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPatternVariants()).basicAdd(otherEnd, msgs);
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
			case PatternPackage.COORDINATION_PATTERN__PATTERN_VARIANTS:
				return ((InternalEList<?>)getPatternVariants()).basicRemove(otherEnd, msgs);
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
			case PatternPackage.COORDINATION_PATTERN__COMBINEABLE_PATTERNS:
				return getCombineablePatterns();
			case PatternPackage.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS:
				return getAlternativePatterns();
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
				return getDescriptionAspects();
			case PatternPackage.COORDINATION_PATTERN__PATTERN_VARIANTS:
				return getPatternVariants();
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
			case PatternPackage.COORDINATION_PATTERN__COMBINEABLE_PATTERNS:
				getCombineablePatterns().clear();
				getCombineablePatterns().addAll((Collection<? extends CoordinationPattern>)newValue);
				return;
			case PatternPackage.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS:
				getAlternativePatterns().clear();
				getAlternativePatterns().addAll((Collection<? extends CoordinationPattern>)newValue);
				return;
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
				setDescriptionAspects((DescriptionAspects)newValue);
				return;
			case PatternPackage.COORDINATION_PATTERN__PATTERN_VARIANTS:
				getPatternVariants().clear();
				getPatternVariants().addAll((Collection<? extends CoordinationPatternVariant>)newValue);
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
			case PatternPackage.COORDINATION_PATTERN__COMBINEABLE_PATTERNS:
				getCombineablePatterns().clear();
				return;
			case PatternPackage.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS:
				getAlternativePatterns().clear();
				return;
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
				setDescriptionAspects((DescriptionAspects)null);
				return;
			case PatternPackage.COORDINATION_PATTERN__PATTERN_VARIANTS:
				getPatternVariants().clear();
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
			case PatternPackage.COORDINATION_PATTERN__COMBINEABLE_PATTERNS:
				return combineablePatterns != null && !combineablePatterns.isEmpty();
			case PatternPackage.COORDINATION_PATTERN__ALTERNATIVE_PATTERNS:
				return alternativePatterns != null && !alternativePatterns.isEmpty();
			case PatternPackage.COORDINATION_PATTERN__DESCRIPTION_ASPECTS:
				return descriptionAspects != null;
			case PatternPackage.COORDINATION_PATTERN__PATTERN_VARIANTS:
				return patternVariants != null && !patternVariants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoordinationPatternImpl
