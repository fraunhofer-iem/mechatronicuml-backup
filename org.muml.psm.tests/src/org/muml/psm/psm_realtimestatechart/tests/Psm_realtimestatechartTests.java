/**
 */
package org.muml.psm.psm_realtimestatechart.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>psm_realtimestatechart</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Psm_realtimestatechartTests extends TestSuite {

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
		TestSuite suite = new Psm_realtimestatechartTests("psm_realtimestatechart Tests");
		suite.addTestSuite(ParameterizedRealtimeStatechartTest.class);
		suite.addTestSuite(APICallTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Psm_realtimestatechartTests(String name) {
		super(name);
	}

} //Psm_realtimestatechartTests
