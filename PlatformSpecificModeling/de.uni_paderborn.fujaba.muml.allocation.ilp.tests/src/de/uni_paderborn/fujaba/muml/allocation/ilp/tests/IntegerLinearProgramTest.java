/**
 */
package de.uni_paderborn.fujaba.muml.allocation.ilp.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.allocation.ilp.IlpFactory;
import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer Linear Program</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerLinearProgramTest extends TestCase {

	/**
	 * The fixture for this Integer Linear Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLinearProgram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerLinearProgramTest.class);
	}

	/**
	 * Constructs a new Integer Linear Program test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLinearProgramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Integer Linear Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IntegerLinearProgram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Integer Linear Program test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLinearProgram getFixture() {
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
		setFixture(IlpFactory.eINSTANCE.createIntegerLinearProgram());
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

} //IntegerLinearProgramTest
