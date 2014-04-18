/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwplatform.DelegationHWPort;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delegation HW Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelegationHWPortTest extends TestCase {

	/**
	 * The fixture for this Delegation HW Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationHWPort fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelegationHWPortTest.class);
	}

	/**
	 * Constructs a new Delegation HW Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationHWPortTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Delegation HW Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DelegationHWPort fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Delegation HW Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationHWPort getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwplatformFactory.eINSTANCE.createDelegationHWPort());
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

} //DelegationHWPortTest
