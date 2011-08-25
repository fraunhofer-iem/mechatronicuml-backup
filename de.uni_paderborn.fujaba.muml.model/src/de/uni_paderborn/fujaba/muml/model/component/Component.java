/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.storydriven.modeling.CommentableElement;
import org.storydriven.modeling.NamedElement;

import de.uni_paderborn.fujaba.muml.model.core.ConstrainableElement;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Component#getReferencingComponentParts <em>Referencing Component Parts</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.component.Component#getComponentType <em>Component Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponent()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePortNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniquePortNames='self.ports->isUnique(name)'"
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
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.component.ComponentKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies the kind of the component. A component may be either
	 * discrete software component, a continuous component, a hybrid component 
	 * or a hardware component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentKind
	 * @see #setComponentType(ComponentKind)
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentPackage#getComponent_ComponentType()
	 * @model
	 * @generated
	 */
	ComponentKind getComponentType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.component.Component#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.component.ComponentKind
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentKind value);

} // Component
