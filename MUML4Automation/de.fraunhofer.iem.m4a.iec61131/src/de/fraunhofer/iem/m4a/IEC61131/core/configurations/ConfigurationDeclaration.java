/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations;

import de.fraunhofer.iem.m4a.IEC61131.core.LibraryElement;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.AccessVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarContainter;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.GlobalVar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getResources <em>Resources</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getAccess <em>Access</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getInstanceSpecificInits <em>Instance Specific Inits</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getGlobalVarNames <em>Global Var Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getConfigurationDeclaration()
 * @model
 * @generated
 */
public interface ConfigurationDeclaration extends LibraryElement {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getConfigurationDeclaration_Resources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceDeclaration> getResources();

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.ConfigurationVariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getConfigurationDeclaration_Declarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationVariableDeclaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' containment reference.
	 * @see #setAccess(AccessVarContainer)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getConfigurationDeclaration_Access()
	 * @model containment="true"
	 * @generated
	 */
	AccessVarContainer getAccess();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getAccess <em>Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' containment reference.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessVarContainer value);

	/**
	 * Returns the value of the '<em><b>Instance Specific Inits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Specific Inits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Specific Inits</em>' containment reference.
	 * @see #setInstanceSpecificInits(InstanceSpecificVarContainter)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getConfigurationDeclaration_InstanceSpecificInits()
	 * @model containment="true"
	 * @generated
	 */
	InstanceSpecificVarContainter getInstanceSpecificInits();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationDeclaration#getInstanceSpecificInits <em>Instance Specific Inits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Specific Inits</em>' containment reference.
	 * @see #getInstanceSpecificInits()
	 * @generated
	 */
	void setInstanceSpecificInits(InstanceSpecificVarContainter value);

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
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getConfigurationDeclaration_GlobalVarNames()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVar> getGlobalVarNames();

} // ConfigurationDeclaration
