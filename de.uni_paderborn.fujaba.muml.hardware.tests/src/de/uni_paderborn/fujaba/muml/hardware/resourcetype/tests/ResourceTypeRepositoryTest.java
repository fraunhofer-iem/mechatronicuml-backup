/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceTypeRepository;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Type Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceTypeRepositoryTest extends TestCase {

	/**
	 * The fixture for this Resource Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceTypeRepositoryTest.class);
	}

	/**
	 * Constructs a new Resource Type Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTypeRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceTypeRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeRepository getFixture() {
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
		setFixture(ResourcetypeFactory.eINSTANCE.createResourceTypeRepository());
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

} //ResourceTypeRepositoryTest
