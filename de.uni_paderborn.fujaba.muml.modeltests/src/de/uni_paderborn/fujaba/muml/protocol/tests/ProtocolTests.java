/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.protocol.tests;

import de.uni_paderborn.fujaba.muml.connector.tests.MessageBufferTest;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>protocol</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolTests extends TestSuite {

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
		TestSuite suite = new ProtocolTests("protocol Tests");
		suite.addTestSuite(RoleConnectorTest.class);
		suite.addTestSuite(CoordinationProtocolTest.class);
		suite.addTestSuite(RoleTest.class);
		suite.addTestSuite(MessageBufferTest.class);
		suite.addTestSuite(ConnectorQualityOfServiceAssumptionsTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTests(String name) {
		super(name);
	}

} //ProtocolTests
