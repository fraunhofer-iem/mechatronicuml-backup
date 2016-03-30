/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatform.tests;

import org.muml.pm.hardware.hwplatform.HwplatformFactory;
import org.muml.pm.hardware.hwplatform.NetworkBridge;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.muml.pm.hardware.hwplatform.NetworkBridge#getConnectedNetworkConnector() <em>Connected Network Connector</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NetworkBridgeTest extends NetworkingHardwareTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkBridgeTest.class);
	}

	/**
	 * Constructs a new Network Bridge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkBridgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Network Bridge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NetworkBridge getFixture() {
		return (NetworkBridge)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwplatformFactory.eINSTANCE.createNetworkBridge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.muml.pm.hardware.hwplatform.NetworkBridge#getConnectedNetworkConnector() <em>Connected Network Connector</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.pm.hardware.hwplatform.NetworkBridge#getConnectedNetworkConnector()
	 * @generated
	 */
	public void testGetConnectedNetworkConnector() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //NetworkBridgeTest
