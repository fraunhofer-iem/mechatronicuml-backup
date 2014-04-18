/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstanceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bridge Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance#getConnectedCommunicationMediaInstance() <em>Connected Communication Media Instance</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BridgeInstanceTest extends NetworkingHardwareInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BridgeInstanceTest.class);
	}

	/**
	 * Constructs a new Bridge Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgeInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bridge Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BridgeInstance getFixture() {
		return (BridgeInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwplatforminstanceFactory.eINSTANCE.createBridgeInstance());
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
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance#getConnectedCommunicationMediaInstance() <em>Connected Communication Media Instance</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.BridgeInstance#getConnectedCommunicationMediaInstance()
	 * @generated
	 */
	public void testGetConnectedCommunicationMediaInstance() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BridgeInstanceTest
