/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.expression;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.storydriven.core.expressions.ExpressionsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This package defines expressions that may used for calling reconfiguration operations
 * in the action language.
 * <!-- end-model-doc -->
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ExpressionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fujaba.de/muml/reconfiguration/expression/0.3.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expression";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ActivityCallExpressionImpl <em>Activity Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ActivityCallExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ExpressionPackageImpl#getActivityCallExpression()
	 * @generated
	 */
	int ACTIVITY_CALL_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_EXPRESSION__OWNED_PARAMETER_BINDINGS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_EXPRESSION__CALLEE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_EXPRESSION__ACTIVITY = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CALL_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ReconfigurationRuleCallExpressionImpl <em>Reconfiguration Rule Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ReconfigurationRuleCallExpressionImpl
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ExpressionPackageImpl#getReconfigurationRuleCallExpression()
	 * @generated
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION__ANNOTATION = ExpressionsPackage.EXPRESSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION__EXTENSION = ExpressionsPackage.EXPRESSION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION__COMMENT = ExpressionsPackage.EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Reconfiguration Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reconfiguration Rule Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_RULE_CALL_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.ActivityCallExpression <em>Activity Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Call Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ActivityCallExpression
	 * @generated
	 */
	EClass getActivityCallExpression();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.ActivityCallExpression#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ActivityCallExpression#getActivity()
	 * @see #getActivityCallExpression()
	 * @generated
	 */
	EReference getActivityCallExpression_Activity();

	/**
	 * Returns the meta object for class '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.ReconfigurationRuleCallExpression <em>Reconfiguration Rule Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration Rule Call Expression</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ReconfigurationRuleCallExpression
	 * @generated
	 */
	EClass getReconfigurationRuleCallExpression();

	/**
	 * Returns the meta object for the reference '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.ReconfigurationRuleCallExpression#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconfiguration Rule</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ReconfigurationRuleCallExpression#getReconfigurationRule()
	 * @see #getReconfigurationRuleCallExpression()
	 * @generated
	 */
	EReference getReconfigurationRuleCallExpression_ReconfigurationRule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.ReconfigurationRuleCallExpression#getParameterBindings <em>Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Bindings</em>'.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.ReconfigurationRuleCallExpression#getParameterBindings()
	 * @see #getReconfigurationRuleCallExpression()
	 * @generated
	 */
	EReference getReconfigurationRuleCallExpression_ParameterBindings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ActivityCallExpressionImpl <em>Activity Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ActivityCallExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ExpressionPackageImpl#getActivityCallExpression()
		 * @generated
		 */
		EClass ACTIVITY_CALL_EXPRESSION = eINSTANCE.getActivityCallExpression();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CALL_EXPRESSION__ACTIVITY = eINSTANCE.getActivityCallExpression_Activity();

		/**
		 * The meta object literal for the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ReconfigurationRuleCallExpressionImpl <em>Reconfiguration Rule Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ReconfigurationRuleCallExpressionImpl
		 * @see de.uni_paderborn.fujaba.muml.reconfiguration.expression.impl.ExpressionPackageImpl#getReconfigurationRuleCallExpression()
		 * @generated
		 */
		EClass RECONFIGURATION_RULE_CALL_EXPRESSION = eINSTANCE.getReconfigurationRuleCallExpression();

		/**
		 * The meta object literal for the '<em><b>Reconfiguration Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE_CALL_EXPRESSION__RECONFIGURATION_RULE = eINSTANCE.getReconfigurationRuleCallExpression_ReconfigurationRule();

		/**
		 * The meta object literal for the '<em><b>Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECONFIGURATION_RULE_CALL_EXPRESSION__PARAMETER_BINDINGS = eINSTANCE.getReconfigurationRuleCallExpression_ParameterBindings();

	}

} //ExpressionPackage
