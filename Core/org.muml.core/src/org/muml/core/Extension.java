/**
 */
package org.muml.core;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for an Extension that can be defined for an object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.Extension#getBase <em>Base</em>}</li>
 *   <li>{@link org.muml.core.Extension#getModelBase <em>Model Base</em>}</li>
 *   <li>{@link org.muml.core.Extension#getOwningAnnotation <em>Owning Annotation</em>}</li>
 *   <li>{@link org.muml.core.Extension#getExtendableBase <em>Extendable Base</em>}</li>
 * </ul>
 *
 * @see org.muml.core.CorePackage#getExtension()
 * @model abstract="true"
 * @generated
 */
public interface Extension extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model element that embeds the owning annotation, or null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see org.muml.core.CorePackage#getExtension_Base()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EObject getBase();

	/**
	 * Returns the value of the '<em><b>Model Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model element that embeds the owning annotation, or null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Base</em>' reference.
	 * @see #isSetModelBase()
	 * @see #unsetModelBase()
	 * @see #setModelBase(EModelElement)
	 * @see org.muml.core.CorePackage#getExtension_ModelBase()
	 * @model unsettable="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EModelElement getModelBase();

	/**
	 * Sets the value of the '{@link org.muml.core.Extension#getModelBase <em>Model Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Base</em>' reference.
	 * @see #isSetModelBase()
	 * @see #unsetModelBase()
	 * @see #getModelBase()
	 * @generated
	 */
	void setModelBase(EModelElement value);

	/**
	 * Unsets the value of the '{@link org.muml.core.Extension#getModelBase <em>Model Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModelBase()
	 * @see #getModelBase()
	 * @see #setModelBase(EModelElement)
	 * @generated
	 */
	void unsetModelBase();

	/**
	 * Returns whether the value of the '{@link org.muml.core.Extension#getModelBase <em>Model Base</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Model Base</em>' reference is set.
	 * @see #unsetModelBase()
	 * @see #getModelBase()
	 * @see #setModelBase(EModelElement)
	 * @generated
	 */
	boolean isSetModelBase();

	/**
	 * Returns the value of the '<em><b>Owning Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The annotation with source "http://www.storydriven.org/core/extension" that embeds this extension, or null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Annotation</em>' reference.
	 * @see #isSetOwningAnnotation()
	 * @see #unsetOwningAnnotation()
	 * @see #setOwningAnnotation(EAnnotation)
	 * @see org.muml.core.CorePackage#getExtension_OwningAnnotation()
	 * @model unsettable="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EAnnotation getOwningAnnotation();

	/**
	 * Sets the value of the '{@link org.muml.core.Extension#getOwningAnnotation <em>Owning Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Annotation</em>' reference.
	 * @see #isSetOwningAnnotation()
	 * @see #unsetOwningAnnotation()
	 * @see #getOwningAnnotation()
	 * @generated
	 */
	void setOwningAnnotation(EAnnotation value);

	/**
	 * Unsets the value of the '{@link org.muml.core.Extension#getOwningAnnotation <em>Owning Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwningAnnotation()
	 * @see #getOwningAnnotation()
	 * @see #setOwningAnnotation(EAnnotation)
	 * @generated
	 */
	void unsetOwningAnnotation();

	/**
	 * Returns whether the value of the '{@link org.muml.core.Extension#getOwningAnnotation <em>Owning Annotation</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owning Annotation</em>' reference is set.
	 * @see #unsetOwningAnnotation()
	 * @see #getOwningAnnotation()
	 * @see #setOwningAnnotation(EAnnotation)
	 * @generated
	 */
	boolean isSetOwningAnnotation();

	/**
	 * Returns the value of the '<em><b>Extendable Base</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.core.ExtendableElement#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The extendable element that is extended by this extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extendable Base</em>' container reference.
	 * @see #setExtendableBase(ExtendableElement)
	 * @see org.muml.core.CorePackage#getExtension_ExtendableBase()
	 * @see org.muml.core.ExtendableElement#getExtensions
	 * @model opposite="extensions" transient="false" ordered="false"
	 * @generated
	 */
	ExtendableElement getExtendableBase();

	/**
	 * Sets the value of the '{@link org.muml.core.Extension#getExtendableBase <em>Extendable Base</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extendable Base</em>' container reference.
	 * @see #getExtendableBase()
	 * @generated
	 */
	void setExtendableBase(ExtendableElement value);

} // Extension
