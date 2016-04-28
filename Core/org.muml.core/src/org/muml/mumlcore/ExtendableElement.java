/**
 */
package org.muml.mumlcore;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link org.muml.mumlcore.ExtendableElement#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.muml.mumlcore.CorePackage#getExtendableElement()
 * @model abstract="true"
 * @generated
 */
public interface ExtendableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.mumlcore.Extension}.
	 * It is bidirectional and its opposite is '{@link org.muml.mumlcore.Extension#getExtendableBase <em>Extendable Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extendable Elements can be extended by an Extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see org.muml.mumlcore.CorePackage#getExtendableElement_Extensions()
	 * @see org.muml.mumlcore.Extension#getExtendableBase
	 * @model opposite="extendableBase" containment="true" ordered="false"
	 * @generated
	 */
	EList<Extension> getExtensions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<Extension> extensions = this.getExtensions();\n\t\t\t\tfor (Extension extension : extensions) {\n\t\t\t\t\tif (type.isInstance(extension)) {\n\t\t\t\t\t\treturn extension;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\treturn null;'"
	 * @generated
	 */
	Extension getExtension(EClass type);

} // ExtendableElement
