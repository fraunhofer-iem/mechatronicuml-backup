/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatform.tests;

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
		suite.addTestSuite(HWPlatformTest.class);
		suite.addTestSuite(HWPlatformPartTest.class);
		suite.addTestSuite(ResourcePartTest.class);
		suite.addTestSuite(DelegationHWPortTest.class);
		suite.addTestSuite(HWPortPartTest.class);
		suite.addTestSuite(BusTest.class);
		suite.addTestSuite(NetworkBridgeTest.class);
		suite.addTestSuite(NetworkConnectorTest.class);
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
