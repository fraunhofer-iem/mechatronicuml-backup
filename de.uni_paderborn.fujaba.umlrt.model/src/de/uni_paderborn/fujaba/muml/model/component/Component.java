/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;

import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class is the super class of all classes representing a concrete component type such as a structured, atomic or a continuous component.
 * 
 * Component types are implemented as a variation of the composite design pattern. Concerning the composite pattern this class represents the role "component".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Component#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Component#getEClass <em>EClass</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Component#getReferencingComponentParts <em>Referencing Component Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Component#getMustImplementProvidedInterfaces <em>Must Implement Provided Interfaces</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Component#getMustImplementRequiredInterfaces <em>Must Implement Required Interfaces</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Component#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends NamedElement, CommentableElement, ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.Port}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.Port#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports of a component represent the interaction points between the component and its environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponent_Ports()
	 * @see de.uni_paderborn.fujaba.muml.model.component.Port#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class of a component serves to store all attributes of the component as well as all methods that might be executed in a local context. Manipulation of the attribute values or invocation of the methods is done within the realtime statechart of the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponent_EClass()
	 * @model
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Referencing Component Parts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association contains all component parts which have this component as their type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referencing Component Parts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponent_ReferencingComponentParts()
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPart#getComponentType
	 * @model opposite="componentType"
	 * @generated
	 */
	EList<ComponentPart> getReferencingComponentParts();

	/**
	 * Returns the value of the '<em><b>Must Implement Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Don't know.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Implement Provided Interfaces</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponent_MustImplementProvidedInterfaces()
	 * @model
	 * @generated
	 */
	EList<EClass> getMustImplementProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Must Implement Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Don't know.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Implement Required Interfaces</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponent_MustImplementRequiredInterfaces()
	 * @model
	 * @generated
	 */
	EList<EClass> getMustImplementRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.component.ComponentKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component kind allows the distinction between different kinds of component types such as hardware and software components. The kind of component in turn can restrict the possible properties of a component e.g. a hardware component is only allowed to have hardware ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentKind
	 * @see #setKind(ComponentKind)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponent_Kind()
	 * @model
	 * @generated
	 */
	ComponentKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ComponentKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance createInstance();

} // Component
