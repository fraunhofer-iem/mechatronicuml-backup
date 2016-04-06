/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extendable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for the whole story diagram model. The ExtendableElement specifies the extension mechanism that can be used to extend an object by an Extension containing additional attributes and references.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.core.ExtendableElement#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.muml.core.ExtendableElement#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see org.muml.core.CorePackage#getExtendableElement()
 * @model abstract="true"
 * @generated
 */
public interface ExtendableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extendable Elements can be annotated by an EAnnotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.muml.core.CorePackage#getExtendableElement_Annotation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EAnnotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.core.Extension}.
	 * It is bidirectional and its opposite is '{@link org.muml.core.Extension#getExtendableBase <em>Extendable Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extendable Elements can be extended by an Extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see org.muml.core.CorePackage#getExtendableElement_Extension()
	 * @see org.muml.core.Extension#getExtendableBase
	 * @model opposite="extendableBase" containment="true" ordered="false"
	 * @generated
	 */
	EList<Extension> getExtension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Finds the registered extension of the provided type.
	 * @param type The type that identifies the Extension to return.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" typeRequired="true" typeOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExtendableElementOperations.getExtension(this, type);'"
	 * @generated
	 */
	Extension getExtension(EClass type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates and registers a new Extension of the provided type.
	 * @param type The type of the new Extension.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" typeRequired="true" typeOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExtendableElementOperations.provideExtension(this, type);'"
	 * @generated
	 */
	Extension provideExtension(EClass type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Finds the EAnnotation for the provided source.
	 * @param source The source that identifies the EAnnotation to return.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" sourceRequired="true" sourceOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExtendableElementOperations.getAnnotation(this, source);'"
	 * @generated
	 */
	EAnnotation getAnnotation(String source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates and registers a new EAnnotation with the provided source.
	 * @param source The source that identifies the EAnnotation to return.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" sourceRequired="true" sourceOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ExtendableElementOperations.provideAnnotation(this, source);'"
	 * @generated
	 */
	EAnnotation provideAnnotation(String source);

} // ExtendableElement
