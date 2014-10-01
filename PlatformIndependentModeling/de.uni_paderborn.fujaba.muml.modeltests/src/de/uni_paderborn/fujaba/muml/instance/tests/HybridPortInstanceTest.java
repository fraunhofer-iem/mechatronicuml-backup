/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.instance.HybridPortInstance;
import de.uni_paderborn.fujaba.muml.instance.InstanceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hybrid Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HybridPortInstanceTest extends PortInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HybridPortInstanceTest.class);
	}

	/**
	 * Constructs a new Hybrid Port Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridPortInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hybrid Port Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HybridPortInstance getFixture() {
		return (HybridPortInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InstanceFactory.eINSTANCE.createHybridPortInstance());
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

} //HybridPortInstanceTest
