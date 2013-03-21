/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.deployment.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.deployment.DeploymentFactory;
import de.uni_paderborn.fujaba.muml.deployment.HardwareNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareNodeTest extends TestCase {

	/**
	 * The fixture for this Hardware Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareNode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HardwareNodeTest.class);
	}

	/**
	 * Constructs a new Hardware Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareNodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Hardware Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HardwareNode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Hardware Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareNode getFixture() {
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
		setFixture(DeploymentFactory.eINSTANCE.createHardwareNode());
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

} //HardwareNodeTest
