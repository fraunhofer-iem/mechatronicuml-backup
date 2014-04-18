/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstanceFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.StorageMemoryInstance;

import junit.textui.TestRunner;

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
		setFixture(HwresourceinstanceFactory.eINSTANCE.createStorageMemoryInstance());
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
