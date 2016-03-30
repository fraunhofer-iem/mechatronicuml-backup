/**
 */
package org.muml.psm.portapimapping.tests;

import org.muml.psm.portapimapping.PortApiMapping;
import org.muml.psm.portapimapping.PortapimappingFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Port Api Mapping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortApiMappingTest extends TestCase {

	/**
	 * The fixture for this Port Api Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortApiMapping fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PortApiMappingTest.class);
	}

	/**
	 * Constructs a new Port Api Mapping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortApiMappingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Port Api Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PortApiMapping fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Port Api Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortApiMapping getFixture() {
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
		setFixture(PortapimappingFactory.eINSTANCE.createPortApiMapping());
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

} //PortApiMappingTest
