/**
 */
package de.uni_paderborn.fujaba.muml.pattern.model.pattern.impl;

import de.uni_paderborn.fujaba.muml.pattern.model.pattern.AdaptedFromCoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.model.pattern.PatternPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.storydriven.core.impl.ExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adapted From Coordination Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.pattern.model.pattern.impl.AdaptedFromCoordinationPatternImpl#getAdaptedPattern <em>Adapted Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdaptedFromCoordinationPatternImpl extends ExtensionImpl implements AdaptedFromCoordinationPattern {
	/**
	 * The cached value of the '{@link #getAdaptedPattern() <em>Adapted Pattern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptedPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinationPattern> adaptedPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptedFromCoordinationPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.ADAPTED_FROM_COORDINATION_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoordinationPattern> getAdaptedPattern() {
		if (adaptedPattern == null) {
			adaptedPattern = new EObjectResolvingEList<CoordinationPattern>(CoordinationPattern.class, this, PatternPackage.ADAPTED_FROM_COORDINATION_PATTERN__ADAPTED_PATTERN);
		}
		return adaptedPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternPackage.ADAPTED_FROM_COORDINATION_PATTERN__ADAPTED_PATTERN:
				return getAdaptedPattern();
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
			case PatternPackage.ADAPTED_FROM_COORDINATION_PATTERN__ADAPTED_PATTERN:
				getAdaptedPattern().clear();
				getAdaptedPattern().addAll((Collection<? extends CoordinationPattern>)newValue);
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
			case PatternPackage.ADAPTED_FROM_COORDINATION_PATTERN__ADAPTED_PATTERN:
				getAdaptedPattern().clear();
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
			case PatternPackage.ADAPTED_FROM_COORDINATION_PATTERN__ADAPTED_PATTERN:
				return adaptedPattern != null && !adaptedPattern.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdaptedFromCoordinationPatternImpl
