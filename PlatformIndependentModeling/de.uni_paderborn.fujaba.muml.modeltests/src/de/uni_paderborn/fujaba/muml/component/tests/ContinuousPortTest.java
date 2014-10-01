/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.component.ContinuousPort;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Continuous Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContinuousPortTest extends DirectedTypedPortTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContinuousPortTest.class);
	}

	/**
	 * Constructs a new Continuous Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousPortTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Continuous Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContinuousPort getFixture() {
		return (ContinuousPort)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentFactory.eINSTANCE.createContinuousPort());
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

} //ContinuousPortTest
