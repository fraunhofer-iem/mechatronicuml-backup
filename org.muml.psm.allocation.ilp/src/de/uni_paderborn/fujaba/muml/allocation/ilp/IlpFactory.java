/**
 */
package de.uni_paderborn.fujaba.muml.allocation.ilp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.allocation.ilp.IlpPackage
 * @generated
 */
public interface IlpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IlpFactory eINSTANCE = de.uni_paderborn.fujaba.muml.allocation.ilp.impl.IlpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Integer Linear Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Linear Program</em>'.
	 * @generated
	 */
	IntegerLinearProgram createIntegerLinearProgram();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Constraint Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Expression</em>'.
	 * @generated
	 */
	ConstraintExpression createConstraintExpression();

	/**
	 * Returns a new object of class '<em>Variable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Expression</em>'.
	 * @generated
	 */
	VariableExpression createVariableExpression();

	/**
	 * Returns a new object of class '<em>Objective Function Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Function Expression</em>'.
	 * @generated
	 */
	ObjectiveFunctionExpression createObjectiveFunctionExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IlpPackage getIlpPackage();

} //IlpFactory
