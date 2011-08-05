/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance;

import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.NamedElement;

import de.uni_paderborn.fujaba.muml.model.component.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a component instance. It is an instantiation of a component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getEmbeddedInstances <em>Embedded Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getConnectorInstances <em>Connector Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends NamedElement, BehavioralElementInstance {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component type of which this instance is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(Component)
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getComponentInstance_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(Component value);

	/**
	 * Returns the value of the '<em><b>Embedded Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component instances that are embedded in this component instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getComponentInstance_EmbeddedInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getEmbeddedInstances();

	/**
	 * Returns the value of the '<em><b>Connector Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getParentComponentInstance <em>Parent Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connector instances that connect the component part instances of this component instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getComponentInstance_ConnectorInstances()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.ConnectorInstance#getParentComponentInstance
	 * @model opposite="parentComponentInstance" containment="true"
	 * @generated
	 */
	EList<ConnectorInstance> getConnectorInstances();

	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instances that belong to this component instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.instance.InstancePackage#getComponentInstance_PortInstances()
	 * @see de.uni_paderborn.fujaba.muml.model.instance.PortInstance#getComponentInstance
	 * @model opposite="componentInstance" containment="true"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

} // ComponentInstance
