/**
 * Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany and Software Engineering, Project Group Mechatronic Systems Design, Fraunhofer Institute for Production Technology IPT, Germany
 */
package org.muml.pm.hardware.hwplatforminstance.tests;

import org.muml.pm.hardware.hwplatforminstance.DelegationHWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstanceFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delegation HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelegationHWPortInstanceTest extends TestCase {

	/**
	 * The fixture for this Delegation HW Port Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationHWPortInstance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelegationHWPortInstanceTest.class);
	}

	/**
	 * Constructs a new Delegation HW Port Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationHWPortInstanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Delegation HW Port Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DelegationHWPortInstance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Delegation HW Port Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationHWPortInstance getFixture() {
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
		setFixture(HwplatforminstanceFactory.eINSTANCE.createDelegationHWPortInstance());
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

} //DelegationHWPortInstanceTest
