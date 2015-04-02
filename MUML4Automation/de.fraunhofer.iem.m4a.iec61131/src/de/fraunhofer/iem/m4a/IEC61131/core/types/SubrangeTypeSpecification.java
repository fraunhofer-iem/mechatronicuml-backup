/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subrange Type Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification#getIntegerType <em>Integer Type</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrangeTypeSpecification()
 * @model
 * @generated
 */
public interface SubrangeTypeSpecification extends SubrangeSpecification, CaseListElement {
	/**
	 * Returns the value of the '<em><b>Integer Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Type</em>' reference.
	 * @see #setIntegerType(IntegerType)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrangeTypeSpecification_IntegerType()
	 * @model required="true"
	 * @generated
	 */
	IntegerType getIntegerType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification#getIntegerType <em>Integer Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Type</em>' reference.
	 * @see #getIntegerType()
	 * @generated
	 */
	void setIntegerType(IntegerType value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Subrange)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getSubrangeTypeSpecification_Range()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Subrange getRange();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.SubrangeTypeSpecification#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Subrange value);

} // SubrangeTypeSpecification
