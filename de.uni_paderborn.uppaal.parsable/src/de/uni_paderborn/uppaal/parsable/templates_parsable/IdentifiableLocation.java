/**
 */
package de.uni_paderborn.uppaal.parsable.templates_parsable;

import de.uni_paderborn.uppaal.templates.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.uppaal.parsable.templates_parsable.IdentifiableLocation#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.uppaal.parsable.templates_parsable.TemplatesParsablePackage#getIdentifiableLocation()
 * @model
 * @generated
 */
public interface IdentifiableLocation extends Location {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.uni_paderborn.uppaal.parsable.templates_parsable.TemplatesParsablePackage#getIdentifiableLocation_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.uppaal.parsable.templates_parsable.IdentifiableLocation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IdentifiableLocation
