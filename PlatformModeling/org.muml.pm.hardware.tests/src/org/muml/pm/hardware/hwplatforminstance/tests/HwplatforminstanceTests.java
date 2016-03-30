/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatforminstance.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>hwplatforminstance</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwplatforminstanceTests extends TestSuite {

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
		TestSuite suite = new HwplatforminstanceTests("hwplatforminstance Tests");
		suite.addTestSuite(HWPlatformInstanceTest.class);
		suite.addTestSuite(HWPlatformInstanceConfigurationTest.class);
		suite.addTestSuite(HWPortInstanceTest.class);
		suite.addTestSuite(BusInstanceTest.class);
		suite.addTestSuite(NetworkBridgeInstanceTest.class);
		suite.addTestSuite(DelegationHWPortInstanceTest.class);
		suite.addTestSuite(NetworkConnectorInstanceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwplatforminstanceTests(String name) {
		super(name);
	}

} //HwplatforminstanceTests
