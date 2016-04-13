/**
 */
package org.muml.core.tests;

import org.muml.core.modelinstance.tests.ModelinstanceTests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Core</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreAllTests extends TestSuite {

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
		TestSuite suite = new CoreAllTests("Core Tests");
		suite.addTest(CoreTests.suite());
		suite.addTest(ModelinstanceTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAllTests(String name) {
		super(name);
	}

} //CoreAllTests
