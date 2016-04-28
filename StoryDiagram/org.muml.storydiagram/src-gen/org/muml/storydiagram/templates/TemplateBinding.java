/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.templates;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.muml.core.ExtendableElement;
import org.muml.core.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.templates.TemplateBinding#getBoundParameter <em>Bound Parameter</em>}</li>
 *   <li>{@link org.muml.storydiagram.templates.TemplateBinding#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link org.muml.storydiagram.templates.TemplateBinding#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.muml.storydiagram.templates.TemplateBinding#getPropertyBindings <em>Property Bindings</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.templates.TemplatesPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Bound Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Parameter</em>' reference.
	 * @see #setBoundParameter(EClassifier)
	 * @see org.muml.storydiagram.templates.TemplatesPackage#getTemplateBinding_BoundParameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EClassifier getBoundParameter();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.templates.TemplateBinding#getBoundParameter <em>Bound Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Parameter</em>' reference.
	 * @see #getBoundParameter()
	 * @generated
	 */
	void setBoundParameter(EClassifier value);

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
	 * @see org.muml.storydiagram.templates.TemplatesPackage#getTemplateBinding_BindingExpression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getBindingExpression();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.templates.TemplateBinding#getBindingExpression <em>Binding Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Expression</em>' containment reference.
	 * @see #getBindingExpression()
	 * @generated
	 */
	void setBindingExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.templates.TemplateSignature#getTemplateBindings <em>Template Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(TemplateSignature)
	 * @see org.muml.storydiagram.templates.TemplatesPackage#getTemplateBinding_Template()
	 * @see org.muml.storydiagram.templates.TemplateSignature#getTemplateBindings
	 * @model opposite="templateBindings" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateSignature getTemplate();

	/**
	 * Sets the value of the '{@link org.muml.storydiagram.templates.TemplateBinding#getTemplate <em>Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' container reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateSignature value);

	/**
	 * Returns the value of the '<em><b>Property Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.storydiagram.templates.PropertyBinding}.
	 * It is bidirectional and its opposite is '{@link org.muml.storydiagram.templates.PropertyBinding#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Bindings</em>' containment reference list.
	 * @see org.muml.storydiagram.templates.TemplatesPackage#getTemplateBinding_PropertyBindings()
	 * @see org.muml.storydiagram.templates.PropertyBinding#getTemplateBinding
	 * @model opposite="templateBinding" containment="true" ordered="false"
	 * @generated
	 */
	EList<PropertyBinding> getPropertyBindings();

} // TemplateBinding
