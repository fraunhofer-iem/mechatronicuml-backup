/**
 */
package de.uni_paderborn.uppaal.types;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.types.Library#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.types.TypesPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(PredefinedType)
	 * @see de.uni_paderborn.uppaal.types.TypesPackage#getLibrary_Types()
	 * @model containment="true"
	 * @generated
	 */
	PredefinedType getTypes();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.uppaal.types.Library#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(PredefinedType value);
} // Library
