/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.templates;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.core.ExtendableElement;
import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.templates.PropertyBinding#getBoundProperty <em>Bound Property</em>}</li>
 *   <li>{@link org.muml.storydiagram.templates.PropertyBinding#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.muml.storydiagram.templates.PropertyBinding#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.templates.TemplatesPackage#getPropertyBinding()
 * @model
 * @generated
 */
public interface PropertyBinding extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Bound Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Property</em>' reference.
	 * @see #setBoundProperty(EStructuralFeature)
	 * @see org.muml.storydiagram.templates.TemplatesPackage#getPropertyBinding_BoundProperty()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EStructuralFeature getBoundProperty();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.templates.PropertyBinding#getBoundProperty <em>Bound Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Property</em>' reference.
	 * @see #getBoundProperty()
	 * @generated
	 */
	void setBoundProperty(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Expression</em>' containment reference.
	 * @see #setBindingExpression(Expression)
	 * @see org.muml.storydiagram.templates.TemplatesPackage#getPropertyBinding_BindingExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getBindingExpression();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.templates.PropertyBinding#getBindingExpression <em>Binding Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Expression</em>' containment reference.
	 * @see #getBindingExpression()
	 * @generated
	 */
	void setBindingExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.templates.TemplateBinding#getPropertyBinding <em>Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Binding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Binding</em>' container reference.
	 * @see #setTemplateBinding(TemplateBinding)
	 * @see org.muml.storydiagram.templates.TemplatesPackage#getPropertyBinding_TemplateBinding()
	 * @see org.muml.storydiagram.templates.TemplateBinding#getPropertyBinding
	 * @model opposite="propertyBinding" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateBinding getTemplateBinding();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.templates.PropertyBinding#getTemplateBinding <em>Template Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Binding</em>' container reference.
	 * @see #getTemplateBinding()
	 * @generated
	 */
	void setTemplateBinding(TemplateBinding value);

} // PropertyBinding
