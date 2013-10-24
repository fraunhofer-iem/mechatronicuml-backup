/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstanceRepository;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Instance Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceInstanceRepositoryTest extends TestCase {

	/**
	 * The fixture for this Resource Instance Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceInstanceRepositoryTest.class);
	}

	/**
	 * Constructs a new Resource Instance Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceInstanceRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Instance Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceInstanceRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Instance Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceInstanceRepository getFixture() {
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
		setFixture(PlatformFactory.eINSTANCE.createResourceInstanceRepository());
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

} //ResourceInstanceRepositoryTest
