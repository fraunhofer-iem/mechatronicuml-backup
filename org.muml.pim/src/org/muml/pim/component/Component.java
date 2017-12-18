/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.eclipse.emf.common.util.EList;
import org.muml.core.CommentableElement;
import org.muml.core.NamedElement;
import org.muml.pim.types.DataType;

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
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.Component#getComponentKind <em>Component Kind</em>}</li>
 *   <li>{@link org.muml.pim.component.Component#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.component.ComponentPackage#getComponent()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePortNames UniqueComponentNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL UniquePortNames='-- Port names must be unique\nself.ports-&gt;isUnique(name)' UniqueComponentNames='-- The component\'s name must be unique.\nComponent.allInstances()-&gt;select(c|c&lt;&gt;self)-&gt;collect(name)-&gt;excludes(self.name)\n-- author: adann'"
 * @generated
 */
public interface Component extends NamedElement, CommentableElement, DataType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.pim.component.Port}.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.component.Port#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ports of a component represent the interaction points between the component and its environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.muml.pim.component.ComponentPackage#getComponent_Ports()
	 * @see org.muml.pim.component.Port#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Component Kind</b></em>' attribute.
	 * The default value is <code>"software component"</code>.
	 * The literals are from the enumeration {@link org.muml.pim.component.ComponentKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute specifies the kind of the component. A component may be either
	 * discrete software component, a continuous component, a hybrid component 
	 * or a hardware component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Kind</em>' attribute.
	 * @see org.muml.pim.component.ComponentKind
	 * @see #setComponentKind(ComponentKind)
	 * @see org.muml.pim.component.ComponentPackage#getComponent_ComponentKind()
	 * @model default="software component" required="true"
	 *        annotation="http://www.muml.org/emf/OCLFilter filter='if(self.oclIsKindOf(component::AtomicComponent)) \r\n\t then OrderedSet {ComponentKind::CONTINUOUS_COMPONENT, ComponentKind::SOFTWARE_COMPONENT } \r\nelse \r\n\tOrderedSet {ComponentKind::CONTINUOUS_COMPONENT, ComponentKind::HYBRID_COMPONENT, ComponentKind::SOFTWARE_COMPONENT} endif\r\n\r\n\r\n'"
	 * @generated
	 */
	ComponentKind getComponentKind();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.Component#getComponentKind <em>Component Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Kind</em>' attribute.
	 * @see org.muml.pim.component.ComponentKind
	 * @see #getComponentKind()
	 * @generated
	 */
	void setComponentKind(ComponentKind value);

} // Component
