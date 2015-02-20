/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl;

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

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.reconfiguration.StructuralCondition;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.EvaluateStructuralConditionExpression;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluate Structural Condition Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.EvaluateStructuralConditionExpressionImpl#getParameterBindings <em>Parameter Bindings</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.EvaluateStructuralConditionExpressionImpl#getStructuralCondition <em>Structural Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluateStructuralConditionExpressionImpl extends ExpressionImpl implements EvaluateStructuralConditionExpression {
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
	 * The cached value of the '{@link #getStructuralCondition() <em>Structural Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralCondition()
	 * @generated
	 * @ordered
	 */
	protected StructuralCondition structuralCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluateStructuralConditionExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getParameterBindings() {
		if (parameterBindings == null) {
			parameterBindings = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__PARAMETER_BINDINGS);
		}
		return parameterBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralCondition getStructuralCondition() {
		if (structuralCondition != null && structuralCondition.eIsProxy()) {
			InternalEObject oldStructuralCondition = (InternalEObject)structuralCondition;
			structuralCondition = (StructuralCondition)eResolveProxy(oldStructuralCondition);
			if (structuralCondition != oldStructuralCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__STRUCTURAL_CONDITION, oldStructuralCondition, structuralCondition));
			}
		}
		return structuralCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralCondition basicGetStructuralCondition() {
		return structuralCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuralCondition(StructuralCondition newStructuralCondition) {
		StructuralCondition oldStructuralCondition = structuralCondition;
		structuralCondition = newStructuralCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__STRUCTURAL_CONDITION, oldStructuralCondition, structuralCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__PARAMETER_BINDINGS:
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
			case ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__PARAMETER_BINDINGS:
				return getParameterBindings();
			case ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__STRUCTURAL_CONDITION:
				if (resolve) return getStructuralCondition();
				return basicGetStructuralCondition();
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
			case ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
				getParameterBindings().addAll((Collection<? extends ParameterBinding>)newValue);
				return;
			case ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__STRUCTURAL_CONDITION:
				setStructuralCondition((StructuralCondition)newValue);
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
			case ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
				return;
			case ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__STRUCTURAL_CONDITION:
				setStructuralCondition((StructuralCondition)null);
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
			case ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__PARAMETER_BINDINGS:
				return parameterBindings != null && !parameterBindings.isEmpty();
			case ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION__STRUCTURAL_CONDITION:
				return structuralCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //EvaluateStructuralConditionExpressionImpl
