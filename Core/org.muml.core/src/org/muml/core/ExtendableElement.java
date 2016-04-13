/**
 */
package org.muml.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
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
 *   <li>{@link org.muml.core.ExtendableElement#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.muml.core.ExtendableElement#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.muml.core.CorePackage#getExtendableElement()
 * @model abstract="true"
 * @generated
 */
public interface ExtendableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extendable Elements can be annotated by an EAnnotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.muml.core.CorePackage#getExtendableElement_Annotations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.core.Extension}.
	 * It is bidirectional and its opposite is '{@link org.muml.core.Extension#getExtendableBase <em>Extendable Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extendable Elements can be extended by an Extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see org.muml.core.CorePackage#getExtendableElement_Extensions()
	 * @see org.muml.core.Extension#getExtendableBase
	 * @model opposite="extendableBase" containment="true" ordered="false"
	 * @generated
	 */
	EList<Extension> getExtensions();

} // ExtendableElement
