/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Element Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit#getElement <em>Element</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureElementInit()
 * @model
 * @generated
 */
public interface StructureElementInit extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(StructureElementDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureElementInit_Element()
	 * @model required="true"
	 * @generated
	 */
	StructureElementDeclaration getElement();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(StructureElementDeclaration value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(StructureElementValue)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage#getStructureElementInit_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StructureElementValue getValue();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(StructureElementValue value);

} // StructureElementInit
