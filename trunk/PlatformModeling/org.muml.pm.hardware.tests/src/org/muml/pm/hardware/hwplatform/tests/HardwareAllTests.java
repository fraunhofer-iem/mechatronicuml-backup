/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatform.tests;

import org.muml.pm.hardware.hwplatforminstance.tests.HwplatforminstanceTests;
import org.muml.pm.hardware.hwresource.tests.HwresourceTests;
import org.muml.pm.hardware.hwresourceinstance.tests.HwresourceinstanceTests;
import org.muml.pm.hardware.hwvaluetype.tests.HwvaluetypeTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Hardware</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareAllTests extends TestSuite {

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
		TestSuite suite = new HardwareAllTests("Hardware Tests");
		suite.addTest(HwplatformTests.suite());
		suite.addTest(HwvaluetypeTests.suite());
		suite.addTest(HwplatforminstanceTests.suite());
		suite.addTest(HwresourceTests.suite());
		suite.addTest(HwresourceinstanceTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareAllTests(String name) {
		super(name);
	}

} //HardwareAllTests
