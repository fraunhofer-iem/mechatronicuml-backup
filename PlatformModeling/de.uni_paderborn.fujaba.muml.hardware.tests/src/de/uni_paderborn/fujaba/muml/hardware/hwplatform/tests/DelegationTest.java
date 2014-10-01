/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.Delegation;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.connector.Connector#isSelfConnector() <em>Self Connector</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DelegationTest extends NetworkingHardwarePartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelegationTest.class);
	}

	/**
	 * Constructs a new Delegation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delegation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Delegation getFixture() {
		return (Delegation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwplatformFactory.eINSTANCE.createDelegation());
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
	 * Tests the '{@link de.uni_paderborn.fujaba.muml.connector.Connector#isSelfConnector() <em>Self Connector</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_paderborn.fujaba.muml.connector.Connector#isSelfConnector()
	 * @generated
	 */
	public void testIsSelfConnector() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DelegationTest
