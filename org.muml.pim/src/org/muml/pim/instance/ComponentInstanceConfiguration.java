/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;
import org.muml.pim.constraint.VerifiableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class encapsules represents a configuration. It contains all component instances and connector instances that belong to a concrete configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.ComponentInstanceConfiguration#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link org.muml.pim.instance.ComponentInstanceConfiguration#getPortConnectorInstances <em>Port Connector Instances</em>}</li>
 *   <li>{@link org.muml.pim.instance.ComponentInstanceConfiguration#getParentPortInstances <em>Parent Port Instances</em>}</li>
 *   <li>{@link org.muml.pim.instance.ComponentInstanceConfiguration#getParentStructuredComponentInstance <em>Parent Structured Component Instance</em>}</li>
 *   <li>{@link org.muml.pim.instance.ComponentInstanceConfiguration#getCoordinationProtocolInstances <em>Coordination Protocol Instances</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.instance.InstancePackage#getComponentInstanceConfiguration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniqueComponentInstanceNames='--  Component instances of a component instance configuration must have unique names on top level.\r\nself.componentInstances->isUnique(name)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueComponentInstanceNames'"
 * @generated
 */
public interface ComponentInstanceConfiguration extends NamedElement, CommentableElement, VerifiableElement {
	/**
	 * Returns the value of the '<em><b>Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.instance.ComponentInstance}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.instance.ComponentInstance#getParentCIC <em>Parent CIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of component instances of a component instance configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Instances</em>' containment reference list.
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstanceConfiguration_ComponentInstances()
	 * @see org.muml.pim.instance.ComponentInstance#getParentCIC
	 * @model opposite="parentCIC" containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstances();

	/**
	 * Returns the value of the '<em><b>Port Connector Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.instance.PortConnectorInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of connector instances of a component instance configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Connector Instances</em>' containment reference list.
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstanceConfiguration_PortConnectorInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortConnectorInstance> getPortConnectorInstances();

	/**
	 * Returns the value of the '<em><b>Parent Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instances of the containing component instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Port Instances</em>' containment reference list.
	 * @see #isSetParentPortInstances()
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstanceConfiguration_ParentPortInstances()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.parentStructuredComponentInstance.oclIsUndefined()\r\nthen OrderedSet {}\r\nelse self.parentStructuredComponentInstance.portInstances\r\nendif'"
	 * @generated
	 */
	EList<PortInstance> getParentPortInstances();

	/**
	 * Returns whether the value of the '{@link org.muml.pim.instance.ComponentInstanceConfiguration#getParentPortInstances <em>Parent Port Instances</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parent Port Instances</em>' containment reference list is set.
	 * @see #getParentPortInstances()
	 * @generated
	 */
	boolean isSetParentPortInstances();

	/**
	 * Returns the value of the '<em><b>Parent Structured Component Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.instance.StructuredComponentInstance#getEmbeddedCIC <em>Embedded CIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structured Component Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured component instance embeds a component instance configuration
	 * that defines its inner structure. For such component instance configuration,
	 * this reference points to the containing structured component instance. If this
	 * component instance configuration is not contained in a structured component
	 * instance, this reference is null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Structured Component Instance</em>' container reference.
	 * @see #setParentStructuredComponentInstance(StructuredComponentInstance)
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstanceConfiguration_ParentStructuredComponentInstance()
	 * @see org.muml.pim.instance.StructuredComponentInstance#getEmbeddedCIC
	 * @model opposite="embeddedCIC" transient="false"
	 * @generated
	 */
	StructuredComponentInstance getParentStructuredComponentInstance();

	/**
	 * Sets the value of the '{@link org.muml.pim.instance.ComponentInstanceConfiguration#getParentStructuredComponentInstance <em>Parent Structured Component Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structured Component Instance</em>' container reference.
	 * @see #getParentStructuredComponentInstance()
	 * @generated
	 */
	void setParentStructuredComponentInstance(StructuredComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Coordination Protocol Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.instance.CoordinationProtocolInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Protocol Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of coordination protocol instances of a component instance configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol Instances</em>' containment reference list.
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstanceConfiguration_CoordinationProtocolInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoordinationProtocolInstance> getCoordinationProtocolInstances();

} // ComponentInstanceConfiguration
