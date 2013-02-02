/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.deployment.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>deployment</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentTests extends TestSuite {

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
		TestSuite suite = new DeploymentTests("deployment Tests");
		suite.addTestSuite(DeploymentTest.class);
		suite.addTestSuite(HardwareNodeTest.class);
		suite.addTestSuite(HardwarePortTest.class);
		suite.addTestSuite(CommunicationLinkTest.class);
		suite.addTestSuite(LinkQualityOfServiceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentTests(String name) {
		super(name);
	}

} //DeploymentTests
