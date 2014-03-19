/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.StorageMemoryInstance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Storage Memory Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StorageMemoryInstanceTest extends MemoryResourceInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StorageMemoryInstanceTest.class);
	}

	/**
	 * Constructs a new Storage Memory Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageMemoryInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Storage Memory Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StorageMemoryInstance getFixture() {
		return (StorageMemoryInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatformFactory.eINSTANCE.createStorageMemoryInstance());
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

} //StorageMemoryInstanceTest
