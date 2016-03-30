/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfiguration;

import org.muml.pim.component.StructuredComponent;
import org.muml.pim.instance.ComponentInstanceConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconfigurable Structured Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reconfigurable structured component may change its internal structure at run-time. Therefore, it may instantiate or remove component instances that are typed over embedded component parts. In addition, assemblies and delegations in the structured component may be added, removed or redirected. The reconfiguration behavior in encapsulated in the reconfiguration controllers which are contained in the reconfigurable structured component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.ReconfigurableStructuredComponent#getController <em>Controller</em>}</li>
 *   <li>{@link org.muml.reconfiguration.ReconfigurableStructuredComponent#getManager <em>Manager</em>}</li>
 *   <li>{@link org.muml.reconfiguration.ReconfigurableStructuredComponent#getExecutor <em>Executor</em>}</li>
 *   <li>{@link org.muml.reconfiguration.ReconfigurableStructuredComponent#getInitialConfiguration <em>Initial Configuration</em>}</li>
 * </ul>
 *
 * @see org.muml.reconfiguration.ReconfigurationPackage#getReconfigurableStructuredComponent()
 * @model
 * @generated
 */
public interface ReconfigurableStructuredComponent extends StructuredComponent, ReconfigurableComponent {
	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfiguration.Controller#getStructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controllers extend the functionality of a structured component with additional behavior.
	 * In contrast to embedded components, controllers may access and modify the internal 
	 * structure of a component. Currently, we only use reconfiguration controllers that enable
	 * to reconfigure a component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference.
	 * @see #setController(Controller)
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getReconfigurableStructuredComponent_Controller()
	 * @see org.muml.reconfiguration.Controller#getStructuredComponent
	 * @model opposite="structuredComponent" containment="true" ordered="false"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.ReconfigurableStructuredComponent#getController <em>Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' containment reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenience reference that derives the manager of a RuleBasedReconfigurationController
	 * that belongs to this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getReconfigurableStructuredComponent_Manager()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.controller.oclIsKindOf(RuleBasedReconfigurationController) then self.controller.oclAsType(RuleBasedReconfigurationController).manager else null endif'"
	 * @generated
	 */
	Manager getManager();

	/**
	 * Returns the value of the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenience reference that derives the executor of a RuleBasedReconfigurationController
	 * that belongs to this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executor</em>' reference.
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getReconfigurableStructuredComponent_Executor()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.controller.oclIsKindOf(RuleBasedReconfigurationController) then self.controller.oclAsType(RuleBasedReconfigurationController).executor else null endif'"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Returns the value of the '<em><b>Initial Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The initial configurations that are supported by this component. If a component
	 * is instantiated, it takes of its initial configurations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Configuration</em>' reference.
	 * @see #setInitialConfiguration(ComponentInstanceConfiguration)
	 * @see org.muml.reconfiguration.ReconfigurationPackage#getReconfigurableStructuredComponent_InitialConfiguration()
	 * @model
	 * @generated
	 */
	ComponentInstanceConfiguration getInitialConfiguration();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.ReconfigurableStructuredComponent#getInitialConfiguration <em>Initial Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Configuration</em>' reference.
	 * @see #getInitialConfiguration()
	 * @generated
	 */
	void setInitialConfiguration(ComponentInstanceConfiguration value);

} // ReconfigurableStructuredComponent
