/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.ArrayVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.ArrayVariableImpl#getSubscriptedVariable <em>Subscripted Variable</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.ArrayVariableImpl#getSubscript <em>Subscript</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayVariableImpl extends MultiElementVariableImpl implements ArrayVariable {
	/**
	 * The cached value of the '{@link #getSubscriptedVariable() <em>Subscripted Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptedVariable()
	 * @generated
	 * @ordered
	 */
	protected SymbolicVariable subscriptedVariable;

	/**
	 * The cached value of the '{@link #getSubscript() <em>Subscript</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscript()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> subscript;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariablesPackage.Literals.ARRAY_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicVariable getSubscriptedVariable() {
		return subscriptedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptedVariable(SymbolicVariable newSubscriptedVariable, NotificationChain msgs) {
		SymbolicVariable oldSubscriptedVariable = subscriptedVariable;
		subscriptedVariable = newSubscriptedVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariablesPackage.ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE, oldSubscriptedVariable, newSubscriptedVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptedVariable(SymbolicVariable newSubscriptedVariable) {
		if (newSubscriptedVariable != subscriptedVariable) {
			NotificationChain msgs = null;
			if (subscriptedVariable != null)
				msgs = ((InternalEObject)subscriptedVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE, null, msgs);
			if (newSubscriptedVariable != null)
				msgs = ((InternalEObject)newSubscriptedVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariablesPackage.ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE, null, msgs);
			msgs = basicSetSubscriptedVariable(newSubscriptedVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariablesPackage.ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE, newSubscriptedVariable, newSubscriptedVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getSubscript() {
		if (subscript == null) {
			subscript = new EObjectResolvingEList<Expression>(Expression.class, this, VariablesPackage.ARRAY_VARIABLE__SUBSCRIPT);
		}
		return subscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariablesPackage.ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE:
				return basicSetSubscriptedVariable(null, msgs);
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
			case VariablesPackage.ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE:
				return getSubscriptedVariable();
			case VariablesPackage.ARRAY_VARIABLE__SUBSCRIPT:
				return getSubscript();
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
			case VariablesPackage.ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE:
				setSubscriptedVariable((SymbolicVariable)newValue);
				return;
			case VariablesPackage.ARRAY_VARIABLE__SUBSCRIPT:
				getSubscript().clear();
				getSubscript().addAll((Collection<? extends Expression>)newValue);
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
			case VariablesPackage.ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE:
				setSubscriptedVariable((SymbolicVariable)null);
				return;
			case VariablesPackage.ARRAY_VARIABLE__SUBSCRIPT:
				getSubscript().clear();
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
			case VariablesPackage.ARRAY_VARIABLE__SUBSCRIPTED_VARIABLE:
				return subscriptedVariable != null;
			case VariablesPackage.ARRAY_VARIABLE__SUBSCRIPT:
				return subscript != null && !subscript.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayVariableImpl
