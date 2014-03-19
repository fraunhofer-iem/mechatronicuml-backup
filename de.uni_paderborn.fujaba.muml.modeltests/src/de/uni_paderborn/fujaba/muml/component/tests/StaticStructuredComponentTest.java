/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.tests;

import junit.textui.TestRunner;
import de.uni_paderborn.fujaba.muml.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.component.StaticStructuredComponent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Static Structured Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticStructuredComponentTest extends StructuredComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StaticStructuredComponentTest.class);
	}

	/**
	 * Constructs a new Static Structured Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticStructuredComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Static Structured Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StaticStructuredComponent getFixture() {
		return (StaticStructuredComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComponentFactory.eINSTANCE.createStaticStructuredComponent());
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

} //StaticStructuredComponentTest
