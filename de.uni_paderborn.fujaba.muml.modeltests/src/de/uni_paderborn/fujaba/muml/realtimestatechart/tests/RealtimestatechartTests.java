/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>realtimestatechart</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimestatechartTests extends TestSuite {

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
		TestSuite suite = new RealtimestatechartTests("realtimestatechart Tests");
		suite.addTestSuite(ClockTest.class);
		suite.addTestSuite(RegionTest.class);
		suite.addTestSuite(StateTest.class);
		suite.addTestSuite(TransitionTest.class);
		suite.addTestSuite(ActionTest.class);
		suite.addTestSuite(SynchronizationChannelTest.class);
		suite.addTestSuite(SynchronizationTest.class);
		suite.addTestSuite(RealtimeStatechartTest.class);
		suite.addTestSuite(MessageTest.class);
		suite.addTestSuite(EntryPointTest.class);
		suite.addTestSuite(ExitPointTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartTests(String name) {
		super(name);
	}

} //RealtimestatechartTests
