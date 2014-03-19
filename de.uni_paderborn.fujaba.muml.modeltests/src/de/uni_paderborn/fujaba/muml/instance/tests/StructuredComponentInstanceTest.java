/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.instance.InstanceFactory;
import de.uni_paderborn.fujaba.muml.instance.StructuredComponentInstance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structured Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredComponentInstanceTest extends ComponentInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructuredComponentInstanceTest.class);
	}

	/**
	 * Constructs a new Structured Component Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredComponentInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structured Component Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructuredComponentInstance getFixture() {
		return (StructuredComponentInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InstanceFactory.eINSTANCE.createStructuredComponentInstance());
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

} //StructuredComponentInstanceTest
