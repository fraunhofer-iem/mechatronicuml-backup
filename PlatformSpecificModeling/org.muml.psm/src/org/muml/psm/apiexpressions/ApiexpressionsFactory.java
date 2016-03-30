/**
 */
package org.muml.psm.apiexpressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.psm.apiexpressions.ApiexpressionsPackage
 * @generated
 */
public interface ApiexpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApiexpressionsFactory eINSTANCE = org.muml.psm.apiexpressions.impl.ApiexpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>API Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Call Expression</em>'.
	 * @generated
	 */
	APICallExpression createAPICallExpression();

	/**
	 * Returns a new object of class '<em>Enumeration Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Value Expression</em>'.
	 * @generated
	 */
	EnumerationValueExpression createEnumerationValueExpression();

	/**
	 * Returns a new object of class '<em>Continuous Port Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuous Port Expression</em>'.
	 * @generated
	 */
	ContinuousPortExpression createContinuousPortExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApiexpressionsPackage getApiexpressionsPackage();

} //ApiexpressionsFactory
