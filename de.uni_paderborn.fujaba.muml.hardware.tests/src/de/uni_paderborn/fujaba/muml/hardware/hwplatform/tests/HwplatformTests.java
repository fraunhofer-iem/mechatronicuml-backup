/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>hwplatform</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwplatformTests extends TestSuite {

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
		TestSuite suite = new HwplatformTests("hwplatform Tests");
		suite.addTestSuite(HWPlatformConfigurationTest.class);
		suite.addTestSuite(HWPlatformTest.class);
		suite.addTestSuite(HWPlatformPartTest.class);
		suite.addTestSuite(ResourcePartTest.class);
		suite.addTestSuite(DelegationTest.class);
		suite.addTestSuite(DelegationHWPortTest.class);
		suite.addTestSuite(HWPortPartTest.class);
		suite.addTestSuite(BusConnectorTest.class);
		suite.addTestSuite(BusPartTest.class);
		suite.addTestSuite(LinkPartTest.class);
		suite.addTestSuite(BridgePartTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatformTests(String name) {
		super(name);
	}

} //HwplatformTests
