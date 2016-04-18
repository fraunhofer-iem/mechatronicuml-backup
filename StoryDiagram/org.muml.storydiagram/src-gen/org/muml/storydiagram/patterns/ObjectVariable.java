/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.patterns;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ObjectVariable holds a value of a complex type which is defined by an EClass. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.patterns.ObjectVariable#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.ObjectVariable#getLinkOrderConstraints <em>Link Order Constraints</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link org.muml.storydiagram.patterns.ObjectVariable#getAttributeAssignments <em>Attribute Assignments</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.patterns.PatternsPackage#getObjectVariable()
 * @model
 * @generated
 */
public interface ObjectVariable extends AbstractVariable {
	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link org.muml.storydiagram.patterns.AbstractLinkVariable}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.AbstractLinkVariable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getObjectVariable_OutgoingLinks()
	 * @see org.muml.storydiagram.patterns.AbstractLinkVariable#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<AbstractLinkVariable> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Link Order Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.patterns.LinkConstraint}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.LinkConstraint#getReferencingObject <em>Referencing Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Order Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Order Constraints</em>' containment reference list.
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getObjectVariable_LinkOrderConstraints()
	 * @see org.muml.storydiagram.patterns.LinkConstraint#getReferencingObject
	 * @model opposite="referencingObject" containment="true"
	 * @generated
	 */
	EList<LinkConstraint> getLinkOrderConstraints();

	/**
	 * Returns the value of the '<em><b>Binding Semantics</b></em>' attribute.
	 * The default value is <code>"MANDATORY"</code>.
	 * The literals are from the enumeration {@link org.muml.storydiagram.patterns.BindingSemantics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The binding semantics defines whether the object must be matched for a successful application of the containing story pattern, whether it must not be matched or whether it is optional, i.e., it will be bound if it can be bound but that does not affect the success of matching the story pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Semantics</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingSemantics
	 * @see #setBindingSemantics(BindingSemantics)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getObjectVariable_BindingSemantics()
	 * @model default="MANDATORY" required="true" ordered="false"
	 * @generated
	 */
	BindingSemantics getBindingSemantics();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}' attribute.
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
	 * The binding operator defines whether this object will be matched, created or destroyed by the story pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Operator</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingOperator
	 * @see #setBindingOperator(BindingOperator)
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getObjectVariable_BindingOperator()
	 * @model default="CHECK_ONLY" required="true" ordered="false"
	 * @generated
	 */
	BindingOperator getBindingOperator();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Operator</em>' attribute.
	 * @see org.muml.storydiagram.patterns.BindingOperator
	 * @see #getBindingOperator()
	 * @generated
	 */
	void setBindingOperator(BindingOperator value);

	/**
	 * Returns the value of the '<em><b>Attribute Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.patterns.AttributeAssignment}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.patterns.AttributeAssignment#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Assignments</em>' containment reference list.
	 * @see org.muml.storydiagram.patterns.PatternsPackage#getObjectVariable_AttributeAssignments()
	 * @see org.muml.storydiagram.patterns.AttributeAssignment#getObjectVariable
	 * @model opposite="objectVariable" containment="true"
	 * @generated
	 */
	EList<AttributeAssignment> getAttributeAssignments();

} // ObjectVariable
