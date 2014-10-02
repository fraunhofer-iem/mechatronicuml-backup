/**
 */
package de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.ComponentsddPackage
 * @generated
 */
public interface ComponentsddFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsddFactory eINSTANCE = de.uni_paderborn.fujaba.muml.verification.sdd.componentsdd.impl.ComponentsddFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Story Decision Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Story Decision Diagram</em>'.
	 * @generated
	 */
	ComponentStoryDecisionDiagram createComponentStoryDecisionDiagram();

	/**
	 * Returns a new object of class '<em>Component Story Pattern Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Story Pattern Node</em>'.
	 * @generated
	 */
	ComponentStoryPatternNode createComponentStoryPatternNode();

	/**
	 * Returns a new object of class '<em>Evaluate Component SDD Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluate Component SDD Expression</em>'.
	 * @generated
	 */
	EvaluateComponentSDDExpression createEvaluateComponentSDDExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentsddPackage getComponentsddPackage();

} //ComponentsddFactory
