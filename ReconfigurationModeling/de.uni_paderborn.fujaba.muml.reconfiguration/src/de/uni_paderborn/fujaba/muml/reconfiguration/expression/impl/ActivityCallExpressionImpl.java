/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.expressions.impl.ExpressionImpl;
import org.storydriven.storydiagrams.activities.Activity;
import org.storydriven.storydiagrams.calls.Callable;
import org.storydriven.storydiagrams.calls.CallsPackage;
import org.storydriven.storydiagrams.calls.Invocation;
import org.storydriven.storydiagrams.calls.ParameterBinding;

import de.uni_paderborn.fujaba.muml.reconfiguration.expression.ActivityCallExpression;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ActivityCallExpressionImpl#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ActivityCallExpressionImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ActivityCallExpressionImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityCallExpressionImpl extends ExpressionImpl implements ActivityCallExpression {
	/**
	 * The cached value of the '{@link #getOwnedParameterBindings() <em>Owned Parameter Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> ownedParameterBindings;

	/**
	 * The cached value of the '{@link #getCallee() <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallee()
	 * @generated
	 * @ordered
	 */
	protected Callable callee;

	/**
	 * The cached setting delegate for the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ACTIVITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ExpressionPackage.Literals.ACTIVITY_CALL_EXPRESSION__ACTIVITY).getSettingDelegate();

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
	public EList<ParameterBinding> getOwnedParameterBindings() {
		if (ownedParameterBindings == null) {
			ownedParameterBindings = new EObjectContainmentWithInverseEList.Resolving<ParameterBinding>(ParameterBinding.class, this, ExpressionPackage.ACTIVITY_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS, CallsPackage.PARAMETER_BINDING__INVOCATION);
		}
		return ownedParameterBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callable getCallee() {
		if (callee != null && callee.eIsProxy()) {
			InternalEObject oldCallee = (InternalEObject)callee;
			callee = (Callable)eResolveProxy(oldCallee);
			if (callee != oldCallee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.ACTIVITY_CALL_EXPRESSION__CALLEE, oldCallee, callee));
			}
		}
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Callable basicGetCallee() {
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallee(Callable newCallee) {
		Callable oldCallee = callee;
		callee = newCallee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.ACTIVITY_CALL_EXPRESSION__CALLEE, oldCallee, callee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		return (Activity)ACTIVITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return (Activity)ACTIVITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		ACTIVITY__ESETTING_DELEGATE.dynamicSet(this, null, 0, newActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameterBindings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				return ((InternalEList<?>)getOwnedParameterBindings()).basicRemove(otherEnd, msgs);
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
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				return getOwnedParameterBindings();
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__CALLEE:
				if (resolve) return getCallee();
				return basicGetCallee();
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
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
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				getOwnedParameterBindings().clear();
				getOwnedParameterBindings().addAll((Collection<? extends ParameterBinding>)newValue);
				return;
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__CALLEE:
				setCallee((Callable)newValue);
				return;
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				setActivity((Activity)newValue);
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
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				getOwnedParameterBindings().clear();
				return;
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__CALLEE:
				setCallee((Callable)null);
				return;
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				setActivity((Activity)null);
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
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				return ownedParameterBindings != null && !ownedParameterBindings.isEmpty();
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__CALLEE:
				return callee != null;
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__ACTIVITY:
				return ACTIVITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Invocation.class) {
			switch (derivedFeatureID) {
				case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS: return CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS;
				case ExpressionPackage.ACTIVITY_CALL_EXPRESSION__CALLEE: return CallsPackage.INVOCATION__CALLEE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Invocation.class) {
			switch (baseFeatureID) {
				case CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS: return ExpressionPackage.ACTIVITY_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS;
				case CallsPackage.INVOCATION__CALLEE: return ExpressionPackage.ACTIVITY_CALL_EXPRESSION__CALLEE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityCallExpressionImpl
