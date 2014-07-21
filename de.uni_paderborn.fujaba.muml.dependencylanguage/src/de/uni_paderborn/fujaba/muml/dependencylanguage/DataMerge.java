/**
 */
package de.uni_paderborn.fujaba.muml.dependencylanguage;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.behavior.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * It merges multiple variable into one global.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.DataMerge#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.dependencylanguage.DataMerge#getVariableName <em>Variable Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getDataMerge()
 * @model
 * @generated
 */
public interface DataMerge extends Dependency {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Variables from different regions which are merged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getDataMerge_Variables()
	 * @model required="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not specified the name of the first variable will be used for the global variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see de.uni_paderborn.fujaba.muml.dependencylanguage.DependencylanguagePackage#getDataMerge_VariableName()
	 * @model default=""
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.dependencylanguage.DataMerge#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

} // DataMerge
