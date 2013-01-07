/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.ComponentstorypatternPackage
 * @generated
 */
public interface ComponentstorypatternFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentstorypatternFactory eINSTANCE = de.uni_paderborn.fujaba.muml.model.componentstorydiagram.componentstorypattern.impl.ComponentstorypatternFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Story Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Story Pattern</em>'.
	 * @generated
	 */
	ComponentStoryPattern createComponentStoryPattern();

	/**
	 * Returns a new object of class '<em>Component Story Pattern Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Story Pattern Variable</em>'.
	 * @generated
	 */
	ComponentStoryPatternVariable createComponentStoryPatternVariable();

	/**
	 * Returns a new object of class '<em>Component Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Variable</em>'.
	 * @generated
	 */
	ComponentVariable createComponentVariable();

	/**
	 * Returns a new object of class '<em>Part Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Variable</em>'.
	 * @generated
	 */
	PartVariable createPartVariable();

	/**
	 * Returns a new object of class '<em>Assembly Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Variable</em>'.
	 * @generated
	 */
	AssemblyVariable createAssemblyVariable();

	/**
	 * Returns a new object of class '<em>Delegation Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation Variable</em>'.
	 * @generated
	 */
	DelegationVariable createDelegationVariable();

	/**
	 * Returns a new object of class '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call</em>'.
	 * @generated
	 */
	Call createCall();

	/**
	 * Returns a new object of class '<em>Fading Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fading Function</em>'.
	 * @generated
	 */
	FadingFunction createFadingFunction();

	/**
	 * Returns a new object of class '<em>Single Port Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Port Variable</em>'.
	 * @generated
	 */
	SinglePortVariable createSinglePortVariable();

	/**
	 * Returns a new object of class '<em>Multi Port Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Port Variable</em>'.
	 * @generated
	 */
	MultiPortVariable createMultiPortVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentstorypatternPackage getComponentstorypatternPackage();

} //ComponentstorypatternFactory
