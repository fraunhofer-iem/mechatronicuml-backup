/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reconfiguration rule describes a modification of the internal structure of a reconfigurable structured component or of a reconfigurable atomic component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getReturnParameters <em>Return Parameters</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getReconfiguredComponent <em>Reconfigured Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getWcet <em>Wcet</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationRule()
 * @model abstract="true"
 * @generated
 */
public interface ReconfigurationRule extends NamedElement, CommentableElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationRule_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.behavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Parameters</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationRule_ReturnParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getReturnParameters();

	/**
	 * Returns the value of the '<em><b>Reconfigured Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfigured Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfigured Component</em>' reference.
	 * @see #setReconfiguredComponent(ReconfigurableComponent)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationRule_ReconfiguredComponent()
	 * @model
	 * @generated
	 */
	ReconfigurableComponent getReconfiguredComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getReconfiguredComponent <em>Reconfigured Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfigured Component</em>' reference.
	 * @see #getReconfiguredComponent()
	 * @generated
	 */
	void setReconfiguredComponent(ReconfigurableComponent value);

	/**
	 * Returns the value of the '<em><b>Wcet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wcet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcet</em>' containment reference.
	 * @see #setWcet(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationRule_Wcet()
	 * @model containment="true"
	 * @generated
	 */
	TimeValue getWcet();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getWcet <em>Wcet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet</em>' containment reference.
	 * @see #getWcet()
	 * @generated
	 */
	void setWcet(TimeValue value);

} // ReconfigurationRule
