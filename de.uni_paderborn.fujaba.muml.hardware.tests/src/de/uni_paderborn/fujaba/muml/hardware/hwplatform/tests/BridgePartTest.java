/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bridge Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart#getConnectedCommunicationMediaPart() <em>Connected Communication Media Part</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BridgePartTest extends NetworkingHardwarePartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BridgePartTest.class);
	}

	/**
	 * Constructs a new Bridge Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgePartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bridge Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BridgePart getFixture() {
		return (BridgePart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwplatformFactory.eINSTANCE.createBridgePart());
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
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart#getConnectedCommunicationMediaPart() <em>Connected Communication Media Part</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.BridgePart#getConnectedCommunicationMediaPart()
	 * @generated
	 */
	public void testGetConnectedCommunicationMediaPart() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BridgePartTest
