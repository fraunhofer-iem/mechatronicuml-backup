/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.NaturalNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.NaturalNumberImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.NaturalNumberImpl#isInfinity <em>Infinity</em>}</li>
 * </ul>
 * </p>
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
		return CorePackage.Literals.NATURAL_NUMBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NATURAL_NUMBER__VALUE, oldValue, value));

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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NATURAL_NUMBER__INFINITY, oldInfinity, infinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setValue(String value) throws NumberFormatException {
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
	public long longValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
	public boolean equals(EObject o) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.NATURAL_NUMBER__VALUE:
				return getValue();
			case CorePackage.NATURAL_NUMBER__INFINITY:
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
			case CorePackage.NATURAL_NUMBER__VALUE:
				setValue((Long)newValue);
				return;
			case CorePackage.NATURAL_NUMBER__INFINITY:
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
			case CorePackage.NATURAL_NUMBER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CorePackage.NATURAL_NUMBER__INFINITY:
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
			case CorePackage.NATURAL_NUMBER__VALUE:
				return value != VALUE_EDEFAULT;
			case CorePackage.NATURAL_NUMBER__INFINITY:
				return infinity != INFINITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //NaturalNumberImpl
