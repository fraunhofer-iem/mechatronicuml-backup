/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
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
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getToRef <em>To Ref</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getFromRef <em>From Ref</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getPortsDerived <em>Ports Derived</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance#getComponentNameDerived <em>Component Name Derived</em>}</li>
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
	 * Returns the value of the '<em><b>To Ref</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getToComponentI <em>To Component I</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Ref</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getComponentInstance_ToRef()
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getToComponentI
	 * @model opposite="toComponentI"
	 * @generated
	 */
	EList<ConnectorInstance> getToRef();

	/**
	 * Returns the value of the '<em><b>From Ref</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getFromComponentI <em>From Component I</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Ref</em>' reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getComponentInstance_FromRef()
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance#getFromComponentI
	 * @model opposite="fromComponentI"
	 * @generated
	 */
	EList<ConnectorInstance> getFromRef();

	/**
	 * Returns the value of the '<em><b>Ports Derived</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.component.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports Derived</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports Derived</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getComponentInstance_PortsDerived()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if componentType.oclIsUndefined() then\n\tOrderedSet { }\nelse\n\tcomponentType.ports\nendif'"
	 * @generated
	 */
	EList<Port> getPortsDerived();

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
	 * @see de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage#getComponentInstance_ComponentNameDerived()
	 * @model default="" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if componentType.oclIsUndefined() then\n\tnull\nelse\n\tcomponentType.name\nendif'"
	 * @generated
	 */
	String getComponentNameDerived();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // ComponentInstance
