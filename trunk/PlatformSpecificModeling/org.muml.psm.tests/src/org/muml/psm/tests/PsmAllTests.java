/**
 */
package org.muml.psm.tests;

import org.muml.psm.portapimapping.tests.PortapimappingTests;
import org.muml.psm.properties.tests.PropertiesTests;
import org.muml.psm.psm_instance.tests.Psm_instanceTests;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameter.tests.RealtimestatechartparameterTests;
import org.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.tests.RealtimestatechartparameterbindingTests;
import org.muml.psm.psm_realtimestatechart.tests.Psm_realtimestatechartTests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import org.muml.psm.allocation.tests.AllocationTests;
import org.muml.psm.apiexpressions.tests.ApiexpressionsTests;

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
		suite.addTest(AllocationTests.suite());
		suite.addTest(PropertiesTests.suite());
		suite.addTest(Psm_realtimestatechartTests.suite());
		suite.addTest(RealtimestatechartparameterTests.suite());
		suite.addTest(RealtimestatechartparameterbindingTests.suite());
		suite.addTest(Psm_instanceTests.suite());
		suite.addTest(PortapimappingTests.suite());
		suite.addTest(ApiexpressionsTests.suite());
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
