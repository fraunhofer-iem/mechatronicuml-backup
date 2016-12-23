/**
 */
package org.muml.storydiagram.verification.sdd.basicsdd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.storydiagram.verification.sdd.basicsdd.BasicSDDPackage
 * @generated
 */
public interface BasicSDDFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicSDDFactory eINSTANCE = org.muml.storydiagram.verification.sdd.basicsdd.impl.BasicSDDFactoryImpl.init();

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
