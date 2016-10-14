/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;

import org.eclipse.emf.common.util.EList;
import org.muml.core.NamedElement;
import org.muml.pim.component.Component;
import org.muml.pim.component.ComponentPart;
import org.muml.pim.runnable.Label;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.ComponentInstance#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.muml.pim.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link org.muml.pim.instance.ComponentInstance#getComponentPart <em>Component Part</em>}</li>
 *   <li>{@link org.muml.pim.instance.ComponentInstance#getParentCIC <em>Parent CIC</em>}</li>
 *   <li>{@link org.muml.pim.instance.ComponentInstance#isTopLevel <em>Top Level</em>}</li>
 *   <li>{@link org.muml.pim.instance.ComponentInstance#getRunnables <em>Runnables</em>}</li>
 *   <li>{@link org.muml.pim.instance.ComponentInstance#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.instance.InstancePackage#getComponentInstance()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllPortsAreInitialized'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL AllPortsAreInitialized='-- All Ports with a lowerBound>0 must be initialized\nlet discretePorts : Set(component::Port) = if (self.componentType.oclIsUndefined()) then OrderedSet {} else self.componentType.ports->select(port|port.oclIsKindOf(connector::DiscreteInteractionEndpoint)).oclAsType(component::Port)->asOrderedSet() endif in\nlet nonDiscretePorts : Set(component::Port) = if (self.componentType.oclIsUndefined()) then OrderedSet {} else self.componentType.ports->select(port| port.oclIsKindOf(component::DirectedTypedPort)) endif in\nlet portsWhichShallBeInitialized : Set(component::Port) = nonDiscretePorts -> select(port | not(port.oclAsType(component::DirectedTypedPort).optional))->union(discretePorts->select(discretePort| discretePort.oclAsType(connector::DiscreteInteractionEndpoint).cardinality.lowerBound.value > 0 or discretePort.oclAsType(connector::DiscreteInteractionEndpoint).cardinality.lowerBound.infinity)) in\nportsWhichShallBeInitialized -> forAll(port | self.portInstances -> exists(portInstance | portInstance.type = port))\n-- adann,chris227'"
 * @generated
 */
public interface ComponentInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component type of which this instance is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(Component)
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstance_ComponentType()
	 * @model required="true"
	 *        annotation="http://www.muml.org/emf/OCLFilter filter='(\nif self.parentCIC.parentStructuredComponentInstance.oclIsUndefined() then\n\tcomponent::Component::allInstances()\nelse\n\tself.parentCIC.parentStructuredComponentInstance.componentType.oclAsType(component::StructuredComponent).embeddedComponentParts.componentType\nendif\n)->select(x | (self.oclIsKindOf(AtomicComponentInstance) and x.oclIsKindOf(component::AtomicComponent)) or (self.oclIsKindOf(StructuredComponentInstance) and x.oclIsKindOf(component::StructuredComponent)))'"
	 * @generated
	 */
	Component getComponentType();

	/**
	 * Sets the value of the '{@link org.muml.pim.instance.ComponentInstance#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(Component value);

	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.instance.PortInstance}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.instance.PortInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instances that belong to this component instance. \todosd{Why are also DiscreteSinglePortInstances of DiscreteMultiPortInstances contained here and not in the DiscreteMultiPortInstance?}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Instances</em>' containment reference list.
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstance_PortInstances()
	 * @see org.muml.pim.instance.PortInstance#getComponentInstance
	 * @model opposite="componentInstance" containment="true"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

	/**
	 * Returns the value of the '<em><b>Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the component instance is contained in a structured component instance,
	 * then the corresponding structure component has has component part that 
	 * was used to include the component type of this instance. Then, this reference 
	 * points to this component part. We can use this reference for deciding how 
	 * many instances of a particular part exist in a structured component instance
	 * such that we can enforce the cardinalities of the component part during run-time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Part</em>' reference.
	 * @see #setComponentPart(ComponentPart)
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstance_ComponentPart()
	 * @model annotation="http://www.muml.org/emf/OCLFilter filter='self.parentCIC.parentStructuredComponentInstance.componentType.oclAsType(component::StructuredComponent).embeddedComponentParts'"
	 * @generated
	 */
	ComponentPart getComponentPart();

	/**
	 * Sets the value of the '{@link org.muml.pim.instance.ComponentInstance#getComponentPart <em>Component Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Part</em>' reference.
	 * @see #getComponentPart()
	 * @generated
	 */
	void setComponentPart(ComponentPart value);

	/**
	 * Returns the value of the '<em><b>Parent CIC</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.instance.ComponentInstanceConfiguration#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent CIC</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component instance configuration that contains this component instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent CIC</em>' container reference.
	 * @see #setParentCIC(ComponentInstanceConfiguration)
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstance_ParentCIC()
	 * @see org.muml.pim.instance.ComponentInstanceConfiguration#getComponentInstances
	 * @model opposite="componentInstances" required="true" transient="false"
	 * @generated
	 */
	ComponentInstanceConfiguration getParentCIC();

	/**
	 * Sets the value of the '{@link org.muml.pim.instance.ComponentInstance#getParentCIC <em>Parent CIC</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent CIC</em>' container reference.
	 * @see #getParentCIC()
	 * @generated
	 */
	void setParentCIC(ComponentInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Top Level</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component instance is considered to be a top-level component instance if it is not embedded in a structured component instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Level</em>' attribute.
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstance_TopLevel()
	 * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.parentCIC.parentStructuredComponentInstance.oclIsUndefined()'"
	 * @generated
	 */
	boolean isTopLevel();

	/**
	 * Returns the value of the '<em><b>Runnables</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.runnable.Runnable}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.runnable.Runnable#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnables</em>' reference list.
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstance_Runnables()
	 * @see org.muml.pim.runnable.Runnable#getComponentInstance
	 * @model opposite="componentInstance"
	 * @generated
	 */
	EList<org.muml.pim.runnable.Runnable> getRunnables();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link org.muml.pim.runnable.Label}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.runnable.Label#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see org.muml.pim.instance.InstancePackage#getComponentInstance_Labels()
	 * @see org.muml.pim.runnable.Label#getComponentInstance
	 * @model opposite="componentInstance"
	 * @generated
	 */
	EList<Label> getLabels();

} // ComponentInstance
