/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration#getEdgeType <em>Edge Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getEdgeDeclaration()
 * @model
 * @generated
 */
public interface EdgeDeclaration extends InputDeclaration, NamedVariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Edge Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Type</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType
	 * @see #setEdgeType(EdgeType)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage#getEdgeDeclaration_EdgeType()
	 * @model required="true"
	 * @generated
	 */
	EdgeType getEdgeType();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeDeclaration#getEdgeType <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Type</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.declarations.EdgeType
	 * @see #getEdgeType()
	 * @generated
	 */
	void setEdgeType(EdgeType value);

} // EdgeDeclaration
