/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.actionLanguage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.ExtendableElement;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Assignment;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Block;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.DiscreteInteractionEndpointReference;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.DoWhileLoop;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.ForLoop;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.IfStatement;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.LocalVariableDeclarationStatement;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.Loop;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.OperationCall;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.PositionSelector;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.ReturnStatement;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.TriggerMessageExpression;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.TypedNamedElementExpression;
import de.uni_paderborn.fujaba.muml.model.actionLanguage.WhileLoop;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.model.actionLanguage.ActionLanguagePackage
 * @generated
 */
public class ActionLanguageSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionLanguagePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLanguageSwitch() {
		if (modelPackage == null) {
			modelPackage = ActionLanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ActionLanguagePackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseExpression(block);
				if (result == null) result = caseCommentableElement(block);
				if (result == null) result = caseExtendableElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseBlock(loop);
				if (result == null) result = caseExpression(loop);
				if (result == null) result = caseCommentableElement(loop);
				if (result == null) result = caseExtendableElement(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.WHILE_LOOP: {
				WhileLoop whileLoop = (WhileLoop)theEObject;
				T result = caseWhileLoop(whileLoop);
				if (result == null) result = caseLoop(whileLoop);
				if (result == null) result = caseBlock(whileLoop);
				if (result == null) result = caseExpression(whileLoop);
				if (result == null) result = caseCommentableElement(whileLoop);
				if (result == null) result = caseExtendableElement(whileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.DO_WHILE_LOOP: {
				DoWhileLoop doWhileLoop = (DoWhileLoop)theEObject;
				T result = caseDoWhileLoop(doWhileLoop);
				if (result == null) result = caseLoop(doWhileLoop);
				if (result == null) result = caseBlock(doWhileLoop);
				if (result == null) result = caseExpression(doWhileLoop);
				if (result == null) result = caseCommentableElement(doWhileLoop);
				if (result == null) result = caseExtendableElement(doWhileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseExpression(assignment);
				if (result == null) result = caseCommentableElement(assignment);
				if (result == null) result = caseExtendableElement(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.FOR_LOOP: {
				ForLoop forLoop = (ForLoop)theEObject;
				T result = caseForLoop(forLoop);
				if (result == null) result = caseLoop(forLoop);
				if (result == null) result = caseBlock(forLoop);
				if (result == null) result = caseExpression(forLoop);
				if (result == null) result = caseCommentableElement(forLoop);
				if (result == null) result = caseExtendableElement(forLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseExpression(ifStatement);
				if (result == null) result = caseCommentableElement(ifStatement);
				if (result == null) result = caseExtendableElement(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.OPERATION_CALL: {
				OperationCall operationCall = (OperationCall)theEObject;
				T result = caseOperationCall(operationCall);
				if (result == null) result = caseExpression(operationCall);
				if (result == null) result = caseCommentableElement(operationCall);
				if (result == null) result = caseExtendableElement(operationCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.RETURN_STATEMENT: {
				ReturnStatement returnStatement = (ReturnStatement)theEObject;
				T result = caseReturnStatement(returnStatement);
				if (result == null) result = caseExpression(returnStatement);
				if (result == null) result = caseCommentableElement(returnStatement);
				if (result == null) result = caseExtendableElement(returnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.TRIGGER_MESSAGE_EXPRESSION: {
				TriggerMessageExpression triggerMessageExpression = (TriggerMessageExpression)theEObject;
				T result = caseTriggerMessageExpression(triggerMessageExpression);
				if (result == null) result = caseExpression(triggerMessageExpression);
				if (result == null) result = caseCommentableElement(triggerMessageExpression);
				if (result == null) result = caseExtendableElement(triggerMessageExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.DISCRETE_INTERACTION_ENDPOINT_REFERENCE: {
				DiscreteInteractionEndpointReference discreteInteractionEndpointReference = (DiscreteInteractionEndpointReference)theEObject;
				T result = caseDiscreteInteractionEndpointReference(discreteInteractionEndpointReference);
				if (result == null) result = caseExpression(discreteInteractionEndpointReference);
				if (result == null) result = caseCommentableElement(discreteInteractionEndpointReference);
				if (result == null) result = caseExtendableElement(discreteInteractionEndpointReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.POSITION_SELECTOR: {
				PositionSelector positionSelector = (PositionSelector)theEObject;
				T result = casePositionSelector(positionSelector);
				if (result == null) result = caseExpression(positionSelector);
				if (result == null) result = caseCommentableElement(positionSelector);
				if (result == null) result = caseExtendableElement(positionSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.LOCAL_VARIABLE_DECLARATION_STATEMENT: {
				LocalVariableDeclarationStatement localVariableDeclarationStatement = (LocalVariableDeclarationStatement)theEObject;
				T result = caseLocalVariableDeclarationStatement(localVariableDeclarationStatement);
				if (result == null) result = caseExpression(localVariableDeclarationStatement);
				if (result == null) result = caseCommentableElement(localVariableDeclarationStatement);
				if (result == null) result = caseExtendableElement(localVariableDeclarationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionLanguagePackage.TYPED_NAMED_ELEMENT_EXPRESSION: {
				TypedNamedElementExpression typedNamedElementExpression = (TypedNamedElementExpression)theEObject;
				T result = caseTypedNamedElementExpression(typedNamedElementExpression);
				if (result == null) result = caseExpression(typedNamedElementExpression);
				if (result == null) result = caseCommentableElement(typedNamedElementExpression);
				if (result == null) result = caseExtendableElement(typedNamedElementExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileLoop(WhileLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoWhileLoop(DoWhileLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoop(ForLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCall(OperationCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnStatement(ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Message Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Message Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerMessageExpression(TriggerMessageExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Interaction Endpoint Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteInteractionEndpointReference(DiscreteInteractionEndpointReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionSelector(PositionSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Variable Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Variable Declaration Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVariableDeclarationStatement(LocalVariableDeclarationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Named Element Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Named Element Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedNamedElementExpression(TypedNamedElementExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendableElement(ExtendableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ActionLanguageSwitch
