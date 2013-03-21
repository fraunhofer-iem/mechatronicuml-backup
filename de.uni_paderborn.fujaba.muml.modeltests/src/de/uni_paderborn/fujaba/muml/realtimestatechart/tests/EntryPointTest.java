/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.realtimestatechart.EntryPoint;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryPointTest extends StateConnectionPointTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntryPointTest.class);
	}

	/**
	 * Constructs a new Entry Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entry Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntryPoint getFixture() {
		return (EntryPoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RealtimestatechartFactory.eINSTANCE.createEntryPoint());
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

} //EntryPointTest
