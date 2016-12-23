/**
 */
package org.muml.psm.psm_instance.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>psm_instance</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Psm_instanceTests extends TestSuite {

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
		TestSuite suite = new Psm_instanceTests("psm_instance Tests");
		suite.addTestSuite(ParameterisableDiscreteSinglePortInstanceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psm_instanceTests(String name) {
		super(name);
	}

} //Psm_instanceTests
