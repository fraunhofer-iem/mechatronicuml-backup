/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage
 * @generated
 */
public interface ActionlanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionlanguageFactory eINSTANCE = org.muml.pim.actionlanguage.impl.ActionlanguageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Loop</em>'.
	 * @generated
	 */
	WhileLoop createWhileLoop();

	/**
	 * Returns a new object of class '<em>Do While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do While Loop</em>'.
	 * @generated
	 */
	DoWhileLoop createDoWhileLoop();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Loop</em>'.
	 * @generated
	 */
	ForLoop createForLoop();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Call</em>'.
	 * @generated
	 */
	OperationCall createOperationCall();

	/**
	 * Returns a new object of class '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Statement</em>'.
	 * @generated
	 */
	ReturnStatement createReturnStatement();

	/**
	 * Returns a new object of class '<em>Trigger Message Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Message Expression</em>'.
	 * @generated
	 */
	TriggerMessageExpression createTriggerMessageExpression();

	/**
	 * Returns a new object of class '<em>Discrete Interaction Endpoint Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Interaction Endpoint Reference</em>'.
	 * @generated
	 */
	DiscreteInteractionEndpointReference createDiscreteInteractionEndpointReference();

	/**
	 * Returns a new object of class '<em>Position Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Selector</em>'.
	 * @generated
	 */
	PositionSelector createPositionSelector();

	/**
	 * Returns a new object of class '<em>Local Variable Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variable Declaration Statement</em>'.
	 * @generated
	 */
	LocalVariableDeclarationStatement createLocalVariableDeclarationStatement();

	/**
	 * Returns a new object of class '<em>Typed Named Element Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Named Element Expression</em>'.
	 * @generated
	 */
	TypedNamedElementExpression createTypedNamedElementExpression();

	/**
	 * Returns a new object of class '<em>Array Initialize Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Initialize Expression</em>'.
	 * @generated
	 */
	ArrayInitializeExpression createArrayInitializeExpression();

	/**
	 * Returns a new object of class '<em>Nondeterministic Choice Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nondeterministic Choice Expression</em>'.
	 * @generated
	 */
	NondeterministicChoiceExpression createNondeterministicChoiceExpression();

	/**
	 * Returns a new object of class '<em>Time Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Value Expression</em>'.
	 * @generated
	 */
	TimeValueExpression createTimeValueExpression();

	/**
	 * Returns a new object of class '<em>Type Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Cast Expression</em>'.
	 * @generated
	 */
	TypeCastExpression createTypeCastExpression();

	/**
	 * Returns a new object of class '<em>Array Index Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Index Expression</em>'.
	 * @generated
	 */
	ArrayIndexExpression createArrayIndexExpression();

	/**
	 * Returns a new object of class '<em>Attribute Accessor Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Accessor Expression</em>'.
	 * @generated
	 */
	AttributeAccessorExpression createAttributeAccessorExpression();

	/**
	 * Returns a new object of class '<em>Else If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else If Statement</em>'.
	 * @generated
	 */
	ElseIfStatement createElseIfStatement();

	/**
	 * Returns a new object of class '<em>Max Message Delay Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Message Delay Reference Expression</em>'.
	 * @generated
	 */
	MaxMessageDelayReferenceExpression createMaxMessageDelayReferenceExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActionlanguagePackage getActionlanguagePackage();

} //ActionlanguageFactory
