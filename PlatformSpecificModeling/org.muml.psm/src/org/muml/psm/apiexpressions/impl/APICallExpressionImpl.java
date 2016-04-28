/**
 */
package org.muml.psm.apiexpressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.mumlcore.expressions.impl.ExpressionImpl;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pm.software.APICommand;
import org.muml.psm.apiexpressions.APICallExpression;
import org.muml.psm.apiexpressions.ApiexpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.apiexpressions.impl.APICallExpressionImpl#getApiCommand <em>Api Command</em>}</li>
 *   <li>{@link org.muml.psm.apiexpressions.impl.APICallExpressionImpl#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APICallExpressionImpl extends ExpressionImpl implements APICallExpression {
	/**
	 * The cached value of the '{@link #getApiCommand() <em>Api Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiCommand()
	 * @generated
	 * @ordered
	 */
	protected APICommand apiCommand;

	/**
	 * The cached value of the '{@link #getParameterBindings() <em>Parameter Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> parameterBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APICallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApiexpressionsPackage.Literals.API_CALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APICommand getApiCommand() {
		if (apiCommand != null && apiCommand.eIsProxy()) {
			InternalEObject oldApiCommand = (InternalEObject)apiCommand;
			apiCommand = (APICommand)eResolveProxy(oldApiCommand);
			if (apiCommand != oldApiCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApiexpressionsPackage.API_CALL_EXPRESSION__API_COMMAND, oldApiCommand, apiCommand));
			}
		}
		return apiCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APICommand basicGetApiCommand() {
		return apiCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiCommand(APICommand newApiCommand) {
		APICommand oldApiCommand = apiCommand;
		apiCommand = newApiCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiexpressionsPackage.API_CALL_EXPRESSION__API_COMMAND, oldApiCommand, apiCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getParameterBindings() {
		if (parameterBindings == null) {
			parameterBindings = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, ApiexpressionsPackage.API_CALL_EXPRESSION__PARAMETER_BINDINGS);
		}
		return parameterBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApiexpressionsPackage.API_CALL_EXPRESSION__PARAMETER_BINDINGS:
				return ((InternalEList<?>)getParameterBindings()).basicRemove(otherEnd, msgs);
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
			case ApiexpressionsPackage.API_CALL_EXPRESSION__API_COMMAND:
				if (resolve) return getApiCommand();
				return basicGetApiCommand();
			case ApiexpressionsPackage.API_CALL_EXPRESSION__PARAMETER_BINDINGS:
				return getParameterBindings();
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
			case ApiexpressionsPackage.API_CALL_EXPRESSION__API_COMMAND:
				setApiCommand((APICommand)newValue);
				return;
			case ApiexpressionsPackage.API_CALL_EXPRESSION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
				getParameterBindings().addAll((Collection<? extends ParameterBinding>)newValue);
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
			case ApiexpressionsPackage.API_CALL_EXPRESSION__API_COMMAND:
				setApiCommand((APICommand)null);
				return;
			case ApiexpressionsPackage.API_CALL_EXPRESSION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
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
			case ApiexpressionsPackage.API_CALL_EXPRESSION__API_COMMAND:
				return apiCommand != null;
			case ApiexpressionsPackage.API_CALL_EXPRESSION__PARAMETER_BINDINGS:
				return parameterBindings != null && !parameterBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APICallExpressionImpl
