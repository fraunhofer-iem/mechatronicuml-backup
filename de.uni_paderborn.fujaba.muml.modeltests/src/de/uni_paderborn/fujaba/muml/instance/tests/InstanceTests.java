/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>instance</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstanceTests extends TestSuite {

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
		TestSuite suite = new InstanceTests("instance Tests");
		suite.addTestSuite(AssemblyConnectorInstanceTest.class);
		suite.addTestSuite(DelegationConnectorInstanceTest.class);
		suite.addTestSuite(ComponentInstanceConfigurationTest.class);
		suite.addTestSuite(ContinuousPortInstanceTest.class);
		suite.addTestSuite(HybridPortInstanceTest.class);
		suite.addTestSuite(DiscreteSinglePortInstanceTest.class);
		suite.addTestSuite(DiscreteMultiPortInstanceTest.class);
		suite.addTestSuite(CoordinationProtocolInstanceTest.class);
		suite.addTestSuite(StructuredComponentInstanceTest.class);
		suite.addTestSuite(AtomicComponentInstanceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceTests(String name) {
		super(name);
	}

} //InstanceTests
