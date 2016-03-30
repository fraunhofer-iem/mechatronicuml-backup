/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;

import de.uni_paderborn.fujaba.muml.behavior.BehavioralElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Manager is responsible for defining when to execute which reconfiguration rule. 
 * It reacts to reconfiguration messages that are provided by embedded components 
 * and indicates that a certain situation which may require reconfiguration has been monitored. 
 * The Manager is part of a RuleBasedReconfigurationController. It provides 
 * a declarative specification of its behavior using a set of ManagerSpecificationEntries.
 * It has a real-time statechart which is automatically generated out of the declarative 
 * specification and provides an operational behavior specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getSpecificationEntries <em>Specification Entries</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationController <em>Reconfiguration Controller</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.Manager#getReconfigurationMessagePorts <em>Reconfiguration Message Ports</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ImplementMessagesOfChildren ImplementMessagesOfferedToParent TreatAndNotPropagateMessagesOfferedToParent PropagatedMessageMustAppearInRMPort'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ImplementMessagesOfChildren='-- The manager specification needs to have entries for all reconfiguration messages that are sent by embedded components.\r\n(self.reconfigurationController.structuredComponent.embeddedComponentParts.componentType.ports -> \r\n\t\t\tselect(oclIsTypeOf(ReconfigurationMessagePort))).oclAsType(ReconfigurationMessagePort).interfaceEntries.messageType\r\n\t\t\t->forAll(mt : msgtype::MessageType | self.specificationEntries -> select(messageType = mt) -> size() > 0)' ImplementMessagesOfferedToParent='-- The manager needs to contain ManagerSpecificationEntries for each reconfiguration message that is provided by the reconfiguration execution port.\r\n(self.reconfigurationController.structuredComponent.ports -> \r\n\t\t\tselect(oclIsTypeOf(ReconfigurationExecutionPort))).oclAsType(ReconfigurationExecutionPort).interfaceEntries.messageType\r\n\t\t\t->forAll(mt : msgtype::MessageType | self.specificationEntries -> select(messageType = mt) -> size() > 0)' TreatAndNotPropagateMessagesOfferedToParent='-- All reconfiguration messages offered to the parent in the reconfiguration execution port need to be treated and not propagated in the manager specification.\r\nself.specificationEntries -> select(entry : ManagerSpecificationEntry | self.reconfigurationController.structuredComponent.ports\r\n\t-> select(oclIsTypeOf(ReconfigurationExecutionPort)).oclAsType(ReconfigurationExecutionPort).interfaceEntries \r\n\t-> select(messageType = entry.messageType) -> size() > 0) -> forAll(treat = true and propagate = false)' PropagatedMessageMustAppearInRMPort='let\r\n\trmTypes : OrderedSet(msgtype::MessageType) = self.reconfigurationController.structuredComponent.ports -> any(oclIsKindOf(ReconfigurationMessagePort)).oclAsType(ReconfigurationMessagePort).interfaceEntries.messageType->asOrderedSet(), -- messages in RM Port\r\n\tpropTypes: OrderedSet(msgtype::MessageType) = self.specificationEntries -> select(propagate = true).messageType->asOrderedSet() -- message propagated in manager specification\r\nin\r\n\trmTypes->includesAll(propTypes) and propTypes->includesAll(rmTypes)'"
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
	 * <!-- begin-model-doc -->
	 * The specification entries of the manager. Each specification entry defines one
	 * message type and how the component reacts to this message type.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * The reconfiguration controller that contains this manager.
	 * <!-- end-model-doc -->
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
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports of the manager. At present, the manager has one port implementing
	 * the reconfiguration message port of the parent, one multi-port for receiving 
	 * messages from the children, and one port for interacting with the executor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReconfigurationPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Reconfiguration Message Ports</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Message Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derives the set of reconfiguration message ports from the ports reference. 
	 * This reference will return the port connected to the parent and the multi-port
	 * that receives reconfiguration messages from the embedded components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconfiguration Message Ports</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getManager_ReconfigurationMessagePorts()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.ports -> select(p | p.oclIsTypeOf(ReconfigurationMessagePort)).oclAsType(ReconfigurationMessagePort)'"
	 * @generated
	 */
	EList<ReconfigurationMessagePort> getReconfigurationMessagePorts();
} // Manager
