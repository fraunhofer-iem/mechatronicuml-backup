/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.tctl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.reconfigurationverification.tctl.BinaryTemporalFormula;
import org.muml.reconfigurationverification.tctl.ComparisonOperator;
import org.muml.reconfigurationverification.tctl.TctlPackage;
import org.muml.reconfigurationverification.tctl.TemporalFormula;
import org.muml.reconfigurationverification.tctl.TemporalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Temporal Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.tctl.impl.BinaryTemporalFormulaImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.tctl.impl.BinaryTemporalFormulaImpl#getTemporalOperator <em>Temporal Operator</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.tctl.impl.BinaryTemporalFormulaImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryTemporalFormulaImpl extends BinaryFormulaImpl implements BinaryTemporalFormula {
	/**
	 * The default value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator COMPARISON_OPERATOR_EDEFAULT = ComparisonOperator.LESS_OR_EQUAL;

	/**
	 * The cached value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator comparisonOperator = COMPARISON_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemporalOperator() <em>Temporal Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final TemporalOperator TEMPORAL_OPERATOR_EDEFAULT = TemporalOperator.AF;

	/**
	 * The cached value of the '{@link #getTemporalOperator() <em>Temporal Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalOperator()
	 * @generated
	 * @ordered
	 */
	protected TemporalOperator temporalOperator = TEMPORAL_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryTemporalFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TctlPackage.Literals.BINARY_TEMPORAL_FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getComparisonOperator() {
		return comparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonOperator(ComparisonOperator newComparisonOperator) {
		ComparisonOperator oldComparisonOperator = comparisonOperator;
		comparisonOperator = newComparisonOperator == null ? COMPARISON_OPERATOR_EDEFAULT : newComparisonOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TctlPackage.BINARY_TEMPORAL_FORMULA__COMPARISON_OPERATOR, oldComparisonOperator, comparisonOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalOperator getTemporalOperator() {
		return temporalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalOperator(TemporalOperator newTemporalOperator) {
		TemporalOperator oldTemporalOperator = temporalOperator;
		temporalOperator = newTemporalOperator == null ? TEMPORAL_OPERATOR_EDEFAULT : newTemporalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TctlPackage.BINARY_TEMPORAL_FORMULA__TEMPORAL_OPERATOR, oldTemporalOperator, temporalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TctlPackage.BINARY_TEMPORAL_FORMULA__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TctlPackage.BINARY_TEMPORAL_FORMULA__COMPARISON_OPERATOR:
				return getComparisonOperator();
			case TctlPackage.BINARY_TEMPORAL_FORMULA__TEMPORAL_OPERATOR:
				return getTemporalOperator();
			case TctlPackage.BINARY_TEMPORAL_FORMULA__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TctlPackage.BINARY_TEMPORAL_FORMULA__COMPARISON_OPERATOR:
				setComparisonOperator((ComparisonOperator)newValue);
				return;
			case TctlPackage.BINARY_TEMPORAL_FORMULA__TEMPORAL_OPERATOR:
				setTemporalOperator((TemporalOperator)newValue);
				return;
			case TctlPackage.BINARY_TEMPORAL_FORMULA__VALUE:
				setValue((Integer)newValue);
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
			case TctlPackage.BINARY_TEMPORAL_FORMULA__COMPARISON_OPERATOR:
				setComparisonOperator(COMPARISON_OPERATOR_EDEFAULT);
				return;
			case TctlPackage.BINARY_TEMPORAL_FORMULA__TEMPORAL_OPERATOR:
				setTemporalOperator(TEMPORAL_OPERATOR_EDEFAULT);
				return;
			case TctlPackage.BINARY_TEMPORAL_FORMULA__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case TctlPackage.BINARY_TEMPORAL_FORMULA__COMPARISON_OPERATOR:
				return comparisonOperator != COMPARISON_OPERATOR_EDEFAULT;
			case TctlPackage.BINARY_TEMPORAL_FORMULA__TEMPORAL_OPERATOR:
				return temporalOperator != TEMPORAL_OPERATOR_EDEFAULT;
			case TctlPackage.BINARY_TEMPORAL_FORMULA__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TemporalFormula.class) {
			switch (derivedFeatureID) {
				case TctlPackage.BINARY_TEMPORAL_FORMULA__COMPARISON_OPERATOR: return TctlPackage.TEMPORAL_FORMULA__COMPARISON_OPERATOR;
				case TctlPackage.BINARY_TEMPORAL_FORMULA__TEMPORAL_OPERATOR: return TctlPackage.TEMPORAL_FORMULA__TEMPORAL_OPERATOR;
				case TctlPackage.BINARY_TEMPORAL_FORMULA__VALUE: return TctlPackage.TEMPORAL_FORMULA__VALUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TemporalFormula.class) {
			switch (baseFeatureID) {
				case TctlPackage.TEMPORAL_FORMULA__COMPARISON_OPERATOR: return TctlPackage.BINARY_TEMPORAL_FORMULA__COMPARISON_OPERATOR;
				case TctlPackage.TEMPORAL_FORMULA__TEMPORAL_OPERATOR: return TctlPackage.BINARY_TEMPORAL_FORMULA__TEMPORAL_OPERATOR;
				case TctlPackage.TEMPORAL_FORMULA__VALUE: return TctlPackage.BINARY_TEMPORAL_FORMULA__VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (comparisonOperator: ");
		result.append(comparisonOperator);
		result.append(", temporalOperator: ");
		result.append(temporalOperator);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //BinaryTemporalFormulaImpl
