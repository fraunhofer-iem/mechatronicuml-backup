/**
 */
package org.muml.psm.codegen.tests;

import org.muml.psm.codegen.CodegenFactory;
import org.muml.psm.codegen.GenECU;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gen ECU</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenECUTest extends TestCase {

	/**
	 * The fixture for this Gen ECU test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenECU fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenECUTest.class);
	}

	/**
	 * Constructs a new Gen ECU test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenECUTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Gen ECU test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GenECU fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Gen ECU test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenECU getFixture() {
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
		setFixture(CodegenFactory.eINSTANCE.createGenECU());
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

} //GenECUTest
