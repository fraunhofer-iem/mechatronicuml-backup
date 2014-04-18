/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.tests;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.Cache;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CacheTest extends MemoryResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CacheTest.class);
	}

	/**
	 * Constructs a new Cache test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cache test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cache getFixture() {
		return (Cache)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HwresourceFactory.eINSTANCE.createCache());
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

} //CacheTest
