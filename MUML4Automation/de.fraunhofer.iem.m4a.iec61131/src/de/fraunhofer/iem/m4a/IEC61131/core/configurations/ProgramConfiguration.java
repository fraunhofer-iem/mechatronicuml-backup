/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations;

import de.fraunhofer.iem.m4a.IEC61131.core.literals.NamedElement;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.ProgramDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getWith <em>With</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getProgram <em>Program</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getRetain <em>Retain</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getProgConfElements <em>Prog Conf Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgramConfiguration()
 * @model
 * @generated
 */
public interface ProgramConfiguration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' reference.
	 * @see #setWith(TaskConfiguration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgramConfiguration_With()
	 * @model
	 * @generated
	 */
	TaskConfiguration getWith();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getWith <em>With</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With</em>' reference.
	 * @see #getWith()
	 * @generated
	 */
	void setWith(TaskConfiguration value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(ProgramDeclaration)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgramConfiguration_Program()
	 * @model required="true"
	 * @generated
	 */
	ProgramDeclaration getProgram();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(ProgramDeclaration value);

	/**
	 * Returns the value of the '<em><b>Retain</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retain</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain
	 * @see #setRetain(Retain)
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgramConfiguration_Retain()
	 * @model
	 * @generated
	 */
	Retain getRetain();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration#getRetain <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retain</em>' attribute.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.Retain
	 * @see #getRetain()
	 * @generated
	 */
	void setRetain(Retain value);

	/**
	 * Returns the value of the '<em><b>Prog Conf Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgConfElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prog Conf Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prog Conf Elements</em>' containment reference list.
	 * @see de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage#getProgramConfiguration_ProgConfElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProgConfElement> getProgConfElements();

} // ProgramConfiguration
