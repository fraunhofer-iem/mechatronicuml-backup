/**
 */
package de.uni_paderborn.fujaba.muml.psm.tests;

import de.uni_paderborn.fujaba.muml.psm.allocation.tests.AllocationTests;

import de.uni_paderborn.fujaba.muml.psm.apiexpressions.tests.ApiexpressionsTests;

import de.uni_paderborn.fujaba.muml.psm.codegen.tests.CodegenTests;

import de.uni_paderborn.fujaba.muml.psm.portapimapping.tests.PortapimappingTests;

import de.uni_paderborn.fujaba.muml.psm.properties.tests.PropertiesTests;

import de.uni_paderborn.fujaba.muml.psm.psm_instance.tests.Psm_instanceTests;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.tests.RealtimestatechartparameterTests;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.tests.RealtimestatechartparameterbindingTests;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.tests.Psm_realtimestatechartTests;

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
		suite.addTest(AllocationTests.suite());
		suite.addTest(PropertiesTests.suite());
		suite.addTest(Psm_realtimestatechartTests.suite());
		suite.addTest(RealtimestatechartparameterTests.suite());
		suite.addTest(RealtimestatechartparameterbindingTests.suite());
		suite.addTest(Psm_instanceTests.suite());
		suite.addTest(PortapimappingTests.suite());
		suite.addTest(ApiexpressionsTests.suite());
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
