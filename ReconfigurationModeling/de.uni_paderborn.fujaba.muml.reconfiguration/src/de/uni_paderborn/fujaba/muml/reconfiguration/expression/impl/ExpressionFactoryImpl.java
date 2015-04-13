/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl;

import de.uni_paderborn.fujaba.muml.reconfiguration.expression.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_paderborn.fujaba.muml.reconfiguration.expression.ActivityCallExpression;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.EvaluateStructuralConditionExpression;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionFactory;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.expression.ReconfigurationRuleCallExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionFactory init() {
		try {
			ExpressionFactory theExpressionFactory = (ExpressionFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionPackage.eNS_URI);
			if (theExpressionFactory != null) {
				return theExpressionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExpressionPackage.ACTIVITY_CALL_EXPRESSION: return createActivityCallExpression();
			case ExpressionPackage.RECONFIGURATION_RULE_CALL_EXPRESSION: return createReconfigurationRuleCallExpression();
			case ExpressionPackage.EVALUATE_STRUCTURAL_CONDITION_EXPRESSION: return createEvaluateStructuralConditionExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityCallExpression createActivityCallExpression() {
		ActivityCallExpressionImpl activityCallExpression = new ActivityCallExpressionImpl();
		return activityCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationRuleCallExpression createReconfigurationRuleCallExpression() {
		ReconfigurationRuleCallExpressionImpl reconfigurationRuleCallExpression = new ReconfigurationRuleCallExpressionImpl();
		return reconfigurationRuleCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluateStructuralConditionExpression createEvaluateStructuralConditionExpression() {
		EvaluateStructuralConditionExpressionImpl evaluateStructuralConditionExpression = new EvaluateStructuralConditionExpressionImpl();
		return evaluateStructuralConditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionPackage getExpressionPackage() {
		return (ExpressionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionPackage getPackage() {
		return ExpressionPackage.eINSTANCE;
	}

} //ExpressionFactoryImpl
