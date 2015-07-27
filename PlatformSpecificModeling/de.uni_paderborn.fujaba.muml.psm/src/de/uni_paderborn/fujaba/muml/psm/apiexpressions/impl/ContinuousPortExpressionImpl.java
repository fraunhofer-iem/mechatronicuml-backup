/**
 */
package de.uni_paderborn.fujaba.muml.psm.apiexpressions.impl;

import de.uni_paderborn.fujaba.muml.instance.ContinuousPortInstance;

import de.uni_paderborn.fujaba.muml.psm.apiexpressions.ApiexpressionsPackage;
import de.uni_paderborn.fujaba.muml.psm.apiexpressions.ContinuousPortExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.core.expressions.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Port Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.apiexpressions.impl.ContinuousPortExpressionImpl#getContinuousPort <em>Continuous Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContinuousPortExpressionImpl extends ExpressionImpl implements ContinuousPortExpression {
	/**
	 * The cached value of the '{@link #getContinuousPort() <em>Continuous Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuousPort()
	 * @generated
	 * @ordered
	 */
	protected ContinuousPortInstance continuousPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousPortExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApiexpressionsPackage.Literals.CONTINUOUS_PORT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPortInstance getContinuousPort() {
		if (continuousPort != null && continuousPort.eIsProxy()) {
			InternalEObject oldContinuousPort = (InternalEObject)continuousPort;
			continuousPort = (ContinuousPortInstance)eResolveProxy(oldContinuousPort);
			if (continuousPort != oldContinuousPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApiexpressionsPackage.CONTINUOUS_PORT_EXPRESSION__CONTINUOUS_PORT, oldContinuousPort, continuousPort));
			}
		}
		return continuousPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPortInstance basicGetContinuousPort() {
		return continuousPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuousPort(ContinuousPortInstance newContinuousPort) {
		ContinuousPortInstance oldContinuousPort = continuousPort;
		continuousPort = newContinuousPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApiexpressionsPackage.CONTINUOUS_PORT_EXPRESSION__CONTINUOUS_PORT, oldContinuousPort, continuousPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApiexpressionsPackage.CONTINUOUS_PORT_EXPRESSION__CONTINUOUS_PORT:
				if (resolve) return getContinuousPort();
				return basicGetContinuousPort();
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
			case ApiexpressionsPackage.CONTINUOUS_PORT_EXPRESSION__CONTINUOUS_PORT:
				setContinuousPort((ContinuousPortInstance)newValue);
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
			case ApiexpressionsPackage.CONTINUOUS_PORT_EXPRESSION__CONTINUOUS_PORT:
				setContinuousPort((ContinuousPortInstance)null);
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
			case ApiexpressionsPackage.CONTINUOUS_PORT_EXPRESSION__CONTINUOUS_PORT:
				return continuousPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ContinuousPortExpressionImpl
