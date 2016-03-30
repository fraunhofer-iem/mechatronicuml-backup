/**
 */
package org.muml.psm.apiexpressions.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>apiexpressions</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApiexpressionsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ApiexpressionsTests("apiexpressions Tests");
		suite.addTestSuite(APICallExpressionTest.class);
		suite.addTestSuite(EnumerationValueExpressionTest.class);
		suite.addTestSuite(ContinuousPortExpressionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiexpressionsTests(String name) {
		super(name);
	}

} //ApiexpressionsTests
