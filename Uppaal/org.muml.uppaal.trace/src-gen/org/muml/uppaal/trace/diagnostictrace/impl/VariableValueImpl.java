/**
 */
package org.muml.uppaal.trace.diagnosticTrace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.muml.uppaal.trace.diagnosticTrace.CompareOperator;
import org.muml.uppaal.trace.diagnosticTrace.DiagnosticTracePackage;
import org.muml.uppaal.trace.diagnosticTrace.NamedElementReference;
import org.muml.uppaal.trace.diagnosticTrace.VariableValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.VariableValueImpl#getFirstNamedElementReference <em>First Named Element Reference</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.VariableValueImpl#getSecondNamedElementReference <em>Second Named Element Reference</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.VariableValueImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.muml.uppaal.trace.diagnostictrace.impl.VariableValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableValueImpl extends MinimalEObjectImpl.Container implements org.muml.uppaal.trace.diagnostictrace.VariableValue {
	/**
	 * The cached value of the '{@link #getFirstNamedElementReference() <em>First Named Element Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNamedElementReference()
	 * @generated
	 * @ordered
	 */
	protected org.muml.uppaal.trace.diagnostictrace.NamedElementReference firstNamedElementReference;

	/**
	 * The cached value of the '{@link #getSecondNamedElementReference() <em>Second Named Element Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondNamedElementReference()
	 * @generated
	 * @ordered
	 */
	protected org.muml.uppaal.trace.diagnostictrace.NamedElementReference secondNamedElementReference;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final org.muml.uppaal.trace.diagnostictrace.CompareOperator OPERATOR_EDEFAULT = org.muml.uppaal.trace.diagnostictrace.CompareOperator.EQ;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected org.muml.uppaal.trace.diagnostictrace.CompareOperator operator = OPERATOR_EDEFAULT;

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
	protected VariableValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.Literals.VARIABLE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.NamedElementReference getFirstNamedElementReference() {
		return firstNamedElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstNamedElementReference(org.muml.uppaal.trace.diagnostictrace.NamedElementReference newFirstNamedElementReference, NotificationChain msgs) {
		org.muml.uppaal.trace.diagnostictrace.NamedElementReference oldFirstNamedElementReference = firstNamedElementReference;
		firstNamedElementReference = newFirstNamedElementReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE, oldFirstNamedElementReference, newFirstNamedElementReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstNamedElementReference(org.muml.uppaal.trace.diagnostictrace.NamedElementReference newFirstNamedElementReference) {
		if (newFirstNamedElementReference != firstNamedElementReference) {
			NotificationChain msgs = null;
			if (firstNamedElementReference != null)
				msgs = ((InternalEObject)firstNamedElementReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE, null, msgs);
			if (newFirstNamedElementReference != null)
				msgs = ((InternalEObject)newFirstNamedElementReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE, null, msgs);
			msgs = basicSetFirstNamedElementReference(newFirstNamedElementReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE, newFirstNamedElementReference, newFirstNamedElementReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.NamedElementReference getSecondNamedElementReference() {
		return secondNamedElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondNamedElementReference(org.muml.uppaal.trace.diagnostictrace.NamedElementReference newSecondNamedElementReference, NotificationChain msgs) {
		org.muml.uppaal.trace.diagnostictrace.NamedElementReference oldSecondNamedElementReference = secondNamedElementReference;
		secondNamedElementReference = newSecondNamedElementReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE, oldSecondNamedElementReference, newSecondNamedElementReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondNamedElementReference(org.muml.uppaal.trace.diagnostictrace.NamedElementReference newSecondNamedElementReference) {
		if (newSecondNamedElementReference != secondNamedElementReference) {
			NotificationChain msgs = null;
			if (secondNamedElementReference != null)
				msgs = ((InternalEObject)secondNamedElementReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE, null, msgs);
			if (newSecondNamedElementReference != null)
				msgs = ((InternalEObject)newSecondNamedElementReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE, null, msgs);
			msgs = basicSetSecondNamedElementReference(newSecondNamedElementReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE, newSecondNamedElementReference, newSecondNamedElementReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.uppaal.trace.diagnostictrace.CompareOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(org.muml.uppaal.trace.diagnostictrace.CompareOperator newOperator) {
		org.muml.uppaal.trace.diagnostictrace.CompareOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__OPERATOR, oldOperator, operator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE:
				return basicSetFirstNamedElementReference(null, msgs);
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE:
				return basicSetSecondNamedElementReference(null, msgs);
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE:
				return getFirstNamedElementReference();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE:
				return getSecondNamedElementReference();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__OPERATOR:
				return getOperator();
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__VALUE:
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE:
				setFirstNamedElementReference((org.muml.uppaal.trace.diagnostictrace.NamedElementReference)newValue);
				return;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE:
				setSecondNamedElementReference((org.muml.uppaal.trace.diagnostictrace.NamedElementReference)newValue);
				return;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__OPERATOR:
				setOperator((org.muml.uppaal.trace.diagnostictrace.CompareOperator)newValue);
				return;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__VALUE:
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE:
				setFirstNamedElementReference((org.muml.uppaal.trace.diagnostictrace.NamedElementReference)null);
				return;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE:
				setSecondNamedElementReference((org.muml.uppaal.trace.diagnostictrace.NamedElementReference)null);
				return;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__VALUE:
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
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__FIRST_NAMED_ELEMENT_REFERENCE:
				return firstNamedElementReference != null;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__SECOND_NAMED_ELEMENT_REFERENCE:
				return secondNamedElementReference != null;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case org.muml.uppaal.trace.diagnostictrace.DiagnosticTracePackage.VARIABLE_VALUE__VALUE:
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //VariableValueImpl
