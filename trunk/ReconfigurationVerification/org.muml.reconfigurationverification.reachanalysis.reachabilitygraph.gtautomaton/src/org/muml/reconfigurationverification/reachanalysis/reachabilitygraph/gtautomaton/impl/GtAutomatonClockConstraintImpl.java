/**
 */
package org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.muml.core.expressions.common.ComparingOperator;

import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtAutomatonClockConstraint;
import org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.GtautomatonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gt Automaton Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonClockConstraintImpl#getClockInstanceIdentifier <em>Clock Instance Identifier</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonClockConstraintImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.reachanalysis.reachabilitygraph.gtautomaton.impl.GtAutomatonClockConstraintImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GtAutomatonClockConstraintImpl extends EObjectImpl implements GtAutomatonClockConstraint {
	/**
	 * The default value of the '{@link #getClockInstanceIdentifier() <em>Clock Instance Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstanceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCK_INSTANCE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClockInstanceIdentifier() <em>Clock Instance Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockInstanceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String clockInstanceIdentifier = CLOCK_INSTANCE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparingOperator OPERATOR_EDEFAULT = ComparingOperator.LESS;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparingOperator operator = OPERATOR_EDEFAULT;

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
	protected GtAutomatonClockConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtautomatonPackage.Literals.GT_AUTOMATON_CLOCK_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClockInstanceIdentifier() {
		return clockInstanceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockInstanceIdentifier(String newClockInstanceIdentifier) {
		String oldClockInstanceIdentifier = clockInstanceIdentifier;
		clockInstanceIdentifier = newClockInstanceIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__CLOCK_INSTANCE_IDENTIFIER, oldClockInstanceIdentifier, clockInstanceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparingOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ComparingOperator newOperator) {
		ComparingOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__OPERATOR, oldOperator, operator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__CLOCK_INSTANCE_IDENTIFIER:
				return getClockInstanceIdentifier();
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__OPERATOR:
				return getOperator();
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__VALUE:
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
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__CLOCK_INSTANCE_IDENTIFIER:
				setClockInstanceIdentifier((String)newValue);
				return;
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__OPERATOR:
				setOperator((ComparingOperator)newValue);
				return;
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__VALUE:
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
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__CLOCK_INSTANCE_IDENTIFIER:
				setClockInstanceIdentifier(CLOCK_INSTANCE_IDENTIFIER_EDEFAULT);
				return;
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__VALUE:
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
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__CLOCK_INSTANCE_IDENTIFIER:
				return CLOCK_INSTANCE_IDENTIFIER_EDEFAULT == null ? clockInstanceIdentifier != null : !CLOCK_INSTANCE_IDENTIFIER_EDEFAULT.equals(clockInstanceIdentifier);
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case GtautomatonPackage.GT_AUTOMATON_CLOCK_CONSTRAINT__VALUE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (clockInstanceIdentifier: ");
		result.append(clockInstanceIdentifier);
		result.append(", operator: ");
		result.append(operator);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //GtAutomatonClockConstraintImpl
