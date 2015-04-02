/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix;
import de.fraunhofer.iem.m4a.IEC61131.core.variables.NamedVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incompl Located Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getLocation <em>Location</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getIncomplLocatedVarDeclaration()
 * @model
 * @generated
 */
public interface IncomplLocatedVarDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix
	 * @see #setLocation(LocationPrefix)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getIncomplLocatedVarDeclaration_Location()
	 * @model
	 * @generated
	 */
	LocationPrefix getLocation();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.variables.LocationPrefix
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationPrefix value);

	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' containment reference.
	 * @see #setVariableName(NamedVariable)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getIncomplLocatedVarDeclaration_VariableName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamedVariable getVariableName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getVariableName <em>Variable Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' containment reference.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(NamedVariable value);

	/**
	 * Returns the value of the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' containment reference.
	 * @see #setSpec(VarSpec)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getIncomplLocatedVarDeclaration_Spec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VarSpec getSpec();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration#getSpec <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' containment reference.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(VarSpec value);

} // IncomplLocatedVarDeclaration
