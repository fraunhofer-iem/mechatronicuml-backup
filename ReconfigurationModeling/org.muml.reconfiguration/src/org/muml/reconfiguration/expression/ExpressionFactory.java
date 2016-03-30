/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration.expression;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.reconfiguration.expression.ExpressionPackage
 * @generated
 */
public interface ExpressionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionFactory eINSTANCE = org.muml.reconfiguration.expression.impl.ExpressionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Call Expression</em>'.
	 * @generated
	 */
	ActivityCallExpression createActivityCallExpression();

	/**
	 * Returns a new object of class '<em>Reconfiguration Rule Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reconfiguration Rule Call Expression</em>'.
	 * @generated
	 */
	ReconfigurationRuleCallExpression createReconfigurationRuleCallExpression();

	/**
	 * Returns a new object of class '<em>Evaluate Structural Condition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluate Structural Condition Expression</em>'.
	 * @generated
	 */
	EvaluateStructuralConditionExpression createEvaluateStructuralConditionExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionPackage getExpressionPackage();

} //ExpressionFactory
