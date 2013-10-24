/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypeFactory;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.StructuredResource;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structured Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredResourceTest extends ResourceTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructuredResourceTest.class);
	}

	/**
	 * Constructs a new Structured Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structured Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructuredResource getFixture() {
		return (StructuredResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourcetypeFactory.eINSTANCE.createStructuredResource());
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

} //StructuredResourceTest
