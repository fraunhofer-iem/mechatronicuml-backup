/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import de.uni_paderborn.fujaba.muml.model.component.PatternOccurrence;

import org.eclipse.emf.common.util.EList;

import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PatternInstance#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.PatternInstance#getPatternOccurrence <em>Pattern Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPatternInstance()
 * @model
 * @generated
 */
public interface PatternInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instances</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPatternInstance_PortInstances()
	 * @model required="true"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

	/**
	 * Returns the value of the '<em><b>Pattern Occurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Occurrence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Occurrence</em>' reference.
	 * @see #setPatternOccurrence(PatternOccurrence)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getPatternInstance_PatternOccurrence()
	 * @model required="true"
	 * @generated
	 */
	PatternOccurrence getPatternOccurrence();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.PatternInstance#getPatternOccurrence <em>Pattern Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Occurrence</em>' reference.
	 * @see #getPatternOccurrence()
	 * @generated
	 */
	void setPatternOccurrence(PatternOccurrence value);

} // PatternInstance
