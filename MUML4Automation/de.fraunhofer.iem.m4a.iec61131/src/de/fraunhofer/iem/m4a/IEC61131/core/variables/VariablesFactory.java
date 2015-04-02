/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.variables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.VariablesPackage
 * @generated
 */
public interface VariablesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariablesFactory eINSTANCE = de.fraunhofer.iem.m4a.IEC61131.core.variables.impl.VariablesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Direct Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Variable</em>'.
	 * @generated
	 */
	DirectVariable createDirectVariable();

	/**
	 * Returns a new object of class '<em>Named Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Variable</em>'.
	 * @generated
	 */
	NamedVariable createNamedVariable();

	/**
	 * Returns a new object of class '<em>Structured Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Variable</em>'.
	 * @generated
	 */
	StructuredVariable createStructuredVariable();

	/**
	 * Returns a new object of class '<em>Array Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Variable</em>'.
	 * @generated
	 */
	ArrayVariable createArrayVariable();

	/**
	 * Returns a new object of class '<em>Field Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Selector</em>'.
	 * @generated
	 */
	FieldSelector createFieldSelector();

	/**
	 * Returns a new object of class '<em>Global Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Var</em>'.
	 * @generated
	 */
	GlobalVar createGlobalVar();

	/**
	 * Returns a new object of class '<em>FB Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FB Name</em>'.
	 * @generated
	 */
	FBName createFBName();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VariablesPackage getVariablesPackage();

} //VariablesFactory
