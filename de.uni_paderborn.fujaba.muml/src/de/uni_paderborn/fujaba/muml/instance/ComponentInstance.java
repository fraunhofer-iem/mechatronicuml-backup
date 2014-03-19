/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.instance;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getComponentPart <em>Component Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getParentCIC <em>Parent CIC</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getComponentInstance()
 * @model abstract="true"
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
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getComponentInstance_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(Component value);

	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.instance.PortInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.instance.PortInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port instances that belong to this component instance. \todosd{Why are also DiscreteSinglePortInstances of DiscreteMultiPortInstances contained here and not in the DiscreteMultiPortInstance?}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getComponentInstance_PortInstances()
	 * @see de.uni_paderborn.fujaba.muml.instance.PortInstance#getComponentInstance
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
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getComponentInstance_ComponentPart()
	 * @model
	 * @generated
	 */
	ComponentPart getComponentPart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getComponentPart <em>Component Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Part</em>' reference.
	 * @see #getComponentPart()
	 * @generated
	 */
	void setComponentPart(ComponentPart value);

	/**
	 * Returns the value of the '<em><b>Parent CIC</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration#getComponentInstances <em>Component Instances</em>}'.
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
	 * @see de.uni_paderborn.fujaba.muml.instance.InstancePackage#getComponentInstance_ParentCIC()
	 * @see de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration#getComponentInstances
	 * @model opposite="componentInstances" required="true" transient="false"
	 * @generated
	 */
	ComponentInstanceConfiguration getParentCIC();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.instance.ComponentInstance#getParentCIC <em>Parent CIC</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent CIC</em>' container reference.
	 * @see #getParentCIC()
	 * @generated
	 */
	void setParentCIC(ComponentInstanceConfiguration value);

} // ComponentInstance
