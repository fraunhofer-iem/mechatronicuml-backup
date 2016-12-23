/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.actionlanguage;

import org.eclipse.emf.common.util.EList;
import org.muml.core.expressions.Expression;
import org.muml.pim.behavior.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Enables to declare a local variable inside a Block. Local variables are declared 
 * according to the C-rule and have the scope of the block they are defined in.
 * Local variables may not have the same name as a variable that is declared in the
 * real-time statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.actionlanguage.LocalVariableDeclarationStatement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.muml.pim.actionlanguage.LocalVariableDeclarationStatement#getAllSurroundingBlocks <em>All Surrounding Blocks</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getLocalVariableDeclarationStatement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueName='-- check if no variable with the same name was defined before\r\nself.allSurroundingBlocks->collect(\r\n\texpressions\r\n)->select(\r\n\toclIsKindOf(LocalVariableDeclarationStatement)\r\n)->collect(\r\n\toclAsType(LocalVariableDeclarationStatement)\r\n)->one(\r\n\tvariable.name = self.variable.name\r\n)'"
 * @generated
 */
public interface LocalVariableDeclarationStatement extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variable that is declared and optionally initialized by this declaration 
	 * statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getLocalVariableDeclarationStatement_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.muml.pim.actionlanguage.LocalVariableDeclarationStatement#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>All Surrounding Blocks</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.actionlanguage.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Surrounding Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived feature returns all blocks that surround this local variable declaration.
	 * This is a helper feature for ensuring that the names of local variables are unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Surrounding Blocks</em>' reference list.
	 * @see org.muml.pim.actionlanguage.ActionlanguagePackage#getLocalVariableDeclarationStatement_AllSurroundingBlocks()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- collect all blocks which surround this LocalVariableDeclarationStatement\nself.oclAsType(ecore::EObject).eContainer()->closure(c : ecore::EObject |\n\tif c.eContainer().oclIsKindOf(core::expressions::Expression) then\n\t\tc.eContainer()\n\telse\n\t\tc\n\tendif\n)->union(\n\t-- by default, the closure operation does not include the source value(s) (at least\n\t-- in the \"old\" OCL case)\n\t-- (see org.eclipse.ocl.internal.evaluation.IterationTemplateClosure.evaluateResult method)\n\tSet{self.eContainer()}\n)->select(oclIsKindOf(Block))->collect(\n\toclAsType(Block)\n)->asOrderedSet()'"
	 * @generated
	 */
	EList<Block> getAllSurroundingBlocks();

} // LocalVariableDeclarationStatement
