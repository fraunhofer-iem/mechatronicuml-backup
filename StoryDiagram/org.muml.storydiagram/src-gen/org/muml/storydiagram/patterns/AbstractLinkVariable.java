/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns;

import org.eclipse.emf.common.util.EList;
import org.muml.mumlcore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Link Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all kinds of link variables that represent links between two objects in a story pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getSource <em>Source</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getSecondLinkConstraints <em>Second Link Constraints</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getFirstLinkConstraints <em>First Link Constraints</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractLinkVariable()
 * @model abstract="true"
 * @generated
 */
public interface AbstractLinkVariable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Binding Semantics</b></em>' attribute.
	 * The default value is <code>"MANDATORY"</code>.
	 * The literals are from the enumeration {@link org.muml.storydiagram.patterns.BindingSemantics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The binding semantics defines whether the link must be matched for a successful application of the containing story pattern, whether it must not be matched or whether it is optional, i.e., it will be bound if it can be bound but that does not affect the success of matching the story pattern. The default value is "mandatory" (i.e., it must be matched).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Semantics</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingSemantics
	 * @see #setBindingSemantics(BindingSemantics)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractLinkVariable_BindingSemantics()
	 * @model default="MANDATORY" required="true" ordered="false"
	 * @generated
	 */
	BindingSemantics getBindingSemantics();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getBindingSemantics <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Semantics</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingSemantics
	 * @see #getBindingSemantics()
	 * @generated
	 */
	void setBindingSemantics(BindingSemantics value);

	/**
	 * Returns the value of the '<em><b>Binding Operator</b></em>' attribute.
	 * The default value is <code>"CHECK_ONLY"</code>.
	 * The literals are from the enumeration {@link org.muml.storydiagram.patterns.BindingOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The binding operator defines whether this link will be matched, created or destroyed by the story pattern. The default value ist "check_only", i.e., the link will be matched.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Operator</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingOperator
	 * @see #setBindingOperator(BindingOperator)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractLinkVariable_BindingOperator()
	 * @model default="CHECK_ONLY" required="true" ordered="false"
	 * @generated
	 */
	BindingOperator getBindingOperator();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getBindingOperator <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Operator</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingOperator
	 * @see #getBindingOperator()
	 * @generated
	 */
	void setBindingOperator(BindingOperator value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.ObjectVariable#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ObjectVariable)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractLinkVariable_Source()
	 * @see org.muml.storydiagram.patterns.ObjectVariable#getOutgoingLinks
	 * @model opposite="outgoingLinks" required="true" ordered="false"
	 * @generated
	 */
	ObjectVariable getSource();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ObjectVariable value);

	/**
	 * Returns the value of the '<em><b>Second Link Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.muml.storydiagram.patterns.LinkConstraint}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.LinkConstraint#getSecondLink <em>Second Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Link Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Link Constraints</em>' reference list.
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractLinkVariable_SecondLinkConstraints()
	 * @see org.muml.storydiagram.patterns.LinkConstraint#getSecondLink
	 * @model opposite="secondLink" ordered="false"
	 * @generated
	 */
	EList<LinkConstraint> getSecondLinkConstraints();

	/**
	 * Returns the value of the '<em><b>First Link Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.muml.storydiagram.patterns.LinkConstraint}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.LinkConstraint#getFirstLink <em>First Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Link Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Link Constraints</em>' reference list.
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractLinkVariable_FirstLinkConstraints()
	 * @see org.muml.storydiagram.patterns.LinkConstraint#getFirstLink
	 * @model opposite="firstLink" ordered="false"
	 * @generated
	 */
	EList<LinkConstraint> getFirstLinkConstraints();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.StoryPattern#getLinkVariables <em>Link Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(StoryPattern)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractLinkVariable_Pattern()
	 * @see org.muml.storydiagram.patterns.StoryPattern#getLinkVariables
	 * @model opposite="linkVariables" required="true" transient="false" ordered="false"
	 * @generated
	 */
	StoryPattern getPattern();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(StoryPattern value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.AbstractVariable#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractVariable)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getAbstractLinkVariable_Target()
	 * @see org.muml.storydiagram.patterns.AbstractVariable#getIncomingLinks
	 * @model opposite="incomingLinks" required="true" ordered="false"
	 * @generated
	 */
	AbstractVariable getTarget();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractVariable value);

} // AbstractLinkVariable
