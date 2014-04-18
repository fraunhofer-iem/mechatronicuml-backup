/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstanceFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StructuredResourceInstance;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structured Resource Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredResourceInstanceTest extends ResourceInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructuredResourceInstanceTest.class);
	}

	/**
	 * Constructs a new Structured Resource Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structured Resource Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructuredResourceInstance getFixture() {
		return (StructuredResourceInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwresourceinstanceFactory.eINSTANCE.createStructuredResourceInstance());
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

} //StructuredResourceInstanceTest
