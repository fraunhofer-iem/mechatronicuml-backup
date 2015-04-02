/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration#getLocation <em>Location</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration#getSpecInit <em>Spec Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getLocatedVarDeclaration()
 * @model
 * @generated
 */
public interface LocatedVarDeclaration extends NamedVariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(DirectVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getLocatedVarDeclaration_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DirectVariable getLocation();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DirectVariable value);

	/**
	 * Returns the value of the '<em><b>Spec Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Init</em>' containment reference.
	 * @see #setSpecInit(LocatedVarSpecInit)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getLocatedVarDeclaration_SpecInit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LocatedVarSpecInit getSpecInit();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedVarDeclaration#getSpecInit <em>Spec Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Init</em>' containment reference.
	 * @see #getSpecInit()
	 * @generated
	 */
	void setSpecInit(LocatedVarSpecInit value);

} // LocatedVarDeclaration
