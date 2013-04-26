/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.actionlanguage;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.expressions.Expression;

import de.uni_paderborn.fujaba.muml.behavior.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable Declaration Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.LocalVariableDeclarationStatement#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.LocalVariableDeclarationStatement#getAllSurroundingBlocks <em>All Surrounding Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getLocalVariableDeclarationStatement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueName='-- check if no variable with the same name was defined before\nself.allSurroundingBlocks->collect(\n\texpressions\n)->select(\n\toclIsKindOf(LocalVariableDeclarationStatement)\n)->collect(\n\toclAsType(LocalVariableDeclarationStatement)\n)->select(\n\tvariable.name = self.variable.name\n)->isUnique(variable.name)'"
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
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getLocalVariableDeclarationStatement_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.actionlanguage.LocalVariableDeclarationStatement#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>All Surrounding Blocks</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.actionlanguage.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Surrounding Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Surrounding Blocks</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.actionlanguage.ActionlanguagePackage#getLocalVariableDeclarationStatement_AllSurroundingBlocks()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='-- collect all blocks which surround this LocalVariableDeclarationStatement\nself.eContainer()->closure(c : ecore::EObject |\n\tif c.eContainer().oclIsKindOf(core::expressions::Expression) then\n\t\tc.eContainer()\n\telse\n\t\tc\n\tendif\n)->union(\n\tSet{eContainer()}\n)->select(oclIsKindOf(Block))->collect(\n\toclAsType(Block)\n)->asOrderedSet()'"
	 * @generated
	 */
	EList<Block> getAllSurroundingBlocks();

} // LocalVariableDeclarationStatement
