/**
 */
package org.muml.reconfiguration.verification.sdd.componentsdd;

import org.muml.reconfiguration.componentstorypattern.ComponentStoryPattern;
import org.muml.storydiagram.verification.sdd.PatternNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Story Pattern Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.verification.sdd.componentsdd.ComponentStoryPatternNode#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.verification.sdd.componentsdd.ComponentsddPackage#getComponentStoryPatternNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noNegativeVariables noVariableModifications'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noNegativeVariables='let\r\n\tpartVariables : OrderedSet(componentstorypattern::PartVariable) = pattern.thisVariable.partVariables,\r\n\tconnectorVariables : OrderedSet(componentstorypattern::ConnectorVariable) = pattern.thisVariable.connectorVariables,\r\n\tportVariable : OrderedSet(componentstorypattern::ComponentStoryPatternVariable) = partVariables->collect(portVariables)->asOrderedSet()\r\nin\r\n\tportVariable->union(partVariables)->union(connectorVariables)->forAll(cV | cV.bindingSemantics = storydiagram::patterns::BindingSemantics::MANDATORY)' noVariableModifications='let\r\n\tpartVariables : OrderedSet(componentstorypattern::PartVariable) = pattern.thisVariable.partVariables,\r\n\tconnectorVariables : OrderedSet(componentstorypattern::ConnectorVariable) = pattern.thisVariable.connectorVariables,\r\n\tportVariable : OrderedSet(componentstorypattern::ComponentStoryPatternVariable) = partVariables->collect(portVariables)->asOrderedSet()\r\nin\r\n\tportVariable->union(partVariables)->union(connectorVariables)->forAll(cV | cV.bindingOperator = storydiagram::patterns::BindingOperator::CHECK_ONLY)'"
 * @generated
 */
public interface ComponentStoryPatternNode extends PatternNode {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(ComponentStoryPattern)
	 * @see org.muml.reconfiguration.verification.sdd.componentsdd.ComponentsddPackage#getComponentStoryPatternNode_Pattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentStoryPattern getPattern();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.verification.sdd.componentsdd.ComponentStoryPatternNode#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(ComponentStoryPattern value);

} // ComponentStoryPatternNode
