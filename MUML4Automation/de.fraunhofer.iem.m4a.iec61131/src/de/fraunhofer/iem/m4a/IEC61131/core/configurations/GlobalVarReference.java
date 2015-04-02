/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Var Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference#getReference <em>Reference</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference#getStructureElementName <em>Structure Element Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getGlobalVarReference()
 * @model
 * @generated
 */
public interface GlobalVarReference extends DataSource, DataSink, ProgDataSource {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(GlobalVar)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getGlobalVarReference_Reference()
	 * @model required="true"
	 * @generated
	 */
	GlobalVar getReference();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(GlobalVar value);

	/**
	 * Returns the value of the '<em><b>Structure Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Element Name</em>' attribute.
	 * @see #setStructureElementName(String)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getGlobalVarReference_StructureElementName()
	 * @model
	 * @generated
	 */
	String getStructureElementName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.GlobalVarReference#getStructureElementName <em>Structure Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Element Name</em>' attribute.
	 * @see #getStructureElementName()
	 * @generated
	 */
	void setStructureElementName(String value);

} // GlobalVarReference
