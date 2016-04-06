/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.calls.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.expressions.Expression;
import org.muml.core.expressions.impl.ExpressionImpl;
import org.muml.storydiagram.calls.Callable;
import org.muml.storydiagram.calls.CallsPackage;
import org.muml.storydiagram.calls.Invocation;
import org.muml.storydiagram.calls.OpaqueCallable;
import org.muml.storydiagram.calls.ParameterBinding;
import org.muml.storydiagram.calls.expressions.ExpressionsPackage;
import org.muml.storydiagram.calls.expressions.MethodCallExpression;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Method Call Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.calls.expressions.impl.MethodCallExpressionImpl#getOwnedParameterBindings <em>Owned Parameter Bindings</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.expressions.impl.MethodCallExpressionImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.expressions.impl.MethodCallExpressionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.muml.storydiagram.calls.expressions.impl.MethodCallExpressionImpl#getOpaqueCallable <em>Opaque Callable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallExpressionImpl extends ExpressionImpl implements
		MethodCallExpression {
	/**
	 * The cached value of the '{@link #getOwnedParameterBindings() <em>Owned Parameter Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwnedParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> ownedParameterBindings;

	/**
	 * The cached value of the '{@link #getCallee() <em>Callee</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCallee()
	 * @generated
	 * @ordered
	 */
	protected Callable callee;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Expression target;

	/**
	 * The cached value of the '{@link #getOpaqueCallable() <em>Opaque Callable</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOpaqueCallable()
	 * @generated
	 * @ordered
	 */
	protected OpaqueCallable opaqueCallable;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.METHOD_CALL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getOwnedParameterBindings() {
		if (ownedParameterBindings == null) {
			ownedParameterBindings = new EObjectContainmentWithInverseEList<ParameterBinding>(ParameterBinding.class, this, ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS, CallsPackage.PARAMETER_BINDING__INVOCATION);
		}
		return ownedParameterBindings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Callable getCallee() {
		if (callee != null && callee.eIsProxy()) {
			InternalEObject oldCallee = (InternalEObject)callee;
			callee = (Callable)eResolveProxy(oldCallee);
			if (callee != oldCallee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE, oldCallee, callee));
			}
		}
		return callee;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Callable basicGetCallee() {
		return callee;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallee(Callable newCallee) {
		Callable oldCallee = callee;
		callee = newCallee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE, oldCallee, callee));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Expression newTarget,
			NotificationChain msgs) {
		Expression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Expression newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueCallable getOpaqueCallable() {
		return opaqueCallable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpaqueCallable(
			OpaqueCallable newOpaqueCallable, NotificationChain msgs) {
		OpaqueCallable oldOpaqueCallable = opaqueCallable;
		opaqueCallable = newOpaqueCallable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE, oldOpaqueCallable, newOpaqueCallable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpaqueCallable(OpaqueCallable newOpaqueCallable) {
		if (newOpaqueCallable != opaqueCallable) {
			NotificationChain msgs = null;
			if (opaqueCallable != null)
				msgs = ((InternalEObject)opaqueCallable).eInverseRemove(this, CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION, OpaqueCallable.class, msgs);
			if (newOpaqueCallable != null)
				msgs = ((InternalEObject)newOpaqueCallable).eInverseAdd(this, CallsPackage.OPAQUE_CALLABLE__CALL_EXPRESSION, OpaqueCallable.class, msgs);
			msgs = basicSetOpaqueCallable(newOpaqueCallable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE, newOpaqueCallable, newOpaqueCallable));
	}

	protected EParameter getReturnParameter() {
		Callable callee = getOpaqueCallable();
		if (callee == null) {
			callee = getCallee();
			if (callee == null) {
				return null;
			}
		}
		EList<EParameter> outs = callee.getOutParameters();
		EParameter returnParameter = outs.isEmpty() ? null : outs.get(0);
		return returnParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameterBindings()).basicAdd(otherEnd, msgs);
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE:
				if (opaqueCallable != null)
					msgs = ((InternalEObject)opaqueCallable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE, null, msgs);
				return basicSetOpaqueCallable((OpaqueCallable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				return ((InternalEList<?>)getOwnedParameterBindings()).basicRemove(otherEnd, msgs);
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET:
				return basicSetTarget(null, msgs);
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE:
				return basicSetOpaqueCallable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				return getOwnedParameterBindings();
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE:
				if (resolve) return getCallee();
				return basicGetCallee();
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET:
				return getTarget();
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE:
				return getOpaqueCallable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				getOwnedParameterBindings().clear();
				getOwnedParameterBindings().addAll((Collection<? extends ParameterBinding>)newValue);
				return;
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE:
				setCallee((Callable)newValue);
				return;
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET:
				setTarget((Expression)newValue);
				return;
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE:
				setOpaqueCallable((OpaqueCallable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				getOwnedParameterBindings().clear();
				return;
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE:
				setCallee((Callable)null);
				return;
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET:
				setTarget((Expression)null);
				return;
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE:
				setOpaqueCallable((OpaqueCallable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS:
				return ownedParameterBindings != null && !ownedParameterBindings.isEmpty();
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE:
				return callee != null;
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__TARGET:
				return target != null;
			case ExpressionsPackage.METHOD_CALL_EXPRESSION__OPAQUE_CALLABLE:
				return opaqueCallable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Invocation.class) {
			switch (derivedFeatureID) {
				case ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS: return CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS;
				case ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE: return CallsPackage.INVOCATION__CALLEE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Invocation.class) {
			switch (baseFeatureID) {
				case CallsPackage.INVOCATION__OWNED_PARAMETER_BINDINGS: return ExpressionsPackage.METHOD_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS;
				case CallsPackage.INVOCATION__CALLEE: return ExpressionsPackage.METHOD_CALL_EXPRESSION__CALLEE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // MethodCallExpressionImpl
