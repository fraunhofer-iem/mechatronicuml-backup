/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.FieldSelector;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.StructuredVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.StructuredVariableImpl#getRecordVariable <em>Record Variable</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.StructuredVariableImpl#getFieldSelector <em>Field Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredVariableImpl extends MultiElementVariableImpl implements StructuredVariable {
	/**
	 * The cached value of the '{@link #getRecordVariable() <em>Record Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordVariable()
	 * @generated
	 * @ordered
	 */
	protected SymbolicVariable recordVariable;

	/**
	 * The cached value of the '{@link #getFieldSelector() <em>Field Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldSelector()
	 * @generated
	 * @ordered
	 */
	protected FieldSelector fieldSelector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariablesPackage.Literals.STRUCTURED_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicVariable getRecordVariable() {
		return recordVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordVariable(SymbolicVariable newRecordVariable, NotificationChain msgs) {
		SymbolicVariable oldRecordVariable = recordVariable;
		recordVariable = newRecordVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.STRUCTURED_VARIABLE__RECORD_VARIABLE, oldRecordVariable, newRecordVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordVariable(SymbolicVariable newRecordVariable) {
		if (newRecordVariable != recordVariable) {
			NotificationChain msgs = null;
			if (recordVariable != null)
				msgs = ((InternalEObject)recordVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.STRUCTURED_VARIABLE__RECORD_VARIABLE, null, msgs);
			if (newRecordVariable != null)
				msgs = ((InternalEObject)newRecordVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.STRUCTURED_VARIABLE__RECORD_VARIABLE, null, msgs);
			msgs = basicSetRecordVariable(newRecordVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.STRUCTURED_VARIABLE__RECORD_VARIABLE, newRecordVariable, newRecordVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldSelector getFieldSelector() {
		return fieldSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldSelector(FieldSelector newFieldSelector, NotificationChain msgs) {
		FieldSelector oldFieldSelector = fieldSelector;
		fieldSelector = newFieldSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.STRUCTURED_VARIABLE__FIELD_SELECTOR, oldFieldSelector, newFieldSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldSelector(FieldSelector newFieldSelector) {
		if (newFieldSelector != fieldSelector) {
			NotificationChain msgs = null;
			if (fieldSelector != null)
				msgs = ((InternalEObject)fieldSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.STRUCTURED_VARIABLE__FIELD_SELECTOR, null, msgs);
			if (newFieldSelector != null)
				msgs = ((InternalEObject)newFieldSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.STRUCTURED_VARIABLE__FIELD_SELECTOR, null, msgs);
			msgs = basicSetFieldSelector(newFieldSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.STRUCTURED_VARIABLE__FIELD_SELECTOR, newFieldSelector, newFieldSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariablesPackage.STRUCTURED_VARIABLE__RECORD_VARIABLE:
				return basicSetRecordVariable(null, msgs);
			case VariablesPackage.STRUCTURED_VARIABLE__FIELD_SELECTOR:
				return basicSetFieldSelector(null, msgs);
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
			case VariablesPackage.STRUCTURED_VARIABLE__RECORD_VARIABLE:
				return getRecordVariable();
			case VariablesPackage.STRUCTURED_VARIABLE__FIELD_SELECTOR:
				return getFieldSelector();
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
			case VariablesPackage.STRUCTURED_VARIABLE__RECORD_VARIABLE:
				setRecordVariable((SymbolicVariable)newValue);
				return;
			case VariablesPackage.STRUCTURED_VARIABLE__FIELD_SELECTOR:
				setFieldSelector((FieldSelector)newValue);
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
			case VariablesPackage.STRUCTURED_VARIABLE__RECORD_VARIABLE:
				setRecordVariable((SymbolicVariable)null);
				return;
			case VariablesPackage.STRUCTURED_VARIABLE__FIELD_SELECTOR:
				setFieldSelector((FieldSelector)null);
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
			case VariablesPackage.STRUCTURED_VARIABLE__RECORD_VARIABLE:
				return recordVariable != null;
			case VariablesPackage.STRUCTURED_VARIABLE__FIELD_SELECTOR:
				return fieldSelector != null;
		}
		return super.eIsSet(featureID);
	}

} //StructuredVariableImpl
