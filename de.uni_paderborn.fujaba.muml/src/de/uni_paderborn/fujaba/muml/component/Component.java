/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.constraint.ConstrainableElement;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.Component#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.Component#getComponentType <em>Component Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getComponent()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePortNames SoftwareComponentsMustNotHaveContinuousPorts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniquePortNames='self.ports->isUnique(name)' SoftwareComponentsMustNotHaveContinuousPorts='-- Components with component type \"SOFTARE_COMPONENT\" must not have continuous ports.\r\ncomponentType = ComponentKind::SOFTWARE_COMPONENT implies ports->select(p | p.oclIsKindOf(ContinuousPort))->isEmpty()'"
 * @generated
 */
public interface Component extends NamedElement, CommentableElement, ConstrainableElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.Port}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.component.Port#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports of a component represent the interaction points between the component and its environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getComponent_Ports()
	 * @see de.uni_paderborn.fujaba.muml.component.Port#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.component.ComponentKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies the kind of the component. A component may be either
	 * discrete software component, a continuous component, a hybrid component 
	 * or a hardware component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentKind
	 * @see #setComponentType(ComponentKind)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getComponent_ComponentType()
	 * @model
	 * @generated
	 */
	ComponentKind getComponentType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.Component#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentKind
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentKind value);

} // Component
