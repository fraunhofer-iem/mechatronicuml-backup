/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import de.uni_paderborn.fujaba.muml.behavior.BehavioralElement;
import de.uni_paderborn.fujaba.muml.component.DiscretePort;
import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Manager is responsible for defining when to execute which reconfiguration rule. 
 * It reacts to reconfiguration messages that are provided by embedded components and indicate that a certain situation which may require reconfiguration has been monitored. 
 * The Manager is part of a RuleBasedReconfigurationController. Therefore, it provides a rule-based specification of its behavior using a set of ManagerSpecificationEntries.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getSpecificationEntries <em>Specification Entries</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationController <em>Reconfiguration Controller</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationMessagePorts <em>Reconfiguration Message Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends CommentableElement, BehavioralElement {

	/**
	 * Returns the value of the '<em><b>Specification Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Entries</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager_SpecificationEntries()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ManagerSpecificationEntry#getManager
	 * @model opposite="manager" containment="true"
	 * @generated
	 */
	EList<ManagerSpecificationEntry> getSpecificationEntries();

	/**
	 * Returns the value of the '<em><b>Reconfiguration Controller</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Controller</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Controller</em>' container reference.
	 * @see #setReconfigurationController(RuleBasedReconfigurationController)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager_ReconfigurationController()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.RuleBasedReconfigurationController#getManager
	 * @model opposite="manager" required="true" transient="false"
	 * @generated
	 */
	RuleBasedReconfigurationController getReconfigurationController();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationController <em>Reconfiguration Controller</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Controller</em>' container reference.
	 * @see #getReconfigurationController()
	 * @generated
	 */
	void setReconfigurationController(RuleBasedReconfigurationController value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.DiscretePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiscretePort> getPorts();

	/**
	 * Returns the value of the '<em><b>Reconfiguration Message Ports</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Message Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconfiguration Message Ports</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager_ReconfigurationMessagePorts()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.ports -> select(p | p.oclIsTypeOf(ReconfigurationMessagePort))'"
	 * @generated
	 */
	EList<ReconfigurationMessagePort> getReconfigurationMessagePorts();
} // Manager
