/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.tests;

import de.uni_paderborn.fujaba.muml.psm.codegen.CodegenFactory;
import de.uni_paderborn.fujaba.muml.psm.codegen.GenSystem;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gen System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenSystemTest extends TestCase {

	/**
	 * The fixture for this Gen System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenSystemTest.class);
	}

	/**
	 * Constructs a new Gen System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Gen System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GenSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Gen System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenSystem getFixture() {
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
		setFixture(CodegenFactory.eINSTANCE.createGenSystem());
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

} //GenSystemTest
