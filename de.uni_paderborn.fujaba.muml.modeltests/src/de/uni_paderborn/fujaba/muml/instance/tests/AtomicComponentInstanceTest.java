/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.instance.AtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.instance.InstanceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atomic Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicComponentInstanceTest extends ComponentInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtomicComponentInstanceTest.class);
	}

	/**
	 * Constructs a new Atomic Component Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicComponentInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atomic Component Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtomicComponentInstance getFixture() {
		return (AtomicComponentInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InstanceFactory.eINSTANCE.createAtomicComponentInstance());
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

} //AtomicComponentInstanceTest
