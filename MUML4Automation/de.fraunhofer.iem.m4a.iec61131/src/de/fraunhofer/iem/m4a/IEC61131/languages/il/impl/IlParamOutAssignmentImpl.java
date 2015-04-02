/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.il.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.Variable;

import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.il.IlParamOutAssignment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Out Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamOutAssignmentImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamOutAssignmentImpl#isNOT <em>NOT</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.il.impl.IlParamOutAssignmentImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IlParamOutAssignmentImpl extends MinimalEObjectImpl.Container implements IlParamOutAssignment {
	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected NamedVariable variableName;

	/**
	 * The default value of the '{@link #isNOT() <em>NOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNOT()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNOT() <em>NOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNOT()
	 * @generated
	 * @ordered
	 */
	protected boolean not = NOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IlParamOutAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IlPackage.Literals.IL_PARAM_OUT_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedVariable getVariableName() {
		if (variableName != null && variableName.eIsProxy()) {
			InternalEObject oldVariableName = (InternalEObject)variableName;
			variableName = (NamedVariable)eResolveProxy(oldVariableName);
			if (variableName != oldVariableName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE_NAME, oldVariableName, variableName));
			}
		}
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedVariable basicGetVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(NamedVariable newVariableName) {
		NamedVariable oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNOT() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNOT(boolean newNOT) {
		boolean oldNOT = not;
		not = newNOT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_PARAM_OUT_ASSIGNMENT__NOT, oldNOT, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE_NAME:
				if (resolve) return getVariableName();
				return basicGetVariableName();
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__NOT:
				return isNOT();
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
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
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE_NAME:
				setVariableName((NamedVariable)newValue);
				return;
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__NOT:
				setNOT((Boolean)newValue);
				return;
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE:
				setVariable((Variable)newValue);
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
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE_NAME:
				setVariableName((NamedVariable)null);
				return;
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__NOT:
				setNOT(NOT_EDEFAULT);
				return;
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE:
				setVariable((Variable)null);
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
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE_NAME:
				return variableName != null;
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__NOT:
				return not != NOT_EDEFAULT;
			case IlPackage.IL_PARAM_OUT_ASSIGNMENT__VARIABLE:
				return variable != null;
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
		result.append(" (NOT: ");
		result.append(not);
		result.append(')');
		return result.toString();
	}

} //IlParamOutAssignmentImpl
