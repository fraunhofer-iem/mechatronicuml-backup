/**
 */
package de.uni_paderborn.uppaal.core;

import de.uni_paderborn.uppaal.declarations.TypedElementContainer;

import de.uni_paderborn.uppaal.expressions.Expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for typed elements contained inside a container (e.g. a declaration of multiple variables).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.core.TypedElement#getContainer <em>Container</em>}</li>
 *   <li>{@link de.uni_paderborn.uppaal.core.TypedElement#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.core.CorePackage#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.uppaal.declarations.TypedElementContainer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The container of this variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(TypedElementContainer)
	 * @see de.uni_paderborn.uppaal.core.CorePackage#getTypedElement_Container()
	 * @see de.uni_paderborn.uppaal.declarations.TypedElementContainer#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	TypedElementContainer getContainer();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.uppaal.core.TypedElement#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(TypedElementContainer value);

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type definition of this variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see de.uni_paderborn.uppaal.core.CorePackage#getTypedElement_TypeDefinition()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.container.oclIsUndefined()\r\nthen null \r\nelse \r\nself.container.typeDefinition \r\nendif'"
	 * @generated
	 */
	Expression getTypeDefinition();

} // TypedElement
