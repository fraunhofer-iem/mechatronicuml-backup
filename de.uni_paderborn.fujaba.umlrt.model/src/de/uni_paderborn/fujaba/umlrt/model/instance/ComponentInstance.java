/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPart;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import org.eclipse.emf.common.util.EList;

import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of a component. This is not a runtime instance, though. Instead it is
 * an instantiation of a component type specified by a component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getComponentNameDerived <em>Component Name Derived</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getPartInstances <em>Part Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getPortInstances <em>Port Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getConnectorInstances <em>Connector Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.component.Component#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' reference.
	 * @see #setComponentType(Component)
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getComponentInstance_ComponentType()
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.Component#getComponentInstances
	 * @model opposite="componentInstances" required="true"
	 * @generated
	 */
	Component getComponentType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getComponentType <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(Component value);

	/**
	 * Returns the value of the '<em><b>Component Name Derived</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name Derived</em>' attribute.
	 * @see #isSetComponentNameDerived()
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getComponentInstance_ComponentNameDerived()
	 * @model default="" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if componentType.oclIsUndefined() then\n\tnull\nelse\n\tcomponentType.name\nendif'"
	 * @generated
	 */
	String getComponentNameDerived();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getComponentNameDerived <em>Component Name Derived</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Component Name Derived</em>' attribute is set.
	 * @see #getComponentNameDerived()
	 * @generated
	 */
	boolean isSetComponentNameDerived();

	/**
	 * Returns the value of the '<em><b>Part Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getComponentInstance_PartInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getPartInstances();

	/**
	 * Returns the value of the '<em><b>Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getComponentInstance_PortInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortInstance> getPortInstances();

	/**
	 * Returns the value of the '<em><b>Connector Instances</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getParentComponentInstance <em>Parent Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Instances</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getComponentInstance_ConnectorInstances()
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getParentComponentInstance
	 * @model opposite="parentComponentInstance" containment="true"
	 * @generated
	 */
	EList<ConnectorInstance> getConnectorInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // ComponentInstance
