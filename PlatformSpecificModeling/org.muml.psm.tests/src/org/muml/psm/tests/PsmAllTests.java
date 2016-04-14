/**
 */
package org.muml.psm.tests;

import org.muml.psm.codegen.tests.CodegenTests;
import org.muml.psm.properties.tests.PropertiesTests;
import org.muml.psm.psm_instance.tests.Psm_instanceTests;
import org.muml.psm.psm_realtimestatechart.tests.Psm_realtimestatechartTests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Psm</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsmAllTests extends TestSuite {

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
		TestSuite suite = new PsmAllTests("Psm Tests");
		suite.addTest(PropertiesTests.suite());
		suite.addTest(Psm_realtimestatechartTests.suite());
		suite.addTest(Psm_instanceTests.suite());
		suite.addTest(CodegenTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmAllTests(String name) {
		super(name);
	}

} //PsmAllTests
