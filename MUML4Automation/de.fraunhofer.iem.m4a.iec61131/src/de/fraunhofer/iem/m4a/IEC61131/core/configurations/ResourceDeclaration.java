/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ResourceVariableDeclaration;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getProgramConfigurations <em>Program Configurations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getTaskConfigurations <em>Task Configurations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getGlobalVarNames <em>Global Var Names</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getOnHardwareResource <em>On Hardware Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getResourceDeclaration()
 * @model
 * @generated
 */
public interface ResourceDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference.
	 * @see #setDeclarations(ResourceVariableDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getResourceDeclaration_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	ResourceVariableDeclaration getDeclarations();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getDeclarations <em>Declarations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarations</em>' containment reference.
	 * @see #getDeclarations()
	 * @generated
	 */
	void setDeclarations(ResourceVariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Program Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Configurations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getResourceDeclaration_ProgramConfigurations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProgramConfiguration> getProgramConfigurations();

	/**
	 * Returns the value of the '<em><b>Task Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.TaskConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Configurations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getResourceDeclaration_TaskConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskConfiguration> getTaskConfigurations();

	/**
	 * Returns the value of the '<em><b>Global Var Names</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Var Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Var Names</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getResourceDeclaration_GlobalVarNames()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVar> getGlobalVarNames();

	/**
	 * Returns the value of the '<em><b>On Hardware Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Hardware Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Hardware Resource</em>' attribute.
	 * @see #setOnHardwareResource(String)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getResourceDeclaration_OnHardwareResource()
	 * @model
	 * @generated
	 */
	String getOnHardwareResource();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration#getOnHardwareResource <em>On Hardware Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Hardware Resource</em>' attribute.
	 * @see #getOnHardwareResource()
	 * @generated
	 */
	void setOnHardwareResource(String value);

} // ResourceDeclaration
