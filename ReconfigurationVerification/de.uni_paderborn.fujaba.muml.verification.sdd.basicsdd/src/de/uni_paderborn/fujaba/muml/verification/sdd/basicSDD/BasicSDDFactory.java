/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.BasicSDDPackage
 * @generated
 */
public interface BasicSDDFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicSDDFactory eINSTANCE = de.uni_paderborn.fujaba.muml.verification.sdd.basicSDD.impl.BasicSDDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Story Decision Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Story Decision Diagram</em>'.
	 * @generated
	 */
	StoryDecisionDiagram createStoryDecisionDiagram();

	/**
	 * Returns a new object of class '<em>Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Story Pattern Node</em>'.
	 * @generated
	 */
	StoryPatternNode createStoryPatternNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicSDDPackage getBasicSDDPackage();

} //BasicSDDFactory
