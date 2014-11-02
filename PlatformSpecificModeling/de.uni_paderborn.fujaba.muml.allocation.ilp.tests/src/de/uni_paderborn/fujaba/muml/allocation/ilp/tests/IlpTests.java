/**
 */
package de.uni_paderborn.fujaba.muml.allocation.ilp.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ilp</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class IlpTests extends TestSuite {

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
		TestSuite suite = new IlpTests("ilp Tests");
		suite.addTestSuite(VariableTest.class);
		suite.addTestSuite(ConstraintExpressionTest.class);
		suite.addTestSuite(VariableExpressionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlpTests(String name) {
		super(name);
	}

} //IlpTests
