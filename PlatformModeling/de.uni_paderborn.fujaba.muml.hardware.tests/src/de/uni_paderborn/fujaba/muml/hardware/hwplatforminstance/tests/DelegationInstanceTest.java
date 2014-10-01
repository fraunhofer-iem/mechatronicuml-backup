/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.DelegationInstance;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HwplatforminstanceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delegation Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelegationInstanceTest extends NetworkingHardwareInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelegationInstanceTest.class);
	}

	/**
	 * Constructs a new Delegation Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delegation Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DelegationInstance getFixture() {
		return (DelegationInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwplatforminstanceFactory.eINSTANCE.createDelegationInstance());
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

} //DelegationInstanceTest
