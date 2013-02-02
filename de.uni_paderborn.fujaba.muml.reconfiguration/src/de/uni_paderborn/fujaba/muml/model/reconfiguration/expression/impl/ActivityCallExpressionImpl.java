/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.expression.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.expressions.impl.ExpressionImpl;
import org.storydriven.storydiagrams.activities.Activity;

import de.uni_paderborn.fujaba.muml.model.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.expression.ActivityCallExpression;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.expression.impl.ActivityCallExpressionImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.expression.impl.ActivityCallExpressionImpl#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityCallExpressionImpl extends ExpressionImpl implements ActivityCallExpression {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

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
	protected ActivityCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.ACTIVITY_CALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Activity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getParameterBindings() {
		if (parameterBindings == null) {
			parameterBindings = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, ExpressionPackage.ACTIVITY_CALL_EXPRESSION__PARAMETER_BINDINGS);
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
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__PARAMETER_BINDINGS:
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
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__PARAMETER_BINDINGS:
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
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__PARAMETER_BINDINGS:
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
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__PARAMETER_BINDINGS:
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
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				return activity != null;
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__PARAMETER_BINDINGS:
				return parameterBindings != null && !parameterBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityCallExpressionImpl
