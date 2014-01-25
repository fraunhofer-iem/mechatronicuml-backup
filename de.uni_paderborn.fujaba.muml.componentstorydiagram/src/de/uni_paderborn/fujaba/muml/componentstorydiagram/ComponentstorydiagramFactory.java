/**
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage
 * @generated
 */
public interface ComponentstorydiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentstorydiagramFactory eINSTANCE = de.uni_paderborn.fujaba.muml.componentstorydiagram.impl.ComponentstorydiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Story Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Story Rule</em>'.
	 * @generated
	 */
	ComponentStoryRule createComponentStoryRule();

	/**
	 * Returns a new object of class '<em>Component Story Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Story Node</em>'.
	 * @generated
	 */
	ComponentStoryNode createComponentStoryNode();

	/**
	 * Returns a new object of class '<em>Controller Exchange Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Exchange Node</em>'.
	 * @generated
	 */
	ControllerExchangeNode createControllerExchangeNode();

	/**
	 * Returns a new object of class '<em>Send Reconfiguration Message Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Reconfiguration Message Expression</em>'.
	 * @generated
	 */
	SendReconfigurationMessageExpression createSendReconfigurationMessageExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentstorydiagramPackage getComponentstorydiagramPackage();

} //ComponentstorydiagramFactory
