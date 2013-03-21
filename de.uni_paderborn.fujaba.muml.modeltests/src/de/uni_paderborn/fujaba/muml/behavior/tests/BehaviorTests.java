/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.behavior.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>behavior</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorTests extends TestSuite {

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
		TestSuite suite = new BehaviorTests("behavior Tests");
		suite.addTestSuite(VariableTest.class);
		suite.addTestSuite(OperationTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(ParameterBindingTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTests(String name) {
		super(name);
	}

} //BehaviorTests
