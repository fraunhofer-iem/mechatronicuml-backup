/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.component.StructuredComponent;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getController <em>Controller</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getManager <em>Manager</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getExecutor <em>Executor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getInitialConfiguration <em>Initial Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurableStructuredComponent()
 * @model
 * @generated
 */
public interface ReconfigurableStructuredComponent extends StructuredComponent, ReconfigurableComponent {
	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Controller#getStructuredComponent <em>Structured Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference.
	 * @see #setController(Controller)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurableStructuredComponent_Controller()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Controller#getStructuredComponent
	 * @model opposite="structuredComponent" containment="true" ordered="false"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getController <em>Controller</em>}' containment reference.
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
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurableStructuredComponent_Manager()
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
	 * @return the value of the '<em>Executor</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurableStructuredComponent_Executor()
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
	 * @return the value of the '<em>Initial Configuration</em>' reference.
	 * @see #setInitialConfiguration(ComponentInstanceConfiguration)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurableStructuredComponent_InitialConfiguration()
	 * @model
	 * @generated
	 */
	ComponentInstanceConfiguration getInitialConfiguration();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurableStructuredComponent#getInitialConfiguration <em>Initial Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Configuration</em>' reference.
	 * @see #getInitialConfiguration()
	 * @generated
	 */
	void setInitialConfiguration(ComponentInstanceConfiguration value);

} // ReconfigurableStructuredComponent
