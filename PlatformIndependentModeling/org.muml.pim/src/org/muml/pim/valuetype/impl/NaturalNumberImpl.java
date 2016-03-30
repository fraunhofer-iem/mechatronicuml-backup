/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.valuetype.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.pim.valuetype.NaturalNumber;
import org.muml.pim.valuetype.ValuetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.valuetype.impl.NaturalNumberImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.muml.pim.valuetype.impl.NaturalNumberImpl#isInfinity <em>Infinity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NaturalNumberImpl extends EObjectImpl implements NaturalNumber {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final long VALUE_EDEFAULT = 1L;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected long value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInfinity() <em>Infinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfinity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFINITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInfinity() <em>Infinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfinity()
	 * @generated
	 * @ordered
	 */
	protected boolean infinity = INFINITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaturalNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuetypePackage.Literals.NATURAL_NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getValue() {
		if (isInfinity()) {
			return Long.MAX_VALUE;
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setValue(long newValue) throws NumberFormatException {
		// Forbid negative values
		if (newValue < 0) {
			throw new NumberFormatException("NaturalNumber must not be negative.");
		}
		
		// Generated code sets the feature as usual
		long oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuetypePackage.NATURAL_NUMBER__VALUE, oldValue, value));

		// Set infinity to false
		setInfinity(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInfinity() {
		return infinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfinity(boolean newInfinity) {
		boolean oldInfinity = infinity;
		infinity = newInfinity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuetypePackage.NATURAL_NUMBER__INFINITY, oldInfinity, infinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(final String value) {
		if (value == null || value.equals("*")) {
			setInfinity(true);
			return;
		}
		
		// Convert to long, if string cannot be parsed, set infinity.
		long longValue;
		try {
			longValue = Long.parseLong(value);
		} catch (NumberFormatException e) {
			setInfinity(true);
			return;
		}
		
		// Call setValue(long) outsite of catch block, so that the NumberFormatException
		// indicating negative numbers is not catched.
		setValue(longValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (isInfinity()) {
			return "*";
		}
		return Long.toString(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals(final EObject o) {
		if (o instanceof NaturalNumber) {
			NaturalNumber naturalNumber = (NaturalNumber) o;
			// Value of infinity must be equal
			if (isInfinity() != naturalNumber.isInfinity()) {
				return false;
			}
			// If both are not infinite, make sure their value is identical.
			if (!isInfinity() && (naturalNumber.getValue() != getValue())) {
				return false;
			}
			return true;
		}
		return false;
	}

	/**
	 * The cached invocation delegate for the '{@link #lessOrEqual(org.muml.pim.valuetype.NaturalNumber) <em>Less Or Equal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lessOrEqual(org.muml.pim.valuetype.NaturalNumber)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LESS_OR_EQUAL_NATURAL_NUMBER__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuetypePackage.Literals.NATURAL_NUMBER___LESS_OR_EQUAL__NATURALNUMBER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean lessOrEqual(NaturalNumber n) {
		try {
			return (Boolean)LESS_OR_EQUAL_NATURAL_NUMBER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{n}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #greaterOrEqual(org.muml.pim.valuetype.NaturalNumber) <em>Greater Or Equal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #greaterOrEqual(org.muml.pim.valuetype.NaturalNumber)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GREATER_OR_EQUAL_NATURAL_NUMBER__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuetypePackage.Literals.NATURAL_NUMBER___GREATER_OR_EQUAL__NATURALNUMBER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean greaterOrEqual(NaturalNumber n) {
		try {
			return (Boolean)GREATER_OR_EQUAL_NATURAL_NUMBER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{n}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValuetypePackage.NATURAL_NUMBER__VALUE:
				return getValue();
			case ValuetypePackage.NATURAL_NUMBER__INFINITY:
				return isInfinity();
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
			case ValuetypePackage.NATURAL_NUMBER__VALUE:
				setValue((Long)newValue);
				return;
			case ValuetypePackage.NATURAL_NUMBER__INFINITY:
				setInfinity((Boolean)newValue);
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
			case ValuetypePackage.NATURAL_NUMBER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ValuetypePackage.NATURAL_NUMBER__INFINITY:
				setInfinity(INFINITY_EDEFAULT);
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
			case ValuetypePackage.NATURAL_NUMBER__VALUE:
				return value != VALUE_EDEFAULT;
			case ValuetypePackage.NATURAL_NUMBER__INFINITY:
				return infinity != INFINITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ValuetypePackage.NATURAL_NUMBER___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
			case ValuetypePackage.NATURAL_NUMBER___TO_STRING:
				return toString();
			case ValuetypePackage.NATURAL_NUMBER___EQUALS__EOBJECT:
				return equals((EObject)arguments.get(0));
			case ValuetypePackage.NATURAL_NUMBER___LESS_OR_EQUAL__NATURALNUMBER:
				return lessOrEqual((NaturalNumber)arguments.get(0));
			case ValuetypePackage.NATURAL_NUMBER___GREATER_OR_EQUAL__NATURALNUMBER:
				return greaterOrEqual((NaturalNumber)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NaturalNumberImpl
