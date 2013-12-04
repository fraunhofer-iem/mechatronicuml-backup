/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>component</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentTests extends TestSuite {

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
		TestSuite suite = new ComponentTests("component Tests");
		suite.addTestSuite(ContinuousPortTest.class);
		suite.addTestSuite(DiscretePortTest.class);
		suite.addTestSuite(ComponentPartTest.class);
		suite.addTestSuite(StaticStructuredComponentTest.class);
		suite.addTestSuite(AssemblyConnectorTest.class);
		suite.addTestSuite(DelegationConnectorTest.class);
		suite.addTestSuite(HybridPortTest.class);
		suite.addTestSuite(CoordinationProtocolPartTest.class);
		suite.addTestSuite(PortPartTest.class);
		suite.addTestSuite(StaticAtomicComponentTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTests(String name) {
		super(name);
	}

} //ComponentTests
