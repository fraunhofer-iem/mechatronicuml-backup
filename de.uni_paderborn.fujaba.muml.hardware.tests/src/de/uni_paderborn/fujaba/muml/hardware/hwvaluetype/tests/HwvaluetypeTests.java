/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>hwvaluetype</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwvaluetypeTests extends TestSuite {

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
		TestSuite suite = new HwvaluetypeTests("hwvaluetype Tests");
		suite.addTestSuite(DataSizeTest.class);
		suite.addTestSuite(FrequencyTest.class);
		suite.addTestSuite(DataRateTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwvaluetypeTests(String name) {
		super(name);
	}

} //HwvaluetypeTests
