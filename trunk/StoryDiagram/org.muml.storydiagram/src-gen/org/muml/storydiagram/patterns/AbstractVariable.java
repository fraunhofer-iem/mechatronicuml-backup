/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns;

import org.eclipse.emf.common.util.EList;
import org.muml.core.NamedElement;
import org.muml.core.expressions.Expression;
import org.muml.storydiagram.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for object and primitive variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractVariable#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractVariable#getBindingState <em>Binding State</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractVariable#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractVariable#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractVariable#getIncomingLinks <em>Incoming Links</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractVariable()
 * @model abstract="true"
 * @generated
 */
public interface AbstractVariable extends Variable, NamedElement {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.StoryPattern#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(StoryPattern)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractVariable_Pattern()
	 * @see org.muml.storydiagram.patterns.StoryPattern#getVariables
	 * @model opposite="variables" required="true" transient="false" ordered="false"
	 * @generated
	 */
	StoryPattern getPattern();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.AbstractVariable#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(StoryPattern value);

	/**
	 * Returns the value of the '<em><b>Binding State</b></em>' attribute.
	 * The default value is <code>"UNBOUND"</code>.
	 * The literals are from the enumeration {@link org.muml.storydiagram.patterns.BindingState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The binding state defines whether the variable is already bound or whether a match has to be obtained for it. The default value is "unbound".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding State</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingState
	 * @see #setBindingState(BindingState)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractVariable_BindingState()
	 * @model default="UNBOUND" required="true" ordered="false"
	 * @generated
	 */
	BindingState getBindingState();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.AbstractVariable#getBindingState <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding State</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingState
	 * @see #getBindingState()
	 * @generated
	 */
	void setBindingState(BindingState value);

	/**
	 * Returns the value of the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binding expression can be used to bind a variable in a different way than just by pattern matching. This way, for example, the return value of a call can be bound to a variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Expression</em>' containment reference.
	 * @see #setBindingExpression(Expression)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractVariable_BindingExpression()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getBindingExpression();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.AbstractVariable#getBindingExpression <em>Binding Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Expression</em>' containment reference.
	 * @see #getBindingExpression()
	 * @generated
	 */
	void setBindingExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.patterns.Constraint}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.Constraint#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All constraints which are defined for this variable. For a successful matching, all constraints for this variable must evaluate to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractVariable_Constraints()
	 * @see org.muml.storydiagram.patterns.Constraint#getObjectVariable
	 * @model opposite="objectVariable" containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link org.muml.storydiagram.patterns.AbstractLinkVariable}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractVariable_IncomingLinks()
	 * @see org.muml.storydiagram.patterns.AbstractLinkVariable#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<AbstractLinkVariable> getIncomingLinks();

} // AbstractVariable
