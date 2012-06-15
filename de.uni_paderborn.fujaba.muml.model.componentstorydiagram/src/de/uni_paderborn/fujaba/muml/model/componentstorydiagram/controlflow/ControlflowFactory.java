/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage
 * @generated
 */
public interface ControlflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlflowFactory eINSTANCE = de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.impl.ControlflowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Story Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Story Diagram</em>'.
	 * @generated
	 */
	ComponentStoryDiagram createComponentStoryDiagram();

	/**
	 * Returns a new object of class '<em>Component Story Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Story Node</em>'.
	 * @generated
	 */
	ComponentStoryNode createComponentStoryNode();

	/**
	 * Returns a new object of class '<em>Component Stop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Stop Node</em>'.
	 * @generated
	 */
	ComponentStopNode createComponentStopNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ControlflowPackage getControlflowPackage();

} //ControlflowFactory
