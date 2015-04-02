/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.DirectVariable;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Global Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getLocatedGlobalVar()
 * @model
 * @generated
 */
public interface LocatedGlobalVar extends GlobalVarSpec {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' containment reference.
	 * @see #setVariableName(GlobalVar)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getLocatedGlobalVar_VariableName()
	 * @model containment="true"
	 * @generated
	 */
	GlobalVar getVariableName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar#getVariableName <em>Variable Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' containment reference.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(GlobalVar value);

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getLocatedGlobalVar_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DirectVariable getLocation();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.LocatedGlobalVar#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DirectVariable value);

} // LocatedGlobalVar
